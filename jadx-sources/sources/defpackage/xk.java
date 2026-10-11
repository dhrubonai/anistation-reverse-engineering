package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xk {
    public final im0 a;
    public final Object b;

    public xk(wp5 wp5Var) {
        im0 a = z05.a(wp5Var.getClass());
        Object obj = wp5Var.a;
        this.a = a;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xk) {
                xk xkVar = (xk) obj;
                if (!this.a.equals(xkVar.a) || !a34.i(this.b, xkVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedSceneKey(clazz=" + this.a + ", key=" + this.b + ")";
    }
}
