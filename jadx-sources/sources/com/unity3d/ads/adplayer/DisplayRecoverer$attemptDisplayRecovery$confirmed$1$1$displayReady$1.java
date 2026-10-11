package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import defpackage.a34;
import defpackage.e16;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.sw0;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.x42;
import defpackage.yq0;
import defpackage.ze0;
import defpackage.zq0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1", f = "DisplayRecoverer.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1 extends t36 implements ic2 {
    final /* synthetic */ yq0 $listenerStarted;
    int label;
    final /* synthetic */ DisplayRecoverer this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1$1", f = "DisplayRecoverer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ yq0 $listenerStarted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(yq0 yq0Var, vz0 vz0Var) {
            super(2, vz0Var);
            this.$listenerStarted = yq0Var;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass1(this.$listenerStarted, vz0Var);
        }

        @Override // defpackage.ic2
        public final Object invoke(x42 x42Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(x42Var, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                m37.N(obj);
                zq0 zq0Var = (zq0) this.$listenerStarted;
                pn6 pn6Var = pn6.a;
                zq0Var.Q(pn6Var);
                return pn6Var;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1$2", f = "DisplayRecoverer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends t36 implements ic2 {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DisplayRecoverer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DisplayRecoverer displayRecoverer, vz0 vz0Var) {
            super(2, vz0Var);
            this.this$0 = displayRecoverer;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, vz0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.ic2
        public final Object invoke(DisplayMessage displayMessage, vz0 vz0Var) {
            return ((AnonymousClass2) create(displayMessage, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            boolean z;
            String str;
            if (this.label == 0) {
                m37.N(obj);
                DisplayMessage displayMessage = (DisplayMessage) this.L$0;
                if (displayMessage instanceof DisplayMessage.DisplayReady) {
                    String opportunityId = displayMessage.getOpportunityId();
                    str = this.this$0.opportunityId;
                    if (a34.i(opportunityId, str)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1(yq0 yq0Var, DisplayRecoverer displayRecoverer, vz0 vz0Var) {
        super(2, vz0Var);
        this.$listenerStarted = yq0Var;
        this.this$0 = displayRecoverer;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1(this.$listenerStarted, this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        e16 e16Var = new e16(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new AnonymousClass1(this.$listenerStarted, null));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
        this.label = 1;
        Object q = sw0.q(e16Var, anonymousClass2, this);
        w11 w11Var = w11.x;
        if (q == w11Var) {
            return w11Var;
        }
        return q;
    }
}
