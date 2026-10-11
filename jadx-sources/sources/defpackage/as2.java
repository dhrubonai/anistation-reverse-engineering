package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class as2 {
    public final vk6 a;
    public final Object b;

    public as2(vk6 vk6Var, Object obj) {
        vk6Var.getClass();
        obj.getClass();
        this.a = vk6Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as2)) {
            return false;
        }
        as2 as2Var = (as2) obj;
        if (a34.i(this.a, as2Var.a) && a34.i(this.b, as2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.a + ", response=" + this.b + ')';
    }
}
