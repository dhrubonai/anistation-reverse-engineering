package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ak2 {
    public static final zd0 d;
    public static final zd0 e;
    public static final zd0 f;
    public static final zd0 g;
    public static final zd0 h;
    public static final zd0 i;
    public final zd0 a;
    public final zd0 b;
    public final int c;

    static {
        zd0 zd0Var = zd0.A;
        d = r18.i(":");
        e = r18.i(":status");
        f = r18.i(":method");
        g = r18.i(":path");
        h = r18.i(":scheme");
        i = r18.i(":authority");
    }

    public ak2(zd0 zd0Var, zd0 zd0Var2) {
        zd0Var.getClass();
        zd0Var2.getClass();
        this.a = zd0Var;
        this.b = zd0Var2;
        this.c = zd0Var2.d() + zd0Var.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak2)) {
            return false;
        }
        ak2 ak2Var = (ak2) obj;
        if (a34.i(this.a, ak2Var.a) && a34.i(this.b, ak2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.q() + ": " + this.b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ak2(String str, String str2) {
        this(r18.i(str), r18.i(str2));
        str.getClass();
        str2.getClass();
        zd0 zd0Var = zd0.A;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ak2(zd0 zd0Var, String str) {
        this(zd0Var, r18.i(str));
        zd0Var.getClass();
        str.getClass();
        zd0 zd0Var2 = zd0.A;
    }
}
