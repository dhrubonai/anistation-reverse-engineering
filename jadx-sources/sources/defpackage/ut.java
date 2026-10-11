package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ut {
    public final Object a;
    public final jt b;
    public final kz4 c;

    public ut(Object obj, jt jtVar, kz4 kz4Var) {
        this.a = obj;
        this.b = jtVar;
        this.c = kz4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ut) {
            ut utVar = (ut) obj;
            jt jtVar = utVar.b;
            jt jtVar2 = this.b;
            if (a34.i(jtVar2, jtVar) && jtVar2.a(this.a, utVar.a) && this.c == utVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        jt jtVar = this.b;
        return this.c.hashCode() + ((jtVar.b(this.a) + (jtVar.hashCode() * 31)) * 31);
    }
}
