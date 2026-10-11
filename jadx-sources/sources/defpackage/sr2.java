package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class sr2 extends t36 implements ic2 {
    public boolean x;
    public /* synthetic */ long y;

    /* JADX WARN: Type inference failed for: r1v1, types: [sr2, t36, vz0] */
    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        ?? t36Var = new t36(2, vz0Var);
        t36Var.y = ((Number) obj).longValue();
        return t36Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((sr2) create(Long.valueOf(((Number) obj).longValue()), (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        long j = this.y;
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            this.y = j;
            this.x = true;
            Object u = x97.u(j, this);
            w11 w11Var = w11.x;
            if (u == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
