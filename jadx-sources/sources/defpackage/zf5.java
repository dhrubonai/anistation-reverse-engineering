package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class zf5 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public zf5 f;
    public zf5 g;

    public zf5(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final zf5 a() {
        zf5 zf5Var = this.f;
        if (zf5Var == this) {
            zf5Var = null;
        }
        zf5 zf5Var2 = this.g;
        zf5Var2.getClass();
        zf5Var2.f = this.f;
        zf5 zf5Var3 = this.f;
        zf5Var3.getClass();
        zf5Var3.g = this.g;
        this.f = null;
        this.g = null;
        return zf5Var;
    }

    public final void b(zf5 zf5Var) {
        zf5Var.getClass();
        zf5Var.g = this;
        zf5Var.f = this.f;
        zf5 zf5Var2 = this.f;
        zf5Var2.getClass();
        zf5Var2.g = zf5Var;
        this.f = zf5Var;
    }

    public final zf5 c() {
        this.d = true;
        return new zf5(this.a, this.b, this.c, true);
    }

    public final void d(zf5 zf5Var, int i) {
        zf5Var.getClass();
        byte[] bArr = zf5Var.a;
        if (zf5Var.e) {
            int i2 = zf5Var.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!zf5Var.d) {
                    int i4 = zf5Var.b;
                    if (i3 - i4 <= 8192) {
                        ms.v0(0, i4, i2, bArr, bArr);
                        i2 = zf5Var.c - zf5Var.b;
                        zf5Var.c = i2;
                        zf5Var.b = 0;
                    } else {
                        p65.b();
                        return;
                    }
                } else {
                    p65.b();
                    return;
                }
            }
            int i5 = this.b;
            ms.v0(i2, i5, i5 + i, this.a, bArr);
            zf5Var.c += i;
            this.b += i;
            return;
        }
        ze0.m("only owner can write");
    }

    public zf5() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
