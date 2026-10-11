package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.repository.FocusRepository;
import defpackage.fn5;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.sw0;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.xz0;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1", f = "DisplayRecoverer.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DisplayRecoverer$attemptDisplayRecovery$foregrounded$1 extends t36 implements ic2 {
    int label;
    final /* synthetic */ DisplayRecoverer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayRecoverer$attemptDisplayRecovery$foregrounded$1(DisplayRecoverer displayRecoverer, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = displayRecoverer;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new DisplayRecoverer$attemptDisplayRecovery$foregrounded$1(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((DisplayRecoverer$attemptDisplayRecovery$foregrounded$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        FocusRepository focusRepository;
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
        focusRepository = this.this$0.focusRepository;
        final fn5 focusState = focusRepository.getFocusState();
        w42 w42Var = new w42() { // from class: com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "DisplayRecoverer.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(vz0 vz0Var) {
                        super(vz0Var);
                    }

                    @Override // defpackage.h30
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(x42 x42Var) {
                    this.$this_unsafeFlow = x42Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        r3 = 0
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L26
                        defpackage.m37.N(r6)
                        goto L5d
                    L26:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        return r3
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        com.unity3d.ads.core.data.repository.FocusState r5 = (com.unity3d.ads.core.data.repository.FocusState) r5
                        boolean r6 = r5 instanceof com.unity3d.ads.core.data.repository.FocusState.Focused
                        if (r6 == 0) goto L3a
                        com.unity3d.ads.core.data.repository.FocusState$Focused r5 = (com.unity3d.ads.core.data.repository.FocusState.Focused) r5
                        goto L3b
                    L3a:
                        r5 = r3
                    L3b:
                        if (r5 == 0) goto L50
                        java.lang.ref.WeakReference r5 = r5.getActivity()
                        if (r5 == 0) goto L50
                        java.lang.Object r5 = r5.get()
                        android.app.Activity r5 = (android.app.Activity) r5
                        if (r5 == 0) goto L50
                        boolean r6 = r5 instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay
                        if (r6 != 0) goto L50
                        r3 = r5
                    L50:
                        if (r3 == 0) goto L5d
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r3, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L5d
                        return r5
                    L5d:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.DisplayRecoverer$attemptDisplayRecovery$foregrounded$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var), vz0Var);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        };
        this.label = 1;
        Object p = sw0.p(w42Var, this);
        w11 w11Var = w11.x;
        if (p == w11Var) {
            return w11Var;
        }
        return p;
    }
}
