package defpackage;

import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b24 {
    public final f22 a;
    public final zp2 b;
    public final boolean c;
    public final af2 g;
    public long h;
    public long i;
    public long k;
    public long l;
    public long m;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public boolean j = true;
    public wx4 n = wx4.a(0L, 0L);
    public long o = 0;

    public b24(f22 f22Var, zp2 zp2Var, boolean z) {
        this.a = f22Var;
        this.b = zp2Var;
        this.c = z;
        af2 af2Var = new af2((byte) 27, (byte) 0);
        af2Var.y = ByteBuffer.allocateDirect(0);
        this.g = af2Var;
    }

    public final void a() {
        boolean z;
        if (this.j) {
            d();
            return;
        }
        ByteBuffer l = q90.l(this.d, this.b);
        int remaining = l.remaining();
        long j = remaining + 8;
        boolean z2 = false;
        if (this.l - this.m < j) {
            e(((Long) this.n.y.d()).longValue() + j, l);
            if (this.l - this.m >= j) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
        }
        long j2 = this.m;
        f22 f22Var = this.a;
        f22Var.a(j2);
        f22Var.write(l);
        long j3 = remaining + j2;
        long longValue = ((Long) this.n.y.d()).longValue() - j3;
        if (longValue < 2147483647L) {
            z2 = true;
        }
        io3.B(z2);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt((int) longValue);
        String str = eq6.a;
        allocate.put("free".getBytes(StandardCharsets.UTF_8));
        allocate.flip();
        f22Var.write(allocate);
        this.l = j2;
        f(j2 - this.k);
        this.n = wx4.a(Long.valueOf(j2), Long.valueOf(j2 + l.limit()));
        f22Var.y.truncate(j3);
    }

    public final void b() {
        ArrayList arrayList;
        int i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i2 >= arrayList2.size()) {
                break;
            }
            g((tg6) arrayList2.get(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            arrayList = this.e;
            if (i3 >= arrayList.size()) {
                break;
            }
            g((tg6) arrayList.get(i3));
            i3++;
        }
        if (this.f.get()) {
            a();
            if (!arrayList.isEmpty()) {
                qo3 K = io3.K(0L);
                zp2 zp2Var = this.b;
                zp2Var.n(K);
                ByteBuffer g = q90.g();
                zp2 zp2Var2 = new zp2((byte) 12);
                zp2Var2.n((z14) zp2Var.A);
                zp2Var2.n(new qo3("auxiliary.tracks.interleaved", new byte[]{1}, 0, 75));
                int size = arrayList.size();
                byte[] bArr = new byte[size + 2];
                bArr[0] = 1;
                bArr[1] = (byte) size;
                for (int i4 = 0; i4 < size; i4++) {
                    tg6 tg6Var = (tg6) arrayList.get(i4);
                    int i5 = tg6Var.b.h;
                    if (i5 != 1) {
                        i = 2;
                        if (i5 != 2) {
                            if (i5 == 3) {
                                continue;
                            } else if (i5 == 4) {
                                i = 3;
                            } else {
                                throw new IllegalArgumentException("Unsupported auxiliary track type " + tg6Var.b.h);
                            }
                        } else {
                            i = 1;
                        }
                    } else {
                        i = 0;
                    }
                    bArr[i4 + 2] = (byte) i;
                }
                zp2Var2.n(new qo3("auxiliary.tracks.map", bArr, 0, 0));
                ByteBuffer l = q90.l(arrayList, zp2Var2);
                long remaining = l.remaining() + g.remaining();
                ByteBuffer allocate = ByteBuffer.allocate(16);
                allocate.putInt(1);
                String str = eq6.a;
                allocate.put("axte".getBytes(StandardCharsets.UTF_8));
                allocate.putLong(remaining + 16);
                allocate.flip();
                ByteBuffer z2 = n77.z(allocate, g, l);
                long remaining2 = z2.remaining();
                byte[] bArr2 = new byte[8];
                for (int i6 = 7; i6 >= 0; i6--) {
                    bArr2[i6] = (byte) (255 & remaining2);
                    remaining2 >>= 8;
                }
                zp2Var.n(new qo3("auxiliary.tracks.length", bArr2, 0, 78));
                a();
                ((HashSet) zp2Var.z).remove(K);
                f22 f22Var = this.a;
                FileChannel fileChannel = f22Var.y;
                zp2Var.n(io3.K(fileChannel.size()));
                long size2 = fileChannel.size();
                a();
                if (size2 == fileChannel.size()) {
                    z = true;
                }
                io3.B(z);
                f22Var.a(fileChannel.size());
                f22Var.write(z2);
            }
        }
    }

    public final void c(long j) {
        if (!this.j) {
            if (this.m + j >= this.l) {
                e(Math.max(this.l + Math.min(1000000000L, Math.max(500000L, ((float) r0) * 0.2f)) + j, ((Long) this.n.y.d()).longValue()), q90.l(this.d, this.b));
            }
        }
    }

    public final void d() {
        ByteBuffer l = q90.l(this.d, this.b);
        int remaining = l.remaining();
        long remaining2 = l.remaining() + 8;
        long j = this.i;
        long j2 = this.h;
        long j3 = j - j2;
        f22 f22Var = this.a;
        if (remaining2 <= j3) {
            f22Var.a(j2);
            f22Var.write(l);
            f22Var.write(n77.m0("free", ByteBuffer.allocate((int) ((this.i - f22Var.y.position()) - 8))));
        } else {
            this.j = false;
            long j4 = this.m;
            this.l = j4;
            f22Var.a(j4);
            f22Var.write(l);
            this.n = wx4.a(Long.valueOf(this.l), Long.valueOf(this.l + remaining));
            ByteBuffer m0 = n77.m0("free", ByteBuffer.allocate((int) ((this.i - this.h) - 8)));
            f22Var.a(this.h);
            f22Var.write(m0);
        }
        f(this.m - this.k);
    }

    public final void e(long j, ByteBuffer byteBuffer) {
        boolean z;
        boolean z2 = false;
        if (j >= ((Long) this.n.y.d()).longValue()) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        if (j >= this.l) {
            z2 = true;
        }
        io3.B(z2);
        f22 f22Var = this.a;
        f22Var.a(j);
        f22Var.write(n77.m0("free", byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.l = j2;
        f(j2 - this.k);
        this.n = wx4.a(Long.valueOf(j), Long.valueOf(j + byteBuffer.remaining()));
    }

    public final void f(long j) {
        long j2 = this.k + 8;
        f22 f22Var = this.a;
        f22Var.a(j2);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        allocate.flip();
        f22Var.write(allocate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ec, code lost:
    
        if (((java.lang.Integer) r7.first).intValue() != 10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        if (r8.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_H265) == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.tg6 r14) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b24.g(tg6):void");
    }

    public final void h(tg6 tg6Var, ByteBuffer byteBuffer, ra0 ra0Var) {
        ByteBuffer byteBuffer2;
        rc4 rc4Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ea2 ea2Var = tg6Var.b;
        String str = ea2Var.p;
        boolean z = false;
        if (ea2Var.s.isEmpty() && tg6Var.j == null) {
            if (Objects.equals(str, MimeTypes.VIDEO_AV1)) {
                ByteBuffer duplicate = byteBuffer.duplicate();
                ArrayList arrayList = new ArrayList();
                ArrayList n0 = db.n0(duplicate);
                int size = n0.size();
                int i8 = 0;
                ByteBuffer byteBuffer3 = null;
                ByteBuffer byteBuffer4 = null;
                while (i8 < size) {
                    Object obj = n0.get(i8);
                    i8++;
                    qc4 qc4Var = (qc4) obj;
                    int i9 = qc4Var.a;
                    if (i9 == 5) {
                        arrayList.add(sw0.v(qc4Var));
                    } else if (i9 == 1 && byteBuffer3 == null) {
                        byteBuffer3 = sw0.v(qc4Var);
                        byteBuffer4 = ByteBuffer.allocate(4);
                        byteBuffer4.put((byte) -127);
                        try {
                            rc4Var = new rc4(qc4Var);
                        } catch (pc4 unused) {
                            rc4Var = null;
                        }
                        io3.w(rc4Var, "No sequence header available.");
                        byteBuffer4.put((byte) ((rc4Var.g << 5) | rc4Var.h));
                        if (rc4Var.i > 0) {
                            i = 128;
                        } else {
                            i = 0;
                        }
                        if (rc4Var.l) {
                            i2 = 64;
                        } else {
                            i2 = 0;
                        }
                        int i10 = i | i2;
                        if (rc4Var.m) {
                            i3 = 32;
                        } else {
                            i3 = 0;
                        }
                        int i11 = i10 | i3;
                        int i12 = 16;
                        if (rc4Var.n) {
                            i4 = 16;
                        } else {
                            i4 = 0;
                        }
                        int i13 = i11 | i4;
                        if (rc4Var.o) {
                            i5 = 8;
                        } else {
                            i5 = 0;
                        }
                        int i14 = i13 | i5;
                        if (rc4Var.p) {
                            i6 = 4;
                        } else {
                            i6 = 0;
                        }
                        byteBuffer4.put((byte) (i14 | i6 | rc4Var.q));
                        boolean z2 = rc4Var.j;
                        if (!z2) {
                            i12 = 0;
                        }
                        if (z2) {
                            i7 = rc4Var.k & 15;
                        } else {
                            i7 = 0;
                        }
                        byteBuffer4.put((byte) (i7 | i12));
                        byteBuffer4.flip();
                    }
                }
                io3.w(byteBuffer3, "No sequence header available.");
                ByteBuffer z3 = n77.z(byteBuffer3, n77.z((ByteBuffer[]) arrayList.toArray(new ByteBuffer[0])));
                io3.w(byteBuffer4, "csdHeader is null.");
                tg6Var.j = n77.z(byteBuffer4, z3).array();
            } else if (Objects.equals(str, "video/x-vnd.on2.vp9")) {
                tg6Var.j = ko0.b(byteBuffer.duplicate());
            }
        }
        if (tg6Var.k == -9223372036854775807L) {
            z = true;
        }
        io3.m("Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag", z);
        int i15 = ra0Var.b;
        long j = ra0Var.a;
        int i16 = ra0Var.c;
        if (i15 != 0 && byteBuffer.remaining() != 0) {
            if ((i16 & 1) > 0) {
                tg6Var.i = true;
            }
            if (tg6Var.i || !qy3.m(str)) {
                if (tg6Var.l) {
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining());
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.rewind();
                } else {
                    byteBuffer2 = byteBuffer;
                }
                tg6Var.f.addLast(new ra0(byteBuffer2.remaining(), j, i16));
                tg6Var.g.addLast(byteBuffer2);
            }
        } else if ((i16 & 4) != 0) {
            tg6Var.k = j;
        }
        g(tg6Var);
        if (this.d.contains(tg6Var) && this.j && j - this.o >= 1000000) {
            d();
            this.o = j;
        }
    }
}
