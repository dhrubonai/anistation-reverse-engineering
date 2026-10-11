package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class av2 extends w30 {
    public final oa7 Q;
    public final q61 R;
    public final ArrayDeque S;
    public boolean T;
    public boolean U;
    public zu2 V;
    public long W;
    public long X;
    public byte Y;
    public int Z;
    public ea2 a0;
    public m60 b0;
    public q61 c0;
    public ImageOutput d0;
    public yy1 e0;
    public Bitmap f0;
    public boolean g0;
    public ri0 h0;
    public ri0 i0;
    public int j0;
    public boolean k0;

    public av2(oa7 oa7Var) {
        super(4);
        this.Q = oa7Var;
        this.d0 = ImageOutput.a;
        this.R = new q61(0);
        this.V = zu2.c;
        this.S = new ArrayDeque();
        this.X = -9223372036854775807L;
        this.W = -9223372036854775807L;
        this.Y = (byte) 0;
        this.Z = 1;
    }

    @Override // defpackage.w30
    public final int D(ea2 ea2Var) {
        return oa7.a(ea2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
    
        if (r14 == ((r0 * r1.R) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(long r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av2.H(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r3 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0105, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Type inference failed for: r3v6, types: [ri0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(long r14) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av2.I(long):boolean");
    }

    public final void J() {
        if (!this.k0) {
            return;
        }
        ea2 ea2Var = this.a0;
        ea2Var.getClass();
        int a = oa7.a(ea2Var);
        if (a != w30.a(4, 0, 0, 0) && a != w30.a(3, 0, 0, 0)) {
            throw d(new Exception("Provided decoder factory can't create decoder for format."), this.a0, false, 4005);
        }
        m60 m60Var = this.b0;
        if (m60Var != null) {
            m60Var.release();
        }
        this.b0 = new m60(this.Q.a);
        this.k0 = false;
    }

    public final void K() {
        this.c0 = null;
        this.Y = (byte) 0;
        this.X = -9223372036854775807L;
        m60 m60Var = this.b0;
        if (m60Var != null) {
            m60Var.release();
            this.b0 = null;
        }
    }

    @Override // defpackage.w30, defpackage.kp4
    public final void c(int i, Object obj) {
        ImageOutput imageOutput;
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.e0 = (yy1) obj;
        } else {
            if (obj instanceof ImageOutput) {
                imageOutput = (ImageOutput) obj;
            } else {
                imageOutput = null;
            }
            if (imageOutput == null) {
                imageOutput = ImageOutput.a;
            }
            this.d0 = imageOutput;
        }
    }

    @Override // defpackage.w30
    public final String i() {
        return "ImageRenderer";
    }

    @Override // defpackage.w30
    public final boolean k() {
        return this.U;
    }

    @Override // defpackage.w30
    public final boolean n() {
        int i = this.Z;
        if (i != 3) {
            if (i != 0 || !this.g0) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.w30
    public final void p() {
        this.a0 = null;
        this.V = zu2.c;
        this.S.clear();
        K();
    }

    @Override // defpackage.w30
    public final void q(boolean z, boolean z2) {
        this.Z = z2 ? 1 : 0;
    }

    @Override // defpackage.w30
    public final void r(long j, boolean z, boolean z2) {
        this.Z = Math.min(this.Z, 1);
        this.U = false;
        this.T = false;
        this.f0 = null;
        this.h0 = null;
        this.i0 = null;
        this.g0 = false;
        this.c0 = null;
        m60 m60Var = this.b0;
        if (m60Var != null) {
            m60Var.flush();
        }
        this.S.clear();
    }

    @Override // defpackage.w30
    public final void s() {
        K();
    }

    @Override // defpackage.w30
    public final void t() {
        K();
        this.Z = Math.min(this.Z, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.w30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.ea2[] r5, long r6, long r8, defpackage.jw3 r10) {
        /*
            r4 = this;
            zu2 r5 = r4.V
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.S
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.X
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.W
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            zu2 r6 = new zu2
            long r0 = r4.X
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            zu2 r5 = new zu2
            r5.<init>(r0, r8)
            r4.V = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av2.w(ea2[], long, long, jw3):void");
    }

    @Override // defpackage.w30
    public final void z(long j, long j2) {
        if (!this.U) {
            if (this.a0 == null) {
                pz2 pz2Var = this.z;
                pz2Var.m();
                q61 q61Var = this.R;
                q61Var.f();
                int y = y(pz2Var, q61Var, 2);
                if (y == -5) {
                    ea2 ea2Var = (ea2) pz2Var.z;
                    ea2Var.getClass();
                    this.a0 = ea2Var;
                    this.k0 = true;
                } else {
                    if (y == -4) {
                        io3.B(q61Var.d(4));
                        this.T = true;
                        this.U = true;
                        return;
                    }
                    return;
                }
            }
            if (this.b0 == null) {
                J();
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                do {
                } while (H(j));
                do {
                } while (I(j));
                Trace.endSection();
            } catch (qu2 e) {
                throw d(e, null, false, 4003);
            }
        }
    }
}
