package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wl3 implements ud1 {
    public final /* synthetic */ yl3 A;
    public boolean x;
    public long y = 9223372034707292159L;
    public long z = 0;

    public wl3(yl3 yl3Var) {
        this.A = yl3Var;
    }

    public final ha3 a() {
        this.x = true;
        yl3 yl3Var = this.A;
        ha3 q0 = yl3Var.q0();
        if (c13.b(this.y, 9223372034707292159L)) {
            this.y = w65.R(q0.o(0L));
            this.z = q0.j();
        }
        yl3Var.t0().d0.b();
        return q0;
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.A.b();
    }

    public final void c(yn2 yn2Var, float f) {
        yl3 yl3Var = this.A;
        sp spVar = yl3Var.N;
        if (spVar == null) {
            spVar = new sp();
            yl3Var.N = spVar;
        }
        int N0 = ms.N0((yn2[]) spVar.b, yn2Var);
        if (N0 < 0) {
            int i = spVar.a;
            yn2[] yn2VarArr = (yn2[]) spVar.b;
            if (i == yn2VarArr.length) {
                int i2 = i * 2;
                spVar.b = (yn2[]) Arrays.copyOf(yn2VarArr, i2);
                spVar.c = Arrays.copyOf((float[]) spVar.c, i2);
                spVar.d = Arrays.copyOf((byte[]) spVar.d, i2);
            }
            ((yn2[]) spVar.b)[i] = yn2Var;
            ((byte[]) spVar.d)[i] = 3;
            ((float[]) spVar.c)[i] = f;
            spVar.a++;
            return;
        }
        float[] fArr = (float[]) spVar.c;
        if (fArr[N0] == f) {
            byte[] bArr = (byte[]) spVar.d;
            if (bArr[N0] == 2) {
                bArr[N0] = 0;
                return;
            }
            return;
        }
        fArr[N0] = f;
        ((byte[]) spVar.d)[N0] = 1;
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.A.getFontScale();
    }
}
