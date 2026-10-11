package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import defpackage.q71;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class NativeConfigurationKt {
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    private NativeConfigurationKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class MonitoringIdsProxy extends DslProxy {
            private MonitoringIdsProxy() {
            }
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
            private ObservableAndroidActivitiesProxy() {
            }
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class ObservableViewControllersProxy extends DslProxy {
            private ObservableViewControllersProxy() {
            }
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            NativeConfigurationOuterClass.NativeConfiguration build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAdditionalStorePackages(DslList dslList, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.addAdditionalStorePackages(str);
        }

        public final /* synthetic */ void addAllAdditionalStorePackages(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllAdditionalStorePackages(iterable);
        }

        public final /* synthetic */ void addAllMonitoringIds(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllMonitoringIds(iterable);
        }

        public final /* synthetic */ void addAllObservableAndroidActivities(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllObservableAndroidActivities(iterable);
        }

        public final /* synthetic */ void addAllObservableViewControllers(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllObservableViewControllers(iterable);
        }

        public final /* synthetic */ void addMonitoringIds(DslList dslList, int i) {
            dslList.getClass();
            this._builder.addMonitoringIds(i);
        }

        public final /* synthetic */ void addObservableAndroidActivities(DslList dslList, ByteString byteString) {
            dslList.getClass();
            byteString.getClass();
            this._builder.addObservableAndroidActivities(byteString);
        }

        public final /* synthetic */ void addObservableViewControllers(DslList dslList, ByteString byteString) {
            dslList.getClass();
            byteString.getClass();
            this._builder.addObservableViewControllers(byteString);
        }

        public final void clearAccelerometerCollection() {
            this._builder.clearAccelerometerCollection();
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            dslList.getClass();
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final void clearCachedWebviewFilesConfiguration() {
            this._builder.clearCachedWebviewFilesConfiguration();
        }

        public final void clearDataLibraryWasmModule() {
            this._builder.clearDataLibraryWasmModule();
        }

        public final void clearDebugSettings() {
            this._builder.clearDebugSettings();
        }

        public final void clearDefaultShowCompletionState() {
            this._builder.clearDefaultShowCompletionState();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearDownloadPolicy() {
            this._builder.clearDownloadPolicy();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final void clearLevelPlayAppKey() {
            this._builder.clearLevelPlayAppKey();
        }

        public final void clearMaxExtrasSizeKb() {
            this._builder.clearMaxExtrasSizeKb();
        }

        public final void clearMaxReceiptSizeMb() {
            this._builder.clearMaxReceiptSizeMb();
        }

        public final /* synthetic */ void clearMonitoringIds(DslList dslList) {
            dslList.getClass();
            this._builder.clearMonitoringIds();
        }

        public final /* synthetic */ void clearObservableAndroidActivities(DslList dslList) {
            dslList.getClass();
            this._builder.clearObservableAndroidActivities();
        }

        public final /* synthetic */ void clearObservableViewControllers(DslList dslList) {
            dslList.getClass();
            this._builder.clearObservableViewControllers();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOptimisticInitDelayMs() {
            this._builder.clearOptimisticInitDelayMs();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final void clearOverwriteIntentFlagActivity() {
            this._builder.clearOverwriteIntentFlagActivity();
        }

        public final NativeConfigurationOuterClass.AccelerometerCollectionConfiguration getAccelerometerCollection() {
            NativeConfigurationOuterClass.AccelerometerCollectionConfiguration accelerometerCollection = this._builder.getAccelerometerCollection();
            accelerometerCollection.getClass();
            return accelerometerCollection;
        }

        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            adOperations.getClass();
            return adOperations;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            adPolicy.getClass();
            return adPolicy;
        }

        public final DslList<String, AdditionalStorePackagesProxy> getAdditionalStorePackages() {
            List<String> additionalStorePackagesList = this._builder.getAdditionalStorePackagesList();
            additionalStorePackagesList.getClass();
            return new DslList<>(additionalStorePackagesList);
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this._builder.getCachedAssetsConfiguration();
            cachedAssetsConfiguration.getClass();
            return cachedAssetsConfiguration;
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = this._builder.getCachedWebviewFilesConfiguration();
            cachedWebviewFilesConfiguration.getClass();
            return cachedWebviewFilesConfiguration;
        }

        public final ByteString getDataLibraryWasmModule() {
            ByteString dataLibraryWasmModule = this._builder.getDataLibraryWasmModule();
            dataLibraryWasmModule.getClass();
            return dataLibraryWasmModule;
        }

        public final NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            NativeConfigurationOuterClass.DebugSettings debugSettings = this._builder.getDebugSettings();
            debugSettings.getClass();
            return debugSettings;
        }

        public final NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this._builder.getDefaultShowCompletionState();
            defaultShowCompletionState.getClass();
            return defaultShowCompletionState;
        }

        public final int getDefaultShowCompletionStateValue() {
            return this._builder.getDefaultShowCompletionStateValue();
        }

        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            diagnosticEvents.getClass();
            return diagnosticEvents;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            NativeConfigurationOuterClass.RequestPolicy downloadPolicy = this._builder.getDownloadPolicy();
            downloadPolicy.getClass();
            return downloadPolicy;
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            featureFlags.getClass();
            return featureFlags;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            initPolicy.getClass();
            return initPolicy;
        }

        public final String getLevelPlayAppKey() {
            String levelPlayAppKey = this._builder.getLevelPlayAppKey();
            levelPlayAppKey.getClass();
            return levelPlayAppKey;
        }

        public final int getMaxExtrasSizeKb() {
            return this._builder.getMaxExtrasSizeKb();
        }

        public final int getMaxReceiptSizeMb() {
            return this._builder.getMaxReceiptSizeMb();
        }

        public final /* synthetic */ DslList getMonitoringIds() {
            List<Integer> monitoringIdsList = this._builder.getMonitoringIdsList();
            monitoringIdsList.getClass();
            return new DslList(monitoringIdsList);
        }

        public final /* synthetic */ DslList getObservableAndroidActivities() {
            List<ByteString> observableAndroidActivitiesList = this._builder.getObservableAndroidActivitiesList();
            observableAndroidActivitiesList.getClass();
            return new DslList(observableAndroidActivitiesList);
        }

        public final /* synthetic */ DslList getObservableViewControllers() {
            List<ByteString> observableViewControllersList = this._builder.getObservableViewControllersList();
            observableViewControllersList.getClass();
            return new DslList(observableViewControllersList);
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            operativeEventPolicy.getClass();
            return operativeEventPolicy;
        }

        public final int getOptimisticInitDelayMs() {
            return this._builder.getOptimisticInitDelayMs();
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            otherPolicy.getClass();
            return otherPolicy;
        }

        public final int getOverwriteIntentFlagActivity() {
            return this._builder.getOverwriteIntentFlagActivity();
        }

        public final boolean hasAccelerometerCollection() {
            return this._builder.hasAccelerometerCollection();
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        public final boolean hasCachedWebviewFilesConfiguration() {
            return this._builder.hasCachedWebviewFilesConfiguration();
        }

        public final boolean hasDataLibraryWasmModule() {
            return this._builder.hasDataLibraryWasmModule();
        }

        public final boolean hasDebugSettings() {
            return this._builder.hasDebugSettings();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasDownloadPolicy() {
            return this._builder.hasDownloadPolicy();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasLevelPlayAppKey() {
            return this._builder.hasLevelPlayAppKey();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOptimisticInitDelayMs() {
            return this._builder.hasOptimisticInitDelayMs();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, String str) {
            dslList.getClass();
            str.getClass();
            addAdditionalStorePackages(dslList, str);
        }

        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, Iterable<String> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllAdditionalStorePackages(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllMonitoringIds(DslList<Integer, MonitoringIdsProxy> dslList, Iterable<Integer> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllMonitoringIds(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, Iterable<? extends ByteString> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllObservableAndroidActivities(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllObservableViewControllers(DslList<ByteString, ObservableViewControllersProxy> dslList, Iterable<? extends ByteString> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllObservableViewControllers(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignMonitoringIds(DslList<Integer, MonitoringIdsProxy> dslList, int i) {
            dslList.getClass();
            addMonitoringIds(dslList, i);
        }

        public final /* synthetic */ void plusAssignObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, ByteString byteString) {
            dslList.getClass();
            byteString.getClass();
            addObservableAndroidActivities(dslList, byteString);
        }

        public final /* synthetic */ void plusAssignObservableViewControllers(DslList<ByteString, ObservableViewControllersProxy> dslList, ByteString byteString) {
            dslList.getClass();
            byteString.getClass();
            addObservableViewControllers(dslList, byteString);
        }

        public final void setAccelerometerCollection(NativeConfigurationOuterClass.AccelerometerCollectionConfiguration accelerometerCollectionConfiguration) {
            accelerometerCollectionConfiguration.getClass();
            this._builder.setAccelerometerCollection(accelerometerCollectionConfiguration);
        }

        public final void setAdOperations(NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.getClass();
            this._builder.setAdOperations(adOperationsConfiguration);
        }

        public final void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this._builder.setAdPolicy(requestPolicy);
        }

        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.setAdditionalStorePackages(i, str);
        }

        public final void setCachedAssetsConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            this._builder.setCachedAssetsConfiguration(cachedAssetsConfiguration);
        }

        public final void setCachedWebviewFilesConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            this._builder.setCachedWebviewFilesConfiguration(cachedAssetsConfiguration);
        }

        public final void setDataLibraryWasmModule(ByteString byteString) {
            byteString.getClass();
            this._builder.setDataLibraryWasmModule(byteString);
        }

        public final void setDebugSettings(NativeConfigurationOuterClass.DebugSettings debugSettings) {
            debugSettings.getClass();
            this._builder.setDebugSettings(debugSettings);
        }

        public final void setDefaultShowCompletionState(NativeConfigurationOuterClass.ShowCompletionState showCompletionState) {
            showCompletionState.getClass();
            this._builder.setDefaultShowCompletionState(showCompletionState);
        }

        public final void setDefaultShowCompletionStateValue(int i) {
            this._builder.setDefaultShowCompletionStateValue(i);
        }

        public final void setDiagnosticEvents(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.getClass();
            this._builder.setDiagnosticEvents(diagnosticEventsConfiguration);
        }

        public final void setDownloadPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this._builder.setDownloadPolicy(requestPolicy);
        }

        public final void setEnableIapEvent(boolean z) {
            this._builder.setEnableIapEvent(z);
        }

        public final void setEnableOm(boolean z) {
            this._builder.setEnableOm(z);
        }

        public final void setFeatureFlags(NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            featureFlags.getClass();
            this._builder.setFeatureFlags(featureFlags);
        }

        public final void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this._builder.setInitPolicy(requestPolicy);
        }

        public final void setLevelPlayAppKey(String str) {
            str.getClass();
            this._builder.setLevelPlayAppKey(str);
        }

        public final void setMaxExtrasSizeKb(int i) {
            this._builder.setMaxExtrasSizeKb(i);
        }

        public final void setMaxReceiptSizeMb(int i) {
            this._builder.setMaxReceiptSizeMb(i);
        }

        public final /* synthetic */ void setMonitoringIds(DslList dslList, int i, int i2) {
            dslList.getClass();
            this._builder.setMonitoringIds(i, i2);
        }

        public final /* synthetic */ void setObservableAndroidActivities(DslList dslList, int i, ByteString byteString) {
            dslList.getClass();
            byteString.getClass();
            this._builder.setObservableAndroidActivities(i, byteString);
        }

        public final /* synthetic */ void setObservableViewControllers(DslList dslList, int i, ByteString byteString) {
            dslList.getClass();
            byteString.getClass();
            this._builder.setObservableViewControllers(i, byteString);
        }

        public final void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this._builder.setOperativeEventPolicy(requestPolicy);
        }

        public final void setOptimisticInitDelayMs(int i) {
            this._builder.setOptimisticInitDelayMs(i);
        }

        public final void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this._builder.setOtherPolicy(requestPolicy);
        }

        public final void setOverwriteIntentFlagActivity(int i) {
            this._builder.setOverwriteIntentFlagActivity(i);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
