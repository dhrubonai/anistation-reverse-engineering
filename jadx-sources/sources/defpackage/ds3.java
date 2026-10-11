package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ds3 {
    public final Bundle a;
    public ks3 b;

    public ds3(ks3 ks3Var, boolean z) {
        if (ks3Var != null) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = ks3Var;
            bundle.putBundle("selector", ks3Var.a);
            bundle.putBoolean("activeScan", z);
            return;
        }
        ze0.k("selector must not be null");
        throw null;
    }

    public final void a() {
        if (this.b == null) {
            ks3 b = ks3.b(this.a.getBundle("selector"));
            this.b = b;
            if (b == null) {
                this.b = ks3.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ds3) {
            ds3 ds3Var = (ds3) obj;
            a();
            ks3 ks3Var = this.b;
            ds3Var.a();
            if (ks3Var.equals(ds3Var.b) && b() == ds3Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return (b() ? 1 : 0) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.b.a();
        return qx1.r(sb, !r2.b.contains(null), " }");
    }
}
