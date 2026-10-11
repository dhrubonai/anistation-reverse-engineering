package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ah6 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ah6(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ah6.class == obj.getClass()) {
                ah6 ah6Var = (ah6) obj;
                if (this.a == ah6Var.a && this.c == ah6Var.c && this.d == ah6Var.d && Arrays.equals(this.b, ah6Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
