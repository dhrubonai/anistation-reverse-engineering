package com.unity3d.ads.core.domain;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidWarmNonInitSignals$invoke$1", f = "AndroidWarmNonInitSignals.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWarmNonInitSignals$invoke$1 extends t36 implements ic2 {
    long J$0;
    int label;
    final /* synthetic */ AndroidWarmNonInitSignals this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWarmNonInitSignals$invoke$1(AndroidWarmNonInitSignals androidWarmNonInitSignals, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidWarmNonInitSignals;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidWarmNonInitSignals$invoke$1(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidWarmNonInitSignals$invoke$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.label
            r2 = 0
            pn6 r3 = defpackage.pn6.a
            r4 = 1
            if (r0 == 0) goto L1a
            if (r0 != r4) goto L14
            long r4 = r1.J$0
            defpackage.m37.N(r18)     // Catch: java.lang.Throwable -> L12 java.util.concurrent.CancellationException -> L8c
            goto L3a
        L12:
            r0 = move-exception
            goto L3e
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r2
        L1a:
            defpackage.m37.N(r18)
            long r5 = defpackage.j04.b()
            com.unity3d.ads.core.domain.AndroidWarmNonInitSignals r0 = r1.this$0
            n11 r7 = com.unity3d.ads.core.domain.AndroidWarmNonInitSignals.access$getIoDispatcher$p(r0)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L8c
            com.unity3d.ads.core.domain.AndroidWarmNonInitSignals$invoke$1$result$1$1 r8 = new com.unity3d.ads.core.domain.AndroidWarmNonInitSignals$invoke$1$result$1$1     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L8c
            r8.<init>(r0, r2)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L8c
            r1.J$0 = r5     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L8c
            r1.label = r4     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L8c
            java.lang.Object r0 = defpackage.tl7.V(r7, r8, r1)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L8c
            w11 r2 = defpackage.w11.x
            if (r0 != r2) goto L39
            return r2
        L39:
            r4 = r5
        L3a:
            r2 = r3
            goto L43
        L3c:
            r0 = move-exception
            r4 = r5
        L3e:
            y45 r2 = new y45
            r2.<init>(r0)
        L43:
            java.lang.Throwable r0 = defpackage.z45.b(r2)
            if (r0 == 0) goto L64
            com.unity3d.ads.core.domain.AndroidWarmNonInitSignals r6 = r1.this$0
            com.unity3d.ads.core.log.Logger r6 = com.unity3d.ads.core.domain.AndroidWarmNonInitSignals.access$getLogger$p(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to warm non-init signals: "
            r7.<init>(r8)
            java.lang.String r8 = r0.getMessage()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.error(r7, r0)
        L64:
            com.unity3d.ads.core.domain.AndroidWarmNonInitSignals r0 = r1.this$0
            com.unity3d.ads.core.domain.SendDiagnosticEvent r6 = com.unity3d.ads.core.domain.AndroidWarmNonInitSignals.access$getSendDiagnosticEvent$p(r0)
            boolean r0 = r2 instanceof defpackage.y45
            if (r0 != 0) goto L72
            java.lang.String r0 = "native_warm_non_init_signals_success_time"
        L70:
            r7 = r0
            goto L75
        L72:
            java.lang.String r0 = "native_warm_non_init_signals_failure_time"
            goto L70
        L75:
            double r0 = defpackage.h11.c(r4)
            java.lang.Double r8 = new java.lang.Double
            r8.<init>(r0)
            r15 = 252(0xfc, float:3.53E-43)
            r16 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        L8c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidWarmNonInitSignals$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
