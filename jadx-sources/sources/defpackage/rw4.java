package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rw4 {
    public final /* synthetic */ byte a;
    public final tf6 b;
    public final zi4 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public rw4(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new tf6(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new zi4();
                return;
            default:
                this.b = new tf6(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new zi4();
                return;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(zi4 zi4Var) {
        int i = zi4Var.b;
        if (zi4Var.a() >= 9) {
            byte[] bArr = new byte[9];
            zi4Var.k(bArr, 0, 9);
            zi4Var.N(i);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = b;
                        long j2 = b2;
                        return ((j2 & 3) << 13) | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                    }
                    return -9223372036854775807L;
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public final void a(c12 c12Var) {
        byte b = this.a;
        zi4 zi4Var = this.c;
        switch (b) {
            case 0:
                byte[] bArr = eq6.b;
                zi4Var.L(bArr.length, bArr);
                this.d = true;
                c12Var.u();
                return;
            default:
                byte[] bArr2 = eq6.b;
                zi4Var.L(bArr2.length, bArr2);
                this.d = true;
                c12Var.u();
                return;
        }
    }
}
