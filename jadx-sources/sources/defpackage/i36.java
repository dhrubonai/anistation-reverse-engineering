package defpackage;

import android.view.Surface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i36 {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public i36(Surface surface, int i, int i2, int i3, boolean z) {
        boolean z2;
        if (i3 != 0 && i3 != 90 && i3 != 180 && i3 != 270) {
            z2 = false;
        } else {
            z2 = true;
        }
        io3.m("orientationDegrees must be 0, 90, 180, or 270", z2);
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i36) {
                i36 i36Var = (i36) obj;
                if (this.b == i36Var.b && this.c == i36Var.c && this.d == i36Var.d && this.e == i36Var.e && this.a.equals(i36Var.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0);
    }
}
