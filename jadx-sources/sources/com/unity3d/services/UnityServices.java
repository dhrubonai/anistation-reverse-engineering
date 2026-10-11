package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.InitializationListener;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.de1;
import defpackage.sv1;
import defpackage.t80;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class UnityServices {
    public static final UnityServices INSTANCE = new UnityServices();
    private static final boolean isSupported = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class UnityServicesError {
        private static final /* synthetic */ sv1 $ENTRIES;
        private static final /* synthetic */ UnityServicesError[] $VALUES;
        public static final UnityServicesError INVALID_ARGUMENT = new UnityServicesError("INVALID_ARGUMENT", 0);
        public static final UnityServicesError INIT_SANITY_CHECK_FAIL = new UnityServicesError("INIT_SANITY_CHECK_FAIL", 1);

        private static final /* synthetic */ UnityServicesError[] $values() {
            return new UnityServicesError[]{INVALID_ARGUMENT, INIT_SANITY_CHECK_FAIL};
        }

        static {
            UnityServicesError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = t80.D($values);
        }

        private UnityServicesError(String str, int i) {
        }

        public static sv1 getEntries() {
            return $ENTRIES;
        }

        public static UnityServicesError valueOf(String str) {
            return (UnityServicesError) Enum.valueOf(UnityServicesError.class, str);
        }

        public static UnityServicesError[] values() {
            return (UnityServicesError[]) $VALUES.clone();
        }
    }

    private UnityServices() {
    }

    public static final boolean getDebugMode() {
        return SdkProperties.getDebugMode();
    }

    public static final String getVersion() {
        String versionName = SdkProperties.getVersionName();
        versionName.getClass();
        return versionName;
    }

    public static final synchronized void initialize(Context context, String str, boolean z, InitializationConfiguration initializationConfiguration, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        synchronized (UnityServices.class) {
            DeviceLog.entered();
            SdkProperties.addInitializationListener(iUnityAdsInitializationListener);
            SdkProperties.setTestMode(z);
            SdkProperties.setDebugMode(SdkProperties.getDebugMode());
            CachedLifecycle.register();
            UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, null), str, null, initializationConfiguration, 2, null);
        }
    }

    public static final boolean isInitialized() {
        return SdkProperties.isInitialized();
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    public static final void setDebugMode(boolean z) {
        SdkProperties.setDebugMode(z);
    }

    @de1
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    @de1
    public static /* synthetic */ void isSupported$annotations() {
    }

    public static final synchronized void initialize(Context context, String str, boolean z, InitializationConfiguration initializationConfiguration, InitializationListener initializationListener) {
        synchronized (UnityServices.class) {
            DeviceLog.entered();
            SdkProperties.addInitializationListener(initializationListener);
            SdkProperties.setTestMode(z);
            SdkProperties.setDebugMode(SdkProperties.getDebugMode());
            CachedLifecycle.register();
            UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, null), str, null, initializationConfiguration, 2, null);
        }
    }
}
