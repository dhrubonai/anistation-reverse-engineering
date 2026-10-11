package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.a34;
import defpackage.ec2;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.rc2;
import defpackage.t36;
import defpackage.t44;
import defpackage.tc2;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.x42;
import defpackage.yq0;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {191, 194, 199}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$12 extends t36 implements ic2 {
    final /* synthetic */ yq0 $listenerStarted;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {193}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, vz0 vz0Var) {
            super(2, vz0Var);
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass1(this.this$0, this.$showOptions, vz0Var);
        }

        @Override // defpackage.ic2
        public final Object invoke(x42 x42Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(x42Var, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            String str;
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
                t44 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                str = this.this$0.opportunityId;
                DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(str, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions(), false, 4, null);
                this.label = 1;
                Object emit = displayMessages.emit(displayReady, this);
                w11 w11Var = w11.x;
                if (emit == w11Var) {
                    return w11Var;
                }
            }
            return pn6.a;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends t36 implements ic2 {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(vz0 vz0Var) {
            super(2, vz0Var);
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(vz0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.ic2
        public final Object invoke(OfferwallShowEvent offerwallShowEvent, vz0 vz0Var) {
            return ((AnonymousClass2) create(offerwallShowEvent, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                m37.N(obj);
                return Boolean.valueOf(a34.i((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass4 implements x42, rc2 {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        @Override // defpackage.x42
        public final Object emit(OfferwallEvent offerwallEvent, vz0 vz0Var) {
            Object sendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, vz0Var);
            if (sendOfferwallEvent == w11.x) {
                return sendOfferwallEvent;
            }
            return pn6.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof x42) || !(obj instanceof rc2)) {
                return false;
            }
            return a34.i(getFunctionDelegate(), ((rc2) obj).getFunctionDelegate());
        }

        @Override // defpackage.rc2
        public final ec2 getFunctionDelegate() {
            return new tc2(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$12(yq0 yq0Var, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, vz0 vz0Var) {
        super(2, vz0Var);
        this.$listenerStarted = yq0Var;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidFullscreenWebViewAdPlayer$show$12(this.$listenerStarted, this.this$0, this.$showOptions, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidFullscreenWebViewAdPlayer$show$12) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (r0.collect(r1, r7) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (defpackage.sw0.q(r4, r8, r7) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (((defpackage.zq0) r8).o(r7) == r5) goto L23;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r0 == 0) goto L23
            if (r0 == r4) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            defpackage.m37.N(r8)
            goto L8f
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r1
        L1b:
            defpackage.m37.N(r8)
            goto L55
        L1f:
            defpackage.m37.N(r8)
            goto L33
        L23:
            defpackage.m37.N(r8)
            yq0 r8 = r7.$listenerStarted
            r7.label = r4
            zq0 r8 = (defpackage.zq0) r8
            java.lang.Object r8 = r8.o(r7)
            if (r8 != r5) goto L33
            goto L8e
        L33:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
            w42 r8 = r8.getOnOfferwallEvent()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = r7.this$0
            com.unity3d.ads.adplayer.ShowOptions r6 = r7.$showOptions
            r0.<init>(r4, r6, r1)
            k52 r4 = new k52
            r4.<init>(r0, r8)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2 r8 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2
            r8.<init>(r1)
            r7.label = r3
            java.lang.Object r8 = defpackage.sw0.q(r4, r8, r7)
            if (r8 != r5) goto L55
            goto L8e
        L55:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.core.data.manager.OfferwallManager r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOfferwallManager$p(r8)
            com.unity3d.ads.adplayer.ShowOptions r0 = r7.$showOptions
            com.unity3d.ads.adplayer.AndroidShowOptions r0 = (com.unity3d.ads.adplayer.AndroidShowOptions) r0
            java.lang.String r0 = r0.getOfferwallPlacementName()
            if (r0 != 0) goto L67
            java.lang.String r0 = ""
        L67:
            w42 r8 = r8.showAd(r0)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r0 = r7.this$0
            v11 r0 = r0.getScope()
            r1 = 5
            ty4 r8 = defpackage.h41.Z(r8, r0, r1)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1
            r0.<init>()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$4 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$4
            r1.<init>(r8)
            r7.label = r2
            java.lang.Object r7 = r0.collect(r1, r7)
            if (r7 != r5) goto L8f
        L8e:
            return r5
        L8f:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
