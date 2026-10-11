package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tm3 implements m55 {
    public boolean b;
    public boolean c;
    public boolean a = true;
    public final p44 d = new p44();

    @Override // defpackage.m55
    public final Object a(i55 i55Var) {
        Object obj = v94.p;
        Object obj2 = oi4.c;
        p44 p44Var = this.d;
        Object g = p44Var.g(i55Var);
        if (g == null) {
            return obj;
        }
        if (g instanceof f44) {
            f44 f44Var = (f44) g;
            Object l = f44Var.l(f44Var.b - 1);
            if (f44Var.i()) {
                p44Var.l(i55Var);
            }
            if (f44Var.b == 1) {
                Object f = f44Var.f();
                if (f instanceof f44) {
                    obj2 = new y85(f);
                } else if (f != null) {
                    obj2 = f;
                }
                p44Var.n(i55Var, obj2);
            }
            return l;
        }
        p44Var.l(i55Var);
        if (g instanceof y85) {
            return ((y85) g).a;
        }
        if (g == obj2) {
            return null;
        }
        return g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        if (r8 == null) goto L21;
     */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.i55 r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r6.c()
            if (r0 == 0) goto L64
            java.lang.Object r0 = defpackage.oi4.c
            p44 r6 = r6.d
            int r1 = r6.f(r7)
            if (r1 >= 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            r3 = 0
            if (r2 == 0) goto L18
            r4 = r3
            goto L1c
        L18:
            java.lang.Object[] r4 = r6.c
            r4 = r4[r1]
        L1c:
            if (r4 != 0) goto L2b
            boolean r3 = r8 instanceof defpackage.f44
            if (r3 == 0) goto L28
            y85 r0 = new y85
            r0.<init>(r8)
            goto L35
        L28:
            if (r8 != 0) goto L53
            goto L35
        L2b:
            boolean r5 = r4 instanceof defpackage.f44
            if (r5 == 0) goto L37
            r0 = r4
            f44 r0 = (defpackage.f44) r0
            r0.a(r8)
        L35:
            r8 = r0
            goto L53
        L37:
            boolean r5 = r4 instanceof defpackage.y85
            if (r5 == 0) goto L40
            y85 r4 = (defpackage.y85) r4
            java.lang.Object r3 = r4.a
            goto L44
        L40:
            if (r4 != r0) goto L43
            goto L44
        L43:
            r3 = r4
        L44:
            java.lang.Object[] r0 = defpackage.ec4.a
            f44 r0 = new f44
            r4 = 2
            r0.<init>(r4)
            r0.a(r3)
            r0.a(r8)
            goto L35
        L53:
            if (r2 == 0) goto L5f
            int r0 = ~r1
            java.lang.Object[] r1 = r6.b
            r1[r0] = r7
            java.lang.Object[] r6 = r6.c
            r6[r0] = r8
            return
        L5f:
            java.lang.Object[] r6 = r6.c
            r6[r1] = r8
            return
        L64:
            boolean r6 = r8 instanceof defpackage.j55
            if (r6 == 0) goto L6d
            j55 r8 = (defpackage.j55) r8
            r8.a()
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm3.b(i55, java.lang.Object):void");
    }

    public final boolean c() {
        if (this.a && !this.c) {
            return true;
        }
        return false;
    }

    public final void d() {
        p44 p44Var = this.d;
        Object[] objArr = p44Var.c;
        long[] jArr = p44Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof f44) {
                                f44 f44Var = (f44) obj;
                                Object[] objArr2 = f44Var.a;
                                int i4 = f44Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                    if (obj2 instanceof j55) {
                                        ((j55) obj2).a();
                                    }
                                }
                            } else if (obj instanceof j55) {
                                ((j55) obj).a();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        p44Var.a();
    }
}
