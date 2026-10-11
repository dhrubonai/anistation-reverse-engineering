package com.unity3d.ads.adplayer;

import android.app.Activity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.db;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1", f = "DisplayRecoverer.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DisplayRecoverer$attemptDisplayRecovery$confirmed$1 extends t36 implements ic2 {
    final /* synthetic */ Activity $foregrounded;
    int label;
    final /* synthetic */ DisplayRecoverer this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1", f = "DisplayRecoverer.kt", l = {180, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ Activity $foregrounded;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DisplayRecoverer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DisplayRecoverer displayRecoverer, Activity activity, vz0 vz0Var) {
            super(2, vz0Var);
            this.this$0 = displayRecoverer;
            this.$foregrounded = activity;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$foregrounded, vz0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        
            if (r8 == r4) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [nc1] */
        @Override // defpackage.h30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 2
                r2 = 1
                r3 = 0
                w11 r4 = defpackage.w11.x
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L17
                if (r0 != r1) goto L11
                defpackage.m37.N(r8)
                goto L5f
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ze0.m(r7)
                return r3
            L17:
                java.lang.Object r0 = r7.L$0
                nc1 r0 = (defpackage.nc1) r0
                defpackage.m37.N(r8)
                goto L42
            L1f:
                defpackage.m37.N(r8)
                java.lang.Object r8 = r7.L$0
                v11 r8 = (defpackage.v11) r8
                zq0 r0 = defpackage.tl7.c()
                com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1 r5 = new com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1$1$displayReady$1
                com.unity3d.ads.adplayer.DisplayRecoverer r6 = r7.this$0
                r5.<init>(r0, r6, r3)
                r6 = 3
                oc1 r8 = defpackage.tl7.i(r8, r3, r5, r6)
                r7.L$0 = r8
                r7.label = r2
                java.lang.Object r0 = r0.o(r7)
                if (r0 != r4) goto L41
                goto L5e
            L41:
                r0 = r8
            L42:
                com.unity3d.ads.adplayer.DisplayRecoverer r8 = r7.this$0
                android.app.Activity r2 = r7.$foregrounded
                java.lang.Object r8 = com.unity3d.ads.adplayer.DisplayRecoverer.m28access$launchDisplayIoAF18A(r8, r2)
                boolean r8 = r8 instanceof defpackage.y45
                if (r8 == 0) goto L54
                t43 r0 = (defpackage.t43) r0
                r0.l(r3)
                return r3
            L54:
                r7.L$0 = r3
                r7.label = r1
                java.lang.Object r8 = r0.p(r7)
                if (r8 != r4) goto L5f
            L5e:
                return r4
            L5f:
                com.unity3d.ads.adplayer.DisplayMessage r8 = (com.unity3d.ads.adplayer.DisplayMessage) r8
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$confirmed$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayRecoverer$attemptDisplayRecovery$confirmed$1(DisplayRecoverer displayRecoverer, Activity activity, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = displayRecoverer;
        this.$foregrounded = activity;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new DisplayRecoverer$attemptDisplayRecovery$confirmed$1(this.this$0, this.$foregrounded, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((DisplayRecoverer$attemptDisplayRecovery$confirmed$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$foregrounded, null);
        this.label = 1;
        Object K = db.K(anonymousClass1, this);
        w11 w11Var = w11.x;
        if (K == w11Var) {
            return w11Var;
        }
        return K;
    }
}
