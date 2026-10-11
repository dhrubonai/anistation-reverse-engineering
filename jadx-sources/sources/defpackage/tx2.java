package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tx2 implements hf5 {
    public final cl3 a;
    public final cl3 b;
    public long c;

    public tx2(long j, long[] jArr, long[] jArr2) {
        boolean z;
        cl3 cl3Var;
        cl3 cl3Var2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i = length + 1;
            cl3Var = new cl3(i);
            this.a = cl3Var;
            cl3Var2 = new cl3(i);
            this.b = cl3Var2;
            cl3Var.a(0L);
            cl3Var2.a(0L);
        } else {
            cl3Var = new cl3(length);
            this.a = cl3Var;
            cl3Var2 = new cl3(length);
            this.b = cl3Var2;
        }
        cl3Var.b(jArr);
        cl3Var2.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.hf5
    public final boolean b() {
        if (this.b.b > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        cl3 cl3Var = this.b;
        if (cl3Var.b == 0) {
            jf5 jf5Var = jf5.c;
            return new gf5(jf5Var, jf5Var);
        }
        int c = eq6.c(cl3Var, j);
        long d = cl3Var.d(c);
        cl3 cl3Var2 = this.a;
        jf5 jf5Var2 = new jf5(d, cl3Var2.d(c));
        if (d != j && c != cl3Var.b - 1) {
            int i = c + 1;
            return new gf5(jf5Var2, new jf5(cl3Var.d(i), cl3Var2.d(i)));
        }
        return new gf5(jf5Var2, jf5Var2);
    }

    @Override // defpackage.hf5
    public final long h() {
        return this.c;
    }
}
