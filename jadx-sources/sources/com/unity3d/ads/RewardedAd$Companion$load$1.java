package com.unity3d.ads;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.w51;
import defpackage.y45;
import defpackage.z05;
import defpackage.z45;
import defpackage.ze0;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.RewardedAd$Companion$load$1", f = "RewardedAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RewardedAd$Companion$load$1 extends t36 implements ic2 {
    final /* synthetic */ LoadConfiguration $configuration;
    final /* synthetic */ LoadListener<RewardedAd> $listener;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd$Companion$load$1(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener, vz0 vz0Var) {
        super(2, vz0Var);
        this.$configuration = loadConfiguration;
        this.$listener = loadListener;
    }

    public static final void invokeSuspend$lambda$3$lambda$2(LoadListener loadListener, Throwable th) {
        loadListener.onAdLoaded(null, new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN.getNumber(), "Unity Ads SDK load failed due to unexpected error: " + th.getMessage()));
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        RewardedAd$Companion$load$1 rewardedAd$Companion$load$1 = new RewardedAd$Companion$load$1(this.$configuration, this.$listener, vz0Var);
        rewardedAd$Companion$load$1.L$0 = obj;
        return rewardedAd$Companion$load$1;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((RewardedAd$Companion$load$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object y45Var;
        pn6 pn6Var = pn6.a;
        if (this.label == 0) {
            m37.N(obj);
            LoadConfiguration loadConfiguration = this.$configuration;
            final LoadListener<RewardedAd> loadListener = this.$listener;
            try {
                LoadConfigurationInternal loadConfigurationInternal = new LoadConfigurationInternal(loadConfiguration.getPlacementId(), loadConfiguration.getAdMarkup(), loadConfiguration.getMediationAdUnitId(), loadConfiguration.getMediationInfo(), vn3.Z(loadConfiguration.getExtras()), null, 32, null);
                UUID randomUUID = UUID.randomUUID();
                UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
                unityAdsLoadOptions.setObjectId(randomUUID.toString());
                unityAdsLoadOptions.setAdMarkup(loadConfiguration.getAdMarkup());
                unityAdsLoadOptions.loadConfiguration = loadConfigurationInternal;
                UnityAdsImplementation.getInstance().load(loadConfiguration.getPlacementId(), unityAdsLoadOptions, new InternalLoadListener() { // from class: com.unity3d.ads.RewardedAd$Companion$load$1$1$1
                    @Override // com.unity3d.ads.core.domain.InternalLoadListener
                    public void onAdLoadFail(UnityAdsError unityAdsError) {
                        unityAdsError.getClass();
                        loadListener.onAdLoaded(null, unityAdsError);
                    }

                    @Override // com.unity3d.ads.core.domain.InternalLoadListener
                    public void onAdLoaded(AdObject adObject) {
                        adObject.getClass();
                        loadListener.onAdLoaded(new RewardedAd(adObject, (SafeCallbackInvoke) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(null, z05.a(SafeCallbackInvoke.class), 1, null))), null);
                    }
                });
                y45Var = pn6Var;
            } catch (Throwable th) {
                y45Var = new y45(th);
            }
            LoadListener<RewardedAd> loadListener2 = this.$listener;
            Throwable b = z45.b(y45Var);
            if (b != null) {
                Utilities.wrapCustomerListener(new b(loadListener2, b, (byte) 1));
            }
            return pn6Var;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
