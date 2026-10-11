package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nf extends TextPaint {
    public ad a;
    public g96 b;
    public byte c;
    public km5 d;
    public ep0 e;
    public ka0 f;
    public he1 g;
    public uq5 h;
    public bb4 i;

    public final ad a() {
        ad adVar = this.a;
        if (adVar != null) {
            return adVar;
        }
        ad adVar2 = new ad(this);
        this.a = adVar2;
        return adVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().q(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r1 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ka0 r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof defpackage.su5
            if (r1 == 0) goto L1d
            su5 r6 = (defpackage.su5) r6
            long r6 = r6.a
            long r6 = defpackage.qs5.g(r9, r6)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof defpackage.im5
            if (r1 == 0) goto L6e
            ka0 r1 = r5.f
            boolean r1 = defpackage.a34.i(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            uq5 r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = defpackage.uq5.b(r3, r7)
        L36:
            if (r1 != 0) goto L55
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L55
            r5.f = r6
            uq5 r1 = new uq5
            r1.<init>(r7)
            r5.h = r1
            mf r1 = new mf
            r1.<init>(r6, r7, r2)
            he1 r6 = defpackage.ut5.b(r1)
            r5.g = r6
        L55:
            ad r6 = r5.a()
            he1 r7 = r5.g
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L65
        L64:
            r7 = r0
        L65:
            r6.u(r7)
            r5.e = r0
            defpackage.tl7.O(r5, r9)
            return
        L6e:
            defpackage.ze0.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf.c(ka0, long, float):void");
    }

    public final void d(long j) {
        boolean a;
        ep0 ep0Var = this.e;
        if (ep0Var == null) {
            a = false;
        } else {
            a = cm6.a(ep0Var.a, j);
        }
        if (!a && j != 16) {
            this.e = new ep0(j);
            setColor(w65.U(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(bb4 bb4Var) {
        if (bb4Var != null && !a34.i(this.i, bb4Var)) {
            this.i = bb4Var;
            if (bb4Var.equals(y22.O)) {
                setStyle(Paint.Style.FILL);
                return;
            }
            if (bb4Var instanceof d06) {
                a().y(1);
                d06 d06Var = (d06) bb4Var;
                a().x(d06Var.O);
                ad a = a();
                ((Paint) a.z).setStrokeMiter(d06Var.P);
                a().w(d06Var.R);
                a().v(d06Var.Q);
                ((Paint) a().z).setPathEffect(null);
                return;
            }
            ze0.l();
        }
    }

    public final void f(km5 km5Var) {
        if (km5Var != null && !a34.i(this.d, km5Var)) {
            this.d = km5Var;
            if (km5Var.equals(km5.d)) {
                clearShadowLayer();
                return;
            }
            km5 km5Var2 = this.d;
            float f = km5Var2.c;
            if (f == 0.0f) {
                f = Float.MIN_VALUE;
            }
            setShadowLayer(f, Float.intBitsToFloat((int) (km5Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), w65.U(this.d.a));
        }
    }

    public final void g(g96 g96Var) {
        boolean z;
        if (g96Var != null && !a34.i(this.b, g96Var)) {
            this.b = g96Var;
            int i = g96Var.a;
            boolean z2 = false;
            if ((i | 1) == i) {
                z = true;
            } else {
                z = false;
            }
            setUnderlineText(z);
            int i2 = this.b.a;
            if ((i2 | 2) == i2) {
                z2 = true;
            }
            setStrikeThruText(z2);
        }
    }
}
