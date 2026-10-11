package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.datasource.CurrentActivityDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.ic2;
import defpackage.m37;
import defpackage.ot1;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.z05;
import defpackage.ze0;
import gatewayprotocol.v1.ErrorOuterClass;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.InterstitialAd$show$1", f = "InterstitialAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InterstitialAd$show$1 extends t36 implements ic2 {
    final /* synthetic */ ShowConfiguration $configuration;
    final /* synthetic */ Context $context;
    final /* synthetic */ InterstitialShowListener $listener;
    int label;
    final /* synthetic */ InterstitialAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAd$show$1(ShowConfiguration showConfiguration, InterstitialAd interstitialAd, Context context, InterstitialShowListener interstitialShowListener, vz0 vz0Var) {
        super(2, vz0Var);
        this.$configuration = showConfiguration;
        this.this$0 = interstitialAd;
        this.$context = context;
        this.$listener = interstitialShowListener;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new InterstitialAd$show$1(this.$configuration, this.this$0, this.$context, this.$listener, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((InterstitialAd$show$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        String str;
        Map<String, String> map;
        AdObject adObject;
        AdObject adObject2;
        AdObject adObject3;
        String str2;
        AdObject adObject4;
        AdObject adObject5;
        WeakReference<Activity> weakReference;
        AdObject adObject6;
        if (this.label == 0) {
            m37.N(obj);
            ShowConfiguration showConfiguration = this.$configuration;
            if (showConfiguration != null) {
                str = showConfiguration.getCustomRewardString();
            } else {
                str = null;
            }
            ShowConfiguration showConfiguration2 = this.$configuration;
            if (showConfiguration2 == null || (map = showConfiguration2.getExtras()) == null) {
                map = ot1.x;
            }
            ShowConfigurationInternal showConfigurationInternal = new ShowConfigurationInternal(str, map);
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            adObject = this.this$0.adObject;
            unityAdsShowOptions.setObjectId(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString());
            unityAdsShowOptions.showConfiguration = showConfigurationInternal;
            adObject2 = this.this$0.adObject;
            adObject2.setShowConfiguration(this.$configuration);
            adObject3 = this.this$0.adObject;
            ShowConfiguration showConfiguration3 = this.$configuration;
            if (showConfiguration3 != null) {
                str2 = showConfiguration3.getCustomRewardString();
            } else {
                str2 = null;
            }
            adObject3.setPlayerServerId(str2);
            ServiceProvider serviceProvider = ServiceProvider.INSTANCE;
            CurrentActivityDataSource currentActivityDataSource = (CurrentActivityDataSource) serviceProvider.getRegistry().resolveService(new ServiceKey(null, z05.a(CurrentActivityDataSource.class), 1, null));
            SendDiagnosticEvent sendDiagnosticEvent = (SendDiagnosticEvent) serviceProvider.getRegistry().resolveService(new ServiceKey(null, z05.a(SendDiagnosticEvent.class), 1, null));
            SessionRepository sessionRepository = (SessionRepository) serviceProvider.getRegistry().resolveService(new ServiceKey(null, z05.a(SessionRepository.class), 1, null));
            Activity currentActivity = currentActivityDataSource.getCurrentActivity();
            ShowActivityResolverKt.commitExtras(this.$context, currentActivity, this.$configuration);
            Context context = this.$context;
            adObject4 = this.this$0.adObject;
            Activity resolveEffectiveActivity = ShowActivityResolverKt.resolveEffectiveActivity(context, currentActivity, adObject4, sendDiagnosticEvent, sessionRepository);
            adObject5 = this.this$0.adObject;
            if (resolveEffectiveActivity != null) {
                weakReference = new WeakReference<>(resolveEffectiveActivity);
            } else {
                weakReference = null;
            }
            adObject5.setActivity(weakReference);
            UnityAdsSDK unityAdsSDK = new UnityAdsSDK(null, 1, null);
            adObject6 = this.this$0.adObject;
            String placementId = adObject6.getPlacementId();
            final InterstitialShowListener interstitialShowListener = this.$listener;
            final InterstitialAd interstitialAd = this.this$0;
            unityAdsSDK.show(placementId, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.ads.InterstitialAd$show$1.2

                /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
                /* renamed from: com.unity3d.ads.InterstitialAd$show$1$2$WhenMappings */
                /* loaded from: classes.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                    static {
                        int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
                        try {
                            iArr[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.EXPIRED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[UnityAds.UnityAdsShowCompletionState.values().length];
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onClick(String str3) {
                    str3.getClass();
                    InterstitialShowListener interstitialShowListener2 = InterstitialShowListener.this;
                    if (interstitialShowListener2 != null) {
                        interstitialShowListener2.onClicked(interstitialAd);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onComplete(String str3, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                    ShowFinishState showFinishState;
                    str3.getClass();
                    unityAdsShowCompletionState.getClass();
                    InterstitialShowListener interstitialShowListener2 = InterstitialShowListener.this;
                    if (interstitialShowListener2 != null) {
                        InterstitialAd interstitialAd2 = interstitialAd;
                        int i = WhenMappings.$EnumSwitchMapping$1[unityAdsShowCompletionState.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                showFinishState = ShowFinishState.SKIPPED;
                            } else {
                                ze0.l();
                                return;
                            }
                        } else {
                            showFinishState = ShowFinishState.COMPLETED;
                        }
                        interstitialShowListener2.onCompleted(interstitialAd2, showFinishState);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onError(String str3, UnityAds.UnityAdsShowError unityAdsShowError, String str4) {
                    ErrorOuterClass.PublicErrorCode publicErrorCode;
                    str3.getClass();
                    unityAdsShowError.getClass();
                    str4.getClass();
                    int i = WhenMappings.$EnumSwitchMapping$0[unityAdsShowError.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL;
                            } else {
                                publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN;
                            }
                        } else {
                            publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED;
                        }
                    } else {
                        publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
                    }
                    InterstitialShowListener interstitialShowListener2 = InterstitialShowListener.this;
                    if (interstitialShowListener2 != null) {
                        interstitialShowListener2.onFailed(interstitialAd, new UnityAdsError(publicErrorCode.getNumber(), UnityAdsErrorKt.getShowErrorMsg(publicErrorCode)));
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onLeftApplication(String str3) {
                    str3.getClass();
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onRewarded(String str3) {
                    Listeners.DefaultImpls.onRewarded(this, str3);
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onStart(String str3) {
                    str3.getClass();
                    InterstitialShowListener interstitialShowListener2 = InterstitialShowListener.this;
                    if (interstitialShowListener2 != null) {
                        interstitialShowListener2.onStarted(interstitialAd);
                    }
                }
            });
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
