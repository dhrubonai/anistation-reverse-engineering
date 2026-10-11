package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yk6 implements g73 {
    public volatile List A;
    public final im0 x;
    public final String y;
    public final c83 z;

    public yk6(im0 im0Var) {
        this.x = im0Var;
        bx7.B(jf3.y, new vt0(this, (byte) 16));
        this.y = "PluginConfigT";
        this.z = c83.x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yk6) {
            yk6 yk6Var = (yk6) obj;
            if (a34.i(this.y, yk6Var.y) && this.x.equals(yk6Var.x)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.x.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int ordinal = this.z.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    sb.append("out ");
                } else {
                    ze0.l();
                    return null;
                }
            } else {
                sb.append("in ");
            }
        }
        sb.append(this.y);
        return sb.toString();
    }
}
