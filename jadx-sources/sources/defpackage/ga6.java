package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ga6 {
    public static final String a = b06.F(10, "H");

    public static long a(xd6 xd6Var, ud1 ud1Var, p82 p82Var) {
        cd b = b(xd6Var, ud1Var, p82Var, 1, false);
        return (rz5.a(b.a.i()) << 32) | (rz5.a(b.f) & 4294967295L);
    }

    public static final cd b(xd6 xd6Var, ud1 ud1Var, p82 p82Var, int i, boolean z) {
        String q0 = yo0.q0(db.r0(0, i), "\n", null, null, new tg5((byte) 25), 30);
        nt1 nt1Var = nt1.x;
        return new cd(new gd(q0, xd6Var, nt1Var, nt1Var, p82Var, ud1Var, z), i, 1, sx0.b(0, 0, 0, 0, 15));
    }
}
