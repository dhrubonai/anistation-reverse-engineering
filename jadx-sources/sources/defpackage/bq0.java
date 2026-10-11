package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bq0 extends t36 implements ic2 {
    public final /* synthetic */ AtomicInteger A;
    public final /* synthetic */ za0 B;
    public boolean x;
    public final /* synthetic */ w42[] y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(w42[] w42VarArr, int i, AtomicInteger atomicInteger, za0 za0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = w42VarArr;
        this.z = i;
        this.A = atomicInteger;
        this.B = za0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new bq0(this.y, this.z, this.A, this.B, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((bq0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        AtomicInteger atomicInteger = this.A;
        za0 za0Var = this.B;
        try {
            if (z) {
                if (z) {
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                w42[] w42VarArr = this.y;
                int i = this.z;
                w42 w42Var = w42VarArr[i];
                aq0 aq0Var = new aq0(za0Var, i);
                this.x = true;
                Object collect = w42Var.collect(aq0Var, this);
                w11 w11Var = w11.x;
                if (collect == w11Var) {
                    return w11Var;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                za0Var.f(null);
            }
            return pn6.a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                za0Var.f(null);
            }
        }
    }
}
