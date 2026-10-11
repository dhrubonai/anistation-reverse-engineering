package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.webkit.WebSettings;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.domain.ShouldUseLazyStaticDeviceInfo;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.utils.GetExternalStorageDirKt;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.a34;
import defpackage.b06;
import defpackage.d46;
import defpackage.de1;
import defpackage.fx0;
import defpackage.io3;
import defpackage.k54;
import defpackage.kl0;
import defpackage.m54;
import defpackage.nt1;
import defpackage.o1;
import defpackage.os;
import defpackage.q71;
import defpackage.rb3;
import defpackage.sb2;
import defpackage.te4;
import defpackage.uz5;
import defpackage.vz0;
import defpackage.wi5;
import defpackage.wk6;
import defpackage.xb;
import defpackage.yo0;
import defpackage.ze0;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {
    public static final String ALGORITHM_SHA1 = "SHA-1";
    public static final String APP_VERSION_FAKE = "FakeVersionName";
    public static final String BINARY_SU = "su";
    public static final String CERTIFICATE_TYPE_X509 = "X.509";
    public static final Companion Companion = new Companion(null);
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final String PLATFORM_ANDROID = "android";
    public static final String STORE_GOOGLE = "google";
    private final X500Principal DEBUG_CERT;
    private final AnalyticsDataSource analyticsDataSource;
    private final rb3 baseStaticDeviceInfo$delegate;
    private final rb3 cachedAppVersion$delegate;
    private final rb3 cachedDiskSpace$delegate;
    private final rb3 cachedInstaller$delegate;
    private final rb3 cachedRamMemory$delegate;
    private final Context context;
    private volatile StaticDeviceInfoOuterClass.StaticDeviceInfo enrichedStaticDeviceInfo;
    private final k54 fetchMutex;
    private final ByteStringDataSource glInfoStore;
    private final Logger logger;
    private final StoreDataSource storeDataSource;
    private final UnityBootConfigDataSource unityBootConfigDataSource;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidStaticDeviceInfoDataSource(Context context, ByteStringDataSource byteStringDataSource, AnalyticsDataSource analyticsDataSource, StoreDataSource storeDataSource, UnityBootConfigDataSource unityBootConfigDataSource, Logger logger, ShouldUseLazyStaticDeviceInfo shouldUseLazyStaticDeviceInfo) {
        context.getClass();
        byteStringDataSource.getClass();
        analyticsDataSource.getClass();
        storeDataSource.getClass();
        unityBootConfigDataSource.getClass();
        logger.getClass();
        shouldUseLazyStaticDeviceInfo.getClass();
        this.context = context;
        this.glInfoStore = byteStringDataSource;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.unityBootConfigDataSource = unityBootConfigDataSource;
        this.logger = logger;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        final byte b = 0;
        this.baseStaticDeviceInfo$delegate = new d46(new sb2(this) { // from class: re
            public final /* synthetic */ AndroidStaticDeviceInfoDataSource y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo baseStaticDeviceInfo_delegate$lambda$1;
                String appVersion;
                long cachedDiskSpace_delegate$lambda$3;
                String installerPackageName;
                byte b2 = b;
                AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource = this.y;
                switch (b2) {
                    case 0:
                        baseStaticDeviceInfo_delegate$lambda$1 = AndroidStaticDeviceInfoDataSource.baseStaticDeviceInfo_delegate$lambda$1(androidStaticDeviceInfoDataSource);
                        return baseStaticDeviceInfo_delegate$lambda$1;
                    case 1:
                        appVersion = androidStaticDeviceInfoDataSource.getAppVersion();
                        return appVersion;
                    case 2:
                        cachedDiskSpace_delegate$lambda$3 = AndroidStaticDeviceInfoDataSource.cachedDiskSpace_delegate$lambda$3(androidStaticDeviceInfoDataSource);
                        break;
                    case 3:
                        cachedDiskSpace_delegate$lambda$3 = androidStaticDeviceInfoDataSource.getTotalMemory();
                        break;
                    default:
                        installerPackageName = androidStaticDeviceInfoDataSource.getInstallerPackageName();
                        return installerPackageName;
                }
                return Long.valueOf(cachedDiskSpace_delegate$lambda$3);
            }
        });
        this.fetchMutex = new m54();
        final byte b2 = 1;
        this.cachedAppVersion$delegate = new d46(new sb2(this) { // from class: re
            public final /* synthetic */ AndroidStaticDeviceInfoDataSource y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo baseStaticDeviceInfo_delegate$lambda$1;
                String appVersion;
                long cachedDiskSpace_delegate$lambda$3;
                String installerPackageName;
                byte b22 = b2;
                AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource = this.y;
                switch (b22) {
                    case 0:
                        baseStaticDeviceInfo_delegate$lambda$1 = AndroidStaticDeviceInfoDataSource.baseStaticDeviceInfo_delegate$lambda$1(androidStaticDeviceInfoDataSource);
                        return baseStaticDeviceInfo_delegate$lambda$1;
                    case 1:
                        appVersion = androidStaticDeviceInfoDataSource.getAppVersion();
                        return appVersion;
                    case 2:
                        cachedDiskSpace_delegate$lambda$3 = AndroidStaticDeviceInfoDataSource.cachedDiskSpace_delegate$lambda$3(androidStaticDeviceInfoDataSource);
                        break;
                    case 3:
                        cachedDiskSpace_delegate$lambda$3 = androidStaticDeviceInfoDataSource.getTotalMemory();
                        break;
                    default:
                        installerPackageName = androidStaticDeviceInfoDataSource.getInstallerPackageName();
                        return installerPackageName;
                }
                return Long.valueOf(cachedDiskSpace_delegate$lambda$3);
            }
        });
        final byte b3 = 2;
        this.cachedDiskSpace$delegate = new d46(new sb2(this) { // from class: re
            public final /* synthetic */ AndroidStaticDeviceInfoDataSource y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo baseStaticDeviceInfo_delegate$lambda$1;
                String appVersion;
                long cachedDiskSpace_delegate$lambda$3;
                String installerPackageName;
                byte b22 = b3;
                AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource = this.y;
                switch (b22) {
                    case 0:
                        baseStaticDeviceInfo_delegate$lambda$1 = AndroidStaticDeviceInfoDataSource.baseStaticDeviceInfo_delegate$lambda$1(androidStaticDeviceInfoDataSource);
                        return baseStaticDeviceInfo_delegate$lambda$1;
                    case 1:
                        appVersion = androidStaticDeviceInfoDataSource.getAppVersion();
                        return appVersion;
                    case 2:
                        cachedDiskSpace_delegate$lambda$3 = AndroidStaticDeviceInfoDataSource.cachedDiskSpace_delegate$lambda$3(androidStaticDeviceInfoDataSource);
                        break;
                    case 3:
                        cachedDiskSpace_delegate$lambda$3 = androidStaticDeviceInfoDataSource.getTotalMemory();
                        break;
                    default:
                        installerPackageName = androidStaticDeviceInfoDataSource.getInstallerPackageName();
                        return installerPackageName;
                }
                return Long.valueOf(cachedDiskSpace_delegate$lambda$3);
            }
        });
        final byte b4 = 3;
        this.cachedRamMemory$delegate = new d46(new sb2(this) { // from class: re
            public final /* synthetic */ AndroidStaticDeviceInfoDataSource y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo baseStaticDeviceInfo_delegate$lambda$1;
                String appVersion;
                long cachedDiskSpace_delegate$lambda$3;
                String installerPackageName;
                byte b22 = b4;
                AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource = this.y;
                switch (b22) {
                    case 0:
                        baseStaticDeviceInfo_delegate$lambda$1 = AndroidStaticDeviceInfoDataSource.baseStaticDeviceInfo_delegate$lambda$1(androidStaticDeviceInfoDataSource);
                        return baseStaticDeviceInfo_delegate$lambda$1;
                    case 1:
                        appVersion = androidStaticDeviceInfoDataSource.getAppVersion();
                        return appVersion;
                    case 2:
                        cachedDiskSpace_delegate$lambda$3 = AndroidStaticDeviceInfoDataSource.cachedDiskSpace_delegate$lambda$3(androidStaticDeviceInfoDataSource);
                        break;
                    case 3:
                        cachedDiskSpace_delegate$lambda$3 = androidStaticDeviceInfoDataSource.getTotalMemory();
                        break;
                    default:
                        installerPackageName = androidStaticDeviceInfoDataSource.getInstallerPackageName();
                        return installerPackageName;
                }
                return Long.valueOf(cachedDiskSpace_delegate$lambda$3);
            }
        });
        final byte b5 = 4;
        this.cachedInstaller$delegate = new d46(new sb2(this) { // from class: re
            public final /* synthetic */ AndroidStaticDeviceInfoDataSource y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                StaticDeviceInfoOuterClass.StaticDeviceInfo baseStaticDeviceInfo_delegate$lambda$1;
                String appVersion;
                long cachedDiskSpace_delegate$lambda$3;
                String installerPackageName;
                byte b22 = b5;
                AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource = this.y;
                switch (b22) {
                    case 0:
                        baseStaticDeviceInfo_delegate$lambda$1 = AndroidStaticDeviceInfoDataSource.baseStaticDeviceInfo_delegate$lambda$1(androidStaticDeviceInfoDataSource);
                        return baseStaticDeviceInfo_delegate$lambda$1;
                    case 1:
                        appVersion = androidStaticDeviceInfoDataSource.getAppVersion();
                        return appVersion;
                    case 2:
                        cachedDiskSpace_delegate$lambda$3 = AndroidStaticDeviceInfoDataSource.cachedDiskSpace_delegate$lambda$3(androidStaticDeviceInfoDataSource);
                        break;
                    case 3:
                        cachedDiskSpace_delegate$lambda$3 = androidStaticDeviceInfoDataSource.getTotalMemory();
                        break;
                    default:
                        installerPackageName = androidStaticDeviceInfoDataSource.getInstallerPackageName();
                        return installerPackageName;
                }
                return Long.valueOf(cachedDiskSpace_delegate$lambda$3);
            }
        });
        if (!shouldUseLazyStaticDeviceInfo.invoke()) {
            getBaseStaticDeviceInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo baseStaticDeviceInfo_delegate$lambda$1(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource) {
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        newBuilder.getClass();
        StaticDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setBundleId(androidStaticDeviceInfoDataSource.getAppName());
        _create.setBundleVersion(androidStaticDeviceInfoDataSource.getBundleVersion());
        _create.setAppDebuggable(androidStaticDeviceInfoDataSource.isAppDebuggable());
        _create.setRooted(androidStaticDeviceInfoDataSource.isRooted());
        _create.setOsVersion(androidStaticDeviceInfoDataSource.getOsVersion());
        _create.setDeviceMake(androidStaticDeviceInfoDataSource.getManufacturer());
        _create.setDeviceModel(androidStaticDeviceInfoDataSource.getModel());
        _create.setWebviewUa(androidStaticDeviceInfoDataSource.getWebViewUserAgent());
        _create.setScreenDensity(androidStaticDeviceInfoDataSource.getScreenDensity());
        _create.setScreenWidth(androidStaticDeviceInfoDataSource.getScreenWidth());
        _create.setScreenHeight(androidStaticDeviceInfoDataSource.getScreenHeight());
        _create.setScreenSize(androidStaticDeviceInfoDataSource.getScreenLayout());
        _create.addAllStores(_create.getStores(), getStores$default(androidStaticDeviceInfoDataSource, null, 1, null));
        _create.setTotalDiskSpace(androidStaticDeviceInfoDataSource.getTotalDiskSpace());
        _create.setTotalDiskSpaceBytes(androidStaticDeviceInfoDataSource.getTotalSpaceBytes(GetExternalStorageDirKt.getExternalStorageDir(androidStaticDeviceInfoDataSource.context)));
        _create.addAllKeyboardLanguages(_create.getKeyboardLanguages(), androidStaticDeviceInfoDataSource.getKeyboardLanguages());
        _create.setTotalRamMemory(androidStaticDeviceInfoDataSource.getTotalRamMemory());
        _create.setCpuModel(androidStaticDeviceInfoDataSource.getCPUModel());
        _create.setCpuCount(androidStaticDeviceInfoDataSource.getCPUCount());
        _create.setAndroid(androidStaticDeviceInfoDataSource.fetchAndroidStaticDeviceInfo());
        _create.setMadeWithUnity(MadeWithUnityDetector.isMadeWithUnity());
        return _create._build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long cachedDiskSpace_delegate$lambda$3(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource) {
        return androidStaticDeviceInfoDataSource.getTotalSpace(GetExternalStorageDirKt.getExternalStorageDir(androidStaticDeviceInfoDataSource.context));
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        newBuilder.getClass();
        StaticDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setApiLevel(getApiLevel());
        _create.setVersionCode(getVersionCode());
        _create.setAndroidFingerprint(getFingerprint());
        _create.setAppInstaller(getInstallSource());
        _create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        _create.setBuildBoard(getBoard());
        _create.setBuildBrand(getBrand());
        _create.setBuildDevice(getDevice());
        _create.setBuildDisplay(getDisplay());
        _create.setBuildFingerprint(getFingerprint());
        _create.setBuildHardware(getHardware());
        _create.setBuildHost(getHost());
        _create.setBuildBootloader(getBootloader());
        _create.setBuildProduct(getProduct());
        _create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            _create.setBuildId(buildId);
        }
        _create.setPhoneType(getPhoneType());
        _create.setSimOperator(getSimOperator());
        _create.setJvmMaxMemory(getJvmMaxMemory());
        return _create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAppVersion() {
        String str;
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            if (packageManager.getPackageInfo(packageName, 0).versionName == null) {
                str = APP_VERSION_FAKE;
            } else {
                str = packageManager.getPackageInfo(packageName, 0).versionName;
            }
            str.getClass();
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            this.logger.error("Error getting package info", e);
            return "";
        }
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo getBaseStaticDeviceInfo() {
        return (StaticDeviceInfoOuterClass.StaticDeviceInfo) this.baseStaticDeviceInfo$delegate.getValue();
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private final String getCPUModel() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MODEL;
            str.getClass();
            return str;
        }
        try {
            File file = new File("/proc/cpuinfo");
            Charset charset = kl0.a;
            charset.getClass();
            ArrayList arrayList = new ArrayList();
            xb xbVar = new xb(arrayList, (byte) 2);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
            try {
                Iterator it = ((fx0) wi5.p0(new os(bufferedReader, (byte) 2))).iterator();
                while (it.hasNext()) {
                    xbVar.invoke(it.next());
                }
                bufferedReader.close();
                return (String) yo0.r0(arrayList);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    a34.C(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException e) {
            this.logger.error("Error reading CPU model", e);
            return "";
        }
    }

    private final String getCachedAppVersion() {
        return (String) this.cachedAppVersion$delegate.getValue();
    }

    private final long getCachedDiskSpace() {
        return ((Number) this.cachedDiskSpace$delegate.getValue()).longValue();
    }

    private final String getCachedInstaller() {
        return (String) this.cachedInstaller$delegate.getValue();
    }

    private final long getCachedRamMemory() {
        return ((Number) this.cachedRamMemory$delegate.getValue()).longValue();
    }

    @de1
    private final String getCertificateFingerprint() {
        boolean z;
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr != null) {
                if (signatureArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
                    generateCertificate.getClass();
                    String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) generateCertificate).getEncoded()));
                    hexString.getClass();
                    return hexString;
                }
                return "";
            }
            return "";
        } catch (Exception e) {
            this.logger.error("Exception when signing certificate fingerprint", e);
            return "";
        }
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return displayMetrics.density;
        }
        return 0.0f;
    }

    private final int getExtensionVersion() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            return extensionVersion;
        }
        return -1;
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getGPUModel(defpackage.vz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r5)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r4 = r4.glInfoStore
            r0.label = r2
            java.lang.Object r5 = r4.get(r0)
            w11 r4 = defpackage.w11.x
            if (r5 != r4) goto L3c
            return r4
        L3c:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r4 = r5.getData()
            java.nio.charset.Charset r5 = defpackage.kl0.a
            java.lang.String r4 = r4.toString(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getGPUModel(vz0):java.lang.Object");
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        if (gameId == null) {
            return "";
        }
        return gameId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @de1
    public final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    private final long getJvmMaxMemory() {
        return Runtime.getRuntime().maxMemory();
    }

    private final List<String> getKeyboardLanguages() {
        InputMethodManager inputMethodManager;
        nt1 nt1Var = nt1.x;
        try {
            Object systemService = this.context.getSystemService("input_method");
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            } else {
                inputMethodManager = null;
            }
            if (inputMethodManager != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
                inputMethodList.getClass();
                Iterator<T> it = inputMethodList.iterator();
                while (it.hasNext()) {
                    List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList((InputMethodInfo) it.next(), true);
                    enabledInputMethodSubtypeList.getClass();
                    Iterator<T> it2 = enabledInputMethodSubtypeList.iterator();
                    while (it2.hasNext()) {
                        String locale = ((InputMethodSubtype) it2.next()).getLocale();
                        locale.getClass();
                        if (locale.length() > 0) {
                            linkedHashSet.add(locale);
                        }
                    }
                }
                return yo0.I0(linkedHashSet);
            }
            return nt1Var;
        } catch (Exception e) {
            this.logger.error("Error getting keyboard languages", e);
            return nt1Var;
        }
    }

    private final long getMemoryInfo(Device.MemoryInfoType memoryInfoType) {
        int i = WhenMappings.$EnumSwitchMapping$0[memoryInfoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                ze0.l();
                return 0L;
            }
        }
        String str = null;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    str = randomAccessFile.readLine();
                } finally {
                }
            }
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            this.logger.error("Error reading memory info", e);
        }
        return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
    }

    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = Build.SUPPORTED_ABIS;
        arrayList.addAll(te4.I(Arrays.copyOf(strArr, strArr.length)));
        return arrayList;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String str = Build.CPU_ABI;
        str.getClass();
        arrayList.add(str);
        String str2 = Build.CPU_ABI2;
        str2.getClass();
        arrayList.add(str2);
        return arrayList;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        if (openAdvertisingTrackingId == null) {
            return "";
        }
        return openAdvertisingTrackingId;
    }

    private final int getPhoneType() {
        Object systemService = this.context.getSystemService("phone");
        systemService.getClass();
        return ((TelephonyManager) systemService).getPhoneType();
    }

    private final String getPlatform() {
        return PLATFORM_ANDROID;
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return displayMetrics.densityDpi;
        }
        return -1;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return displayMetrics.heightPixels;
        }
        return -1;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    private final String getSimOperator() {
        Object systemService = this.context.getSystemService("phone");
        systemService.getClass();
        String simOperator = ((TelephonyManager) systemService).getSimOperator();
        simOperator.getClass();
        return simOperator;
    }

    private final List<String> getStores(List<String> list) {
        return this.storeDataSource.fetchStores(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nt1.x;
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final long getTotalSpaceBytes(File file) {
        if (file != null && file.exists()) {
            return file.getTotalSpace();
        }
        return -1L;
    }

    private final int getVersionCode() {
        return 42100;
    }

    private final String getVersionName() {
        return "4.21.0";
    }

    private final String getWebViewUserAgent() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            defaultUserAgent.getClass();
            return defaultUserAgent;
        } catch (Exception e) {
            this.logger.error("Exception getting webview user agent", e);
            return "";
        }
    }

    private final boolean isAppDebuggable() {
        PackageManager packageManager = this.context.getPackageManager();
        packageManager.getClass();
        String packageName = this.context.getPackageName();
        packageName.getClass();
        boolean z = true;
        boolean z2 = false;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            applicationInfo.getClass();
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            if (i != 0) {
                z2 = true;
                z = false;
            } else {
                z = false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            this.logger.error("Could not find name", e);
        }
        if (z) {
            try {
                o1 x = wk6.x(packageManager.getPackageInfo(packageName, 64).signatures);
                while (x.hasNext()) {
                    Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(((Signature) x.next()).toByteArray()));
                    generateCertificate.getClass();
                    z2 = a34.i(((X509Certificate) generateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (z2) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                this.logger.error("Could not find name", e2);
            } catch (CertificateException e3) {
                this.logger.error("Certificate exception", e3);
            }
        }
        return z2;
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        if (!isSoftwareOnly(mediaCodecInfo, str)) {
            return true;
        }
        return false;
    }

    private final boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary(BINARY_SU);
        } catch (Exception e) {
            this.logger.error("Rooted check failed", e);
            return false;
        }
    }

    private final boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        name.getClass();
        String lowerCase = name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!b06.I(lowerCase, "arc.", false)) {
            if (!b06.I(lowerCase, "omx.google.", false) && !b06.I(lowerCase, "omx.ffmpeg.", false)) {
                if ((!b06.I(lowerCase, "omx.sec.", false) || !uz5.M(lowerCase, ".sw.", false)) && !lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") && !b06.I(lowerCase, "c2.android.", false) && !b06.I(lowerCase, "c2.google.", false)) {
                    if (!b06.I(lowerCase, "omx.", false) && !b06.I(lowerCase, "c2.", false)) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    private final boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean searchPathForBinary(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r7 = "PATH"
            java.lang.String r7 = java.lang.System.getenv(r7)
            r0 = 0
            if (r7 == 0) goto Ld4
            java.lang.String r1 = ":"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            defpackage.uz5.f0(r0)
            java.util.regex.Matcher r1 = r1.matcher(r7)
            boolean r2 = r1.find()
            if (r2 != 0) goto L28
            java.lang.String r7 = r7.toString()
            java.util.List r7 = defpackage.te4.H(r7)
            goto L59
        L28:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            r2.<init>(r3)
            r3 = r0
        L30:
            int r4 = r1.start()
            java.lang.CharSequence r3 = r7.subSequence(r3, r4)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            int r3 = r1.end()
            boolean r4 = r1.find()
            if (r4 != 0) goto L30
            int r1 = r7.length()
            java.lang.CharSequence r7 = r7.subSequence(r3, r1)
            java.lang.String r7 = r7.toString()
            r2.add(r7)
            r7 = r2
        L59:
            boolean r1 = r7.isEmpty()
            r2 = 1
            if (r1 != 0) goto L85
            int r1 = r7.size()
            java.util.ListIterator r1 = r7.listIterator(r1)
        L68:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L85
            java.lang.Object r3 = r1.previous()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 != 0) goto L7b
            goto L68
        L7b:
            int r1 = r1.nextIndex()
            int r1 = r1 + r2
            java.util.List r7 = defpackage.yo0.D0(r7, r1)
            goto L87
        L85:
            nt1 r7 = defpackage.nt1.x
        L87:
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.Object[] r7 = r7.toArray(r1)
            java.lang.String[] r7 = (java.lang.String[]) r7
            if (r7 == 0) goto Ld4
            int r1 = r7.length
            r3 = r0
        L93:
            if (r3 >= r1) goto Ld4
            r4 = r7[r3]
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r4 = r5.exists()
            if (r4 == 0) goto Ld1
            boolean r4 = r5.isDirectory()
            if (r4 == 0) goto Ld1
            java.io.File[] r4 = r5.listFiles()
            if (r4 == 0) goto Ld1
            r5 = r0
        Laf:
            int r6 = r4.length
            if (r5 >= r6) goto Lb4
            r6 = r2
            goto Lb5
        Lb4:
            r6 = r0
        Lb5:
            if (r6 == 0) goto Ld1
            int r6 = r5 + 1
            r5 = r4[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lc8
            java.lang.String r5 = r5.getName()
            boolean r5 = defpackage.a34.i(r5, r8)
            if (r5 == 0) goto Lc6
            return r2
        Lc6:
            r5 = r6
            goto Laf
        Lc8:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            defpackage.p65.h(r7)
            return r0
        Ld1:
            int r3 = r3 + 1
            goto L93
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.searchPathForBinary(java.lang.String):boolean");
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String str) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (b06.C(str2, str, true) && isHardwareAccelerated(codecInfoAt, str)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x005e, code lost:
    
        if (r9.a(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #1 {all -> 0x00bb, blocks: (B:31:0x0061, B:34:0x0066), top: B:30:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetch(java.util.List<java.lang.String> r8, defpackage.vz0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            w11 r1 = defpackage.w11.x
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$1
            k54 r8 = (defpackage.k54) r8
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            defpackage.m37.N(r9)     // Catch: java.lang.Throwable -> L33
            goto L77
        L33:
            r7 = move-exception
            goto Lbd
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r5
        L3c:
            java.lang.Object r8 = r0.L$1
            k54 r8 = (defpackage.k54) r8
            java.lang.Object r2 = r0.L$0
            java.util.List r2 = (java.util.List) r2
            defpackage.m37.N(r9)
            r9 = r8
            r8 = r2
            goto L61
        L4a:
            defpackage.m37.N(r9)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r9 = r7.enrichedStaticDeviceInfo
            if (r9 == 0) goto L52
            return r9
        L52:
            k54 r9 = r7.fetchMutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r2 = r9.a(r0)
            if (r2 != r1) goto L61
            goto L72
        L61:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r2 = r7.enrichedStaticDeviceInfo     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L66
            goto Lb7
        L66:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> Lbb
            r0.L$1 = r9     // Catch: java.lang.Throwable -> Lbb
            r0.label = r3     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r0 = r7.getGPUModel(r0)     // Catch: java.lang.Throwable -> Lbb
            if (r0 != r1) goto L73
        L72:
            return r1
        L73:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L77:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto Lb2
            int r1 = r9.length()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L82
            goto Lb2
        L82:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r1 = r7.getBaseStaticDeviceInfo()     // Catch: java.lang.Throwable -> L33
            gatewayprotocol.v1.StaticDeviceInfoKt$Dsl$Companion r2 = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion     // Catch: java.lang.Throwable -> L33
            com.google.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder r1 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) r1     // Catch: java.lang.Throwable -> L33
            gatewayprotocol.v1.StaticDeviceInfoKt$Dsl r1 = r2._create(r1)     // Catch: java.lang.Throwable -> L33
            r1.setGpuModel(r9)     // Catch: java.lang.Throwable -> L33
            com.google.protobuf.kotlin.DslList r9 = r1.getStores()     // Catch: java.lang.Throwable -> L33
            r1.clearStores(r9)     // Catch: java.lang.Throwable -> L33
            com.google.protobuf.kotlin.DslList r9 = r1.getStores()     // Catch: java.lang.Throwable -> L33
            java.util.List r0 = r7.getStores(r0)     // Catch: java.lang.Throwable -> L33
            r1.addAllStores(r9, r0)     // Catch: java.lang.Throwable -> L33
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r2 = r1._build()     // Catch: java.lang.Throwable -> L33
            r7.enrichedStaticDeviceInfo = r2     // Catch: java.lang.Throwable -> L33
        Lb0:
            r9 = r8
            goto Lb7
        Lb2:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r2 = r7.getBaseStaticDeviceInfo()     // Catch: java.lang.Throwable -> L33
            goto Lb0
        Lb7:
            r9.l(r5)
            return r2
        Lbb:
            r7 = move-exception
            r8 = r9
        Lbd:
            r8.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.fetch(java.util.List, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached() {
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.enrichedStaticDeviceInfo;
        if (staticDeviceInfo == null) {
            return getBaseStaticDeviceInfo();
        }
        return staticDeviceInfo;
    }

    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        if (advertisingTrackingId == null) {
            return "";
        }
        return advertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAppName() {
        String packageName = this.context.getPackageName();
        packageName.getClass();
        return packageName;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getAuid(vz0 vz0Var) {
        String string = AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_AUID, UnityAdsConstants.Preferences.PREF_KEY_AUID);
        if (string == null) {
            return null;
        }
        return string;
    }

    public final String getBoard() {
        String str = Build.BOARD;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getBrand() {
        String str = Build.BRAND;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getBuildId() {
        return Build.ID;
    }

    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getBundleVersion() {
        return getCachedAppVersion();
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDevice() {
        String str = Build.DEVICE;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getDisplay() {
        String str = Build.DISPLAY;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getHardware() {
        String str = Build.HARDWARE;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getHost() {
        String str = Build.HOST;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getIdfi(vz0 vz0Var) {
        String string = AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string == null) {
            String uuid = UUID.randomUUID().toString();
            AndroidPreferences.setString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI, uuid);
            return uuid;
        }
        return string;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getInstallSource() {
        return getCachedInstaller();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getModel() {
        String str = Build.MODEL;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getProduct() {
        String str = Build.PRODUCT;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService("sensor");
        systemService.getClass();
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        sensorList.getClass();
        return sensorList;
    }

    public final List<String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getTotalDiskSpace() {
        return getCachedDiskSpace();
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getTotalRamMemory() {
        return getCachedRamMemory();
    }

    public final long getTotalSpace(File file) {
        if (file != null && file.exists()) {
            return io3.h0((float) (file.getTotalSpace() / 1024));
        }
        return -1L;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getUnityBuildGuid(vz0 vz0Var) {
        return this.unityBootConfigDataSource.getValue("build-guid");
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs(MimeTypes.VIDEO_H264).isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs(MimeTypes.VIDEO_H265).isEmpty();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }
}
