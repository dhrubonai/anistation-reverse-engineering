package k9;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import r6.h0;

/* loaded from: classes.dex */
public final class l implements w {

    /* renamed from: a, reason: collision with root package name */
    public byte f6527a;

    /* renamed from: b, reason: collision with root package name */
    public final q f6528b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f6529c;

    /* renamed from: d, reason: collision with root package name */
    public final m f6530d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f6531e;

    public l(w wVar) {
        h0.u(wVar, "source");
        q qVar = new q(wVar);
        this.f6528b = qVar;
        Inflater inflater = new Inflater(true);
        this.f6529c = inflater;
        this.f6530d = new m(qVar, inflater);
        this.f6531e = new CRC32();
    }

    public static void a(int i10, int i11, String str) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        h0.s(format, "format(this, *args)");
        throw new IOException(format);
    }

    @Override // k9.w
    public final y c() {
        return this.f6528b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6530d.close();
    }

    public final void f(g gVar, long j4, long j10) {
        r rVar = gVar.f6520a;
        h0.q(rVar);
        while (true) {
            int i10 = rVar.f6547c;
            int i11 = rVar.f6546b;
            if (j4 < i10 - i11) {
                break;
            }
            j4 -= i10 - i11;
            rVar = rVar.f6550f;
            h0.q(rVar);
        }
        while (j10 > 0) {
            int min = (int) Math.min(rVar.f6547c - r6, j10);
            this.f6531e.update(rVar.f6545a, (int) (rVar.f6546b + j4), min);
            j10 -= min;
            rVar = rVar.f6550f;
            h0.q(rVar);
            j4 = 0;
        }
    }

    @Override // k9.w
    public final long z(g gVar, long j4) {
        boolean z9;
        q qVar;
        boolean z10;
        boolean z11;
        boolean z12;
        g gVar2;
        boolean z13;
        long j10;
        h0.u(gVar, "sink");
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (j4 == 0) {
                return 0L;
            }
            byte b10 = this.f6527a;
            CRC32 crc32 = this.f6531e;
            q qVar2 = this.f6528b;
            if (b10 == 0) {
                qVar2.A(10L);
                g gVar3 = qVar2.f6543b;
                byte q9 = gVar3.q(3L);
                if (((q9 >> 1) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f(qVar2.f6543b, 0L, 10L);
                }
                a(8075, qVar2.readShort(), "ID1ID2");
                qVar2.b(8L);
                if (((q9 >> 2) & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    qVar2.A(2L);
                    if (z10) {
                        f(qVar2.f6543b, 0L, 2L);
                    }
                    int readShort = gVar3.readShort() & 65535;
                    long j11 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                    qVar2.A(j11);
                    if (z10) {
                        f(qVar2.f6543b, 0L, j11);
                        j10 = j11;
                    } else {
                        j10 = j11;
                    }
                    qVar2.b(j10);
                }
                if (((q9 >> 3) & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    gVar2 = gVar3;
                    long a10 = qVar2.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a10 != -1) {
                        if (z10) {
                            qVar = qVar2;
                            f(qVar2.f6543b, 0L, a10 + 1);
                        } else {
                            qVar = qVar2;
                        }
                        qVar.b(a10 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    gVar2 = gVar3;
                    qVar = qVar2;
                }
                if (((q9 >> 4) & 1) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    long a11 = qVar.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a11 != -1) {
                        if (z10) {
                            f(qVar.f6543b, 0L, a11 + 1);
                        }
                        qVar.b(a11 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z10) {
                    qVar.A(2L);
                    int readShort2 = gVar2.readShort() & 65535;
                    a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                this.f6527a = (byte) 1;
            } else {
                qVar = qVar2;
            }
            if (this.f6527a == 1) {
                long j12 = gVar.f6521b;
                long z14 = this.f6530d.z(gVar, j4);
                if (z14 != -1) {
                    f(gVar, j12, z14);
                    return z14;
                }
                this.f6527a = (byte) 2;
            }
            if (this.f6527a == 2) {
                a(qVar.f(), (int) crc32.getValue(), "CRC");
                a(qVar.f(), (int) this.f6529c.getBytesWritten(), "ISIZE");
                this.f6527a = (byte) 3;
                if (!qVar.n()) {
                    throw new IOException("gzip finished without exhausting source");
                }
                return -1L;
            }
            return -1L;
        }
        throw new IllegalArgumentException(a3.g.q("byteCount < 0: ", j4).toString());
    }
}
