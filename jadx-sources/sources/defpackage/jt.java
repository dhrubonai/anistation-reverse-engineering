package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jt {
    public static final jt a = new Object();

    public final boolean a(Object obj, Object obj2) {
        if (this != obj2) {
            if ((obj instanceof ev2) && (obj2 instanceof ev2)) {
                ev2 ev2Var = (ev2) obj;
                ev2 ev2Var2 = (ev2) obj2;
                if (a34.i(ev2Var.a, ev2Var2.a) && ev2Var.b.equals(ev2Var2.b) && ev2Var.d.equals(ev2Var2.d) && a34.i(ev2Var.o, ev2Var2.o) && ev2Var.p == ev2Var2.p && ev2Var.q == ev2Var2.q) {
                    return true;
                }
                return false;
            }
            return a34.i(obj, obj2);
        }
        return true;
    }

    public final int b(Object obj) {
        if (!(obj instanceof ev2)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        ev2 ev2Var = (ev2) obj;
        return ev2Var.q.hashCode() + ((ev2Var.p.hashCode() + ((ev2Var.o.hashCode() + ((ev2Var.d.hashCode() + ((ev2Var.b.hashCode() + (ev2Var.a.hashCode() * 31)) * 961)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
