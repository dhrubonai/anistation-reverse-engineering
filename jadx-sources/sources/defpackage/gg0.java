package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gg0 extends w30 {
    public final q61 Q;
    public final zi4 R;
    public fg0 S;
    public long T;

    public gg0() {
        super(6);
        this.Q = new q61(1);
        this.R = new zi4();
    }

    @Override // defpackage.w30, defpackage.kp4
    public final void c(int i, Object obj) {
        if (i == 8) {
            this.S = (fg0) obj;
        }
    }

    @Override // defpackage.w30
    public final void p() {
        fg0 fg0Var = this.S;
        if (fg0Var != null) {
            fg0Var.b();
        }
    }

    @Override // defpackage.w30
    public final void r(long j, boolean z, boolean z2) {
        this.T = Long.MIN_VALUE;
        fg0 fg0Var = this.S;
        if (fg0Var != null) {
            fg0Var.b();
        }
    }

    @Override // defpackage.w30
    public final void z(long j, long j2) {
        boolean z;
        float[] fArr;
        while (!j() && this.T < 100000 + j) {
            q61 q61Var = this.Q;
            q61Var.f();
            pz2 pz2Var = this.z;
            pz2Var.m();
            if (y(pz2Var, q61Var, 0) == -4 && !q61Var.d(4)) {
                long j3 = q61Var.D;
                this.T = j3;
                if (j3 < this.I) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.S != null && !z) {
                    q61Var.k();
                    ByteBuffer byteBuffer = q61Var.B;
                    String str = eq6.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        zi4 zi4Var = this.R;
                        zi4Var.L(limit, array);
                        zi4Var.N(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i = 0; i < 3; i++) {
                            fArr2[i] = Float.intBitsToFloat(zi4Var.o());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.S.a(this.T - this.H, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
