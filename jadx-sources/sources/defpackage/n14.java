package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n14 implements ey3 {
    public final float a;
    public final m14 b;
    public final m14 c;

    public n14(float f, m14 m14Var, m14 m14Var2) {
        this.a = f;
        this.b = m14Var;
        this.c = m14Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n14)) {
            return false;
        }
        n14 n14Var = (n14) obj;
        if (Float.compare(this.a, n14Var.a) != 0 || !Objects.equals(this.b, n14Var.b) || !Objects.equals(this.c, n14Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = Float.hashCode(this.a) * 31;
        int i2 = 0;
        m14 m14Var = this.b;
        if (m14Var != null) {
            i = m14Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        m14 m14Var2 = this.c;
        if (m14Var2 != null) {
            i2 = m14Var2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
