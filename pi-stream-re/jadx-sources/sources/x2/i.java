package x2;

import androidx.appcompat.widget.a0;
import c1.p0;
import c1.u;
import c1.v;
import f1.t;
import java.util.ArrayList;
import java.util.Arrays;
import r6.o0;

/* loaded from: classes.dex */
public final class i extends j {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f11115p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f11116n;

    public static boolean e(t tVar, byte[] bArr) {
        int i10 = tVar.f3860c;
        int i11 = tVar.f3859b;
        if (i10 - i11 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        tVar.d(bArr2, 0, bArr.length);
        tVar.G(i11);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // x2.j
    public final long b(t tVar) {
        byte[] bArr = tVar.f3858a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f11125i * j5.a.y(b11, b10)) / 1000000;
    }

    @Override // x2.j
    public final boolean c(t tVar, long j4, a0 a0Var) {
        if (e(tVar, o)) {
            byte[] copyOf = Arrays.copyOf(tVar.f3858a, tVar.f3860c);
            int i10 = copyOf[9] & 255;
            ArrayList e10 = j5.a.e(copyOf);
            if (((v) a0Var.f403b) != null) {
                return true;
            }
            u k10 = a3.g.k("audio/opus");
            k10.f1920y = i10;
            k10.f1921z = 48000;
            k10.f1910n = e10;
            a0Var.f403b = new v(k10);
            return true;
        }
        if (e(tVar, f11115p)) {
            w7.b.w((v) a0Var.f403b);
            if (this.f11116n) {
                return true;
            }
            this.f11116n = true;
            tVar.H(8);
            p0 J = q6.g.J(o0.k((String[]) q6.g.X(tVar, false, false).f11425c));
            if (J == null) {
                return true;
            }
            v vVar = (v) a0Var.f403b;
            vVar.getClass();
            u uVar = new u(vVar);
            uVar.f1906j = J.e(((v) a0Var.f403b).f1933k);
            a0Var.f403b = new v(uVar);
            return true;
        }
        w7.b.w((v) a0Var.f403b);
        return false;
    }

    @Override // x2.j
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.f11116n = false;
        }
    }
}
