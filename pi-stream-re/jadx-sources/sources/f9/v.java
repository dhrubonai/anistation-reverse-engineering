package f9;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r6.h0;

/* loaded from: classes.dex */
public final class v implements k9.w {

    /* renamed from: a, reason: collision with root package name */
    public final k9.i f4096a;

    /* renamed from: b, reason: collision with root package name */
    public int f4097b;

    /* renamed from: c, reason: collision with root package name */
    public int f4098c;

    /* renamed from: d, reason: collision with root package name */
    public int f4099d;

    /* renamed from: e, reason: collision with root package name */
    public int f4100e;

    /* renamed from: f, reason: collision with root package name */
    public int f4101f;

    public v(k9.i iVar) {
        this.f4096a = iVar;
    }

    @Override // k9.w
    public final k9.y c() {
        return this.f4096a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // k9.w
    public final long z(k9.g gVar, long j4) {
        int i10;
        int readInt;
        h0.u(gVar, "sink");
        do {
            int i11 = this.f4100e;
            k9.i iVar = this.f4096a;
            if (i11 == 0) {
                iVar.b(this.f4101f);
                this.f4101f = 0;
                if ((this.f4098c & 4) != 0) {
                    return -1L;
                }
                i10 = this.f4099d;
                int s9 = z8.b.s(iVar);
                this.f4100e = s9;
                this.f4097b = s9;
                int readByte = iVar.readByte() & 255;
                this.f4098c = iVar.readByte() & 255;
                y8.j jVar = w.f4102e;
                if (jVar.m().isLoggable(Level.FINE)) {
                    Logger m5 = jVar.m();
                    k9.j jVar2 = g.f4037a;
                    m5.fine(g.a(true, this.f4099d, this.f4097b, readByte, this.f4098c));
                }
                readInt = iVar.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                this.f4099d = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } else {
                long z9 = iVar.z(gVar, Math.min(j4, i11));
                if (z9 == -1) {
                    return -1L;
                }
                this.f4100e -= (int) z9;
                return z9;
            }
        } while (readInt == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
