package h3;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public boolean f4995c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4996d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4997e;

    /* renamed from: a, reason: collision with root package name */
    public final f1.y f4993a = new f1.y(0);

    /* renamed from: f, reason: collision with root package name */
    public long f4998f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f4999g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f5000h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final f1.t f4994b = new f1.t();

    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(f1.t tVar) {
        int i10 = tVar.f3859b;
        if (tVar.f3860c - i10 < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z9 = false;
        tVar.d(bArr, 0, 9);
        tVar.G(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z9 = true;
        }
        if (!z9) {
            return -9223372036854775807L;
        }
        long j4 = b10;
        long j10 = ((j4 & 3) << 28) | (((56 & j4) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j11 = bArr[2];
        return j10 | (((j11 & 248) >> 3) << 15) | ((j11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final void a(d2.q qVar) {
        byte[] bArr = f1.b0.f3804f;
        f1.t tVar = this.f4994b;
        tVar.getClass();
        tVar.E(bArr, bArr.length);
        this.f4995c = true;
        qVar.g();
    }
}
