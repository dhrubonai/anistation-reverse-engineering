package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class rj0 extends oj0 {
    public final w42 A;

    public rj0(int i, ta0 ta0Var, l11 l11Var, w42 w42Var) {
        super(l11Var, i, ta0Var);
        this.A = w42Var;
    }

    @Override // defpackage.oj0, defpackage.w42
    public final Object collect(x42 x42Var, vz0 vz0Var) {
        l11 s;
        int i = this.y;
        w11 w11Var = w11.x;
        if (i == -3) {
            l11 context = vz0Var.getContext();
            Boolean bool = Boolean.FALSE;
            st0 st0Var = new st0((byte) 5);
            l11 l11Var = this.x;
            if (!((Boolean) l11Var.fold(bool, st0Var)).booleanValue()) {
                s = context.plus(l11Var);
            } else {
                s = bx7.s(context, l11Var, false);
            }
            if (a34.i(s, context)) {
                Object j = j(x42Var, vz0Var);
                if (j == w11Var) {
                    return j;
                }
            } else {
                h95 h95Var = h95.B;
                if (a34.i(s.get(h95Var), context.get(h95Var))) {
                    l11 context2 = vz0Var.getContext();
                    if (!(x42Var instanceof mi5) && !(x42Var instanceof va4)) {
                        x42Var = new zk(x42Var, context2);
                    }
                    Object t0 = db.t0(s, x42Var, ke6.b(s), new c0((Object) this, (vz0) null, (byte) 17), vz0Var);
                    if (t0 == w11Var) {
                        return t0;
                    }
                }
            }
            return pn6.a;
        }
        Object collect = super.collect(x42Var, vz0Var);
        if (collect == w11Var) {
            return collect;
        }
        return pn6.a;
    }

    @Override // defpackage.oj0
    public final Object f(tu4 tu4Var, vz0 vz0Var) {
        Object j = j(new mi5(tu4Var), vz0Var);
        if (j == w11.x) {
            return j;
        }
        return pn6.a;
    }

    public Object j(x42 x42Var, vz0 vz0Var) {
        Object collect = this.A.collect(x42Var, vz0Var);
        if (collect == w11.x) {
            return collect;
        }
        return pn6.a;
    }

    @Override // defpackage.oj0
    public final String toString() {
        return this.A + " -> " + super.toString();
    }
}
