package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.vz0;
import defpackage.w42;
import defpackage.x44;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidDeviceInfoRepository implements DeviceInfoRepository {
    private final x44 allowedPii;
    private final String analyticsUserId;
    private final DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource;
    private final PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource;
    private final SessionRepository sessionRepository;
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;
    private final w42 volumeSettingsChange;

    public AndroidDeviceInfoRepository(StaticDeviceInfoDataSource staticDeviceInfoDataSource, DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource, PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, SessionRepository sessionRepository) {
        staticDeviceInfoDataSource.getClass();
        dynamicDeviceInfoDataSource.getClass();
        privacyDeviceInfoDataSource.getClass();
        sessionRepository.getClass();
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource;
        this.dynamicDeviceInfoDataSource = dynamicDeviceInfoDataSource;
        this.privacyDeviceInfoDataSource = privacyDeviceInfoDataSource;
        this.sessionRepository = sessionRepository;
        this.allowedPii = tx5.a(AllowedPiiOuterClass.AllowedPii.getDefaultInstance());
        this.analyticsUserId = staticDeviceInfoDataSource.getAnalyticsUserId();
        this.volumeSettingsChange = dynamicDeviceInfoDataSource.getVolumeSettingsChange();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo() {
        return this.staticDeviceInfoDataSource.fetchCached();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfoWithAccelerometer() {
        return this.dynamicDeviceInfoDataSource.fetch(true);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public x44 getAllowedPii() {
        return this.allowedPii;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getAnalyticsUserId() {
        return this.analyticsUserId;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getAppName() {
        return this.staticDeviceInfoDataSource.getAppName();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getAuidByteString(defpackage.vz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1 r0 = (com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1 r0 = new com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r5)
            goto L3a
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r5)
            r0.label = r3
            java.lang.Object r5 = r4.getAuidString(r0)
            w11 r4 = defpackage.w11.x
            if (r5 != r4) goto L3a
            return r4
        L3a:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L3f
            return r2
        L3f:
            java.util.UUID r4 = java.util.UUID.fromString(r5)     // Catch: java.lang.Throwable -> L4b
            r4.getClass()     // Catch: java.lang.Throwable -> L4b
            com.google.protobuf.ByteString r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(r4)     // Catch: java.lang.Throwable -> L4b
            return r4
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository.getAuidByteString(vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object getAuidString(vz0 vz0Var) {
        return this.staticDeviceInfoDataSource.getAuid(vz0Var);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public double getBatteryLevel() {
        return this.dynamicDeviceInfoDataSource.getBatteryLevel();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getBatteryStatus() {
        return this.dynamicDeviceInfoDataSource.getBatteryStatus();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getBundleVersion() {
        return this.staticDeviceInfoDataSource.getBundleVersion();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        return this.dynamicDeviceInfoDataSource.getConnectionType();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getConnectionTypeStr() {
        return this.dynamicDeviceInfoDataSource.getConnectionTypeStr();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getCurrentUiTheme() {
        return this.dynamicDeviceInfoDataSource.getCurrentUiTheme();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
        return this.dynamicDeviceInfoDataSource.fetch(false);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public boolean getHasInternet() {
        return this.dynamicDeviceInfoDataSource.hasInternet();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object getIdfi(vz0 vz0Var) {
        return this.staticDeviceInfoDataSource.getIdfi(vz0Var);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getInstallSource() {
        return this.staticDeviceInfoDataSource.getInstallSource();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getLanguage() {
        return this.dynamicDeviceInfoDataSource.getLanguage();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public boolean getLimitedTracking() {
        return this.dynamicDeviceInfoDataSource.isLimitAdTrackingEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public List<String> getLocaleList() {
        return this.dynamicDeviceInfoDataSource.getLocaleList();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getManufacturer() {
        return this.staticDeviceInfoDataSource.getManufacturer();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public double getMaxVolume() {
        return this.dynamicDeviceInfoDataSource.getMaxVolume();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getModel() {
        return this.staticDeviceInfoDataSource.getModel();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getNetworkOperator() {
        return this.dynamicDeviceInfoDataSource.getNetworkOperator();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getOrientation() {
        return this.dynamicDeviceInfoDataSource.getOrientation();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public String getOsVersion() {
        return this.staticDeviceInfoDataSource.getOsVersion();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public PiiOuterClass.Pii getPiiData() {
        return this.privacyDeviceInfoDataSource.fetch((AllowedPiiOuterClass.AllowedPii) ((sx5) getAllowedPii()).getValue());
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getRingerMode() {
        return this.dynamicDeviceInfoDataSource.getRingerMode();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getScreenHeight() {
        return this.dynamicDeviceInfoDataSource.getScreenHeight();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getScreenWidth() {
        return this.dynamicDeviceInfoDataSource.getScreenWidth();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public long getSystemBootTime() {
        return this.staticDeviceInfoDataSource.getSystemBootTime();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public long getTotalDiskSpace() {
        return this.staticDeviceInfoDataSource.getTotalDiskSpace();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public long getTotalRamMemory() {
        return this.staticDeviceInfoDataSource.getTotalRamMemory();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object getUnityBuildGuid(vz0 vz0Var) {
        return this.staticDeviceInfoDataSource.getUnityBuildGuid(vz0Var);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public double getVolume() {
        return this.dynamicDeviceInfoDataSource.getVolume();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public w42 getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public Object staticDeviceInfo(vz0 vz0Var) {
        StaticDeviceInfoDataSource staticDeviceInfoDataSource = this.staticDeviceInfoDataSource;
        List<String> additionalStorePackagesList = this.sessionRepository.getNativeConfiguration().getAdditionalStorePackagesList();
        additionalStorePackagesList.getClass();
        return staticDeviceInfoDataSource.fetch(additionalStorePackagesList, vz0Var);
    }
}
