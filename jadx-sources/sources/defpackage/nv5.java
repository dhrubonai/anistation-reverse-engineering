package defpackage;

import android.graphics.RectF;
import android.os.StrictMode;
import android.text.Layout;
import java.io.EOFException;
import java.text.Bidi;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class nv5 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;

    public static final Object a(float f, float f2, float f3, ll llVar, ic2 ic2Var, t36 t36Var) {
        tk6 tk6Var = db.l;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        ub2 ub2Var = tk6Var.a;
        rl rlVar = (rl) ub2Var.invoke(f6);
        if (rlVar == null) {
            rlVar = ((rl) ub2Var.invoke(f4)).c();
        }
        rl rlVar2 = rlVar;
        Object b2 = b(new ml(tk6Var, f4, rlVar2, 56), new l76(llVar, tk6Var, f4, f5, rlVar2), Long.MIN_VALUE, new n36(ic2Var, (byte) 0), t36Var);
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        if (b2 != w11Var) {
            b2 = pn6Var;
        }
        if (b2 == w11Var) {
            return b2;
        }
        return pn6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0118 A[Catch: CancellationException -> 0x003e, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003e, blocks: (B:16:0x0039, B:18:0x0103, B:20:0x0118, B:25:0x013b, B:27:0x014b, B:29:0x0155, B:36:0x0162, B:37:0x0167, B:39:0x0168), top: B:15:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r0v11, types: [uf] */
    /* JADX WARN: Type inference failed for: r0v36, types: [uf] */
    /* JADX WARN: Type inference failed for: r1v10, types: [uf] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [w05] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [w05] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [w05] */
    /* JADX WARN: Type inference failed for: r1v24, types: [w05] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r5v11, types: [uf] */
    /* JADX WARN: Type inference failed for: r9v0, types: [q36, vz0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ml r25, defpackage.gl r26, long r27, final defpackage.ub2 r29, defpackage.xz0 r30) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv5.b(ml, gl, long, ub2, xz0):java.lang.Object");
    }

    public static /* synthetic */ Object c(float f, float f2, ll llVar, ic2 ic2Var, t36 t36Var, int i) {
        if ((i & 8) != 0) {
            llVar = z51.O(0.0f, 0.0f, null, 7);
        }
        return a(f, f2, 0.0f, llVar, ic2Var, t36Var);
    }

    public static final Object d(ml mlVar, f61 f61Var, boolean z, ub2 ub2Var, xz0 xz0Var) {
        long j;
        e61 e61Var = new e61(f61Var, mlVar.x, mlVar.y.getValue(), mlVar.z);
        if (z) {
            j = mlVar.A;
        } else {
            j = Long.MIN_VALUE;
        }
        Object b2 = b(mlVar, e61Var, j, ub2Var, xz0Var);
        if (b2 == w11.x) {
            return b2;
        }
        return pn6.a;
    }

    public static final Object e(ml mlVar, Float f, ll llVar, boolean z, ub2 ub2Var, xz0 xz0Var) {
        long j;
        l76 l76Var = new l76(llVar, mlVar.x, mlVar.y.getValue(), f, mlVar.z);
        if (z) {
            j = mlVar.A;
        } else {
            j = Long.MIN_VALUE;
        }
        Object b2 = b(mlVar, l76Var, j, ub2Var, xz0Var);
        if (b2 == w11.x) {
            return b2;
        }
        return pn6.a;
    }

    public static /* synthetic */ Object f(ml mlVar, Float f, tw5 tw5Var, boolean z, ub2 ub2Var, xz0 xz0Var, int i) {
        if ((i & 2) != 0) {
            tw5Var = z51.O(0.0f, 0.0f, null, 7);
        }
        tw5 tw5Var2 = tw5Var;
        if ((i & 8) != 0) {
            ub2Var = new tg5((byte) 20);
        }
        return e(mlVar, f, tw5Var2, z, ub2Var, xz0Var);
    }

    public static final void g(Long l, long j, xq2 xq2Var) {
        xq2Var.getClass();
        if (l == null || l.longValue() < 0 || xq2Var.equals(xq2.d) || l.longValue() == j) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l.longValue() + " bytes, but received " + j + " bytes").toString());
    }

    public static final void h(kl klVar, long j, float f, gl glVar, ml mlVar, ub2 ub2Var) {
        long j2;
        if (f == 0.0f) {
            j2 = glVar.c();
        } else {
            j2 = ((float) (j - klVar.c)) / f;
        }
        klVar.g = j;
        klVar.e.setValue(glVar.g(j2));
        klVar.f = glVar.e(j2);
        if (glVar.f(j2)) {
            klVar.h = klVar.g;
            klVar.i.setValue(Boolean.FALSE);
        }
        t(klVar, mlVar);
        ub2Var.invoke(klVar);
    }

    public static final float i(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final float j(l11 l11Var) {
        float f;
        q04 q04Var = (q04) l11Var.get(h95.G);
        if (q04Var != null) {
            f = q04Var.T();
        } else {
            f = 1.0f;
        }
        if (f >= 0.0f) {
            return f;
        }
        fs4.b("negative scale factor");
        return f;
    }

    public static final int k(zc6 zc6Var, Layout layout, kz kzVar, int i, RectF rectF, gg5 gg5Var, o0 o0Var, boolean z) {
        boolean z2;
        ka3[] ka3VarArr;
        d13 d13Var;
        float f;
        float i2;
        ka3[] ka3VarArr2;
        int i3;
        int D;
        float f2;
        float i4;
        int i5;
        int i6;
        int C;
        float f3;
        float i7;
        Bidi createLineBidi;
        boolean z3;
        boolean z4;
        float a2;
        float a3;
        float f4;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i8 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i8];
        Layout layout2 = zc6Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int e = zc6Var.e(i);
        if (i8 < (e - lineStart2) * 2) {
            fz2.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        wn2 wn2Var = new wn2(zc6Var);
        boolean z5 = false;
        if (layout2.getParagraphDirection(i) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i9 = 0;
        while (lineStart2 < e) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z2 && !isRtlCharAt) {
                a2 = wn2Var.a(lineStart2, z5, z5, true);
                f4 = wn2Var.a(lineStart2 + 1, true, true, true);
                z4 = z2;
            } else if (z2 && isRtlCharAt) {
                z4 = z2;
                f4 = wn2Var.a(lineStart2, false, false, false);
                a2 = wn2Var.a(lineStart2 + 1, true, true, false);
            } else {
                z4 = z2;
                if (isRtlCharAt) {
                    a3 = wn2Var.a(lineStart2, false, false, true);
                    a2 = wn2Var.a(lineStart2 + 1, true, true, true);
                } else {
                    a2 = wn2Var.a(lineStart2, false, false, false);
                    a3 = wn2Var.a(lineStart2 + 1, true, true, false);
                }
                f4 = a3;
            }
            fArr[i9] = a2;
            fArr[i9 + 1] = f4;
            i9 += 2;
            lineStart2++;
            z2 = z4;
            z5 = false;
        }
        Layout layout3 = (Layout) kzVar.x;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int w = kzVar.w(lineStart3, false);
        int x = kzVar.x(w);
        int i10 = lineStart3 - x;
        int i11 = lineEnd2 - x;
        Bidi q = kzVar.q(w);
        if (q != null && (createLineBidi = q.createLineBidi(i10, i11)) != null) {
            int runCount = createLineBidi.getRunCount();
            ka3VarArr = new ka3[runCount];
            int i12 = 0;
            while (i12 < runCount) {
                int runStart = createLineBidi.getRunStart(i12) + lineStart3;
                int runLimit = createLineBidi.getRunLimit(i12) + lineStart3;
                int i13 = runCount;
                if (createLineBidi.getRunLevel(i12) % 2 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ka3VarArr[i12] = new ka3(runStart, runLimit, z3);
                i12++;
                runCount = i13;
            }
        } else {
            ka3VarArr = new ka3[]{new ka3(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        }
        if (z) {
            d13Var = new d13(0, ka3VarArr.length - 1, 1);
        } else {
            d13Var = new d13(ka3VarArr.length - 1, 0, -1);
        }
        int i14 = d13Var.x;
        int i15 = d13Var.y;
        int i16 = d13Var.z;
        if ((i16 <= 0 || i14 > i15) && (i16 >= 0 || i15 > i14)) {
            return -1;
        }
        while (true) {
            ka3 ka3Var = ka3VarArr[i14];
            boolean z6 = ka3Var.c;
            int i17 = ka3Var.a;
            int i18 = ka3Var.b;
            if (z6) {
                f = fArr[((i18 - 1) - lineStart) * 2];
            } else {
                f = fArr[(i17 - lineStart) * 2];
            }
            if (z6) {
                i2 = i(i17, lineStart, fArr);
            } else {
                i2 = i(i18 - 1, lineStart, fArr);
            }
            float f5 = rectF.left;
            int i19 = i16;
            if (z) {
                if (i2 >= f5) {
                    float f6 = rectF.right;
                    if (f <= f6) {
                        if ((!z6 && f5 <= f) || (z6 && f6 >= i2)) {
                            i6 = i17;
                        } else {
                            int i20 = i18;
                            int i21 = i17;
                            while (true) {
                                i5 = i20;
                                if (i20 - i21 <= 1) {
                                    break;
                                }
                                int i22 = (i5 + i21) / 2;
                                float f7 = fArr[(i22 - lineStart) * 2];
                                if ((!z6 && f7 > rectF.left) || (z6 && f7 < rectF.right)) {
                                    i20 = i22;
                                } else {
                                    i20 = i5;
                                    i21 = i22;
                                }
                            }
                            if (z6) {
                                i6 = i5;
                            } else {
                                i6 = i21;
                            }
                        }
                        int D2 = gg5Var.D(i6);
                        if (D2 != -1 && (C = gg5Var.C(D2)) < i18) {
                            if (C >= i17) {
                                i17 = C;
                            }
                            if (D2 > i18) {
                                D2 = i18;
                            }
                            ka3VarArr2 = ka3VarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i23 = D2;
                            while (true) {
                                if (z6) {
                                    f3 = fArr[((i23 - 1) - lineStart) * 2];
                                } else {
                                    f3 = fArr[(i17 - lineStart) * 2];
                                }
                                rectF2.left = f3;
                                if (z6) {
                                    i7 = i(i17, lineStart, fArr);
                                } else {
                                    i7 = i(i23 - 1, lineStart, fArr);
                                }
                                rectF2.right = i7;
                                if (!((Boolean) o0Var.invoke(rectF2, rectF)).booleanValue()) {
                                    i17 = gg5Var.r(i17);
                                    if (i17 == -1 || i17 >= i18) {
                                        break;
                                    }
                                    i23 = gg5Var.D(i17);
                                    if (i23 > i18) {
                                        i23 = i18;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i17 = -1;
                        }
                    }
                }
                ka3VarArr2 = ka3VarArr;
                i17 = -1;
            } else {
                ka3VarArr2 = ka3VarArr;
                if (i2 >= f5) {
                    float f8 = rectF.right;
                    if (f <= f8) {
                        if ((!z6 && f8 >= i2) || (z6 && f5 <= f)) {
                            i3 = i18 - 1;
                        } else {
                            int i24 = i18;
                            int i25 = i17;
                            while (i24 - i25 > 1) {
                                int i26 = (i24 + i25) / 2;
                                float f9 = fArr[(i26 - lineStart) * 2];
                                int i27 = i24;
                                if ((!z6 && f9 > rectF.right) || (z6 && f9 < rectF.left)) {
                                    i24 = i26;
                                } else {
                                    i24 = i27;
                                    i25 = i26;
                                }
                            }
                            int i28 = i24;
                            if (z6) {
                                i3 = i28;
                            } else {
                                i3 = i25;
                            }
                        }
                        int C2 = gg5Var.C(i3 + 1);
                        if (C2 != -1 && (D = gg5Var.D(C2)) > i17) {
                            if (C2 < i17) {
                                C2 = i17;
                            }
                            if (D <= i18) {
                                i18 = D;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i29 = C2;
                            while (true) {
                                if (z6) {
                                    f2 = fArr[((i18 - 1) - lineStart) * 2];
                                } else {
                                    f2 = fArr[(i29 - lineStart) * 2];
                                }
                                rectF3.left = f2;
                                if (z6) {
                                    i4 = i(i29, lineStart, fArr);
                                } else {
                                    i4 = i(i18 - 1, lineStart, fArr);
                                }
                                rectF3.right = i4;
                                if (!((Boolean) o0Var.invoke(rectF3, rectF)).booleanValue()) {
                                    i18 = gg5Var.t(i18);
                                    if (i18 == -1 || i18 <= i17) {
                                        break;
                                    }
                                    i29 = gg5Var.C(i18);
                                    if (i29 < i17) {
                                        i29 = i17;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i18 = -1;
                i17 = i18;
            }
            if (i17 >= 0) {
                return i17;
            }
            if (i14 == i15) {
                return -1;
            }
            i14 += i19;
            i16 = i19;
            ka3VarArr = ka3VarArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d8, code lost:
    
        if (r3 == (-1)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dd, code lost:
    
        if (r12 <= r3) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
    
        r8.getClass();
        r6 = defpackage.db.V(r8, r19, java.lang.Math.max((int) (r10 - r3), 0), java.lang.Math.min(r8.b(), (int) (r12 - r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fa, code lost:
    
        if (r6 == (-1)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fd, code lost:
    
        r3 = r3 + r8.b();
        r8 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0105, code lost:
    
        if (r8 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0109, code lost:
    
        if (r3 < r12) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011c, code lost:
    
        defpackage.ze0.m("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011f, code lost:
    
        return r20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long l(defpackage.cv5 r18, byte r19, long r20, int r22) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv5.l(cv5, byte, long, int):long");
    }

    public static final int m(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] n(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ms.B0(0, i, 6, objArr, objArr2);
        ms.x0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final byte[] o(cv5 cv5Var, int i) {
        cv5Var.getClass();
        long j = i;
        if (j >= 0) {
            return p(cv5Var, i);
        }
        ze0.e(qx1.j(j, "byteCount (", ") < 0"));
        return null;
    }

    public static final byte[] p(cv5 cv5Var, int i) {
        if (i == -1) {
            for (long j = 2147483647L; cv5Var.c().z < 2147483647L && cv5Var.g(j); j *= 2) {
            }
            if (cv5Var.c().z < 2147483647L) {
                i = (int) cv5Var.c().z;
            } else {
                throw new IllegalStateException(("Can't create an array of size " + cv5Var.c().z).toString());
            }
        } else {
            cv5Var.m(i);
        }
        byte[] bArr = new byte[i];
        q(cv5Var.c(), bArr, i);
        return bArr;
    }

    public static final void q(cv5 cv5Var, byte[] bArr, int i) {
        cv5Var.getClass();
        q23.j(bArr.length, 0L, i);
        int i2 = 0;
        while (i2 < i) {
            int E = cv5Var.E(bArr, i2, i);
            if (E != -1) {
                i2 += E;
            } else {
                throw new EOFException(qx1.l("Source exhausted before reading ", i, " bytes. Only ", E, " bytes were read."));
            }
        }
    }

    public static final Object[] r(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ms.B0(0, i, 6, objArr, objArr2);
        ms.x0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] s(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ms.B0(0, i, 6, objArr, objArr2);
        ms.x0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void t(kl klVar, ml mlVar) {
        mlVar.y.setValue(klVar.e.getValue());
        rl rlVar = mlVar.z;
        rl rlVar2 = klVar.f;
        int b2 = rlVar.b();
        for (int i = 0; i < b2; i++) {
            rlVar.e(i, rlVar2.a(i));
        }
        mlVar.B = klVar.h;
        mlVar.A = klVar.g;
        mlVar.C = ((Boolean) klVar.i.getValue()).booleanValue();
    }

    public static final void u(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static int v(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static Object w(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
