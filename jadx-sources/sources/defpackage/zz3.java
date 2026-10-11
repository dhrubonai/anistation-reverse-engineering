package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zz3 {
    public final oa a;
    public f44 b;
    public f44 c;
    public f44 d;
    public f44 e;
    public boolean f;

    public zz3(oa oaVar) {
        this.a = oaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [xz3] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(xz3 xz3Var, kw4 kw4Var) {
        if (!xz3Var.x.K) {
            ez2.b("visitSubtreeIf called on an unattached node");
        }
        z44 z44Var = new z44(new xz3[16], 0);
        xz3 xz3Var2 = xz3Var.x;
        xz3 xz3Var3 = xz3Var2.C;
        if (xz3Var3 == null) {
            wc7.f(z44Var, xz3Var2);
        } else {
            z44Var.b(xz3Var3);
        }
        while (true) {
            int i = z44Var.z;
            if (i != 0) {
                xz3 xz3Var4 = (xz3) z44Var.m(i - 1);
                if ((xz3Var4.A & 32) != 0) {
                    for (xz3 xz3Var5 = xz3Var4; xz3Var5 != null && xz3Var5.K; xz3Var5 = xz3Var5.C) {
                        if ((xz3Var5.z & 32) != 0) {
                            zc1 zc1Var = xz3Var5;
                            ?? r6 = 0;
                            while (zc1Var != 0) {
                                if (zc1Var instanceof a04) {
                                    if (((a04) zc1Var).Y().r(kw4Var)) {
                                        break;
                                    }
                                } else if ((zc1Var.z & 32) != 0 && (zc1Var instanceof zc1)) {
                                    xz3 xz3Var6 = zc1Var.M;
                                    int i2 = 0;
                                    zc1Var = zc1Var;
                                    r6 = r6;
                                    while (xz3Var6 != null) {
                                        if ((xz3Var6.z & 32) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                zc1Var = xz3Var6;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new z44(new xz3[16], 0);
                                                }
                                                if (zc1Var != 0) {
                                                    r6.b(zc1Var);
                                                    zc1Var = 0;
                                                }
                                                r6.b(xz3Var6);
                                            }
                                        }
                                        xz3Var6 = xz3Var6.C;
                                        zc1Var = zc1Var;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zc1Var = wc7.J(r6);
                            }
                        }
                    }
                }
                wc7.f(z44Var, xz3Var4);
            } else {
                return;
            }
        }
    }

    public final void a() {
        if (!this.f) {
            this.f = true;
            vt0 vt0Var = new vt0(this, (byte) 24);
            f44 f44Var = this.a.N0;
            if (!f44Var.e(vt0Var)) {
                f44Var.a(vt0Var);
            }
        }
    }
}
