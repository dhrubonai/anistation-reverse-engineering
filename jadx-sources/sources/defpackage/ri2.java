package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ri2 implements bv5 {
    public final sy2 A;
    public final CRC32 B;
    public byte x;
    public final xy4 y;
    public final Inflater z;

    public ri2(bv5 bv5Var) {
        bv5Var.getClass();
        xy4 xy4Var = new xy4(bv5Var);
        this.y = xy4Var;
        Inflater inflater = new Inflater(true);
        this.z = inflater;
        this.A = new sy2(xy4Var, inflater);
        this.B = new CRC32();
    }

    public static void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + uz5.a0(8, tl7.R(i2)) + " != expected 0x" + uz5.a0(8, tl7.R(i)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return this.y.x.d();
    }

    @Override // defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        byte b;
        boolean z;
        pa0 pa0Var2;
        ri2 ri2Var = this;
        xy4 xy4Var = ri2Var.y;
        pa0 pa0Var3 = xy4Var.y;
        pa0Var.getClass();
        if (j >= 0) {
            if (j == 0) {
                return 0L;
            }
            byte b2 = ri2Var.x;
            CRC32 crc32 = ri2Var.B;
            if (b2 == 0) {
                xy4Var.m(10L);
                byte p = pa0Var3.p(3L);
                if (((p >> 1) & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ri2Var.l(pa0Var3, 0L, 10L);
                }
                a("ID1ID2", 8075, xy4Var.readShort());
                xy4Var.skip(8L);
                if (((p >> 2) & 1) == 1) {
                    xy4Var.m(2L);
                    if (z) {
                        l(pa0Var3, 0L, 2L);
                    }
                    long I = pa0Var3.I() & 65535;
                    xy4Var.m(I);
                    if (z) {
                        l(pa0Var3, 0L, I);
                    }
                    pa0Var2 = pa0Var3;
                    xy4Var.skip(I);
                } else {
                    pa0Var2 = pa0Var3;
                }
                if (((p >> 3) & 1) == 1) {
                    long a = xy4Var.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a != -1) {
                        if (z) {
                            l(pa0Var2, 0L, a + 1);
                        }
                        xy4Var.skip(a + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((p >> 4) & 1) == 1) {
                    long a2 = xy4Var.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a2 != -1) {
                        if (z) {
                            ri2Var = this;
                            ri2Var.l(pa0Var2, 0L, a2 + 1);
                        } else {
                            ri2Var = this;
                        }
                        xy4Var.skip(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    ri2Var = this;
                }
                if (z) {
                    a("FHCRC", xy4Var.q(), (short) crc32.getValue());
                    crc32.reset();
                }
                ri2Var.x = (byte) 1;
                b2 = 1;
            }
            if (b2 == 1) {
                long j2 = pa0Var.y;
                long j0 = ri2Var.A.j0(j, pa0Var);
                if (j0 != -1) {
                    ri2Var.l(pa0Var, j2, j0);
                    return j0;
                }
                b = 2;
                ri2Var.x = (byte) 2;
                b2 = 2;
            } else {
                b = 2;
            }
            if (b2 == b) {
                a("CRC", xy4Var.l(), (int) crc32.getValue());
                a("ISIZE", xy4Var.l(), (int) ri2Var.z.getBytesWritten());
                ri2Var.x = (byte) 3;
                if (!xy4Var.D()) {
                    qi2.k("gzip finished without exhausting source");
                    return 0L;
                }
            }
            return -1L;
        }
        ze0.e(h11.h(j, "byteCount < 0: "));
        return 0L;
    }

    public final void l(pa0 pa0Var, long j, long j2) {
        zf5 zf5Var = pa0Var.x;
        zf5Var.getClass();
        while (true) {
            long j3 = zf5Var.c - zf5Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            zf5Var = zf5Var.f;
            zf5Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(zf5Var.c - r6, j2);
            this.B.update(zf5Var.a, (int) (zf5Var.b + j), min);
            j2 -= min;
            zf5Var = zf5Var.f;
            zf5Var.getClass();
            j = 0;
        }
    }
}
