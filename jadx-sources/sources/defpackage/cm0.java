package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class cm0 {
    public final short a;
    public final String b;
    public final String c;
    public final bf5 d;
    public final String e;
    public final short f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final String j;
    public final short k;
    public final vj2 l;
    public final oo5 m;
    public final dm0 n;
    public final int o;
    public final int p;

    /* JADX WARN: Multi-variable type inference failed */
    public cm0(short s, String str, String str2, bf5 bf5Var, String str3, int i, int i2, int i3, int i4, String str4, int i5, vj2 vj2Var, oo5 oo5Var, dm0 dm0Var) {
        this.a = s;
        this.b = str;
        this.c = str2;
        this.d = bf5Var;
        this.e = str3;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str4;
        this.k = i5;
        this.l = vj2Var;
        this.m = oo5Var;
        this.n = dm0Var;
        this.o = i / 8;
        this.p = i5 / 8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cm0) {
                cm0 cm0Var = (cm0) obj;
                if (this.a != cm0Var.a || !a34.i(this.b, cm0Var.b) || !a34.i(this.c, cm0Var.c) || this.d != cm0Var.d || !a34.i(this.e, cm0Var.e) || this.f != cm0Var.f || this.g != cm0Var.g || this.h != cm0Var.h || this.i != cm0Var.i || !a34.i(this.j, cm0Var.j) || this.k != cm0Var.k || this.l != cm0Var.l || this.m != cm0Var.m || this.n != cm0Var.n) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + qx1.c(this.k, zo5.i(this.j, qx1.c(this.i, qx1.c(this.h, qx1.c(this.g, qx1.c(this.f, zo5.i(this.e, (this.d.hashCode() + zo5.i(this.c, zo5.i(this.b, Short.hashCode(this.a) * 31, 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CipherSuite(code=" + ((int) this.a) + ", name=" + this.b + ", openSSLName=" + this.c + ", exchangeType=" + this.d + ", jdkCipherName=" + this.e + ", keyStrength=" + ((int) this.f) + ", fixedIvLength=" + ((int) this.g) + ", ivLength=" + ((int) this.h) + ", cipherTagSizeInBytes=" + ((int) this.i) + ", macName=" + this.j + ", macStrength=" + ((int) this.k) + ", hash=" + this.l + ", signatureAlgorithm=" + this.m + ", cipherType=" + this.n + ')';
    }

    public /* synthetic */ cm0(short s, String str, String str2, bf5 bf5Var, int i, vj2 vj2Var, oo5 oo5Var) {
        this(s, str, str2, bf5Var, "AES/GCM/NoPadding", i, 4, 12, 16, "AEAD", 0, vj2Var, oo5Var, dm0.x);
    }
}
