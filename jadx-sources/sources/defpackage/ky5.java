package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ky5 {
    public final String a;
    public final String b;
    public final ly5 c;

    public ky5(String str, String str2, ly5 ly5Var) {
        this.a = str;
        this.b = str2;
        this.c = ly5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ky5) {
                ky5 ky5Var = (ky5) obj;
                if (this.a.equals(ky5Var.a) && this.b.equals(ky5Var.b) && this.c.equals(ky5Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
