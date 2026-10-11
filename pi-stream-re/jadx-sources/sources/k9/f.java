package k9;

import java.io.IOException;
import java.io.InputStream;
import r6.h0;

/* loaded from: classes.dex */
public final class f extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f6519b;

    public /* synthetic */ f(i iVar, int i10) {
        this.f6518a = i10;
        this.f6519b = iVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // java.io.InputStream
    public final int available() {
        long min;
        int i10 = this.f6518a;
        i iVar = this.f6519b;
        switch (i10) {
            case 0:
                min = Math.min(((g) iVar).f6521b, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                return (int) min;
            default:
                q qVar = (q) iVar;
                if (!qVar.f6544c) {
                    min = Math.min(qVar.f6543b.f6521b, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    return (int) min;
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f6518a) {
            case 0:
                return;
            default:
                ((q) this.f6519b).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f6518a;
        i iVar = this.f6519b;
        switch (i12) {
            case 0:
                h0.u(bArr, "sink");
                return ((g) iVar).t(bArr, i10, i11);
            default:
                h0.u(bArr, "data");
                q qVar = (q) iVar;
                if (!qVar.f6544c) {
                    q6.g.h(bArr.length, i10, i11);
                    g gVar = qVar.f6543b;
                    if (gVar.f6521b == 0 && qVar.f6542a.z(gVar, 8192L) == -1) {
                        return -1;
                    }
                    return gVar.t(bArr, i10, i11);
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        int i10 = this.f6518a;
        i iVar = this.f6519b;
        switch (i10) {
            case 0:
                return ((g) iVar) + ".inputStream()";
            default:
                return ((q) iVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i10 = this.f6518a;
        i iVar = this.f6519b;
        switch (i10) {
            case 0:
                g gVar = (g) iVar;
                if (gVar.f6521b > 0) {
                    return gVar.readByte() & 255;
                }
                return -1;
            default:
                q qVar = (q) iVar;
                if (!qVar.f6544c) {
                    g gVar2 = qVar.f6543b;
                    if (gVar2.f6521b == 0 && qVar.f6542a.z(gVar2, 8192L) == -1) {
                        return -1;
                    }
                    return gVar2.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }
}
