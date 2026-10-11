package defpackage;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class po3 implements b12 {
    public static final byte[] r0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] s0;
    public static final byte[] t0;
    public static final byte[] u0;
    public static final UUID v0;
    public static final Map w0;
    public lo3 A;
    public oo3 B;
    public boolean C;
    public int D;
    public long E;
    public final SparseArray F;
    public boolean G;
    public long H;
    public int I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public long N;
    public long O;
    public long P;
    public boolean Q;
    public long R;
    public boolean S;
    public long T;
    public boolean U;
    public byte V;
    public long W;
    public long X;
    public int Y;
    public int Z;
    public final g81 a;
    public int[] a0;
    public final yq6 b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final LongSparseArray d;
    public int d0;
    public final boolean e;
    public int e0;
    public final boolean f;
    public boolean f0;
    public final boolean g;
    public long g0;
    public final w16 h;
    public int h0;
    public final zi4 i;
    public int i0;
    public final zi4 j;
    public int j0;
    public final zi4 k;
    public boolean k0;
    public final zi4 l;
    public boolean l0;
    public final zi4 m;
    public boolean m0;
    public final zi4 n;
    public short n0;
    public final zi4 o;
    public byte o0;
    public final zi4 p;
    public boolean p0;
    public final zi4 q;
    public d12 q0;
    public final zi4 r;
    public ByteBuffer s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public boolean y;
    public boolean z;

    static {
        String str = eq6.a;
        s0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        t0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        u0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        v0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        h11.s(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        h11.s(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        w0 = Collections.unmodifiableMap(hashMap);
    }

    public po3(int i, w16 w16Var) {
        boolean z;
        boolean z2;
        g81 g81Var = new g81();
        this.u = -1L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1L;
        this.K = -1L;
        this.L = -1;
        this.N = -1L;
        this.O = -1L;
        this.P = -1L;
        this.R = -1L;
        this.T = -9223372036854775807L;
        this.a = g81Var;
        g81Var.d = new sn3(this, (byte) 1);
        this.h = w16Var;
        this.F = new SparseArray();
        if ((i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        if ((i & 2) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.g = z2;
        this.f = (i & 4) == 0;
        this.b = new yq6();
        this.d = new LongSparseArray();
        this.c = new SparseArray();
        this.k = new zi4(4);
        this.l = new zi4(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new zi4(4);
        this.i = new zi4(io3.d);
        this.j = new zi4(4);
        this.n = new zi4();
        this.o = new zi4();
        this.p = new zi4(8);
        this.q = new zi4();
        this.r = new zi4();
        this.a0 = new int[1];
        this.z = true;
    }

    public static byte[] i(long j, String str, long j2) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = eq6.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        int i = 0;
        this.U = false;
        boolean z = true;
        while (z && !this.U) {
            z = this.a.a(c12Var);
            if (z) {
                long position = c12Var.getPosition();
                if (this.Q) {
                    this.R = position;
                    d42Var.a = this.P;
                    this.Q = false;
                    return 1;
                }
                if (this.S) {
                    long j = this.R;
                    if (j != -1) {
                        d42Var.a = j;
                        this.R = -1L;
                        return 1;
                    }
                }
                long position2 = c12Var.getPosition();
                if (this.M) {
                    this.O = position2;
                    d42Var.a = this.N;
                    this.M = false;
                    return 1;
                }
                if (this.C) {
                    long j2 = this.O;
                    if (j2 != -1) {
                        d42Var.a = j2;
                        this.O = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.c;
            if (i < sparseArray.size()) {
                oo3 oo3Var = (oo3) sparseArray.valueAt(i);
                oo3Var.d0.getClass();
                ek6 ek6Var = oo3Var.W;
                if (ek6Var != null) {
                    ek6Var.a(oo3Var.d0, oo3Var.l);
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        fr0 fr0Var = new fr0((byte) 13);
        zi4 zi4Var = (zi4) fr0Var.z;
        p81 p81Var = (p81) c12Var;
        long j = p81Var.z;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        p81Var.j(zi4Var.a, 0, 4, false);
        long C = zi4Var.C();
        fr0Var.y = 4;
        while (true) {
            if (C != 440786851) {
                int i2 = fr0Var.y + 1;
                fr0Var.y = i2;
                if (i2 == i) {
                    break;
                }
                p81Var.j(zi4Var.a, 0, 1, false);
                C = ((C << 8) & (-256)) | (zi4Var.a[0] & 255);
            } else {
                long o = fr0Var.o(p81Var);
                long j3 = fr0Var.y;
                if (o != Long.MIN_VALUE && (j == -1 || j3 + o < j)) {
                    while (true) {
                        long j4 = fr0Var.y;
                        long j5 = j3 + o;
                        if (j4 < j5) {
                            if (fr0Var.o(p81Var) != Long.MIN_VALUE) {
                                long o2 = fr0Var.o(p81Var);
                                if (o2 < 0 || o2 > 2147483647L) {
                                    break;
                                }
                                if (o2 != 0) {
                                    int i3 = (int) o2;
                                    p81Var.x(i3, false);
                                    fr0Var.y += i3;
                                }
                            } else {
                                break;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        this.T = -9223372036854775807L;
        this.V = (byte) 0;
        g81 g81Var = this.a;
        g81Var.e = (byte) 0;
        g81Var.b.clear();
        yq6 yq6Var = g81Var.c;
        yq6Var.a = false;
        yq6Var.b = 0;
        yq6 yq6Var2 = this.b;
        yq6Var2.a = false;
        yq6Var2.b = 0;
        n();
        this.G = false;
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1L;
        this.K = -1L;
        if (!this.C) {
            this.F.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i < sparseArray.size()) {
                ek6 ek6Var = ((oo3) sparseArray.valueAt(i)).W;
                if (ek6Var != null) {
                    ek6Var.b = false;
                    ek6Var.c = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        if (this.g) {
            d12Var = new tu(d12Var, this.h);
        }
        this.q0 = d12Var;
    }

    public final void f(int i) {
        if (this.G) {
            return;
        }
        throw bj4.a("Element " + i + " must be in a Cues", null);
    }

    public final void g(int i) {
        if (this.B != null) {
            return;
        }
        throw bj4.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.oo3 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po3.h(oo3, long, int, int, int):void");
    }

    public final lo3 j(int i) {
        lo3 lo3Var = this.A;
        if (lo3Var != null) {
            return lo3Var;
        }
        throw bj4.a("Element " + i + " must be in an EditionEntry", null);
    }

    public final void k() {
        if (this.z) {
            if (this.P == -1 || this.S) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.c;
                    if (i < sparseArray.size()) {
                        if (((oo3) sparseArray.valueAt(i)).X) {
                            return;
                        } else {
                            i++;
                        }
                    } else {
                        d12 d12Var = this.q0;
                        d12Var.getClass();
                        d12Var.t();
                        this.z = false;
                        return;
                    }
                }
            }
        }
    }

    public final void l() {
        if (this.C) {
            return;
        }
        if (this.e && this.N != -1) {
            this.M = true;
            return;
        }
        d12 d12Var = this.q0;
        d12Var.getClass();
        d12Var.I(new zy(this.x));
        this.C = true;
    }

    public final void m(c12 c12Var, int i) {
        zi4 zi4Var = this.k;
        if (zi4Var.c >= i) {
            return;
        }
        byte[] bArr = zi4Var.a;
        if (bArr.length < i) {
            zi4Var.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = zi4Var.a;
        int i2 = zi4Var.c;
        c12Var.readFully(bArr2, i2, i - i2);
        zi4Var.M(i);
    }

    public final void n() {
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = (short) 0;
        this.o0 = (byte) 0;
        this.p0 = false;
        this.n.K(0);
    }

    public final long o(long j) {
        long j2 = this.v;
        if (j2 != -9223372036854775807L) {
            String str = eq6.a;
            return eq6.e0(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw bj4.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.oo3 r30) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po3.p(oo3):void");
    }

    /* JADX WARN: Type inference failed for: r6v64, types: [short, int] */
    public final int q(c12 c12Var, oo3 oo3Var, int i, boolean z) {
        int f;
        int f2;
        int i2;
        boolean z2;
        boolean z3;
        short s;
        if ("S_TEXT/UTF8".equals(oo3Var.c)) {
            r(c12Var, r0, i);
            int i3 = this.i0;
            n();
            return i3;
        }
        if (!"S_TEXT/ASS".equals(oo3Var.c) && !"S_TEXT/SSA".equals(oo3Var.c)) {
            if ("S_TEXT/WEBVTT".equals(oo3Var.c)) {
                r(c12Var, u0, i);
                int i4 = this.i0;
                n();
                return i4;
            }
            if (oo3Var.X) {
                oo3Var.e0.getClass();
                ea2 Y = h98.Y(c12Var, i, oo3Var.e0);
                oo3Var.e0 = Y;
                oo3Var.d0.g(Y);
                oo3Var.X = false;
                k();
            }
            bh6 bh6Var = oo3Var.d0;
            boolean z4 = this.k0;
            zi4 zi4Var = this.n;
            int i5 = 2;
            boolean z5 = true;
            if (!z4) {
                boolean z6 = oo3Var.j;
                zi4 zi4Var2 = this.k;
                if (z6) {
                    this.d0 &= -1073741825;
                    int i6 = 128;
                    if (!this.l0) {
                        c12Var.readFully(zi4Var2.a, 0, 1);
                        this.h0++;
                        byte b = zi4Var2.a[0];
                        if ((b & 128) != 128) {
                            this.o0 = b;
                            this.l0 = true;
                        } else {
                            throw bj4.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b2 = this.o0;
                    if ((b2 & 1) == 1) {
                        if ((b2 & 2) == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.d0 |= 1073741824;
                        if (!this.p0) {
                            zi4 zi4Var3 = this.p;
                            c12Var.readFully(zi4Var3.a, 0, 8);
                            this.h0 += 8;
                            this.p0 = true;
                            byte[] bArr = zi4Var2.a;
                            if (!z3) {
                                i6 = 0;
                            }
                            bArr[0] = (byte) (i6 | 8);
                            zi4Var2.N(0);
                            bh6Var.b(zi4Var2, 1, 1);
                            this.i0++;
                            zi4Var3.N(0);
                            bh6Var.b(zi4Var3, 8, 1);
                            this.i0 += 8;
                        }
                        if (z3) {
                            if (!this.m0) {
                                c12Var.readFully(zi4Var2.a, 0, 1);
                                this.h0++;
                                zi4Var2.N(0);
                                this.n0 = zi4Var2.A();
                                this.m0 = true;
                            }
                            int i7 = this.n0 * 4;
                            zi4Var2.K(i7);
                            c12Var.readFully(zi4Var2.a, 0, i7);
                            this.h0 += i7;
                            short s2 = (short) ((this.n0 / 2) + 1);
                            int i8 = (s2 * 6) + 2;
                            ByteBuffer byteBuffer = this.s;
                            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                                this.s = ByteBuffer.allocate(i8);
                            }
                            this.s.position(0);
                            this.s.putShort(s2);
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                s = this.n0;
                                if (i9 >= s) {
                                    break;
                                }
                                int E = zi4Var2.E();
                                int i11 = i9 % 2;
                                int i12 = i5;
                                ByteBuffer byteBuffer2 = this.s;
                                if (i11 == 0) {
                                    byteBuffer2.putShort((short) (E - i10));
                                } else {
                                    byteBuffer2.putInt(E - i10);
                                }
                                i9++;
                                i10 = E;
                                i5 = i12;
                            }
                            i2 = i5;
                            int i13 = (i - this.h0) - i10;
                            int i14 = s % 2;
                            ByteBuffer byteBuffer3 = this.s;
                            if (i14 == 1) {
                                byteBuffer3.putInt(i13);
                            } else {
                                byteBuffer3.putShort((short) i13);
                                this.s.putInt(0);
                            }
                            byte[] array = this.s.array();
                            zi4 zi4Var4 = this.q;
                            zi4Var4.L(i8, array);
                            bh6Var.b(zi4Var4, i8, 1);
                            this.i0 += i8;
                        }
                    }
                    i2 = 2;
                } else {
                    i2 = 2;
                    byte[] bArr2 = oo3Var.k;
                    if (bArr2 != null) {
                        zi4Var.L(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(oo3Var.c)) {
                    z2 = z;
                } else if (oo3Var.h > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.d0 |= 268435456;
                    this.r.K(0);
                    int i15 = (zi4Var.c + i) - this.h0;
                    zi4Var2.K(4);
                    byte[] bArr3 = zi4Var2.a;
                    bArr3[0] = (byte) ((i15 >> 24) & 255);
                    bArr3[1] = (byte) ((i15 >> 16) & 255);
                    bArr3[i2] = (byte) ((i15 >> 8) & 255);
                    bArr3[3] = (byte) (i15 & 255);
                    bh6Var.b(zi4Var2, 4, i2);
                    this.i0 += 4;
                }
                this.k0 = true;
            }
            int i16 = i + zi4Var.c;
            if (!"V_MPEG4/ISO/AVC".equals(oo3Var.c) && !"V_MPEGH/ISO/HEVC".equals(oo3Var.c)) {
                if (oo3Var.W != null) {
                    if (zi4Var.c != 0) {
                        z5 = false;
                    }
                    io3.B(z5);
                    oo3Var.W.c(c12Var);
                }
                while (true) {
                    int i17 = this.h0;
                    if (i17 >= i16) {
                        break;
                    }
                    int i18 = i16 - i17;
                    int a = zi4Var.a();
                    if (a > 0) {
                        f2 = Math.min(i18, a);
                        bh6Var.e(f2, zi4Var);
                    } else {
                        f2 = bh6Var.f(c12Var, i18, false);
                    }
                    this.h0 += f2;
                    this.i0 += f2;
                }
            } else {
                zi4 zi4Var5 = this.j;
                byte[] bArr4 = zi4Var5.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i19 = oo3Var.f0;
                int i20 = 4 - i19;
                while (this.h0 < i16) {
                    int i21 = this.j0;
                    if (i21 == 0) {
                        int min = Math.min(i19, zi4Var.a());
                        c12Var.readFully(bArr4, i20 + min, i19 - min);
                        if (min > 0) {
                            zi4Var.k(bArr4, i20, min);
                        }
                        this.h0 += i19;
                        zi4Var5.N(0);
                        this.j0 = zi4Var5.E();
                        zi4 zi4Var6 = this.i;
                        zi4Var6.N(0);
                        bh6Var.e(4, zi4Var6);
                        this.i0 += 4;
                    } else {
                        int a2 = zi4Var.a();
                        if (a2 > 0) {
                            f = Math.min(i21, a2);
                            bh6Var.e(f, zi4Var);
                        } else {
                            f = bh6Var.f(c12Var, i21, false);
                        }
                        this.h0 += f;
                        this.i0 += f;
                        this.j0 -= f;
                    }
                }
            }
            if ("A_VORBIS".equals(oo3Var.c)) {
                zi4 zi4Var7 = this.l;
                zi4Var7.N(0);
                bh6Var.e(4, zi4Var7);
                this.i0 += 4;
            }
            int i22 = this.i0;
            n();
            return i22;
        }
        r(c12Var, t0, i);
        int i23 = this.i0;
        n();
        return i23;
    }

    public final void r(c12 c12Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        zi4 zi4Var = this.o;
        byte[] bArr2 = zi4Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            zi4Var.getClass();
            zi4Var.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c12Var.readFully(zi4Var.a, bArr.length, i);
        zi4Var.N(0);
        zi4Var.M(length);
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
