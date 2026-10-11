package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ei2 extends d04 {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final long H;
    public final om5 I;
    public final boolean J;
    public final d70 K;
    public final long L;
    public final long M;
    public final int N;
    public final int O;
    public final w60 P;
    public final ca3 Q;
    public final float x;
    public final float y;
    public final float z;

    public ei2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, om5 om5Var, boolean z, d70 d70Var, long j2, long j3, int i, int i2, w60 w60Var, ca3 ca3Var) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.B = f5;
        this.C = f6;
        this.D = f7;
        this.E = f8;
        this.F = f9;
        this.G = f10;
        this.H = j;
        this.I = om5Var;
        this.J = z;
        this.K = d70Var;
        this.L = j2;
        this.M = j3;
        this.N = i;
        this.O = i2;
        this.P = w60Var;
        this.Q = ca3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, qp5, java.lang.Object] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = this.z;
        xz3Var.O = this.A;
        xz3Var.P = this.B;
        xz3Var.Q = this.C;
        xz3Var.R = this.D;
        xz3Var.S = this.E;
        xz3Var.T = this.F;
        xz3Var.U = this.G;
        xz3Var.V = this.H;
        xz3Var.W = this.I;
        xz3Var.X = this.J;
        xz3Var.Y = this.K;
        xz3Var.Z = this.L;
        xz3Var.a0 = this.M;
        xz3Var.b0 = this.N;
        xz3Var.c0 = this.O;
        xz3Var.d0 = this.P;
        xz3Var.e0 = this.Q;
        xz3Var.f0 = new pp5((Object) xz3Var, (byte) 0);
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        fa4 fa4Var;
        qp5 qp5Var = (qp5) xz3Var;
        qp5Var.L = this.x;
        qp5Var.M = this.y;
        qp5Var.N = this.z;
        qp5Var.O = this.A;
        qp5Var.P = this.B;
        qp5Var.Q = this.C;
        qp5Var.R = this.D;
        qp5Var.S = this.E;
        qp5Var.T = this.F;
        qp5Var.U = this.G;
        qp5Var.V = this.H;
        qp5Var.W = this.I;
        qp5Var.X = this.J;
        qp5Var.Y = this.K;
        qp5Var.Z = this.L;
        qp5Var.a0 = this.M;
        qp5Var.b0 = this.N;
        qp5Var.c0 = this.O;
        qp5Var.d0 = this.P;
        qp5Var.e0 = this.Q;
        pp5 pp5Var = qp5Var.f0;
        if (qp5Var.x.K && (fa4Var = wc7.M(qp5Var, 2).S) != null) {
            fa4Var.y1(pp5Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ei2) {
                ei2 ei2Var = (ei2) obj;
                if (Float.compare(this.x, ei2Var.x) == 0 && Float.compare(this.y, ei2Var.y) == 0 && Float.compare(this.z, ei2Var.z) == 0 && Float.compare(this.A, ei2Var.A) == 0 && Float.compare(this.B, ei2Var.B) == 0 && Float.compare(this.C, ei2Var.C) == 0 && Float.compare(this.D, ei2Var.D) == 0 && Float.compare(this.E, ei2Var.E) == 0 && Float.compare(this.F, ei2Var.F) == 0 && Float.compare(this.G, ei2Var.G) == 0 && xh6.a(this.H, ei2Var.H) && a34.i(this.I, ei2Var.I) && this.J == ei2Var.J && a34.i(this.K, ei2Var.K)) {
                    long j = ei2Var.L;
                    int i = ep0.j;
                    if (cm6.a(this.L, j) && cm6.a(this.M, ei2Var.M) && this.N == ei2Var.N && this.O == ei2Var.O && a34.i(this.P, ei2Var.P) && a34.i(this.Q, ei2Var.Q)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int b = qx1.b(this.G, qx1.b(this.F, qx1.b(this.E, qx1.b(this.D, qx1.b(this.C, qx1.b(this.B, qx1.b(this.A, qx1.b(this.z, qx1.b(this.y, Float.hashCode(this.x) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = xh6.c;
        int g = zo5.g((this.I.hashCode() + qx1.d(b, this.H, 31)) * 31, 31, this.J);
        int i2 = 0;
        d70 d70Var = this.K;
        if (d70Var == null) {
            hashCode = 0;
        } else {
            hashCode = d70Var.hashCode();
        }
        int i3 = (g + hashCode) * 31;
        int i4 = ep0.j;
        int c = qx1.c(this.O, qx1.c(this.N, qx1.d(qx1.d(i3, this.L, 31), this.M, 31), 31), 31);
        w60 w60Var = this.P;
        if (w60Var != null) {
            i2 = w60Var.hashCode();
        }
        return this.Q.hashCode() + ((c + i2) * 31);
    }

    public final String toString() {
        String b = xh6.b(this.H);
        String h = ep0.h(this.L);
        String h2 = ep0.h(this.M);
        String i = qx1.i(this.N, "CompositingStrategy(value=", ")");
        String J = wk6.J(this.O);
        StringBuilder t = qx1.t("GraphicsLayerElement(scaleX=", this.x, ", scaleY=", this.y, ", alpha=");
        h11.x(t, this.z, ", translationX=", this.A, ", translationY=");
        h11.x(t, this.B, ", shadowElevation=", this.C, ", rotationX=");
        h11.x(t, this.D, ", rotationY=", this.E, ", rotationZ=");
        h11.x(t, this.F, ", cameraDistance=", this.G, ", transformOrigin=");
        t.append(b);
        t.append(", shape=");
        t.append(this.I);
        t.append(", clip=");
        t.append(this.J);
        t.append(", renderEffect=");
        t.append(this.K);
        t.append(", ambientShadowColor=");
        qx1.x(t, h, ", spotShadowColor=", h2, ", compositingStrategy=");
        qx1.x(t, i, ", blendMode=", J, ", colorFilter=");
        t.append(this.P);
        t.append(", outsets=");
        t.append(this.Q);
        t.append(")");
        return t.toString();
    }
}
