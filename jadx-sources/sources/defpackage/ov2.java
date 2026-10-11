package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ov2 {
    public static int k;
    public static final r18 l = new r18(21);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final fr6 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public ov2(String str, float f, float f2, float f3, float f4, fr6 fr6Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = fr6Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ov2) {
                ov2 ov2Var = (ov2) obj;
                if (a34.i(this.a, ov2Var.a) && vm1.c(this.b, ov2Var.b) && vm1.c(this.c, ov2Var.c) && this.d == ov2Var.d && this.e == ov2Var.e && this.f.equals(ov2Var.f)) {
                    long j = ov2Var.g;
                    int i = ep0.j;
                    if (cm6.a(this.g, j) && this.h == ov2Var.h && this.i == ov2Var.i) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + qx1.b(this.e, qx1.b(this.d, qx1.b(this.c, qx1.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = ep0.j;
        return Boolean.hashCode(this.i) + qx1.c(this.h, qx1.d(hashCode, this.g, 31), 31);
    }
}
