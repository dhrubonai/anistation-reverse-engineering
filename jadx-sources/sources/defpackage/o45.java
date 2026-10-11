package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class o45 {
    public l35 a;
    public iw4 b;
    public String d;
    public mj2 e;
    public t45 g;
    public p45 h;
    public p45 i;
    public p45 j;
    public long k;
    public long l;
    public qb0 m;
    public int c = -1;
    public gk2 f = new gk2((byte) 0);

    public static void b(p45 p45Var, String str) {
        if (p45Var != null) {
            if (p45Var.D == null) {
                if (p45Var.E == null) {
                    if (p45Var.F == null) {
                        if (p45Var.G != null) {
                            ze0.e(str.concat(".priorResponse != null"));
                            return;
                        }
                        return;
                    }
                    ze0.e(str.concat(".cacheResponse != null"));
                    return;
                }
                ze0.e(str.concat(".networkResponse != null"));
                return;
            }
            ze0.e(str.concat(".body != null"));
        }
    }

    public final p45 a() {
        int i = this.c;
        if (i >= 0) {
            l35 l35Var = this.a;
            if (l35Var != null) {
                iw4 iw4Var = this.b;
                if (iw4Var != null) {
                    String str = this.d;
                    if (str != null) {
                        return new p45(l35Var, iw4Var, str, i, this.e, this.f.i(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
                    }
                    ze0.m("message == null");
                    return null;
                }
                ze0.m("protocol == null");
                return null;
            }
            ze0.m("request == null");
            return null;
        }
        p65.e(this.c, "code < 0: ");
        return null;
    }
}
