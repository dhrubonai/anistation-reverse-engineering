package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wi5 extends xi5 {
    public static ni5 o0(Iterator it) {
        it.getClass();
        return p0(new o63(it, (byte) 1));
    }

    public static ni5 p0(ni5 ni5Var) {
        if (ni5Var instanceof fx0) {
            return ni5Var;
        }
        return new fx0(ni5Var);
    }

    public static Object q0(d32 d32Var) {
        c32 c32Var = new c32(d32Var);
        if (!c32Var.hasNext()) {
            return null;
        }
        return c32Var.next();
    }

    public static String r0(ni5 ni5Var, String str, ub2 ub2Var, int i) {
        if ((i & 32) != 0) {
            ub2Var = null;
        }
        ni5Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : ni5Var) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            ct5.e(sb, obj, ub2Var);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static d32 s0(d32 d32Var, ub2 ub2Var) {
        return new d32(new u22(d32Var, ub2Var, (byte) 4), false, new tg5((byte) 3));
    }

    public static ni5 t0(ni5 ni5Var, int i) {
        if (i >= 0) {
            if (i == 0) {
                return st1.a;
            }
            if (ni5Var instanceof aq1) {
                return ((aq1) ni5Var).a(i);
            }
            return new zp1(ni5Var, i, (byte) 1);
        }
        ze0.e(qx1.i(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List u0(ni5 ni5Var) {
        Iterator it = ni5Var.iterator();
        if (!it.hasNext()) {
            return nt1.x;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return te4.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
