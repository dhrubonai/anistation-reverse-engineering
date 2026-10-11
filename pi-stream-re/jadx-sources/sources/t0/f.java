package t0;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f9956a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void f(long j4) {
        int i10 = this.f9958c;
        if (i10 > j4) {
            this.f9958c = 0;
            this.f9956a.reset();
        } else {
            j4 -= i10;
        }
        a((int) j4);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f9956a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
