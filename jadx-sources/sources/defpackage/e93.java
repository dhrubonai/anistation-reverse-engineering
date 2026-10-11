package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e93 implements Comparable {
    public static final e93 y = new e93();
    public final int x = 132116;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e93 e93Var = (e93) obj;
        e93Var.getClass();
        return this.x - e93Var.x;
    }

    public final boolean equals(Object obj) {
        e93 e93Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof e93) {
            e93Var = (e93) obj;
        } else {
            e93Var = null;
        }
        if (e93Var != null && this.x == e93Var.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x;
    }

    public final String toString() {
        return "2.4.20";
    }
}
