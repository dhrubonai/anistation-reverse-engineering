package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kp {
    public final int a;
    public final rt3 b;
    public final qo c;
    public final String d;

    public kp(rt3 rt3Var, qo qoVar, String str) {
        this.b = rt3Var;
        this.c = qoVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{rt3Var, qoVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof kp) {
                    kp kpVar = (kp) obj;
                    if (bx7.q(this.b, kpVar.b) && bx7.q(this.c, kpVar.c) && bx7.q(this.d, kpVar.d)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
