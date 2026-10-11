package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b45 extends x2 {
    public final boolean m(ii3 ii3Var) {
        r2 r2Var;
        Object obj = this.x;
        if (obj == null) {
            if (ii3Var.isDone()) {
                if (x2.C.o(this, null, x2.g(ii3Var))) {
                    x2.d(this);
                    return true;
                }
                return false;
            }
            u2 u2Var = new u2(this, ii3Var);
            if (x2.C.o(this, null, u2Var)) {
                try {
                    ii3Var.a(u2Var, rg1.x);
                    return true;
                } catch (Throwable th) {
                    try {
                        r2Var = new r2(th);
                    } catch (Throwable unused) {
                        r2Var = r2.b;
                    }
                    x2.C.o(this, u2Var, r2Var);
                    return true;
                }
            }
            obj = this.x;
        }
        if (obj instanceof q2) {
            ii3Var.cancel(((q2) obj).a);
        }
        return false;
    }
}
