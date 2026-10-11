package defpackage;

import android.text.Spanned;
import com.google.android.gms.common.api.Status;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class fz5 {
    public final /* synthetic */ byte x = 6;

    public static final op6 b(String str) {
        str.getClass();
        hm6 hm6Var = new hm6();
        im6.c(hm6Var, str);
        return hm6Var.b();
    }

    public static final void c(fq3 fq3Var, uq4 uq4Var) {
        wv wvVar = (wv) fq3Var.y;
        wr6 wr6Var = (wr6) wvVar.c;
        wr6 wr6Var2 = (wr6) wvVar.b;
        boolean w = t80.w(uq4Var);
        long j = uq4Var.b;
        if (w) {
            ms.E0(0, r4.length, null, wr6Var2.d);
            wr6Var2.e = 0;
            ms.E0(0, r4.length, null, wr6Var.d);
            wr6Var.e = 0;
            wvVar.a = 0L;
        }
        if (!t80.y(uq4Var)) {
            List b = uq4Var.b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                el2 el2Var = (el2) b.get(i);
                wvVar.a(el2Var.a, xc4.f(el2Var.e, 0L));
            }
            wvVar.a(j, xc4.f(uq4Var.n, 0L));
        }
        if (t80.y(uq4Var) && j - wvVar.a > 40) {
            ms.E0(0, r1.length, null, wr6Var2.d);
            wr6Var2.e = 0;
            ms.E0(0, r3.length, null, wr6Var.d);
            wr6Var.e = 0;
            wvVar.a = 0L;
        }
        wvVar.a = j;
    }

    public static final void d(StringBuilder sb, String str, kk2 kk2Var, boolean z) {
        List list;
        str.getClass();
        if (!uz5.V(str) && !b06.I(str, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) str);
        if (!((Map) kk2Var.x).isEmpty() || z) {
            sb.append("?");
        }
        Set<Map.Entry> a = kk2Var.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a) {
            String str2 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = te4.H(new ai4(str2, null));
            } else {
                ArrayList arrayList2 = new ArrayList(zo0.V(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new ai4(str2, (String) it.next()));
                }
                list = arrayList2;
            }
            dp0.Y(list, arrayList);
        }
        yo0.p0(arrayList, sb, "&", new ka6((byte) 16), 60);
    }

    public static final float e(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int f(int i, String str) {
        String str2;
        int i2;
        ks1 h = h();
        Integer num = null;
        if (h != null) {
            boolean z = true;
            if (h.c() != 1) {
                z = false;
            }
            bb4.s("Not initialized yet", z);
            bb4.r(str, "charSequence cannot be null");
            dn0 dn0Var = (dn0) h.e.b;
            dn0Var.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    hl6[] hl6VarArr = (hl6[]) spanned.getSpans(i, i + 1, hl6.class);
                    if (hl6VarArr.length > 0) {
                        i2 = spanned.getSpanEnd(hl6VarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((ws1) dn0Var.K(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new ws1(i))).z;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int g(int i, String str) {
        ks1 h = h();
        Integer num = null;
        if (h != null) {
            Integer valueOf = Integer.valueOf(h.b(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final ks1 h() {
        if (ks1.d()) {
            ks1 a = ks1.a();
            if (a.c() == 1) {
                return a;
            }
            return null;
        }
        return null;
    }

    public static final String i(op6 op6Var) {
        StringBuilder sb = new StringBuilder();
        String str = (String) op6Var.G.getValue();
        String str2 = (String) op6Var.H.getValue();
        boolean z = op6Var.B;
        str.getClass();
        str2.getClass();
        if (!uz5.V(str) && !b06.I(str, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) str);
        if (str2.length() > 0 || z) {
            sb.append((CharSequence) "?");
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static final String j(op6 op6Var) {
        return op6Var.x + ':' + op6Var.a();
    }

    public static final void k(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        float e;
        if (i == 0) {
            ez2.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        for (int i9 = 0; i9 < i3; i9++) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float e2 = e(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * e2);
                }
            }
            float sqrt = (float) Math.sqrt(e(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            for (int i13 = 0; i13 < i3; i13++) {
                if (i13 < i9) {
                    e = 0.0f;
                } else {
                    e = e(fArr7, fArr4[i13]);
                }
                fArr10[i13] = e;
            }
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float e3 = e(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    e3 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = e3 / fArr11[i14];
        }
    }

    public static final void l(l33 l33Var, p96 p96Var, p96 p96Var2, pz2 pz2Var, boolean z) {
        z44 z44Var = (z44) pz2Var.y;
        int i = z44Var.z;
        if (i > 1) {
            l33Var.m(new de6(0, p96Var.A.toString(), p96Var2.A.toString(), p96Var.B, p96Var2.B, 0L, false, 32));
            return;
        }
        if (i == 1) {
            jj0 jj0Var = (jj0) z44Var.x[0];
            long a = fy5.a(jj0Var.c, jj0Var.d);
            jj0 jj0Var2 = (jj0) ((z44) pz2Var.y).x[0];
            long a2 = fy5.a(jj0Var2.a, jj0Var2.b);
            if (!nd6.d(a) || !nd6.d(a2)) {
                l33Var.m(new de6(nd6.g(a), fy5.h(a, p96Var), fy5.h(a2, p96Var2), p96Var.B, p96Var2.B, 0L, z, 32));
            }
        }
    }

    public static void m(Status status, Object obj, p76 p76Var) {
        bp bpVar;
        if (status.x <= 0) {
            p76Var.b(obj);
            return;
        }
        if (status.z != null) {
            bpVar = new bp(status);
        } else {
            bpVar = new bp(status);
        }
        p76Var.a(bpVar);
    }

    public static final void n(hm6 hm6Var, op6 op6Var) {
        hm6Var.d = op6Var.E;
        hm6Var.a = op6Var.x;
        hm6Var.e(op6Var.a());
        jy5.h(hm6Var, (String) op6Var.G.getValue());
        hm6Var.e = (String) op6Var.I.getValue();
        hm6Var.f = (String) op6Var.J.getValue();
        kk2 kk2Var = new kk2((byte) 1);
        kk2Var.i(h98.K((String) op6Var.H.getValue()));
        hm6Var.i = kk2Var;
        hm6Var.j = new eo3((Object) kk2Var, (byte) 24);
        String str = (String) op6Var.K.getValue();
        str.getClass();
        hm6Var.g = str;
        hm6Var.b = op6Var.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0083 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v1, types: [t0, o97, l11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.xz0 r8) {
        /*
            l11 r0 = r8.getContext()
            defpackage.h98.o(r0)
            vz0 r8 = defpackage.wc7.z(r8)
            boolean r1 = r8 instanceof defpackage.jh1
            if (r1 == 0) goto L12
            jh1 r8 = (defpackage.jh1) r8
            goto L13
        L12:
            r8 = 0
        L13:
            w11 r1 = defpackage.w11.x
            pn6 r2 = defpackage.pn6.a
            if (r8 != 0) goto L1b
        L19:
            r8 = r2
            goto L81
        L1b:
            n11 r3 = r8.A
            boolean r4 = defpackage.kh1.c(r3, r0)
            r5 = 1
            if (r4 == 0) goto L2c
            r8.C = r2
            r8.z = r5
            r3.v0(r0, r8)
            goto L65
        L2c:
            o97 r4 = new o97
            y95 r6 = defpackage.o97.y
            r4.<init>(r6)
            l11 r0 = r0.plus(r4)
            r8.C = r2
            r8.z = r5
            r3.v0(r0, r8)
            boolean r0 = r4.x
            if (r0 == 0) goto L65
            mw1 r0 = defpackage.me6.a()
            bs r3 = r0.A
            if (r3 == 0) goto L4f
            boolean r3 = r3.isEmpty()
            goto L50
        L4f:
            r3 = r5
        L50:
            if (r3 == 0) goto L53
            goto L19
        L53:
            long r3 = r0.y
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 < 0) goto L67
            r8.C = r2
            r8.z = r5
            r0.z0(r8)
        L65:
            r8 = r1
            goto L81
        L67:
            r0.A0(r5)
            r8.run()     // Catch: java.lang.Throwable -> L77
        L6d:
            boolean r3 = r0.C0()     // Catch: java.lang.Throwable -> L77
            if (r3 != 0) goto L6d
        L73:
            r0.y0(r5)
            goto L19
        L77:
            r3 = move-exception
            r8.i(r3)     // Catch: java.lang.Throwable -> L7c
            goto L73
        L7c:
            r8 = move-exception
            r0.y0(r5)
            throw r8
        L81:
            if (r8 != r1) goto L84
            return r8
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz5.o(xz0):java.lang.Object");
    }

    public String toString() {
        switch (this.x) {
            case 6:
                return ((r88) this).y.toString();
            default:
                return super.toString();
        }
    }
}
