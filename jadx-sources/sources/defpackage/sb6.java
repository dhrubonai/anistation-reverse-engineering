package defpackage;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sb6 implements b14 {
    public final Object A;
    public final /* synthetic */ Object B;
    public int x;
    public boolean y;
    public long z;

    public sb6(cc6 cc6Var, lb5 lb5Var) {
        this.B = cc6Var;
        this.A = lb5Var;
        this.x = -1;
        this.z = 9205357640488583168L;
        this.y = true;
    }

    @Override // defpackage.b14
    public boolean a(long j, p65 p65Var) {
        cc6 cc6Var = (cc6) this.B;
        dd6 dd6Var = cc6Var.b;
        gi6 gi6Var = cc6Var.a;
        bd6 c = dd6Var.c();
        if (!cc6Var.i || c == null || gi6Var.d().A.length() == 0) {
            return false;
        }
        if (!nd6.c(gi6Var.d().B, b(j, p65Var, c, false))) {
            this.y = false;
            return true;
        }
        return true;
    }

    public long b(long j, p65 p65Var, bd6 bd6Var, boolean z) {
        cc6 cc6Var = (cc6) this.B;
        int length = bd6Var.a.a.y.length();
        int i = this.x;
        if (i < 0 || i > length) {
            i = cc6Var.b.d(this.z, false);
        }
        int i2 = i;
        long B = cc6Var.B(cc6Var.a.d(), i2, cc6Var.b.d(j, false), false, p65Var, false, z, null);
        if (this.x == -1 && !nd6.d(B)) {
            this.x = (int) (B >> 32);
        }
        if (nd6.h(B)) {
            B = fy5.a((int) (4294967295L & B), (int) (B >> 32));
        }
        cc6Var.a.j(B);
        cc6Var.x(be6.z);
        return B;
    }

    @Override // defpackage.b14
    public boolean c(long j) {
        return true;
    }

    @Override // defpackage.b14
    public void d() {
        cc6 cc6Var = (cc6) this.B;
        cc6Var.q.setValue(rb6.x);
        if (this.y) {
            cc6Var.r();
        }
    }

    @Override // defpackage.b14
    public boolean e(long j) {
        cc6 cc6Var = (cc6) this.B;
        bd6 c = cc6Var.b.c();
        if (!cc6Var.i || c == null || cc6Var.a.d().A.length() == 0) {
            return false;
        }
        this.y = false;
        ((lb5) this.A).invoke();
        b(j, l68.K, c, false);
        return true;
    }

    @Override // defpackage.b14
    public boolean f(long j, p65 p65Var, int i) {
        cc6 cc6Var = (cc6) this.B;
        bd6 c = cc6Var.b.c();
        boolean z = false;
        if (!cc6Var.i || c == null || cc6Var.a.d().A.length() == 0) {
            return false;
        }
        if (i >= 2) {
            z = true;
        }
        this.y = z;
        cc6Var.q.setValue(rb6.z);
        ((lb5) this.A).invoke();
        cc6Var.v = -1;
        this.x = -1;
        this.z = j;
        this.x = (int) (b(j, p65Var, c, true) >> 32);
        return true;
    }

    public long g() {
        if (!this.y) {
            this.y = true;
            this.z = ((bt7) this.B).P().getLong((String) this.A, this.x);
        }
        return this.z;
    }

    public void h(long j) {
        SharedPreferences.Editor edit = ((bt7) this.B).P().edit();
        edit.putLong((String) this.A, j);
        edit.apply();
        this.z = j;
    }

    public sb6(bt7 bt7Var, String str, long j) {
        Objects.requireNonNull(bt7Var);
        this.B = bt7Var;
        a34.u(str);
        this.A = str;
        this.x = (int) j;
    }
}
