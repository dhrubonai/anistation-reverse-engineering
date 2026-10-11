package u2;

import d2.q;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f10194d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10195a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f10196b;

    /* renamed from: c, reason: collision with root package name */
    public int f10197c;

    public static long a(byte[] bArr, int i10, boolean z9) {
        long j4 = bArr[0] & 255;
        if (z9) {
            j4 &= ~f10194d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j4 = (j4 << 8) | (bArr[i11] & 255);
        }
        return j4;
    }

    public final long b(q qVar, boolean z9, boolean z10, int i10) {
        int i11;
        int i12 = this.f10196b;
        byte[] bArr = this.f10195a;
        if (i12 == 0) {
            if (!qVar.b(bArr, 0, 1, z9)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 < 8) {
                    if ((f10194d[i14] & i13) != 0) {
                        i11 = i14 + 1;
                        break;
                    }
                    i14++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            this.f10197c = i11;
            if (i11 != -1) {
                this.f10196b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i15 = this.f10197c;
        if (i15 > i10) {
            this.f10196b = 0;
            return -2L;
        }
        if (i15 != 1) {
            qVar.readFully(bArr, 1, i15 - 1);
        }
        this.f10196b = 0;
        return a(bArr, this.f10197c, z10);
    }
}
