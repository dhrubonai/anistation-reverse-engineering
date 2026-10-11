package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bu0 {
    public final kd2 a;
    public hj0 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final l13 d = new l13((byte) 1);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public bu0(kd2 kd2Var, hj0 hj0Var) {
        this.a = kd2Var;
        this.b = hj0Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.g++;
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            hg4 hg4Var = this.b.O;
            hg4Var.O(dg4.c);
            hg4Var.A[hg4Var.B - hg4Var.y[hg4Var.z - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            hj0 hj0Var = this.b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            hj0Var.getClass();
            if (size != 0) {
                hg4 hg4Var2 = hj0Var.O;
                hg4Var2.O(cf4.c);
                z51.K(hg4Var2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                hg4 hg4Var = this.b.O;
                hg4Var.O(sf4.c);
                int i3 = hg4Var.B - hg4Var.y[hg4Var.z - 1].a;
                int[] iArr = hg4Var.A;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                hg4 hg4Var2 = this.b.O;
                hg4Var2.O(nf4.c);
                int i6 = hg4Var2.B - hg4Var2.y[hg4Var2.z - 1].a;
                int[] iArr2 = hg4Var2.A;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        int i;
        xr5 xr5Var = this.a.G;
        if (z) {
            i = xr5Var.i;
        } else {
            i = xr5Var.g;
        }
        int i2 = i - this.f;
        if (i2 < 0) {
            eu0.a("Tried to seek backward");
        }
        if (i2 > 0) {
            hg4 hg4Var = this.b.O;
            hg4Var.O(ve4.c);
            hg4Var.A[hg4Var.B - hg4Var.y[hg4Var.z - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        xr5 xr5Var = this.a.G;
        if (xr5Var.c > 0) {
            int i = xr5Var.i;
            l13 l13Var = this.d;
            if (l13Var.c(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.O.O(if4.c);
                    this.c = true;
                }
                if (i > 0) {
                    ed2 a = xr5Var.a(i);
                    l13Var.e(i);
                    d(false);
                    hg4 hg4Var = this.b.O;
                    hg4Var.O(hf4.c);
                    z51.K(hg4Var, 0, a);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                eu0.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
