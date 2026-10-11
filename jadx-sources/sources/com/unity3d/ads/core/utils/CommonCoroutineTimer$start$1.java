package com.unity3d.ads.core.utils;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.sb2;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonCoroutineTimer$start$1 extends t36 implements ic2 {
    final /* synthetic */ sb2 $action;
    final /* synthetic */ long $delayStartMillis;
    final /* synthetic */ long $repeatMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCoroutineTimer$start$1(long j, sb2 sb2Var, long j2, vz0 vz0Var) {
        super(2, vz0Var);
        this.$delayStartMillis = j;
        this.$action = sb2Var;
        this.$repeatMillis = j2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        CommonCoroutineTimer$start$1 commonCoroutineTimer$start$1 = new CommonCoroutineTimer$start$1(this.$delayStartMillis, this.$action, this.$repeatMillis, vz0Var);
        commonCoroutineTimer$start$1.L$0 = obj;
        return commonCoroutineTimer$start$1;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((CommonCoroutineTimer$start$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (defpackage.x97.u(r4, r6) == r3) goto L17;
     */
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
            w11 r3 = defpackage.w11.x
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L14
            if (r0 != r1) goto Ld
            goto L14
        Ld:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L14:
            java.lang.Object r0 = r6.L$0
            v11 r0 = (defpackage.v11) r0
            defpackage.m37.N(r7)
            goto L31
        L1c:
            defpackage.m37.N(r7)
            java.lang.Object r7 = r6.L$0
            r0 = r7
            v11 r0 = (defpackage.v11) r0
            long r4 = r6.$delayStartMillis
            r6.L$0 = r0
            r6.label = r2
            java.lang.Object r7 = defpackage.x97.u(r4, r6)
            if (r7 != r3) goto L31
            goto L48
        L31:
            boolean r7 = defpackage.db.W(r0)
            if (r7 == 0) goto L49
            sb2 r7 = r6.$action
            r7.invoke()
            long r4 = r6.$repeatMillis
            r6.L$0 = r0
            r6.label = r1
            java.lang.Object r7 = defpackage.x97.u(r4, r6)
            if (r7 != r3) goto L31
        L48:
            return r3
        L49:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
