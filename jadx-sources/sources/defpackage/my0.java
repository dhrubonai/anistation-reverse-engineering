package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class my0 {
    public final aa0 a;
    public final qg0 b;

    public my0(aa0 aa0Var, qg0 qg0Var) {
        this.a = aa0Var;
        this.b = qg0Var;
    }

    public final String toString() {
        String str;
        String str2;
        qg0 qg0Var = this.b;
        r11 r11Var = (r11) qg0Var.B.get(r11.y);
        if (r11Var != null) {
            str = r11Var.x;
        } else {
            str = null;
        }
        int hashCode = hashCode();
        t80.z(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        if (str != null) {
            str2 = qx1.m("[", str, "](");
        } else {
            str2 = "(";
        }
        return "Request@" + num + str2 + "currentBounds()=" + this.a.invoke() + ", continuation=" + qg0Var + ")";
    }
}
