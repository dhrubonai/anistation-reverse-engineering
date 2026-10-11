package defpackage;

import android.graphics.BlendModeColorFilter;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w60 {
    public final BlendModeColorFilter a;
    public final long b;
    public final int c;

    public w60(long j, int i) {
        this.a = new BlendModeColorFilter(w65.U(j), z51.P(i));
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w60) {
                w60 w60Var = (w60) obj;
                long j = w60Var.b;
                int i = ep0.j;
                if (cm6.a(this.b, j) && this.c == w60Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ep0.j;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return qx1.n("BlendModeColorFilter(color=", ep0.h(this.b), ", blendMode=", wk6.J(this.c), ")");
    }
}
