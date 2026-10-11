package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ux extends zm0 {
    public final rx a;

    public ux(rx rxVar) {
        this.a = rxVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof zm0) {
                zm0 zm0Var = (zm0) obj;
                Object obj2 = ym0.x;
                if (obj2.equals(obj2)) {
                    if (this.a.equals(((ux) zm0Var).a)) {
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
        return this.a.hashCode() ^ ((ym0.x.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + ym0.x + ", androidClientInfo=" + this.a + "}";
    }
}
