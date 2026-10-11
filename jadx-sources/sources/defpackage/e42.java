package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e42 extends xy5 {
    public f42 n;
    public g90 o;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, g90] */
    @Override // defpackage.xy5
    public final boolean c(zi4 zi4Var, long j, l33 l33Var) {
        byte[] bArr = zi4Var.a;
        f42 f42Var = this.n;
        if (f42Var == null) {
            f42 f42Var2 = new f42(17, bArr);
            this.n = f42Var2;
            da2 a = f42Var2.c(Arrays.copyOfRange(bArr, 9, zi4Var.c), null).a();
            a.n = qy3.n("audio/ogg");
            l33Var.y = new ea2(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            rt3 P = nx7.P(zi4Var);
            f42 f42Var3 = new f42(f42Var.a, f42Var.b, f42Var.c, f42Var.d, f42Var.e, f42Var.g, f42Var.h, f42Var.j, P, f42Var.l);
            this.n = f42Var3;
            ?? obj = new Object();
            obj.z = f42Var3;
            obj.A = P;
            obj.x = -1L;
            obj.y = -1L;
            this.o = obj;
            return true;
        }
        if (b != -1) {
            return true;
        }
        g90 g90Var = this.o;
        if (g90Var != null) {
            g90Var.x = j;
            l33Var.z = g90Var;
        }
        ((ea2) l33Var.y).getClass();
        return false;
    }

    @Override // defpackage.xy5
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
