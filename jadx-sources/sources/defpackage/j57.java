package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class j57 {
    public final v57 a;
    public yz2[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public j57(v57 v57Var) {
        this.c = new Rect[10];
        this.d = new Rect[10];
        this.a = v57Var;
        c(v57Var);
    }

    public final void a() {
        yz2[] yz2VarArr = this.b;
        if (yz2VarArr != null) {
            yz2 yz2Var = yz2VarArr[0];
            yz2 yz2Var2 = yz2VarArr[1];
            v57 v57Var = this.a;
            if (yz2Var2 == null) {
                yz2Var2 = v57Var.a.i(2);
            }
            if (yz2Var == null) {
                yz2Var = v57Var.a.i(1);
            }
            h(yz2.a(yz2Var, yz2Var2));
            yz2 yz2Var3 = this.b[gv5.g(16)];
            if (yz2Var3 != null) {
                g(yz2Var3);
            }
            yz2 yz2Var4 = this.b[gv5.g(32)];
            if (yz2Var4 != null) {
                e(yz2Var4);
            }
            yz2 yz2Var5 = this.b[gv5.g(64)];
            if (yz2Var5 != null) {
                i(yz2Var5);
            }
        }
    }

    public abstract v57 b();

    public void c(v57 v57Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> f = v57Var.a.f(i);
            int g = gv5.g(i);
            this.c[g] = (Rect[]) f.toArray(new Rect[f.size()]);
            if (i != 8) {
                List<Rect> g2 = v57Var.a.g(i);
                this.d[g] = (Rect[]) g2.toArray(new Rect[g2.size()]);
            }
        }
    }

    public void d(int i, yz2 yz2Var) {
        if (this.b == null) {
            this.b = new yz2[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[gv5.g(i2)] = yz2Var;
            }
        }
    }

    public abstract void e(yz2 yz2Var);

    public abstract void f(yz2 yz2Var);

    public abstract void g(yz2 yz2Var);

    public abstract void h(yz2 yz2Var);

    public abstract void i(yz2 yz2Var);

    public j57() {
        this(new v57((v57) null));
    }
}
