package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface a04 extends yc1 {
    default iv Y() {
        return pt1.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a04, yc1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [xz3] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [xz3] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    default Object h() {
        kf kfVar;
        kw4 kw4Var = a34.t;
        xz3 xz3Var = (xz3) this;
        if (!xz3Var.x.K) {
            ez2.a("ModifierLocal accessed from an unattached node");
        }
        if (!xz3Var.x.K) {
            ez2.b("visitAncestors called on an unattached node");
        }
        xz3 xz3Var2 = xz3Var.x.B;
        za3 O = wc7.O(this);
        while (O != null) {
            if ((((xz3) O.c0.D).A & 32) != 0) {
                while (xz3Var2 != null) {
                    if ((xz3Var2.z & 32) != 0) {
                        zc1 zc1Var = xz3Var2;
                        ?? r4 = 0;
                        while (zc1Var != 0) {
                            if (zc1Var instanceof a04) {
                                a04 a04Var = (a04) zc1Var;
                                if (a04Var.Y().r(kw4Var)) {
                                    return a04Var.Y().w(kw4Var);
                                }
                            } else if ((zc1Var.z & 32) != 0 && (zc1Var instanceof zc1)) {
                                xz3 xz3Var3 = zc1Var.M;
                                int i = 0;
                                zc1Var = zc1Var;
                                r4 = r4;
                                while (xz3Var3 != null) {
                                    if ((xz3Var3.z & 32) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            zc1Var = xz3Var3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new z44(new xz3[16], 0);
                                            }
                                            if (zc1Var != 0) {
                                                r4.b(zc1Var);
                                                zc1Var = 0;
                                            }
                                            r4.b(xz3Var3);
                                        }
                                    }
                                    xz3Var3 = xz3Var3.C;
                                    zc1Var = zc1Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            zc1Var = wc7.J(r4);
                        }
                    }
                    xz3Var2 = xz3Var2.B;
                }
            }
            O = O.v();
            if (O != null && (kfVar = O.c0) != null) {
                xz3Var2 = (z66) kfVar.C;
            } else {
                xz3Var2 = null;
            }
        }
        return kw4Var.a.invoke();
    }
}
