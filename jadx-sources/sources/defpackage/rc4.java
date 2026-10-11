package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rc4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public rc4(qc4 qc4Var) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        ?? r8;
        boolean z3;
        boolean f;
        boolean z4;
        boolean z5;
        byte b;
        byte b2;
        byte b3;
        boolean z6;
        int i3 = qc4Var.a;
        ByteBuffer byteBuffer = qc4Var.b;
        boolean z7 = true;
        if (i3 == 1) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        yi0 yi0Var = new yi0(remaining, bArr);
        this.g = yi0Var.g(3);
        yi0Var.n();
        boolean f2 = yi0Var.f();
        this.a = f2;
        if (f2) {
            i2 = yi0Var.g(5);
            this.b = false;
            this.j = false;
            r8 = 0;
            i = 0;
        } else {
            if (yi0Var.f()) {
                yi0Var.o(64);
                if (yi0Var.f()) {
                    int i4 = 0;
                    while (!yi0Var.f()) {
                        i4++;
                    }
                    if (i4 < 32) {
                        yi0Var.o(i4);
                    }
                }
                boolean f3 = yi0Var.f();
                this.b = f3;
                if (f3) {
                    yi0Var.o(47);
                }
            } else {
                this.b = false;
            }
            this.j = yi0Var.f();
            int g = yi0Var.g(5);
            int i5 = 0;
            int i6 = 0;
            boolean z8 = false;
            i = 0;
            while (i6 <= g) {
                yi0Var.o(12);
                if (i6 == 0) {
                    i5 = yi0Var.g(5);
                    z2 = z8;
                    if (i5 > 7) {
                        z2 = yi0Var.f();
                    }
                } else {
                    z2 = z8;
                    if (yi0Var.g(5) > 7) {
                        yi0Var.n();
                        z2 = z8;
                    }
                }
                if (this.b) {
                    yi0Var.n();
                }
                if (this.j && yi0Var.f()) {
                    if (i6 == 0) {
                        i = yi0Var.g(4);
                    } else {
                        yi0Var.o(4);
                    }
                }
                i6++;
                z8 = z2;
            }
            i2 = i5;
            r8 = z8;
        }
        int g2 = yi0Var.g(4);
        int g3 = yi0Var.g(4);
        yi0Var.o(g2 + 1);
        yi0Var.o(g3 + 1);
        if (!this.a) {
            z3 = yi0Var.f();
            this.c = z3;
        } else {
            this.c = false;
            z3 = false;
        }
        if (z3) {
            yi0Var.o(4);
            yi0Var.o(3);
        }
        yi0Var.o(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            yi0Var.o(4);
            boolean f4 = yi0Var.f();
            if (f4) {
                yi0Var.o(2);
            }
            if (yi0Var.f()) {
                this.d = true;
                f = true;
            } else {
                f = yi0Var.f();
                this.d = f;
            }
            if (f) {
                if (yi0Var.f()) {
                    this.e = true;
                } else {
                    this.e = yi0Var.f();
                }
            } else {
                this.e = true;
            }
            if (f4) {
                this.f = yi0Var.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
        this.h = i2;
        this.i = r8;
        this.k = i;
        yi0Var.o(3);
        boolean f5 = yi0Var.f();
        this.l = f5;
        if (this.g == 2 && f5) {
            z4 = yi0Var.f();
            this.m = z4;
        } else {
            this.m = false;
            z4 = false;
        }
        if (this.g != 1) {
            z5 = yi0Var.f();
            this.n = z5;
        } else {
            this.n = false;
            z5 = false;
        }
        if (yi0Var.f()) {
            b2 = (byte) yi0Var.g(8);
            b3 = (byte) yi0Var.g(8);
            b = (byte) yi0Var.g(8);
        } else {
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        if (z5) {
            yi0Var.n();
            this.o = false;
            this.p = false;
            this.q = 0;
        } else if (b2 == 1 && b3 == 13 && b == 0) {
            this.o = false;
            this.p = false;
            this.q = 0;
        } else {
            yi0Var.n();
            int i7 = this.g;
            if (i7 == 0) {
                this.o = true;
                this.p = true;
                z6 = true;
            } else if (i7 == 1) {
                this.o = false;
                this.p = false;
                z6 = false;
                z7 = false;
            } else {
                if (z4) {
                    z7 = yi0Var.f();
                    this.o = z7;
                    if (z7) {
                        z6 = yi0Var.f();
                        this.p = z6;
                    } else {
                        this.p = false;
                    }
                } else {
                    this.o = true;
                    this.p = false;
                }
                z6 = false;
            }
            if (z7 && z6) {
                this.q = yi0Var.g(2);
            } else {
                this.q = 0;
            }
        }
        yi0Var.n();
    }
}
