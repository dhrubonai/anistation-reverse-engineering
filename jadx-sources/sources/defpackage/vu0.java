package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vu0 implements a05, pu0 {
    public final s44 B;
    public final yr5 C;
    public final p44 D;
    public final q44 E;
    public final q44 F;
    public final p44 G;
    public final hj0 H;
    public final hj0 I;
    public final p44 J;
    public p44 K;
    public boolean L;
    public ko5 M;
    public nk4 N;
    public vu0 O;
    public int P;
    public final af2 Q;
    public final b25 R;
    public final kd2 S;
    public byte T;
    public ic2 U;
    public final qu0 x;
    public final rm6 y;
    public final AtomicReference z = new AtomicReference(null);
    public final Object A = new Object();

    public vu0(qu0 qu0Var, rm6 rm6Var) {
        this.x = qu0Var;
        this.y = rm6Var;
        s44 s44Var = new s44(new q44());
        this.B = s44Var;
        yr5 yr5Var = new yr5();
        if (qu0Var.e()) {
            yr5Var.H = new s34();
        }
        if (qu0Var.g()) {
            yr5Var.c();
        }
        this.C = yr5Var;
        this.D = x97.q();
        this.E = new q44();
        this.F = new q44();
        this.G = x97.q();
        hj0 hj0Var = new hj0();
        this.H = hj0Var;
        hj0 hj0Var2 = new hj0();
        this.I = hj0Var2;
        this.J = x97.q();
        this.K = x97.q();
        af2 af2Var = new af2((Object) qu0Var, (byte) 12);
        this.Q = af2Var;
        this.R = new b25((byte) 0);
        kd2 kd2Var = new kd2(rm6Var, qu0Var, as5.a(yr5Var), s44Var, hj0Var, hj0Var2, af2Var, this);
        qu0Var.s(kd2Var);
        this.S = kd2Var;
        os0 os0Var = m37.b;
    }

    public final void A(Object obj) {
        synchronized (this.A) {
            try {
                w(obj);
                Object g = this.G.g(obj);
                if (g != null) {
                    if (g instanceof q44) {
                        q44 q44Var = (q44) g;
                        Object[] objArr = q44Var.b;
                        long[] jArr = q44Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            w((he1) objArr[(i << 3) + i3]);
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
                    } else {
                        w((he1) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(ic2 ic2Var) {
        boolean l = l();
        t();
        qu0 qu0Var = this.x;
        if (l) {
            kd2 kd2Var = this.S;
            kd2Var.z = 0;
            kd2Var.y = true;
            this.U = ic2Var;
            qu0Var.a(this, ic2Var);
            if (kd2Var.F || kd2Var.z != 0) {
                ds4.a("Cannot disable reuse from root if it was caused by other groups");
            }
            kd2Var.z = -1;
            kd2Var.y = false;
            return;
        }
        this.U = ic2Var;
        qu0Var.a(this, ic2Var);
    }

    @Override // defpackage.a05
    public final void a() {
        this.L = true;
        this.Q.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.a05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu0.b(java.lang.Object):void");
    }

    public final void c() {
        this.z.set(null);
        this.H.O.L();
        this.I.O.L();
        s44 s44Var = this.B;
        if (!s44Var.x.g()) {
            b25 b25Var = this.R;
            try {
                b25Var.j(s44Var, this.S.D());
                b25Var.c();
            } finally {
                b25Var.b();
            }
        }
    }

    public final void d(Object obj, boolean z) {
        Object g = this.D.g(obj);
        if (g != null) {
            boolean z2 = g instanceof q44;
            f33 f33Var = f33.x;
            q44 q44Var = this.E;
            q44 q44Var2 = this.F;
            p44 p44Var = this.J;
            if (z2) {
                q44 q44Var3 = (q44) g;
                Object[] objArr = q44Var3.b;
                long[] jArr = q44Var3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    zz4 zz4Var = (zz4) objArr[(i << 3) + i3];
                                    if (!x97.M(p44Var, obj, zz4Var) && zz4Var.b(obj) != f33Var) {
                                        if (zz4Var.g != null && !z) {
                                            q44Var2.a(zz4Var);
                                        } else {
                                            q44Var.a(zz4Var);
                                        }
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
            } else {
                zz4 zz4Var2 = (zz4) g;
                if (!x97.M(p44Var, obj, zz4Var2) && zz4Var2.b(obj) != f33Var) {
                    if (zz4Var2.g != null && !z) {
                        q44Var2.a(zz4Var2);
                    } else {
                        q44Var.a(zz4Var2);
                    }
                }
            }
        }
    }

    public final void e(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean c2;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c3;
        long j8;
        int i;
        int i2;
        long[] jArr9;
        boolean z3 = set instanceof eb5;
        p44 p44Var = this.G;
        Object obj = null;
        int i3 = 8;
        if (z3) {
            q44 q44Var = ((eb5) set).x;
            Object[] objArr = q44Var.b;
            long[] jArr10 = q44Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i4];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c3 = c4;
                                if (obj2 instanceof zz4) {
                                    ((zz4) obj2).b(obj);
                                } else {
                                    d(obj2, z);
                                    Object g = p44Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof q44) {
                                            q44 q44Var2 = (q44) g;
                                            Object[] objArr2 = q44Var2.b;
                                            long[] jArr11 = q44Var2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i8];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                d((he1) objArr2[(i8 << 3) + i10], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i = length;
                                            d((he1) g, z);
                                        }
                                        i2 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr10;
                                c3 = c4;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c4 = c3;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c4;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr10 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof zz4) {
                    ((zz4) obj3).b(null);
                } else {
                    d(obj3, z);
                    Object g2 = p44Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof q44) {
                            q44 q44Var3 = (q44) g2;
                            Object[] objArr3 = q44Var3.b;
                            long[] jArr13 = q44Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr13[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                d((he1) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 != length3) {
                                        i12++;
                                    }
                                }
                            }
                        } else {
                            d((he1) g2, z);
                        }
                    }
                }
            }
        }
        p44 p44Var2 = this.D;
        q44 q44Var4 = this.E;
        if (z) {
            q44 q44Var5 = this.F;
            if (q44Var5.h()) {
                long[] jArr14 = p44Var2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = p44Var2.b[i18];
                                    Object obj5 = p44Var2.c[i18];
                                    if (obj5 instanceof q44) {
                                        q44 q44Var6 = (q44) obj5;
                                        Object[] objArr4 = q44Var6.b;
                                        long[] jArr15 = q44Var6.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            zz4 zz4Var = (zz4) objArr5[i22];
                                                            if (q44Var5.c(zz4Var) || q44Var4.c(zz4Var)) {
                                                                q44Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = q44Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        zz4 zz4Var2 = (zz4) obj5;
                                        if (!q44Var5.c(zz4Var2) && !q44Var4.c(zz4Var2)) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        p44Var2.m(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                q44Var5.b();
                k();
                return;
            }
        }
        if (q44Var4.h()) {
            long[] jArr17 = p44Var2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = p44Var2.b[i26];
                                Object obj7 = p44Var2.c[i26];
                                if (obj7 instanceof q44) {
                                    q44 q44Var7 = (q44) obj7;
                                    Object[] objArr6 = q44Var7.b;
                                    long[] jArr18 = q44Var7.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (q44Var4.c((zz4) objArr7[i30])) {
                                                            q44Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    c2 = q44Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = q44Var4.c((zz4) obj7);
                                }
                                if (c2) {
                                    p44Var2.m(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            k();
            q44Var4.b();
        }
    }

    @Override // defpackage.a05
    public final f33 f(zz4 zz4Var, Object obj) {
        vu0 vu0Var;
        int i = zz4Var.b;
        if ((i & 2) != 0) {
            zz4Var.b = i | 4;
        }
        ed2 ed2Var = zz4Var.c;
        if (ed2Var != null && ed2Var.a()) {
            yr5 yr5Var = this.C;
            yr5Var.getClass();
            ed2 ed2Var2 = zz4Var.c;
            if (ed2Var2 != null && yr5Var.i(tl7.h(ed2Var2))) {
                if (zz4Var.d != null) {
                    f33 v = v(zz4Var, ed2Var, obj);
                    if (v != f33.x) {
                        this.Q.d();
                    }
                    return v;
                }
                return f33.x;
            }
            synchronized (this.A) {
                vu0Var = this.O;
            }
            if (vu0Var != null) {
                kd2 kd2Var = vu0Var.S;
                if (kd2Var.F && kd2Var.j0(zz4Var, obj)) {
                    return f33.A;
                }
            }
            return f33.x;
        }
        return f33.x;
    }

    public final void g() {
        synchronized (this.A) {
            try {
                h(this.H);
                r();
            } catch (Throwable th) {
                try {
                    if (!this.B.x.g()) {
                        b25 b25Var = this.R;
                        try {
                            b25Var.j(this.B, this.S.D());
                            b25Var.c();
                            b25Var.b();
                        } catch (Throwable th2) {
                            b25Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    c();
                    throw th3;
                }
            }
        }
    }

    public final void h(hj0 hj0Var) {
        nr nrVar;
        i05 i05Var;
        String str;
        b25 b25Var;
        b25 b25Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        b25 b25Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        hj0 hj0Var2 = this.I;
        kd2 kd2Var = this.S;
        tu0 D = kd2Var.D();
        b25 b25Var4 = this.R;
        b25Var4.j(this.B, D);
        try {
            if (hj0Var.O.N()) {
                try {
                    if (hj0Var2.O.N() && this.N == null) {
                        b25Var4.c();
                    }
                    return;
                } finally {
                }
            }
            nk4 nk4Var = this.N;
            if (nk4Var != null) {
                nrVar = nk4Var.l;
            } else {
                nrVar = this.y;
            }
            if (nk4Var != null) {
                i05Var = nk4Var.l;
            } else {
                i05Var = null;
            }
            if (nrVar.equals(i05Var)) {
                str = "Compose:recordChanges";
            } else {
                str = "Compose:applyChanges";
            }
            try {
                Trace.beginSection(str);
                try {
                    nk4 nk4Var2 = this.N;
                    if (nk4Var2 != null) {
                        b25Var = nk4Var2.k;
                    } else {
                        b25Var = b25Var4;
                    }
                    yr5 yr5Var = this.C;
                    tu0 D2 = kd2Var.D();
                    bs5 h = as5.a(yr5Var).h();
                    int i3 = 0;
                    try {
                        hj0Var.S(nrVar, h, b25Var, D2);
                        h.e(true);
                        nrVar.r();
                        Trace.endSection();
                        b25Var4.d();
                        b25Var4.e();
                        if (this.L) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.L = false;
                                p44 p44Var = this.D;
                                long[] jArr3 = p44Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = p44Var.b[i8];
                                                    Object obj2 = p44Var.c[i8];
                                                    if (obj2 instanceof q44) {
                                                        q44 q44Var = (q44) obj2;
                                                        Object[] objArr = q44Var.b;
                                                        long[] jArr4 = q44Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        b25Var3 = b25Var4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((zz4) objArr[i13]).a()) {
                                                                                    q44Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i10 == length2) {
                                                                        break;
                                                                    }
                                                                    i10++;
                                                                    jArr4 = jArr5;
                                                                    j4 = j;
                                                                    i9 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        z = q44Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        b25Var3 = b25Var4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        if (!((zz4) obj2).a()) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                    }
                                                    if (z) {
                                                        p44Var.m(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    b25Var3 = b25Var4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                b25Var4 = b25Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            b25Var2 = b25Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            b25Var2 = b25Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        b25Var4 = b25Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    b25Var2 = b25Var4;
                                }
                                k();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            b25Var2 = b25Var4;
                        }
                        try {
                            if (hj0Var2.O.N() && this.N == null) {
                                b25Var2.c();
                            }
                        } finally {
                            b25Var2.b();
                        }
                    } catch (Throwable th3) {
                        try {
                            h.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (hj0Var2.O.N() && this.N == null) {
                        b25Var4.c();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void i() {
        synchronized (this.A) {
            try {
                hj0 hj0Var = this.I;
                hj0Var.getClass();
                if (!hj0Var.O.N()) {
                    h(this.I);
                }
            } catch (Throwable th) {
                try {
                    if (!this.B.x.g()) {
                        b25 b25Var = this.R;
                        try {
                            b25Var.j(this.B, this.S.D());
                            b25Var.c();
                            b25Var.b();
                        } catch (Throwable th2) {
                            b25Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    c();
                    throw th3;
                }
            }
        }
    }

    public final void j() {
        b25 b25Var;
        synchronized (this.A) {
            try {
                this.S.v = null;
                if (!this.B.x.g()) {
                    b25Var = this.R;
                    try {
                        b25Var.j(this.B, this.S.D());
                        b25Var.c();
                        b25Var.b();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.B.x.g()) {
                        b25Var = this.R;
                        try {
                            b25Var.j(this.B, this.S.D());
                            b25Var.c();
                            b25Var.b();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    c();
                    throw th2;
                }
            }
        }
    }

    public final void k() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        p44 p44Var = this.G;
        long[] jArr3 = p44Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = p44Var.b[i10];
                            Object obj2 = p44Var.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof q44;
                            j5 = j8;
                            p44 p44Var2 = this.D;
                            if (z2) {
                                q44 q44Var = (q44) obj2;
                                Object[] objArr = q44Var.b;
                                long[] jArr4 = q44Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!p44Var2.c((he1) objArr[i15])) {
                                                        q44Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = q44Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                if (!p44Var2.c((he1) obj2)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                p44Var.m(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        q44 q44Var2 = this.F;
        if (q44Var2.h()) {
            Object[] objArr2 = q44Var2.b;
            long[] jArr5 = q44Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i17 = 0;
                while (true) {
                    long j11 = jArr5[i17];
                    if ((((~j11) << c) & j11 & j2) != j2) {
                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j11 & j) < j3) {
                                int i20 = (i17 << 3) + i19;
                                if (((zz4) objArr2[i20]).g == null) {
                                    q44Var2.m(i20);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i18 != 8) {
                            return;
                        }
                    }
                    if (i17 != length3) {
                        i17++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.A) {
            z = true;
            if (this.T != 1) {
                z = false;
            }
            if (z) {
                this.T = (byte) 0;
            }
        }
        return z;
    }

    public final void m(ic2 ic2Var) {
        try {
            synchronized (this.A) {
                q();
                p44 p44Var = this.K;
                this.K = x97.q();
                try {
                    kd2 kd2Var = this.S;
                    ko5 ko5Var = this.M;
                    if (!kd2Var.e.O.N()) {
                        eu0.a("Expected applyChanges() to have been called");
                    }
                    kd2Var.P = ko5Var;
                    try {
                        kd2Var.o(p44Var, ic2Var);
                    } finally {
                        kd2Var.P = null;
                    }
                } catch (Throwable th) {
                    this.K = p44Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.B.x.g()) {
                    b25 b25Var = this.R;
                    try {
                        b25Var.j(this.B, this.S.D());
                        b25Var.c();
                        b25Var.b();
                    } catch (Throwable th3) {
                        b25Var.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                c();
                throw th4;
            }
        }
    }

    public final nk4 n(boolean z, ic2 ic2Var) {
        if (this.N != null) {
            ds4.b("A pausable composition is in progress");
        }
        nk4 nk4Var = new nk4(this, this.x, this.S, this.B, ic2Var, z, this.y, this.A);
        this.N = nk4Var;
        return nk4Var;
    }

    public final void o() {
        boolean z;
        b25 b25Var;
        synchronized (this.A) {
            try {
                if (this.N != null) {
                    ds4.b("Deactivate is not supported while pausable composition is in progress");
                }
                if (this.C.y == 0) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    try {
                        if (z) {
                            if (!this.B.x.g()) {
                            }
                            this.D.a();
                            this.G.a();
                            this.K.a();
                            this.H.O.L();
                            this.I.O.L();
                            kd2 kd2Var = this.S;
                            kd2Var.E.clear();
                            kd2Var.s.clear();
                            kd2Var.e.O.L();
                            kd2Var.v = null;
                            this.T = (byte) 1;
                        }
                        b25Var.j(this.B, this.S.D());
                        if (!z) {
                            yr5 yr5Var = this.C;
                            b25 b25Var2 = this.R;
                            bs5 h = yr5Var.h();
                            try {
                                h.m(h.t, new q(b25Var2, h, (byte) 19));
                                h.e(true);
                                this.y.r();
                                b25Var.d();
                            } catch (Throwable th) {
                                h.e(false);
                                throw th;
                            }
                        }
                        b25Var.c();
                        b25Var.b();
                        this.D.a();
                        this.G.a();
                        this.K.a();
                        this.H.O.L();
                        this.I.O.L();
                        kd2 kd2Var2 = this.S;
                        kd2Var2.E.clear();
                        kd2Var2.s.clear();
                        kd2Var2.e.O.L();
                        kd2Var2.v = null;
                        this.T = (byte) 1;
                    } catch (Throwable th2) {
                        b25Var.b();
                        throw th2;
                    }
                    b25Var = this.R;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p() {
        boolean z;
        synchronized (this.A) {
            try {
                if (this.S.F) {
                    ds4.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.T != 3) {
                    this.T = (byte) 3;
                    this.U = m37.c;
                    hj0 hj0Var = this.S.L;
                    if (hj0Var != null) {
                        h(hj0Var);
                    }
                    if (this.C.y == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || !this.B.x.g()) {
                        b25 b25Var = this.R;
                        try {
                            b25Var.j(this.B, this.S.D());
                            if (!z) {
                                yr5 yr5Var = this.C;
                                b25 b25Var2 = this.R;
                                bs5 h = yr5Var.h();
                                try {
                                    h.m(h.t, new o0((Object) b25Var2, (byte) 8));
                                    h.I();
                                    h.e(true);
                                    this.y.a();
                                    this.y.r();
                                    b25Var.d();
                                } catch (Throwable th) {
                                    h.e(false);
                                    throw th;
                                }
                            }
                            b25Var.c();
                            b25Var.b();
                        } catch (Throwable th2) {
                            b25Var.b();
                            throw th2;
                        }
                    }
                    this.J.a();
                    kd2 kd2Var = this.S;
                    kd2Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        kd2Var.b.x(kd2Var);
                        kd2Var.E.clear();
                        kd2Var.s.clear();
                        kd2Var.e.O.L();
                        kd2Var.v = null;
                        kd2Var.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.x.y(this);
    }

    public final void q() {
        Object obj = oi4.b;
        AtomicReference atomicReference = this.z;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!andSet.equals(obj)) {
                if (andSet instanceof Set) {
                    e((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        e(set, true);
                    }
                    return;
                }
                eu0.b("corrupt pendingModifications drain: " + atomicReference);
                v71.e();
                return;
            }
            eu0.b("pending composition has not been applied");
            v71.e();
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.z;
        Object andSet = atomicReference.getAndSet(null);
        if (!a34.i(andSet, oi4.b)) {
            if (andSet instanceof Set) {
                e((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    e(set, false);
                }
                return;
            }
            if (andSet == null) {
                if (this.N == null) {
                    eu0.a("calling recordModificationsOf and applyChanges concurrently is not supported");
                }
            } else {
                eu0.b("corrupt pendingModifications drain: " + atomicReference);
                v71.e();
            }
        }
    }

    public final void s() {
        tt1 tt1Var = tt1.x;
        AtomicReference atomicReference = this.z;
        Object andSet = atomicReference.getAndSet(tt1Var);
        if (!a34.i(andSet, oi4.b) && andSet != null) {
            if (andSet instanceof Set) {
                e((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    e(set, false);
                }
                return;
            }
            eu0.b("corrupt pendingModifications drain: " + atomicReference);
            v71.e();
        }
    }

    public final void t() {
        String str;
        byte b = this.T;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        str = "";
                    } else {
                        str = "The composition is disposed";
                    }
                } else {
                    str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
                }
            } else {
                str = "The composition should be activated before setting content.";
            }
            ds4.b(str);
        }
        if (this.N == null) {
            return;
        }
        ds4.b("A pausable composition is in progress");
    }

    public final void u(ArrayList arrayList) {
        s44 s44Var = this.B;
        kd2 kd2Var = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((k14) ((ai4) arrayList.get(i)).x).c != this) {
                eu0.a("Check failed");
                break;
            }
        }
        try {
            kd2Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    kd2Var.G(arrayList);
                    kd2Var.i();
                } catch (Throwable th) {
                    kd2Var.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!s44Var.x.g()) {
                    b25 b25Var = this.R;
                    try {
                        b25Var.j(s44Var, kd2Var.D());
                        b25Var.c();
                        b25Var.b();
                    } catch (Throwable th3) {
                        b25Var.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                c();
                throw th4;
            }
        }
    }

    public final f33 v(zz4 zz4Var, ed2 ed2Var, Object obj) {
        boolean z;
        synchronized (this.A) {
            try {
                vu0 vu0Var = this.O;
                vu0 vu0Var2 = null;
                if (vu0Var != null) {
                    yr5 yr5Var = this.C;
                    int i = this.P;
                    if (yr5Var.D) {
                        eu0.a("Writer is active");
                    }
                    if (i < 0 || i >= yr5Var.y) {
                        eu0.a("Invalid group index");
                    }
                    ed2 h = tl7.h(ed2Var);
                    if (yr5Var.i(h)) {
                        int i2 = yr5Var.x[(i * 5) + 3] + i;
                        int i3 = h.a;
                        if (i <= i3 && i3 < i2) {
                            vu0Var2 = vu0Var;
                        }
                    }
                    vu0Var = null;
                    vu0Var2 = vu0Var;
                }
                if (vu0Var2 == null) {
                    kd2 kd2Var = this.S;
                    if (kd2Var.F && kd2Var.j0(zz4Var, obj)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return f33.A;
                    }
                    if (obj == null) {
                        this.K.n(zz4Var, nr1.N);
                    } else {
                        boolean z2 = obj instanceof he1;
                        p44 p44Var = this.K;
                        if (!z2) {
                            p44Var.n(zz4Var, nr1.N);
                        } else {
                            Object g = p44Var.g(zz4Var);
                            if (g != null) {
                                if (g instanceof q44) {
                                    q44 q44Var = (q44) g;
                                    Object[] objArr = q44Var.b;
                                    long[] jArr = q44Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == nr1.N) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i5 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                } else if (g == nr1.N) {
                                }
                            }
                            x97.k(this.K, zz4Var, obj);
                        }
                    }
                }
                if (vu0Var2 != null) {
                    return vu0Var2.v(zz4Var, ed2Var, obj);
                }
                this.x.n(this);
                if (this.S.F) {
                    return f33.z;
                }
                return f33.y;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(Object obj) {
        Object g = this.D.g(obj);
        if (g != null) {
            boolean z = g instanceof q44;
            f33 f33Var = f33.A;
            p44 p44Var = this.J;
            if (z) {
                q44 q44Var = (q44) g;
                Object[] objArr = q44Var.b;
                long[] jArr = q44Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    zz4 zz4Var = (zz4) objArr[(i << 3) + i3];
                                    if (zz4Var.b(obj) == f33Var && !(obj instanceof he1)) {
                                        x97.k(p44Var, obj, zz4Var);
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
            } else {
                zz4 zz4Var2 = (zz4) g;
                if (zz4Var2.b(obj) == f33Var && !(obj instanceof he1)) {
                    x97.k(p44Var, obj, zz4Var2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.eb5
            p44 r3 = r0.G
            p44 r0 = r0.D
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            eb5 r1 = (defpackage.eb5) r1
            q44 r1 = r1.x
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu0.x(java.util.Set):boolean");
    }

    public final boolean y() {
        synchronized (this.A) {
            nk4 nk4Var = this.N;
            boolean z = false;
            if (nk4Var != null && (nk4Var.h.get() != pk4.B || nk4Var.i != nz5.c())) {
                AtomicReference atomicReference = nk4Var.h;
                pk4 pk4Var = pk4.C;
                pk4 pk4Var2 = pk4.A;
                while (!atomicReference.compareAndSet(pk4Var, pk4Var2) && atomicReference.get() == pk4Var) {
                }
                nk4Var.l.x.a(9);
                return false;
            }
            q();
            try {
                p44 p44Var = this.K;
                this.K = x97.q();
                try {
                    kd2 kd2Var = this.S;
                    ko5 ko5Var = this.M;
                    hg4 hg4Var = kd2Var.e.O;
                    if (!hg4Var.N()) {
                        eu0.a("Expected applyChanges() to have been called");
                    }
                    if (p44Var.e > 0 || !kd2Var.s.isEmpty()) {
                        kd2Var.P = ko5Var;
                        try {
                            kd2Var.o(p44Var, null);
                            kd2Var.P = null;
                            z = !hg4Var.N();
                        } catch (Throwable th) {
                            kd2Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        r();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.K = p44Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.B.x.g()) {
                        b25 b25Var = this.R;
                        try {
                            b25Var.j(this.B, this.S.D());
                            b25Var.c();
                            b25Var.b();
                        } catch (Throwable th4) {
                            b25Var.b();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    c();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void z(eb5 eb5Var) {
        eb5 eb5Var2;
        while (true) {
            Object obj = this.z.get();
            if (obj != null && !obj.equals(oi4.b)) {
                if (obj instanceof Set) {
                    eb5Var2 = new Set[]{obj, eb5Var};
                } else if (obj instanceof Object[]) {
                    Set[] setArr = (Set[]) obj;
                    int length = setArr.length;
                    ?? copyOf = Arrays.copyOf(setArr, length + 1);
                    copyOf[length] = eb5Var;
                    eb5Var2 = copyOf;
                } else {
                    ov3.q(this.z, "corrupt pendingModifications: ");
                    return;
                }
            } else {
                eb5Var2 = eb5Var;
            }
            AtomicReference atomicReference = this.z;
            while (!atomicReference.compareAndSet(obj, eb5Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.A) {
                    r();
                }
                return;
            }
            return;
        }
    }
}
