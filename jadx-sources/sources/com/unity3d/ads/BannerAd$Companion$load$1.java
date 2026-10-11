package com.unity3d.ads;

import android.content.Context;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.z05;
import defpackage.ze0;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.BannerAd$Companion$load$1", f = "BannerAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BannerAd$Companion$load$1 extends t36 implements ic2 {
    final /* synthetic */ BannerConfiguration $configuration;
    final /* synthetic */ LoadListener<BannerAd> $listener;
    int label;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.unity3d.ads.BannerAd$Companion$load$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 implements BannerView.IListener, BannerShowListenerWithOnFailedToShow {
        final /* synthetic */ AtomicReference<BannerAd> $bannerAdRef;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ BannerConfiguration $configuration;
        final /* synthetic */ LoadListener<BannerAd> $listener;
        final /* synthetic */ UUID $opportunityId;

        public AnonymousClass2(UUID uuid, LoadListener<BannerAd> loadListener, BannerConfiguration bannerConfiguration, BannerView bannerView, AtomicReference<BannerAd> atomicReference) {
            this.$opportunityId = uuid;
            this.$listener = loadListener;
            this.$configuration = bannerConfiguration;
            this.$bannerView = bannerView;
            this.$bannerAdRef = atomicReference;
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
            bannerView.getClass();
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                this.$configuration.getListener().onClicked(bannerAd);
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            bannerView.getClass();
            bannerErrorInfo.getClass();
            LoadListener<BannerAd> loadListener = this.$listener;
            int i = bannerErrorInfo.publicErrorCode;
            String str = bannerErrorInfo.errorMessage;
            if (str == null) {
                str = "Failed to load banner ad for placement: " + bannerView.getPlacementId() + '.';
            }
            loadListener.onAdLoaded(null, new UnityAdsError(i, str));
        }

        @Override // com.unity3d.ads.BannerShowListenerWithOnFailedToShow
        public void onBannerFailedToShow(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            bannerView.getClass();
            bannerErrorInfo.getClass();
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                BannerShowListener listener = this.$configuration.getListener();
                int i = bannerErrorInfo.publicErrorCode;
                String str = bannerErrorInfo.errorMessage;
                str.getClass();
                listener.onFailedToShow(bannerAd, new UnityAdsError(i, str));
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerView) {
            bannerView.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
            bannerView.getClass();
            ServiceProvider serviceProvider = ServiceProvider.INSTANCE;
            int i = 1;
            AdRepository adRepository = (AdRepository) serviceProvider.getRegistry().resolveService(new ServiceKey(null, z05.a(AdRepository.class), i, 0 == true ? 1 : 0));
            SafeCallbackInvoke safeCallbackInvoke = (SafeCallbackInvoke) serviceProvider.getRegistry().resolveService(new ServiceKey(0 == true ? 1 : 0, z05.a(SafeCallbackInvoke.class), i, 0 == true ? 1 : 0));
            UUID uuid = this.$opportunityId;
            uuid.getClass();
            AdObject ad = adRepository.getAd(ProtobufExtensionsKt.toByteString(uuid));
            if (ad == null) {
                this.$listener.onAdLoaded(null, new UnityAdsError(0, "Failed to load banner ad for placement: " + this.$configuration.getPlacementId()));
                return;
            }
            BannerAd bannerAd = new BannerAd(ad, this.$bannerView, safeCallbackInvoke);
            this.$bannerAdRef.set(bannerAd);
            this.$listener.onAdLoaded(bannerAd, null);
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(BannerView bannerView) {
            bannerView.getClass();
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                this.$configuration.getListener().onImpression(bannerAd);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAd$Companion$load$1(LoadListener<BannerAd> loadListener, BannerConfiguration bannerConfiguration, vz0 vz0Var) {
        super(2, vz0Var);
        this.$listener = loadListener;
        this.$configuration = bannerConfiguration;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new BannerAd$Companion$load$1(this.$listener, this.$configuration, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((BannerAd$Companion$load$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            Context applicationContext = ClientProperties.getApplicationContext();
            pn6 pn6Var = pn6.a;
            if (applicationContext == null) {
                this.$listener.onAdLoaded(null, new UnityAdsError(0, "Failed to load banner ad for placement: " + this.$configuration.getPlacementId() + ". Verify that Unity Ads has been initialized."));
                return pn6Var;
            }
            UUID randomUUID = UUID.randomUUID();
            UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
            BannerConfiguration bannerConfiguration = this.$configuration;
            unityAdsLoadOptions.setObjectId(randomUUID.toString());
            unityAdsLoadOptions.setAdMarkup(bannerConfiguration.getAdMarkup());
            unityAdsLoadOptions.loadConfiguration = new LoadConfigurationInternal(bannerConfiguration.getPlacementId(), bannerConfiguration.getAdMarkup(), bannerConfiguration.getMediationAdUnitId(), bannerConfiguration.getMediationInfo(), bannerConfiguration.getExtras(), null, 32, null);
            if (!this.$configuration.getExtras().isEmpty()) {
                MetaData metaData = new MetaData(applicationContext);
                for (Map.Entry<String, String> entry : this.$configuration.getExtras().entrySet()) {
                    metaData.set(entry.getKey(), entry.getValue());
                }
                metaData.commit();
            }
            AtomicReference atomicReference = new AtomicReference(null);
            BannerView bannerView = new BannerView(applicationContext, this.$configuration.getPlacementId(), new UnityBannerSize(this.$configuration.getBannerSize().getWidth(), this.$configuration.getBannerSize().getHeight()));
            bannerView.setListener(new AnonymousClass2(randomUUID, this.$listener, this.$configuration, bannerView, atomicReference));
            bannerView.load(unityAdsLoadOptions);
            return pn6Var;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
