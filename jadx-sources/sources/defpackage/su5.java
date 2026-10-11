package defpackage;

import android.graphics.Shader;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class su5 extends ka0 {
    public final long a;

    public su5(long j) {
        this.a = j;
    }

    @Override // defpackage.ka0
    public final void a(float f, long j, ad adVar) {
        adVar.p(1.0f);
        long j2 = this.a;
        if (f != 1.0f) {
            j2 = ep0.b(ep0.c(j2) * f, j2);
        }
        adVar.r(j2);
        if (((Shader) adVar.A) != null) {
            adVar.u(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof su5) {
                long j = ((su5) obj).a;
                int i = ep0.j;
                if (!cm6.a(this.a, j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ep0.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qx1.m("SolidColor(value=", ep0.h(this.a), ")");
    }
}
