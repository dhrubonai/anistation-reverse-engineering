package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ex0 {
    public final float a;
    public final double b;
    public final int c;
    public final long d;
    public int e;

    public ex0(long j, float f, int i) {
        boolean z;
        boolean z2;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        if (f > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.n(z2);
        io3.n(0 < j);
        this.d = j;
        this.a = f;
        this.c = Math.max(Math.round((((float) j) / 1000000.0f) * f), 1);
        this.b = 1000000.0f / f;
    }

    public final ex0 a() {
        return new ex0(this.d, this.a, 0);
    }

    public final boolean b() {
        if (this.e < this.c) {
            return true;
        }
        return false;
    }
}
