package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ww0 {
    public static final s34 a;

    static {
        b65 b65Var = rp0.e;
        int i = b65Var.c;
        vw0 vw0Var = new vw0(b65Var, b65Var, 1);
        int i2 = b65Var.c;
        md4 md4Var = rp0.x;
        int i3 = (md4Var.c << 6) | i2;
        vw0 vw0Var2 = new vw0(b65Var, md4Var, 0);
        int i4 = (i2 << 6) | md4Var.c;
        vw0 vw0Var3 = new vw0(md4Var, b65Var, 0);
        s34 s34Var = b13.a;
        s34 s34Var2 = new s34();
        s34Var2.h(i | (i << 6), vw0Var);
        s34Var2.h(i3, vw0Var2);
        s34Var2.h(i4, vw0Var3);
        a = s34Var2;
    }
}
