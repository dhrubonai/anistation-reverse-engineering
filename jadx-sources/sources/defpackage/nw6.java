package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nw6 implements q35, m91 {
    public final fg3 A;
    public final h43 B;
    public final kz4 x;
    public final ev2 y;
    public final zd2 z;

    public nw6(kz4 kz4Var, ev2 ev2Var, zd2 zd2Var, fg3 fg3Var, h43 h43Var) {
        this.x = kz4Var;
        this.y = ev2Var;
        this.z = zd2Var;
        this.A = fg3Var;
        this.B = h43Var;
    }

    @Override // defpackage.q35
    public final Object a(jz4 jz4Var) {
        fg3 fg3Var = this.A;
        if (fg3Var != null) {
            return w65.o(fg3Var, jz4Var);
        }
        return pn6.a;
    }

    @Override // defpackage.q35
    public final void b() {
        zd2 zd2Var = this.z;
        if (zd2Var.getView().isAttachedToWindow()) {
            return;
        }
        ow6 c = lz5.c(zd2Var.getView());
        nw6 nw6Var = c.A;
        if (nw6Var != null) {
            fg3 fg3Var = nw6Var.A;
            nw6Var.B.l(null);
            zd2 zd2Var2 = nw6Var.z;
            if (zd2Var2 != null && fg3Var != null) {
                fg3Var.b(zd2Var2);
            }
            if (fg3Var != null) {
                fg3Var.b(nw6Var);
            }
        }
        c.A = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // defpackage.m91
    public final void onDestroy(og3 og3Var) {
        ow6 c = lz5.c(this.z.getView());
        synchronized (c) {
            try {
                bx5 bx5Var = c.z;
                vz0 vz0Var = null;
                if (bx5Var != null) {
                    bx5Var.l(null);
                }
                jf2 jf2Var = jf2.x;
                ja1 ja1Var = rh1.a;
                c.z = tl7.z(jf2Var, qm3.a.B, null, new ji(c, vz0Var, (byte) 10), 2);
                c.y = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q35
    public final void start() {
        fg3 fg3Var = this.A;
        if (fg3Var != null) {
            fg3Var.a(this);
        }
        zd2 zd2Var = this.z;
        if (zd2Var != null && fg3Var != null) {
            fg3Var.b(zd2Var);
            fg3Var.a(zd2Var);
        }
        ow6 c = lz5.c(zd2Var.getView());
        nw6 nw6Var = c.A;
        if (nw6Var != null) {
            fg3 fg3Var2 = nw6Var.A;
            nw6Var.B.l(null);
            zd2 zd2Var2 = nw6Var.z;
            if (zd2Var2 != null && fg3Var2 != null) {
                fg3Var2.b(zd2Var2);
            }
            if (fg3Var2 != null) {
                fg3Var2.b(nw6Var);
            }
        }
        c.A = this;
    }
}
