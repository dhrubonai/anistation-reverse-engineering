package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.services.core.domain.ISDKDispatchers;
import defpackage.gg3;
import defpackage.ic2;
import defpackage.m37;
import defpackage.oi4;
import defpackage.pg0;
import defpackage.pn6;
import defpackage.t36;
import defpackage.t44;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.x42;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends t36 implements ic2 {
    final /* synthetic */ pg0 $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {140, 156}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ pg0 $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        @w51(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1", f = "FullScreenWebViewDisplay.kt", l = {144}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00001 extends t36 implements ic2 {
            int label;
            final /* synthetic */ FullScreenWebViewDisplay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(FullScreenWebViewDisplay fullScreenWebViewDisplay, vz0 vz0Var) {
                super(2, vz0Var);
                this.this$0 = fullScreenWebViewDisplay;
            }

            @Override // defpackage.h30
            public final vz0 create(Object obj, vz0 vz0Var) {
                return new C00001(this.this$0, vz0Var);
            }

            @Override // defpackage.ic2
            public final Object invoke(v11 v11Var, vz0 vz0Var) {
                return ((C00001) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
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
                    DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, "Error loading webView");
                    this.label = 1;
                    Object emit = displayMessages.emit(displayError, this);
                    w11 w11Var = w11.x;
                    if (emit == w11Var) {
                        return w11Var;
                    }
                }
                return pn6.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, pg0 pg0Var, vz0 vz0Var) {
            super(2, vz0Var);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = pg0Var;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, vz0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
        
            if (r7.emit(r2, r6) != r4) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        
            if (r7 == r4) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
        @Override // defpackage.h30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 2
                r2 = 1
                r3 = 0
                w11 r4 = defpackage.w11.x
                if (r0 == 0) goto L24
                if (r0 == r2) goto L1c
                if (r0 != r1) goto L16
                java.lang.Object r0 = r6.L$0
                v11 r0 = (defpackage.v11) r0
                defpackage.m37.N(r7)
                goto La8
            L16:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ze0.m(r6)
                return r3
            L1c:
                java.lang.Object r0 = r6.L$0
                v11 r0 = (defpackage.v11) r0
                defpackage.m37.N(r7)
                goto L5b
            L24:
                defpackage.m37.N(r7)
                java.lang.Object r7 = r6.L$0
                r0 = r7
                v11 r0 = (defpackage.v11) r0
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.ads.core.data.model.AdObject r7 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getAdObject(r7)
                if (r7 == 0) goto L39
                com.unity3d.ads.core.data.model.AdObject$WebViewLessLoadingRequiredData r7 = r7.getWebViewLessLoadingRequiredData()
                goto L3a
            L39:
                r7 = r3
            L3a:
                if (r7 == 0) goto L8c
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.ads.core.data.model.AdObject r7 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getAdObject(r7)
                if (r7 == 0) goto L5e
                com.unity3d.ads.adplayer.AdPlayer r7 = r7.getAdPlayer()
                if (r7 == 0) goto L5e
                w42 r7 = r7.getOnLoadEvent()
                if (r7 == 0) goto L5e
                r6.L$0 = r0
                r6.label = r2
                java.lang.Object r7 = defpackage.sw0.H(r7, r6)
                if (r7 != r4) goto L5b
                goto La7
            L5b:
                com.unity3d.ads.adplayer.model.LoadEvent r7 = (com.unity3d.ads.adplayer.model.LoadEvent) r7
                goto L5f
            L5e:
                r7 = r3
            L5f:
                boolean r7 = r7 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
                if (r7 == 0) goto L8c
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                r2 = 0
                r7.setResult(r2)
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.services.core.domain.ISDKDispatchers r7 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getDispatchers(r7)
                n11 r7 = r7.getDefault()
                ke0 r7 = defpackage.db.b(r7)
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1 r2 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1$1
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r5 = r6.this$0
                r2.<init>(r5, r3)
                r5 = 3
                defpackage.tl7.z(r7, r3, r3, r2, r5)
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r7 = r6.this$0
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$finishBySdk(r7)
                pg0 r7 = r6.$continuation
                r7.a(r3)
            L8c:
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r7 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
                t44 r7 = r7.getDisplayMessages()
                com.unity3d.ads.adplayer.DisplayMessage$WebViewInstanceRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$WebViewInstanceRequest
                com.unity3d.ads.adplayer.FullScreenWebViewDisplay r3 = r6.this$0
                java.lang.String r3 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r3)
                r2.<init>(r3)
                r6.L$0 = r0
                r6.label = r1
                java.lang.Object r7 = r7.emit(r2, r6)
                if (r7 != r4) goto La8
            La7:
                return r4
            La8:
                l11 r7 = r0.getCoroutineContext()
                defpackage.h98.o(r7)
                pg0 r6 = r6.$continuation
                pn6 r7 = defpackage.pn6.a
                r6.resumeWith(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, pg0 pg0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = pg0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(x42 x42Var, vz0 vz0Var) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(x42Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers dispatchers;
        if (this.label == 0) {
            m37.N(obj);
            gg3 u = oi4.u(this.this$0);
            dispatchers = this.this$0.getDispatchers();
            tl7.z(u, dispatchers.getDefault(), null, new AnonymousClass1(this.this$0, this.$continuation, null), 2);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
