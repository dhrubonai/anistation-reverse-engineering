package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a60 extends gu2 {
    public final byte[] b;

    public a60(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a60.class == obj.getClass()) {
                a60 a60Var = (a60) obj;
                if (this.a.equals(a60Var.a) && Arrays.equals(this.b, a60Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + zo5.i(this.a, 527, 31);
    }
}
