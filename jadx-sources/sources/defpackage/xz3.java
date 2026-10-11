package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class xz3 implements yc1 {
    public xz3 B;
    public xz3 C;
    public nc4 D;
    public fa4 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public va1 J;
    public boolean K;
    public ke0 y;
    public int z;
    public xz3 x = this;
    public int A = -1;

    public final v11 O0() {
        ke0 ke0Var = this.y;
        if (ke0Var == null) {
            ke0 b = db.b(((oa) wc7.P(this)).getCoroutineContext().plus(new j43((h43) ((oa) wc7.P(this)).getCoroutineContext().get(h95.F))));
            this.y = b;
            return b;
        }
        return ke0Var;
    }

    public boolean P0() {
        return !(this instanceof a00);
    }

    public void Q0() {
        if (this.K) {
            ez2.b("node attached multiple times");
        }
        if (this.E == null) {
            ez2.b("attach invoked on a node without a coordinator");
        }
        this.K = true;
        this.H = true;
    }

    public void R0() {
        if (!this.K) {
            ez2.b("Cannot detach a node that is not attached");
        }
        if (this.H) {
            ez2.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.I) {
            ez2.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.K = false;
        ke0 ke0Var = this.y;
        if (ke0Var != null) {
            db.t(ke0Var, new tm4("The Modifier.Node was detached", (byte) 2));
            this.y = null;
        }
    }

    public void V0() {
        if (!this.K) {
            ez2.b("reset() called on an unattached node");
        }
        U0();
    }

    public void W0() {
        if (!this.K) {
            ez2.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.H) {
            ez2.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.H = false;
        S0();
        this.I = true;
    }

    public void X0() {
        if (!this.K) {
            ez2.b("node detached multiple times");
        }
        if (this.E == null) {
            ez2.b("detach invoked on a node without a coordinator");
        }
        if (!this.I) {
            ez2.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.I = false;
        va1 va1Var = this.J;
        if (va1Var != null) {
            va1Var.invoke();
        }
        T0();
    }

    public void Y0(xz3 xz3Var) {
        this.x = xz3Var;
    }

    public void Z0(fa4 fa4Var) {
        this.E = fa4Var;
    }

    public void S0() {
    }

    public void T0() {
    }

    public void U0() {
    }
}
