package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hr2 {
    public static final hr2 d = new hr2("HTTP", 3, 0);
    public static final hr2 e = new hr2("HTTP", 2, 0);
    public static final hr2 f = new hr2("HTTP", 1, 1);
    public static final hr2 g = new hr2("HTTP", 1, 0);
    public final String a;
    public final int b;
    public final int c;

    public hr2(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hr2) {
                hr2 hr2Var = (hr2) obj;
                if (!this.a.equals(hr2Var.a) || this.b != hr2Var.b || this.c != hr2Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qx1.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.a + '/' + this.b + '.' + this.c;
    }
}
