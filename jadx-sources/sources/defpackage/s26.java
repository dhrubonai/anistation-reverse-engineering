package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s26 implements r26, Serializable {
    public transient Object A;
    public final transient Object x = new Object();
    public final r26 y;
    public volatile transient boolean z;

    public s26(r26 r26Var) {
        r26Var.getClass();
        this.y = r26Var;
    }

    @Override // defpackage.r26
    public final Object get() {
        if (!this.z) {
            synchronized (this.x) {
                try {
                    if (!this.z) {
                        Object obj = this.y.get();
                        this.A = obj;
                        this.z = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.A;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.z) {
            obj = "<supplier that returned " + this.A + ">";
        } else {
            obj = this.y;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
