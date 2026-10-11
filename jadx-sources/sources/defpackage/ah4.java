package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ah4 extends bb4 {
    public final n05 O;

    public ah4(n05 n05Var) {
        this.O = n05Var;
    }

    @Override // defpackage.bb4
    public final n05 D() {
        return this.O;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ah4) {
                if (!this.O.equals(((ah4) obj).O)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.O.hashCode();
    }
}
