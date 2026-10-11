package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u24 extends qt0 {
    public final p44 A;
    public final xv3 B;
    public final p44 y;
    public final ArrayList z;

    public u24() {
        super((byte) 3);
        this.y = x97.q();
        this.z = new ArrayList();
        this.A = new p44();
        o0 o0Var = new o0((Object) this, (byte) 20);
        mt5.b(mt5.a);
        synchronized (mt5.c) {
            mt5.h = yo0.v0(mt5.h, o0Var);
        }
        this.B = new xv3(o0Var, (byte) 11);
    }

    @Override // defpackage.qt0
    public final void A(lj0 lj0Var) {
        this.A.l(lj0Var);
        n(lj0Var);
        o();
    }

    @Override // defpackage.qt0
    public final void n(ki5 ki5Var) {
        this.z.add(new s24(ki5Var));
    }

    @Override // defpackage.qt0
    public final void o() {
        synchronized (this.x) {
            try {
                ArrayList arrayList = this.z;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    t24 t24Var = (t24) arrayList.get(i);
                    if (t24Var instanceof r24) {
                        x97.k(this.y, ((r24) t24Var).a, ((r24) t24Var).b);
                    } else if (t24Var instanceof s24) {
                        x97.N(this.y, ((s24) t24Var).a);
                    } else {
                        throw new er0((byte) 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.z.clear();
    }

    @Override // defpackage.qt0
    public final void p() {
        this.B.d();
        this.z.clear();
        this.A.a();
        synchronized (this.x) {
            this.y.a();
        }
    }

    @Override // defpackage.qt0
    public final ub2 z(ki5 ki5Var) {
        p44 p44Var = this.A;
        ub2 ub2Var = (ub2) p44Var.g(ki5Var);
        if (ub2Var == null) {
            ub2Var = new r82(this, ki5Var, (byte) 11);
            int f = p44Var.f(ki5Var);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = p44Var.c;
            Object obj = objArr[f];
            p44Var.b[f] = ki5Var;
            objArr[f] = ub2Var;
        }
        return ub2Var;
    }
}
