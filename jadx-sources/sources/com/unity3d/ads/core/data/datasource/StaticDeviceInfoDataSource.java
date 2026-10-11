package com.unity3d.ads.core.data.datasource;

import defpackage.vz0;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, vz0 vz0Var);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(vz0 vz0Var);

    String getBundleVersion();

    Object getIdfi(vz0 vz0Var);

    String getInstallSource();

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();

    long getTotalDiskSpace();

    long getTotalRamMemory();

    Object getUnityBuildGuid(vz0 vz0Var);
}
