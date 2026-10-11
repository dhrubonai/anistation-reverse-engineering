package x2;

import d2.v;
import f1.t;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: n, reason: collision with root package name */
    public v f11099n;
    public c o;

    @Override // x2.j
    public final long b(t tVar) {
        boolean z9;
        byte[] bArr = tVar.f3858a;
        if (bArr[0] == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            tVar.H(4);
            tVar.B();
        }
        int S = a0.S(i10, tVar);
        tVar.G(0);
        return S;
    }

    @Override // x2.j
    public final boolean c(t tVar, long j4, androidx.appcompat.widget.a0 a0Var) {
        boolean z9;
        byte[] bArr = tVar.f3858a;
        v vVar = this.f11099n;
        if (vVar == null) {
            v vVar2 = new v(bArr, 17);
            this.f11099n = vVar2;
            a0Var.f403b = vVar2.c(Arrays.copyOfRange(bArr, 9, tVar.f3860c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            androidx.appcompat.widget.a0 U = w7.b.U(tVar);
            v vVar3 = new v(vVar.f3195a, vVar.f3196b, vVar.f3197c, vVar.f3198d, vVar.f3199e, vVar.f3201g, vVar.f3202h, vVar.f3204j, U, vVar.f3206l);
            this.f11099n = vVar3;
            this.o = new c(vVar3, U);
            return true;
        }
        if (b10 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return true;
        }
        c cVar = this.o;
        if (cVar != null) {
            cVar.f11097c = j4;
            a0Var.f404c = cVar;
        }
        ((c1.v) a0Var.f403b).getClass();
        return false;
    }

    @Override // x2.j
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.f11099n = null;
            this.o = null;
        }
    }
}
