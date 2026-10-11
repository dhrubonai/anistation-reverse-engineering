package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class d67 {
    public static final s34 a;
    public static final b67[] b;

    static {
        s34 s34Var = new s34(8);
        b67.a.getClass();
        c67 c67Var = a67.g;
        s34Var.h(1, c67Var);
        c67 c67Var2 = a67.f;
        s34Var.h(2, c67Var2);
        c67 c67Var3 = a67.b;
        s34Var.h(4, c67Var3);
        c67 c67Var4 = a67.d;
        s34Var.h(8, c67Var4);
        c67 c67Var5 = a67.h;
        s34Var.h(16, c67Var5);
        c67 c67Var6 = a67.e;
        s34Var.h(32, c67Var6);
        c67 c67Var7 = a67.i;
        s34Var.h(64, c67Var7);
        c67 c67Var8 = a67.c;
        s34Var.h(128, c67Var8);
        a = s34Var;
        b = new b67[]{c67Var, c67Var2, c67Var3, c67Var7, c67Var5, c67Var6, c67Var4, a67.j, c67Var8};
    }

    public static final void a(wl3 wl3Var, lz2 lz2Var, long j, int i, int i2) {
        if (!gy5.d(j, -1L)) {
            wl3Var.c(lz2Var.b, (int) ((j >>> 48) & 65535));
            wl3Var.c(lz2Var.c, (int) ((j >>> 32) & 65535));
            wl3Var.c(lz2Var.d, i - ((int) ((j >>> 16) & 65535)));
            wl3Var.c(lz2Var.e, i2 - ((int) (j & 65535)));
        }
    }
}
