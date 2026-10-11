package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wx4 implements gs4, Serializable {
    public static final /* synthetic */ int z = 0;
    public final p31 x;
    public final p31 y;

    static {
        new wx4(n31.A, n31.z);
    }

    public wx4(p31 p31Var, p31 p31Var2) {
        this.x = p31Var;
        this.y = p31Var2;
        if (p31Var.compareTo(p31Var2) <= 0 && p31Var != n31.z && p31Var2 != n31.A) {
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        p31Var.b(sb);
        sb.append("..");
        p31Var2.c(sb);
        ze0.k("Invalid range: ".concat(sb.toString()));
        throw null;
    }

    public static wx4 a(Long l, Long l2) {
        return new wx4(new n31(l, (byte) 2), new p31(l2));
    }

    @Override // defpackage.gs4
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        if (this.x.e(comparable) && !this.y.e(comparable)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wx4) {
            wx4 wx4Var = (wx4) obj;
            if (this.x.equals(wx4Var.x) && this.y.equals(wx4Var.y)) {
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
        StringBuilder sb = new StringBuilder(16);
        this.x.b(sb);
        sb.append("..");
        this.y.c(sb);
        return sb.toString();
    }
}
