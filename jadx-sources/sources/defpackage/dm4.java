package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class dm4 implements ud1 {
    public boolean x;

    public static /* synthetic */ void h(dm4 dm4Var, em4 em4Var, int i, int i2) {
        dm4Var.f(em4Var, i, i2, 0.0f);
    }

    public static void i(dm4 dm4Var, em4 em4Var, long j) {
        dm4Var.e(em4Var);
        em4Var.V(c13.d(j, em4Var.B), 0.0f, null);
    }

    public static void j(dm4 dm4Var, em4 em4Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (dm4Var.c() != ia3.x && dm4Var.d() != 0) {
            int d = (dm4Var.d() - em4Var.x) - ((int) (j >> 32));
            dm4Var.e(em4Var);
            em4Var.V(c13.d((d << 32) | (((int) (j & 4294967295L)) & 4294967295L), em4Var.B), 0.0f, null);
        } else {
            dm4Var.e(em4Var);
            em4Var.V(c13.d(j, em4Var.B), 0.0f, null);
        }
    }

    public static void k(dm4 dm4Var, em4 em4Var, int i, int i2) {
        c94 c94Var = fm4.a;
        long j = (i << 32) | (i2 & 4294967295L);
        if (dm4Var.c() != ia3.x && dm4Var.d() != 0) {
            int d = (dm4Var.d() - em4Var.x) - ((int) (j >> 32));
            dm4Var.e(em4Var);
            em4Var.V(c13.d((d << 32) | (((int) (j & 4294967295L)) & 4294967295L), em4Var.B), 0.0f, c94Var);
        } else {
            dm4Var.e(em4Var);
            em4Var.V(c13.d(j, em4Var.B), 0.0f, c94Var);
        }
    }

    public static void l(dm4 dm4Var, em4 em4Var, long j) {
        c94 c94Var = fm4.a;
        if (dm4Var.c() != ia3.x && dm4Var.d() != 0) {
            int d = (dm4Var.d() - em4Var.x) - ((int) (j >> 32));
            dm4Var.e(em4Var);
            em4Var.V(c13.d((((int) (j & 4294967295L)) & 4294967295L) | (d << 32), em4Var.B), 0.0f, c94Var);
            return;
        }
        dm4Var.e(em4Var);
        em4Var.V(c13.d(j, em4Var.B), 0.0f, c94Var);
    }

    public static void m(dm4 dm4Var, em4 em4Var, long j, di2 di2Var) {
        if (dm4Var.c() != ia3.x && dm4Var.d() != 0) {
            int d = (dm4Var.d() - em4Var.x) - ((int) (j >> 32));
            dm4Var.e(em4Var);
            em4Var.Y(c13.d((((int) (j & 4294967295L)) & 4294967295L) | (d << 32), em4Var.B), 0.0f, di2Var);
            return;
        }
        dm4Var.e(em4Var);
        em4Var.Y(c13.d(j, em4Var.B), 0.0f, di2Var);
    }

    public static void n(dm4 dm4Var, em4 em4Var, int i, int i2, ub2 ub2Var, int i3) {
        if ((i3 & 8) != 0) {
            ub2Var = fm4.a;
        }
        dm4Var.e(em4Var);
        em4Var.V(c13.d((i2 & 4294967295L) | (i << 32), em4Var.B), 0.0f, ub2Var);
    }

    public static void o(dm4 dm4Var, em4 em4Var, long j) {
        c94 c94Var = fm4.a;
        dm4Var.e(em4Var);
        em4Var.V(c13.d(j, em4Var.B), 0.0f, c94Var);
    }

    public float a(yn2 yn2Var) {
        return Float.NaN;
    }

    public abstract ia3 c();

    public abstract int d();

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(em4 em4Var) {
        if (em4Var instanceof x04) {
            ((x04) em4Var).z(this.x);
        }
    }

    public final void f(em4 em4Var, int i, int i2, float f) {
        e(em4Var);
        em4Var.V(c13.d((i2 & 4294967295L) | (i << 32), em4Var.B), f, null);
    }
}
