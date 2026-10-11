package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class yf5 {
    public final byte[] a;
    public int b;
    public int c;
    public x05 d;
    public boolean e;
    public yf5 f;
    public yf5 g;

    public yf5() {
        this.a = new byte[8192];
        this.e = true;
        this.d = null;
    }

    public final int a() {
        return this.a.length - this.c;
    }

    public final int b() {
        return this.c - this.b;
    }

    public final byte c(int i) {
        return this.a[this.b + i];
    }

    public final yf5 d() {
        yf5 yf5Var = this.f;
        yf5 yf5Var2 = this.g;
        if (yf5Var2 != null) {
            yf5Var2.getClass();
            yf5Var2.f = this.f;
        }
        yf5 yf5Var3 = this.f;
        if (yf5Var3 != null) {
            yf5Var3.getClass();
            yf5Var3.g = this.g;
        }
        this.f = null;
        this.g = null;
        return yf5Var;
    }

    public final void e(yf5 yf5Var) {
        yf5Var.getClass();
        yf5Var.g = this;
        yf5Var.f = this.f;
        yf5 yf5Var2 = this.f;
        if (yf5Var2 != null) {
            yf5Var2.g = yf5Var;
        }
        this.f = yf5Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, x05] */
    public final yf5 f() {
        x05 x05Var = this.d;
        x05 x05Var2 = x05Var;
        if (x05Var == null) {
            yf5 yf5Var = ig5.a;
            ?? obj = new Object();
            this.d = obj;
            x05Var2 = obj;
        }
        int i = this.b;
        int i2 = this.c;
        x05.b.incrementAndGet(x05Var2);
        return new yf5(this.a, i, i2, x05Var2);
    }

    public final void g(yf5 yf5Var, int i) {
        yf5Var.getClass();
        if (yf5Var.e) {
            int i2 = yf5Var.c;
            if (i2 + i > 8192) {
                x05 x05Var = yf5Var.d;
                if (x05Var != null && x05Var.a > 0) {
                    p65.b();
                    return;
                }
                int i3 = yf5Var.c;
                int i4 = yf5Var.b;
                if ((i3 + i) - i4 <= 8192) {
                    byte[] bArr = yf5Var.a;
                    ms.v0(0, i4, i3, bArr, bArr);
                    i2 = yf5Var.c - yf5Var.b;
                    yf5Var.c = i2;
                    yf5Var.b = 0;
                } else {
                    p65.b();
                    return;
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = yf5Var.a;
            int i5 = this.b;
            ms.v0(i2, i5, i5 + i, bArr2, bArr3);
            yf5Var.c += i;
            this.b += i;
            return;
        }
        ze0.m("only owner can write");
    }

    public yf5(byte[] bArr, int i, int i2, x05 x05Var) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = x05Var;
        this.e = false;
    }
}
