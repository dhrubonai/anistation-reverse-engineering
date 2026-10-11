package p1;

import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends w1.f {
    public byte[] A;
    public volatile boolean B;
    public byte[] C;

    public f(h1.h hVar, h1.l lVar, c1.v vVar, int i10, Object obj, byte[] bArr) {
        super(hVar, lVar, 3, vVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        f fVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = b0.f3804f;
            fVar = this;
        } else {
            fVar = this;
            bArr2 = bArr;
        }
        fVar.A = bArr2;
    }

    @Override // z1.l
    public final void c() {
        try {
            this.f10774z.m(this.f10767b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.B) {
                byte[] bArr = this.A;
                if (bArr.length < i11 + 16384) {
                    this.A = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f10774z.p(this.A, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.B) {
                this.C = Arrays.copyOf(this.A, i11);
            }
        } finally {
            w7.b.C(this.f10774z);
        }
    }

    @Override // z1.l
    public final void m() {
        this.B = true;
    }
}
