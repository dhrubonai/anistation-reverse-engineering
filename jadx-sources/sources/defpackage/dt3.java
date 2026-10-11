package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dt3 {
    public final xu3 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final ct3 e;
    public final Bundle f;

    public dt3(xu3 xu3Var, int i, int i2, boolean z, ct3 ct3Var, Bundle bundle) {
        this.a = xu3Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = ct3Var;
        this.f = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dt3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dt3 dt3Var = (dt3) obj;
        ct3 ct3Var = dt3Var.e;
        ct3 ct3Var2 = this.e;
        if (ct3Var2 == null && ct3Var == null) {
            return this.a.equals(dt3Var.a);
        }
        return Objects.equals(ct3Var2, ct3Var);
    }

    public final int hashCode() {
        return Objects.hash(this.e, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        zu3 zu3Var = this.a.a;
        sb.append(zu3Var.a);
        sb.append(", uid=");
        return zo5.k(zu3Var.c, "}", sb);
    }
}
