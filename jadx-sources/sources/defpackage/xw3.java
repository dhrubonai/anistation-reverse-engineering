package defpackage;

import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xw3 implements qw3, up1 {
    public final zw3 a;
    public final /* synthetic */ ax3 b;

    public xw3(ax3 ax3Var, zw3 zw3Var) {
        this.b = ax3Var;
        this.a = zw3Var;
    }

    @Override // defpackage.up1
    public final void N(int i, jw3 jw3Var) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new vw3(this, a, (byte) 0));
        }
    }

    @Override // defpackage.up1
    public final void T(int i, jw3 jw3Var, i18 i18Var) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new ze((Object) this, (Object) a, (Object) i18Var, (byte) 16));
        }
    }

    @Override // defpackage.qw3
    public final void U(int i, jw3 jw3Var, final ij3 ij3Var, final fr3 fr3Var, final int i2) {
        final Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new Runnable() { // from class: ww3
                @Override // java.lang.Runnable
                public final void run() {
                    c71 c71Var = xw3.this.b.i;
                    Pair pair = a;
                    c71Var.U(((Integer) pair.first).intValue(), (jw3) pair.second, ij3Var, fr3Var, i2);
                }
            });
        }
    }

    public final Pair a(int i, jw3 jw3Var) {
        jw3 jw3Var2;
        zw3 zw3Var = this.a;
        jw3 jw3Var3 = null;
        if (jw3Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 < zw3Var.c.size()) {
                    if (((jw3) zw3Var.c.get(i2)).d == jw3Var.d) {
                        Object obj = jw3Var.a;
                        Object obj2 = zw3Var.b;
                        int i3 = hq4.n;
                        jw3Var2 = jw3Var.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                } else {
                    jw3Var2 = null;
                    break;
                }
            }
            if (jw3Var2 == null) {
                return null;
            }
            jw3Var3 = jw3Var2;
        }
        return Pair.create(Integer.valueOf(i + zw3Var.d), jw3Var3);
    }

    @Override // defpackage.up1
    public final void k(int i, jw3 jw3Var, Exception exc) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new ze((Object) this, (Object) a, (Object) exc, (byte) 17));
        }
    }

    @Override // defpackage.qw3
    public final void l(int i, jw3 jw3Var, fr3 fr3Var) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new tw3(this, a, fr3Var, (byte) 1));
        }
    }

    @Override // defpackage.qw3
    public final void m(int i, jw3 jw3Var, fr3 fr3Var) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new tw3(this, a, fr3Var, (byte) 0));
        }
    }

    @Override // defpackage.up1
    public final void p(int i, jw3 jw3Var, int i2) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new sf1((byte) 2, i2, this, a));
        }
    }

    @Override // defpackage.qw3
    public final void u(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new uw3(this, a, ij3Var, fr3Var, (byte) 0));
        }
    }

    @Override // defpackage.qw3
    public final void w(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new uw3(this, a, ij3Var, fr3Var, (byte) 1));
        }
    }

    @Override // defpackage.qw3
    public final void y(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var, IOException iOException, boolean z) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new y40((byte) 1, this, a, ij3Var, fr3Var, iOException, z));
        }
    }

    @Override // defpackage.up1
    public final void z(int i, jw3 jw3Var) {
        Pair a = a(i, jw3Var);
        if (a != null) {
            this.b.j.f(new vw3(this, a, (byte) 1));
        }
    }
}
