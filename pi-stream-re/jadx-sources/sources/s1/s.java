package s1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import f1.b0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l1.a1;
import v1.v0;

/* loaded from: classes.dex */
public abstract class s extends j1.e {
    public static final byte[] V0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public int G0;
    public boolean H0;
    public final j I;
    public boolean I0;
    public final t J;
    public boolean J0;
    public final boolean K;
    public long K0;
    public final float L;
    public long L0;
    public final i1.h M;
    public boolean M0;
    public final i1.h N;
    public boolean N0;
    public final i1.h O;
    public boolean O0;
    public final g P;
    public boolean P0;
    public final MediaCodec.BufferInfo Q;
    public j1.m Q0;
    public final ArrayDeque R;
    public j1.f R0;
    public final a1 S;
    public r S0;
    public c1.v T;
    public long T0;
    public c1.v U;
    public boolean U0;
    public o1.k V;
    public o1.k W;
    public MediaCrypto X;
    public boolean Y;
    public final long Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f9818a0;

    /* renamed from: b0, reason: collision with root package name */
    public k f9819b0;

    /* renamed from: c0, reason: collision with root package name */
    public c1.v f9820c0;

    /* renamed from: d0, reason: collision with root package name */
    public MediaFormat f9821d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f9822e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f9823f0;

    /* renamed from: g0, reason: collision with root package name */
    public ArrayDeque f9824g0;

    /* renamed from: h0, reason: collision with root package name */
    public q f9825h0;

    /* renamed from: i0, reason: collision with root package name */
    public n f9826i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f9827j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f9828k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f9829l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f9830m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f9831n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f9832o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f9833p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f9834q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f9835r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f9836s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f9837t0;

    /* renamed from: u0, reason: collision with root package name */
    public long f9838u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f9839v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f9840w0;

    /* renamed from: x0, reason: collision with root package name */
    public ByteBuffer f9841x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f9842y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f9843z0;

    public s(int i10, j jVar, t tVar, boolean z9, float f10) {
        super(i10);
        this.I = jVar;
        tVar.getClass();
        this.J = tVar;
        this.K = z9;
        this.L = f10;
        this.M = new i1.h(0);
        this.N = new i1.h(0);
        this.O = new i1.h(2);
        g gVar = new g();
        this.P = gVar;
        this.Q = new MediaCodec.BufferInfo();
        this.f9818a0 = 1.0f;
        this.Z = -9223372036854775807L;
        this.R = new ArrayDeque();
        this.S0 = r.f9813e;
        gVar.j(0);
        gVar.f5262e.order(ByteOrder.nativeOrder());
        this.S = new a1();
        this.f9823f0 = -1.0f;
        this.f9827j0 = 0;
        this.E0 = 0;
        this.f9839v0 = -1;
        this.f9840w0 = -1;
        this.f9838u0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.F0 = 0;
        this.G0 = 0;
        this.R0 = new j1.f();
    }

    @Override // j1.e
    public final int B(c1.v vVar) {
        try {
            return t0(this.J, vVar);
        } catch (w e10) {
            throw n(e10, vVar);
        }
    }

    @Override // j1.e
    public final int C() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x00ba, code lost:
    
        r7 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0309 A[ADDED_TO_REGION, EDGE_INSN: B:118:0x0309->B:104:0x0309 BREAK  A[LOOP:0: B:23:0x009a->B:102:0x0305], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e9  */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.s.D(long, long):boolean");
    }

    public abstract j1.g E(n nVar, c1.v vVar, c1.v vVar2);

    public m F(IllegalStateException illegalStateException, n nVar) {
        return new m(illegalStateException, nVar);
    }

    public final void G() {
        this.C0 = false;
        this.P.h();
        this.O.h();
        this.B0 = false;
        this.A0 = false;
        a1 a1Var = this.S;
        a1Var.getClass();
        a1Var.f6614a = d1.d.f3045a;
        a1Var.f6616c = 0;
        a1Var.f6615b = 2;
    }

    public final boolean H() {
        if (this.H0) {
            this.F0 = 1;
            if (!this.f9829l0 && !this.f9831n0) {
                this.G0 = 2;
            } else {
                this.G0 = 3;
                return false;
            }
        } else {
            v0();
        }
        return true;
    }

