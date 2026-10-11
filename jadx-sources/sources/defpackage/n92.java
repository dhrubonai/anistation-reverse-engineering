package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n92 implements l92 {
    public final float[] a;
    public final float[] b;

    public n92(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.a = fArr;
            this.b = fArr2;
        } else {
            ze0.k("Array lengths must match and be nonzero");
            throw null;
        }
    }

    @Override // defpackage.l92
    public final float a(float f) {
        return wk6.z(f, this.b, this.a);
    }

    @Override // defpackage.l92
    public final float b(float f) {
        return wk6.z(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof n92)) {
                n92 n92Var = (n92) obj;
                if (Arrays.equals(this.a, n92Var.a) && Arrays.equals(this.b, n92Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        return "FontScaleConverter{fromSpValues=" + arrays + ", toDpValues=" + arrays2 + "}";
    }
}
