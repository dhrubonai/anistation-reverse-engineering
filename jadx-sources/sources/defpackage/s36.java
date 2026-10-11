package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class s36 extends yl4 {
    public Object A;
    public final vz0[] B;
    public int C;
    public int D;
    public final List y;
    public final r36 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s36(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        list.getClass();
        this.y = list;
        this.z = new r36(this);
        this.A = obj;
        this.B = new vz0[list.size()];
        this.C = -1;
    }

    @Override // defpackage.yl4
    public final Object a(Object obj, xz0 xz0Var) {
        this.D = 0;
        if (this.y.size() == 0) {
            return obj;
        }
        obj.getClass();
        this.A = obj;
        if (this.C < 0) {
            return c(xz0Var);
        }
        ze0.m("Already started");
        return null;
    }

    @Override // defpackage.yl4
    public final Object b() {
        return this.A;
    }

    @Override // defpackage.yl4
    public final Object c(vz0 vz0Var) {
        Object obj;
        int i = this.D;
        int size = this.y.size();
        w11 w11Var = w11.x;
        if (i == size) {
            obj = this.A;
        } else {
            vz0Var.getClass();
            int i2 = this.C + 1;
            this.C = i2;
            vz0[] vz0VarArr = this.B;
            vz0VarArr[i2] = vz0Var;
            if (e(true)) {
                int i3 = this.C;
                if (i3 >= 0) {
                    this.C = i3 - 1;
                    vz0VarArr[i3] = null;
                    obj = this.A;
                } else {
                    ze0.m("No more continuations to resume");
                    return null;
                }
            } else {
                obj = w11Var;
            }
        }
        if (obj == w11Var) {
            vz0Var.getClass();
        }
        return obj;
    }

    @Override // defpackage.yl4
    public final Object d(vz0 vz0Var, Object obj) {
        obj.getClass();
        this.A = obj;
        return c(vz0Var);
    }

    public final boolean e(boolean z) {
        jc2 jc2Var;
        Object obj;
        r36 r36Var;
        do {
            int i = this.D;
            List list = this.y;
            if (i == list.size()) {
                if (!z) {
                    f(this.A);
                    return false;
                }
                return true;
            }
            this.D = i + 1;
            jc2Var = (jc2) list.get(i);
            try {
                obj = this.A;
                r36Var = this.z;
                jc2Var.getClass();
                obj.getClass();
                r36Var.getClass();
                wk6.j(3, jc2Var);
            } catch (Throwable th) {
                f(new y45(th));
                return false;
            }
        } while (jc2Var.invoke(this, obj, r36Var) != w11.x);
        return false;
    }

    public final void f(Object obj) {
        int i = this.C;
        if (i >= 0) {
            vz0[] vz0VarArr = this.B;
            vz0 vz0Var = vz0VarArr[i];
            vz0Var.getClass();
            int i2 = this.C;
            this.C = i2 - 1;
            vz0VarArr[i2] = null;
            n11 n11Var = (n11) vz0Var.getContext().get(h95.B);
            if (n11Var instanceof n11) {
                if (n11Var.w0(vz0Var.getContext())) {
                    vz0Var = wc7.z(vz0Var);
                }
            } else {
                vz0Var = wc7.z(vz0Var);
            }
            Throwable b = z45.b(obj);
            if (b == null) {
                vz0Var.resumeWith(obj);
                return;
            } else {
                try {
                    b.getCause();
                } catch (Throwable unused) {
                }
                vz0Var.resumeWith(new y45(b));
                return;
            }
        }
        ze0.m("No more continuations to resume");
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.z.getContext();
    }
}
