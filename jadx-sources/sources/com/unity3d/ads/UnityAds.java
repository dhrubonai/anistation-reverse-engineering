package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import defpackage.de1;
import defpackage.pn6;
import defpackage.rn6;
import defpackage.sn6;
import defpackage.sv1;
import defpackage.t80;
import defpackage.tl7;
import defpackage.v11;
import defpackage.y45;
import defpackage.z05;
import defpackage.z45;
import defpackage.ze;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();
    private static Boolean nonBehavioral;
    private static Boolean userConsent;
    private static String userIdentifier;
    private static Boolean userOptOut;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class UnityAdsInitializationError extends Enum<UnityAdsInitializationError> {
        private static final /* synthetic */ sv1 $ENTRIES;
        private static final /* synthetic */ UnityAdsInitializationError[] $VALUES;
        public static final UnityAdsInitializationError INTERNAL_ERROR = new UnityAdsInitializationError("INTERNAL_ERROR", 0);
        public static final UnityAdsInitializationError INVALID_ARGUMENT = new UnityAdsInitializationError("INVALID_ARGUMENT", 1);
        public static final UnityAdsInitializationError AD_BLOCKER_DETECTED = new UnityAdsInitializationError("AD_BLOCKER_DETECTED", 2);

        private static final /* synthetic */ UnityAdsInitializationError[] $values() {
            return new UnityAdsInitializationError[]{INTERNAL_ERROR, INVALID_ARGUMENT, AD_BLOCKER_DETECTED};
        }

        static {
            UnityAdsInitializationError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = t80.D($values);
        }

        private UnityAdsInitializationError(String str, int i) {
            super(str, i);
        }

        public static sv1 getEntries() {
            return $ENTRIES;
        }

        public static UnityAdsInitializationError valueOf(String str) {
            return (UnityAdsInitializationError) Enum.valueOf(UnityAdsInitializationError.class, str);
        }

        public static UnityAdsInitializationError[] values() {
            return (UnityAdsInitializationError[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class UnityAdsLoadError extends Enum<UnityAdsLoadError> {
        private static final /* synthetic */ sv1 $ENTRIES;
        private static final /* synthetic */ UnityAdsLoadError[] $VALUES;
        public static final UnityAdsLoadError INITIALIZE_FAILED = new UnityAdsLoadError("INITIALIZE_FAILED", 0);
        public static final UnityAdsLoadError INTERNAL_ERROR = new UnityAdsLoadError("INTERNAL_ERROR", 1);
        public static final UnityAdsLoadError INVALID_ARGUMENT = new UnityAdsLoadError("INVALID_ARGUMENT", 2);
        public static final UnityAdsLoadError NO_FILL = new UnityAdsLoadError("NO_FILL", 3);
        public static final UnityAdsLoadError TIMEOUT = new UnityAdsLoadError("TIMEOUT", 4);

        private static final /* synthetic */ UnityAdsLoadError[] $values() {
            return new UnityAdsLoadError[]{INITIALIZE_FAILED, INTERNAL_ERROR, INVALID_ARGUMENT, NO_FILL, TIMEOUT};
        }

        static {
            UnityAdsLoadError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = t80.D($values);
        }

        private UnityAdsLoadError(String str, int i) {
            super(str, i);
        }

        public static sv1 getEntries() {
            return $ENTRIES;
        }

        public static UnityAdsLoadError valueOf(String str) {
            return (UnityAdsLoadError) Enum.valueOf(UnityAdsLoadError.class, str);
        }

        public static UnityAdsLoadError[] values() {
            return (UnityAdsLoadError[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class UnityAdsShowCompletionState extends Enum<UnityAdsShowCompletionState> {
        private static final /* synthetic */ sv1 $ENTRIES;
        private static final /* synthetic */ UnityAdsShowCompletionState[] $VALUES;
        public static final UnityAdsShowCompletionState SKIPPED = new UnityAdsShowCompletionState("SKIPPED", 0);
        public static final UnityAdsShowCompletionState COMPLETED = new UnityAdsShowCompletionState("COMPLETED", 1);

        private static final /* synthetic */ UnityAdsShowCompletionState[] $values() {
            return new UnityAdsShowCompletionState[]{SKIPPED, COMPLETED};
        }

        static {
            UnityAdsShowCompletionState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = t80.D($values);
        }

        private UnityAdsShowCompletionState(String str, int i) {
            super(str, i);
        }

        public static sv1 getEntries() {
            return $ENTRIES;
        }

        public static UnityAdsShowCompletionState valueOf(String str) {
            return (UnityAdsShowCompletionState) Enum.valueOf(UnityAdsShowCompletionState.class, str);
        }

        public static UnityAdsShowCompletionState[] values() {
            return (UnityAdsShowCompletionState[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class UnityAdsShowError extends Enum<UnityAdsShowError> {
        private static final /* synthetic */ sv1 $ENTRIES;
        private static final /* synthetic */ UnityAdsShowError[] $VALUES;
        public static final UnityAdsShowError NOT_INITIALIZED = new UnityAdsShowError("NOT_INITIALIZED", 0);
        public static final UnityAdsShowError NOT_READY = new UnityAdsShowError("NOT_READY", 1);
        public static final UnityAdsShowError VIDEO_PLAYER_ERROR = new UnityAdsShowError("VIDEO_PLAYER_ERROR", 2);
        public static final UnityAdsShowError INVALID_ARGUMENT = new UnityAdsShowError("INVALID_ARGUMENT", 3);
        public static final UnityAdsShowError NO_CONNECTION = new UnityAdsShowError("NO_CONNECTION", 4);
        public static final UnityAdsShowError ALREADY_SHOWING = new UnityAdsShowError("ALREADY_SHOWING", 5);
        public static final UnityAdsShowError INTERNAL_ERROR = new UnityAdsShowError("INTERNAL_ERROR", 6);
        public static final UnityAdsShowError TIMEOUT = new UnityAdsShowError("TIMEOUT", 7);
        public static final UnityAdsShowError EXPIRED = new UnityAdsShowError("EXPIRED", 8);

        private static final /* synthetic */ UnityAdsShowError[] $values() {
            return new UnityAdsShowError[]{NOT_INITIALIZED, NOT_READY, VIDEO_PLAYER_ERROR, INVALID_ARGUMENT, NO_CONNECTION, ALREADY_SHOWING, INTERNAL_ERROR, TIMEOUT, EXPIRED};
        }

        static {
            UnityAdsShowError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = t80.D($values);
        }

        private UnityAdsShowError(String str, int i) {
            super(str, i);
        }

        public static sv1 getEntries() {
            return $ENTRIES;
        }

        public static UnityAdsShowError valueOf(String str) {
            return (UnityAdsShowError) Enum.valueOf(UnityAdsShowError.class, str);
        }

        public static UnityAdsShowError[] values() {
            return (UnityAdsShowError[]) $VALUES.clone();
        }
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static final Boolean getNonBehavioral() {
        return nonBehavioral;
    }

    public static final void getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object y45Var;
        tokenConfiguration.getClass();
        iUnityAdsTokenListener.getClass();
        try {
            UnityAdsImplementation.getInstance().getToken(tokenConfiguration, iUnityAdsTokenListener);
            y45Var = pn6.a;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (z45.b(y45Var) != null) {
            Utilities.wrapCustomerListener(new rn6(iUnityAdsTokenListener, (byte) 1));
        }
    }

    public static final Boolean getUserConsent() {
        return userConsent;
    }

    public static final String getUserIdentifier() {
        return userIdentifier;
    }

    public static final Boolean getUserOptOut() {
        return userOptOut;
    }

    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        version.getClass();
        return version;
    }

    public static final void initialize(InitializationConfiguration initializationConfiguration, InitializationListener initializationListener) {
        initializationConfiguration.getClass();
        initializationListener.getClass();
        tl7.z((v11) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, z05.a(v11.class))), null, null, new UnityAds$initialize$7(initializationConfiguration, initializationListener, null), 3);
    }

    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th.getMessage());
    }

    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th.getMessage());
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    @de1
    public static final void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object y45Var;
        try {
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (unityAdsLoadOptions == null) {
                unityAdsLoadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
            y45Var = pn6.a;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        Throwable b = z45.b(y45Var);
        if (b != null && iUnityAdsLoadListener != null) {
            Utilities.wrapCustomerListener(new ze((Object) iUnityAdsLoadListener, (Object) str, (Object) b, (byte) 23));
        }
    }

    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener iUnityAdsLoadListener, String str, Throwable th) {
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + th.getMessage());
    }

    public static final void setDebugMode(boolean z) {
        try {
            UnityAdsImplementation.getInstance().setDebugMode(z);
        } catch (Throwable unused) {
        }
    }

    public static final void setNonBehavioral(Boolean bool) {
        nonBehavioral = bool;
    }

    public static final void setUserConsent(Boolean bool) {
        userConsent = bool;
    }

    public static final void setUserIdentifier(String str) {
        userIdentifier = str;
    }

    public static final void setUserOptOut(Boolean bool) {
        userOptOut = bool;
    }

    @de1
    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        Object y45Var;
        try {
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
            y45Var = pn6.a;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        Throwable b = z45.b(y45Var);
        if (b != null && iUnityAdsShowListener != null) {
            Utilities.wrapCustomerListener(new ze((Object) iUnityAdsShowListener, (Object) str, (Object) b, (byte) 22));
        }
    }

    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener iUnityAdsShowListener, String str, Throwable th) {
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + th.getMessage());
    }

    @de1
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getNonBehavioral$annotations() {
    }

    @de1
    public static /* synthetic */ void getToken$annotations() {
    }

    public static /* synthetic */ void getUserConsent$annotations() {
    }

    public static /* synthetic */ void getUserIdentifier$annotations() {
    }

    public static /* synthetic */ void getUserOptOut$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    @de1
    public static /* synthetic */ void isSupported$annotations() {
    }

    @de1
    public static final void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        try {
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
        } catch (Throwable unused) {
        }
    }

    @de1
    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        try {
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, null);
        } catch (Throwable unused) {
        }
    }

    @de1
    public static final void show(Activity activity, String str) {
        try {
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), null);
        } catch (Throwable unused) {
        }
    }

    @de1
    public static final void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object y45Var;
        try {
            UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
            y45Var = pn6.a;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (z45.b(y45Var) == null || iUnityAdsTokenListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new rn6(iUnityAdsTokenListener, (byte) 0));
    }

    @de1
    public static final void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object y45Var;
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
            y45Var = pn6.a;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        Throwable b = z45.b(y45Var);
        if (b == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new sn6(iUnityAdsInitializationListener, b, (byte) 1));
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    @de1
    public static final void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    @de1
    public static final void load(String str) {
        try {
            load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String str2) {
                    str2.getClass();
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String str2, UnityAds.UnityAdsLoadError unityAdsLoadError, String str3) {
                    str2.getClass();
                    unityAdsLoadError.getClass();
                    str3.getClass();
                }
            });
        } catch (Throwable unused) {
        }
    }

    @de1
    public static final void initialize(Context context, String str, boolean z) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, z, null);
        } catch (Throwable unused) {
        }
    }

    @de1
    public static final void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object y45Var;
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, z, iUnityAdsInitializationListener);
            y45Var = pn6.a;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        Throwable b = z45.b(y45Var);
        if (b == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new sn6(iUnityAdsInitializationListener, b, (byte) 0));
    }

    @de1
    public static final void initialize(Context context, String str) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, false, null);
        } catch (Throwable unused) {
        }
    }
}
