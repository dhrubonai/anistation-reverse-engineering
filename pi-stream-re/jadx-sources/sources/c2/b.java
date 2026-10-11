package c2;

import androidx.appcompat.widget.a0;
import c1.v;
import f1.b0;
import f1.t;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends j1.e {
    public final i1.h I;
    public final t J;
    public long K;
    public a L;
    public long M;

    public b() {
        super(6);
        this.I = new i1.h(1);
        this.J = new t();
    }

    @Override // j1.e
    public final int B(v vVar) {
        if ("application/x-camera-motion".equals(vVar.f1935m)) {
            return a3.g.e(4, 0, 0, 0);
        }
        return a3.g.e(0, 0, 0, 0);
    }

    @Override // j1.g1
    public final boolean a() {
        return true;
    }

    @Override // j1.g1
    public final void d(long j4, long j10) {
        boolean z9;
        float[] fArr;
        while (!o() && this.M < 100000 + j4) {
            i1.h hVar = this.I;
            hVar.h();
            a0 a0Var = this.f5708c;
            a0Var.G();
            if (y(a0Var, hVar, 0) == -4 && !hVar.g(4)) {
                long j11 = hVar.f5264x;
                this.M = j11;
                if (j11 < this.C) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.L != null && !z9) {
                    hVar.k();
                    ByteBuffer byteBuffer = hVar.f5262e;
                    int i10 = b0.f3799a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        t tVar = this.J;
                        tVar.E(array, limit);
                        tVar.G(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i11 = 0; i11 < 3; i11++) {
                            fArr2[i11] = Float.intBitsToFloat(tVar.i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.L.c(this.M - this.K, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // j1.e, j1.c1
    public final void e(int i10, Object obj) {
        if (i10 == 8) {
            this.L = (a) obj;
        }
    }

    @Override // j1.g1
    public final String f() {
        return "CameraMotionRenderer";
    }

    @Override // j1.e
    public final void p() {
        a aVar = this.L;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // j1.e
    public final void s(long j4, boolean z9) {
        this.M = Long.MIN_VALUE;
        a aVar = this.L;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // j1.e
    public final void x(v[] vVarArr, long j4, long j10) {
        this.K = j10;
    }
}
