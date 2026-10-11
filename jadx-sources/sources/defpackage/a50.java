package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class a50 {
    public static final tq1 a = new tq1(new gr((byte) 7), (byte) 1);
    public static Boolean b;

    public static final void a(ko koVar, xd6 xd6Var, p82 p82Var, List list, boolean z, kd2 kd2Var) {
        Executor executor = (Executor) kd2Var.j(a);
        if (executor != null && b(koVar.y.length())) {
            kd2Var.e0(315439796);
            try {
                executor.execute(new z40(xd6Var, (ia3) kd2Var.j(bv0.n), list, koVar, (ud1) kd2Var.j(bv0.h), p82Var, z));
            } catch (RejectedExecutionException unused) {
            }
            kd2Var.q(false);
        } else {
            kd2Var.e0(317137883);
            kd2Var.q(false);
        }
    }

    public static final boolean b(int i) {
        boolean z;
        if (i >= 8 && i < 1000) {
            Boolean bool = b;
            if (bool == null) {
                if (Runtime.getRuntime().availableProcessors() >= 4) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
                b = bool;
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
