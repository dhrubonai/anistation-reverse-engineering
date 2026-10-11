package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xa7 {
    public final kp a;
    public final q12 b;

    public /* synthetic */ xa7(kp kpVar, q12 q12Var) {
        this.a = kpVar;
        this.b = q12Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xa7) {
            xa7 xa7Var = (xa7) obj;
            if (bx7.q(this.a, xa7Var.a) && bx7.q(this.b, xa7Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        y23 y23Var = new y23(this);
        y23Var.R(this.a, "key");
        y23Var.R(this.b, "feature");
        return y23Var.toString();
    }
}
