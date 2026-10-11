package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mj0 extends oj0 {
    public final vz4 A;
    private volatile /* synthetic */ int consumed$volatile;

    static {
        AtomicIntegerFieldUpdater.newUpdater(mj0.class, "consumed$volatile");
    }

    public /* synthetic */ mj0(vz4 vz4Var) {
        this(vz4Var, it1.x, -3, ta0.x);
    }

    @Override // defpackage.oj0, defpackage.w42
    public final Object collect(x42 x42Var, vz0 vz0Var) {
        int i = this.y;
        w11 w11Var = w11.x;
        if (i == -3) {
            Object P = db.P(x42Var, this.A, false, vz0Var);
            if (P == w11Var) {
                return P;
            }
        } else {
            Object collect = super.collect(x42Var, vz0Var);
            if (collect == w11Var) {
                return collect;
            }
        }
        return pn6.a;
    }

    @Override // defpackage.oj0
    public final String e() {
        return "channel=" + this.A;
    }

    @Override // defpackage.oj0
    public final Object f(tu4 tu4Var, vz0 vz0Var) {
        Object P = db.P(new mi5(tu4Var), this.A, false, vz0Var);
        if (P == w11.x) {
            return P;
        }
        return pn6.a;
    }

    @Override // defpackage.oj0
    public final oj0 g(l11 l11Var, int i, ta0 ta0Var) {
        return new mj0(this.A, l11Var, i, ta0Var);
    }

    @Override // defpackage.oj0
    public final w42 h() {
        return new mj0(this.A);
    }

    @Override // defpackage.oj0
    public final vz4 i(v11 v11Var) {
        if (this.y == -3) {
            return this.A;
        }
        return super.i(v11Var);
    }

    public mj0(vz4 vz4Var, l11 l11Var, int i, ta0 ta0Var) {
        super(l11Var, i, ta0Var);
        this.A = vz4Var;
    }
}
