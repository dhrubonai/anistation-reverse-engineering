package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class va0 extends uc2 implements jc2 {
    public static final va0 x = new uc2(3, za0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ek0 ek0Var;
        za0 za0Var = (za0) obj;
        ng5 ng5Var = (ng5) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = za0.A;
        za0Var.getClass();
        ek0 ek0Var2 = (ek0) qs.a.getObjectVolatile(za0Var, za0.L);
        while (true) {
            if (za0Var.y()) {
                ng5Var.B = bb0.l;
                break;
            }
            long andIncrement = za0.B.getAndIncrement(za0Var);
            long j = bb0.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ek0Var2.A != j2) {
                ek0 n = za0Var.n(j2, ek0Var2);
                if (n == null) {
                    continue;
                } else {
                    ek0Var = n;
                }
            } else {
                ek0Var = ek0Var2;
            }
            Object K = za0Var.K(ek0Var, i, andIncrement, ng5Var);
            ek0 ek0Var3 = ek0Var;
            if (K == bb0.m) {
                if (ng5Var == null) {
                    ng5Var = null;
                }
                if (ng5Var != null) {
                    ng5Var.z = ek0Var3;
                    ng5Var.A = i;
                }
            } else if (K == bb0.o) {
                if (andIncrement < za0Var.u()) {
                    ek0Var3.b();
                }
                ek0Var2 = ek0Var3;
            } else if (K != bb0.n) {
                ek0Var3.b();
                ng5Var.B = K;
            } else {
                ze0.m("unexpected");
                return null;
            }
        }
        return pn6.a;
    }
}
