package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pa6 {
    public static final z95 f = new z95((byte) 6);
    public final gi6 a;
    public final xd6 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public pa6(gi6 gi6Var, xd6 xd6Var, boolean z, boolean z2, boolean z3) {
        this.a = gi6Var;
        this.b = xd6Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", singleLine=");
        sb.append(this.c);
        sb.append(", softWrap=");
        sb.append(this.d);
        sb.append(", isKeyboardTypePhone=");
        return qx1.r(sb, this.e, ")");
    }
}
