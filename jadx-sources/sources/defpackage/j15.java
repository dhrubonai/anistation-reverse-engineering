package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j15 extends gs3 implements g15 {
    public final String f;
    public final is3 g;
    public boolean h;
    public int j;
    public f15 k;
    public final /* synthetic */ l15 m;
    public int i = -1;
    public int l = -1;

    public j15(l15 l15Var, String str, is3 is3Var) {
        this.m = l15Var;
        this.f = str;
        this.g = is3Var;
    }

    @Override // defpackage.g15
    public final int a() {
        return this.l;
    }

    @Override // defpackage.g15
    public final void b(f15 f15Var) {
        Object obj = new Object();
        this.k = f15Var;
        int i = f15Var.e;
        f15Var.e = i + 1;
        int i2 = f15Var.d;
        f15Var.d = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        bundle.putParcelable("routeControllerOptions", this.g.a);
        f15Var.b(11, i2, i, null, bundle);
        f15Var.h.put(i2, obj);
        this.l = i;
        if (this.h) {
            f15Var.a(i);
            int i3 = this.i;
            if (i3 >= 0) {
                f15Var.c(this.l, i3);
                this.i = -1;
            }
            int i4 = this.j;
            if (i4 != 0) {
                f15Var.d(this.l, i4);
                this.j = 0;
            }
        }
    }

    @Override // defpackage.g15
    public final void c() {
        f15 f15Var = this.k;
        if (f15Var != null) {
            int i = this.l;
            int i2 = f15Var.d;
            f15Var.d = i2 + 1;
            f15Var.b(4, i2, i, null, null);
            this.k = null;
            this.l = 0;
        }
    }

    @Override // defpackage.hs3
    public final void d() {
        l15 l15Var = this.m;
        l15Var.H.remove(this);
        c();
        l15Var.l();
    }

    @Override // defpackage.hs3
    public final void e() {
        this.h = true;
        f15 f15Var = this.k;
        if (f15Var != null) {
            f15Var.a(this.l);
        }
    }

    @Override // defpackage.hs3
    public final void f(int i) {
        f15 f15Var = this.k;
        if (f15Var != null) {
            f15Var.c(this.l, i);
        } else {
            this.i = i;
            this.j = 0;
        }
    }

    @Override // defpackage.hs3
    public final void g() {
        h(0);
    }

    @Override // defpackage.hs3
    public final void h(int i) {
        this.h = false;
        f15 f15Var = this.k;
        if (f15Var != null) {
            int i2 = this.l;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = f15Var.d;
            f15Var.d = i3 + 1;
            f15Var.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.hs3
    public final void i(int i) {
        f15 f15Var = this.k;
        if (f15Var != null) {
            f15Var.d(this.l, i);
        } else {
            this.j += i;
        }
    }
}
