package defpackage;

import android.os.Parcel;
import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class mn0 implements ue2, te2, g25 {
    public boolean x;
    public Object y;

    public mn0() {
        this.y = new SparseBooleanArray();
    }

    public void a(int i) {
        io3.B(!this.x);
        ((SparseBooleanArray) this.y).append(i, true);
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        sm7 sm7Var = (sm7) this.y;
        boolean z = this.x;
        sm7Var.getClass();
        uh7 uh7Var = (uh7) ((t98) obj).m();
        double d = sm7Var.v;
        boolean z2 = sm7Var.w;
        lp i = rv5.i();
        Parcel K = uh7Var.K();
        int i2 = nn7.a;
        K.writeInt(z ? 1 : 0);
        K.writeDouble(d);
        K.writeInt(z2 ? 1 : 0);
        nn7.b(K, i);
        uh7Var.O(K, 8);
        ((p76) obj2).b(null);
    }

    public void b(g42 g42Var) {
        for (int i = 0; i < g42Var.a.size(); i++) {
            a(g42Var.a(i));
        }
    }

    public void c(int... iArr) {
        for (int i : iArr) {
            a(i);
        }
    }

    public g42 d() {
        io3.B(!this.x);
        this.x = true;
        return new g42((SparseBooleanArray) this.y);
    }

    public void e() {
        this.x = true;
    }

    @Override // defpackage.ue2
    public synchronized void f() {
        if (this.x) {
            ((dn0) this.y).f();
        }
    }

    public void g() {
        this.x = false;
    }

    @Override // defpackage.te2
    public void h() {
        if (this.x) {
            ((dn0) this.y).h();
        }
    }

    public void i() {
        this.x = false;
    }

    public void j(byte b) {
        ((b23) this.y).writeLong(b);
    }

    @Override // defpackage.te2
    public void k(we2 we2Var) {
        if (this.x) {
            ((dn0) this.y).k(we2Var);
        }
    }

    public void l(char c) {
        ((b23) this.y).e(c);
    }

    public void m(int i) {
        ((b23) this.y).writeLong(i);
    }

    @Override // defpackage.ue2
    public synchronized void n(we2 we2Var, long j) {
        if (this.x) {
            ((dn0) this.y).n(we2Var, j);
        }
    }

    public void o(long j) {
        ((b23) this.y).writeLong(j);
    }

    public void p(short s) {
        ((b23) this.y).writeLong(s);
    }

    @Override // defpackage.te2
    public synchronized void q() {
        if (this.x) {
            ((dn0) this.y).q();
        }
    }

    public void r(String str) {
        str.getClass();
        ((b23) this.y).h(str);
    }

    public mn0(b23 b23Var) {
        this.y = b23Var;
        this.x = true;
    }

    public /* synthetic */ mn0(Object obj, boolean z) {
        this.y = obj;
        this.x = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mn0(oj6 oj6Var, int i) {
        this.y = oj6Var;
        this.x = i;
    }

    public void s() {
    }

    public void t() {
    }
}
