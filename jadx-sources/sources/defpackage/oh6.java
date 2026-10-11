package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oh6 extends oa4 {
    public final za0 f;
    public bx5 g;

    public oh6(rd5 rd5Var, ns0 ns0Var, ud1 ud1Var) {
        super(rd5Var, ns0Var, ud1Var);
        this.f = iv.d(Integer.MAX_VALUE, 6, null);
    }

    public static mh6 e(za0 za0Var) {
        mh6 mh6Var = null;
        ri5 V = io3.V(new pa4(new c14(za0Var, (byte) 1), null));
        while (V.hasNext()) {
            mh6 mh6Var2 = (mh6) V.next();
            if (mh6Var != null) {
                mh6Var2 = mh6Var.a(mh6Var2);
            }
            mh6Var = mh6Var2;
        }
        return mh6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00dc, code lost:
    
        if (r16.b.invoke(r0, r6) != r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00de, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (b(r0, r6) == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.rd5 r17, defpackage.mh6 r18, defpackage.xz0 r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh6.c(rd5, mh6, xz0):java.lang.Object");
    }

    public final boolean d(nq4 nq4Var) {
        boolean z;
        boolean z2;
        boolean z3;
        za0 za0Var;
        rd5 rd5Var;
        boolean z4;
        boolean z5;
        boolean z6;
        uq4 uq4Var = (uq4) yo0.m0(nq4Var.a);
        if (uq4Var != null) {
            List b = uq4Var.b();
            int size = b.size();
            int i = 0;
            z3 = false;
            while (true) {
                za0Var = this.f;
                rd5Var = this.a;
                if (i >= size) {
                    break;
                }
                el2 el2Var = (el2) b.get(i);
                long j = el2Var.d ^ (-9223372034707292160L);
                if (rd5Var.j(rd5Var.f(j)) == 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    if ((za0Var.i(new mh6(j, el2Var.a, false)) instanceof ck0) && !z3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = uq4Var.l ^ (-9223372034707292160L);
            if (nq4Var.f == 12) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (rd5Var.j(rd5Var.f(j2)) == 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 || z4) {
                if (!(za0Var.i(new mh6(j2, uq4Var.b, z4)) instanceof ck0) || z3) {
                    z3 = true;
                }
            }
            if (z3 && !this.d) {
                return z2;
            }
            return z;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
        return z;
    }
}
