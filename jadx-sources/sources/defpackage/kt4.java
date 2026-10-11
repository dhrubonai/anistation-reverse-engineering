package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kt4 {
    public final ti4 a = xt5.g(null);
    public final ti4 b = xt5.g(Boolean.TRUE);
    public boolean c;
    public ko4 d;
    public Object e;

    static {
        cr3.a("media3.ui.compose");
    }

    public kt4(boolean z) {
        this.c = z;
    }

    public static uq5 a(ko4 ko4Var) {
        if (ko4Var != null) {
            float f = ko4Var.z().a;
            float f2 = ko4Var.z().b;
            long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) != 0.0f) {
                int i2 = (int) (4294967295L & floatToRawIntBits);
                if (Float.intBitsToFloat(i2) == 0.0f) {
                    return null;
                }
                float f3 = ko4Var.z().c;
                double d = f3;
                if (d < 1.0d) {
                    floatToRawIntBits = uq5.a(floatToRawIntBits, Float.intBitsToFloat(i) * f3, 0.0f, 2);
                } else if (d > 1.0d) {
                    floatToRawIntBits = uq5.a(floatToRawIntBits, 0.0f, Float.intBitsToFloat(i2) / f3, 1);
                }
                return new uq5(floatToRawIntBits);
            }
            return null;
        }
        return null;
    }

    public final void b(ko4 ko4Var) {
        boolean z;
        boolean z2 = false;
        if (ko4Var != null) {
            if (ko4Var.t0(30) && !ko4Var.j0().a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!this.c && !z) {
                d(true);
            }
            if (z) {
                if (!ko4Var.t0(30) || !ko4Var.j0().a(2)) {
                    if (ko4Var.t0(30) && ko4Var.j0().a(3)) {
                        d(false);
                        return;
                    } else {
                        d(true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (((Boolean) this.b.getValue()).booleanValue() || !this.c) {
            z2 = true;
        }
        d(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ko4 r6, defpackage.xz0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jt4
            if (r0 == 0) goto L13
            r0 = r7
            jt4 r0 = (defpackage.jt4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            jt4 r0 = new jt4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.x
            w11 r1 = defpackage.w11.x
            int r2 = r0.z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 == r3) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r4
        L2a:
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L34
            er0 r6 = new er0     // Catch: java.lang.Throwable -> L34
            r7 = 3
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            goto L51
        L36:
            defpackage.m37.N(r7)
            r5.e(r6)     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L4b
            q r7 = new q     // Catch: java.lang.Throwable -> L34
            r2 = 28
            r7.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> L34
            r0.z = r3     // Catch: java.lang.Throwable -> L34
            defpackage.db.c0(r6, r7, r0)     // Catch: java.lang.Throwable -> L34
            return r1
        L4b:
            r5.e(r4)
            pn6 r5 = defpackage.pn6.a
            return r5
        L51:
            r5.e(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt4.c(ko4, xz0):java.lang.Object");
    }

    public final void d(boolean z) {
        this.b.setValue(Boolean.valueOf(z));
    }

    public final void e(ko4 ko4Var) {
        this.d = ko4Var;
        if (ko4Var != null || !this.c) {
            this.a.setValue(a(ko4Var));
        }
        b(ko4Var);
    }
}
