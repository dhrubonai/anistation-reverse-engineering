package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tj extends t36 implements ub2 {
    public final /* synthetic */ wj A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ l76 C;
    public final /* synthetic */ long D;
    public final /* synthetic */ ub2 E;
    public ml x;
    public r05 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(wj wjVar, Object obj, l76 l76Var, long j, ub2 ub2Var, vz0 vz0Var) {
        super(1, vz0Var);
        this.A = wjVar;
        this.B = obj;
        this.C = l76Var;
        this.D = j;
        this.E = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new tj(this.A, this.B, this.C, this.D, this.E, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        return ((tj) create((vz0) obj)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [r05, java.lang.Object] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        ml mlVar;
        r05 r05Var;
        hl hlVar;
        l76 l76Var = this.C;
        boolean z = this.z;
        wj wjVar = this.A;
        try {
            if (z) {
                if (z) {
                    r05Var = this.y;
                    mlVar = this.x;
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                wjVar.c.z = (rl) wjVar.a.a.invoke(this.B);
                wjVar.e.setValue(l76Var.c);
                wjVar.d.setValue(Boolean.TRUE);
                ml mlVar2 = wjVar.c;
                ml mlVar3 = new ml(mlVar2.x, mlVar2.y.getValue(), q23.t(mlVar2.z), mlVar2.A, Long.MIN_VALUE, mlVar2.C);
                ?? obj2 = new Object();
                long j = this.D;
                gj gjVar = new gj(wjVar, mlVar3, this.E, (r05) obj2);
                this.x = mlVar3;
                this.y = obj2;
                this.z = true;
                Object b = nv5.b(mlVar3, l76Var, j, gjVar, this);
                w11 w11Var = w11.x;
                if (b == w11Var) {
                    return w11Var;
                }
                mlVar = mlVar3;
                r05Var = obj2;
            }
            if (r05Var.x) {
                hlVar = hl.x;
            } else {
                hlVar = hl.y;
            }
            wjVar.c();
            return new jl(mlVar, hlVar);
        } catch (CancellationException e) {
            wjVar.c();
            throw e;
        }
    }
}
