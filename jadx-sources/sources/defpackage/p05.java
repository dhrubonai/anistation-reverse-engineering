package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p05 {
    public final a13 a;
    public final oa b;
    public final eb2 c;
    public final hj3 d;
    public final f44 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ca i;
    public long j;
    public final nj4 k;
    public final o44 l;

    /* JADX WARN: Type inference failed for: r5v2, types: [hj3, java.lang.Object] */
    public p05(s34 s34Var, oa oaVar) {
        this.a = s34Var;
        this.b = oaVar;
        eb2 eb2Var = new eb2((byte) 9);
        eb2Var.z = new long[192];
        eb2Var.A = new long[192];
        this.c = eb2Var;
        ?? obj = new Object();
        s34 s34Var2 = b13.a;
        obj.e = new s34();
        obj.a = -1L;
        obj.b = 0L;
        obj.c = 0L;
        this.d = obj;
        this.e = new f44();
        this.j = -1L;
        this.k = new nj4(this, (byte) 5);
        this.l = new o44();
    }

    public static boolean c(fa4 fa4Var) {
        ih4 ih4Var = fa4Var.q0;
        if (ih4Var != null && !v94.z(((fi2) ih4Var).b())) {
            return true;
        }
        return false;
    }

    public static long f(za3 za3Var) {
        kf kfVar = za3Var.c0;
        fa4 fa4Var = (fa4) kfVar.B;
        long j = 0;
        for (fa4 fa4Var2 = (kz2) kfVar.A; fa4Var2 != null && fa4Var2 != fa4Var; fa4Var2 = fa4Var2.T) {
            if (c(fa4Var2)) {
                return 9223372034707292159L;
            }
            j = c13.d(j, fa4Var2.c0);
        }
        return j;
    }

    public static void i(za3 za3Var) {
        if (za3Var.z && !c((fa4) za3Var.c0.B)) {
            za3Var.z = false;
            if (za3Var.B) {
                za3Var.A = f(za3Var);
                za3Var.B = false;
            }
            if (!c13.b(za3Var.A, 9223372034707292159L)) {
                z44 A = za3Var.A();
                Object[] objArr = A.x;
                int i = A.z;
                for (int i2 = 0; i2 < i; i2++) {
                    i((za3) objArr[i2]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p05.a():void");
    }

    public final long b(za3 za3Var) {
        if (za3Var.D != -4) {
            return (((int) r4) & 4294967295L) | (((int) (((long[]) this.c.z)[d(za3Var)] >> 32)) << 32);
        }
        return 9223372034707292159L;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.za3 r8) {
        /*
            r7 = this;
            int r0 = r8.D
            r1 = -4
            if (r0 != r1) goto L7
        L5:
            r0 = r1
            goto L3b
        L7:
            int r2 = r8.y
            eb2 r7 = r7.c
            java.lang.Object r3 = r7.z
            long[] r3 = (long[]) r3
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            if (r0 < 0) goto L25
            int r5 = r7.y
            int r5 = r5 + (-2)
            if (r0 >= r5) goto L25
            int r5 = r0 + 2
            r5 = r3[r5]
            int r5 = (int) r5
            r5 = r5 & r4
            r6 = r2 & r4
            if (r5 != r6) goto L25
            goto L3b
        L25:
            r0 = r2 & r4
            int r7 = r7.y
            r2 = 0
        L2a:
            int r5 = r7 + (-2)
            if (r2 >= r5) goto L5
            int r5 = r2 + 2
            r5 = r3[r5]
            int r5 = (int) r5
            r5 = r5 & r4
            if (r5 != r0) goto L38
            r0 = r2
            goto L3b
        L38:
            int r2 = r2 + 3
            goto L2a
        L3b:
            if (r0 == r1) goto L3e
            goto L56
        L3e:
            int r7 = r8.y
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutNode "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " not found in RectList"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            defpackage.ez2.a(r7)
        L56:
            r8.D = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p05.d(za3):int");
    }

    public final void e(za3 za3Var) {
        int i;
        za3Var.z = true;
        kf kfVar = za3Var.c0;
        fa4 fa4Var = (fa4) kfVar.B;
        uo3 uo3Var = za3Var.d0.p;
        int S = uo3Var.S();
        float R = uo3Var.R();
        o44 o44Var = this.l;
        o44Var.a = 0.0f;
        o44Var.b = 0.0f;
        o44Var.c = S;
        o44Var.d = R;
        while (true) {
            if (fa4Var == null) {
                break;
            }
            za3 za3Var2 = fa4Var.R;
            if (fa4Var == ((fa4) za3Var2.c0.B) && !za3Var2.z) {
                if (!c13.b(b(za3Var2), 9223372034707292159L)) {
                    o44Var.c((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            ih4 ih4Var = fa4Var.q0;
            if (ih4Var != null) {
                float[] b = ((fi2) ih4Var).b();
                if (!v94.z(b)) {
                    jo3.c(b, o44Var);
                }
            }
            long j = fa4Var.c0;
            o44Var.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            fa4Var = fa4Var.T;
        }
        int i2 = (int) o44Var.a;
        int i3 = (int) o44Var.b;
        int i4 = (int) o44Var.c;
        int i5 = (int) o44Var.d;
        int i6 = za3Var.y;
        int i7 = za3Var.D;
        eb2 eb2Var = this.c;
        int i8 = -4;
        if (i7 != -4) {
            int d = d(za3Var);
            long[] jArr = (long[]) eb2Var.z;
            jArr[d] = (i2 << 32) | (i3 & 4294967295L);
            jArr[d + 1] = (4294967295L & i5) | (i4 << 32);
            int i9 = d + 2;
            long j2 = jArr[i9];
            jArr[i9] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            za3 v = za3Var.v();
            if (v != null) {
                i = v.y;
            } else {
                i = -1;
            }
            int i10 = i;
            if (v != null) {
                i8 = d(v);
            }
            za3Var.D = eb2Var.m(i6, i2, i3, i4, i5, i10, i8, kfVar.g(1024), kfVar.g(16), ((s34) this.d.e).a(i6));
        }
        za3Var.C = false;
        this.f = true;
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i11 = A.z;
        for (int i12 = 0; i12 < i11; i12++) {
            za3 za3Var3 = (za3) objArr[i12];
            if (za3Var3.J()) {
                e(za3Var3);
            }
        }
    }

    public final void g(za3 za3Var) {
        long j;
        boolean J = za3Var.J();
        kf kfVar = za3Var.c0;
        if (J && za3Var.C) {
            za3 v = za3Var.v();
            if (v != null && !v.z) {
                if (v.B) {
                    v.B = false;
                    v.A = f(v);
                }
                j = v.A;
            } else if (v == null) {
                j = 0;
            } else {
                j = 9223372034707292159L;
            }
            fa4 fa4Var = (fa4) kfVar.B;
            if (!c13.b(j, 9223372034707292159L) && !c(fa4Var)) {
                if (!za3Var.z) {
                    long d = c13.d(j, fa4Var.c0);
                    uo3 uo3Var = za3Var.d0.p;
                    int S = uo3Var.S();
                    int R = uo3Var.R();
                    int i = za3Var.D;
                    eb2 eb2Var = this.c;
                    if (i != -4) {
                        int d2 = d(za3Var);
                        if (v != null) {
                            int d3 = d(v);
                            long[] jArr = (long[]) eb2Var.z;
                            long j2 = jArr[d3];
                            int i2 = ((int) (j2 >> 32)) + ((int) (d >> 32));
                            int i3 = ((int) j2) + ((int) (d & 4294967295L));
                            long j3 = jArr[d2];
                            int i4 = i2 - ((int) (j3 >> 32));
                            int i5 = i3 - ((int) j3);
                            int i6 = d2 + 2;
                            long j4 = jArr[i6];
                            jArr[d2] = (i2 << 32) | (i3 & 4294967295L);
                            jArr[d2 + 1] = ((S + i2) << 32) | ((R + i3) & 4294967295L);
                            jArr[i6] = (((j4 >> 63) & 1) << 60) | j4;
                            if (i4 != 0 || i5 != 0) {
                                eb2Var.F(d2, i4, i5, j4);
                            }
                        } else {
                            int d4 = d(za3Var);
                            int i7 = (int) (d >> 32);
                            int i8 = (int) (d & 4294967295L);
                            long[] jArr2 = (long[]) eb2Var.z;
                            long j5 = jArr2[d4];
                            jArr2[d4] = (i8 & 4294967295L) | (i7 << 32);
                            jArr2[d4 + 1] = ((R + i8) & 4294967295L) | ((S + i7) << 32);
                            int i9 = d4 + 2;
                            long j6 = jArr2[i9];
                            jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                            int i10 = i7 - ((int) (j5 >> 32));
                            int i11 = i8 - ((int) j5);
                            if (i10 != 0 || i11 != 0) {
                                eb2Var.F(d4, i10, i11, j6);
                            }
                        }
                    } else {
                        int i12 = za3Var.y;
                        boolean g = kfVar.g(1024);
                        boolean g2 = kfVar.g(16);
                        boolean a = ((s34) this.d.e).a(i12);
                        if (v != null) {
                            int i13 = v.y;
                            int d5 = d(v);
                            int i14 = (int) (d >> 32);
                            int i15 = (int) (d & 4294967295L);
                            int i16 = i12 & 33554431;
                            long[] jArr3 = (long[]) eb2Var.z;
                            if ((((int) jArr3[d5 + 2]) & 33554431) != (33554431 & i13)) {
                                ez2.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                            }
                            long j7 = jArr3[d5];
                            int i17 = (int) j7;
                            int i18 = ((int) (j7 >> 32)) + i14;
                            int i19 = i17 + i15;
                            za3Var.D = eb2Var.m(i16, i18, i19, S + i18, i19 + R, i13, d5, g, g2, a);
                        } else {
                            int i20 = (int) (d >> 32);
                            int i21 = (int) (d & 4294967295L);
                            za3Var.D = eb2Var.m(i12, i20, i21, i20 + S, i21 + R, -1, -4, g, g2, a);
                        }
                    }
                } else {
                    e(za3Var);
                    i(za3Var);
                }
            } else {
                e(za3Var);
            }
            za3Var.C = false;
            this.f = true;
            j();
        }
    }

    public final void h(za3 za3Var) {
        if (za3Var.D != -4) {
            int d = d(za3Var);
            long[] jArr = (long[]) this.c.z;
            jArr[d] = -1;
            jArr[d + 1] = -1;
            jArr[d + 2] = o05.a;
            za3Var.D = -4;
            za3Var.C = true;
            this.f = true;
            this.h = true;
        }
    }

    public final void j() {
        boolean z;
        ca caVar = this.i;
        if (caVar != null) {
            z = true;
        } else {
            z = false;
        }
        long j = this.d.a;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            oa oaVar = this.b;
            if (caVar != null) {
                oaVar.removeCallbacks(caVar);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.j = max;
            ca caVar2 = new ca(this.k, (byte) 1);
            oaVar.postDelayed(caVar2, max - currentTimeMillis);
            this.i = caVar2;
        }
    }
}
