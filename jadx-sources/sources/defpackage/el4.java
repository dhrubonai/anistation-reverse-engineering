package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class el4 extends cl4 {
    public final dl4 A;
    public Object B;
    public boolean C;
    public int D;

    public el4(dl4 dl4Var, pj6[] pj6VarArr) {
        super(dl4Var.z, pj6VarArr);
        this.A = dl4Var;
        this.D = dl4Var.B;
    }

    public final void c(int i, oj6 oj6Var, Object obj, int i2) {
        int i3 = i2 * 5;
        pj6[] pj6VarArr = this.x;
        if (i3 > 30) {
            pj6 pj6Var = pj6VarArr[i2];
            Object[] objArr = oj6Var.d;
            pj6Var.a(objArr, objArr.length, 0);
            while (true) {
                pj6 pj6Var2 = pj6VarArr[i2];
                if (!a34.i(pj6Var2.x[pj6Var2.z], obj)) {
                    pj6VarArr[i2].z += 2;
                } else {
                    this.y = i2;
                    return;
                }
            }
        } else {
            int m = 1 << nv5.m(i, i3);
            if (oj6Var.h(m)) {
                pj6VarArr[i2].a(oj6Var.d, Integer.bitCount(oj6Var.a) * 2, oj6Var.f(m));
                this.y = i2;
            } else {
                int t = oj6Var.t(m);
                oj6 s = oj6Var.s(t);
                pj6VarArr[i2].a(oj6Var.d, Integer.bitCount(oj6Var.a) * 2, t);
                c(i, s, obj, i2 + 1);
            }
        }
    }

    @Override // defpackage.cl4, java.util.Iterator
    public final Object next() {
        if (this.A.B == this.D) {
            if (this.z) {
                pj6 pj6Var = this.x[this.y];
                this.B = pj6Var.x[pj6Var.z];
                this.C = true;
                return super.next();
            }
            qi2.e();
            return null;
        }
        ze0.j();
        return null;
    }

    @Override // defpackage.cl4, java.util.Iterator
    public final void remove() {
        int i;
        if (this.C) {
            boolean z = this.z;
            dl4 dl4Var = this.A;
            if (z) {
                if (z) {
                    pj6 pj6Var = this.x[this.y];
                    Object obj = pj6Var.x[pj6Var.z];
                    wk6.i(dl4Var).remove(this.B);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    c(i, dl4Var.z, obj, 0);
                } else {
                    qi2.e();
                    return;
                }
            } else {
                wk6.i(dl4Var).remove(this.B);
            }
            this.B = null;
            this.C = false;
            this.D = dl4Var.B;
            return;
        }
        p65.l();
    }
}
