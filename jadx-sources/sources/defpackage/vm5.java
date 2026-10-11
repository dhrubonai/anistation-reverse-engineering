package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vm5 extends zm5 {
    public final xm5 a;
    public final float b;
    public final float c;

    public vm5(xm5 xm5Var, float f, float f2) {
        this.a = xm5Var;
        this.b = f;
        this.c = f2;
    }

    public final float a() {
        xm5 xm5Var = this.a;
        return (float) Math.toDegrees(Math.atan((xm5Var.c - this.c) / (xm5Var.b - this.b)));
    }
}
