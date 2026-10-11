package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w50 implements d7 {
    public final float a;

    public w50(float f) {
        this.a = f;
    }

    @Override // defpackage.d7
    public final int a(int i, int i2, ia3 ia3Var) {
        float f = (i2 - i) / 2.0f;
        ia3 ia3Var2 = ia3.x;
        float f2 = this.a;
        if (ia3Var != ia3Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w50) && Float.compare(this.a, ((w50) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
