package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class da4 implements ea4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [xz3] */
    /* JADX WARN: Type inference failed for: r8v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [xz3] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.ea4
    public final boolean d(xz3 xz3Var) {
        ?? r0 = 0;
        while (xz3Var != 0) {
            if (xz3Var instanceof xq4) {
                ((xq4) xz3Var).R();
            } else if ((xz3Var.z & 16) != 0 && (xz3Var instanceof zc1)) {
                xz3 xz3Var2 = xz3Var.M;
                int i = 0;
                r0 = r0;
                xz3Var = xz3Var;
                while (xz3Var2 != null) {
                    if ((xz3Var2.z & 16) != 0) {
                        i++;
                        r0 = r0;
                        if (i == 1) {
                            xz3Var = xz3Var2;
                        } else {
                            if (r0 == 0) {
                                r0 = new z44(new xz3[16], 0);
                            }
                            if (xz3Var != 0) {
                                r0.b(xz3Var);
                                xz3Var = 0;
                            }
                            r0.b(xz3Var2);
                        }
                    }
                    xz3Var2 = xz3Var2.C;
                    r0 = r0;
                    xz3Var = xz3Var;
                }
                if (i == 1) {
                }
            }
            xz3Var = wc7.J(r0);
        }
        return false;
    }

    @Override // defpackage.ea4
    public final int h() {
        return 16;
    }

    @Override // defpackage.ea4
    public final void l(za3 za3Var, long j, il2 il2Var, int i, boolean z) {
        za3Var.B(j, il2Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [xz3] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.ea4
    public final boolean q(il2 il2Var, za3 za3Var) {
        fa4 fa4Var = (fa4) za3Var.c0.B;
        fa4Var.getClass();
        xz3 b1 = fa4Var.b1(ga4.g(16));
        if (b1 != null && b1.K) {
            if (!b1.x.K) {
                ez2.b("visitLocalDescendants called on an unattached node");
            }
            xz3 xz3Var = b1.x;
            if ((xz3Var.A & 16) != 0) {
                while (xz3Var != null) {
                    if ((xz3Var.z & 16) != 0) {
                        zc1 zc1Var = xz3Var;
                        ?? r3 = 0;
                        while (zc1Var != 0) {
                            if (zc1Var instanceof xq4) {
                                if (((xq4) zc1Var).B0()) {
                                    il2Var.z = il2Var.x.b - 1;
                                    return true;
                                }
                            } else if ((zc1Var.z & 16) != 0 && (zc1Var instanceof zc1)) {
                                xz3 xz3Var2 = zc1Var.M;
                                int i = 0;
                                zc1Var = zc1Var;
                                r3 = r3;
                                while (xz3Var2 != null) {
                                    if ((xz3Var2.z & 16) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            zc1Var = xz3Var2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new z44(new xz3[16], 0);
                                            }
                                            if (zc1Var != 0) {
                                                r3.b(zc1Var);
                                                zc1Var = 0;
                                            }
                                            r3.b(xz3Var2);
                                        }
                                    }
                                    xz3Var2 = xz3Var2.C;
                                    zc1Var = zc1Var;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            zc1Var = wc7.J(r3);
                        }
                    }
                    xz3Var = xz3Var.C;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ea4
    public final boolean u(za3 za3Var) {
        return true;
    }
}
