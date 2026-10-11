package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ti1 implements nw4, sb3 {
    public static final Object z = new Object();
    public volatile nw4 x;
    public volatile Object y = z;

    public ti1(nw4 nw4Var) {
        this.x = nw4Var;
    }

    public static nw4 a(nw4 nw4Var) {
        if (nw4Var instanceof ti1) {
            return nw4Var;
        }
        return new ti1(nw4Var);
    }

    @Override // defpackage.nw4
    public final Object get() {
        Object obj;
        Object obj2 = this.y;
        Object obj3 = z;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.y;
                    if (obj == obj3) {
                        obj = this.x.get();
                        Object obj4 = this.y;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.y = obj;
                        this.x = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
