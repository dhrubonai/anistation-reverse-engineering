package com.unity3d.ads.core.data.datasource;

import defpackage.w42;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch(boolean z);

    double getBatteryLevel();

    int getBatteryStatus();

    DynamicDeviceInfoOuterClass.ConnectionType getConnectionType();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    String getLanguage();

    List<String> getLocaleList();

    double getMaxVolume();

    String getNetworkOperator();

    String getOrientation();

    int getRingerMode();

    int getScreenHeight();

    int getScreenWidth();

    double getVolume();

    w42 getVolumeSettingsChange();

    boolean hasInternet();

    boolean isLimitAdTrackingEnabled();
}
