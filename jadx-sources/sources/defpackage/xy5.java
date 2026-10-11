package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class xy5 {
    public bh6 b;
    public d12 c;
    public gd4 d;
    public long e;
    public long f;
    public long g;
    public byte h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final v14 a = new v14((byte) 1);
    public l33 j = new l33((byte) 19, false);

    public void a(long j) {
        this.g = j;
    }

    public long b(zi4 zi4Var) {
        byte[] bArr = zi4Var.a;
        if (bArr[0] == -1) {
            int i = (bArr[2] & 255) >> 4;
            if (i == 6 || i == 7) {
                zi4Var.O(4);
                zi4Var.I();
            }
            int H = bx7.H(i, zi4Var);
            zi4Var.N(0);
            return H;
        }
        return -1L;
    }

    public abstract boolean c(zi4 zi4Var, long j, l33 l33Var);

    public void d(boolean z) {
        if (z) {
            this.j = new l33((byte) 19, false);
            this.f = 0L;
            this.h = (byte) 0;
        } else {
            this.h = (byte) 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
