package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ju0 implements qw3, up1 {
    public final Object a;
    public eb2 b;
    public tp1 c;
    public final /* synthetic */ lu0 d;

    public ju0(lu0 lu0Var, Object obj) {
        this.d = lu0Var;
        this.b = new eb2((CopyOnWriteArrayList) lu0Var.c.A, 0, (jw3) null);
        this.c = new tp1(lu0Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.up1
    public final void N(int i, jw3 jw3Var) {
        if (a(i, jw3Var)) {
            this.c.e();
        }
    }

    @Override // defpackage.up1
    public final void T(int i, jw3 jw3Var, i18 i18Var) {
        if (a(i, jw3Var)) {
            this.c.a(i18Var);
        }
    }

    @Override // defpackage.qw3
    public final void U(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var, int i2) {
        if (a(i, jw3Var)) {
            eb2 eb2Var = this.b;
            eb2Var.h(new mw3(eb2Var, ij3Var, b(fr3Var, jw3Var), i2));
        }
    }

    public final boolean a(int i, jw3 jw3Var) {
        jw3 jw3Var2;
        Object obj = this.a;
        lu0 lu0Var = this.d;
        if (jw3Var != null) {
            jw3Var2 = lu0Var.t(obj, jw3Var);
            if (jw3Var2 == null) {
                return false;
            }
        } else {
            jw3Var2 = null;
        }
        int v = lu0Var.v(i, obj);
        eb2 eb2Var = this.b;
        if (eb2Var.y != v || !Objects.equals((jw3) eb2Var.z, jw3Var2)) {
            this.b = new eb2((CopyOnWriteArrayList) lu0Var.c.A, v, jw3Var2);
        }
        tp1 tp1Var = this.c;
        if (tp1Var.a != v || !Objects.equals(tp1Var.b, jw3Var2)) {
            this.c = new tp1(lu0Var.d.c, v, jw3Var2);
            return true;
        }
        return true;
    }

    public final fr3 b(fr3 fr3Var, jw3 jw3Var) {
        long j = fr3Var.f;
        lu0 lu0Var = this.d;
        Object obj = this.a;
        long u = lu0Var.u(j, obj);
        long j2 = fr3Var.g;
        long u2 = lu0Var.u(j2, obj);
        if (u == j && u2 == j2) {
            return fr3Var;
        }
        return new fr3(fr3Var.a, fr3Var.b, fr3Var.c, fr3Var.d, fr3Var.e, u, u2);
    }

    @Override // defpackage.up1
    public final void k(int i, jw3 jw3Var, Exception exc) {
        if (a(i, jw3Var)) {
            this.c.d(exc);
        }
    }

    @Override // defpackage.qw3
    public final void l(int i, jw3 jw3Var, fr3 fr3Var) {
        if (a(i, jw3Var)) {
            eb2 eb2Var = this.b;
            eb2Var.h(new fs0((Object) eb2Var, (Object) b(fr3Var, jw3Var), (byte) 11));
        }
    }

    @Override // defpackage.qw3
    public final void m(int i, jw3 jw3Var, fr3 fr3Var) {
        if (a(i, jw3Var)) {
            eb2 eb2Var = this.b;
            fr3 b = b(fr3Var, jw3Var);
            jw3 jw3Var2 = (jw3) eb2Var.z;
            jw3Var2.getClass();
            eb2Var.h(new ia1((Object) eb2Var, (Object) jw3Var2, (Object) b, (byte) 4));
        }
    }

    @Override // defpackage.up1
    public final void p(int i, jw3 jw3Var, int i2) {
        if (a(i, jw3Var)) {
            this.c.c(i2);
        }
    }

    @Override // defpackage.qw3
    public final void u(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var) {
        if (a(i, jw3Var)) {
            eb2 eb2Var = this.b;
            eb2Var.h(new nw3(eb2Var, ij3Var, b(fr3Var, jw3Var), (byte) 1));
        }
    }

    @Override // defpackage.qw3
    public final void w(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var) {
        if (a(i, jw3Var)) {
            eb2 eb2Var = this.b;
            eb2Var.h(new nw3(eb2Var, ij3Var, b(fr3Var, jw3Var), (byte) 0));
        }
    }

    @Override // defpackage.qw3
    public final void y(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var, IOException iOException, boolean z) {
        if (a(i, jw3Var)) {
            eb2 eb2Var = this.b;
            eb2Var.h(new ow3(eb2Var, ij3Var, b(fr3Var, jw3Var), iOException, z));
        }
    }

    @Override // defpackage.up1
    public final void z(int i, jw3 jw3Var) {
        if (a(i, jw3Var)) {
            this.c.b();
        }
    }
}
