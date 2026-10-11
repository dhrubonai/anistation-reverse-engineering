package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tp0 implements nc6 {
    public final long x;

    public tp0(long j) {
        boolean z;
        this.x = j;
        if (j != 16) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fz2.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // defpackage.nc6
    public final long a() {
        return this.x;
    }

    @Override // defpackage.nc6
    public final ka0 d() {
        return null;
    }

    @Override // defpackage.nc6
    public final float e() {
        return ep0.c(this.x);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tp0) {
                long j = ((tp0) obj).x;
                int i = ep0.j;
                if (!cm6.a(this.x, j)) {
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
        return Long.hashCode(this.x);
    }

    public final String toString() {
        return qx1.m("ColorStyle(value=", ep0.h(this.x), ")");
    }
}
