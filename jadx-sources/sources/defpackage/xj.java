package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class xj {
    public static final tw5 a = z51.O(0.0f, 0.0f, null, 7);

    static {
        Map map = sw6.a;
        z51.O(0.0f, 0.0f, new vm1(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final px5 a(float f, j32 j32Var, String str, kd2 kd2Var) {
        return c(new vm1(f), db.n, j32Var, null, str, kd2Var, 24960, 8);
    }

    public static final px5 b(float f, ll llVar, String str, kd2 kd2Var, int i, int i2) {
        int i3 = i2 & 2;
        tw5 tw5Var = a;
        if (i3 != 0) {
            llVar = tw5Var;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (llVar == tw5Var) {
            kd2Var.e0(1144115775);
            boolean c = kd2Var.c(0.01f);
            Object Q = kd2Var.Q();
            if (c || Q == au0.a) {
                Q = z51.O(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                kd2Var.n0(Q);
            }
            llVar = (tw5) Q;
            kd2Var.q(false);
        } else {
            kd2Var.e0(1144225701);
            kd2Var.q(false);
        }
        return c(Float.valueOf(f), db.l, llVar, null, str2, kd2Var, (i << 3) & 57344, 0);
    }

    public static final px5 c(Object obj, tk6 tk6Var, ll llVar, Float f, String str, kd2 kd2Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object Q = kd2Var.Q();
        Object obj2 = au0.a;
        if (Q == obj2) {
            Q = xt5.g(null);
            kd2Var.n0(Q);
        }
        w44 w44Var = (w44) Q;
        Object Q2 = kd2Var.Q();
        if (Q2 == obj2) {
            Q2 = new wj(obj, tk6Var, f);
            kd2Var.n0(Q2);
        }
        wj wjVar = (wj) Q2;
        w44 h = xt5.h(null, kd2Var);
        if (f != null && (llVar instanceof tw5)) {
            tw5 tw5Var = (tw5) llVar;
            if (!a34.i(tw5Var.c, f)) {
                llVar = new tw5(tw5Var.a, tw5Var.b, f);
            }
        }
        w44 h2 = xt5.h(llVar, kd2Var);
        Object Q3 = kd2Var.Q();
        if (Q3 == obj2) {
            Q3 = iv.d(-1, 6, null);
            kd2Var.n0(Q3);
        }
        lj0 lj0Var = (lj0) Q3;
        boolean h3 = kd2Var.h(lj0Var) | kd2Var.h(obj);
        Object Q4 = kd2Var.Q();
        if (h3 || Q4 == obj2) {
            Q4 = new n(lj0Var, obj, (byte) 11);
            kd2Var.n0(Q4);
        }
        db.m((sb2) Q4, kd2Var);
        boolean h4 = kd2Var.h(lj0Var) | kd2Var.h(wjVar) | kd2Var.f(h2) | kd2Var.f(h);
        Object Q5 = kd2Var.Q();
        if (h4 || Q5 == obj2) {
            Object ljVar = new lj(lj0Var, wjVar, h2, h, (vz0) null);
            kd2Var.n0(ljVar);
            Q5 = ljVar;
        }
        db.f((ic2) Q5, kd2Var, lj0Var);
        px5 px5Var = (px5) w44Var.getValue();
        if (px5Var == null) {
            return wjVar.c;
        }
        return px5Var;
    }
}
