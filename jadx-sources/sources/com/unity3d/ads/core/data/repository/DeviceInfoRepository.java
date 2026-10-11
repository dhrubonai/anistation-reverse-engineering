package com.unity3d.ads.core.data.repository;

import defpackage.vz0;
import defpackage.w42;
import defpackage.x44;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface DeviceInfoRepository {
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfoWithAccelerometer();

    x44 getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(vz0 vz0Var);

    Object getAuidString(vz0 vz0Var);

    double getBatteryLevel();

    int getBatteryStatus();

    String getBundleVersion();

    DynamicDeviceInfoOuterClass.ConnectionType getConnectionType();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(vz0 vz0Var);

    String getInstallSource();

    String getLanguage();

    boolean getLimitedTracking();

    List<String> getLocaleList();

    String getManufacturer();

    double getMaxVolume();

    String getModel();

    String getNetworkOperator();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    int getScreenHeight();

    int getScreenWidth();

    long getSystemBootTime();

    long getTotalDiskSpace();

    long getTotalRamMemory();

    Object getUnityBuildGuid(vz0 vz0Var);

    double getVolume();

    w42 getVolumeSettingsChange();

    Object staticDeviceInfo(vz0 vz0Var);
}