    public final boolean I(long j4, long j10) {
        boolean z9;
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        boolean i02;
        boolean z12;
        ByteBuffer byteBuffer;
        int i10;
        int i11;
        long j11;
        boolean z13;
        boolean z14;
        c1.v vVar;
        int e10;
        boolean z15;
        boolean z16;
        k kVar = this.f9819b0;
        kVar.getClass();
        if (this.f9840w0 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.Q;
        if (!z9) {
            if (this.f9832o0 && this.I0) {
                try {
                    e10 = kVar.e(bufferInfo2);
                } catch (IllegalStateException unused) {
                    h0();
                    if (this.N0) {
                        k0();
                    }
                    return false;
                }
            } else {
                e10 = kVar.e(bufferInfo2);
            }
            if (e10 < 0) {
                if (e10 == -2) {
                    this.J0 = true;
                    k kVar2 = this.f9819b0;
                    kVar2.getClass();
                    MediaFormat j12 = kVar2.j();
                    if (this.f9827j0 != 0 && j12.getInteger("width") == 32 && j12.getInteger("height") == 32) {
                        this.f9836s0 = true;
                    } else {
                        if (this.f9834q0) {
                            j12.setInteger("channel-count", 1);
                        }
                        this.f9821d0 = j12;
                        this.f9822e0 = true;
                    }
                    return true;
                }
                if (this.f9837t0 && (this.M0 || this.F0 == 2)) {
                    h0();
                }
                return false;
            }
            if (this.f9836s0) {
                this.f9836s0 = false;
                kVar.g(e10, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                h0();
                return false;
            }
            this.f9840w0 = e10;
            ByteBuffer m5 = kVar.m(e10);
            this.f9841x0 = m5;
            if (m5 != null) {
                m5.position(bufferInfo2.offset);
                this.f9841x0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f9833p0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.K0 != -9223372036854775807L) {
                bufferInfo2.presentationTimeUs = this.L0;
            }
            long j13 = bufferInfo2.presentationTimeUs;
            if (j13 < this.C) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f9842y0 = z15;
            long j14 = this.L0;
            if (j14 != -9223372036854775807L && j14 <= j13) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.f9843z0 = z16;
            w0(j13);
        }
        if (this.f9832o0 && this.I0) {
            try {
                byteBuffer = this.f9841x0;
                i10 = this.f9840w0;
                i11 = bufferInfo2.flags;
                j11 = bufferInfo2.presentationTimeUs;
                z13 = this.f9842y0;
                z14 = this.f9843z0;
                vVar = this.U;
                vVar.getClass();
                z10 = false;
                z11 = true;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                i02 = i0(j4, j10, kVar, byteBuffer, i10, i11, 1, j11, z13, z14, vVar);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                h0();
                if (this.N0) {
                    k0();
                }
                return z10;
            }
        } else {
            z10 = false;
            z11 = true;
            ByteBuffer byteBuffer2 = this.f9841x0;
            int i12 = this.f9840w0;
            int i13 = bufferInfo2.flags;
            long j15 = bufferInfo2.presentationTimeUs;
            boolean z17 = this.f9842y0;
            boolean z18 = this.f9843z0;
            c1.v vVar2 = this.U;
            vVar2.getClass();
            bufferInfo = bufferInfo2;
            i02 = i0(j4, j10, kVar, byteBuffer2, i12, i13, 1, j15, z17, z18, vVar2);
        }
        if (i02) {
            d0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z12 = z11;
            } else {
                z12 = z10;
            }
            this.f9840w0 = -1;
            this.f9841x0 = null;
            if (!z12) {
                return z11;
            }
            h0();
        }
        return z10;
    }

    public final boolean J() {
        k kVar = this.f9819b0;
        if (kVar == null || this.F0 == 2 || this.M0) {
            return false;
        }
        int i10 = this.f9839v0;
        i1.h hVar = this.N;
        if (i10 < 0) {
            int o = kVar.o();
            this.f9839v0 = o;
            if (o < 0) {
                return false;
            }
            hVar.f5262e = kVar.k(o);
            hVar.h();
        }
        if (this.F0 == 1) {
            if (!this.f9837t0) {
                this.I0 = true;
                kVar.d(this.f9839v0, 0, 0L, 4);
                this.f9839v0 = -1;
                hVar.f5262e = null;
            }
            this.F0 = 2;
            return false;
        }
        if (this.f9835r0) {
            this.f9835r0 = false;
            ByteBuffer byteBuffer = hVar.f5262e;
            byteBuffer.getClass();
            byteBuffer.put(V0);
            kVar.d(this.f9839v0, 38, 0L, 0);
            this.f9839v0 = -1;
            hVar.f5262e = null;
            this.H0 = true;
            return true;
        }
        if (this.E0 == 1) {
            int i11 = 0;
            while (true) {
                c1.v vVar = this.f9820c0;
                vVar.getClass();
                if (i11 >= vVar.o.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f9820c0.o.get(i11);
                ByteBuffer byteBuffer2 = hVar.f5262e;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i11++;
            }
            this.E0 = 2;
        }
        ByteBuffer byteBuffer3 = hVar.f5262e;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        androidx.appcompat.widget.a0 a0Var = this.f5708c;
        a0Var.G();
        try {
            int y9 = y(a0Var, hVar, 0);
            if (y9 == -3) {
                if (o()) {
                    this.L0 = this.K0;
                }
                return false;
            }
            if (y9 == -5) {
                if (this.E0 == 2) {
                    hVar.h();
                    this.E0 = 1;
                }
                a0(a0Var);
                return true;
            }
            if (hVar.g(4)) {
                this.L0 = this.K0;
                if (this.E0 == 2) {
                    hVar.h();
                    this.E0 = 1;
                }
                this.M0 = true;
                if (!this.H0) {
                    h0();
                    return false;
                }
                try {
                    if (!this.f9837t0) {
                        this.I0 = true;
                        kVar.d(this.f9839v0, 0, 0L, 4);
                        this.f9839v0 = -1;
                        hVar.f5262e = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw m(b0.u(e10.getErrorCode()), this.T, e10, false);
                }
            }
            if (!this.H0 && !hVar.g(1)) {
                hVar.h();
                if (this.E0 == 2) {
                    this.E0 = 1;
                }
                return true;
            }
            boolean g10 = hVar.g(1073741824);
            if (g10) {
                i1.d dVar = hVar.f5261d;
                if (position == 0) {
                    dVar.getClass();
                } else {
                    if (dVar.f5253d == null) {
                        int[] iArr = new int[1];
                        dVar.f5253d = iArr;
                        dVar.f5258i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = dVar.f5253d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.f9828k0 && !g10) {
                ByteBuffer byteBuffer4 = hVar.f5262e;
                byteBuffer4.getClass();
                byte[] bArr2 = g1.g.f4335a;
                int position2 = byteBuffer4.position();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int i14 = i12 + 1;
                    if (i14 < position2) {
                        int i15 = byteBuffer4.get(i12) & 255;
                        if (i13 == 3) {
                            if (i15 == 1 && (byteBuffer4.get(i14) & 31) == 7) {
                                ByteBuffer duplicate = byteBuffer4.duplicate();
                                duplicate.position(i12 - 3);
                                duplicate.limit(position2);
                                byteBuffer4.position(0);
                                byteBuffer4.put(duplicate);
                                break;
                            }
                        } else if (i15 == 0) {
                            i13++;
                        }
                        if (i15 != 0) {
                            i13 = 0;
                        }
                        i12 = i14;
                    } else {
                        byteBuffer4.clear();
                        break;
                    }
                }
                ByteBuffer byteBuffer5 = hVar.f5262e;
                byteBuffer5.getClass();
                if (byteBuffer5.position() == 0) {
                    return true;
                }
                this.f9828k0 = false;
            }
            long j4 = hVar.f5264x;
            if (this.O0) {
                ArrayDeque arrayDeque = this.R;
                if (!arrayDeque.isEmpty()) {
                    c.j jVar = ((r) arrayDeque.peekLast()).f9817d;
                    c1.v vVar2 = this.T;
                    vVar2.getClass();
                    jVar.a(vVar2, j4);
                } else {
                    c.j jVar2 = this.S0.f9817d;
                    c1.v vVar3 = this.T;
                    vVar3.getClass();
                    jVar2.a(vVar3, j4);
                }
                this.O0 = false;
            }
            this.K0 = Math.max(this.K0, j4);
            if (o() || hVar.g(536870912)) {
                this.L0 = this.K0;
            }
            hVar.k();
            if (hVar.g(268435456)) {
                S(hVar);
            }
            f0(hVar);
            int N = N(hVar);
            try {
                if (g10) {
                    kVar.b(this.f9839v0, hVar.f5261d, j4, N);
                } else {
                    int i16 = this.f9839v0;
                    ByteBuffer byteBuffer6 = hVar.f5262e;
                    byteBuffer6.getClass();
                    kVar.d(i16, byteBuffer6.limit(), j4, N);
                }
                this.f9839v0 = -1;
                hVar.f5262e = null;
                this.H0 = true;
                this.E0 = 0;
                this.R0.f5721c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw m(b0.u(e11.getErrorCode()), this.T, e11, false);
            }
        } catch (i1.g e12) {
            X(e12);
            j0(0);
            K();
            return true;
        }
    }

    public final void K() {
        try {
            k kVar = this.f9819b0;
            w7.b.w(kVar);
            kVar.flush();
        } finally {
            m0();
        }
    }

    public final boolean L() {
        boolean z9;
        if (this.f9819b0 == null) {
            return false;
        }
        int i10 = this.G0;
        if (i10 != 3 && !this.f9829l0 && ((!this.f9830m0 || this.J0) && (!this.f9831n0 || !this.I0))) {
            if (i10 == 2) {
                int i11 = b0.f3799a;
                if (i11 >= 23) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                w7.b.u(z9);
                if (i11 >= 23) {
                    try {
                        v0();
                    } catch (j1.m e10) {
                        f1.o.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                        k0();
                        return true;
                    }
                }
            }
            K();
            return false;
        }
        k0();
        return true;
    }

    public final List M(boolean z9) {
        c1.v vVar = this.T;
        vVar.getClass();
        t tVar = this.J;
        ArrayList Q = Q(tVar, vVar, z9);
        if (Q.isEmpty() && z9) {
            Q = Q(tVar, vVar, false);
            if (!Q.isEmpty()) {
                f1.o.f("MediaCodecRenderer", "Drm session requires secure decoder for " + vVar.f1935m + ", but no secure decoder available. Trying to proceed with " + Q + ".");
            }
        }
        return Q;
    }

    public int N(i1.h hVar) {
        return 0;
    }

    public boolean O() {
        return false;
    }

    public abstract float P(float f10, c1.v[] vVarArr);

    public abstract ArrayList Q(t tVar, c1.v vVar, boolean z9);

    public abstract i R(n nVar, c1.v vVar, MediaCrypto mediaCrypto, float f10);

    public abstract void S(i1.h hVar);

    /* JADX WARN: Code restructure failed: missing block: B:312:0x0476, code lost:
    
        if ("stvm8".equals(r5) == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0486, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r3) == false) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(s1.n r19, android.media.MediaCrypto r20) {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.s.T(s1.n, android.media.MediaCrypto):void");
    }

    public final boolean U(long j4, long j10) {
        boolean z9;
        if (j10 >= j4) {
            return false;
        }
        c1.v vVar = this.U;
        if (vVar != null && Objects.equals(vVar.f1935m, "audio/opus")) {
            if (j4 - j10 <= 80000) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        if (r5 != 4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        if (r2 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
    
        if (r0.f() != null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.s.V():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(android.media.MediaCrypto r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.s.W(android.media.MediaCrypto, boolean):void");
    }

    public abstract void X(Exception exc);

    public abstract void Y(String str, long j4, long j10);

    public abstract void Z(String str);

    @Override // j1.g1
    public boolean a() {
        boolean a10;
        boolean z9;
        if (this.T == null) {
            return false;
        }
        if (o()) {
            a10 = this.E;
        } else {
            v0 v0Var = this.f5714z;
            v0Var.getClass();
            a10 = v0Var.a();
        }
        if (!a10) {
            if (this.f9840w0 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                if (this.f9838u0 == -9223372036854775807L) {
                    return false;
                }
                this.f5712x.getClass();
                if (SystemClock.elapsedRealtime() >= this.f9838u0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x013d, code lost:
    
        if (H() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0151, code lost:
    
        if (H() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0169, code lost:
    
        if (r0 == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r2 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010a, code lost:
    
        if (H() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j1.g a0(androidx.appcompat.widget.a0 r13) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.s.a0(androidx.appcompat.widget.a0):j1.g");
    }

    public abstract void b0(c1.v vVar, MediaFormat mediaFormat);

    public void c0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    @Override // j1.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(long r6, long r8) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.s.d(long, long):void");
    }

    public void d0(long j4) {
        this.T0 = j4;
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (!arrayDeque.isEmpty() && j4 >= ((r) arrayDeque.peek()).f9814a) {
                r rVar = (r) arrayDeque.poll();
                rVar.getClass();
                p0(rVar);
                e0();
            } else {
                return;
            }
        }
    }

    public abstract void e0();

    public void f0(i1.h hVar) {
    }

    public void g0(c1.v vVar) {
    }

    public final void h0() {
        int i10 = this.G0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.N0 = true;
                    l0();
                    return;
                } else {
                    k0();
                    V();
                    return;
                }
            }
            K();
            v0();
            return;
        }
        K();
    }

    public abstract boolean i0(long j4, long j10, k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z9, boolean z10, c1.v vVar);

    public final boolean j0(int i10) {
        androidx.appcompat.widget.a0 a0Var = this.f5708c;
        a0Var.G();
        i1.h hVar = this.M;
        hVar.h();
        int y9 = y(a0Var, hVar, i10 | 4);
        if (y9 == -5) {
            a0(a0Var);
            return true;
        }
        if (y9 == -4 && hVar.g(4)) {
            this.M0 = true;
            h0();
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0() {
        try {
            k kVar = this.f9819b0;
            if (kVar != null) {
                kVar.a();
                this.R0.f5720b++;
                n nVar = this.f9826i0;
                nVar.getClass();
                Z(nVar.f9801a);
            }
            this.f9819b0 = null;
            try {
                MediaCrypto mediaCrypto = this.X;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f9819b0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.X;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // j1.e, j1.g1
    public void l(float f10, float f11) {
        this.f9818a0 = f11;
        u0(this.f9820c0);
    }

    public void l0() {
    }

    public void m0() {
        this.f9839v0 = -1;
        this.N.f5262e = null;
        this.f9840w0 = -1;
        this.f9841x0 = null;
        this.f9838u0 = -9223372036854775807L;
        this.I0 = false;
        this.H0 = false;
        this.f9835r0 = false;
        this.f9836s0 = false;
        this.f9842y0 = false;
        this.f9843z0 = false;
        this.K0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.F0 = 0;
        this.G0 = 0;
        this.E0 = this.D0 ? 1 : 0;
    }

    public final void n0() {
        m0();
        this.Q0 = null;
        this.f9824g0 = null;
        this.f9826i0 = null;
        this.f9820c0 = null;
        this.f9821d0 = null;
        this.f9822e0 = false;
        this.J0 = false;
        this.f9823f0 = -1.0f;
        this.f9827j0 = 0;
        this.f9828k0 = false;
        this.f9829l0 = false;
        this.f9830m0 = false;
        this.f9831n0 = false;
        this.f9832o0 = false;
        this.f9833p0 = false;
        this.f9834q0 = false;
        this.f9837t0 = false;
        this.D0 = false;
        this.E0 = 0;
        this.Y = false;
    }

    public final void o0(o1.k kVar) {
        o1.k kVar2 = this.V;
        if (kVar2 != kVar) {
            if (kVar != null) {
                kVar.d(null);
            }
            if (kVar2 != null) {
                kVar2.a(null);
            }
        }
        this.V = kVar;
    }

    @Override // j1.e
    public void p() {
        this.T = null;
        p0(r.f9813e);
        this.R.clear();
        L();
    }

    public final void p0(r rVar) {
        this.S0 = rVar;
        if (rVar.f9816c != -9223372036854775807L) {
            this.U0 = true;
            c0();
        }
    }

    public final boolean q0(long j4) {
        long j10 = this.Z;
        if (j10 != -9223372036854775807L) {
            this.f5712x.getClass();
            if (SystemClock.elapsedRealtime() - j4 >= j10) {
                return false;
            }
        }
        return true;
    }

    public boolean r0(n nVar) {
        return true;
    }

    @Override // j1.e
    public void s(long j4, boolean z9) {
        int i10;
        this.M0 = false;
        this.N0 = false;
        this.P0 = false;
        if (this.A0) {
            this.P.h();
            this.O.h();
            this.B0 = false;
            a1 a1Var = this.S;
            a1Var.getClass();
            a1Var.f6614a = d1.d.f3045a;
            a1Var.f6616c = 0;
            a1Var.f6615b = 2;
        } else if (L()) {
            V();
        }
        c.j jVar = this.S0.f9817d;
        synchronized (jVar) {
            i10 = jVar.f1595b;
        }
        if (i10 > 0) {
            this.O0 = true;
        }
        this.S0.f9817d.b();
        this.R.clear();
    }

    public boolean s0(c1.v vVar) {
        return false;
    }

    public abstract int t0(t tVar, c1.v vVar);

    public final boolean u0(c1.v vVar) {
        if (b0.f3799a >= 23 && this.f9819b0 != null && this.G0 != 3 && this.f5713y != 0) {
            float f10 = this.f9818a0;
            vVar.getClass();
            c1.v[] vVarArr = this.A;
            vVarArr.getClass();
            float P = P(f10, vVarArr);
            float f11 = this.f9823f0;
            if (f11 == P) {
                return true;
            }
            if (P == -1.0f) {
                if (this.H0) {
                    this.F0 = 1;
                    this.G0 = 3;
                    return false;
                }
                k0();
                V();
                return false;
            }
            if (f11 == -1.0f && P <= this.L) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", P);
            k kVar = this.f9819b0;
            kVar.getClass();
            kVar.c(bundle);
            this.f9823f0 = P;
        }
        return true;
    }

    public final void v0() {
        o1.k kVar = this.W;
        kVar.getClass();
        i1.b g10 = kVar.g();
        if (g10 instanceof o1.z) {
            try {
                MediaCrypto mediaCrypto = this.X;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((o1.z) g10).f8174b);
            } catch (MediaCryptoException e10) {
                throw m(6006, this.T, e10, false);
            }
        }
        o0(this.W);
        this.F0 = 0;
        this.G0 = 0;
    }

    public final void w0(long j4) {
        boolean z9;
        Object obj;
        c1.v vVar = (c1.v) this.S0.f9817d.f(j4);
        if (vVar == null && this.U0 && this.f9821d0 != null) {
            c.j jVar = this.S0.f9817d;
            synchronized (jVar) {
                if (jVar.f1595b == 0) {
                    obj = null;
                } else {
                    obj = jVar.g();
                }
            }
            vVar = (c1.v) obj;
        }
        if (vVar != null) {
            this.U = vVar;
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 || (this.f9822e0 && this.U != null)) {
            c1.v vVar2 = this.U;
            vVar2.getClass();
            b0(vVar2, this.f9821d0);
            this.f9822e0 = false;
            this.U0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r7 >= r5) goto L13;
     */
    @Override // j1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(c1.v[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            s1.r r1 = r0.S0
            long r1 = r1.f9816c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            s1.r r1 = new s1.r
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.p0(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.R
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.K0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.T0
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            s1.r r1 = new s1.r
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.p0(r1)
            s1.r r1 = r0.S0
            long r1 = r1.f9816c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L63
            r12.e0()
            goto L63
        L55:
            s1.r r9 = new s1.r
            long r3 = r0.K0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.s.x(c1.v[], long, long):void");
    }
}
