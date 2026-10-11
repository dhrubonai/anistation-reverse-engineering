package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o75 implements om5 {
    public final g11 a;
    public final g11 b;
    public final g11 c;
    public final g11 d;

    public o75(g11 g11Var, g11 g11Var2, g11 g11Var3, g11 g11Var4) {
        this.a = g11Var;
        this.b = g11Var2;
        this.c = g11Var3;
        this.d = g11Var4;
    }

    public static o75 b(o75 o75Var, g11 g11Var, g11 g11Var2, g11 g11Var3, g11 g11Var4, int i) {
        if ((i & 1) != 0) {
            g11Var = o75Var.a;
        }
        if ((i & 2) != 0) {
            g11Var2 = o75Var.b;
        }
        if ((i & 4) != 0) {
            g11Var3 = o75Var.c;
        }
        if ((i & 8) != 0) {
            g11Var4 = o75Var.d;
        }
        o75Var.getClass();
        return new o75(g11Var, g11Var2, g11Var3, g11Var4);
    }

    @Override // defpackage.om5
    public final bb4 a(long j, ia3 ia3Var, ud1 ud1Var) {
        float f;
        float f2;
        float a = this.a.a(j, ud1Var);
        float a2 = this.b.a(j, ud1Var);
        float a3 = this.c.a(j, ud1Var);
        float a4 = this.d.a(j, ud1Var);
        float d = uq5.d(j);
        float f3 = a + a4;
        if (f3 > d) {
            float f4 = d / f3;
            a *= f4;
            a4 *= f4;
        }
        float f5 = a2 + a3;
        if (f5 > d) {
            float f6 = d / f5;
            a2 *= f6;
            a3 *= f6;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            StringBuilder t = qx1.t("Corner size in Px can't be negative(topStart = ", a, ", topEnd = ", a2, ", bottomEnd = ");
            t.append(a3);
            t.append(", bottomStart = ");
            t.append(a4);
            t.append(")!");
            hz2.a(t.toString());
        }
        if (a + a2 + a3 + a4 == 0.0f) {
            return new ah4(n03.g(0L, j));
        }
        n05 g = n03.g(0L, j);
        ia3 ia3Var2 = ia3.x;
        if (ia3Var == ia3Var2) {
            f = a;
        } else {
            f = a2;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        if (ia3Var == ia3Var2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        if (ia3Var == ia3Var2) {
            f2 = a3;
        } else {
            f2 = a4;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (ia3Var != ia3Var2) {
            a4 = a3;
        }
        return new bh4(new m75(g.a, g.b, g.c, g.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o75)) {
            return false;
        }
        o75 o75Var = (o75) obj;
        if (a34.i(this.a, o75Var.a) && a34.i(this.b, o75Var.b) && a34.i(this.c, o75Var.c) && a34.i(this.d, o75Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
