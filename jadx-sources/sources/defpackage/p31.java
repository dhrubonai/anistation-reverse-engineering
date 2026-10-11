package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class p31 implements Comparable, Serializable {
    public final Comparable x;

    public p31(Comparable comparable) {
        this.x = comparable;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(p31 p31Var) {
        if (p31Var == n31.A) {
            return 1;
        }
        if (p31Var == n31.z) {
            return -1;
        }
        Comparable comparable = p31Var.x;
        int i = wx4.z;
        int compareTo = this.x.compareTo(comparable);
        if (compareTo != 0) {
            return compareTo;
        }
        return Boolean.compare(this instanceof o31, p31Var instanceof o31);
    }

    public void b(StringBuilder sb) {
        sb.append('(');
        sb.append(this.x);
    }

    public void c(StringBuilder sb) {
        sb.append(this.x);
        sb.append(']');
    }

    public Comparable d() {
        return this.x;
    }

    public boolean e(Comparable comparable) {
        int i = wx4.z;
        if (this.x.compareTo(comparable) < 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p31) {
            try {
                if (compareTo((p31) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return ~this.x.hashCode();
    }
}
