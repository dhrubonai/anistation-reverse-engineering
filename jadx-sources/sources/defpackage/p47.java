package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p47 implements ox3 {
    public final u50 a;

    public p47(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // defpackage.ox3
    public final int a(g13 g13Var, long j, int i, ia3 ia3Var) {
        float f;
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            float f2 = (i2 - i) / 2.0f;
            if (ia3Var == ia3.x) {
                f = 0.0f;
            } else {
                f = -0.0f;
            }
            return Math.round((1.0f + f) * f2);
        }
        return db.C(this.a.a(i, i2, ia3Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p47) && this.a.equals(((p47) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
