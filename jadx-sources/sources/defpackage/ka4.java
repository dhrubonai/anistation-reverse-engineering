package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ka4 {
    public final z44 a = new z44(new aa4[16], 0);
    public final f44 b = new f44(10);

    public boolean a(sl3 sl3Var, ha3 ha3Var, u98 u98Var, boolean z) {
        z44 z44Var = this.a;
        Object[] objArr = z44Var.x;
        int i = z44Var.z;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((aa4) objArr[i2]).a(sl3Var, ha3Var, u98Var, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        return z2;
    }

    public void b(u98 u98Var) {
        z44 z44Var = this.a;
        int i = z44Var.z;
        while (true) {
            i--;
            if (-1 < i) {
                if (((aa4) z44Var.x[i]).d.b == 0) {
                    z44Var.m(i);
                }
            } else {
                return;
            }
        }
    }
}
