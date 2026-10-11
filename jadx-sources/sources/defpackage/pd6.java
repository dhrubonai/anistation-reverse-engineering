package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pd6 extends w30 implements Handler.Callback {
    public final r18 Q;
    public final q61 R;
    public d31 S;
    public final p16 T;
    public boolean U;
    public byte V;
    public n16 W;
    public u16 X;
    public bj0 Y;
    public bj0 Z;
    public int a0;
    public final Handler b0;
    public final ld6 c0;
    public final pz2 d0;
    public boolean e0;
    public boolean f0;
    public ea2 g0;
    public long h0;
    public long i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd6(ld6 ld6Var, Looper looper) {
        super(3);
        Handler handler;
        eo3 eo3Var = p16.n;
        this.c0 = ld6Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = eq6.a;
            handler = new Handler(looper, this);
        }
        this.b0 = handler;
        this.T = eo3Var;
        this.Q = new r18((byte) 11);
        this.R = new q61(1);
        this.d0 = new pz2((byte) 25, false);
        this.i0 = -9223372036854775807L;
        this.h0 = -9223372036854775807L;
    }

    @Override // defpackage.w30
    public final int D(ea2 ea2Var) {
        int i;
        boolean equals = Objects.equals(ea2Var.p, "application/x-media3-cues");
        String str = ea2Var.p;
        if (!equals) {
            eo3 eo3Var = (eo3) this.T;
            eo3Var.getClass();
            if (!((p18) eo3Var.y).i(ea2Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (qy3.l(str)) {
                    return w30.a(1, 0, 0, 0);
                }
                return w30.a(0, 0, 0, 0);
            }
        }
        if (ea2Var.T == 0) {
            i = 4;
        } else {
            i = 2;
        }
        return w30.a(i, 0, 0, 0);
    }

    public final void H() {
        boolean z;
        if (!Objects.equals(this.g0.p, "application/cea-608") && !Objects.equals(this.g0.p, "application/x-mp4-cea-608") && !Objects.equals(this.g0.p, "application/cea-708")) {
            z = false;
        } else {
            z = true;
        }
        String str = this.g0.p;
        if (z) {
            return;
        }
        ze0.m(ss5.f("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void I() {
        z62 z62Var = nw2.y;
        c31 c31Var = new c31(K(this.h0), o15.B);
        Handler handler = this.b0;
        if (handler != null) {
            handler.obtainMessage(1, c31Var).sendToTarget();
            return;
        }
        o15 o15Var = c31Var.a;
        ld6 ld6Var = this.c0;
        ld6Var.l(o15Var);
        ld6Var.b(c31Var);
    }

    public final long J() {
        if (this.a0 == -1) {
            return Long.MAX_VALUE;
        }
        this.Y.getClass();
        if (this.a0 >= this.Y.h()) {
            return Long.MAX_VALUE;
        }
        return this.Y.e(this.a0);
    }

    public final long K(long j) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        return j - this.H;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            r7 = this;
            r0 = 1
            r7.U = r0
            ea2 r1 = r7.g0
            r1.getClass()
            p16 r2 = r7.T
            eo3 r2 = (defpackage.eo3) r2
            java.lang.Object r2 = r2.y
            p18 r2 = (defpackage.p18) r2
            java.lang.String r3 = r1.p
            int r4 = r1.P
            if (r3 == 0) goto L50
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L34;
                case 1566015601: goto L2b;
                case 1566016562: goto L20;
                default: goto L1e;
            }
        L1e:
            r0 = r6
            goto L3e
        L20:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L1e
        L29:
            r0 = 2
            goto L3e
        L2b:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3e
            goto L1e
        L34:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L1e
        L3d:
            r0 = 0
        L3e:
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L50
        L42:
            zi0 r0 = new zi0
            java.util.List r1 = r1.s
            r0.<init>(r4, r1)
            goto L6d
        L4a:
            vi0 r0 = new vi0
            r0.<init>(r3, r4)
            goto L6d
        L50:
            boolean r0 = r2.i(r1)
            if (r0 == 0) goto L75
            y16 r0 = r2.s(r1)
            jd1 r1 = new jd1
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6d:
            r7.W = r0
            long r1 = r7.I
            r0.a(r1)
            return
        L75:
            java.lang.String r7 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r7 = defpackage.zo5.l(r7, r3)
            defpackage.ze0.k(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd6.L():void");
    }

    public final void M() {
        this.X = null;
        this.a0 = -1;
        bj0 bj0Var = this.Y;
        if (bj0Var != null) {
            bj0Var.i();
            this.Y = null;
        }
        bj0 bj0Var2 = this.Z;
        if (bj0Var2 != null) {
            bj0Var2.i();
            this.Z = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            c31 c31Var = (c31) message.obj;
            o15 o15Var = c31Var.a;
            ld6 ld6Var = this.c0;
            ld6Var.l(o15Var);
            ld6Var.b(c31Var);
            return true;
        }
        p65.l();
        return false;
    }

    @Override // defpackage.w30
    public final String i() {
        return "TextRenderer";
    }

    @Override // defpackage.w30
    public final boolean k() {
        return this.f0;
    }

    @Override // defpackage.w30
    public final boolean n() {
        ea2 ea2Var = this.g0;
        if (ea2Var != null) {
            if (Objects.equals(ea2Var.p, "application/x-media3-cues")) {
                d31 d31Var = this.S;
                d31Var.getClass();
                if (d31Var.a(this.h0) == Long.MIN_VALUE) {
                    try {
                        g95 g95Var = this.F;
                        g95Var.getClass();
                        g95Var.s();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.f0) {
                if (this.e0) {
                    bj0 bj0Var = this.Y;
                    long j = this.h0;
                    if (bj0Var == null || bj0Var.h() <= 0 || bj0Var.e(bj0Var.h() - 1) <= j) {
                        bj0 bj0Var2 = this.Z;
                        long j2 = this.h0;
                        if ((bj0Var2 == null || bj0Var2.h() <= 0 || bj0Var2.e(bj0Var2.h() - 1) <= j2) && this.X != null) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.w30
    public final void p() {
        this.g0 = null;
        this.i0 = -9223372036854775807L;
        I();
        this.h0 = -9223372036854775807L;
        if (this.W != null) {
            M();
            n16 n16Var = this.W;
            n16Var.getClass();
            n16Var.release();
            this.W = null;
            this.V = (byte) 0;
        }
    }

    @Override // defpackage.w30
    public final void r(long j, boolean z, boolean z2) {
        this.h0 = j;
        d31 d31Var = this.S;
        if (d31Var != null) {
            d31Var.clear();
        }
        I();
        this.e0 = false;
        this.f0 = false;
        this.i0 = -9223372036854775807L;
        ea2 ea2Var = this.g0;
        if (ea2Var != null && !Objects.equals(ea2Var.p, "application/x-media3-cues")) {
            if (this.V != 0) {
                M();
                n16 n16Var = this.W;
                n16Var.getClass();
                n16Var.release();
                this.W = null;
                this.V = (byte) 0;
                L();
                return;
            }
            M();
            n16 n16Var2 = this.W;
            n16Var2.getClass();
            n16Var2.flush();
            n16Var2.a(this.I);
        }
    }

    @Override // defpackage.w30
    public final void w(ea2[] ea2VarArr, long j, long j2, jw3 jw3Var) {
        d31 gk2Var;
        ea2 ea2Var = ea2VarArr[0];
        this.g0 = ea2Var;
        if (!Objects.equals(ea2Var.p, "application/x-media3-cues")) {
            H();
            if (this.W != null) {
                this.V = (byte) 1;
                return;
            } else {
                L();
                return;
            }
        }
        if (this.g0.Q == 1) {
            gk2Var = new rx3();
        } else {
            gk2Var = new gk2((byte) 2);
        }
        this.S = gk2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r25 < (r0.D - 1000000)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r4 >= (r5 - 1000000)) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d5 A[SYNTHETIC] */
    @Override // defpackage.w30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r25, long r27) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd6.z(long, long):void");
    }
}
