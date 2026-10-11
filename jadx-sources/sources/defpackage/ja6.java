package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ja6 {
    public static final ja6 f = new ja6(false, 9205357640488583168L, 0.0f, c45.x, false);
    public final boolean a;
    public final long b;
    public final float c;
    public final c45 d;
    public final boolean e;

    public ja6(boolean z, long j, float f2, c45 c45Var, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = f2;
        this.d = c45Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ja6) {
                ja6 ja6Var = (ja6) obj;
                if (this.a != ja6Var.a || !xc4.b(this.b, ja6Var.b) || Float.compare(this.c, ja6Var.c) != 0 || this.d != ja6Var.d || this.e != ja6Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + qx1.b(this.c, qx1.d(Boolean.hashCode(this.a) * 31, this.b, 31), 31)) * 31);
    }

    public final String toString() {
        String h = xc4.h(this.b);
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(h);
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(this.d);
        sb.append(", handlesCrossed=");
        return qx1.r(sb, this.e, ")");
    }
}
