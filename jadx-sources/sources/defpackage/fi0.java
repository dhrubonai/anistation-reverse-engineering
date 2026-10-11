package defpackage;

import android.graphics.Rect;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fi0 extends v30 {
    public final ui3 b;
    public final Looper c;
    public final k46 d;
    public final Set e;
    public final hf6 f;
    public jp5 g;
    public boolean h;
    public final ka2 i;
    public ko4 j;
    public kz k;
    public fy3 l;
    public int m;
    public int n;
    public long o;
    public boolean p;
    public final vy1 q;
    public final p25 r;
    public final xv3 s;

    public fi0(vy1 vy1Var, p25 p25Var, ko4 ko4Var, xv3 xv3Var) {
        Looper J0 = ko4Var.J0();
        this.c = J0;
        f46 f46Var = f46.a;
        this.d = f46Var.a(J0, null);
        this.e = Collections.newSetFromMap(new IdentityHashMap());
        this.f = new hf6();
        byte b = 10;
        this.b = new ui3(J0, f46Var, new xv3(this, b));
        this.j = ko4Var;
        this.l = new fy3(-9223372036854775807L, new ey3[0]);
        this.m = 1;
        this.n = 5;
        this.k = new kz(ko4Var);
        ka2 ka2Var = new ka2(this);
        this.i = ka2Var;
        ko4Var.v(ka2Var);
        this.q = vy1Var;
        this.r = p25Var;
        this.s = xv3Var;
        p25Var.o = new i75(this, b);
    }

    public static boolean B1(jp5 jp5Var) {
        if (jp5Var.b && jp5Var.d == 3 && jp5Var.e == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [cp5, java.lang.Object] */
    public static ArrayList h1(jp5 jp5Var, hf6 hf6Var, jf6 jf6Var) {
        Object[] objArr;
        long j;
        boolean z;
        boolean z2;
        jr3 jr3Var;
        qh6 qh6Var;
        boolean z3;
        boolean z4;
        kf6 kf6Var = jp5Var.A;
        if (kf6Var instanceof fp5) {
            return new ArrayList(((fp5) kf6Var).e);
        }
        ArrayList arrayList = new ArrayList(kf6Var.o());
        boolean z5 = false;
        int i = 0;
        while (i < kf6Var.o()) {
            int i2 = jp5Var.E;
            if (i2 == -1) {
                i2 = z5 ? 1 : 0;
            }
            boolean z6 = true;
            if (i2 == i) {
                objArr = true;
            } else {
                objArr = z5 ? 1 : 0;
            }
            kf6Var.n(i, jf6Var);
            jw2 k = nw2.k();
            int i3 = jf6Var.n;
            while (true) {
                j = -9223372036854775807L;
                if (i3 > jf6Var.o) {
                    break;
                }
                kf6Var.f(i3, hf6Var, z6);
                boolean z7 = z6;
                Object obj = hf6Var.b;
                obj.getClass();
                ?? obj2 = new Object();
                obj2.a = obj;
                obj2.b = 0L;
                y5 y5Var = y5.c;
                obj2.d = z5;
                obj2.c = hf6Var.g;
                int i4 = i;
                long j2 = hf6Var.d;
                if (j2 != -9223372036854775807L && j2 < 0) {
                    z4 = false;
                } else {
                    z4 = z7;
                }
                io3.n(z4);
                obj2.b = j2;
                obj2.d = hf6Var.f;
                k.c(new dp5(obj2));
                i3++;
                z6 = z7;
                i = i4;
                z5 = false;
            }
            int i5 = i;
            boolean z8 = z6;
            ap5 ap5Var = new ap5(jf6Var.a);
            long j3 = jf6Var.l;
            if (j3 >= 0) {
                z = z8;
            } else {
                z = false;
            }
            io3.n(z);
            ap5Var.l = j3;
            long j4 = jf6Var.m;
            if (j4 != -9223372036854775807L && j4 < 0) {
                z2 = false;
            } else {
                z2 = z8;
            }
            io3.n(z2);
            ap5Var.m = j4;
            ap5Var.i = jf6Var.g;
            ap5Var.k = jf6Var.i;
            ap5Var.o = jf6Var.k;
            ap5Var.j = jf6Var.h;
            ap5Var.f = jf6Var.j;
            ap5Var.e = jf6Var.d;
            ap5Var.c = jf6Var.c;
            if (objArr != false) {
                jr3Var = jp5Var.C;
            } else {
                jr3Var = null;
            }
            ap5Var.d = jr3Var;
            o15 g = k.g();
            int i6 = g.A;
            int i7 = 0;
            while (i7 < i6 - 1) {
                long j5 = j;
                if (((dp5) g.get(i7)).b != j5) {
                    z3 = z8;
                } else {
                    z3 = false;
                }
                io3.m("Periods other than last need a duration", z3);
                int i8 = i7 + 1;
                for (int i9 = i8; i9 < i6; i9++) {
                    io3.m("Duplicate PeriodData UIDs in period list", !((dp5) g.get(i7)).a.equals(((dp5) g.get(i9)).a));
                }
                i7 = i8;
                j = j5;
            }
            ap5Var.p = nw2.o(g);
            long j6 = jf6Var.p;
            if (j6 < 0) {
                z8 = false;
            }
            io3.n(z8);
            ap5Var.n = j6;
            ap5Var.g = jf6Var.e;
            if (objArr != false) {
                qh6Var = jp5Var.B;
            } else {
                qh6Var = qh6.b;
            }
            ap5Var.b = qh6Var;
            ap5Var.h = jf6Var.f;
            arrayList.add(new bp5(ap5Var));
            i = i5 + 1;
            z5 = false;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jp5 i1(defpackage.ip5 r16, defpackage.jp5 r17, long r18, defpackage.kf6 r20, int r21, long r22, boolean r24, defpackage.jf6 r25) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi0.i1(ip5, jp5, long, kf6, int, long, boolean, jf6):jp5");
    }

    public static long k1(jp5 jp5Var, jf6 jf6Var) {
        return q1(jp5Var.H.get(), jp5Var, jf6Var);
    }

    public static int l1(jp5 jp5Var, hf6 hf6Var, jf6 jf6Var) {
        int i = jp5Var.E;
        if (i == -1) {
            i = 0;
        }
        int i2 = i;
        if (jp5Var.A.p()) {
            return i2;
        }
        kf6 kf6Var = jp5Var.A;
        return kf6Var.b(kf6Var.i(jf6Var, hf6Var, i2, eq6.U(q1(jp5Var.H.get(), jp5Var, jf6Var))).first);
    }

    public static long m1(jp5 jp5Var, Object obj, hf6 hf6Var, jf6 jf6Var) {
        if (jp5Var.F != -1) {
            return jp5Var.I.get();
        }
        return q1(jp5Var.H.get(), jp5Var, jf6Var) - eq6.l0(jp5Var.A.g(obj, hf6Var).e);
    }

    public static int n1(kf6 kf6Var, fp5 fp5Var, int i, hf6 hf6Var, jf6 jf6Var) {
        if (kf6Var.p()) {
            if (i < fp5Var.e.size()) {
                return i;
            }
        } else {
            Object obj = kf6Var.f(kf6Var.m(i, jf6Var, 0L).n, hf6Var, true).b;
            obj.getClass();
            if (fp5Var.b(obj) != -1) {
                fp5Var.g(obj, hf6Var);
                return hf6Var.c;
            }
        }
        return -1;
    }

    public static bp5 o1(ar3 ar3Var) {
        ap5 ap5Var = new ap5(new Object());
        ap5Var.c = ar3Var;
        ap5Var.k = true;
        ap5Var.o = true;
        return new bp5(ap5Var);
    }

    public static jo4 p1(jp5 jp5Var, boolean z, jf6 jf6Var, hf6 hf6Var) {
        Object obj;
        ar3 ar3Var;
        Object obj2;
        long q1;
        long j;
        int i = jp5Var.E;
        if (i == -1) {
            i = 0;
        }
        int i2 = i;
        hp5 hp5Var = jp5Var.H;
        int i3 = jp5Var.F;
        int l1 = l1(jp5Var, hf6Var, jf6Var);
        kf6 kf6Var = jp5Var.A;
        if (!kf6Var.p()) {
            Object obj3 = kf6Var.f(l1, hf6Var, true).b;
            obj = kf6Var.m(i2, jf6Var, 0L).a;
            ar3Var = jf6Var.c;
            obj2 = obj3;
        } else {
            obj = null;
            ar3Var = null;
            obj2 = null;
        }
        if (z) {
            j = jp5Var.O;
            q1 = i3 == -1 ? j : q1(hp5Var.get(), jp5Var, jf6Var);
        } else {
            q1 = q1(hp5Var.get(), jp5Var, jf6Var);
            j = i3 != -1 ? jp5Var.I.get() : q1;
        }
        return new jo4(obj, i2, ar3Var, obj2, l1, j, q1, jp5Var.F, jp5Var.G);
    }

    public static long q1(long j, jp5 jp5Var, jf6 jf6Var) {
        if (j != -9223372036854775807L) {
            return j;
        }
        if (jp5Var.A.p()) {
            return 0L;
        }
        kf6 kf6Var = jp5Var.A;
        int i = jp5Var.E;
        if (i == -1) {
            i = 0;
        }
        return eq6.l0(kf6Var.m(i, jf6Var, 0L).l);
    }

    public static jp5 s1(jp5 jp5Var, ArrayList arrayList, hf6 hf6Var, jf6 jf6Var) {
        long j;
        ip5 a = jp5Var.a();
        fp5 fp5Var = new fp5(arrayList);
        kf6 kf6Var = jp5Var.A;
        long j2 = jp5Var.H.get();
        int i = jp5Var.E;
        if (i == -1) {
            i = 0;
        }
        int n1 = n1(kf6Var, fp5Var, i, hf6Var, jf6Var);
        if (n1 == -1) {
            j = -9223372036854775807L;
        } else {
            j = j2;
        }
        for (int i2 = i + 1; n1 == -1 && i2 < kf6Var.o(); i2++) {
            n1 = n1(kf6Var, fp5Var, i2, hf6Var, jf6Var);
        }
        if (jp5Var.d != 1 && n1 == -1) {
            a.d = 4;
            a.i = false;
        }
        return i1(a, jp5Var, j2, fp5Var, n1, j, true, jf6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [kf6] */
    public static jp5 t1(jp5 jp5Var, ArrayList arrayList, int i, long j, jf6 jf6Var) {
        fp5 fp5Var;
        ip5 a = jp5Var.a();
        if (arrayList == null) {
            fp5Var = jp5Var.A;
        } else {
            fp5Var = new fp5(arrayList);
        }
        if (jp5Var.d != 1) {
            if (!fp5Var.p() && (i == -1 || i < fp5Var.o())) {
                a.d = 2;
            } else {
                a.d = 4;
                a.i = false;
            }
        }
        return i1(a, jp5Var, jp5Var.H.get(), fp5Var, i, j, false, jf6Var);
    }

    public static sq5 u1(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return sq5.d;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new sq5(surfaceFrame.width(), surfaceFrame.height());
    }

    public final void A1(int i, float f) {
        if (i == 0) {
            this.j.U(f);
        } else if (i == 1) {
            this.j.L0();
        } else if (i == 2) {
            this.j.d0();
        } else {
            ze0.m(qx1.h(i, "Unknown volume operation type: "));
            return;
        }
        aw2 aw2Var = aw2.y;
    }

    @Override // defpackage.ko4
    public final void B0(final int i, int i2, int i3) {
        boolean z;
        H1();
        if (i >= 0 && i2 >= i && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        final jp5 jp5Var = this.g;
        int o = jp5Var.A.o();
        if (D1(20) && o != 0 && i < o) {
            final int min = Math.min(i2, o);
            final int min2 = Math.min(i3, o - (min - i));
            if (i != min && min2 != i) {
                int i4 = i + 1;
                ko4 ko4Var = this.j;
                if (min == i4) {
                    ko4Var.A0(i, min2);
                } else {
                    ko4Var.B0(i, min, min2);
                }
                aw2 aw2Var = aw2.y;
                G1(aw2.y, new r26() { // from class: yo5
                    @Override // defpackage.r26
                    public final Object get() {
                        fi0 fi0Var = fi0.this;
                        hf6 hf6Var = fi0Var.f;
                        jf6 jf6Var = fi0Var.a;
                        jp5 jp5Var2 = jp5Var;
                        ArrayList h1 = fi0.h1(jp5Var2, hf6Var, jf6Var);
                        eq6.T(h1, i, min, min2);
                        return fi0.s1(jp5Var2, h1, hf6Var, jf6Var);
                    }
                }, false, false);
            }
        }
    }

    @Override // defpackage.ko4
    public final ru C() {
        H1();
        return this.g.o;
    }

    public final void C1(final List list, final int i, final long j) {
        boolean z;
        boolean z2 = true;
        if (i != -1 && i < 0) {
            z = false;
        } else {
            z = true;
        }
        io3.n(z);
        final jp5 jp5Var = this.g;
        if (!D1(20) && (list.size() != 1 || !D1(31))) {
            return;
        }
        if (list.size() != 1 || !this.j.t0(31)) {
            z2 = false;
        }
        ko4 ko4Var = this.j;
        if (i == -1) {
            if (z2) {
                ko4Var.x0((ar3) list.get(0));
            } else {
                ko4Var.q0(list);
            }
        } else if (z2) {
            ko4Var.m((ar3) list.get(0), j);
        } else {
            ko4Var.W(list, i, j);
        }
        G1(aw2.y, new r26() { // from class: wo5
            @Override // defpackage.r26
            public final Object get() {
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    List list2 = list;
                    if (i2 < list2.size()) {
                        arrayList.add(fi0.o1((ar3) list2.get(i2)));
                        i2++;
                    } else {
                        return fi0.t1(jp5Var, arrayList, i, j, fi0.this.a);
                    }
                }
            }
        }, false, false);
    }

    @Override // defpackage.ko4
    public final void D(int i, boolean z) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(34)) {
            return;
        }
        x1(i, z);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.w = z;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final int D0() {
        H1();
        return this.g.e;
    }

    public final boolean D1(int i) {
        if (!this.h && this.g.a.a(i)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ko4
    public final void E() {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(26)) {
            return;
        }
        v1(1);
        G1(aw2.y, new xo5(jp5Var, (byte) 1), false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v31, types: [bq4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [bq4, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1() {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi0.E1():void");
    }

    @Override // defpackage.ko4
    public final void F(int i, int i2) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(33)) {
            return;
        }
        y1(i, i2);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.b(i);
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final int F0() {
        H1();
        return this.g.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x015b, code lost:
    
        if (r11 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x015d, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0182, code lost:
    
        if (r29 != false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0389  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F1(final defpackage.jp5 r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi0.F1(jp5, boolean, boolean):void");
    }

    @Override // defpackage.ko4
    public final void G(int i) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(34)) {
            return;
        }
        w1(i);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.b(jp5Var.v + 1);
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final kf6 G0() {
        H1();
        return this.g.A;
    }

    public final void G1(ii3 ii3Var, r26 r26Var, boolean z, boolean z2) {
        boolean isDone = ii3Var.isDone();
        Set set = this.e;
        if (isDone && set.isEmpty()) {
            F1(r1(), z, z2);
            return;
        }
        set.add(ii3Var);
        F1((jp5) r26Var.get(), z, z2);
        ii3Var.a(new f32((Object) this, (Object) ii3Var, (byte) 29), new ba(this, (byte) 4));
    }

    @Override // defpackage.ko4
    public final int H() {
        H1();
        return this.g.G;
    }

    @Override // defpackage.ko4
    public final boolean H0() {
        H1();
        return this.g.w;
    }

    public final void H1() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.c;
        if (currentThread == looper.getThread()) {
            if (this.g == null) {
                this.g = r1();
            }
        } else {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = eq6.a;
            Locale locale = Locale.US;
            ze0.m(qx1.n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\n"));
        }
    }

    @Override // defpackage.ko4
    public final void I(SurfaceView surfaceView) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(27)) {
            return;
        }
        if (surfaceView == null) {
            j1(null);
            return;
        }
        z1(surfaceView);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.x = u1(surfaceView.getHolder());
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final Looper J0() {
        return this.c;
    }

    @Override // defpackage.ko4
    public final sq5 K() {
        H1();
        return this.g.x;
    }

    @Override // defpackage.ko4
    public final int K0() {
        H1();
        return this.g.p;
    }

    @Override // defpackage.ko4
    public final void L(hh6 hh6Var) {
        H1();
        jp5 jp5Var = this.g;
        byte b = 29;
        if (!D1(29)) {
            return;
        }
        this.j.L(hh6Var);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.n = hh6Var;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32(this, aw2Var, b));
    }

    @Override // defpackage.ko4
    public final void L0() {
        H1();
        jp5 jp5Var = this.g;
        if (D1(24) && this.g.q != 0.0f) {
            A1(1, 0.0f);
            aw2 aw2Var = aw2.y;
            Set set = this.e;
            if (set.isEmpty()) {
                F1(r1(), false, false);
                return;
            }
            set.add(aw2Var);
            ip5 a = jp5Var.a();
            a.c(0.0f);
            F1(new jp5(a), false, false);
            zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
        }
    }

    @Override // defpackage.ko4
    public final void N0() {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(26)) {
            return;
        }
        w1(1);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.b(jp5Var.v + 1);
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final boolean O0() {
        H1();
        return this.g.h;
    }

    @Override // defpackage.ko4
    public final hh6 P0() {
        H1();
        return this.g.n;
    }

    @Override // defpackage.v30, defpackage.ko4
    public final long Q0() {
        H1();
        jp5 jp5Var = this.g;
        long j = jp5Var.J.get();
        jf6 jf6Var = this.a;
        return Math.max(q1(j, jp5Var, jf6Var), k1(this.g, jf6Var));
    }

    @Override // defpackage.ko4
    public final void R(int i, int i2) {
        boolean z;
        int min;
        H1();
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        jp5 jp5Var = this.g;
        int o = jp5Var.A.o();
        if (D1(20) && o != 0 && i < o && i != (min = Math.min(i2, o))) {
            int i3 = i + 1;
            ko4 ko4Var = this.j;
            if (min == i3) {
                ko4Var.N(i);
            } else {
                ko4Var.R(i, min);
            }
            aw2 aw2Var = aw2.y;
            Set set = this.e;
            if (set.isEmpty()) {
                F1(r1(), false, false);
                return;
            }
            set.add(aw2Var);
            hf6 hf6Var = this.f;
            jf6 jf6Var = this.a;
            ArrayList h1 = h1(jp5Var, hf6Var, jf6Var);
            eq6.b0(h1, i, min);
            F1(s1(jp5Var, h1, hf6Var, jf6Var), false, false);
            zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
        }
    }

    @Override // defpackage.ko4
    public final void R0(int i) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(25)) {
            return;
        }
        y1(i, 1);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.b(i);
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final void S() {
        j1(null);
    }

    @Override // defpackage.ko4
    public final void T(SurfaceHolder surfaceHolder) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(27)) {
            return;
        }
        if (surfaceHolder == null) {
            j1(null);
            return;
        }
        z1(surfaceHolder);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.x = u1(surfaceHolder);
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final void U(float f) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(24)) {
            return;
        }
        A1(0, f);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.c(f);
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final void U0(TextureView textureView) {
        sq5 sq5Var;
        H1();
        jp5 jp5Var = this.g;
        if (!D1(27)) {
            return;
        }
        if (textureView == null) {
            j1(null);
            return;
        }
        if (textureView.isAvailable()) {
            sq5Var = new sq5(textureView.getWidth(), textureView.getHeight());
        } else {
            sq5Var = sq5.d;
        }
        z1(textureView);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.x = sq5Var;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final void W(List list, int i, long j) {
        H1();
        if (i == -1) {
            jp5 jp5Var = this.g;
            int i2 = jp5Var.E;
            long j2 = jp5Var.H.get();
            i = i2;
            j = j2;
        }
        C1(list, i, j);
    }

    @Override // defpackage.ko4
    public final jr3 W0() {
        H1();
        return this.g.C;
    }

    @Override // defpackage.ko4
    public final yx1 X() {
        H1();
        return this.g.f;
    }

    @Override // defpackage.ko4
    public final void X0(List list) {
        H1();
        C1(list, -1, -9223372036854775807L);
    }

    @Override // defpackage.ko4
    public final void Y(boolean z) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(1)) {
            return;
        }
        this.j.Y(z);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.b = z;
        a.c = 1;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final void Y0(SurfaceHolder surfaceHolder) {
        j1(surfaceHolder);
    }

    @Override // defpackage.ko4
    public final long Z0() {
        H1();
        if (h()) {
            return this.g.I.get();
        }
        return b0();
    }

    @Override // defpackage.ko4
    public final void a() {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(2)) {
            return;
        }
        this.j.a();
        G1(aw2.y, new xo5(jp5Var, (byte) 0), false, false);
    }

    @Override // defpackage.ko4
    public final long a0() {
        H1();
        return this.g.k;
    }

    @Override // defpackage.ko4
    public final long a1() {
        H1();
        return this.g.j;
    }

    @Override // defpackage.ko4
    public final void b(rn4 rn4Var) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(13)) {
            return;
        }
        this.j.b(rn4Var);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.m = rn4Var;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.v30, defpackage.ko4
    public final long b0() {
        H1();
        return k1(this.g, this.a);
    }

    @Override // defpackage.ko4
    public final void c0(int i, final List list) {
        boolean z;
        H1();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        final jp5 jp5Var = this.g;
        int o = jp5Var.A.o();
        if (D1(20) && !list.isEmpty()) {
            final int min = Math.min(i, o);
            int size = list.size();
            ko4 ko4Var = this.j;
            if (size == 1) {
                ko4Var.O(min, (ar3) list.get(0));
            } else {
                ko4Var.c0(min, list);
            }
            aw2 aw2Var = aw2.y;
            G1(aw2.y, new r26() { // from class: vo5
                @Override // defpackage.r26
                public final Object get() {
                    fi0 fi0Var = fi0.this;
                    hf6 hf6Var = fi0Var.f;
                    jf6 jf6Var = fi0Var.a;
                    jp5 jp5Var2 = jp5Var;
                    ArrayList h1 = fi0.h1(jp5Var2, hf6Var, jf6Var);
                    int i2 = 0;
                    while (true) {
                        List list2 = list;
                        if (i2 >= list2.size()) {
                            break;
                        }
                        h1.add(min + i2, fi0.o1((ar3) list2.get(i2)));
                        i2++;
                    }
                    if (!jp5Var2.A.p()) {
                        return fi0.s1(jp5Var2, h1, hf6Var, jf6Var);
                    }
                    return fi0.t1(jp5Var2, h1, jp5Var2.E, jp5Var2.H.get(), jf6Var);
                }
            }, false, false);
        }
    }

    @Override // defpackage.ko4
    public final boolean d() {
        H1();
        return this.g.i;
    }

    @Override // defpackage.ko4
    public final void d0() {
        H1();
        jp5 jp5Var = this.g;
        if (D1(24) && this.g.q == 0.0f) {
            A1(2, jp5Var.r);
            aw2 aw2Var = aw2.y;
            Set set = this.e;
            if (set.isEmpty()) {
                F1(r1(), false, false);
                return;
            }
            set.add(aw2Var);
            ip5 a = jp5Var.a();
            a.c(jp5Var.r);
            F1(new jp5(a), false, false);
            zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
        }
    }

    @Override // defpackage.ko4
    public final rn4 e() {
        H1();
        return this.g.m;
    }

    @Override // defpackage.v30, defpackage.ko4
    public final long e0() {
        H1();
        if (h()) {
            return Math.max(this.g.K.get(), this.g.I.get());
        }
        return Q0();
    }

    @Override // defpackage.ko4
    public final int f() {
        H1();
        return this.g.v;
    }

    @Override // defpackage.v30
    public final void f1(int i, int i2, long j, boolean z) {
        boolean z2;
        H1();
        boolean z3 = false;
        if (i != -1 && i < 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        io3.n(z2);
        jp5 jp5Var = this.g;
        if (!D1(i2)) {
            return;
        }
        if (i == -1 || h() || (!jp5Var.A.p() && i >= jp5Var.A.o())) {
            z3 = true;
        }
        switch (i2) {
            case 4:
                this.j.B();
                aw2 aw2Var = aw2.y;
                break;
            case 5:
                this.j.Q(j);
                aw2 aw2Var2 = aw2.y;
                break;
            case 6:
                this.j.A();
                aw2 aw2Var22 = aw2.y;
                break;
            case 7:
                this.j.V();
                aw2 aw2Var222 = aw2.y;
                break;
            case 8:
                this.j.g0();
                aw2 aw2Var2222 = aw2.y;
                break;
            case 9:
                this.j.S0();
                aw2 aw2Var22222 = aw2.y;
                break;
            case 10:
                if (i != -1) {
                    this.j.k(i, j);
                }
                aw2 aw2Var222222 = aw2.y;
                break;
            case 11:
                this.j.V0();
                aw2 aw2Var2222222 = aw2.y;
                break;
            case 12:
                this.j.T0();
                aw2 aw2Var22222222 = aw2.y;
                break;
            default:
                p65.l();
                break;
        }
        aw2 aw2Var3 = aw2.y;
        boolean z4 = !z3;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), z4, z);
            return;
        }
        set.add(aw2Var3);
        if (!z3) {
            jp5Var = t1(jp5Var, null, i, j, this.a);
        }
        F1(jp5Var, z4, z);
        aw2Var3.a(new f32((Object) this, (Object) aw2Var3, (byte) 29), new ba(this, (byte) 4));
    }

    @Override // defpackage.ko4
    public final void g(Surface surface) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(27)) {
            return;
        }
        if (surface == null) {
            j1(null);
            return;
        }
        z1(surface);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.x = sq5.c;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final rf1 getDeviceInfo() {
        H1();
        return this.g.u;
    }

    @Override // defpackage.v30, defpackage.ko4
    public final long getDuration() {
        H1();
        if (h()) {
            kf6 kf6Var = this.g.A;
            int x = x();
            hf6 hf6Var = this.f;
            kf6Var.f(x, hf6Var, false);
            jp5 jp5Var = this.g;
            return eq6.l0(hf6Var.a(jp5Var.F, jp5Var.G));
        }
        return w();
    }

    @Override // defpackage.ko4
    public final float getVolume() {
        H1();
        return this.g.q;
    }

    @Override // defpackage.ko4
    public final boolean h() {
        H1();
        if (this.g.F != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ko4
    public final int h0() {
        H1();
        return this.g.d;
    }

    @Override // defpackage.ko4
    public final void i0(int i) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(34)) {
            return;
        }
        v1(i);
        G1(aw2.y, new xo5(jp5Var, (byte) 2), false, false);
    }

    @Override // defpackage.ko4
    public final long j() {
        H1();
        return this.g.L.get();
    }

    @Override // defpackage.ko4
    public final qh6 j0() {
        H1();
        return this.g.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j1(java.lang.Object r5) {
        /*
            r4 = this;
            r4.H1()
            jp5 r0 = r4.g
            r1 = 27
            boolean r1 = r4.D1(r1)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r1 = r5 instanceof android.view.SurfaceView
            if (r1 == 0) goto L1a
            ko4 r1 = r4.j
            android.view.SurfaceView r5 = (android.view.SurfaceView) r5
            r1.z0(r5)
            goto L45
        L1a:
            boolean r1 = r5 instanceof android.view.TextureView
            if (r1 == 0) goto L26
            ko4 r1 = r4.j
            android.view.TextureView r5 = (android.view.TextureView) r5
            r1.y(r5)
            goto L45
        L26:
            boolean r1 = r5 instanceof android.view.SurfaceHolder
            if (r1 == 0) goto L32
            ko4 r1 = r4.j
            android.view.SurfaceHolder r5 = (android.view.SurfaceHolder) r5
            r1.Y0(r5)
            goto L45
        L32:
            boolean r1 = r5 instanceof android.view.Surface
            if (r1 == 0) goto L3e
            ko4 r1 = r4.j
            android.view.Surface r5 = (android.view.Surface) r5
            r1.p(r5)
            goto L45
        L3e:
            if (r5 != 0) goto L48
            ko4 r5 = r4.j
            r5.S()
        L45:
            aw2 r5 = defpackage.aw2.y
            goto L4b
        L48:
            defpackage.p65.l()
        L4b:
            aw2 r5 = defpackage.aw2.y
            java.util.Set r1 = r4.e
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 == 0) goto L5e
            jp5 r5 = r4.r1()
            r4.F1(r5, r3, r3)
            return
        L5e:
            r1.add(r5)
            ip5 r0 = r0.a()
            sq5 r1 = defpackage.sq5.d
            r0.x = r1
            jp5 r1 = new jp5
            r1.<init>(r0)
            r4.F1(r1, r3, r3)
            f32 r0 = new f32
            r1 = 29
            r0.<init>(r4, r5, r1)
            defpackage.zo5.p(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi0.j1(java.lang.Object):void");
    }

    @Override // defpackage.ko4
    public final jr3 k0() {
        H1();
        return this.g.D;
    }

    @Override // defpackage.ko4
    public final go4 l() {
        H1();
        return this.g.a;
    }

    @Override // defpackage.ko4
    public final c31 m0() {
        H1();
        return this.g.t;
    }

    @Override // defpackage.ko4
    public final boolean n() {
        H1();
        return this.g.b;
    }

    @Override // defpackage.ko4
    public final void n0(ru ruVar, boolean z) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(35)) {
            return;
        }
        this.j.n0(ruVar, z);
        aw2 aw2Var = aw2.y;
        aw2 aw2Var2 = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var2);
        ip5 a = jp5Var.a();
        a.o = ruVar;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var2, new f32((Object) this, (Object) aw2Var2, (byte) 29));
    }

    @Override // defpackage.ko4
    public final void o0(jr3 jr3Var) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(19)) {
            return;
        }
        this.j.o0(jr3Var);
        aw2 aw2Var = aw2.y;
        aw2 aw2Var2 = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var2);
        ip5 a = jp5Var.a();
        a.E = jr3Var;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var2, new f32((Object) this, (Object) aw2Var2, (byte) 29));
    }

    @Override // defpackage.ko4
    public final void p(Surface surface) {
        j1(surface);
    }

    @Override // defpackage.ko4
    public final void r(boolean z) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(14)) {
            return;
        }
        this.j.r(z);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.h = z;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final int r0() {
        H1();
        return this.g.F;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ip5] */
    public final jp5 r1() {
        qh6 qh6Var;
        jr3 jr3Var;
        ?? obj = new Object();
        obj.a = go4.b;
        obj.b = false;
        obj.c = 1;
        obj.d = 1;
        obj.e = 0;
        obj.f = null;
        obj.g = 0;
        obj.h = false;
        obj.i = false;
        obj.j = 5000L;
        obj.k = 15000L;
        obj.l = 3000L;
        obj.m = rn4.d;
        obj.n = hh6.J;
        obj.o = ru.i;
        obj.p = 0;
        obj.q = 1.0f;
        obj.r = 1.0f;
        obj.s = hv6.d;
        obj.t = c31.d;
        obj.u = rf1.e;
        obj.v = 0;
        obj.w = false;
        obj.x = sq5.c;
        obj.y = false;
        obj.z = new fy3(-9223372036854775807L, new ey3[0]);
        z62 z62Var = nw2.y;
        obj.A = o15.B;
        obj.B = kf6.a;
        obj.C = null;
        obj.D = null;
        obj.E = jr3.M;
        obj.F = -1;
        obj.G = -1;
        obj.H = -1;
        obj.I = null;
        obj.J = new tw(-9223372036854775807L);
        tw twVar = hp5.l;
        obj.K = twVar;
        obj.L = new tw(-9223372036854775807L);
        obj.M = twVar;
        obj.N = twVar;
        obj.O = false;
        obj.P = 5;
        obj.Q = 0L;
        kz kzVar = this.k;
        if (this.j.t0(16)) {
            obj.M = (ok2) kzVar.y;
            obj.K = (ok2) kzVar.x;
        }
        if (this.j.t0(21)) {
            obj.o = this.j.C();
        }
        obj.p = this.j.K0();
        obj.a = this.j.l();
        if (this.j.t0(16)) {
            obj.L = (ok2) kzVar.A;
            ok2 ok2Var = (ok2) kzVar.z;
            obj.I = null;
            obj.J = ok2Var;
            if (this.j.t0(17)) {
                obj.a(this.j.r0(), this.j.H());
            }
        }
        if (this.j.t0(28)) {
            obj.t = this.j.m0();
        }
        if (this.j.t0(17)) {
            obj.F = this.j.s0();
        }
        obj.u = this.j.getDeviceInfo();
        if (this.j.t0(23)) {
            obj.b(this.j.f());
            obj.w = this.j.H0();
        }
        obj.i = this.j.d();
        obj.l = this.j.u();
        if (this.p) {
            obj.y = true;
            this.p = false;
        }
        obj.m = this.j.e();
        obj.d = this.j.h0();
        obj.e = this.j.D0();
        obj.f = this.j.X();
        if (this.j.t0(17)) {
            if (this.j.t0(30)) {
                qh6Var = this.j.j0();
            } else {
                qh6Var = qh6.b;
            }
            if (this.j.t0(18)) {
                jr3Var = this.j.W0();
            } else {
                jr3Var = null;
            }
            kf6 G0 = this.j.G0();
            obj.A = null;
            obj.B = G0;
            obj.C = qh6Var;
            obj.D = jr3Var;
        }
        if (this.j.t0(18)) {
            obj.E = this.j.k0();
        }
        boolean n = this.j.n();
        int i = this.m;
        obj.b = n;
        obj.c = i;
        long j = this.o;
        if (j != -9223372036854775807L) {
            int i2 = this.n;
            obj.O = true;
            obj.P = i2;
            obj.Q = j;
            this.o = -9223372036854775807L;
        }
        obj.g = this.j.F0();
        obj.j = this.j.a1();
        obj.k = this.j.a0();
        obj.h = this.j.O0();
        obj.x = this.j.K();
        obj.z = this.l;
        if (this.j.t0(16)) {
            obj.N = (ok2) kzVar.B;
        }
        obj.n = this.j.P0();
        obj.s = this.j.z();
        if (this.j.t0(22)) {
            obj.c(this.j.getVolume());
        }
        jp5 jp5Var = new jp5(obj);
        go4 go4Var = jp5Var.a;
        if (!go4Var.a(32)) {
            fo4 fo4Var = new fo4(go4Var);
            fo4Var.a.a(32);
            go4 b = fo4Var.b();
            ip5 a = jp5Var.a();
            a.a = b;
            return new jp5(a);
        }
        return jp5Var;
    }

    @Override // defpackage.ko4
    public final void release() {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(32)) {
            return;
        }
        p25 p25Var = this.r;
        p25Var.release();
        p25Var.o = null;
        vy1 vy1Var = this.q;
        if (vy1Var.t0(32)) {
            vy1Var.release();
        }
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
        } else {
            set.add(aw2Var);
            F1(jp5Var, false, false);
            zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
        }
        this.h = true;
        this.b.d();
        ip5 a = this.g.a();
        a.d = 1;
        a.N = hp5.l;
        a.L = new tw(k1(jp5Var, this.a));
        a.M = jp5Var.I;
        a.i = false;
        this.g = new jp5(a);
    }

    @Override // defpackage.ko4
    public final int s0() {
        H1();
        int i = this.g.E;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // defpackage.ko4
    public final void stop() {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(3)) {
            return;
        }
        this.j.stop();
        G1(aw2.y, new x91(this, jp5Var, (byte) 1), false, false);
    }

    @Override // defpackage.ko4
    public final long u() {
        H1();
        return this.g.l;
    }

    @Override // defpackage.ko4
    public final void u0(int i) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(15)) {
            return;
        }
        this.j.u0(i);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.g = i;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    @Override // defpackage.ko4
    public final void v(io4 io4Var) {
        io4Var.getClass();
        this.b.a(io4Var);
    }

    @Override // defpackage.ko4
    public final void v0(boolean z) {
        H1();
        jp5 jp5Var = this.g;
        if (!D1(26)) {
            return;
        }
        x1(1, z);
        aw2 aw2Var = aw2.y;
        Set set = this.e;
        if (set.isEmpty()) {
            F1(r1(), false, false);
            return;
        }
        set.add(aw2Var);
        ip5 a = jp5Var.a();
        a.w = z;
        F1(new jp5(a), false, false);
        zo5.p(this, aw2Var, new f32((Object) this, (Object) aw2Var, (byte) 29));
    }

    public final void v1(int i) {
        boolean t0 = this.j.t0(34);
        ko4 ko4Var = this.j;
        if (t0) {
            ko4Var.i0(i);
        } else {
            ko4Var.E();
        }
        aw2 aw2Var = aw2.y;
    }

    @Override // defpackage.ko4
    public final void w0(io4 io4Var) {
        H1();
        this.b.e(io4Var);
    }

    public final void w1(int i) {
        boolean t0 = this.j.t0(34);
        ko4 ko4Var = this.j;
        if (t0) {
            ko4Var.G(i);
        } else {
            ko4Var.N0();
        }
        aw2 aw2Var = aw2.y;
    }

    @Override // defpackage.v30, defpackage.ko4
    public final int x() {
        H1();
        return l1(this.g, this.f, this.a);
    }

    public final void x1(int i, boolean z) {
        boolean t0 = this.j.t0(34);
        ko4 ko4Var = this.j;
        if (t0) {
            ko4Var.D(i, z);
        } else {
            ko4Var.v0(z);
        }
        aw2 aw2Var = aw2.y;
    }

    @Override // defpackage.ko4
    public final void y(TextureView textureView) {
        j1(textureView);
    }

    @Override // defpackage.ko4
    public final void y0(final List list, final int i, int i2) {
        boolean z;
        H1();
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        final jp5 jp5Var = this.g;
        int o = jp5Var.A.o();
        if (D1(20) && i <= o) {
            final int min = Math.min(i2, o);
            if (min == i + 1 && list.size() == 1) {
                this.j.I0(i, (ar3) list.get(0));
            } else {
                this.j.y0(list, i, min);
            }
            aw2 aw2Var = aw2.y;
            G1(aw2.y, new r26() { // from class: uo5
                @Override // defpackage.r26
                public final Object get() {
                    int i3;
                    jp5 t1;
                    fi0 fi0Var = fi0.this;
                    hf6 hf6Var = fi0Var.f;
                    jf6 jf6Var = fi0Var.a;
                    jp5 jp5Var2 = jp5Var;
                    ArrayList h1 = fi0.h1(jp5Var2, hf6Var, jf6Var);
                    int i4 = 0;
                    while (true) {
                        List list2 = list;
                        int size = list2.size();
                        i3 = min;
                        if (i4 >= size) {
                            break;
                        }
                        h1.add(i3 + i4, fi0.o1((ar3) list2.get(i4)));
                        i4++;
                    }
                    if (!jp5Var2.A.p()) {
                        t1 = fi0.s1(jp5Var2, h1, hf6Var, jf6Var);
                    } else {
                        t1 = fi0.t1(jp5Var2, h1, jp5Var2.E, jp5Var2.H.get(), jf6Var);
                    }
                    int i5 = i;
                    if (i5 < i3) {
                        eq6.b0(h1, i5, i3);
                        return fi0.s1(t1, h1, hf6Var, jf6Var);
                    }
                    return t1;
                }
            }, false, false);
        }
    }

    public final void y1(int i, int i2) {
        boolean t0 = this.j.t0(33);
        ko4 ko4Var = this.j;
        if (t0) {
            ko4Var.F(i, i2);
        } else {
            ko4Var.R0(i);
        }
        aw2 aw2Var = aw2.y;
    }

    @Override // defpackage.ko4
    public final hv6 z() {
        H1();
        return this.g.s;
    }

    @Override // defpackage.ko4
    public final void z0(SurfaceView surfaceView) {
        j1(surfaceView);
    }

    public final void z1(Object obj) {
        if (obj instanceof SurfaceView) {
            this.j.I((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.j.U0((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.j.T((SurfaceHolder) obj);
        } else if (obj instanceof Surface) {
            this.j.g((Surface) obj);
        } else {
            p65.l();
            return;
        }
        aw2 aw2Var = aw2.y;
    }
}
