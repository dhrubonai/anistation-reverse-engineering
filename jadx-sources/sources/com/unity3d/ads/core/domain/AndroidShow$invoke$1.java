package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AccelerometerRepository;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import defpackage.ic2;
import defpackage.jc2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.sx5;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w05;
import defpackage.w11;
import defpackage.w51;
import defpackage.x42;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE, 107}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidShow$invoke$1 extends t36 implements ic2 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AndroidShow this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends t36 implements ic2 {
        final /* synthetic */ w05 $ad;
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AdPlayer $adPlayer;
        final /* synthetic */ boolean $isFullscreenShow;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AdPlayer adPlayer, w05 w05Var, AndroidShow androidShow, AdObject adObject, boolean z, UnityAdsShowOptions unityAdsShowOptions, vz0 vz0Var) {
            super(2, vz0Var);
            this.$adPlayer = adPlayer;
            this.$ad = w05Var;
            this.this$0 = androidShow;
            this.$adObject = adObject;
            this.$isFullscreenShow = z;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass4(this.$adPlayer, this.$ad, this.this$0, this.$adObject, this.$isFullscreenShow, this.$showOptions, vz0Var);
        }

        @Override // defpackage.ic2
        public final Object invoke(x42 x42Var, vz0 vz0Var) {
            return ((AnonymousClass4) create(x42Var, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            GameServerIdReader gameServerIdReader;
            JSONObject data;
            AccelerometerRepository accelerometerRepository;
            Map<String, Object> map = null;
            if (this.label == 0) {
                m37.N(obj);
                if (!((Boolean) this.$adPlayer.getWebViewContainer().isRenderProcessGone().getValue()).booleanValue()) {
                    AdObject adObject = (AdObject) this.$ad.x;
                    gameServerIdReader = this.this$0.gameServerIdReader;
                    Object playerServerId = ((AdObject) this.$ad.x).getPlayerServerId();
                    Object obj2 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                    if (obj2 != null) {
                        boolean z = obj2 instanceof String;
                        Object obj3 = obj2;
                        if (!z) {
                            obj3 = playerServerId;
                        }
                        if (obj3 != null) {
                            playerServerId = obj3;
                        }
                    }
                    if (gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey()) != null) {
                        gameServerIdReader.getJsonStorage().delete(gameServerIdReader.getKey());
                    }
                    adObject.setPlayerServerId((String) playerServerId);
                    ((sx5) this.$adObject.getState()).k(AdObjectState.SHOWING);
                    if (this.$isFullscreenShow) {
                        accelerometerRepository = this.this$0.accelerometerRepository;
                        accelerometerRepository.start();
                    }
                    AdPlayer adPlayer = this.$adPlayer;
                    UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                    if (unityAdsShowOptions != null && (data = unityAdsShowOptions.getData()) != null) {
                        map = JSONObjectExtensionsKt.toBuiltInMap(data);
                    }
                    adPlayer.show(new AndroidShowOptions(map, ((AdObject) this.$ad.x).getPlacementId(), ((AdObject) this.$ad.x).isOfferwallAd(), ((AdObject) this.$ad.x).getOfferwallPlacementName()));
                }
                return pn6.a;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$5", f = "AndroidShow.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends t36 implements jc2 {
        final /* synthetic */ w05 $ad;
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ boolean $isFullscreenShow;
        final /* synthetic */ ByteString $opportunityId;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(boolean z, AndroidShow androidShow, AdObject adObject, ByteString byteString, w05 w05Var, vz0 vz0Var) {
            super(3, vz0Var);
            this.$isFullscreenShow = z;
            this.this$0 = androidShow;
            this.$adObject = adObject;
            this.$opportunityId = byteString;
            this.$ad = w05Var;
        }

        @Override // defpackage.jc2
        public final Object invoke(x42 x42Var, Throwable th, vz0 vz0Var) {
            return new AnonymousClass5(this.$isFullscreenShow, this.this$0, this.$adObject, this.$opportunityId, this.$ad, vz0Var).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            AdRepository adRepository;
            PreShowWebViewStrategy preShowWebViewStrategy;
            AccelerometerRepository accelerometerRepository;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                if (this.$isFullscreenShow) {
                    accelerometerRepository = this.this$0.accelerometerRepository;
                    accelerometerRepository.stop();
                }
                ((sx5) this.$adObject.getState()).k(AdObjectState.COMPLETED);
                adRepository = this.this$0.adRepository;
                adRepository.removeAd(this.$opportunityId);
                preShowWebViewStrategy = this.this$0.preShowStrategy;
                AdObject adObject = (AdObject) this.$ad.x;
                this.label = 1;
                Object onShowComplete = preShowWebViewStrategy.onShowComplete(adObject, this);
                w11 w11Var = w11.x;
                if (onShowComplete == w11Var) {
                    return w11Var;
                }
            }
            return pn6.a;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$6", f = "AndroidShow.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends t36 implements jc2 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass6(vz0 vz0Var) {
            super(3, vz0Var);
        }

        @Override // defpackage.jc2
        public final Object invoke(x42 x42Var, ShowEvent showEvent, vz0 vz0Var) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(vz0Var);
            anonymousClass6.L$0 = x42Var;
            anonymousClass6.L$1 = showEvent;
            return anonymousClass6.invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            ShowEvent showEvent;
            int i = this.label;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    showEvent = (ShowEvent) this.L$0;
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                x42 x42Var = (x42) this.L$0;
                ShowEvent showEvent2 = (ShowEvent) this.L$1;
                this.L$0 = showEvent2;
                this.label = 1;
                Object emit = x42Var.emit(showEvent2, this);
                w11 w11Var = w11.x;
                if (emit == w11Var) {
                    return w11Var;
                }
                showEvent = showEvent2;
            }
            if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidShow$invoke$1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, vz0 vz0Var) {
        super(2, vz0Var);
        this.$adObject = adObject;
        this.this$0 = androidShow;
        this.$showOptions = unityAdsShowOptions;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidShow$invoke$1 androidShow$invoke$1 = new AndroidShow$invoke$1(this.$adObject, this.this$0, this.$showOptions, vz0Var);
        androidShow$invoke$1.L$0 = obj;
        return androidShow$invoke$1;
    }

    @Override // defpackage.ic2
    public final Object invoke(x42 x42Var, vz0 vz0Var) {
        return ((AndroidShow$invoke$1) create(x42Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01b1, code lost:
    
        if (r0.collect(r1, r28) == r13) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b7  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, w05] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
