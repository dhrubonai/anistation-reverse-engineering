package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ba3 implements c25, p11 {
    public bx5 A;
    public final l11 x;
    public final ic2 y;
    public final ke0 z;

    public ba3(l11 l11Var, ic2 ic2Var) {
        this.x = l11Var;
        this.y = ic2Var;
        this.z = db.b(l11Var.plus(this));
    }

    @Override // defpackage.c25
    public final void a() {
        bx5 bx5Var = this.A;
        if (bx5Var != null) {
            bx5Var.s(new ca2((byte) 1));
        }
        this.A = null;
    }

    @Override // defpackage.c25
    public final void b() {
        bx5 bx5Var = this.A;
        if (bx5Var != null) {
            bx5Var.s(new ca2((byte) 1));
        }
        this.A = null;
    }

    @Override // defpackage.c25
    public final void c() {
        bx5 bx5Var = this.A;
        if (bx5Var != null) {
            h98.j(bx5Var, "Old job was still running!", null);
        }
        this.A = tl7.z(this.z, null, null, this.y, 3);
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(obj, this);
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        return tl7.u(this, k11Var);
    }

    @Override // defpackage.j11
    public final k11 getKey() {
        return o11.x;
    }

    @Override // defpackage.p11
    public final void handleException(l11 l11Var, Throwable th) {
        tu0 tu0Var = (tu0) l11Var.get(tu0.y);
        if (tu0Var != null) {
            iv.Q(th, new n(tu0Var, this, (byte) 28));
        }
        p11 p11Var = (p11) this.x.get(o11.x);
        if (p11Var != null) {
            p11Var.handleException(l11Var, th);
            return;
        }
        throw th;
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }
}
