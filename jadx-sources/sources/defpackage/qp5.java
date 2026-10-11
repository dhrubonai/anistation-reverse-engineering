package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qp5 extends xz3 implements ra3, sh5 {
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public long V;
    public om5 W;
    public boolean X;
    public d70 Y;
    public long Z;
    public long a0;
    public int b0;
    public int c0;
    public w60 d0;
    public ca3 e0;
    public pp5 f0;

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        if (!this.X) {
            return;
        }
        zh5.h(bi5Var, this.W);
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        em4 p = ro3Var.p(j);
        return xo3Var.L(p.x, p.y, ot1.x, new ll5(p, this, (byte) 3));
    }

    @Override // defpackage.sh5
    public final boolean l() {
        return false;
    }

    public final String toString() {
        float f = this.L;
        float f2 = this.M;
        float f3 = this.N;
        float f4 = this.O;
        float f5 = this.P;
        float f6 = this.Q;
        float f7 = this.R;
        float f8 = this.S;
        float f9 = this.T;
        float f10 = this.U;
        String b = xh6.b(this.V);
        om5 om5Var = this.W;
        boolean z = this.X;
        d70 d70Var = this.Y;
        String h = ep0.h(this.Z);
        String h2 = ep0.h(this.a0);
        String i = qx1.i(this.b0, "CompositingStrategy(value=", ")");
        String J = wk6.J(this.c0);
        w60 w60Var = this.d0;
        ca3 ca3Var = this.e0;
        StringBuilder t = qx1.t("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        h11.x(t, f3, ", translationX=", f4, ", translationY=");
        h11.x(t, f5, ", shadowElevation=", f6, ", rotationX=");
        h11.x(t, f7, ", rotationY=", f8, ", rotationZ=");
        h11.x(t, f9, ", cameraDistance=", f10, ", transformOrigin=");
        t.append(b);
        t.append(", shape=");
        t.append(om5Var);
        t.append(", clip=");
        t.append(z);
        t.append(", renderEffect=");
        t.append(d70Var);
        t.append(", ambientShadowColor=");
        qx1.x(t, h, ", spotShadowColor=", h2, ", compositingStrategy=");
        qx1.x(t, i, ", blendMode=", J, ", colorFilter=");
        t.append(w60Var);
        t.append("outsets=");
        t.append(ca3Var);
        t.append(")");
        return t.toString();
    }
}
