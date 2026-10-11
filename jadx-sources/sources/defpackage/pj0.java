package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class pj0 extends oj0 {
    public final /* synthetic */ byte A;
    public final Object B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj0(Object obj, l11 l11Var, int i, ta0 ta0Var, byte b) {
        super(l11Var, i, ta0Var);
        this.A = b;
        this.B = obj;
    }

    @Override // defpackage.oj0
    public Object f(tu4 tu4Var, vz0 vz0Var) {
        byte b = this.A;
        pn6 pn6Var = pn6.a;
        Object obj = this.B;
        switch (b) {
            case 0:
                Object invoke = ((ic2) obj).invoke(tu4Var, vz0Var);
                if (invoke == w11.x) {
                    return invoke;
                }
                return pn6Var;
            default:
                mi5 mi5Var = new mi5(tu4Var);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    tl7.z(tu4Var, null, null, new c0((w42) it.next(), mi5Var, null, (byte) 18), 3);
                }
                return pn6Var;
        }
    }

    @Override // defpackage.oj0
    public oj0 g(l11 l11Var, int i, ta0 ta0Var) {
        byte b = this.A;
        Object obj = this.B;
        switch (b) {
            case 0:
                return new pj0((ic2) obj, l11Var, i, ta0Var, (byte) 0);
            default:
                return new pj0((Iterable) obj, l11Var, i, ta0Var, (byte) 1);
        }
    }

    @Override // defpackage.oj0
    public vz4 i(v11 v11Var) {
        switch (this.A) {
            case 1:
                ic2 c0Var = new c0((Object) this, (vz0) null, (byte) 16);
                nj0 nj0Var = new nj0(bx7.E(v11Var, this.x), iv.d(this.y, 4, ta0.x), true, true);
                nj0Var.i0(y11.x, nj0Var, c0Var);
                return nj0Var;
            default:
                return super.i(v11Var);
        }
    }

    @Override // defpackage.oj0
    public String toString() {
        switch (this.A) {
            case 0:
                return "block[" + ((ic2) this.B) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
