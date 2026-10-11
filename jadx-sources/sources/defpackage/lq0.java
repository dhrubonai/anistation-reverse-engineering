package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lq0 extends gu2 {
    public final String b;
    public final String c;
    public final String d;

    public lq0(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lq0.class == obj.getClass()) {
                lq0 lq0Var = (lq0) obj;
                if (this.c.equals(lq0Var.c) && this.b.equals(lq0Var.b) && Objects.equals(this.d, lq0Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = zo5.i(this.c, zo5.i(this.b, 527, 31), 31);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // defpackage.gu2
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
