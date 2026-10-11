package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r92 {
    public final List a;

    public r92(q92... q92VarArr) {
        if (q92VarArr.length <= 0) {
            this.a = ms.S0(q92VarArr);
        } else {
            q92 q92Var = q92VarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r92) {
                if (!this.a.equals(((r92) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Settings(settings=" + this.a + ")";
    }
}
