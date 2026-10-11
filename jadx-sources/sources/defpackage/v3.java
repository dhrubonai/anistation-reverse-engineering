package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v3 extends t3 {
    public static v3 e;
    public static final c45 f = c45.y;
    public static final c45 g = c45.x;
    public bd6 c;
    public uh5 d;

    @Override // defpackage.t3
    public final int[] a(int i) {
        int i2;
        if (c().length() > 0 && i < c().length()) {
            try {
                uh5 uh5Var = this.d;
                if (uh5Var != null) {
                    n05 g2 = uh5Var.g();
                    int round = Math.round(g2.d - g2.b);
                    if (i <= 0) {
                        i = 0;
                    }
                    bd6 bd6Var = this.c;
                    if (bd6Var != null) {
                        int d = bd6Var.b.d(i);
                        bd6 bd6Var2 = this.c;
                        if (bd6Var2 != null) {
                            float f2 = bd6Var2.b.f(d) + round;
                            bd6 bd6Var3 = this.c;
                            if (bd6Var3 != null) {
                                float f3 = bd6Var3.b.f(r0.f - 1);
                                bd6 bd6Var4 = this.c;
                                if (f2 < f3) {
                                    if (bd6Var4 != null) {
                                        i2 = bd6Var4.b.e(f2);
                                    } else {
                                        a34.s0("layoutResult");
                                        throw null;
                                    }
                                } else if (bd6Var4 != null) {
                                    i2 = bd6Var4.b.f;
                                } else {
                                    a34.s0("layoutResult");
                                    throw null;
                                }
                                return b(i, e(i2 - 1, g) + 1);
                            }
                            a34.s0("layoutResult");
                            throw null;
                        }
                        a34.s0("layoutResult");
                        throw null;
                    }
                    a34.s0("layoutResult");
                    throw null;
                }
                a34.s0("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.t3
    public final int[] d(int i) {
        int i2;
        if (c().length() > 0 && i > 0) {
            try {
                uh5 uh5Var = this.d;
                if (uh5Var != null) {
                    n05 g2 = uh5Var.g();
                    int round = Math.round(g2.d - g2.b);
                    int length = c().length();
                    if (length <= i) {
                        i = length;
                    }
                    bd6 bd6Var = this.c;
                    if (bd6Var != null) {
                        int d = bd6Var.b.d(i);
                        bd6 bd6Var2 = this.c;
                        if (bd6Var2 != null) {
                            float f2 = bd6Var2.b.f(d) - round;
                            if (f2 > 0.0f) {
                                bd6 bd6Var3 = this.c;
                                if (bd6Var3 != null) {
                                    i2 = bd6Var3.b.e(f2);
                                } else {
                                    a34.s0("layoutResult");
                                    throw null;
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i == c().length() && i2 < d) {
                                i2++;
                            }
                            return b(e(i2, f), i);
                        }
                        a34.s0("layoutResult");
                        throw null;
                    }
                    a34.s0("layoutResult");
                    throw null;
                }
                a34.s0("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int e(int i, c45 c45Var) {
        bd6 bd6Var = this.c;
        if (bd6Var != null) {
            int h = bd6Var.h(i);
            bd6 bd6Var2 = this.c;
            if (bd6Var2 != null) {
                c45 i2 = bd6Var2.i(h);
                bd6 bd6Var3 = this.c;
                if (c45Var != i2) {
                    if (bd6Var3 != null) {
                        return bd6Var3.h(i);
                    }
                    a34.s0("layoutResult");
                    throw null;
                }
                if (bd6Var3 != null) {
                    return bd6Var3.b.c(i, false) - 1;
                }
                a34.s0("layoutResult");
                throw null;
            }
            a34.s0("layoutResult");
            throw null;
        }
        a34.s0("layoutResult");
        throw null;
    }
}
