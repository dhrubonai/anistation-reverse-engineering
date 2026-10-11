package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n15 extends cw2 {
    public static final n15 F = new n15();
    public final transient Object A;
    public final transient Object[] B;
    public final transient boolean C;
    public final transient int D;
    public final transient n15 E;

    public n15(Object[] objArr, int i) {
        int i2;
        this.B = objArr;
        this.D = i;
        this.C = false;
        if (i >= 2) {
            i2 = zw2.j(i);
        } else {
            i2 = 0;
        }
        Object k = t15.k(objArr, i, i2, 0);
        if (!(k instanceof Object[])) {
            this.A = k;
            Object k2 = t15.k(objArr, i, i2, 1);
            if (!(k2 instanceof Object[])) {
                this.E = new n15(k2, objArr, i, this);
                return;
            }
            throw ((qw2) ((Object[]) k2)[2]).a();
        }
        throw ((qw2) ((Object[]) k)[2]).a();
    }

    @Override // defpackage.rw2
    public final zw2 c() {
        boolean z = this.C;
        return new q15(this, this.B, z ? 1 : 0, this.D);
    }

    @Override // defpackage.rw2
    public final zw2 d() {
        boolean z = this.C;
        return new r15(this, new s15(this.B, z ? 1 : 0, this.D));
    }

    @Override // defpackage.rw2, java.util.Map
    public final Object get(Object obj) {
        Object l = t15.l(this.A, this.B, this.D, this.C ? 1 : 0, obj);
        if (l == null) {
            return null;
        }
        return l;
    }

    @Override // java.util.Map
    public final int size() {
        return this.D;
    }

    public n15(Object obj, Object[] objArr, int i, n15 n15Var) {
        this.A = obj;
        this.B = objArr;
        this.C = true;
        this.D = i;
        this.E = n15Var;
    }

    public n15() {
        this.A = null;
        this.B = new Object[0];
        this.C = false;
        this.D = 0;
        this.E = this;
    }
}
