package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class al7 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ byte b;

    public al7(byte b) {
        this.b = b;
    }

    public static gk7 c(vs7 vs7Var, ArrayList arrayList) {
        nm7 nm7Var = nm7.ADD;
        fy5.l("FN", 2, arrayList);
        ik7 f0 = ((y23) vs7Var.b).f0(vs7Var, (ik7) arrayList.get(0));
        ik7 f02 = ((y23) vs7Var.b).f0(vs7Var, (ik7) arrayList.get(1));
        if (f02 instanceof rf7) {
            List n = ((rf7) f02).n();
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                arrayList2 = arrayList.subList(2, arrayList.size());
            }
            return new gk7(f0.d(), (ArrayList) n, arrayList2, vs7Var);
        }
        ze0.k(zo5.l("FN requires an ArrayValue of parameter names found ", f02.getClass().getCanonicalName()));
        return null;
    }

    public static boolean d(ik7 ik7Var, ik7 ik7Var2) {
        if (ik7Var instanceof uj7) {
            ik7Var = new tk7(ik7Var.d());
        }
        if (ik7Var2 instanceof uj7) {
            ik7Var2 = new tk7(ik7Var2.d());
        }
        if ((ik7Var instanceof tk7) && (ik7Var2 instanceof tk7)) {
            if (((tk7) ik7Var).x.compareTo(((tk7) ik7Var2).x) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = ik7Var.h().doubleValue();
        double doubleValue2 = ik7Var2.h().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static ik7 e(em7 em7Var, ik7 ik7Var, ik7 ik7Var2) {
        if (ik7Var instanceof Iterable) {
            return g(em7Var, ((Iterable) ik7Var).iterator(), ik7Var2);
        }
        ze0.k("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(ik7 ik7Var, ik7 ik7Var2) {
        if (ik7Var.getClass().equals(ik7Var2.getClass())) {
            if ((ik7Var instanceof xk7) || (ik7Var instanceof bk7)) {
                return true;
            }
            if (ik7Var instanceof xh7) {
                if (Double.isNaN(ik7Var.h().doubleValue()) || Double.isNaN(ik7Var2.h().doubleValue()) || ik7Var.h().doubleValue() != ik7Var2.h().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (ik7Var instanceof tk7) {
                return ik7Var.d().equals(ik7Var2.d());
            }
            if (ik7Var instanceof lg7) {
                return ik7Var.c().equals(ik7Var2.c());
            }
            if (ik7Var != ik7Var2) {
                return false;
            }
            return true;
        }
        if (((ik7Var instanceof xk7) || (ik7Var instanceof bk7)) && ((ik7Var2 instanceof xk7) || (ik7Var2 instanceof bk7))) {
            return true;
        }
        boolean z = ik7Var instanceof xh7;
        if (z && (ik7Var2 instanceof tk7)) {
            return f(ik7Var, new xh7(ik7Var2.h()));
        }
        boolean z2 = ik7Var instanceof tk7;
        if (z2 && (ik7Var2 instanceof xh7)) {
            return f(new xh7(ik7Var.h()), ik7Var2);
        }
        if (ik7Var instanceof lg7) {
            return f(new xh7(ik7Var.h()), ik7Var2);
        }
        if (ik7Var2 instanceof lg7) {
            return f(ik7Var, new xh7(ik7Var2.h()));
        }
        if ((z2 || z) && (ik7Var2 instanceof uj7)) {
            return f(ik7Var, new tk7(ik7Var2.d()));
        }
        if (!(ik7Var instanceof uj7) || (!(ik7Var2 instanceof tk7) && !(ik7Var2 instanceof xh7))) {
            return false;
        }
        return f(new tk7(ik7Var.d()), ik7Var2);
    }

    public static ik7 g(em7 em7Var, Iterator it, ik7 ik7Var) {
        if (it != null) {
            while (it.hasNext()) {
                ik7 c = em7Var.d((ik7) it.next()).c((rf7) ik7Var);
                if (c instanceof eh7) {
                    eh7 eh7Var = (eh7) c;
                    String str = eh7Var.y;
                    if ("break".equals(str)) {
                        return ik7.p;
                    }
                    if ("return".equals(str)) {
                        return eh7Var;
                    }
                }
            }
        }
        return ik7.p;
    }

    public static boolean h(ik7 ik7Var, ik7 ik7Var2) {
        if (ik7Var instanceof uj7) {
            ik7Var = new tk7(ik7Var.d());
        }
        if (ik7Var2 instanceof uj7) {
            ik7Var2 = new tk7(ik7Var2.d());
        }
        if (((!(ik7Var instanceof tk7) || !(ik7Var2 instanceof tk7)) && (Double.isNaN(ik7Var.h().doubleValue()) || Double.isNaN(ik7Var2.h().doubleValue()))) || d(ik7Var2, ik7Var)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:240:0x05f3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:533:0x0c72. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v100, types: [ik7] */
    /* JADX WARN: Type inference failed for: r10v103, types: [ik7] */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v340, types: [rf7] */
    /* JADX WARN: Type inference failed for: r10v347, types: [zj7] */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r10v384 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, vs7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ik7 a(java.lang.String r11, defpackage.vs7 r12, java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 3834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al7.a(java.lang.String, vs7, java.util.ArrayList):ik7");
    }

    public final void b(String str) {
        if (this.a.contains(fy5.o(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
