package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yy3 extends gu2 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public yy3(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && yy3.class == obj.getClass()) {
                yy3 yy3Var = (yy3) obj;
                if (this.b == yy3Var.b && this.c == yy3Var.c && this.d == yy3Var.d && Arrays.equals(this.e, yy3Var.e) && Arrays.equals(this.f, yy3Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
