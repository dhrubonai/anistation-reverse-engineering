package t0;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f9952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9953b;

    public a(f fVar) {
        this.f9953b = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j4 < 0) {
            return -1;
        }
        try {
            long j10 = this.f9952a;
            f fVar = this.f9953b;
            if (j10 != j4) {
                if (j10 >= 0 && j4 >= j10 + fVar.available()) {
                    return -1;
                }
                fVar.f(j4);
                this.f9952a = j4;
            }
            if (i11 > fVar.available()) {
                i11 = fVar.available();
            }
            int read = fVar.read(bArr, i10, i11);
            if (read >= 0) {
                this.f9952a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f9952a = -1L;
        return -1;
    }
}
