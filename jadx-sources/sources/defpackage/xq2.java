package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xq2 {
    public static final xq2 b;
    public static final xq2 c;
    public static final xq2 d;
    public static final xq2 e;
    public static final xq2 f;
    public static final List g;
    public final String a;

    static {
        xq2 xq2Var = new xq2("GET");
        b = xq2Var;
        xq2 xq2Var2 = new xq2("POST");
        c = xq2Var2;
        xq2 xq2Var3 = new xq2("PUT");
        xq2 xq2Var4 = new xq2("PATCH");
        xq2 xq2Var5 = new xq2("DELETE");
        xq2 xq2Var6 = new xq2("HEAD");
        d = xq2Var6;
        xq2 xq2Var7 = new xq2("OPTIONS");
        e = xq2Var7;
        f = new xq2("TRACE");
        g = te4.I(xq2Var, xq2Var2, xq2Var3, xq2Var4, xq2Var5, xq2Var6, xq2Var7);
    }

    public xq2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof xq2) || !this.a.equals(((xq2) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
