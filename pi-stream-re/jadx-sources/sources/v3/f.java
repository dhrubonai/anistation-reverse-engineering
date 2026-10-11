package v3;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f implements e4.k {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f10641a;

    @Override // e4.k
    public final long b(long j4) {
        if (j4 < 0) {
            return 0L;
        }
        long j10 = j4;
        while (j10 > 0) {
            InputStream inputStream = this.f10641a;
            long skip = inputStream.skip(j10);
            if (skip > 0) {
                j10 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j10--;
            }
        }
        return j4 - j10;
    }

    @Override // e4.k
    public final int d(byte[] bArr, int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = this.f10641a.read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new e4.j();
        }
        return i11;
    }

    @Override // e4.k
    public final short e() {
        int read = this.f10641a.read();
        if (read != -1) {
            return (short) read;
        }
        throw new e4.j();
    }

    @Override // e4.k
    public final int f() {
        return (e() << 8) | e();
    }
}
