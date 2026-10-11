package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kt {
    public final kz4 a;
    public final ev2 b;
    public final jt c;

    public kt(kz4 kz4Var, ev2 ev2Var, jt jtVar) {
        this.a = kz4Var;
        this.b = ev2Var;
        this.c = jtVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kt) {
                kt ktVar = (kt) obj;
                if (this.a == ktVar.a) {
                    jt jtVar = ktVar.c;
                    jt jtVar2 = this.c;
                    if (a34.i(jtVar2, jtVar) && jtVar2.a(this.b, ktVar.b)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jt jtVar = this.c;
        return jtVar.b(this.b) + ((jtVar.hashCode() + hashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
