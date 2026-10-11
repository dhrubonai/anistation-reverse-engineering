package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fl2 {
    public final ha3 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final f44 f = new f44();
    public final ka4 g = new ka4();
    public final x34 h = new x34(10);

    public fl2(ha3 ha3Var) {
        this.a = ha3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void a(long j, List list, boolean z) {
        x34 x34Var;
        long[] jArr;
        long[] jArr2;
        int i;
        aa4 aa4Var;
        aa4 aa4Var2;
        int size = list.size();
        ka4 ka4Var = this.g;
        ka4 ka4Var2 = ka4Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            x34Var = this.h;
            if (i2 >= size) {
                break;
            }
            xz3 xz3Var = (xz3) list.get(i2);
            if (xz3Var.K) {
                xz3Var.J = new va1(this, xz3Var, (byte) 10);
                if (z2) {
                    z44 z44Var = ka4Var2.a;
                    ?? r14 = z44Var.x;
                    int i3 = z44Var.z;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            aa4Var2 = r14[i4];
                            if (((aa4) aa4Var2).c.equals(xz3Var)) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            aa4Var2 = 0;
                            break;
                        }
                    }
                    aa4Var = aa4Var2;
                    if (aa4Var != null) {
                        aa4Var.i = true;
                        aa4Var.d.a(j);
                        if (z) {
                            Object d = x34Var.d(j);
                            if (d == null) {
                                d = new f44();
                                x34Var.g(j, d);
                            }
                            ((f44) d).a(aa4Var);
                        }
                        ka4Var2 = aa4Var;
                    } else {
                        z2 = false;
                    }
                }
                aa4Var = new aa4(xz3Var);
                aa4Var.d.a(j);
                if (z) {
                    Object d2 = x34Var.d(j);
                    if (d2 == null) {
                        d2 = new f44();
                        x34Var.g(j, d2);
                    }
                    ((f44) d2).a(aa4Var);
                }
                ka4Var2.a.b(aa4Var);
                ka4Var2 = aa4Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = x34Var.b;
            Object[] objArr = x34Var.c;
            long[] jArr4 = x34Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                f44 f44Var = (f44) objArr[i9];
                                z44 z44Var2 = ka4Var.a;
                                i = i6;
                                Object[] objArr2 = z44Var2.x;
                                int i10 = z44Var2.z;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((aa4) objArr2[i11]).f(j3, f44Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        x34Var.a();
    }

    public final boolean b(u98 u98Var, boolean z) {
        ka4 ka4Var = this.g;
        z44 z44Var = ka4Var.a;
        if (!ka4Var.a((sl3) u98Var.z, this.a, u98Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = z44Var.x;
        int i = z44Var.z;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((aa4) objArr[i2]).e(u98Var, z) && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        Object[] objArr2 = z44Var.x;
        int i3 = z44Var.z;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (!((aa4) objArr2[i4]).d(u98Var) && !z4) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        ka4Var.b(u98Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            f44 f44Var = this.f;
            int i5 = f44Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((xz3) f44Var.g(i6));
            }
            f44Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            ka4Var.a.h();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        ka4 ka4Var = this.g;
        z44 z44Var = ka4Var.a;
        Object[] objArr = z44Var.x;
        int i = z44Var.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((aa4) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            ka4Var.a.h();
        }
    }

    public final void d(xz3 xz3Var) {
        if (this.b) {
            this.e = true;
            this.f.a(xz3Var);
            return;
        }
        ka4 ka4Var = this.g;
        f44 f44Var = ka4Var.b;
        f44Var.d();
        f44Var.a(ka4Var);
        while (f44Var.j()) {
            ka4 ka4Var2 = (ka4) f44Var.l(f44Var.b - 1);
            int i = 0;
            while (true) {
                z44 z44Var = ka4Var2.a;
                if (i < z44Var.z) {
                    aa4 aa4Var = (aa4) z44Var.x[i];
                    if (aa4Var.c.equals(xz3Var)) {
                        ka4Var2.a.k(aa4Var);
                        aa4Var.c();
                    } else {
                        f44Var.a(aa4Var);
                        i++;
                    }
                }
            }
        }
    }
}
