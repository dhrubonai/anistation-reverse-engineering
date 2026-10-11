package u2;

import a3.g;
import android.util.SparseArray;
import c1.r0;
import d0.h;
import d2.g0;
import d2.h0;
import d2.p;
import d2.q;
import d2.r;
import f.p0;
import f1.b0;
import f1.t;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import y2.k;
import y2.n;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f10159e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f10160f0 = b0.G("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f10161g0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f10162h0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: i0, reason: collision with root package name */
    public static final UUID f10163i0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: j0, reason: collision with root package name */
    public static final Map f10164j0;
    public boolean A;
    public long B;
    public long C;
    public long D;
    public h E;
    public h F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public long T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f10165a;

    /* renamed from: a0, reason: collision with root package name */
    public int f10166a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f10167b;

    /* renamed from: b0, reason: collision with root package name */
    public byte f10168b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f10169c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f10170c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10171d;

    /* renamed from: d0, reason: collision with root package name */
    public r f10172d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10173e;

    /* renamed from: f, reason: collision with root package name */
    public final k f10174f;

    /* renamed from: g, reason: collision with root package name */
    public final t f10175g;

    /* renamed from: h, reason: collision with root package name */
    public final t f10176h;

    /* renamed from: i, reason: collision with root package name */
    public final t f10177i;

    /* renamed from: j, reason: collision with root package name */
    public final t f10178j;

    /* renamed from: k, reason: collision with root package name */
    public final t f10179k;

    /* renamed from: l, reason: collision with root package name */
    public final t f10180l;

    /* renamed from: m, reason: collision with root package name */
    public final t f10181m;

    /* renamed from: n, reason: collision with root package name */
    public final t f10182n;
    public final t o;

    /* renamed from: p, reason: collision with root package name */
    public final t f10183p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f10184q;

    /* renamed from: r, reason: collision with root package name */
    public long f10185r;

    /* renamed from: s, reason: collision with root package name */
    public long f10186s;

    /* renamed from: t, reason: collision with root package name */
    public long f10187t;

    /* renamed from: u, reason: collision with root package name */
    public long f10188u;

    /* renamed from: v, reason: collision with root package name */
    public long f10189v;

    /* renamed from: w, reason: collision with root package name */
    public c f10190w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10191x;

    /* renamed from: y, reason: collision with root package name */
    public int f10192y;

    /* renamed from: z, reason: collision with root package name */
    public long f10193z;

    static {
        HashMap hashMap = new HashMap();
        g.x(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f10164j0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i10, k kVar) {
        boolean z9;
        b bVar = new b();
        this.f10186s = -1L;
        this.f10187t = -9223372036854775807L;
        this.f10188u = -9223372036854775807L;
        this.f10189v = -9223372036854775807L;
        this.B = -1L;
        this.C = -1L;
        this.D = -9223372036854775807L;
        this.f10165a = bVar;
        bVar.f10130d = new p0(this);
        this.f10174f = kVar;
        if ((i10 & 1) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f10171d = z9;
        this.f10173e = (i10 & 2) == 0;
        this.f10167b = new e();
        this.f10169c = new SparseArray();
        this.f10177i = new t(4);
        this.f10178j = new t(ByteBuffer.allocate(4).putInt(-1).array());
        this.f10179k = new t(4);
        this.f10175g = new t(g1.g.f4335a);
        this.f10176h = new t(4);
        this.f10180l = new t();
        this.f10181m = new t();
        this.f10182n = new t(8);
        this.o = new t();
        this.f10183p = new t();
        this.N = new int[1];
    }

    public static byte[] k(String str, long j4, long j10) {
        boolean z9;
        if (j4 != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        int i10 = (int) (j4 / 3600000000L);
        long j11 = j4 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - ((i11 * 60) * 1000000);
        int i12 = (int) (j12 / 1000000);
        return b0.G(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (i12 * 1000000)) / j10))));
    }

    @Override // d2.p
    public final void a() {
    }

    public final void b(int i10) {
        if (this.E != null && this.F != null) {
            return;
        }
        throw r0.a("Element " + i10 + " must be in a Cues", null);
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    public final void d(int i10) {
        if (this.f10190w != null) {
            return;
        }
        throw r0.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        this.D = -9223372036854775807L;
        this.I = 0;
        b bVar = this.f10165a;
        bVar.f10131e = 0;
        bVar.f10128b.clear();
        e eVar = bVar.f10129c;
        eVar.f10196b = 0;
        eVar.f10197c = 0;
        e eVar2 = this.f10167b;
        eVar2.f10196b = 0;
        eVar2.f10197c = 0;
        m();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f10169c;
            if (i10 < sparseArray.size()) {
                h0 h0Var = ((c) sparseArray.valueAt(i10)).U;
                if (h0Var != null) {
                    h0Var.f3146b = false;
                    h0Var.f3147c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f10172d0 = rVar;
        if (this.f10173e) {
            rVar = new n(rVar, this.f10174f);
        }
        this.f10172d0 = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5 A[EDGE_INSN: B:50:0x00d5->B:49:0x00d5 BREAK  A[LOOP:0: B:42:0x00c4->B:46:0x00d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(u2.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.g(u2.c, long, int, int, int):void");
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        h hVar = new h(4);
        long c6 = qVar.c();
        long j4 = 1024;
        if (c6 != -1 && c6 <= 1024) {
            j4 = c6;
        }
        int i10 = (int) j4;
        qVar.n(((t) hVar.f3027b).f3858a, 0, 4);
        hVar.f3026a = 4;
        for (long w9 = ((t) hVar.f3027b).w(); w9 != 440786851; w9 = ((w9 << 8) & (-256)) | (((t) hVar.f3027b).f3858a[0] & 255)) {
            int i11 = hVar.f3026a + 1;
            hVar.f3026a = i11;
            if (i11 == i10) {
                return false;
            }
            qVar.n(((t) hVar.f3027b).f3858a, 0, 1);
        }
        long o = hVar.o(qVar);
        long j10 = hVar.f3026a;
        if (o == Long.MIN_VALUE) {
            return false;
        }
        if (c6 != -1 && j10 + o >= c6) {
            return false;
        }
        while (true) {
            long j11 = hVar.f3026a;
            long j12 = j10 + o;
            if (j11 < j12) {
                if (hVar.o(qVar) == Long.MIN_VALUE) {
                    return false;
                }
                long o6 = hVar.o(qVar);
                if (o6 < 0 || o6 > 2147483647L) {
                    return false;
                }
                if (o6 != 0) {
                    int i12 = (int) o6;
                    qVar.o(i12);
                    hVar.f3026a += i12;
                }
            } else {
                if (j11 != j12) {
                    return false;
                }
                return true;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01f1, code lost:
    
        r5 = true;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x094e, code lost:
    
        if (r5 == false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0950, code lost:
    
        r6 = r37.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0956, code lost:
    
        if (r36.A == false) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0958, code lost:
    
        r36.C = r6;
        r38.f3191a = r36.B;
        r36.A = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0971, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0974, code lost:
    
        if (r4 == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0976, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0471, code lost:
    
        throw c1.r0.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0963, code lost:
    
        if (r36.f10191x == false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0965, code lost:
    
        r3 = r36.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x096b, code lost:
    
        if (r3 == (-1)) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x096d, code lost:
    
        r38.f3191a = r3;
        r36.C = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0973, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x073f, code lost:
    
        throw c1.r0.a("DocTypeReadVersion " + r10 + " not supported", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x098f, code lost:
    
        if (r5 != false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0991, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0992, code lost:
    
        r1 = r36.f10169c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0998, code lost:
    
        if (r3 >= r1.size()) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x099a, code lost:
    
        r1 = (u2.c) r1.valueAt(r3);
        r1.Y.getClass();
        r2 = r1.U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x09a7, code lost:
    
        if (r2 == null) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x09a9, code lost:
    
        r2.a(r1.Y, r1.f10143j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x09b0, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x09b3, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x09b5, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r37, d2.t r38) {
        /*
            Method dump skipped, instructions count: 3044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.i(d2.q, d2.t):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0863, code lost:
    
        if (r0.o() == r3.getLeastSignificantBits()) goto L489;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x0522. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0890  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.RuntimeException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r35) {
        /*
            Method dump skipped, instructions count: 3372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.j(int):void");
    }

    public final void l(q qVar, int i10) {
        t tVar = this.f10177i;
        if (tVar.f3860c >= i10) {
            return;
        }
        byte[] bArr = tVar.f3858a;
        if (bArr.length < i10) {
            tVar.a(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = tVar.f3858a;
        int i11 = tVar.f3860c;
        qVar.readFully(bArr2, i11, i10 - i11);
        tVar.F(i10);
    }

    public final void m() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f10166a0 = 0;
        this.f10168b0 = (byte) 0;
        this.f10170c0 = false;
        this.f10180l.D(0);
    }

    public final long n(long j4) {
        long j10 = this.f10187t;
        if (j10 != -9223372036854775807L) {
            return b0.V(j4, j10, 1000L);
        }
        throw r0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int o(q qVar, c cVar, int i10, boolean z9) {
        int c6;
        int c10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f10135b)) {
            p(qVar, f10159e0, i10);
            int i12 = this.V;
            m();
            return i12;
        }
        if ("S_TEXT/ASS".equals(cVar.f10135b)) {
            p(qVar, f10161g0, i10);
            int i13 = this.V;
            m();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f10135b)) {
            p(qVar, f10162h0, i10);
            int i14 = this.V;
            m();
            return i14;
        }
        g0 g0Var = cVar.Y;
        boolean z13 = this.X;
        boolean z14 = true;
        t tVar = this.f10180l;
        if (!z13) {
            boolean z15 = cVar.f10141h;
            t tVar2 = this.f10177i;
            if (z15) {
                this.Q &= -1073741825;
                int i15 = 128;
                if (!this.Y) {
                    qVar.readFully(tVar2.f3858a, 0, 1);
                    this.U++;
                    byte b10 = tVar2.f3858a[0];
                    if ((b10 & 128) != 128) {
                        this.f10168b0 = b10;
                        this.Y = true;
                    } else {
                        throw r0.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b11 = this.f10168b0;
                if ((b11 & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if ((b11 & 2) == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.Q |= 1073741824;
                    if (!this.f10170c0) {
                        t tVar3 = this.f10182n;
                        qVar.readFully(tVar3.f3858a, 0, 8);
                        this.U += 8;
                        this.f10170c0 = true;
                        byte[] bArr = tVar2.f3858a;
                        if (!z12) {
                            i15 = 0;
                        }
                        bArr[0] = (byte) (i15 | 8);
                        tVar2.G(0);
                        g0Var.e(1, 1, tVar2);
                        this.V++;
                        tVar3.G(0);
                        g0Var.e(8, 1, tVar3);
                        this.V += 8;
                    }
                    if (z12) {
                        if (!this.Z) {
                            qVar.readFully(tVar2.f3858a, 0, 1);
                            this.U++;
                            tVar2.G(0);
                            this.f10166a0 = tVar2.v();
                            this.Z = true;
                        }
                        int i16 = this.f10166a0 * 4;
                        tVar2.D(i16);
                        qVar.readFully(tVar2.f3858a, 0, i16);
                        this.U += i16;
                        short s9 = (short) ((this.f10166a0 / 2) + 1);
                        int i17 = (s9 * 6) + 2;
                        ByteBuffer byteBuffer = this.f10184q;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.f10184q = ByteBuffer.allocate(i17);
                        }
                        this.f10184q.position(0);
                        this.f10184q.putShort(s9);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i11 = this.f10166a0;
                            if (i18 >= i11) {
                                break;
                            }
                            int y9 = tVar2.y();
                            if (i18 % 2 == 0) {
                                this.f10184q.putShort((short) (y9 - i19));
                            } else {
                                this.f10184q.putInt(y9 - i19);
                            }
                            i18++;
                            i19 = y9;
                        }
                        int i20 = (i10 - this.U) - i19;
                        if (i11 % 2 == 1) {
                            this.f10184q.putInt(i20);
                        } else {
                            this.f10184q.putShort((short) i20);
                            this.f10184q.putInt(0);
                        }
                        byte[] array = this.f10184q.array();
                        t tVar4 = this.o;
                        tVar4.E(array, i17);
                        g0Var.e(i17, 1, tVar4);
                        this.V += i17;
                    }
                }
            } else {
                byte[] bArr2 = cVar.f10142i;
                if (bArr2 != null) {
                    tVar.E(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(cVar.f10135b)) {
                z10 = z9;
            } else if (cVar.f10139f > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.Q |= 268435456;
                this.f10183p.D(0);
                int i21 = (tVar.f3860c + i10) - this.U;
                tVar2.D(4);
                byte[] bArr3 = tVar2.f3858a;
                bArr3[0] = (byte) ((i21 >> 24) & 255);
                bArr3[1] = (byte) ((i21 >> 16) & 255);
                bArr3[2] = (byte) ((i21 >> 8) & 255);
                bArr3[3] = (byte) (i21 & 255);
                g0Var.e(4, 2, tVar2);
                this.V += 4;
            }
            this.X = true;
        }
        int i22 = i10 + tVar.f3860c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f10135b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f10135b)) {
            if (cVar.U != null) {
                if (tVar.f3860c != 0) {
                    z14 = false;
                }
                w7.b.u(z14);
                cVar.U.c(qVar);
            }
            while (true) {
                int i23 = this.U;
                if (i23 >= i22) {
                    break;
                }
                int i24 = i22 - i23;
                int i25 = tVar.f3860c - tVar.f3859b;
                if (i25 > 0) {
                    c10 = Math.min(i24, i25);
                    g0Var.f(c10, tVar);
                } else {
                    c10 = g0Var.c(qVar, i24, false);
                }
                this.U += c10;
                this.V += c10;
            }
        } else {
            t tVar5 = this.f10176h;
            byte[] bArr4 = tVar5.f3858a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i26 = cVar.Z;
            int i27 = 4 - i26;
            while (this.U < i22) {
                int i28 = this.W;
                if (i28 == 0) {
                    int min = Math.min(i26, tVar.f3860c - tVar.f3859b);
                    qVar.readFully(bArr4, i27 + min, i26 - min);
                    if (min > 0) {
                        tVar.d(bArr4, i27, min);
                    }
                    this.U += i26;
                    tVar5.G(0);
                    this.W = tVar5.y();
                    t tVar6 = this.f10175g;
                    tVar6.G(0);
                    g0Var.f(4, tVar6);
                    this.V += 4;
                } else {
                    int i29 = tVar.f3860c - tVar.f3859b;
                    if (i29 > 0) {
                        c6 = Math.min(i28, i29);
                        g0Var.f(c6, tVar);
                    } else {
                        c6 = g0Var.c(qVar, i28, false);
                    }
                    this.U += c6;
                    this.V += c6;
                    this.W -= c6;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f10135b)) {
            t tVar7 = this.f10178j;
            tVar7.G(0);
            g0Var.f(4, tVar7);
            this.V += 4;
        }
        int i30 = this.V;
        m();
        return i30;
    }

    public final void p(q qVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        t tVar = this.f10181m;
        byte[] bArr2 = tVar.f3858a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            tVar.getClass();
            tVar.E(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        qVar.readFully(tVar.f3858a, bArr.length, i10);
        tVar.G(0);
        tVar.F(length);
    }
}
