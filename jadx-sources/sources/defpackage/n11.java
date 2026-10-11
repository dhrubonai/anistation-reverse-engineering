package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class n11 extends t0 implements j11 {
    public static final m11 x = new m11(h95.B, new f01((byte) 2));

    public n11() {
        super(h95.B);
    }

    @Override // defpackage.t0, defpackage.l11
    public final j11 get(k11 k11Var) {
        j11 j11Var;
        k11Var.getClass();
        if (k11Var instanceof m11) {
            m11 m11Var = (m11) k11Var;
            k11 key = getKey();
            key.getClass();
            if ((key == m11Var || m11Var.y == key) && (j11Var = (j11) m11Var.x.invoke(this)) != null) {
                return j11Var;
            }
        } else if (h95.B == k11Var) {
            return this;
        }
        return null;
    }

    @Override // defpackage.t0, defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        k11Var.getClass();
        if (k11Var instanceof m11) {
            m11 m11Var = (m11) k11Var;
            k11 key = getKey();
            key.getClass();
            if (key != m11Var && m11Var.y != key) {
                return this;
            }
            if (((j11) m11Var.x.invoke(this)) == null) {
                return this;
            }
        } else if (h95.B != k11Var) {
            return this;
        }
        return it1.x;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + z51.t(this);
    }

    public void u0(l11 l11Var, Runnable runnable) {
        l11Var.getClass();
        runnable.getClass();
        z11.z.u0(l11Var, runnable);
    }

    public void v0(l11 l11Var, Runnable runnable) {
        kh1.b(this, l11Var, runnable);
    }

    public boolean w0(l11 l11Var) {
        return !(this instanceof en6);
    }

    public n11 x0(int i) {
        wk6.k(i);
        return new eh3(this, i);
    }
}
