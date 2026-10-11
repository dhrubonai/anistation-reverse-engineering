package defpackage;

import android.content.Context;
import android.graphics.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class x97 {
    public static final m18 A;
    public static final p18 B;
    public final /* synthetic */ byte x = 18;
    public static final sr y = new sr((byte) 3);
    public static final tr z = new tr();
    public static final os0 C = new os0(1142441659, false, new qs0(3));
    public static final kn4 D = new kn4(new um4());
    public static final r18 E = new r18(22);
    public static final hb8 F = new hb8(1);

    static {
        byte b = 6;
        A = new m18(b);
        B = new p18(b);
    }

    public static File A(Context context, String str, String str2) {
        File file = new File(context.getFilesDir(), "offline_artworks");
        File file2 = new File(file, str);
        if ((!file2.exists() || file2.length() <= 0) && str2 != null) {
            File file3 = null;
            if (str2.equals(str)) {
                str2 = null;
            }
            if (str2 != null) {
                File file4 = new File(file, str2);
                if (file4.exists() && file4.length() > 0) {
                    file3 = file4;
                }
                if (file3 != null) {
                    return file3;
                }
            }
        }
        return file2;
    }

    public static File B(Context context, String str, Integer num) {
        context.getClass();
        str.getClass();
        String r = r(str);
        String str2 = null;
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                String valueOf = String.valueOf(num.intValue());
                valueOf.getClass();
                Pattern compile = Pattern.compile("[^A-Za-z0-9._-]");
                compile.getClass();
                String replaceAll = compile.matcher(valueOf).replaceAll("_");
                replaceAll.getClass();
                str2 = qx1.m("anime_", replaceAll, "_cover.jpg");
            }
        }
        return A(context, r, str2);
    }

    public static final vc1 C(l11 l11Var) {
        vc1 vc1Var;
        j11 j11Var = l11Var.get(h95.B);
        if (j11Var instanceof vc1) {
            vc1Var = (vc1) j11Var;
        } else {
            vc1Var = null;
        }
        if (vc1Var == null) {
            return n81.a;
        }
        return vc1Var;
    }

    public static File D(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(new File(context.getFilesDir(), "offline_artworks"), S(str));
    }

    public static final int E(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else if (i3 < 0) {
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        } else {
            ze0.k("Step is zero.");
            return 0;
        }
        return i2;
    }

    public static go4 F(go4 go4Var, go4 go4Var2) {
        if (go4Var != null) {
            g42 g42Var = go4Var.a;
            if (go4Var2 != null) {
                fo4 fo4Var = new fo4();
                for (int i = 0; i < g42Var.a.size(); i++) {
                    if (go4Var2.a(g42Var.a(i))) {
                        fo4Var.a.a(g42Var.a(i));
                    }
                }
                return fo4Var.b();
            }
        }
        return go4.b;
    }

    public static final y23 G(ic2 ic2Var, ub2 ub2Var) {
        gi3 gi3Var = new gi3(ic2Var);
        wk6.j(1, ub2Var);
        return new y23(gi3Var, ub2Var, (byte) 14);
    }

    public static yz3 H(yz3 yz3Var, xh4 xh4Var, dz0 dz0Var, float f, w60 w60Var, int i) {
        y50 y50Var = pk2.C;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return yz3Var.w(new yh4(xh4Var, y50Var, dz0Var, f, w60Var));
    }

    public static final boolean I(String str) {
        str.getClass();
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static void J(int i, int[] iArr, int[] iArr2, boolean z2) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z2) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i7;
            } else {
                return;
            }
        }
    }

    public static void K(int i, int[] iArr, int[] iArr2, boolean z2) {
        float f;
        if (iArr.length != 0) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            float max = (i - i3) / Math.max(iArr.length - 1, 1);
            if (z2 && iArr.length == 1) {
                f = max;
            } else {
                f = 0.0f;
            }
            if (!z2) {
                int length = iArr.length;
                int i5 = 0;
                while (i2 < length) {
                    int i6 = iArr[i2];
                    iArr2[i5] = Math.round(f);
                    f += i6 + max;
                    i2++;
                    i5++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i7 + max;
            }
        }
    }

    public static final void L(LinkedHashSet linkedHashSet, w44 w44Var) {
        fy4 fy4Var;
        if (!linkedHashSet.isEmpty()) {
            fy4Var = fy4.x;
        } else {
            fy4Var = fy4.y;
        }
        w44Var.setValue(fy4Var);
    }

    public static final boolean M(p44 p44Var, Object obj, Object obj2) {
        Object g = p44Var.g(obj);
        if (g == null) {
            return false;
        }
        if (g instanceof q44) {
            q44 q44Var = (q44) g;
            boolean l = q44Var.l(obj2);
            if (l && q44Var.g()) {
                p44Var.l(obj);
            }
            return l;
        }
        if (!g.equals(obj2)) {
            return false;
        }
        p44Var.l(obj);
        return true;
    }

    public static final void N(p44 p44Var, Object obj) {
        boolean z2;
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
                            int i4 = (i << 3) + i3;
                            Object obj2 = p44Var.b[i4];
                            Object obj3 = p44Var.c[i4];
                            if (obj3 instanceof q44) {
                                q44 q44Var = (q44) obj3;
                                q44Var.l(obj);
                                z2 = q44Var.g();
                            } else if (obj3 == obj) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                p44Var.m(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static String O(String str) {
        Pattern compile = Pattern.compile("[^A-Za-z0-9._-]");
        compile.getClass();
        str.getClass();
        String replaceAll = compile.matcher(str).replaceAll("_");
        replaceAll.getClass();
        return replaceAll;
    }

    public static final yz3 P(yz3 yz3Var, kd5 kd5Var, rg4 rg4Var, fc fcVar, boolean z2, i42 i42Var, u34 u34Var, oy5 oy5Var) {
        yz3 k;
        rg4 rg4Var2 = rg4.x;
        vz3 vz3Var = vz3.x;
        if (rg4Var == rg4Var2) {
            k = n03.k(vz3Var, ao2.c);
        } else {
            k = n03.k(vz3Var, ao2.b);
        }
        return yz3Var.w(k).w(new zc5(fcVar, oy5Var, i42Var, u34Var, rg4Var, kd5Var, z2, false));
    }

    public static void Q(ko4 ko4Var, et3 et3Var) {
        int i = et3Var.b;
        long j = et3Var.c;
        nw2 nw2Var = et3Var.a;
        if (i == -1) {
            if (ko4Var.t0(20)) {
                ko4Var.X0(nw2Var);
                return;
            } else {
                if (!nw2Var.isEmpty()) {
                    ko4Var.M0((ar3) nw2Var.get(0));
                    return;
                }
                return;
            }
        }
        if (ko4Var.t0(20)) {
            ko4Var.W(nw2Var, et3Var.b, j);
        } else if (!nw2Var.isEmpty()) {
            ko4Var.m((ar3) nw2Var.get(0), j);
        }
    }

    public static vr R(float f) {
        return new vr(f, true, new ze0((byte) 6));
    }

    public static String S(String str) {
        str.getClass();
        return qx1.m("episode_", O(str), "_thumb.jpg");
    }

    public static final long T(long j) {
        boolean z2;
        m18 m18Var = fq1.y;
        if (j > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return fq1.d(fq1.g(j, w65.W(999999L, jq1.NANOSECONDS)));
        }
        if (!z2) {
            return 0L;
        }
        ze0.l();
        return 0L;
    }

    public static final void U(List list, id idVar) {
        int i;
        lk4 lk4Var;
        Path path;
        int i2;
        float f;
        int i3;
        lk4 lk4Var2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        List list2 = list;
        Path path2 = idVar.a;
        if (path2.getFillType() == Path.FillType.EVEN_ODD) {
            i = 1;
        } else {
            i = 0;
        }
        path2.rewind();
        idVar.f(i);
        if (list2.isEmpty()) {
            lk4Var = tj4.c;
        } else {
            lk4Var = (lk4) list2.get(0);
        }
        int size = list2.size();
        float f12 = 0.0f;
        int i4 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (i4 < size) {
            lk4 lk4Var3 = (lk4) list2.get(i4);
            if (lk4Var3 instanceof tj4) {
                path2.close();
                path = path2;
                i2 = size;
                f = f12;
                i3 = i4;
                lk4Var2 = lk4Var3;
                f13 = f17;
                f15 = f13;
                f14 = f18;
                f16 = f14;
            } else {
                if (lk4Var3 instanceof fk4) {
                    fk4 fk4Var = (fk4) lk4Var3;
                    float f19 = fk4Var.c;
                    f15 += f19;
                    float f20 = fk4Var.d;
                    f16 += f20;
                    path2.rMoveTo(f19, f20);
                    path = path2;
                    i2 = size;
                    f = f12;
                    i3 = i4;
                    f17 = f15;
                    f18 = f16;
                } else {
                    if (lk4Var3 instanceof xj4) {
                        xj4 xj4Var = (xj4) lk4Var3;
                        float f21 = xj4Var.c;
                        float f22 = xj4Var.d;
                        path2.moveTo(f21, f22);
                        path = path2;
                        f16 = f22;
                        f18 = f16;
                        f15 = f21;
                        f17 = f15;
                    } else {
                        if (lk4Var3 instanceof ek4) {
                            ek4 ek4Var = (ek4) lk4Var3;
                            float f23 = ek4Var.d;
                            float f24 = ek4Var.c;
                            path2.rLineTo(f24, f23);
                            f15 += f24;
                            f16 += f23;
                        } else if (lk4Var3 instanceof wj4) {
                            wj4 wj4Var = (wj4) lk4Var3;
                            float f25 = wj4Var.d;
                            float f26 = wj4Var.c;
                            path2.lineTo(f26, f25);
                            path = path2;
                            f15 = f26;
                            f16 = f25;
                        } else if (lk4Var3 instanceof dk4) {
                            float f27 = ((dk4) lk4Var3).c;
                            path2.rLineTo(f27, f12);
                            f15 += f27;
                        } else if (lk4Var3 instanceof vj4) {
                            float f28 = ((vj4) lk4Var3).c;
                            path2.lineTo(f28, f16);
                            path = path2;
                            f15 = f28;
                        } else if (lk4Var3 instanceof jk4) {
                            float f29 = ((jk4) lk4Var3).c;
                            path2.rLineTo(f12, f29);
                            f16 += f29;
                        } else if (lk4Var3 instanceof kk4) {
                            float f30 = ((kk4) lk4Var3).c;
                            path2.lineTo(f15, f30);
                            path = path2;
                            f16 = f30;
                        } else {
                            if (lk4Var3 instanceof ck4) {
                                ck4 ck4Var = (ck4) lk4Var3;
                                path2.rCubicTo(ck4Var.c, ck4Var.d, ck4Var.e, ck4Var.f, ck4Var.g, ck4Var.h);
                                f4 = ck4Var.e + f15;
                                f5 = ck4Var.f + f16;
                                f15 += ck4Var.g;
                                f11 = ck4Var.h;
                            } else {
                                if (lk4Var3 instanceof uj4) {
                                    uj4 uj4Var = (uj4) lk4Var3;
                                    path2.cubicTo(uj4Var.c, uj4Var.d, uj4Var.e, uj4Var.f, uj4Var.g, uj4Var.h);
                                    f4 = uj4Var.e;
                                    f6 = uj4Var.f;
                                    f7 = uj4Var.g;
                                    f8 = uj4Var.h;
                                } else if (lk4Var3 instanceof hk4) {
                                    if (lk4Var.a) {
                                        f9 = f15 - f13;
                                        f10 = f16 - f14;
                                    } else {
                                        f9 = f12;
                                        f10 = f9;
                                    }
                                    hk4 hk4Var = (hk4) lk4Var3;
                                    path2.rCubicTo(f9, f10, hk4Var.c, hk4Var.d, hk4Var.e, hk4Var.f);
                                    f4 = hk4Var.c + f15;
                                    f5 = hk4Var.d + f16;
                                    f15 += hk4Var.e;
                                    f11 = hk4Var.f;
                                } else if (lk4Var3 instanceof zj4) {
                                    if (lk4Var.a) {
                                        f15 = (f15 * 2.0f) - f13;
                                        f16 = (2.0f * f16) - f14;
                                    }
                                    zj4 zj4Var = (zj4) lk4Var3;
                                    path2.cubicTo(f15, f16, zj4Var.c, zj4Var.d, zj4Var.e, zj4Var.f);
                                    f4 = zj4Var.c;
                                    f6 = zj4Var.d;
                                    f7 = zj4Var.e;
                                    f8 = zj4Var.f;
                                } else if (lk4Var3 instanceof gk4) {
                                    gk4 gk4Var = (gk4) lk4Var3;
                                    float f31 = gk4Var.f;
                                    float f32 = gk4Var.e;
                                    float f33 = gk4Var.d;
                                    float f34 = gk4Var.c;
                                    path2.rQuadTo(f34, f33, f32, f31);
                                    float f35 = f34 + f15;
                                    float f36 = f33 + f16;
                                    f15 += f32;
                                    f16 += f31;
                                    path = path2;
                                    f13 = f35;
                                    f14 = f36;
                                } else if (lk4Var3 instanceof yj4) {
                                    yj4 yj4Var = (yj4) lk4Var3;
                                    float f37 = yj4Var.f;
                                    float f38 = yj4Var.e;
                                    float f39 = yj4Var.d;
                                    f4 = yj4Var.c;
                                    path2.quadTo(f4, f39, f38, f37);
                                    path = path2;
                                    f16 = f37;
                                    f15 = f38;
                                    f14 = f39;
                                    i2 = size;
                                    f = f12;
                                    i3 = i4;
                                    lk4Var2 = lk4Var3;
                                    f13 = f4;
                                } else if (lk4Var3 instanceof ik4) {
                                    if (lk4Var.b) {
                                        f2 = f15 - f13;
                                        f3 = f16 - f14;
                                    } else {
                                        f2 = f12;
                                        f3 = f2;
                                    }
                                    ik4 ik4Var = (ik4) lk4Var3;
                                    float f40 = ik4Var.d;
                                    float f41 = ik4Var.c;
                                    path2.rQuadTo(f2, f3, f41, f40);
                                    f4 = f2 + f15;
                                    f5 = f3 + f16;
                                    f15 += f41;
                                    f16 += f40;
                                    path = path2;
                                    f14 = f5;
                                    i2 = size;
                                    f = f12;
                                    i3 = i4;
                                    lk4Var2 = lk4Var3;
                                    f13 = f4;
                                } else if (lk4Var3 instanceof ak4) {
                                    if (lk4Var.b) {
                                        f15 = (f15 * 2.0f) - f13;
                                        f16 = (2.0f * f16) - f14;
                                    }
                                    ak4 ak4Var = (ak4) lk4Var3;
                                    float f42 = ak4Var.d;
                                    float f43 = ak4Var.c;
                                    path2.quadTo(f15, f16, f43, f42);
                                    path = path2;
                                    i2 = size;
                                    f = f12;
                                    i3 = i4;
                                    f14 = f16;
                                    lk4Var2 = lk4Var3;
                                    f16 = f42;
                                    f13 = f15;
                                    f15 = f43;
                                } else if (lk4Var3 instanceof bk4) {
                                    bk4 bk4Var = (bk4) lk4Var3;
                                    float f44 = bk4Var.h + f15;
                                    float f45 = bk4Var.i + f16;
                                    i2 = size;
                                    f = 0.0f;
                                    path = path2;
                                    i3 = i4;
                                    y(idVar, f15, f16, f44, f45, bk4Var.c, bk4Var.d, bk4Var.e, bk4Var.f, bk4Var.g);
                                    f13 = f44;
                                    f15 = f13;
                                    f14 = f45;
                                    f16 = f14;
                                    lk4Var2 = lk4Var3;
                                } else {
                                    path = path2;
                                    i2 = size;
                                    f = f12;
                                    i3 = i4;
                                    if (lk4Var3 instanceof sj4) {
                                        sj4 sj4Var = (sj4) lk4Var3;
                                        float f46 = sj4Var.i;
                                        float f47 = sj4Var.h;
                                        lk4Var2 = lk4Var3;
                                        y(idVar, f15, f16, f47, f46, sj4Var.c, sj4Var.d, sj4Var.e, sj4Var.f, sj4Var.g);
                                        f14 = f46;
                                        f16 = f14;
                                        f13 = f47;
                                        f15 = f13;
                                    } else {
                                        ze0.l();
                                        return;
                                    }
                                }
                                path = path2;
                                f15 = f7;
                                f16 = f8;
                                i2 = size;
                                f = f12;
                                i3 = i4;
                                lk4Var2 = lk4Var3;
                                f14 = f6;
                                f13 = f4;
                            }
                            f16 += f11;
                            path = path2;
                            f14 = f5;
                            i2 = size;
                            f = f12;
                            i3 = i4;
                            lk4Var2 = lk4Var3;
                            f13 = f4;
                        }
                        path = path2;
                    }
                    i2 = size;
                    f = f12;
                    i3 = i4;
                }
                lk4Var2 = lk4Var3;
            }
            i4 = i3 + 1;
            list2 = list;
            size = i2;
            path2 = path;
            lk4Var = lk4Var2;
            f12 = f;
        }
    }

    public static String V(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return qx1.m("CornerRadius.circular(", bx7.P(Float.intBitsToFloat(i)), ")");
        }
        return qx1.n("CornerRadius.elliptical(", bx7.P(Float.intBitsToFloat(i)), ", ", bx7.P(Float.intBitsToFloat(i2)), ")");
    }

    public static final n05 W(n05 n05Var, ha3 ha3Var, ha3 ha3Var2) {
        if (ha3Var.m() && ha3Var2.m()) {
            return n03.g(ha3Var2.D(te4.B(ha3Var).o(n05Var.f())), n05Var.e());
        }
        return n05.e;
    }

    public static final long X(long j, long j2) {
        boolean z2;
        int e;
        int g = nd6.g(j);
        int f = nd6.f(j);
        boolean z3 = false;
        if (nd6.g(j2) < nd6.f(j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (nd6.g(j) < nd6.f(j2)) {
            z3 = true;
        }
        if (z2 & z3) {
            if (nd6.a(j2, j)) {
                g = nd6.g(j2);
                f = g;
            } else {
                if (nd6.a(j, j2)) {
                    e = nd6.e(j2);
                } else {
                    int g2 = nd6.g(j2);
                    if (g < nd6.f(j2) && g2 <= g) {
                        g = nd6.g(j2);
                        e = nd6.e(j2);
                    } else {
                        f = nd6.g(j2);
                    }
                }
                f -= e;
            }
        } else if (f > nd6.g(j2)) {
            g -= nd6.e(j2);
            e = nd6.e(j2);
            f -= e;
        }
        return fy5.a(g, f);
    }

    public static jb8 Y(Set set) {
        jb8 jb8Var = new jb8();
        jb8Var.c = F;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ia8 ia8Var = (ia8) it.next();
            it5.h(ia8Var, "key");
            boolean z2 = ia8Var.c;
            HashMap hashMap = jb8Var.b;
            HashMap hashMap2 = jb8Var.a;
            if (z2) {
                if (z2) {
                    hashMap2.remove(ia8Var);
                    hashMap.put(ia8Var, jb8.e);
                } else {
                    ze0.k("key must be repeating");
                    return null;
                }
            } else {
                hashMap.remove(ia8Var);
                hashMap2.put(ia8Var, jb8.d);
            }
        }
        return jb8Var;
    }

    public static final void b(yz3 yz3Var, e7 e7Var, os0 os0Var, kd2 kd2Var, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        e7 e7Var2;
        e7 e7Var3;
        int i5;
        kd2Var.f0(380139498);
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (kd2Var.f(e7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i7 = i3 | 384;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i7 & 1, z2)) {
            if (i6 != 0) {
                e7Var3 = pk2.y;
            } else {
                e7Var3 = e7Var;
            }
            vo3 c = b90.c(e7Var3, false);
            boolean f = kd2Var.f(c);
            Object Q = kd2Var.Q();
            if (f || Q == au0.a) {
                Q = new q(c, os0Var, (byte) 10);
                kd2Var.n0(Q);
            }
            te4.l(yz3Var, (ic2) Q, kd2Var, i7 & 14, 0);
            e7Var2 = e7Var3;
        } else {
            kd2Var.Y();
            e7Var2 = e7Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new o90(yz3Var, e7Var2, os0Var, i, i2);
        }
    }

    public static final void c(jb6 jb6Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        yz3 w;
        int i3;
        int i4;
        kd2Var.f0(1533506138);
        byte b = 2;
        if ((i & 6) == 0) {
            if (kd2Var.h(jb6Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        byte b2 = 1;
        byte b3 = 0;
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            kd2Var.e0(-885604480);
            if (!jb6Var.i()) {
                w = vz3.x;
            } else {
                vz0 vz0Var = null;
                w = wk6.G(new db6(jb6Var, vz0Var, b3)).w(new d96(jb6Var.x, new s96(jb6Var, vz0Var, b2), new eb6(jb6Var, vz0Var, b3), new v01(jb6Var, b)));
            }
            jf7.c(w, os0Var, kd2Var, i2 & 112);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new oq0(jb6Var, os0Var, i, b3);
        }
    }

    public static final void d(cc6 cc6Var, boolean z2, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z3;
        yz3 yz3Var;
        int i3;
        int i4;
        int i5;
        kd2Var.f0(-1442752422);
        byte b = 2;
        if ((i & 6) == 0) {
            if (kd2Var.h(cc6Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.g(z2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i2 & 1, z3)) {
            kd2Var.e0(-1299459355);
            if (z2) {
                kd2Var.e0(-1299415211);
                boolean h = kd2Var.h(cc6Var);
                Object Q = kd2Var.Q();
                if (h || Q == au0.a) {
                    Q = new nf6(cc6Var, null, b);
                    kd2Var.n0(Q);
                }
                yz3Var = wk6.G((ic2) Q);
                kd2Var.q(false);
            } else {
                kd2Var.e0(-1298836224);
                kd2Var.q(false);
                yz3Var = vz3.x;
            }
            jf7.c(yz3Var, os0Var, kd2Var, (i2 >> 3) & 112);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new nq0(cc6Var, z2, os0Var, i, (byte) 0);
        }
    }

    public static final void e(ad4 ad4Var, e7 e7Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean h;
        int i5;
        kd2Var.f0(-1090171650);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = kd2Var.f(ad4Var);
            } else {
                h = kd2Var.h(ad4Var);
            }
            if (h) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(e7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z4 = true;
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i2 & 1, z2)) {
            if ((i2 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !kd2Var.f(ad4Var))) {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object Q = kd2Var.Q();
            if (z5 || Q == au0.a) {
                Q = new gj2(e7Var, ad4Var);
                kd2Var.n0(Q);
            }
            ae.a((gj2) Q, null, new yr4(false, ef5.x, false, 0), os0Var, kd2Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 0, i, (Object) ad4Var, (Object) e7Var, (Object) os0Var);
        }
    }

    public static final void f(ki2 ki2Var, yz3 yz3Var, wc3 wc3Var, vh4 vh4Var, ur urVar, wr wrVar, i42 i42Var, boolean z2, fc fcVar, ub2 ub2Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z3;
        wc3 wc3Var2;
        wr wrVar2;
        i42 i42Var2;
        boolean z4;
        fc fcVar2;
        wc3 a;
        int i4;
        wr wrVar3;
        boolean z5;
        boolean z6;
        kd2Var.f0(635941664);
        if (kd2Var.f(ki2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2 | 374890624;
        if (kd2Var.h(ub2Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        if ((306783379 & i5) == 306783378 && (i3 & 3) == 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (kd2Var.V(i5 & 1, z3)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i4 = i5 & (-1908409217);
                a = wc3Var;
                wrVar3 = wrVar;
                fcVar2 = fcVar;
                z5 = true;
                z6 = false;
                i42Var2 = i42Var;
                z4 = z2;
            } else {
                a = yc3.a(kd2Var);
                s81 s = tl7.s(kd2Var);
                fcVar2 = fh4.b(kd2Var);
                i4 = i5 & (-1908409217);
                wrVar3 = z;
                z5 = true;
                i42Var2 = s;
                z6 = false;
                z4 = true;
            }
            kd2Var.r();
            int i6 = (i4 & 14) | 48;
            if ((((i6 & 14) ^ 6) <= 4 || !kd2Var.f(ki2Var)) && (i6 & 6) != 4) {
                z5 = z6;
            }
            Object Q = kd2Var.Q();
            if (z5 || Q == au0.a) {
                Q = new mi2(new q(ki2Var, wrVar3, (byte) 23));
                kd2Var.n0(Q);
            }
            wc3Var2 = a;
            wc7.b(yz3Var, wc3Var2, (mi2) Q, vh4Var, false, i42Var2, z4, fcVar2, wrVar3, urVar, ub2Var, kd2Var, 818113542, 6 | ((i3 << 3) & 112));
            wrVar2 = wrVar3;
        } else {
            kd2Var.Y();
            wc3Var2 = wc3Var;
            wrVar2 = wrVar;
            i42Var2 = i42Var;
            z4 = z2;
            fcVar2 = fcVar;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new th(ki2Var, yz3Var, wc3Var2, vh4Var, urVar, wrVar2, i42Var2, z4, fcVar2, ub2Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.ki2 r17, final defpackage.yz3 r18, final defpackage.wc3 r19, defpackage.th4 r20, final defpackage.wr r21, defpackage.ur r22, defpackage.i42 r23, boolean r24, defpackage.fc r25, final defpackage.ub2 r26, defpackage.kd2 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.g(ki2, yz3, wc3, th4, wr, ur, i42, boolean, fc, ub2, kd2, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
    
        if (r22 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d7, code lost:
    
        if (r22 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00de, code lost:
    
        if (r22 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e2, code lost:
    
        if (r22 != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final defpackage.ad4 r19, final boolean r20, final defpackage.c45 r21, final boolean r22, long r23, final float r25, final defpackage.yz3 r26, defpackage.kd2 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.h(ad4, boolean, c45, boolean, long, float, yz3, kd2, int, int):void");
    }

    public static final void i(final yz3 yz3Var, final sb2 sb2Var, final boolean z2, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        kd2Var.f0(2111672474);
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if (kd2Var.h(sb2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i2 | i3;
        if (kd2Var.g(z2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i7 & 1, z3)) {
            ai5 ai5Var = ih5.a;
            ov5.a(kd2Var, o80.s(ar5.j(yz3Var, 25.0f, 25.0f), new ne(sb2Var, z2)));
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: me
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(i | 1);
                    x97.i(yz3.this, sb2Var, z2, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void j(yz3 yz3Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z2;
        kd2Var.f0(-1854833411);
        if (kd2Var.f(yz3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        byte b = 1;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = yb.j;
                kd2Var.n0(Q);
            }
            vo3 vo3Var = (vo3) Q;
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, yz3Var);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, vo3Var);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E2);
            os0Var.invoke(kd2Var, 6);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new vl5(b, i, yz3Var, os0Var);
        }
    }

    public static final void k(p44 p44Var, Object obj, Object obj2) {
        boolean z2;
        Object obj3;
        int f = p44Var.f(obj);
        if (f < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            obj3 = null;
        } else {
            obj3 = p44Var.c[f];
        }
        if (obj3 != null) {
            if (obj3 instanceof q44) {
                ((q44) obj3).a(obj2);
            } else if (obj3 != obj2) {
                q44 q44Var = new q44();
                q44Var.a(obj3);
                q44Var.a(obj2);
                obj2 = q44Var;
            }
            obj2 = obj3;
        }
        if (z2) {
            int i = ~f;
            p44Var.b[i] = obj;
            p44Var.c[i] = obj2;
            return;
        }
        p44Var.c[f] = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(defpackage.xz0 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.wc1
            if (r0 == 0) goto L13
            r0 = r4
            wc1 r0 = (defpackage.wc1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            wc1 r0 = new wc1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.x
            int r1 = r0.y
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return
        L27:
            defpackage.m37.N(r4)
            goto L45
        L2b:
            defpackage.m37.N(r4)
            r0.y = r2
            qg0 r4 = new qg0
            vz0 r0 = defpackage.wc7.z(r0)
            r4.<init>(r2, r0)
            r4.t()
            java.lang.Object r4 = r4.r()
            w11 r0 = defpackage.w11.x
            if (r4 != r0) goto L45
            return
        L45:
            defpackage.v71.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.l(xz0):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.z36 r6, defpackage.h30 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.c65
            if (r0 == 0) goto L13
            r0 = r7
            c65 r0 = (defpackage.c65) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            c65 r0 = new c65
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            z36 r6 = r0.x
            defpackage.m37.N(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.m37.N(r7)
        L31:
            r0.x = r6
            r0.z = r2
            oq4 r7 = defpackage.oq4.y
            java.lang.Object r7 = r6.d(r7, r0)
            w11 r1 = defpackage.w11.x
            if (r7 != r1) goto L40
            return r1
        L40:
            nq4 r7 = (defpackage.nq4) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            uq4 r5 = (defpackage.uq4) r5
            boolean r5 = defpackage.t80.v(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.m(z36, h30):java.lang.Object");
    }

    public static String n(String str) {
        str.getClass();
        return qx1.m("anime_", O(str), "_banner.jpg");
    }

    public static final int o(int i, z44 z44Var) {
        int i2 = z44Var.z - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = z44Var.x;
            int i5 = ((g23) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((g23) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static String p(String str) {
        Object obj = null;
        if (str != null) {
            return new ht7(obj, str).a();
        }
        ze0.k("applicationId cannot be null");
        return null;
    }

    public static p44 q() {
        long[] jArr = cb5.a;
        return new p44();
    }

    public static String r(String str) {
        str.getClass();
        return qx1.m("anime_", O(str), "_cover.jpg");
    }

    public static void s(n22 n22Var, qj4 qj4Var) {
        if (!n22Var.A(qj4Var)) {
            try {
                n22Var.k0(qj4Var, false).close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.pc t(defpackage.we0 r25, float r26) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.t(we0, float):pc");
    }

    public static final Object u(long j, vz0 vz0Var) {
        if (j > 0) {
            qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
            qg0Var.t();
            if (j < Long.MAX_VALUE) {
                C(qg0Var.B).d0(j, qg0Var);
            }
            Object r = qg0Var.r();
            if (r == w11.x) {
                return r;
            }
        }
        return pn6.a;
    }

    public static final Object v(long j, vz0 vz0Var) {
        Object u = u(T(j), vz0Var);
        if (u == w11.x) {
            return u;
        }
        return pn6.a;
    }

    public static final void x(n22 n22Var, qj4 qj4Var) {
        try {
            IOException iOException = null;
            for (qj4 qj4Var2 : n22Var.G(qj4Var)) {
                try {
                    if (n22Var.I(qj4Var2).c) {
                        x(n22Var, qj4Var2);
                    }
                    n22Var.q(qj4Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void y(id idVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z2, boolean z3) {
        double d8;
        double d9;
        boolean z4;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 != 0.0d) {
            double d21 = (1.0d / d20) - 0.25d;
            if (d21 < 0.0d) {
                double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
                y(idVar, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z2, z3);
                return;
            }
            double sqrt2 = Math.sqrt(d21);
            double d22 = d16 * sqrt2;
            double d23 = sqrt2 * d17;
            if (z2 == z3) {
                d8 = d18 - d23;
                d9 = d19 + d22;
            } else {
                d8 = d18 + d23;
                d9 = d19 - d22;
            }
            double atan2 = Math.atan2(d13 - d9, d12 - d8);
            double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
            if (atan22 >= 0.0d) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 != z4) {
                if (atan22 > 0.0d) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d24 = d8 * d10;
            double d25 = d9 * d6;
            double d26 = (d24 * cos) - (d25 * sin);
            double d27 = (d25 * cos) + (d24 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d11);
            double sin2 = Math.sin(d11);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d28 = -d10;
            double d29 = d28 * cos2;
            double d30 = d6 * sin2;
            double d31 = (d29 * sin3) - (d30 * cos3);
            double d32 = d28 * sin2;
            double d33 = d6 * cos2;
            double d34 = (cos3 * d33) + (sin3 * d32);
            double d35 = atan22 / ceil;
            double d36 = atan2;
            double d37 = d31;
            int i = 0;
            double d38 = d34;
            double d39 = d2;
            while (i < ceil) {
                double d40 = d36 + d35;
                double sin4 = Math.sin(d40);
                double cos4 = Math.cos(d40);
                int i2 = ceil;
                double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
                double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
                double d43 = (d29 * sin4) - (d30 * cos4);
                double d44 = (cos4 * d33) + (sin4 * d32);
                double d45 = d40 - d36;
                double tan = Math.tan(d45 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
                double d46 = d32;
                idVar.a.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
                d35 = d35;
                sin2 = sin2;
                d26 = d26;
                d = d41;
                i++;
                d32 = d46;
                d36 = d40;
                d38 = d44;
                d37 = d43;
                ceil = i2;
                d39 = d42;
                d10 = d5;
            }
        }
    }

    public static final boolean z(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.x) {
            case 18:
                return w().toString();
            default:
                return super.toString();
        }
    }

    public abstract Object w();
}
