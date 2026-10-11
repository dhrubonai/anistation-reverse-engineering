package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zd1 {
    public final px4 a;
    public final byte b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public zd1(px4 px4Var, int i, int i2) {
        this.a = px4Var;
        this.b = i;
        this.c = i2;
    }

    public static zd1 a(Class cls) {
        return new zd1(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zd1) {
            zd1 zd1Var = (zd1) obj;
            if (this.a.equals(zd1Var.a) && this.b == zd1Var.b && this.c == zd1Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.c ? 1 : 0) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        byte b = this.b;
        if (b == 1) {
            str = "required";
        } else if (b == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        boolean z = this.c;
        if (z != 0) {
            if (z != 1) {
                if (z == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(qx1.h(z ? 1 : 0, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return h11.k(sb, str2, "}");
    }

    public zd1(int i, int i2, Class cls) {
        this(px4.a(cls), i, i2);
    }
}
