package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w93 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = eq6.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w93(String str, String str2) {
        this.a = eq6.V(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w93.class == obj.getClass()) {
            w93 w93Var = (w93) obj;
            if (Objects.equals(this.a, w93Var.a) && Objects.equals(this.b, w93Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ lang=");
        sb.append(this.a);
        sb.append(", '");
        return h11.k(sb, this.b, "' }");
    }
}
