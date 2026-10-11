package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vi2 {
    public final bh6 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public vi2(bh6 bh6Var) {
        this.a = bh6Var;
    }

    public final void a(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                if (((bArr[i4] & 192) >> 6) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.d = z;
                this.c = false;
                return;
            }
            this.f = (i2 - i) + i3;
        }
    }

    public final void b(int i, long j, boolean z) {
        boolean z2;
        if (this.h != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.B(z2);
        if (this.e == 182 && z && this.b) {
            int i2 = (int) (j - this.g);
            boolean z3 = this.d;
            this.a.a(this.h, z3 ? 1 : 0, i2, i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }
}
