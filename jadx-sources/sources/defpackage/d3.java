package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class d3 {
    public g16 A;
    public e3[] x;
    public int y;
    public int z;

    public final e3 e() {
        e3 e3Var;
        g16 g16Var;
        synchronized (this) {
            try {
                e3[] e3VarArr = this.x;
                if (e3VarArr == null) {
                    e3VarArr = g();
                    this.x = e3VarArr;
                } else if (this.y >= e3VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(e3VarArr, e3VarArr.length * 2);
                    this.x = (e3[]) copyOf;
                    e3VarArr = (e3[]) copyOf;
                }
                int i = this.z;
                do {
                    e3Var = e3VarArr[i];
                    if (e3Var == null) {
                        e3Var = f();
                        e3VarArr[i] = e3Var;
                    }
                    i++;
                    if (i >= e3VarArr.length) {
                        i = 0;
                    }
                } while (!e3Var.a(this));
                this.z = i;
                this.y++;
                g16Var = this.A;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g16Var != null) {
            g16Var.w(1);
        }
        return e3Var;
    }

    public e3 f() {
        return new ux5();
    }

    public e3[] g() {
        return new ux5[2];
    }

    public final void h(e3 e3Var) {
        g16 g16Var;
        int i;
        vz0[] b;
        synchronized (this) {
            try {
                int i2 = this.y - 1;
                this.y = i2;
                g16Var = this.A;
                if (i2 == 0) {
                    this.z = 0;
                }
                e3Var.getClass();
                b = e3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (vz0 vz0Var : b) {
            if (vz0Var != null) {
                vz0Var.resumeWith(pn6.a);
            }
        }
        if (g16Var != null) {
            g16Var.w(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [in5, g16] */
    public final g16 i() {
        g16 g16Var;
        synchronized (this) {
            g16 g16Var2 = this.A;
            g16Var = g16Var2;
            if (g16Var2 == null) {
                int i = this.y;
                ?? in5Var = new in5(1, Integer.MAX_VALUE, ta0.y);
                in5Var.d(Integer.valueOf(i));
                this.A = in5Var;
                g16Var = in5Var;
            }
        }
        return g16Var;
    }
}
