package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iq5 extends qt0 {
    public q44 A;
    public q44 B;
    public ki5 C;
    public final pp5 D;
    public final xv3 E;
    public Object y;
    public Object z;

    public iq5() {
        super((byte) 3);
        this.D = new pp5((Object) this, (byte) 1);
        o0 o0Var = new o0((Object) this, (byte) 28);
        mt5.b(mt5.a);
        synchronized (mt5.c) {
            mt5.h = yo0.v0(mt5.h, o0Var);
        }
        this.E = new xv3(o0Var, (byte) 11);
    }

    @Override // defpackage.qt0
    public final void A(lj0 lj0Var) {
        this.C = null;
        this.z = null;
        this.B = null;
        o();
    }

    @Override // defpackage.qt0
    public final void n(ki5 ki5Var) {
        this.z = null;
        this.B = null;
    }

    @Override // defpackage.qt0
    public final void o() {
        synchronized (this.x) {
            try {
                this.y = this.z;
                if (this.B == null) {
                    this.A = null;
                } else {
                    q44 q44Var = this.A;
                    if (q44Var == null) {
                        q44 q44Var2 = db5.a;
                        q44Var = new q44();
                        this.A = q44Var;
                    }
                    this.A = this.B;
                    this.B = q44Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qt0
    public final void p() {
        this.E.d();
        this.z = null;
        this.B = null;
        synchronized (this.x) {
            this.C = null;
            this.y = null;
            this.A = null;
        }
    }

    @Override // defpackage.qt0
    public final ub2 z(ki5 ki5Var) {
        ki5 ki5Var2 = this.C;
        if (ki5Var2 != null && !ki5Var2.equals(ki5Var)) {
            ds4.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.C = ki5Var;
        return this.D;
    }
}
