package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ni1 {
    public final /* synthetic */ byte a;
    public final String b;

    public /* synthetic */ ni1(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public static ni1 a(zi4 zi4Var) {
        String str;
        String str2;
        zi4Var.O(2);
        int A = zi4Var.A();
        int i = A >> 1;
        int A2 = ((zi4Var.A() >> 3) & 31) | ((A & 1) << 5);
        if (i != 4 && i != 5 && i != 7 && i != 8) {
            if (i == 9) {
                str = "dvav";
            } else if (i == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder(str);
        String str3 = ".";
        if (i >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        sb.append(str2);
        sb.append(i);
        if (A2 < 10) {
            str3 = ".0";
        }
        return new ni1(h11.g(A2, str3, sb), (byte) 0);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return h11.k(new StringBuilder("Phase('"), this.b, "')");
            case 2:
                return qx1.p(new StringBuilder("<"), this.b, '>');
            default:
                return super.toString();
        }
    }
}
