package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dc3 implements rd3 {
    public final wc3 a;
    public final bc3 b;
    public final eb2 c;

    public dc3(wc3 wc3Var, bc3 bc3Var, eb2 eb2Var) {
        this.a = wc3Var;
        this.b = bc3Var;
        this.c = eb2Var;
    }

    @Override // defpackage.rd3
    public final int a() {
        return this.b.T().y;
    }

    @Override // defpackage.rd3
    public final Object b(int i) {
        Object obj;
        eb2 eb2Var = this.c;
        Object[] objArr = (Object[]) eb2Var.A;
        int i2 = i - eb2Var.y;
        if (i2 >= 0 && i2 < objArr.length) {
            obj = objArr[i2];
        } else {
            obj = null;
        }
        if (obj == null) {
            return this.b.U(i);
        }
        return obj;
    }

    @Override // defpackage.rd3
    public final Object c(int i) {
        return this.b.S(i);
    }

    @Override // defpackage.rd3
    public final void d(int i, Object obj, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        Object obj2;
        kd2 kd2Var2;
        kd2Var.f0(1493551140);
        if (kd2Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (kd2Var.h(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (kd2Var.f(this)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        byte b = 0;
        if ((i9 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i9 & 1, z)) {
            kd2Var2 = kd2Var;
            t80.e(obj, i, this.a.q, nx7.R(726189336, new cc3(this, i, b), kd2Var), kd2Var2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112));
            obj2 = obj;
            i6 = i;
        } else {
            i6 = i;
            obj2 = obj;
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new mo(this, i6, obj2, i2, (byte) 4);
        }
    }

    @Override // defpackage.rd3
    public final int e(Object obj) {
        return this.c.l(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc3)) {
            return false;
        }
        return a34.i(this.b, ((dc3) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
