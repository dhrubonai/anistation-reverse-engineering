package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hz4 {
    public final Context a;
    public final cv2 b;
    public final d46 c;
    public final d46 d;
    public final d46 e;
    public final is0 f;

    public hz4(Context context, cv2 cv2Var, d46 d46Var, d46 d46Var2, d46 d46Var3, is0 is0Var) {
        this.a = context;
        this.b = cv2Var;
        this.c = d46Var;
        this.d = d46Var2;
        this.e = d46Var3;
        this.f = is0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hz4) {
            hz4 hz4Var = (hz4) obj;
            if (a34.i(this.a, hz4Var.a) && this.b.equals(hz4Var.b) && this.c == hz4Var.c && this.d == hz4Var.d && this.e == hz4Var.e && this.f == hz4Var.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((ze0.A.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + ze0.A + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
