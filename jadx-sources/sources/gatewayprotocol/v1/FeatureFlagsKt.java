package gatewayprotocol.v1;

import defpackage.q71;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class FeatureFlagsKt {
    public static final FeatureFlagsKt INSTANCE = new FeatureFlagsKt();

    private FeatureFlagsKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.FeatureFlags.Builder _builder;

        private Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeConfigurationOuterClass.FeatureFlags _build() {
            NativeConfigurationOuterClass.FeatureFlags build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAppSheetBugCheckEnabled() {
            this._builder.clearAppSheetBugCheckEnabled();
        }

        public final void clearBoldSdkNextSessionEnabled() {
            this._builder.clearBoldSdkNextSessionEnabled();
        }

        public final void clearCollectAccelerometer() {
            this._builder.clearCollectAccelerometer();
        }

        public final void clearCollectGoogleAppId() {
            this._builder.clearCollectGoogleAppId();
        }

        public final void clearCollectIlrData() {
            this._builder.clearCollectIlrData();
        }

        public final void clearCollectLifecycleEvents() {
            this._builder.clearCollectLifecycleEvents();
        }

        public final void clearDisableCustomScheme() {
            this._builder.clearDisableCustomScheme();
        }

        public final void clearDisableGridCollection() {
            this._builder.clearDisableGridCollection();
        }

        public final void clearEnableCoherenceLibrary() {
            this._builder.clearEnableCoherenceLibrary();
        }

        public final void clearEnableDataLibraryRequestAttributes() {
            this._builder.clearEnableDataLibraryRequestAttributes();
        }

        public final void clearEnableDataLibraryTokenAttributes() {
            this._builder.clearEnableDataLibraryTokenAttributes();
        }

        public final void clearEnableDataLibraryWasmData() {
            this._builder.clearEnableDataLibraryWasmData();
        }

        public final void clearEnableWebViewProbe() {
            this._builder.clearEnableWebViewProbe();
        }

        public final void clearEnsureCacheFolderExistences() {
            this._builder.clearEnsureCacheFolderExistences();
        }

        public final void clearFullscreenNavBarMode() {
            this._builder.clearFullscreenNavBarMode();
        }

        public final void clearMeasureBridgePerformance() {
            this._builder.clearMeasureBridgePerformance();
        }

        public final void clearNativeStartMode() {
            this._builder.clearNativeStartMode();
        }

        public final void clearOpenglGpuEnabled() {
            this._builder.clearOpenglGpuEnabled();
        }

        public final void clearOpportunityIdPlacementValidation() {
            this._builder.clearOpportunityIdPlacementValidation();
        }

        public final void clearPreShowWebviewStrategy() {
            this._builder.clearPreShowWebviewStrategy();
        }

        public final void clearRecoverFullscreenDisplayEnabled() {
            this._builder.clearRecoverFullscreenDisplayEnabled();
        }

        public final void clearRecoverFullscreenDisplayMaxBackgroundAgeMs() {
            this._builder.clearRecoverFullscreenDisplayMaxBackgroundAgeMs();
        }

        public final void clearRecoverTerminatedWebviews() {
            this._builder.clearRecoverTerminatedWebviews();
        }

        public final void clearRetryShowWithCurrentActivity() {
            this._builder.clearRetryShowWithCurrentActivity();
        }

        public final void clearShouldAllowFetchToAccessCache() {
            this._builder.clearShouldAllowFetchToAccessCache();
        }

        public final void clearShouldHandleWebviewCaching() {
            this._builder.clearShouldHandleWebviewCaching();
        }

        public final void clearShouldInitAdqWithGameId() {
            this._builder.clearShouldInitAdqWithGameId();
        }

        public final void clearShouldSendIapHistory() {
            this._builder.clearShouldSendIapHistory();
        }

        public final void clearUseCurrentActivityForShow() {
            this._builder.clearUseCurrentActivityForShow();
        }

        public final void clearUseFilesDir() {
            this._builder.clearUseFilesDir();
        }

        public final void clearUseOptimisticWebviewCache() {
            this._builder.clearUseOptimisticWebviewCache();
        }

        public final void clearUseTryCatchInDownloadQueue() {
            this._builder.clearUseTryCatchInDownloadQueue();
        }

        public final void clearWebviewLessLoadParallelActivityLaunch() {
            this._builder.clearWebviewLessLoadParallelActivityLaunch();
        }

        public final void clearWebviewPoolSize() {
            this._builder.clearWebviewPoolSize();
        }

        public final boolean getAppSheetBugCheckEnabled() {
            return this._builder.getAppSheetBugCheckEnabled();
        }

        public final boolean getBoldSdkNextSessionEnabled() {
            return this._builder.getBoldSdkNextSessionEnabled();
        }

        public final boolean getCollectAccelerometer() {
            return this._builder.getCollectAccelerometer();
        }

        public final boolean getCollectGoogleAppId() {
            return this._builder.getCollectGoogleAppId();
        }

        public final boolean getCollectIlrData() {
            return this._builder.getCollectIlrData();
        }

        public final boolean getCollectLifecycleEvents() {
            return this._builder.getCollectLifecycleEvents();
        }

        public final boolean getDisableCustomScheme() {
            return this._builder.getDisableCustomScheme();
        }

        public final boolean getDisableGridCollection() {
            return this._builder.getDisableGridCollection();
        }

        public final boolean getEnableCoherenceLibrary() {
            return this._builder.getEnableCoherenceLibrary();
        }

        public final boolean getEnableDataLibraryRequestAttributes() {
            return this._builder.getEnableDataLibraryRequestAttributes();
        }

        public final boolean getEnableDataLibraryTokenAttributes() {
            return this._builder.getEnableDataLibraryTokenAttributes();
        }

        public final boolean getEnableDataLibraryWasmData() {
            return this._builder.getEnableDataLibraryWasmData();
        }

        public final boolean getEnableWebViewProbe() {
            return this._builder.getEnableWebViewProbe();
        }

        public final boolean getEnsureCacheFolderExistences() {
            return this._builder.getEnsureCacheFolderExistences();
        }

        public final NativeConfigurationOuterClass.FullscreenNavBarMode getFullscreenNavBarMode() {
            NativeConfigurationOuterClass.FullscreenNavBarMode fullscreenNavBarMode = this._builder.getFullscreenNavBarMode();
            fullscreenNavBarMode.getClass();
            return fullscreenNavBarMode;
        }

        public final int getFullscreenNavBarModeValue() {
            return this._builder.getFullscreenNavBarModeValue();
        }

        public final boolean getMeasureBridgePerformance() {
            return this._builder.getMeasureBridgePerformance();
        }

        public final NativeConfigurationOuterClass.NativeStartMode getNativeStartMode() {
            NativeConfigurationOuterClass.NativeStartMode nativeStartMode = this._builder.getNativeStartMode();
            nativeStartMode.getClass();
            return nativeStartMode;
        }

        public final int getNativeStartModeValue() {
            return this._builder.getNativeStartModeValue();
        }

        public final boolean getOpenglGpuEnabled() {
            return this._builder.getOpenglGpuEnabled();
        }

        public final boolean getOpportunityIdPlacementValidation() {
            return this._builder.getOpportunityIdPlacementValidation();
        }

        public final NativeConfigurationOuterClass.PreShowWebViewStrategy getPreShowWebviewStrategy() {
            NativeConfigurationOuterClass.PreShowWebViewStrategy preShowWebviewStrategy = this._builder.getPreShowWebviewStrategy();
            preShowWebviewStrategy.getClass();
            return preShowWebviewStrategy;
        }

        public final int getPreShowWebviewStrategyValue() {
            return this._builder.getPreShowWebviewStrategyValue();
        }

        public final boolean getRecoverFullscreenDisplayEnabled() {
            return this._builder.getRecoverFullscreenDisplayEnabled();
        }

        public final int getRecoverFullscreenDisplayMaxBackgroundAgeMs() {
            return this._builder.getRecoverFullscreenDisplayMaxBackgroundAgeMs();
        }

        public final boolean getRecoverTerminatedWebviews() {
            return this._builder.getRecoverTerminatedWebviews();
        }

        public final boolean getRetryShowWithCurrentActivity() {
            return this._builder.getRetryShowWithCurrentActivity();
        }

        public final boolean getShouldAllowFetchToAccessCache() {
            return this._builder.getShouldAllowFetchToAccessCache();
        }

        public final boolean getShouldHandleWebviewCaching() {
            return this._builder.getShouldHandleWebviewCaching();
        }

        public final boolean getShouldInitAdqWithGameId() {
            return this._builder.getShouldInitAdqWithGameId();
        }

        public final boolean getShouldSendIapHistory() {
            return this._builder.getShouldSendIapHistory();
        }

        public final boolean getUseCurrentActivityForShow() {
            return this._builder.getUseCurrentActivityForShow();
        }

        public final boolean getUseFilesDir() {
            return this._builder.getUseFilesDir();
        }

        public final boolean getUseOptimisticWebviewCache() {
            return this._builder.getUseOptimisticWebviewCache();
        }

        public final boolean getUseTryCatchInDownloadQueue() {
            return this._builder.getUseTryCatchInDownloadQueue();
        }

        public final boolean getWebviewLessLoadParallelActivityLaunch() {
            return this._builder.getWebviewLessLoadParallelActivityLaunch();
        }

        public final int getWebviewPoolSize() {
            return this._builder.getWebviewPoolSize();
        }

        public final void setAppSheetBugCheckEnabled(boolean z) {
            this._builder.setAppSheetBugCheckEnabled(z);
        }

        public final void setBoldSdkNextSessionEnabled(boolean z) {
            this._builder.setBoldSdkNextSessionEnabled(z);
        }

        public final void setCollectAccelerometer(boolean z) {
            this._builder.setCollectAccelerometer(z);
        }

        public final void setCollectGoogleAppId(boolean z) {
            this._builder.setCollectGoogleAppId(z);
        }

        public final void setCollectIlrData(boolean z) {
            this._builder.setCollectIlrData(z);
        }

        public final void setCollectLifecycleEvents(boolean z) {
            this._builder.setCollectLifecycleEvents(z);
        }

        public final void setDisableCustomScheme(boolean z) {
            this._builder.setDisableCustomScheme(z);
        }

        public final void setDisableGridCollection(boolean z) {
            this._builder.setDisableGridCollection(z);
        }

        public final void setEnableCoherenceLibrary(boolean z) {
            this._builder.setEnableCoherenceLibrary(z);
        }

        public final void setEnableDataLibraryRequestAttributes(boolean z) {
            this._builder.setEnableDataLibraryRequestAttributes(z);
        }

        public final void setEnableDataLibraryTokenAttributes(boolean z) {
            this._builder.setEnableDataLibraryTokenAttributes(z);
        }

        public final void setEnableDataLibraryWasmData(boolean z) {
            this._builder.setEnableDataLibraryWasmData(z);
        }

        public final void setEnableWebViewProbe(boolean z) {
            this._builder.setEnableWebViewProbe(z);
        }

        public final void setEnsureCacheFolderExistences(boolean z) {
            this._builder.setEnsureCacheFolderExistences(z);
        }

        public final void setFullscreenNavBarMode(NativeConfigurationOuterClass.FullscreenNavBarMode fullscreenNavBarMode) {
            fullscreenNavBarMode.getClass();
            this._builder.setFullscreenNavBarMode(fullscreenNavBarMode);
        }

        public final void setFullscreenNavBarModeValue(int i) {
            this._builder.setFullscreenNavBarModeValue(i);
        }

        public final void setMeasureBridgePerformance(boolean z) {
            this._builder.setMeasureBridgePerformance(z);
        }

        public final void setNativeStartMode(NativeConfigurationOuterClass.NativeStartMode nativeStartMode) {
            nativeStartMode.getClass();
            this._builder.setNativeStartMode(nativeStartMode);
        }

        public final void setNativeStartModeValue(int i) {
            this._builder.setNativeStartModeValue(i);
        }

        public final void setOpenglGpuEnabled(boolean z) {
            this._builder.setOpenglGpuEnabled(z);
        }

        public final void setOpportunityIdPlacementValidation(boolean z) {
            this._builder.setOpportunityIdPlacementValidation(z);
        }

        public final void setPreShowWebviewStrategy(NativeConfigurationOuterClass.PreShowWebViewStrategy preShowWebViewStrategy) {
            preShowWebViewStrategy.getClass();
            this._builder.setPreShowWebviewStrategy(preShowWebViewStrategy);
        }

        public final void setPreShowWebviewStrategyValue(int i) {
            this._builder.setPreShowWebviewStrategyValue(i);
        }

        public final void setRecoverFullscreenDisplayEnabled(boolean z) {
            this._builder.setRecoverFullscreenDisplayEnabled(z);
        }

        public final void setRecoverFullscreenDisplayMaxBackgroundAgeMs(int i) {
            this._builder.setRecoverFullscreenDisplayMaxBackgroundAgeMs(i);
        }

        public final void setRecoverTerminatedWebviews(boolean z) {
            this._builder.setRecoverTerminatedWebviews(z);
        }

        public final void setRetryShowWithCurrentActivity(boolean z) {
            this._builder.setRetryShowWithCurrentActivity(z);
        }

        public final void setShouldAllowFetchToAccessCache(boolean z) {
            this._builder.setShouldAllowFetchToAccessCache(z);
        }

        public final void setShouldHandleWebviewCaching(boolean z) {
            this._builder.setShouldHandleWebviewCaching(z);
        }

        public final void setShouldInitAdqWithGameId(boolean z) {
            this._builder.setShouldInitAdqWithGameId(z);
        }

        public final void setShouldSendIapHistory(boolean z) {
            this._builder.setShouldSendIapHistory(z);
        }

        public final void setUseCurrentActivityForShow(boolean z) {
            this._builder.setUseCurrentActivityForShow(z);
        }

        public final void setUseFilesDir(boolean z) {
            this._builder.setUseFilesDir(z);
        }

        public final void setUseOptimisticWebviewCache(boolean z) {
            this._builder.setUseOptimisticWebviewCache(z);
        }

        public final void setUseTryCatchInDownloadQueue(boolean z) {
            this._builder.setUseTryCatchInDownloadQueue(z);
        }

        public final void setWebviewLessLoadParallelActivityLaunch(boolean z) {
            this._builder.setWebviewLessLoadParallelActivityLaunch(z);
        }

        public final void setWebviewPoolSize(int i) {
            this._builder.setWebviewPoolSize(i);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
