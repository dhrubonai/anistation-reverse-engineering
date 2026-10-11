package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k15 extends hs3 implements g15 {
    public final String a;
    public final String b;
    public final is3 c;
    public boolean d;
    public int e = -1;
    public int f;
    public f15 g;
    public int h;
    public final /* synthetic */ l15 i;

    public k15(l15 l15Var, String str, String str2, is3 is3Var) {
        this.i = l15Var;
        this.a = str;
        this.b = str2;
        this.c = is3Var;
    }

    @Override // defpackage.g15
    public final int a() {
        return this.h;
    }

    @Override // defpackage.g15
    public final void b(f15 f15Var) {
        this.g = f15Var;
        int i = f15Var.e;
        f15Var.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        bundle.putParcelable("routeControllerOptions", this.c.a);
        int i2 = f15Var.d;
        f15Var.d = i2 + 1;
        f15Var.b(3, i2, i, null, bundle);
        this.h = i;
        if (this.d) {
            f15Var.a(i);
            int i3 = this.e;
            if (i3 >= 0) {
                f15Var.c(this.h, i3);
                this.e = -1;
            }
            int i4 = this.f;
            if (i4 != 0) {
                f15Var.d(this.h, i4);
                this.f = 0;
            }
        }
    }

    @Override // defpackage.g15
    public final void c() {
        f15 f15Var = this.g;
        if (f15Var != null) {
            int i = this.h;
            int i2 = f15Var.d;
            f15Var.d = i2 + 1;
            f15Var.b(4, i2, i, null, null);
            this.g = null;
            this.h = 0;
        }
    }

    @Override // defpackage.hs3
    public final void d() {
        l15 l15Var = this.i;
        l15Var.H.remove(this);
        c();
        l15Var.l();
    }

    @Override // defpackage.hs3
    public final void e() {
        this.d = true;
        f15 f15Var = this.g;
        if (f15Var != null) {
            f15Var.a(this.h);
        }
    }

    @Override // defpackage.hs3
    public final void f(int i) {
        f15 f15Var = this.g;
        if (f15Var != null) {
            f15Var.c(this.h, i);
        } else {
            this.e = i;
            this.f = 0;
        }
    }

    @Override // defpackage.hs3
    public final void g() {
        h(0);
    }

    @Override // defpackage.hs3
    public final void h(int i) {
        this.d = false;
        f15 f15Var = this.g;
        if (f15Var != null) {
            int i2 = this.h;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = f15Var.d;
            f15Var.d = i3 + 1;
            f15Var.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.hs3
    public final void i(int i) {
        f15 f15Var = this.g;
        if (f15Var != null) {
            f15Var.d(this.h, i);
        } else {
            this.f += i;
        }
    }
}
