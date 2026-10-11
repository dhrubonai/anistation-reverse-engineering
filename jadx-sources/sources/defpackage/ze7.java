package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ze7 {
    public int a;
    public int b;
    public fm0 c;

    public static ze7 h(InputStream inputStream, int i) {
        if (i > 0) {
            if (inputStream == null) {
                xe7 xe7Var = new xe7(wf7.a);
                try {
                    xe7Var.a(0);
                    return xe7Var;
                } catch (ag7 e) {
                    throw new IllegalArgumentException(e);
                }
            }
            return new ye7(inputStream, i);
        }
        ze0.k("bufferSize must be > 0");
        return null;
    }

    public static int j(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i);

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(byte[] bArr, int i, int i2);

    public abstract void g(int i);

    public final void i() {
        int l;
        do {
            l = l();
            if (l != 0) {
                int i = this.a;
                int i2 = this.b;
                if (i + i2 < 100) {
                    this.b = i2 + 1;
                    this.b--;
                } else {
                    jz7.e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    return;
                }
            } else {
                return;
            }
        } while (n(l));
    }

    public abstract int l();

    public abstract void m(int i);

    public abstract boolean n(int i);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract ve7 y();

    public abstract byte[] z();
}
