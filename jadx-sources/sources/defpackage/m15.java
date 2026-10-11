package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m15 {
    public g25 a;
    public g25 b;
    public gs1 c;
    public q12[] d;
    public boolean e;
    public short f;

    public final y23 a() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = true;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        a34.m("Must set register function", z);
        if (this.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        a34.m("Must set unregister function", z2);
        if (this.c == null) {
            z4 = false;
        }
        a34.m("Must set holder", z4);
        qi3 qi3Var = (qi3) this.c.c;
        a34.y(qi3Var, "Key must not be null");
        return new y23(new hb7(this, this.c, this.d, this.e, this.f), new l33((byte) 28, this, qi3Var, z3), (byte) 13);
    }
}
