package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class eu0 {
    public static final se4 a = new se4("provider");
    public static final se4 b = new se4("provider");
    public static final se4 c = new se4("compositionLocalMap");
    public static final se4 d = new se4("providers");
    public static final se4 e = new se4("reference");

    public static final void a(String str) {
        throw new lt0(qx1.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new lt0(qx1.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [nt1] */
    public static final j14 c(vu0 vu0Var, k14 k14Var, bs5 bs5Var, nr nrVar) {
        q18 q18Var;
        yr5 yr5Var;
        int length;
        Object obj;
        ?? r6;
        ed2 ed2Var;
        long[] jArr;
        ed2 ed2Var2;
        q18 q18Var2;
        yr5 yr5Var2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        long[] jArr3;
        int i4;
        long j2;
        long[] jArr4;
        int i5;
        int i6;
        int E;
        int E2;
        k14 k14Var2 = k14Var;
        q18 q18Var3 = au0.a;
        yr5 yr5Var3 = new yr5();
        if (bs5Var.e != null) {
            yr5Var3.c();
        }
        if (bs5Var.f != null) {
            yr5Var3.H = new s34();
        }
        int i7 = bs5Var.t;
        if (nrVar != null && bs5Var.E(i7) > 0) {
            int i8 = bs5Var.v;
            while (i8 > 0 && !bs5Var.x(i8)) {
                i8 = bs5Var.F(bs5Var.b, i8);
            }
            if (i8 >= 0 && bs5Var.x(i8)) {
                Object D = bs5Var.D(i8);
                int i9 = i8 + 1;
                int t = bs5Var.t(i8) + i8;
                int i10 = 0;
                while (i9 < t) {
                    int t2 = bs5Var.t(i9) + i9;
                    if (t2 > i7) {
                        break;
                    }
                    if (bs5Var.x(i9)) {
                        E2 = 1;
                    } else {
                        E2 = bs5Var.E(i9);
                    }
                    i10 += E2;
                    i9 = t2;
                }
                if (bs5Var.x(i7)) {
                    E = 1;
                } else {
                    E = bs5Var.E(i7);
                }
                nrVar.j(D);
                nrVar.n(i10, E);
                nrVar.p();
            }
        }
        ed2 ed2Var3 = k14Var2.e;
        if (ed2Var3.a()) {
            vu0Var.getClass();
            if (vu0Var.K.e > 0) {
                r6 = new ArrayList();
                p44 p44Var = vu0Var.K;
                long[] jArr5 = p44Var.a;
                int length2 = jArr5.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j3 = jArr5[i11];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length2)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j3 & 255) < 128) {
                                    int i15 = i12;
                                    int i16 = (i11 << 3) + i14;
                                    ed2Var2 = ed2Var3;
                                    Object obj2 = p44Var.b[i16];
                                    Object obj3 = p44Var.c[i16];
                                    obj2.getClass();
                                    jArr2 = jArr5;
                                    if (obj3 instanceof q44) {
                                        q44 q44Var = (q44) obj3;
                                        Object[] objArr = q44Var.b;
                                        long[] jArr6 = q44Var.a;
                                        j = j3;
                                        int length3 = jArr6.length - 2;
                                        q18Var2 = q18Var3;
                                        yr5Var2 = yr5Var3;
                                        if (length3 >= 0) {
                                            int i17 = 0;
                                            while (true) {
                                                long j4 = jArr6[i17];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                                    int i19 = 0;
                                                    while (i19 < i18) {
                                                        if ((j4 & 255) < 128) {
                                                            i4 = i19;
                                                            int i20 = (i17 << 3) + i4;
                                                            j2 = j4;
                                                            Object obj4 = objArr[i20];
                                                            zz4 zz4Var = (zz4) obj2;
                                                            jArr4 = jArr6;
                                                            ed2 ed2Var4 = zz4Var.c;
                                                            if (ed2Var4 != null) {
                                                                ed2 h = tl7.h(ed2Var2);
                                                                i6 = i14;
                                                                ed2 h2 = tl7.h(ed2Var4);
                                                                int c2 = bs5Var.c(h);
                                                                i5 = length2;
                                                                int i21 = bs5Var.b[(c2 * 5) + 3] + c2;
                                                                int i22 = h2.a;
                                                                if (c2 <= i22 && i22 < i21) {
                                                                    r6.add(new ai4(zz4Var, obj4));
                                                                    q44Var.m(i20);
                                                                }
                                                                j4 = j2 >> i15;
                                                                i19 = i4 + 1;
                                                                jArr6 = jArr4;
                                                                length2 = i5;
                                                                i14 = i6;
                                                            }
                                                        } else {
                                                            i4 = i19;
                                                            j2 = j4;
                                                            jArr4 = jArr6;
                                                        }
                                                        i5 = length2;
                                                        i6 = i14;
                                                        j4 = j2 >> i15;
                                                        i19 = i4 + 1;
                                                        jArr6 = jArr4;
                                                        length2 = i5;
                                                        i14 = i6;
                                                    }
                                                    jArr3 = jArr6;
                                                    i = length2;
                                                    i2 = i14;
                                                    if (i18 != i15) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr6;
                                                    i = length2;
                                                    i2 = i14;
                                                }
                                                if (i17 == length3) {
                                                    break;
                                                }
                                                i17++;
                                                jArr6 = jArr3;
                                                length2 = i;
                                                i14 = i2;
                                                i15 = 8;
                                            }
                                        } else {
                                            i = length2;
                                            i2 = i14;
                                        }
                                        z2 = q44Var.g();
                                    } else {
                                        q18Var2 = q18Var3;
                                        yr5Var2 = yr5Var3;
                                        i = length2;
                                        j = j3;
                                        i2 = i14;
                                        obj3.getClass();
                                        zz4 zz4Var2 = (zz4) obj2;
                                        ed2 ed2Var5 = zz4Var2.c;
                                        if (ed2Var5 != null) {
                                            ed2 h3 = tl7.h(ed2Var2);
                                            ed2 h4 = tl7.h(ed2Var5);
                                            int c3 = bs5Var.c(h3);
                                            int i23 = bs5Var.b[(c3 * 5) + 3] + c3;
                                            int i24 = h4.a;
                                            if (c3 <= i24 && i24 < i23) {
                                                r6.add(new ai4(zz4Var2, obj3));
                                                z = true;
                                                z2 = z;
                                            }
                                        }
                                        z = false;
                                        z2 = z;
                                    }
                                    if (z2) {
                                        p44Var.m(i16);
                                    }
                                    i3 = 8;
                                } else {
                                    ed2Var2 = ed2Var3;
                                    q18Var2 = q18Var3;
                                    yr5Var2 = yr5Var3;
                                    jArr2 = jArr5;
                                    i = length2;
                                    j = j3;
                                    i2 = i14;
                                    i3 = i12;
                                }
                                j3 = j >> i3;
                                i14 = i2 + 1;
                                i12 = i3;
                                ed2Var3 = ed2Var2;
                                jArr5 = jArr2;
                                q18Var3 = q18Var2;
                                yr5Var3 = yr5Var2;
                                length2 = i;
                            }
                            ed2Var = ed2Var3;
                            q18Var = q18Var3;
                            yr5Var = yr5Var3;
                            jArr = jArr5;
                            int i25 = length2;
                            if (i13 != i12) {
                                break;
                            }
                            length2 = i25;
                        } else {
                            ed2Var = ed2Var3;
                            q18Var = q18Var3;
                            yr5Var = yr5Var3;
                            jArr = jArr5;
                        }
                        if (i11 == length2) {
                            break;
                        }
                        i11++;
                        ed2Var3 = ed2Var;
                        jArr5 = jArr;
                        q18Var3 = q18Var;
                        yr5Var3 = yr5Var;
                    }
                } else {
                    q18Var = q18Var3;
                    yr5Var = yr5Var3;
                }
            } else {
                q18Var = q18Var3;
                yr5Var = yr5Var3;
                r6 = nt1.x;
            }
            k14Var2 = k14Var;
            k14Var2.f = yo0.u0(r6, k14Var2.f);
        } else {
            q18Var = q18Var3;
            yr5Var = yr5Var3;
        }
        bs5 h5 = yr5Var.h();
        try {
            h5.d();
            q18 q18Var4 = q18Var;
            h5.R(126665345, k14Var2.a, false, q18Var4);
            bs5.y(h5);
            h5.T(k14Var2.b);
            List C = bs5Var.C(tl7.h(k14Var2.e), h5);
            h5.M();
            h5.i();
            h5.j();
            h5.e(true);
            yr5 yr5Var4 = yr5Var;
            j14 j14Var = new j14(yr5Var4);
            if (!C.isEmpty()) {
                int size = C.size();
                for (int i26 = 0; i26 < size; i26++) {
                    ed2 ed2Var6 = (ed2) C.get(i26);
                    if (yr5Var4.i(ed2Var6)) {
                        int b2 = yr5Var4.b(ed2Var6);
                        int d2 = as5.d(yr5Var4.x, b2);
                        int i27 = b2 + 1;
                        if (i27 < yr5Var4.y) {
                            length = yr5Var4.x[(i27 * 5) + 4];
                        } else {
                            length = yr5Var4.z.length;
                        }
                        if (length - d2 > 0) {
                            obj = yr5Var4.z[d2];
                        } else {
                            obj = q18Var4;
                        }
                        if (obj instanceof zz4) {
                            pz2 pz2Var = new pz2((Object) vu0Var, (Object) k14Var2, (byte) 11);
                            h5 = yr5Var4.h();
                            try {
                                t80.o(h5, C, pz2Var);
                                h5.e(true);
                                return j14Var;
                            } finally {
                            }
                        }
                    }
                }
            }
            return j14Var;
        } finally {
        }
    }
}
