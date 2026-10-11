package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jk0 extends gu2 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final gu2[] f;

    public jk0(String str, boolean z, boolean z2, String[] strArr, gu2[] gu2VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = gu2VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jk0.class == obj.getClass()) {
                jk0 jk0Var = (jk0) obj;
                if (this.c == jk0Var.c && this.d == jk0Var.d && this.b.equals(jk0Var.b) && Arrays.equals(this.e, jk0Var.e) && Arrays.equals(this.f, jk0Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
