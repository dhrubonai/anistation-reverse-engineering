package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m75 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        bx7.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public m75(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m75) {
                m75 m75Var = (m75) obj;
                if (Float.compare(this.a, m75Var.a) != 0 || Float.compare(this.b, m75Var.b) != 0 || Float.compare(this.c, m75Var.c) != 0 || Float.compare(this.d, m75Var.d) != 0 || !x97.z(this.e, m75Var.e) || !x97.z(this.f, m75Var.f) || !x97.z(this.g, m75Var.g) || !x97.z(this.h, m75Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + qx1.d(qx1.d(qx1.d(qx1.b(this.d, qx1.b(this.c, qx1.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        String P = bx7.P(this.a);
        String P2 = bx7.P(this.b);
        String P3 = bx7.P(this.c);
        String P4 = bx7.P(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(P);
        sb.append(", ");
        sb.append(P2);
        sb.append(", ");
        sb.append(P3);
        String k = h11.k(sb, ", ", P4);
        long j = this.e;
        long j2 = this.f;
        boolean z = x97.z(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (z && x97.z(j2, j3) && x97.z(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return qx1.n("RoundRect(rect=", k, ", radius=", bx7.P(Float.intBitsToFloat(i)), ")");
            }
            String P5 = bx7.P(Float.intBitsToFloat(i));
            return h11.k(h11.o("RoundRect(rect=", k, ", x=", P5, ", y="), bx7.P(Float.intBitsToFloat(i2)), ")");
        }
        String V = x97.V(j);
        String V2 = x97.V(j2);
        String V3 = x97.V(j3);
        String V4 = x97.V(j4);
        StringBuilder o = h11.o("RoundRect(rect=", k, ", topLeft=", V, ", topRight=");
        qx1.x(o, V2, ", bottomRight=", V3, ", bottomLeft=");
        return h11.k(o, V4, ")");
    }
}
