package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class kh1 {
    public static final ni1 a = new ni1("UNDEFINED", (byte) 2);
    public static final ni1 b = new ni1("REUSABLE_CLAIMED", (byte) 2);

    public static final void a(vz0 vz0Var, Object obj) {
        Object dr0Var;
        gn6 gn6Var;
        if (vz0Var instanceof jh1) {
            jh1 jh1Var = (jh1) vz0Var;
            n11 n11Var = jh1Var.A;
            xz0 xz0Var = jh1Var.B;
            Throwable b2 = z45.b(obj);
            if (b2 == null) {
                dr0Var = obj;
            } else {
                dr0Var = new dr0(b2, false);
            }
            if (c(n11Var, xz0Var.getContext())) {
                jh1Var.C = dr0Var;
                jh1Var.z = 1;
                b(n11Var, xz0Var.getContext(), jh1Var);
                return;
            }
            mw1 a2 = me6.a();
            if (a2.y >= 4294967296L) {
                jh1Var.C = dr0Var;
                jh1Var.z = 1;
                a2.z0(jh1Var);
                return;
            }
            a2.A0(true);
            try {
                h43 h43Var = (h43) xz0Var.getContext().get(h95.F);
                if (h43Var != null && !h43Var.isActive()) {
                    jh1Var.resumeWith(m37.l(h43Var.I()));
                } else {
                    Object obj2 = jh1Var.D;
                    l11 context = xz0Var.getContext();
                    Object c = ke6.c(context, obj2);
                    if (c != ke6.a) {
                        gn6Var = bx7.Q(xz0Var, context, c);
                    } else {
                        gn6Var = null;
                    }
                    try {
                        xz0Var.resumeWith(obj);
                    } finally {
                        if (gn6Var == null || gn6Var.m0()) {
                            ke6.a(context, c);
                        }
                    }
                }
                do {
                } while (a2.C0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        vz0Var.resumeWith(obj);
    }

    public static final void b(n11 n11Var, l11 l11Var, Runnable runnable) {
        try {
            n11Var.u0(l11Var, runnable);
        } catch (Throwable th) {
            throw new ih1(th, n11Var, l11Var);
        }
    }

    public static final boolean c(n11 n11Var, l11 l11Var) {
        try {
            return n11Var.w0(l11Var);
        } catch (Throwable th) {
            throw new ih1(th, n11Var, l11Var);
        }
    }
}
