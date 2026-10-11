package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sd4 extends t74 {
    public final rd4 a;
    public final og3 b;

    public sd4(og3 og3Var, rd4 rd4Var) {
        rd4Var.getClass();
        this.a = rd4Var;
        this.b = og3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd4)) {
            return false;
        }
        sd4 sd4Var = (sd4) obj;
        if (a34.i(this.a, sd4Var.a) && a34.i(this.b, sd4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        og3 og3Var = this.b;
        if (og3Var == null) {
            hashCode = 0;
        } else {
            hashCode = og3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
