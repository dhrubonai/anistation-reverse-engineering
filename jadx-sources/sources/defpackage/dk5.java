package defpackage;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.ads.core.domain.IsCronetFallbackAvailable;
import com.unity3d.ads.core.domain.MediationProviderParser;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.events.GetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dk5 implements sb2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ dk5(byte b) {
        this.x = b;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        HandleDebugSettings initialize$lambda$246$lambda$240;
        IsBillingClientAvailable initialize$lambda$246$lambda$242;
        GetSafeguardedInitializationPolicy initialize$lambda$246$lambda$244;
        CronetEngineBuilderFactory initialize$lambda$246$lambda$33;
        IsCronetFallbackAvailable initialize$lambda$246$lambda$34;
        TcfDataSource initialize$lambda$246$lambda$39;
        AnalyticsDataSource initialize$lambda$246$lambda$46;
        LifecycleDataSource initialize$lambda$246$lambda$50;
        CreateFile initialize$lambda$246$lambda$55;
        RemoveUrlQuery initialize$lambda$246$lambda$57;
        Context initialize$lambda$246$lambda$236$lambda$235;
        OmidManager initialize$lambda$246$lambda$65;
        SDKPropertiesManager initialize$lambda$246$lambda$66;
        StorageManager initialize$lambda$246$lambda$67;
        AdRepository initialize$lambda$246$lambda$75;
        GetCacheDirectory initialize$lambda$246$lambda$77;
        GetAssetFileName initialize$lambda$246$lambda$78;
        MediationProviderParser initialize$lambda$246$lambda$84;
        TransactionEventRepository initialize$lambda$246$lambda$89;
        AdRevenueRepository initialize$lambda$246$lambda$90;
        OperativeEventRepository initialize$lambda$246$lambda$91;
        GetByteStringId initialize$lambda$246$lambda$93;
        IntentCreation initialize$lambda$246$lambda$96;
        Context initialize$lambda$246$lambda$0;
        GetAdRevenueEventData initialize$lambda$246$lambda$155;
        GetDiagnosticEventBatchRequest initialize$lambda$246$lambda$157;
        HandleGatewayEventResponse initialize$lambda$246$lambda$161;
        UniversalRequestTtlValidator initialize$lambda$246$lambda$170;
        FlattenerRulesUseCase initialize$lambda$246$lambda$182;
        FlattenerRulesUseCase initialize$lambda$246$lambda$183;
        switch (this.x) {
            case 0:
                initialize$lambda$246$lambda$240 = ServiceProvider.initialize$lambda$246$lambda$240();
                return initialize$lambda$246$lambda$240;
            case 1:
                initialize$lambda$246$lambda$242 = ServiceProvider.initialize$lambda$246$lambda$242();
                return initialize$lambda$246$lambda$242;
            case 2:
                initialize$lambda$246$lambda$244 = ServiceProvider.initialize$lambda$246$lambda$244();
                return initialize$lambda$246$lambda$244;
            case 3:
                initialize$lambda$246$lambda$33 = ServiceProvider.initialize$lambda$246$lambda$33();
                return initialize$lambda$246$lambda$33;
            case 4:
                initialize$lambda$246$lambda$34 = ServiceProvider.initialize$lambda$246$lambda$34();
                return initialize$lambda$246$lambda$34;
            case 5:
                initialize$lambda$246$lambda$39 = ServiceProvider.initialize$lambda$246$lambda$39();
                return initialize$lambda$246$lambda$39;
            case 6:
                initialize$lambda$246$lambda$46 = ServiceProvider.initialize$lambda$246$lambda$46();
                return initialize$lambda$246$lambda$46;
            case 7:
                initialize$lambda$246$lambda$50 = ServiceProvider.initialize$lambda$246$lambda$50();
                return initialize$lambda$246$lambda$50;
            case 8:
                initialize$lambda$246$lambda$55 = ServiceProvider.initialize$lambda$246$lambda$55();
                return initialize$lambda$246$lambda$55;
            case 9:
                initialize$lambda$246$lambda$57 = ServiceProvider.initialize$lambda$246$lambda$57();
                return initialize$lambda$246$lambda$57;
            case 10:
                initialize$lambda$246$lambda$236$lambda$235 = ServiceProvider.initialize$lambda$246$lambda$236$lambda$235();
                return initialize$lambda$246$lambda$236$lambda$235;
            case 11:
                initialize$lambda$246$lambda$65 = ServiceProvider.initialize$lambda$246$lambda$65();
                return initialize$lambda$246$lambda$65;
            case 12:
                initialize$lambda$246$lambda$66 = ServiceProvider.initialize$lambda$246$lambda$66();
                return initialize$lambda$246$lambda$66;
            case 13:
                initialize$lambda$246$lambda$67 = ServiceProvider.initialize$lambda$246$lambda$67();
                return initialize$lambda$246$lambda$67;
            case 14:
                initialize$lambda$246$lambda$75 = ServiceProvider.initialize$lambda$246$lambda$75();
                return initialize$lambda$246$lambda$75;
            case 15:
                initialize$lambda$246$lambda$77 = ServiceProvider.initialize$lambda$246$lambda$77();
                return initialize$lambda$246$lambda$77;
            case 16:
                initialize$lambda$246$lambda$78 = ServiceProvider.initialize$lambda$246$lambda$78();
                return initialize$lambda$246$lambda$78;
            case 17:
                initialize$lambda$246$lambda$84 = ServiceProvider.initialize$lambda$246$lambda$84();
                return initialize$lambda$246$lambda$84;
            case 18:
                initialize$lambda$246$lambda$89 = ServiceProvider.initialize$lambda$246$lambda$89();
                return initialize$lambda$246$lambda$89;
            case 19:
                initialize$lambda$246$lambda$90 = ServiceProvider.initialize$lambda$246$lambda$90();
                return initialize$lambda$246$lambda$90;
            case 20:
                initialize$lambda$246$lambda$91 = ServiceProvider.initialize$lambda$246$lambda$91();
                return initialize$lambda$246$lambda$91;
            case 21:
                initialize$lambda$246$lambda$93 = ServiceProvider.initialize$lambda$246$lambda$93();
                return initialize$lambda$246$lambda$93;
            case 22:
                initialize$lambda$246$lambda$96 = ServiceProvider.initialize$lambda$246$lambda$96();
                return initialize$lambda$246$lambda$96;
            case 23:
                initialize$lambda$246$lambda$0 = ServiceProvider.initialize$lambda$246$lambda$0();
                return initialize$lambda$246$lambda$0;
            case 24:
                initialize$lambda$246$lambda$155 = ServiceProvider.initialize$lambda$246$lambda$155();
                return initialize$lambda$246$lambda$155;
            case 25:
                initialize$lambda$246$lambda$157 = ServiceProvider.initialize$lambda$246$lambda$157();
                return initialize$lambda$246$lambda$157;
            case 26:
                initialize$lambda$246$lambda$161 = ServiceProvider.initialize$lambda$246$lambda$161();
                return initialize$lambda$246$lambda$161;
            case 27:
                initialize$lambda$246$lambda$170 = ServiceProvider.initialize$lambda$246$lambda$170();
                return initialize$lambda$246$lambda$170;
            case 28:
                initialize$lambda$246$lambda$182 = ServiceProvider.initialize$lambda$246$lambda$182();
                return initialize$lambda$246$lambda$182;
            default:
                initialize$lambda$246$lambda$183 = ServiceProvider.initialize$lambda$246$lambda$183();
                return initialize$lambda$246$lambda$183;
        }
    }
}
