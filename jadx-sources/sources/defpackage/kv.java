package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kv {
    public static final kv d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public kv(jv jvVar) {
        this.a = jvVar.a;
        this.b = jvVar.b;
        this.c = jvVar.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && kv.class == obj.getClass()) {
                kv kvVar = (kv) obj;
                if (this.a == kvVar.a && this.b == kvVar.b && this.c == kvVar.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
