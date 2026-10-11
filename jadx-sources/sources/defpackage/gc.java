package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gc {
    public final Context a;
    public final ud1 b;
    public final long c;
    public final vh4 d;

    public gc(Context context, ud1 ud1Var, long j, vh4 vh4Var) {
        this.a = context;
        this.b = ud1Var;
        this.c = j;
        this.d = vh4Var;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (gc.class.equals(cls)) {
                obj.getClass();
                gc gcVar = (gc) obj;
                if (a34.i(this.a, gcVar.a) && a34.i(this.b, gcVar.b)) {
                    long j = gcVar.c;
                    int i = ep0.j;
                    if (!cm6.a(this.c, j) || !this.d.equals(gcVar.d)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = ep0.j;
        return this.d.hashCode() + qx1.d(hashCode, this.c, 31);
    }
}
