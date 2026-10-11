package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qp6 extends gu2 {
    public final String b;
    public final String c;

    public qp6(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qp6.class == obj.getClass()) {
                qp6 qp6Var = (qp6) obj;
                if (this.a.equals(qp6Var.a) && Objects.equals(this.b, qp6Var.b) && this.c.equals(qp6Var.c)) {
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
        int i2 = zo5.i(this.a, 527, 31);
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((i2 + i) * 31);
    }

    @Override // defpackage.gu2
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
