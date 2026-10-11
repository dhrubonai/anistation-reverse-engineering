package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hx7 {
    public final Context a;
    public final r26 b;

    public hx7(Context context, r26 r26Var) {
        this.a = context;
        this.b = r26Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof hx7) {
                hx7 hx7Var = (hx7) obj;
                if (this.a.equals(hx7Var.a)) {
                    r26 r26Var = hx7Var.b;
                    r26 r26Var2 = this.b;
                    if (r26Var2 == null) {
                        if (r26Var == null) {
                            return true;
                        }
                        return false;
                    }
                    if (r26Var2.equals(r26Var)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        r26 r26Var = this.b;
        if (r26Var == null) {
            hashCode = 0;
        } else {
            hashCode = r26Var.hashCode();
        }
        return hashCode ^ (hashCode2 * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        qx1.x(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
