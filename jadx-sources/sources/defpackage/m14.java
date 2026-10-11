package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m14 {
    public final int a;
    public final int b;
    public final float c;

    public m14(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static m14 a(int i) {
        int i2;
        int i3 = (i >> 13) & 7;
        if (i3 == 0) {
            return null;
        }
        int i4 = (i >> 10) & 7;
        int i5 = i & 511;
        if ((i & 512) != 0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        return new m14((i5 * i2) / 10.0f, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m14)) {
            return false;
        }
        m14 m14Var = (m14) obj;
        if (this.a != m14Var.a || this.b != m14Var.b || Float.compare(this.c, m14Var.c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
