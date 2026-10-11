package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yn6 {
    public final WeakReference a;
    public final lb5 b;
    public final f05 c;

    public yn6(WeakReference weakReference, lb5 lb5Var, f05 f05Var) {
        this.a = weakReference;
        this.b = lb5Var;
        this.c = f05Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yn6) {
            yn6 yn6Var = (yn6) obj;
            if (this.a.equals(yn6Var.a) && this.b == yn6Var.b && this.c == yn6Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PendingShow(activity=" + this.a + ", onStarted=" + this.b + ", onResult=" + this.c + ")";
    }
}
