package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class p63 {
    public static final Object a(y43 y43Var, ne1 ne1Var, a23 a23Var) {
        qy4 qy4Var = new qy4(a23Var, ok0.c.d(16384), y43Var.a);
        try {
            Object f = new zy5(y43Var, i97.z, qy4Var, ne1Var.getDescriptor(), null).f(ne1Var);
            qy4Var.s();
            return f;
        } finally {
            qy4Var.H();
        }
    }

    public static final void b(y43 y43Var, b23 b23Var, mj5 mj5Var, Object obj) {
        mn0 mn0Var;
        mj5Var.getClass();
        az5[] az5VarArr = new az5[i97.E.b()];
        if (y43Var.a.e) {
            mn0Var = new fu0(b23Var, y43Var);
        } else {
            mn0Var = new mn0(b23Var);
        }
        new az5(mn0Var, y43Var, i97.z, az5VarArr).j(mj5Var, obj);
    }

    public static final <T> ni5 decodeToSequenceByReader(y43 y43Var, a23 a23Var, ne1 ne1Var, h61 h61Var) {
        Iterator a63Var;
        int i;
        String str;
        y43Var.getClass();
        a23Var.getClass();
        ne1Var.getClass();
        h61Var.getClass();
        qy4 qy4Var = new qy4(a23Var, new char[16384], y43Var.a);
        int ordinal = h61Var.ordinal();
        h61 h61Var2 = h61.x;
        if (ordinal != 0) {
            h61 h61Var3 = h61.y;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (qy4Var.z() == 8) {
                        qy4Var.i((byte) 8);
                    }
                } else {
                    ze0.l();
                    return null;
                }
            } else if (qy4Var.z() == 8) {
                qy4Var.i((byte) 8);
            } else {
                String V = h98.V((byte) 8);
                int i2 = qy4Var.y;
                if (i2 > 0) {
                    i = i2 - 1;
                } else {
                    i = i2;
                }
                yr yrVar = qy4Var.G;
                if (i2 != yrVar.y && i >= 0) {
                    str = String.valueOf(yrVar.x[i]);
                } else {
                    str = "EOF";
                }
                m1.u(qy4Var, qx1.n("Expected ", V, ", but had '", str, "' instead"), i, null, 4);
                throw null;
            }
            h61Var2 = h61Var3;
        }
        int ordinal2 = h61Var2.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    ze0.l();
                    return null;
                }
                ze0.m("AbstractJsonLexer.determineFormat must be called beforehand.");
                return null;
            }
            a63Var = new z53(y43Var, qy4Var, ne1Var);
        } else {
            a63Var = new a63(y43Var, qy4Var, ne1Var);
        }
        return wi5.p0(new o63(a63Var, (byte) 0));
    }

    public static final <T> ni5 decodeToSequenceByReader(y43 y43Var, a23 a23Var, h61 h61Var) {
        y43Var.getClass();
        a23Var.getClass();
        h61Var.getClass();
        a34.r0();
        throw null;
    }
}
