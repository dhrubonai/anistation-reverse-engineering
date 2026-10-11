package com.unity3d.services.core.di;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.db;
import defpackage.h43;
import defpackage.h98;
import defpackage.i41;
import defpackage.iv5;
import defpackage.j43;
import defpackage.j91;
import defpackage.ja1;
import defpackage.n11;
import defpackage.nn5;
import defpackage.p11;
import defpackage.p7;
import defpackage.pn6;
import defpackage.pp5;
import defpackage.qm3;
import defpackage.r11;
import defpackage.rg;
import defpackage.rh1;
import defpackage.te4;
import defpackage.v11;
import defpackage.w41;
import defpackage.ze0;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class UnityAdsModule {
    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        newBuilder.getClass();
        AdOperationsConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setLoadTimeoutMs(30000);
        _create.setShowTimeoutMs(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        _create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        newBuilder.getClass();
        RequestPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setRetryPolicy(getDefaultRequestRetryPolicy());
        _create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        newBuilder.getClass();
        RequestRetryPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        _create.setRetryWaitBase(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        _create.setRetryJitterPct(0.1f);
        _create.setShouldStoreLocally(false);
        _create.setRetryMaxInterval(UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL);
        _create.setRetryScalingFactor(2.0f);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        newBuilder.getClass();
        RequestTimeoutPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setConnectTimeoutMs(30000);
        _create.setReadTimeoutMs(30000);
        _create.setWriteTimeoutMs(30000);
        _create.setOverallTimeoutMs(30000);
        return _create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(w41 w41Var) {
        return new AndroidByteStringDataSource(w41Var);
    }

    private final w41 provideByteStringDataStore(Context context, n11 n11Var, String str) {
        return p7.a(new ByteStringSerializer(), null, null, db.b(n11Var.plus(iv5.a())), new nn5(context, str, (byte) 1), 4);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (StorageManager.init(ClientProperties.getApplicationContext())) {
            Storage storage = StorageManager.getStorage(storageType);
            storage.getClass();
            return storage;
        }
        ze0.m("StorageManager failed to initialize");
        return null;
    }

    public static final pn6 publicApiJob$lambda$1$lambda$0(DiagnosticEventRepository diagnosticEventRepository, Throwable th) {
        try {
            diagnosticEventRepository.flush();
        } catch (Throwable th2) {
            DeviceLog.error("Failed to flush diagnostic events", th2);
        }
        return pn6.a;
    }

    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        applicationContext.getClass();
        return applicationContext;
    }

    public final ByteStringDataSource auidDataStore(w41 w41Var) {
        w41Var.getClass();
        return provideByteStringDataSource(w41Var);
    }

    public final v11 coherenceCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getIo()).plus(new r11(ServiceProvider.NAMED_COHERENCE_SCOPE)).plus(p11Var));
    }

    public final n11 defaultDispatcher() {
        return rh1.a;
    }

    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        newBuilder.getClass();
        NativeConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setAdOperations(getDefaultAdOperations());
        _create.setInitPolicy(getDefaultRequestPolicy());
        _create.setAdPolicy(getDefaultRequestPolicy());
        _create.setOtherPolicy(getDefaultRequestPolicy());
        _create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        newBuilder2.getClass();
        DiagnosticEventsConfigurationKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setEnabled(true);
        _create2.setMaxBatchSize(10);
        _create2.setMaxBatchIntervalMs(30000);
        _create2.setTtmEnabled(false);
        _create.setDiagnosticEvents(_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        newBuilder3.getClass();
        FeatureFlagsKt.Dsl _create3 = companion3._create(newBuilder3);
        _create3.setBoldSdkNextSessionEnabled(true);
        _create.setFeatureFlags(_create3._build());
        _create.setMaxExtrasSizeKb(4);
        return _create._build();
    }

    public final ByteStringDataSource gatewayCacheDataStore(w41 w41Var) {
        w41Var.getClass();
        return provideByteStringDataSource(w41Var);
    }

    public final w41 gatewayDataStore(Context context, n11 n11Var) {
        context.getClass();
        n11Var.getClass();
        return provideByteStringDataStore(context, n11Var, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final v11 getTokenCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getDefault()).plus(new r11(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(p11Var));
    }

    public final w41 glInfoDataStore(Context context, n11 n11Var, i41 i41Var) {
        context.getClass();
        n11Var.getClass();
        i41Var.getClass();
        return p7.a(new ByteStringSerializer(), null, te4.H(i41Var), db.b(n11Var.plus(iv5.a())), new rg(context, (byte) 3), 2);
    }

    public final w41 iapTransactionDataStore(Context context, n11 n11Var) {
        context.getClass();
        n11Var.getClass();
        return provideByteStringDataStore(context, n11Var, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final ByteStringDataSource idfiDataStore(w41 w41Var) {
        w41Var.getClass();
        return provideByteStringDataSource(w41Var);
    }

    public final v11 ilrdCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getDefault()).plus(new r11(ServiceProvider.NAMED_ILRD_SCOPE)).plus(p11Var));
    }

    public final v11 initCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getDefault()).plus(new r11(ServiceProvider.NAMED_INIT_SCOPE)).plus(p11Var));
    }

    public final n11 ioDispatcher() {
        ja1 ja1Var = rh1.a;
        return j91.y;
    }

    public final v11 lifecycleCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getDefault()).plus(new r11(ServiceProvider.NAMED_LIFECYCLE_SCOPE)).plus(p11Var));
    }

    public final v11 loadCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getDefault()).plus(new r11(ServiceProvider.NAMED_LOAD_SCOPE)).plus(p11Var));
    }

    public final n11 mainDispatcher() {
        ja1 ja1Var = rh1.a;
        return qm3.a;
    }

    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    public final w41 nativeConfigurationDataStore(Context context, n11 n11Var) {
        context.getClass();
        n11Var.getClass();
        return provideByteStringDataStore(context, n11Var, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final v11 offerwallSignalsCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getDefault()).plus(new r11(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(p11Var));
    }

    public final v11 omidCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getDefault()).plus(new r11(ServiceProvider.NAMED_OMID_SCOPE)).plus(p11Var));
    }

    public final w41 privacyDataStore(Context context, n11 n11Var) {
        context.getClass();
        n11Var.getClass();
        return provideByteStringDataStore(context, n11Var, ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final w41 privacyFsmDataStore(Context context, n11 n11Var) {
        context.getClass();
        n11Var.getClass();
        return provideByteStringDataStore(context, n11Var, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final h43 publicApiJob(DiagnosticEventRepository diagnosticEventRepository) {
        diagnosticEventRepository.getClass();
        j43 e = h98.e();
        e.l0(new pp5(diagnosticEventRepository, (byte) 15));
        return e;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final v11 showCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getDefault()).plus(new r11(ServiceProvider.NAMED_SHOW_SCOPE)).plus(p11Var));
    }

    public final v11 transactionCoroutineScope(ISDKDispatchers iSDKDispatchers, p11 p11Var, h43 h43Var) {
        iSDKDispatchers.getClass();
        p11Var.getClass();
        h43Var.getClass();
        return db.b(h43Var.plus(iSDKDispatchers.getDefault()).plus(new r11(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(p11Var));
    }

    public final w41 webViewConfigurationDataStore(Context context, n11 n11Var) {
        context.getClass();
        n11Var.getClass();
        return p7.a(new WebViewConfigurationStoreSerializer(), null, null, db.b(n11Var.plus(iv5.a())), new rg(context, (byte) 4), 4);
    }

    public final ByteStringDataSource iapTransactionDataStore(w41 w41Var) {
        w41Var.getClass();
        return provideByteStringDataSource(w41Var);
    }

    public final ByteStringDataSource nativeConfigurationDataStore(w41 w41Var) {
        w41Var.getClass();
        return provideByteStringDataSource(w41Var);
    }

    public final ByteStringDataSource privacyDataStore(w41 w41Var) {
        w41Var.getClass();
        return provideByteStringDataSource(w41Var);
    }

    public final ByteStringDataSource privacyFsmDataStore(w41 w41Var) {
        w41Var.getClass();
        return provideByteStringDataSource(w41Var);
    }

    public final ByteStringDataSource glInfoDataStore(w41 w41Var) {
        w41Var.getClass();
        return provideByteStringDataSource(w41Var);
    }
}
