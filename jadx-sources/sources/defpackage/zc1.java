package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zc1 extends xz3 {
    public final int L = ga4.e(this);
    public xz3 M;

    @Override // defpackage.xz3
    public final void Q0() {
        super.Q0();
        for (xz3 xz3Var = this.M; xz3Var != null; xz3Var = xz3Var.C) {
            xz3Var.Z0(this.E);
            if (!xz3Var.K) {
                xz3Var.Q0();
            }
        }
    }

    @Override // defpackage.xz3
    public final void R0() {
        for (xz3 xz3Var = this.M; xz3Var != null; xz3Var = xz3Var.C) {
            xz3Var.R0();
        }
        super.R0();
    }

    @Override // defpackage.xz3
    public final void V0() {
        super.V0();
        for (xz3 xz3Var = this.M; xz3Var != null; xz3Var = xz3Var.C) {
            xz3Var.V0();
        }
    }

    @Override // defpackage.xz3
    public final void W0() {
        for (xz3 xz3Var = this.M; xz3Var != null; xz3Var = xz3Var.C) {
            xz3Var.W0();
        }
        super.W0();
    }

    @Override // defpackage.xz3
    public final void X0() {
        super.X0();
        for (xz3 xz3Var = this.M; xz3Var != null; xz3Var = xz3Var.C) {
            xz3Var.X0();
        }
    }

    @Override // defpackage.xz3
    public final void Y0(xz3 xz3Var) {
        this.x = xz3Var;
        for (xz3 xz3Var2 = this.M; xz3Var2 != null; xz3Var2 = xz3Var2.C) {
            xz3Var2.Y0(xz3Var);
        }
    }

    @Override // defpackage.xz3
    public final void Z0(fa4 fa4Var) {
        this.E = fa4Var;
        for (xz3 xz3Var = this.M; xz3Var != null; xz3Var = xz3Var.C) {
            xz3Var.Z0(fa4Var);
        }
    }

    public final yc1 a1(yc1 yc1Var) {
        xz3 xz3Var;
        xz3 xz3Var2;
        xz3 xz3Var3 = ((xz3) yc1Var).x;
        if (xz3Var3 != yc1Var) {
            if (yc1Var instanceof xz3) {
                xz3Var = (xz3) yc1Var;
            } else {
                xz3Var = null;
            }
            if (xz3Var != null) {
                xz3Var2 = xz3Var.B;
            } else {
                xz3Var2 = null;
            }
            if (xz3Var3 != this.x || !a34.i(xz3Var2, this)) {
                ze0.m("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (xz3Var3.K) {
                ez2.b("Cannot delegate to an already attached node");
            }
            xz3Var3.Y0(this.x);
            int i = this.z;
            int f = ga4.f(xz3Var3);
            xz3Var3.z = f;
            int i2 = this.z;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof ra3)) {
                ez2.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + xz3Var3);
            }
            xz3Var3.C = this.M;
            this.M = xz3Var3;
            xz3Var3.B = this;
            c1(f | this.z, false);
            if (this.K) {
                if (i3 != 0 && (i & 2) == 0) {
                    kf kfVar = wc7.O(this).c0;
                    this.x.Z0(null);
                    kfVar.k();
                } else {
                    Z0(this.E);
                }
                xz3Var3.Q0();
                xz3Var3.W0();
                if (!xz3Var3.K) {
                    ez2.b("autoInvalidateInsertedNode called on unattached node");
                }
                ga4.a(xz3Var3, -1, 1);
            }
        }
        return yc1Var;
    }

    public final void b1(yc1 yc1Var) {
        xz3 xz3Var = null;
        for (xz3 xz3Var2 = this.M; xz3Var2 != null; xz3Var2 = xz3Var2.C) {
            if (xz3Var2 == yc1Var) {
                boolean z = xz3Var2.K;
                if (z) {
                    b44 b44Var = ga4.a;
                    if (!z) {
                        ez2.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    ga4.a(xz3Var2, -1, 2);
                    xz3Var2.X0();
                    xz3Var2.R0();
                }
                xz3Var2.Y0(xz3Var2);
                xz3Var2.A = 0;
                xz3 xz3Var3 = xz3Var2.C;
                if (xz3Var == null) {
                    this.M = xz3Var3;
                } else {
                    xz3Var.C = xz3Var3;
                }
                xz3Var2.C = null;
                xz3Var2.B = null;
                int i = this.z;
                int f = ga4.f(this);
                c1(f, true);
                if (this.K && (i & 2) != 0 && (f & 2) == 0) {
                    kf kfVar = wc7.O(this).c0;
                    this.x.Z0(null);
                    kfVar.k();
                    return;
                }
                return;
            }
            xz3Var = xz3Var2;
        }
        v71.g(yc1Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void c1(int i, boolean z) {
        int i2;
        xz3 xz3Var;
        int i3 = this.z;
        this.z = i;
        if (i3 != i) {
            xz3 xz3Var2 = this.x;
            if (xz3Var2 == this) {
                this.A = i;
            }
            boolean z2 = this.K;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.z;
                    r2.z = i;
                    if (r2 == xz3Var2) {
                        break;
                    } else {
                        r2 = r2.B;
                    }
                }
                if (z && r2 == xz3Var2) {
                    i = ga4.f(xz3Var2);
                    xz3Var2.z = i;
                }
                if (r2 != 0 && (xz3Var = r2.C) != null) {
                    i2 = xz3Var.A;
                } else {
                    i2 = 0;
                }
                int i4 = i | i2;
                for (xz3 xz3Var3 = r2; xz3Var3 != null; xz3Var3 = xz3Var3.B) {
                    i4 |= xz3Var3.z;
                    xz3Var3.A = i4;
                }
            }
        }
    }
}
