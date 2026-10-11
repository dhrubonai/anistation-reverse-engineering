package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class pp3 extends w30 {
    public static final byte[] d1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public byte F0;
    public byte G0;
    public byte H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public long L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public final Context Q;
    public boolean Q0;
    public final gp3 R;
    public yx1 R0;
    public final q61 S;
    public n61 S0;
    public final q61 T;
    public op3 T0;
    public final q61 U;
    public long U0;
    public final l50 V;
    public boolean V0;
    public final MediaCodec.BufferInfo W;
    public boolean W0;
    public final ArrayDeque X;
    public boolean X0;
    public final ed4 Y;
    public long Y0;
    public final AtomicInteger Z;
    public long Z0;
    public ea2 a0;
    public io0 a1;
    public ea2 b0;
    public io0 b1;
    public qp1 c0;
    public zw2 c1;
    public qp1 d0;
    public zy1 e0;
    public MediaCrypto f0;
    public float g0;
    public float h0;
    public hp3 i0;
    public ea2 j0;
    public MediaFormat k0;
    public boolean l0;
    public float m0;
    public ArrayDeque n0;
    public np3 o0;
    public mp3 p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public long u0;
    public boolean v0;
    public long w0;
    public int x0;
    public int y0;
    public ByteBuffer z0;

    /* JADX WARN: Type inference failed for: r3v11, types: [n61, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l50, q61] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ed4, java.lang.Object] */
    public pp3(Context context, int i, gp3 gp3Var) {
        super(i);
        this.Q = context.getApplicationContext();
        this.R = gp3Var;
        this.Z = new AtomicInteger();
        this.S = new q61(0);
        this.T = new q61(0);
        this.U = new q61(2);
        ?? q61Var = new q61(2);
        q61Var.I = (byte) 32;
        this.V = q61Var;
        this.W = new MediaCodec.BufferInfo();
        this.g0 = 1.0f;
        this.h0 = 1.0f;
        this.X = new ArrayDeque();
        this.T0 = op3.i;
        q61Var.j(0);
        q61Var.B.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.z = zv.a;
        obj.y = 0;
        obj.x = 2;
        this.Y = obj;
        this.m0 = -1.0f;
        this.F0 = (byte) 0;
        this.x0 = -1;
        this.y0 = -1;
        this.w0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.G0 = (byte) 0;
        this.H0 = (byte) 0;
        this.S0 = new Object();
        this.X0 = false;
        this.Y0 = 0L;
        this.Z0 = -9223372036854775807L;
        int i2 = zw2.z;
        this.c1 = v15.G;
        io0 io0Var = io0.b;
        this.a1 = io0Var;
        this.b1 = io0Var;
    }

    public boolean A0() {
        byte b = this.H0;
        if (b == 3 || (this.q0 && !this.K0)) {
            return true;
        }
        if (b == 2) {
            try {
                E0();
                return false;
            } catch (yx1 e) {
                kb0.P("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    public boolean B0(ea2 ea2Var) {
        return false;
    }

    @Override // defpackage.w30
    public void C(float f, float f2) {
        this.g0 = f;
        this.h0 = f2;
        D0(this.j0);
    }

    public abstract int C0(ea2 ea2Var);

    @Override // defpackage.w30
    public final int D(ea2 ea2Var) {
        try {
            return C0(ea2Var);
        } catch (sp3 e) {
            throw this.d(e, ea2Var, false, 4002);
        }
    }

    public final void D0(ea2 ea2Var) {
        if (this.i0 != null && this.H0 != 3 && this.E != 0) {
            float f = this.h0;
            ea2Var.getClass();
            ea2[] ea2VarArr = this.G;
            ea2VarArr.getClass();
            float S = S(f, ea2Var, ea2VarArr);
            float f2 = this.m0;
            if (f2 != S && S != -1.0f) {
                if (f2 != -1.0f || S > 0.0f) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", S);
                    hp3 hp3Var = this.i0;
                    hp3Var.getClass();
                    hp3Var.setParameters(bundle);
                    this.m0 = S;
                }
            }
        }
    }

    @Override // defpackage.w30
    public final int E() {
        return 8;
    }

    public final void E0() {
        qp1 qp1Var = this.d0;
        qp1Var.getClass();
        cb2 g = qp1Var.g();
        if (g != null) {
            try {
                MediaCrypto mediaCrypto = this.f0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(g.b);
            } catch (MediaCryptoException e) {
                throw d(e, this.a0, false, 6006);
            }
        }
        v0(this.d0);
        this.G0 = (byte) 0;
        this.H0 = (byte) 0;
    }

    public final void F0(long j) {
        ea2 ea2Var = (ea2) this.T0.d.s(j);
        if (ea2Var == null && this.V0 && this.k0 != null) {
            ea2Var = (ea2) this.T0.d.r();
        }
        if (ea2Var != null) {
            this.b0 = ea2Var;
        } else if (!this.l0 || (ea2Var = this.b0) == null) {
            return;
        }
        i0(ea2Var, this.k0);
        this.l0 = false;
        this.V0 = false;
    }

    public final void H(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.a1.a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(long r25, long r27) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp3.I(long, long):boolean");
    }

    public abstract s61 J(mp3 mp3Var, ea2 ea2Var, ea2 ea2Var2, boolean z);

    public lp3 K(IllegalStateException illegalStateException, mp3 mp3Var) {
        return new lp3(illegalStateException, mp3Var);
    }

    public final boolean L() {
        if (this.I0) {
            this.G0 = (byte) 1;
            if (A0()) {
                this.H0 = (byte) 3;
                return false;
            }
            this.H0 = (byte) 2;
            return true;
        }
        E0();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp3.M(long, long):boolean");
    }

    public final boolean N() {
        boolean z;
        long j;
        long j2;
        long j3;
        q61 q61Var = this.T;
        x21 x21Var = q61Var.A;
        op3 V = V();
        g95 g95Var = this.F;
        g95Var.getClass();
        V.f = g95Var.G();
        hp3 hp3Var = this.i0;
        if (hp3Var != null && this.G0 != 2 && !this.N0) {
            if (this.x0 < 0) {
                int o = hp3Var.o();
                this.x0 = o;
                if (o >= 0) {
                    q61Var.B = hp3Var.getInputBuffer(o);
                    q61Var.f();
                }
            }
            if (this.G0 == 1) {
                if (!this.t0) {
                    this.J0 = true;
                    hp3Var.d(this.x0, 0, 4, 0L);
                    this.x0 = -1;
                    q61Var.B = null;
                }
                this.G0 = (byte) 2;
                return false;
            }
            if (this.r0) {
                this.r0 = false;
                ByteBuffer byteBuffer = q61Var.B;
                byteBuffer.getClass();
                byteBuffer.put(d1);
                hp3Var.d(this.x0, 38, 0, 0L);
                this.x0 = -1;
                q61Var.B = null;
                this.I0 = true;
                return true;
            }
            if (this.F0 == 1) {
                int i = 0;
                while (true) {
                    ea2 ea2Var = this.j0;
                    ea2Var.getClass();
                    if (i >= ea2Var.s.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.j0.s.get(i);
                    ByteBuffer byteBuffer2 = q61Var.B;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i++;
                }
                this.F0 = (byte) 2;
            }
            ByteBuffer byteBuffer3 = q61Var.B;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            pz2 pz2Var = this.z;
            pz2Var.m();
            try {
                hp3Var.y(new fs0((Object) this, (Object) pz2Var, (byte) 5));
                int i2 = this.Z.get();
                if (i2 == -3) {
                    if (j()) {
                        op3 V2 = V();
                        op3 V3 = V();
                        op3 op3Var = op3.i;
                        if ((V3.f & 1) != 0) {
                            j3 = this.M0;
                        } else {
                            j3 = this.L0;
                        }
                        V2.h = j3;
                        return false;
                    }
                } else {
                    if (i2 == -5) {
                        if (this.F0 == 2) {
                            q61Var.f();
                            this.F0 = (byte) 1;
                        }
                        h0(pz2Var);
                        return true;
                    }
                    if (q61Var.d(4)) {
                        op3 V4 = V();
                        op3 V5 = V();
                        op3 op3Var2 = op3.i;
                        if ((V5.f & 1) != 0) {
                            j2 = this.M0;
                        } else {
                            j2 = this.L0;
                        }
                        V4.h = j2;
                        if (this.F0 == 2) {
                            q61Var.f();
                            this.F0 = (byte) 1;
                        }
                        this.N0 = true;
                        if (!this.I0) {
                            n0();
                            return false;
                        }
                        if (!this.t0) {
                            this.J0 = true;
                            hp3Var.d(this.x0, 0, 4, 0L);
                            this.x0 = -1;
                            q61Var.B = null;
                            return false;
                        }
                    } else {
                        if (!this.I0 && !q61Var.d(1)) {
                            q61Var.f();
                            this.S0.d++;
                            if (this.F0 == 2) {
                                this.F0 = (byte) 1;
                                return true;
                            }
                        } else {
                            long j4 = q61Var.D;
                            if (!x0(q61Var)) {
                                boolean d = q61Var.d(1073741824);
                                if (d && position != 0) {
                                    int[] iArr = x21Var.d;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                        x21Var.d = iArr;
                                        x21Var.i.numBytesOfClearData = iArr;
                                    }
                                    iArr[0] = iArr[0] + position;
                                }
                                if (this.P0) {
                                    op3 V6 = V();
                                    wp wpVar = V6.d;
                                    ea2 ea2Var2 = this.a0;
                                    ea2Var2.getClass();
                                    wpVar.a(j4, ea2Var2);
                                    V6.g = true;
                                    this.P0 = false;
                                }
                                if (this.X0) {
                                    long j5 = this.L0;
                                    z = true;
                                    long j6 = this.Y0;
                                    this.Z0 = j5 + j6;
                                    if (j4 <= j5) {
                                        this.Y0 = (j5 - j4) + 1 + j6;
                                    }
                                    this.L0 = j4;
                                    this.M0 = j4;
                                    this.X0 = false;
                                } else {
                                    z = true;
                                }
                                this.L0 = Math.max(this.L0, j4);
                                long j7 = this.O;
                                if (j7 == -9223372036854775807L || j4 - V().c < j7) {
                                    this.M0 = Math.max(this.M0, j4);
                                }
                                if (j() || q61Var.d(536870912)) {
                                    op3 V7 = V();
                                    op3 V8 = V();
                                    op3 op3Var3 = op3.i;
                                    if ((V8.f & 1) != 0) {
                                        j = this.M0;
                                    } else {
                                        j = this.L0;
                                    }
                                    V7.h = j;
                                }
                                q61Var.k();
                                if (q61Var.d(268435456)) {
                                    X(q61Var);
                                }
                                m0(q61Var);
                                int R = R(q61Var);
                                long j8 = this.Y0 + j4;
                                int i3 = this.x0;
                                if (d) {
                                    hp3Var.c(i3, x21Var, j8, R);
                                } else {
                                    ByteBuffer byteBuffer4 = q61Var.B;
                                    byteBuffer4.getClass();
                                    hp3Var.d(i3, byteBuffer4.limit(), R, j8);
                                }
                                this.x0 = -1;
                                q61Var.B = null;
                                boolean z2 = z;
                                this.I0 = z2;
                                this.F0 = (byte) 0;
                                this.S0.c += z2 ? 1 : 0;
                                return z2;
                            }
                        }
                        return true;
                    }
                }
            } catch (p61 e) {
                d0(e);
                p0(0);
                O();
                return true;
            }
        }
        return false;
    }

    public final void O() {
        try {
            hp3 hp3Var = this.i0;
            hp3Var.getClass();
            hp3Var.flush();
        } finally {
            t0();
        }
    }

    public final boolean P() {
        if (this.i0 != null) {
            if (A0()) {
                q0();
                return true;
            }
            if (y0()) {
                O();
                return false;
            }
            if (this.I0) {
                this.X0 = true;
            }
        }
        return false;
    }

    public final List Q(boolean z) {
        ea2 ea2Var = this.a0;
        ea2Var.getClass();
        ArrayList T = T(ea2Var, z);
        if (T.isEmpty() && z) {
            ArrayList T2 = T(ea2Var, false);
            if (!T2.isEmpty()) {
                kb0.O("MediaCodecRenderer", "Drm session requires secure decoder for " + ea2Var.p + ", but no secure decoder available. Trying to proceed with " + T2 + ".");
            }
            return T2;
        }
        return T;
    }

    public int R(q61 q61Var) {
        return 0;
    }

    public float S(float f, ea2 ea2Var, ea2[] ea2VarArr) {
        MediaFormat mediaFormat;
        int i = -1;
        for (ea2 ea2Var2 : ea2VarArr) {
            int i2 = ea2Var2.L;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1 && (mediaFormat = this.k0) != null && mediaFormat.containsKey("sample-rate")) {
            i = mediaFormat.getInteger("sample-rate");
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    public abstract ArrayList T(ea2 ea2Var, boolean z);

    public long U(long j, long j2, boolean z) {
        return super.g(j, j2);
    }

    public final op3 V() {
        ArrayDeque arrayDeque = this.X;
        if (!arrayDeque.isEmpty()) {
            return (op3) arrayDeque.getLast();
        }
        return this.T0;
    }

    public abstract tp W(mp3 mp3Var, ea2 ea2Var, MediaCrypto mediaCrypto, float f);

    public abstract void X(q61 q61Var);

    public final void Y(mp3 mp3Var, MediaCrypto mediaCrypto) {
        boolean z;
        boolean equals;
        String stringId;
        LogSessionId unused;
        this.p0 = mp3Var;
        ea2 ea2Var = this.a0;
        ea2Var.getClass();
        String str = mp3Var.a;
        float f = this.h0;
        ea2[] ea2VarArr = this.G;
        ea2VarArr.getClass();
        float S = S(f, ea2Var, ea2VarArr);
        if (S <= 0.0f) {
            S = -1.0f;
        }
        this.D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        tp W = W(mp3Var, ea2Var, mediaCrypto, S);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            cp4 cp4Var = this.C;
            cp4Var.getClass();
            LogSessionId a = cp4Var.a();
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (!equals) {
                MediaFormat mediaFormat = (MediaFormat) W.z;
                stringId = a.getStringId();
                mediaFormat.setString("log-session-id", stringId);
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            hp3 b = this.R.b(W);
            this.i0 = b;
            this.v0 = b.g(new eo3((Object) this, (byte) 1));
            Trace.endSection();
            this.D.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mp3Var.e(this.Q, ea2Var)) {
                String d = ea2.d(ea2Var);
                Locale locale = Locale.US;
                kb0.O("MediaCodecRenderer", qx1.n("Format exceeds selected codec's capabilities [", d, ", ", str, "]"));
            }
            this.m0 = S;
            this.j0 = ea2Var;
            HashSet hashSet = cr3.a;
            boolean z2 = false;
            if (i == 29 && "c2.android.aac.decoder".equals(str)) {
                z = true;
            } else {
                z = false;
            }
            this.q0 = z;
            String str2 = mp3Var.a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mp3Var.f)) {
                z2 = true;
            }
            this.t0 = z2;
            this.i0.getClass();
            if (this.E == 2) {
                this.D.getClass();
                this.w0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.S0.a++;
            long j = elapsedRealtime2 - elapsedRealtime;
            if (i >= 31 && !this.c1.isEmpty()) {
                hp3 hp3Var = this.i0;
                hp3Var.getClass();
                hp3Var.M(new ArrayList(this.c1));
            }
            e0(elapsedRealtime2, str, j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean Z(long j, long j2) {
        if (j2 < j) {
            ea2 ea2Var = this.b0;
            if (ea2Var == null || !Objects.equals(ea2Var.p, "audio/opus") || j - j2 > 80000) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (r7 != 4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0086, code lost:
    
        if (r2.getError() != null) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp3.a0():void");
    }

    public final void b0(MediaCrypto mediaCrypto, boolean z) {
        String str;
        ea2 ea2Var = this.a0;
        ea2Var.getClass();
        if (this.n0 == null) {
            try {
                List Q = Q(z);
                this.n0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) Q;
                if (!arrayList.isEmpty()) {
                    this.n0.add((mp3) arrayList.get(0));
                }
                this.o0 = null;
            } catch (sp3 e) {
                throw new np3(ea2Var, e, z, -49998);
            }
        }
        if (!this.n0.isEmpty()) {
            ArrayDeque arrayDeque = this.n0;
            arrayDeque.getClass();
            while (this.i0 == null) {
                mp3 mp3Var = (mp3) arrayDeque.peekFirst();
                mp3Var.getClass();
                if (!c0(ea2Var) || !z0(mp3Var)) {
                    return;
                }
                try {
                    Y(mp3Var, mediaCrypto);
                } catch (Exception e2) {
                    kb0.P("MediaCodecRenderer", "Failed to initialize decoder: " + mp3Var, e2);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + mp3Var.a + ", " + ea2Var;
                    String str3 = ea2Var.p;
                    if (e2 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e2).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    np3 np3Var = new np3(str2, e2, str3, z, mp3Var, str);
                    d0(np3Var);
                    np3 np3Var2 = this.o0;
                    if (np3Var2 == null) {
                        this.o0 = np3Var;
                    } else {
                        this.o0 = new np3(np3Var2.getMessage(), np3Var2.getCause(), np3Var2.x, np3Var2.y, np3Var2.z, np3Var2.A);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.o0;
                    }
                }
            }
            this.n0 = null;
            return;
        }
        throw new np3(ea2Var, null, z, -49999);
    }

    @Override // defpackage.w30, defpackage.kp4
    public void c(int i, Object obj) {
        if (i != 11) {
            if (i != 21) {
                if (i == 22) {
                    obj.getClass();
                    zw2 zw2Var = (zw2) obj;
                    if (!this.c1.equals(zw2Var)) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            HashSet hashSet = new HashSet(zw2Var);
                            HashSet hashSet2 = new HashSet();
                            ho6 it = this.c1.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (!hashSet.remove(str)) {
                                    hashSet2.add(str);
                                }
                            }
                            hp3 hp3Var = this.i0;
                            if (hp3Var != null) {
                                if (!hashSet2.isEmpty()) {
                                    hp3Var.Q(new ArrayList(hashSet2));
                                }
                                if (!hashSet.isEmpty()) {
                                    hp3Var.M(new ArrayList(hashSet));
                                }
                            }
                        }
                        this.c1 = zw2Var;
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            io0 io0Var = (io0) obj;
            this.a1 = io0Var;
            hp3 hp3Var2 = this.i0;
            if (hp3Var2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : io0Var.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                hp3Var2.setParameters(bundle);
                return;
            }
            return;
        }
        zy1 zy1Var = (zy1) obj;
        zy1Var.getClass();
        this.e0 = zy1Var;
    }

    public boolean c0(ea2 ea2Var) {
        return true;
    }

    public abstract void d0(Exception exc);

    public abstract void e0(long j, String str, long j2);

    public abstract void f0(io0 io0Var);

    @Override // defpackage.w30
    public final long g(long j, long j2) {
        return U(j, j2, this.v0);
    }

    public abstract void g0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0160, code lost:
    
        if (L() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x016e, code lost:
    
        if (L() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (java.util.Objects.equals(r2, com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011b, code lost:
    
        if (r4.f(r2) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0147, code lost:
    
        if (L() == false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.s61 h0(defpackage.pz2 r14) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp3.h0(pz2):s61");
    }

    public abstract void i0(ea2 ea2Var, MediaFormat mediaFormat);

    public void k0(long j) {
        this.U0 = Math.max(j, this.U0);
        while (true) {
            ArrayDeque arrayDeque = this.X;
            if (!arrayDeque.isEmpty() && j >= ((op3) arrayDeque.peek()).a) {
                op3 op3Var = (op3) arrayDeque.poll();
                op3Var.getClass();
                w0(op3Var);
                l0();
            } else {
                return;
            }
        }
    }

    public abstract void l0();

    public final void n0() {
        byte b = this.H0;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    this.O0 = true;
                    r0();
                    return;
                } else {
                    q0();
                    a0();
                    return;
                }
            }
            O();
            E0();
            return;
        }
        O();
    }

    public abstract boolean o0(long j, long j2, hp3 hp3Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ea2 ea2Var);

    @Override // defpackage.w30
    public void p() {
        this.a0 = null;
        w0(op3.i);
        this.X.clear();
        if (this.B0) {
            this.B0 = false;
            s0();
        } else {
            P();
        }
    }

    public final boolean p0(int i) {
        pz2 pz2Var = this.z;
        pz2Var.m();
        q61 q61Var = this.S;
        q61Var.f();
        int y = y(pz2Var, q61Var, i | 4);
        if (y == -5) {
            h0(pz2Var);
            return true;
        }
        if (y == -4 && q61Var.d(4)) {
            this.N0 = true;
            n0();
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0() {
        try {
            hp3 hp3Var = this.i0;
            if (hp3Var != null) {
                hp3Var.release();
                this.S0.b++;
                mp3 mp3Var = this.p0;
                mp3Var.getClass();
                g0(mp3Var.a);
            }
            this.i0 = null;
            try {
                MediaCrypto mediaCrypto = this.f0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.i0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.w30
    public void r(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.X;
        if (!arrayDeque.isEmpty()) {
            this.T0 = (op3) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (!z2) {
            return;
        }
        this.N0 = false;
        this.O0 = false;
        this.Q0 = false;
        if (this.B0) {
            s0();
        } else if (P()) {
            a0();
        }
        if (this.T0.d.y() > 0) {
            this.P0 = true;
        }
        this.T0.d.e();
        this.T0.g = false;
    }

    public abstract void r0();

    public final void s0() {
        this.L0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        V().h = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.D0 = false;
        this.V.f();
        this.U.f();
        this.C0 = false;
        ByteBuffer byteBuffer = zv.a;
        ed4 ed4Var = this.Y;
        ed4Var.z = byteBuffer;
        ed4Var.y = 0;
        ed4Var.x = 2;
    }

    public void t0() {
        this.x0 = -1;
        this.T.B = null;
        this.y0 = -1;
        this.z0 = null;
        this.L0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        V().h = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        this.J0 = false;
        this.u0 = -9223372036854775807L;
        this.I0 = false;
        this.r0 = false;
        this.s0 = false;
        this.A0 = false;
        this.G0 = (byte) 0;
        this.H0 = (byte) 0;
        this.F0 = this.E0 ? (byte) 1 : (byte) 0;
        this.X0 = false;
        this.Y0 = 0L;
        this.Z0 = -9223372036854775807L;
    }

    public final void u0() {
        t0();
        this.R0 = null;
        this.n0 = null;
        this.p0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = false;
        this.K0 = false;
        this.m0 = -1.0f;
        this.q0 = false;
        this.t0 = false;
        this.v0 = false;
        this.E0 = false;
        this.F0 = (byte) 0;
    }

    public final void v0(qp1 qp1Var) {
        qp1 qp1Var2 = this.c0;
        if (qp1Var2 != qp1Var) {
            if (qp1Var != null) {
                qp1Var.d(null);
            }
            if (qp1Var2 != null) {
                qp1Var2.c(null);
            }
        }
        this.c0 = qp1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 >= r0) goto L16;
     */
    @Override // defpackage.w30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(defpackage.ea2[] r13, long r14, long r16, defpackage.jw3 r18) {
        /*
            r12 = this;
            long r7 = r12.O
            g95 r13 = r12.F
            r13.getClass()
            int r9 = r13.G()
            op3 r13 = r12.T0
            long r0 = r13.c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 != 0) goto L30
            op3 r0 = new op3
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.w0(r0)
            boolean r13 = r12.W0
            if (r13 == 0) goto L63
            r12.l0()
            return
        L30:
            java.util.ArrayDeque r13 = r12.X
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L64
            long r0 = r12.L0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L48
            long r2 = r12.U0
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L64
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L64
        L48:
            op3 r0 = new op3
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.w0(r0)
            op3 r13 = r12.T0
            long r0 = r13.c
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 == 0) goto L63
            r12.l0()
        L63:
            return
        L64:
            op3 r0 = new op3
            long r1 = r12.L0
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r13.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp3.w(ea2[], long, long, jw3):void");
    }

    public final void w0(op3 op3Var) {
        this.T0 = op3Var;
        long j = op3Var.c;
        if (j != -9223372036854775807L) {
            this.V0 = true;
            j0(j);
        }
    }

    @Override // defpackage.w30
    public final void x() {
        V().e = this.O;
    }

    public boolean x0(q61 q61Var) {
        return false;
    }

    public boolean y0() {
        return this.I0;
    }

    @Override // defpackage.w30
    public void z(long j, long j2) {
        int i;
        boolean z = false;
        if (this.Q0) {
            this.Q0 = false;
            n0();
        }
        yx1 yx1Var = this.R0;
        if (yx1Var == null) {
            try {
                if (this.O0) {
                    r0();
                    return;
                }
                if (this.a0 == null && !p0(2)) {
                    return;
                }
                a0();
                if (this.B0) {
                    Trace.beginSection("bypassRender");
                    do {
                    } while (I(j, j2));
                    Trace.endSection();
                } else if (this.i0 != null) {
                    this.D.getClass();
                    SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    do {
                    } while (M(j, j2));
                    do {
                    } while (N());
                    Trace.endSection();
                } else {
                    n61 n61Var = this.S0;
                    int i2 = n61Var.d;
                    g95 g95Var = this.F;
                    g95Var.getClass();
                    n61Var.d = i2 + g95Var.t(j - this.H);
                    p0(1);
                }
                synchronized (this.S0) {
                }
                return;
            } catch (MediaCodec.CryptoException e) {
                throw d(e, this.a0, false, eq6.A(e.getErrorCode()));
            } catch (IllegalStateException e2) {
                boolean z2 = e2 instanceof MediaCodec.CodecException;
                if (!z2) {
                    StackTraceElement[] stackTrace = e2.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e2;
                    }
                }
                d0(e2);
                if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                    z = true;
                }
                if (z) {
                    q0();
                }
                lp3 K = K(e2, this.p0);
                if (K.x == 1101) {
                    i = 4006;
                } else {
                    i = 4003;
                }
                throw d(K, this.a0, z, i);
            }
        }
        this.R0 = null;
        throw yx1Var;
    }

    public boolean z0(mp3 mp3Var) {
        return true;
    }

    public void j0(long j) {
    }

    public void m0(q61 q61Var) {
    }
}
