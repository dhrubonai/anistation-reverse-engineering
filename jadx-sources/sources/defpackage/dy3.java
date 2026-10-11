package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dy3 implements zb5 {
    public final h2 a;
    public final fo6 b;
    public final zz1 c;

    public dy3(fo6 fo6Var, zz1 zz1Var, h2 h2Var) {
        this.b = fo6Var;
        zz1Var.getClass();
        this.c = zz1Var;
        this.a = h2Var;
    }

    @Override // defpackage.zb5
    public final void a(Object obj, Object obj2) {
        cc5.k(this.b, obj, obj2);
    }

    @Override // defpackage.zb5
    public final void b(Object obj) {
        this.b.getClass();
        eo6 eo6Var = ((vd2) obj).unknownFields;
        if (eo6Var.e) {
            eo6Var.e = false;
        }
        this.c.getClass();
        h11.v(obj);
        throw null;
    }

    @Override // defpackage.zb5
    public final boolean c(Object obj) {
        this.c.getClass();
        h11.v(obj);
        throw null;
    }

    @Override // defpackage.zb5
    public final vd2 d() {
        h2 h2Var = this.a;
        if (h2Var instanceof vd2) {
            return ((vd2) h2Var).i();
        }
        return ((td2) ((vd2) h2Var).c(5)).b();
    }

    @Override // defpackage.zb5
    public final boolean e(vd2 vd2Var, vd2 vd2Var2) {
        this.b.getClass();
        if (!vd2Var.unknownFields.equals(vd2Var2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.zb5
    public final int f(vd2 vd2Var) {
        this.b.getClass();
        return vd2Var.unknownFields.hashCode();
    }

    @Override // defpackage.zb5
    public final void g(Object obj, i75 i75Var) {
        this.c.getClass();
        h11.v(obj);
        throw null;
    }

    @Override // defpackage.zb5
    public final int h(vd2 vd2Var) {
        this.b.getClass();
        eo6 eo6Var = vd2Var.unknownFields;
        int i = eo6Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < eo6Var.a; i3++) {
            int i4 = eo6Var.b[i3] >>> 3;
            i2 += to0.f(3, (xd0) eo6Var.c[i3]) + to0.i(i4) + to0.h(2) + (to0.h(1) * 2);
        }
        eo6Var.d = i2;
        return i2;
    }

    @Override // defpackage.zb5
    public final void i(Object obj, fm0 fm0Var, xz1 xz1Var) {
        this.b.getClass();
        fo6.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
