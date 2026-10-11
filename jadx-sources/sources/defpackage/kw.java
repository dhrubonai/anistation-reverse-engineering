package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kw {
    public final ea2 a;
    public final iw2 b;
    public final kf6 c;
    public final jw3 d;

    public kw(zp2 zp2Var) {
        this.a = (ea2) zp2Var.x;
        this.b = (iw2) zp2Var.y;
        this.c = (kf6) zp2Var.z;
        this.d = (jw3) zp2Var.A;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kw) {
                kw kwVar = (kw) obj;
                if (this.a.equals(kwVar.a) && Objects.equals(this.b, kwVar.b) && this.c.equals(kwVar.c) && Objects.equals(this.d, kwVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 961;
        int i = 0;
        iw2 iw2Var = this.b;
        if (iw2Var == null) {
            hashCode = 0;
        } else {
            hashCode = iw2Var.hashCode();
        }
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        jw3 jw3Var = this.d;
        if (jw3Var != null) {
            i = jw3Var.hashCode();
        }
        return hashCode3 + i;
    }
}
