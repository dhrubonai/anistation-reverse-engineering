package defpackage;

import android.view.ViewConfiguration;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h14 extends oa4 {
    public final cn7 f;
    public final za0 g;
    public bx5 h;

    public h14(rd5 rd5Var, cn7 cn7Var, ns0 ns0Var, ud1 ud1Var) {
        super(rd5Var, ns0Var, ud1Var);
        this.f = cn7Var;
        this.g = iv.d(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.h14 r11, defpackage.w05 r12, defpackage.t05 r13, defpackage.rd5 r14, defpackage.w05 r15, long r16, defpackage.xz0 r18) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h14.e(h14, w05, t05, rd5, w05, long, xz0):java.lang.Object");
    }

    public static d14 g(za0 za0Var) {
        d14 d14Var = null;
        ri5 V = io3.V(new pa4(new c14(za0Var, (byte) 0), null));
        while (V.hasNext()) {
            d14 d14Var2 = (d14) V.next();
            if (d14Var != null) {
                d14Var2 = d14Var.a(d14Var2);
            }
            d14Var = d14Var2;
        }
        return d14Var;
    }

    public final float c(pd5 pd5Var, float f) {
        rd5 rd5Var = this.a;
        long i = rd5Var.i(rd5Var.e(f));
        rd5 rd5Var2 = pd5Var.a;
        return rd5Var.h(rd5Var.f(rd5Var2.d(rd5Var2.k, i, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0168 A[PHI: r12
      0x0168: PHI (r12v6 java.lang.Object) = (r12v4 java.lang.Object), (r12v7 java.lang.Object) binds: [B:38:0x00fe, B:28:0x0166] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0169 A[PHI: r16
      0x0169: PHI (r16v1 pn6) = (r16v0 pn6), (r16v2 pn6) binds: [B:36:0x00d4, B:28:0x0166] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r1v3, types: [t05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.rd5 r20, defpackage.d14 r21, float r22, float r23, defpackage.xz0 r24) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h14.d(rd5, d14, float, float, xz0):java.lang.Object");
    }

    public final boolean f(nq4 nq4Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.x;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = nq4Var.a;
        xc4 xc4Var = new xc4(0L);
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            j = xc4Var.a;
            if (i >= size) {
                break;
            }
            xc4Var = new xc4(xc4.f(j, ((uq4) list.get(i)).j));
            i++;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        rd5 rd5Var = this.a;
        float j2 = rd5Var.j(rd5Var.f(floatToRawIntBits));
        if (j2 != 0.0f) {
            kd5 kd5Var = rd5Var.a;
            if (j2 > 0.0f) {
                z = kd5Var.c();
            } else {
                z = kd5Var.b();
            }
        }
        if (z) {
            return !(this.g.i(new d14(floatToRawIntBits, ((uq4) yo0.k0(nq4Var.a)).b, false)) instanceof ck0);
        }
        return this.d;
    }
}
