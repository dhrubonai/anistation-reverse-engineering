package com.unity3d.services.core.properties;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.log.LogLevelInternal;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.cache.CacheDirectory;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import defpackage.a92;
import defpackage.f32;
import defpackage.h11;
import defpackage.td5;
import defpackage.vr0;
import defpackage.ze;
import gatewayprotocol.v1.ErrorOuterClass;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class SdkProperties {
    private static final String CACHE_DIR_NAME = "UnityAdsCache";
    private static final String CHINA_CONFIG_HOSTNAME = "dW5pdHlhZHMudW5pdHljaGluYS5jbg==";
    private static final String CHINA_ISO_ALPHA_2_CODE = "CN";
    private static final String CHINA_ISO_ALPHA_3_CODE = "CHN";
    private static final String CONFIG_VERSION_METADATA_KEY = "com.unity3d.ads.configversion";
    private static final String DEFAULT_CONFIG_HOSTNAME = "unityads.unity3d.com";
    private static final String DEFAULT_CONFIG_VERSION = "configv2";
    private static final String LOCAL_CACHE_FILE_PREFIX = "UnityAdsCache-";
    private static final String LOCAL_STORAGE_FILE_PREFIX = "UnityAdsStorage-";
    private static final String WEBVIEW_CACHE_DIR_NAME = "UnityAdsWebViewCache";
    private static long _appInitializationTimeEpochMs;
    private static CacheDirectory _cacheDirectory;
    private static String _configUrl;
    private static long _initializationTime;
    private static long _initializationTimeEpochMs;
    private static CacheDirectory _webviewCacheDirectory;
    private static final LinkedHashSet<IUnityAdsInitializationListener> _legacyInitializationListeners = new LinkedHashSet<>();
    private static final LinkedHashSet<InitializationListener> _initializationListeners = new LinkedHashSet<>();
    private static boolean _reinitialized = false;
    private static boolean _testMode = false;
    private static boolean _previousTestMode = false;
    private static boolean _debugMode = false;
    private static final AtomicReference<InitializationState> _currentInitializationState = new AtomicReference<>(InitializationState.NOT_INITIALIZED);

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public enum InitializationState {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZED_FAILED
    }

    public static void addInitializationListener(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (iUnityAdsInitializationListener == null) {
            return;
        }
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            linkedHashSet.add(iUnityAdsInitializationListener);
        }
    }

    public static long getAppInitializationTimeSinceEpoch() {
        return _appInitializationTimeEpochMs;
    }

    public static File getCacheDirectory(Context context) {
        if (_cacheDirectory == null) {
            setCacheDirectory(new CacheDirectory("UnityAdsCache"));
        }
        return _cacheDirectory.getCacheDirectory(context);
    }

    public static String getCacheDirectoryName() {
        return "UnityAdsCache";
    }

    public static CacheDirectory getCacheDirectoryObject() {
        return _cacheDirectory;
    }

    public static String getCacheFilePrefix() {
        return LOCAL_CACHE_FILE_PREFIX;
    }

    public static String getConfigUrl() {
        String str = _configUrl;
        if (str == null) {
            String defaultConfigUrl = getDefaultConfigUrl(BuildConfig.BUILD_TYPE);
            _configUrl = defaultConfigUrl;
            return defaultConfigUrl;
        }
        return str;
    }

    public static String getConfigVersion(Context context) {
        if (context != null) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    return bundle.getString(CONFIG_VERSION_METADATA_KEY, DEFAULT_CONFIG_VERSION);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                DeviceLog.warning("Failed to retrieve application info for current package");
            }
        }
        return DEFAULT_CONFIG_VERSION;
    }

    public static InitializationState getCurrentInitializationState() {
        return _currentInitializationState.get();
    }

    public static boolean getDebugMode() {
        return _debugMode;
    }

    public static String getDefaultConfigUrl(String str) {
        String str2;
        if (isChinaLocale(Device.getNetworkCountryISO())) {
            str2 = new String(Base64.decode(CHINA_CONFIG_HOSTNAME, 0));
        } else {
            str2 = DEFAULT_CONFIG_HOSTNAME;
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(getConfigVersion(ClientProperties.getApplicationContext()));
        sb.append('.');
        sb.append(str2);
        sb.append("/webview/");
        return h11.l(sb, getWebViewBranch(), "/", str, "/config.json");
    }

    public static long getInitializationTime() {
        return _initializationTime;
    }

    public static long getInitializationTimeEpoch() {
        return _initializationTimeEpochMs;
    }

    public static IUnityAdsInitializationListener[] getLegacyInitializationListeners() {
        IUnityAdsInitializationListener[] iUnityAdsInitializationListenerArr;
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            iUnityAdsInitializationListenerArr = new IUnityAdsInitializationListener[linkedHashSet.size()];
            linkedHashSet.toArray(iUnityAdsInitializationListenerArr);
        }
        return iUnityAdsInitializationListenerArr;
    }

    public static String getLocalConfigurationFilepath() {
        if (getWebViewCacheDirectory() == null) {
            return "";
        }
        return getWebViewCacheDirectory().getAbsolutePath() + "/UnityAdsWebViewConfiguration.json";
    }

    public static String getLocalStorageFilePrefix() {
        return LOCAL_STORAGE_FILE_PREFIX;
    }

    public static String getLocalWebViewFile() {
        if (getWebViewCacheDirectory() == null) {
            return "";
        }
        return getWebViewCacheDirectory().getAbsolutePath() + "/UnityAdsWebApp.html";
    }

    public static boolean getPreviousTestMode() {
        return _previousTestMode;
    }

    public static int getVersionCode() {
        return 42100;
    }

    public static String getVersionName() {
        return "4.21.0";
    }

    private static String getWebViewBranch() {
        return getVersionName();
    }

    public static File getWebViewCacheDirectory(Context context) {
        if (_webviewCacheDirectory == null) {
            setWebViewCacheDirectory(new CacheDirectory(WEBVIEW_CACHE_DIR_NAME, false));
        }
        return _webviewCacheDirectory.getCacheDirectory(context);
    }

    public static boolean isChinaLocale(String str) {
        if (!str.equalsIgnoreCase(CHINA_ISO_ALPHA_2_CODE) && !str.equalsIgnoreCase(CHINA_ISO_ALPHA_3_CODE)) {
            return false;
        }
        return true;
    }

    public static boolean isInitialized() {
        if (getCurrentInitializationState() == InitializationState.INITIALIZED_SUCCESSFULLY) {
            return true;
        }
        return false;
    }

    public static boolean isReinitialized() {
        return _reinitialized;
    }

    public static boolean isTestMode() {
        return _testMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyInitializationFailed$1(InitializationListener initializationListener, String str) {
        initializationListener.onInitializationComplete(new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED.getNumber(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyInitializationFailed$2(IUnityAdsInitializationListener iUnityAdsInitializationListener, String str) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyInitializationFailed$3(InitializationListener initializationListener, int i, String str) {
        initializationListener.onInitializationComplete(new UnityAdsError(i, str));
    }

    public static void notifyInitializationComplete() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            LinkedHashSet<InitializationListener> linkedHashSet2 = _initializationListeners;
            synchronized (linkedHashSet2) {
                try {
                    setInitializeState(InitializationState.INITIALIZED_SUCCESSFULLY);
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(linkedHashSet);
                    linkedHashSet.clear();
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet(linkedHashSet2);
                    linkedHashSet2.clear();
                    Iterator it = linkedHashSet3.iterator();
                    while (it.hasNext()) {
                        IUnityAdsInitializationListener iUnityAdsInitializationListener = (IUnityAdsInitializationListener) it.next();
                        Objects.requireNonNull(iUnityAdsInitializationListener);
                        Utilities.wrapCustomerListener(new td5(iUnityAdsInitializationListener, (byte) 0));
                    }
                    Iterator it2 = linkedHashSet4.iterator();
                    while (it2.hasNext()) {
                        Utilities.wrapCustomerListener(new a92((InitializationListener) it2.next(), (byte) 17));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void notifyInitializationFailed(InitializationException initializationException) {
        int number;
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            LinkedHashSet<InitializationListener> linkedHashSet2 = _initializationListeners;
            synchronized (linkedHashSet2) {
                try {
                    setInitializeState(InitializationState.INITIALIZED_FAILED);
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(linkedHashSet);
                    linkedHashSet.clear();
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet(linkedHashSet2);
                    linkedHashSet2.clear();
                    Iterator it = linkedHashSet3.iterator();
                    while (it.hasNext()) {
                        Utilities.wrapCustomerListener(new f32(it.next(), (Object) initializationException.getMessage(), (byte) 27));
                    }
                    Iterator it2 = linkedHashSet4.iterator();
                    while (it2.hasNext()) {
                        InitializationListener initializationListener = (InitializationListener) it2.next();
                        String message = initializationException.getMessage();
                        if (initializationException.getErrorCode() != null) {
                            number = initializationException.getErrorCode().getNumber();
                        } else {
                            number = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED.getNumber();
                        }
                        Utilities.wrapCustomerListener(new vr0((byte) 3, number, initializationListener, message));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void resetInitializationListeners() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            LinkedHashSet<InitializationListener> linkedHashSet2 = _initializationListeners;
            synchronized (linkedHashSet2) {
                linkedHashSet2.clear();
                linkedHashSet.clear();
            }
        }
    }

    public static void setAppInitializationTimeSinceEpoch(long j) {
        _appInitializationTimeEpochMs = j;
    }

    public static void setCacheDirectory(CacheDirectory cacheDirectory) {
        _cacheDirectory = cacheDirectory;
    }

    public static void setConfigUrl(String str) {
        if (str != null) {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                throw new MalformedURLException();
            }
            new URL(str).toURI();
            _configUrl = str;
            return;
        }
        throw new MalformedURLException();
    }

    public static void setDebugMode(boolean z) {
        _debugMode = z;
        Logger logger = (Logger) Utilities.getService(Logger.class);
        if (z) {
            DeviceLog.setLogLevel(8);
            logger.setLogLevel(LogLevelInternal.DEBUG);
        } else {
            DeviceLog.setLogLevel(4);
            logger.setLogLevel(LogLevelInternal.INFO);
        }
    }

    public static void setInitializationTime(long j) {
        _initializationTime = j;
    }

    public static void setInitializationTimeSinceEpoch(long j) {
        _initializationTimeEpochMs = j;
    }

    public static void setInitializeState(InitializationState initializationState) {
        _currentInitializationState.set(initializationState);
    }

    @Deprecated
    public static void setInitialized(boolean z) {
        DeviceLog.warning("SdkProperties.setInitialized() no longer has any effect and will be removed; UnityAds.isInitialized() reports the SDK's own initialization state.");
    }

    public static void setReinitialized(boolean z) {
        _reinitialized = z;
    }

    public static void setTestMode(boolean z) {
        _previousTestMode = _testMode;
        _testMode = z;
    }

    public static void setWebViewCacheDirectory(CacheDirectory cacheDirectory) {
        _webviewCacheDirectory = cacheDirectory;
    }

    public static void addInitializationListener(InitializationListener initializationListener) {
        if (initializationListener == null) {
            return;
        }
        LinkedHashSet<InitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            linkedHashSet.add(initializationListener);
        }
    }

    public static File getCacheDirectory() {
        return getCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static File getWebViewCacheDirectory() {
        return getWebViewCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static void notifyInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            LinkedHashSet<InitializationListener> linkedHashSet2 = _initializationListeners;
            synchronized (linkedHashSet2) {
                try {
                    setInitializeState(InitializationState.INITIALIZED_FAILED);
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(linkedHashSet);
                    linkedHashSet.clear();
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet(linkedHashSet2);
                    linkedHashSet2.clear();
                    Iterator it = linkedHashSet3.iterator();
                    while (it.hasNext()) {
                        Utilities.wrapCustomerListener(new ze(it.next(), (Object) unityAdsInitializationError, (Object) str, (byte) 20));
                    }
                    Iterator it2 = linkedHashSet4.iterator();
                    while (it2.hasNext()) {
                        Utilities.wrapCustomerListener(new f32(it2.next(), (Object) str, (byte) 26));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
