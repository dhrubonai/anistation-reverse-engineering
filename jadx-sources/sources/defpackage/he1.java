package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class he1 extends yx5 implements px5 {
    public ge1 A = new ge1(mt5.h().g());
    public final sb2 y;
    public final tt5 z;

    public he1(sb2 sb2Var, tt5 tt5Var) {
        this.y = sb2Var;
        this.z = tt5Var;
    }

    @Override // defpackage.xx5
    public final zx5 b() {
        return this.A;
    }

    @Override // defpackage.xx5
    public final void f(zx5 zx5Var) {
        this.A = (ge1) zx5Var;
    }

    @Override // defpackage.px5
    public final Object getValue() {
        ub2 e = mt5.h().e();
        if (e != null) {
            e.invoke(this);
        }
        ft5 h = mt5.h();
        return h((ge1) mt5.g(this.A, h), h, true, this.y).f;
    }

    public final ge1 h(ge1 ge1Var, ft5 ft5Var, boolean z, sb2 sb2Var) {
        z44 a;
        ge1 ge1Var2;
        tt5 tt5Var;
        int i;
        if (ge1Var.d(this, ft5Var)) {
            if (z) {
                a = ut5.a();
                Object[] objArr = a.x;
                int i2 = a.z;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((jd2) objArr[i3]).b();
                }
                try {
                    b44 b44Var = ge1Var.e;
                    dn0 dn0Var = ut5.a;
                    h13 h13Var = (h13) dn0Var.get();
                    if (h13Var == null) {
                        h13Var = new h13();
                        dn0Var.O(h13Var);
                    }
                    int i4 = h13Var.a;
                    Object[] objArr2 = b44Var.b;
                    int[] iArr = b44Var.c;
                    long[] jArr = b44Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        xx5 xx5Var = (xx5) objArr2[i9];
                                        i = i6;
                                        h13Var.a = i4 + iArr[i9];
                                        ub2 e = ft5Var.e();
                                        if (e != null) {
                                            e.invoke(xx5Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    h13Var.a = i4;
                    Object[] objArr3 = a.x;
                    int i10 = a.z;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((jd2) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ge1Var;
        }
        b44 b44Var2 = new b44();
        dn0 dn0Var2 = ut5.a;
        h13 h13Var2 = (h13) dn0Var2.get();
        if (h13Var2 == null) {
            h13Var2 = new h13();
            dn0Var2.O(h13Var2);
        }
        h13 h13Var3 = h13Var2;
        int i12 = h13Var3.a;
        a = ut5.a();
        Object[] objArr4 = a.x;
        int i13 = a.z;
        for (int i14 = 0; i14 < i13; i14++) {
            ((jd2) objArr4[i14]).b();
        }
        try {
            h13Var3.a = i12 + 1;
            Object f = et5.f(new fe1((byte) 0, i12, this, h13Var3, b44Var2), sb2Var);
            h13Var3.a = i12;
            Object[] objArr5 = a.x;
            int i15 = a.z;
            for (int i16 = 0; i16 < i15; i16++) {
                ((jd2) objArr5[i16]).a();
            }
            Object obj = mt5.c;
            synchronized (obj) {
                try {
                    ft5 h = mt5.h();
                    Object obj2 = ge1Var.f;
                    if (obj2 != ge1.h && (tt5Var = this.z) != null && tt5Var.g(f, obj2)) {
                        ge1Var.e = b44Var2;
                        ge1Var.g = ge1Var.e(this, h);
                        ge1Var2 = ge1Var;
                    } else {
                        ge1 ge1Var3 = this.A;
                        synchronized (obj) {
                            zx5 k = mt5.k(ge1Var3, this);
                            k.a(ge1Var3);
                            k.a = h.g();
                            ge1Var2 = (ge1) k;
                            ge1Var2.e = b44Var2;
                            ge1Var2.g = ge1Var2.e(this, h);
                            ge1Var2.f = f;
                        }
                        return ge1Var2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            h13 h13Var4 = (h13) ut5.a.get();
            if (h13Var4 != null && h13Var4.a == 0) {
                mt5.h().m();
                synchronized (obj) {
                    ft5 h2 = mt5.h();
                    ge1Var2.c = h2.g();
                    ge1Var2.d = h2.h();
                    return ge1Var2;
                }
            }
            return ge1Var2;
        } finally {
            Object[] objArr6 = a.x;
            int i17 = a.z;
            for (int i18 = 0; i18 < i17; i18++) {
                ((jd2) objArr6[i18]).a();
            }
        }
    }

    public final ge1 i() {
        ft5 h = mt5.h();
        return h((ge1) mt5.g(this.A, h), h, false, this.y);
    }

    public final String toString() {
        String str;
        ge1 ge1Var = (ge1) mt5.f(this.A);
        if (ge1Var.d(this, mt5.h())) {
            str = String.valueOf(ge1Var.f);
        } else {
            str = "<Not calculated>";
        }
        return "DerivedState(value=" + str + ")@" + hashCode();
    }
}
