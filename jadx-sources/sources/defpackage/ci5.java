package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ci5 {
    public static final Comparator[] a;
    public static final oa5 b;

    static {
        k82 k82Var;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                k82Var = k82.B;
            } else {
                k82Var = k82.z;
            }
            comparatorArr[i] = new n00(new n00(k82Var, (byte) 8), (byte) 9);
        }
        a = comparatorArr;
        b = new oa5((byte) 26);
    }

    public static final void a(uh5 uh5Var, ArrayList arrayList, l0 l0Var, l0 l0Var2, s34 s34Var) {
        ph5 ph5Var = uh5Var.d;
        Object g = ph5Var.x.g(yh5.n);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) l0Var2.invoke(uh5Var)).booleanValue()) && ((Boolean) l0Var.invoke(uh5Var)).booleanValue()) {
            arrayList.add(uh5Var);
        }
        if (booleanValue) {
            s34Var.h(uh5Var.f, b(uh5Var, l0Var, l0Var2, uh5.j(7, uh5Var)));
            return;
        }
        List j = uh5.j(7, uh5Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((uh5) j.get(i), arrayList, l0Var, l0Var2, s34Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.uh5 r17, defpackage.l0 r18, defpackage.l0 r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci5.b(uh5, l0, l0, java.util.List):java.util.ArrayList");
    }
}
