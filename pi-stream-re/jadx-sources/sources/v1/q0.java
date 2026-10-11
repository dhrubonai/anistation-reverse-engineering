package v1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1.d f10507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10508b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.t f10509c;

    /* renamed from: d, reason: collision with root package name */
    public p0 f10510d;

    /* renamed from: e, reason: collision with root package name */
    public p0 f10511e;

    /* renamed from: f, reason: collision with root package name */
    public p0 f10512f;

    /* renamed from: g, reason: collision with root package name */
    public long f10513g;

    public q0(z1.d dVar) {
        this.f10507a = dVar;
        int i10 = dVar.f11894b;
        this.f10508b = i10;
        this.f10509c = new f1.t(32);
        p0 p0Var = new p0(i10, 0L);
        this.f10510d = p0Var;
        this.f10511e = p0Var;
        this.f10512f = p0Var;
    }

    public static p0 d(p0 p0Var, long j4, ByteBuffer byteBuffer, int i10) {
        while (j4 >= p0Var.f10503b) {
            p0Var = p0Var.f10505d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (p0Var.f10503b - j4));
            z1.a aVar = p0Var.f10504c;
            byteBuffer.put(aVar.f11888a, ((int) (j4 - p0Var.f10502a)) + aVar.f11889b, min);
            i10 -= min;
            j4 += min;
            if (j4 == p0Var.f10503b) {
                p0Var = p0Var.f10505d;
            }
        }
        return p0Var;
    }

    public static p0 e(p0 p0Var, long j4, byte[] bArr, int i10) {
        while (j4 >= p0Var.f10503b) {
            p0Var = p0Var.f10505d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (p0Var.f10503b - j4));
            z1.a aVar = p0Var.f10504c;
            System.arraycopy(aVar.f11888a, ((int) (j4 - p0Var.f10502a)) + aVar.f11889b, bArr, i10 - i11, min);
            i11 -= min;
            j4 += min;
            if (j4 == p0Var.f10503b) {
                p0Var = p0Var.f10505d;
            }
        }
        return p0Var;
    }

    public static p0 f(p0 p0Var, i1.h hVar, r0 r0Var, f1.t tVar) {
        boolean z9;
        if (hVar.g(1073741824)) {
            long j4 = r0Var.f10523b;
            int i10 = 1;
            tVar.D(1);
            p0 e10 = e(p0Var, j4, tVar.f3858a, 1);
            long j10 = j4 + 1;
            byte b10 = tVar.f3858a[0];
            if ((b10 & 128) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            i1.d dVar = hVar.f5261d;
            byte[] bArr = dVar.f5250a;
            if (bArr == null) {
                dVar.f5250a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            p0Var = e(e10, j10, dVar.f5250a, i11);
            long j11 = j10 + i11;
            if (z9) {
                tVar.D(2);
                p0Var = e(p0Var, j11, tVar.f3858a, 2);
                j11 += 2;
                i10 = tVar.A();
            }
            int[] iArr = dVar.f5253d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.f5254e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z9) {
                int i12 = i10 * 6;
                tVar.D(i12);
                p0Var = e(p0Var, j11, tVar.f3858a, i12);
                j11 += i12;
                tVar.G(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = tVar.A();
                    iArr2[i13] = tVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = r0Var.f10522a - ((int) (j11 - r0Var.f10523b));
            }
            d2.f0 f0Var = r0Var.f10524c;
            int i14 = f1.b0.f3799a;
            byte[] bArr2 = f0Var.f3137b;
            byte[] bArr3 = dVar.f5250a;
            dVar.f5255f = i10;
            dVar.f5253d = iArr;
            dVar.f5254e = iArr2;
            dVar.f5251b = bArr2;
            dVar.f5250a = bArr3;
            int i15 = f0Var.f3136a;
            dVar.f5252c = i15;
            int i16 = f0Var.f3138c;
            dVar.f5256g = i16;
            int i17 = f0Var.f3139d;
            dVar.f5257h = i17;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f5258i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (f1.b0.f3799a >= 24) {
                i1.c cVar = dVar.f5259j;
                cVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = cVar.f5249b;
                pattern.set(i16, i17);
                cVar.f5248a.setPattern(pattern);
            }
            long j12 = r0Var.f10523b;
            int i18 = (int) (j11 - j12);
            r0Var.f10523b = j12 + i18;
            r0Var.f10522a -= i18;
        }
        if (hVar.g(268435456)) {
            tVar.D(4);
            p0 e11 = e(p0Var, r0Var.f10523b, tVar.f3858a, 4);
            int y9 = tVar.y();
            r0Var.f10523b += 4;
            r0Var.f10522a -= 4;
            hVar.j(y9);
            p0 d10 = d(e11, r0Var.f10523b, hVar.f5262e, y9);
            r0Var.f10523b += y9;
            int i19 = r0Var.f10522a - y9;
            r0Var.f10522a = i19;
            ByteBuffer byteBuffer = hVar.f5265y;
            if (byteBuffer != null && byteBuffer.capacity() >= i19) {
                hVar.f5265y.clear();
            } else {
                hVar.f5265y = ByteBuffer.allocate(i19);
            }
            return d(d10, r0Var.f10523b, hVar.f5265y, r0Var.f10522a);
        }
        hVar.j(r0Var.f10522a);
        return d(p0Var, r0Var.f10523b, hVar.f5262e, r0Var.f10522a);
    }

    public final void a(p0 p0Var) {
        if (p0Var.f10504c == null) {
            return;
        }
        z1.d dVar = this.f10507a;
        synchronized (dVar) {
            p0 p0Var2 = p0Var;
            while (p0Var2 != null) {
                z1.a[] aVarArr = dVar.f11898f;
                int i10 = dVar.f11897e;
                dVar.f11897e = i10 + 1;
                z1.a aVar = p0Var2.f10504c;
                aVar.getClass();
                aVarArr[i10] = aVar;
                dVar.f11896d--;
                p0Var2 = p0Var2.f10505d;
                if (p0Var2 == null || p0Var2.f10504c == null) {
                    p0Var2 = null;
                }
            }
            dVar.notifyAll();
        }
        p0Var.f10504c = null;
        p0Var.f10505d = null;
    }

    public final void b(long j4) {
        p0 p0Var;
        if (j4 == -1) {
            return;
        }
        while (true) {
            p0Var = this.f10510d;
            if (j4 < p0Var.f10503b) {
                break;
            }
            z1.d dVar = this.f10507a;
            z1.a aVar = p0Var.f10504c;
            synchronized (dVar) {
                z1.a[] aVarArr = dVar.f11898f;
                int i10 = dVar.f11897e;
                dVar.f11897e = i10 + 1;
                aVarArr[i10] = aVar;
                dVar.f11896d--;
                dVar.notifyAll();
            }
            p0 p0Var2 = this.f10510d;
            p0Var2.f10504c = null;
            p0 p0Var3 = p0Var2.f10505d;
            p0Var2.f10505d = null;
            this.f10510d = p0Var3;
        }
        if (this.f10511e.f10502a < p0Var.f10502a) {
            this.f10511e = p0Var;
        }
    }

    public final int c(int i10) {
        z1.a aVar;
        p0 p0Var = this.f10512f;
        if (p0Var.f10504c == null) {
            z1.d dVar = this.f10507a;
            synchronized (dVar) {
                int i11 = dVar.f11896d + 1;
                dVar.f11896d = i11;
                int i12 = dVar.f11897e;
                if (i12 > 0) {
                    z1.a[] aVarArr = dVar.f11898f;
                    int i13 = i12 - 1;
                    dVar.f11897e = i13;
                    aVar = aVarArr[i13];
                    aVar.getClass();
                    dVar.f11898f[dVar.f11897e] = null;
                } else {
                    z1.a aVar2 = new z1.a(new byte[dVar.f11894b], 0);
                    z1.a[] aVarArr2 = dVar.f11898f;
                    if (i11 > aVarArr2.length) {
                        dVar.f11898f = (z1.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                    }
                    aVar = aVar2;
                }
            }
            p0 p0Var2 = new p0(this.f10508b, this.f10512f.f10503b);
            p0Var.f10504c = aVar;
            p0Var.f10505d = p0Var2;
        }
        return Math.min(i10, (int) (this.f10512f.f10503b - this.f10513g));
    }
}
