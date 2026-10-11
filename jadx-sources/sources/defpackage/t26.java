package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t26 implements r26 {
    public static final xw A = new xw((byte) 7);
    public final Object x = new Object();
    public volatile r26 y;
    public Object z;

    public t26(r26 r26Var) {
        r26Var.getClass();
        this.y = r26Var;
    }

    @Override // defpackage.r26
    public final Object get() {
        r26 r26Var = this.y;
        xw xwVar = A;
        if (r26Var != xwVar) {
            synchronized (this.x) {
                try {
                    if (this.y != xwVar) {
                        Object obj = this.y.get();
                        this.z = obj;
                        this.y = xwVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.z;
    }

    public final String toString() {
        Object obj = this.y;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == A) {
            obj = "<supplier that returned " + this.z + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
