package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ev0 implements wq6 {
    public final ub2 a;

    public ev0(ub2 ub2Var) {
        this.a = ub2Var;
    }

    @Override // defpackage.wq6
    public final Object a(al4 al4Var) {
        return this.a.invoke(al4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ev0) && a34.i(this.a, ((ev0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
