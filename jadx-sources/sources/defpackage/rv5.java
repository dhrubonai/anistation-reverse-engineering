package defpackage;

import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class rv5 {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final long b(long j, n05 n05Var) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = n05Var.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = n05Var.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = n05Var.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = n05Var.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final long c(dd6 dd6Var, long j) {
        xc4 xc4Var;
        long j2;
        ha3 e = dd6Var.e();
        if (e != null) {
            ha3 b = dd6Var.b();
            if (b != null) {
                if (e.m() && b.m()) {
                    j2 = e.B(b, j);
                } else {
                    j2 = j;
                }
                xc4Var = new xc4(j2);
            } else {
                xc4Var = null;
            }
            if (xc4Var != null) {
                return xc4Var.a;
            }
        }
        return j;
    }

    public static boolean d(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(1:19))(2:21|22))(3:23|24|25))(5:34|35|36|(1:38)|33)|26|27))|43|6|7|(0)(0)|26|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (((defpackage.t43) r9).G(r0) == r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v2, types: [h56, vz0, xz0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r12v2, types: [g56] */
    /* JADX WARN: Type inference failed for: r7v0, types: [gu5] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v5, types: [t43] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.gu5 r7, defpackage.nc0 r8, defpackage.nc0 r9, defpackage.kz r10, defpackage.l11 r11, defpackage.xz0 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.h56
            if (r0 == 0) goto L13
            r0 = r12
            h56 r0 = (defpackage.h56) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            h56 r0 = new h56
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.B
            int r1 = r0.C
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L43
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            java.lang.Throwable r7 = r0.A
            gu5 r8 = r0.x
            defpackage.m37.N(r12)     // Catch: java.lang.Throwable -> L88
            goto L85
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r4
        L35:
            g56 r7 = r0.z
            l11 r11 = r0.y
            gu5 r8 = r0.x
            defpackage.m37.N(r12)     // Catch: java.lang.Throwable -> L3f
            goto L5c
        L3f:
            r9 = move-exception
            r12 = r7
            r7 = r9
            goto L66
        L43:
            defpackage.m37.N(r12)
            g56 r12 = new g56
            r12.<init>(r8, r9, r10, r11)
            r0.x = r7     // Catch: java.lang.Throwable -> L62
            r0.y = r11     // Catch: java.lang.Throwable -> L62
            r0.z = r12     // Catch: java.lang.Throwable -> L62
            r0.C = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r12.e(r0)     // Catch: java.lang.Throwable -> L62
            if (r8 != r5) goto L5a
            goto L84
        L5a:
            r8 = r7
            r7 = r12
        L5c:
            y56 r9 = new y56
            r9.<init>(r7, r8, r11)
            return r9
        L62:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L66:
            su4 r9 = r12.E     // Catch: java.lang.Throwable -> L88
            r9.l(r4)     // Catch: java.lang.Throwable -> L88
            k5 r9 = r12.G     // Catch: java.lang.Throwable -> L88
            r9.f(r4)     // Catch: java.lang.Throwable -> L88
            ar0 r9 = r12.z     // Catch: java.lang.Throwable -> L88
            r0.x = r8     // Catch: java.lang.Throwable -> L88
            r0.y = r4     // Catch: java.lang.Throwable -> L88
            r0.z = r4     // Catch: java.lang.Throwable -> L88
            r0.A = r7     // Catch: java.lang.Throwable -> L88
            r0.C = r2     // Catch: java.lang.Throwable -> L88
            t43 r9 = (defpackage.t43) r9     // Catch: java.lang.Throwable -> L88
            java.lang.Object r9 = r9.G(r0)     // Catch: java.lang.Throwable -> L88
            if (r9 != r5) goto L85
        L84:
            return r5
        L85:
            r8.close()     // Catch: java.lang.Throwable -> L88
        L88:
            boolean r8 = r7 instanceof defpackage.go0
            if (r8 == 0) goto L94
            k56 r8 = new k56
            java.lang.String r9 = "Negotiation failed due to EOS"
            r8.<init>(r9, r7)
            throw r8
        L94:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv5.e(gu5, nc0, nc0, kz, l11, xz0):java.lang.Object");
    }

    public static final void f(or2 or2Var, String str, Object obj) {
        or2Var.getClass();
        if (obj != null) {
            eo3 eo3Var = or2Var.a.j;
            String obj2 = obj.toString();
            str.getClass();
            obj2.getClass();
            ((kk2) eo3Var.y).h(lo0.f(str, false), lo0.f(obj2, true));
        }
    }

    public static rk6 g(rk6 rk6Var, String[] strArr, Map map) {
        int i = 0;
        if (rk6Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (rk6) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                rk6 rk6Var2 = new rk6();
                int length = strArr.length;
                while (i < length) {
                    rk6Var2.a((rk6) map.get(strArr[i]));
                    i++;
                }
                return rk6Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                rk6Var.a((rk6) map.get(strArr[0]));
                return rk6Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    rk6Var.a((rk6) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return rk6Var;
    }

    public static lp i() {
        hr0 hr0Var = new hr0(-1, -1, 0, true);
        Parcelable.Creator<lp> creator = lp.CREATOR;
        lp lpVar = new lp(hr0Var, false);
        lpVar.z = false;
        return lpVar;
    }

    public int h() {
        return 0;
    }

    public ia8 j(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    public Object k(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    public Object l(ia8 ia8Var) {
        return null;
    }
}
