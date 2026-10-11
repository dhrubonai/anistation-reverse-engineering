package r1;

import android.graphics.Bitmap;
import androidx.appcompat.widget.a0;
import c1.v;
import f.p0;
import j1.l;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class i extends j1.e {
    public final c I;
    public final i1.h J;
    public final ArrayDeque K;
    public boolean L;
    public boolean M;
    public g N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public v S;
    public b T;
    public i1.h U;
    public f V;
    public Bitmap W;
    public boolean X;
    public h Y;
    public h Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f9313a0;

    public i(p0 p0Var) {
        super(4);
        this.I = p0Var;
        this.V = f.f9306a;
        this.J = new i1.h(0);
        this.N = g.f9307c;
        this.K = new ArrayDeque();
        this.P = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.Q = 0;
        this.R = 1;
    }

    @Override // j1.e
    public final int B(v vVar) {
        return ((p0) this.I).I(vVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0143, code lost:
    
        if (r14.f9310a == ((r0.H * r1.G) - 1)) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(long r13) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.i.D(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x010d, code lost:
    
        if (r2 == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(long r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.i.E(long):boolean");
    }

    public final void F() {
        boolean z9;
        v vVar = this.S;
        p0 p0Var = (p0) this.I;
        int I = p0Var.I(vVar);
        if (I != a3.g.e(4, 0, 0, 0) && I != a3.g.e(3, 0, 0, 0)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            b bVar = this.T;
            if (bVar != null) {
                bVar.a();
            }
            this.T = new b((l) p0Var.f3762b);
            return;
        }
        throw m(4005, this.S, new d("Provided decoder factory can't create decoder for format."), false);
    }

    public final void G() {
        this.U = null;
        this.Q = 0;
        this.P = -9223372036854775807L;
        b bVar = this.T;
        if (bVar != null) {
            bVar.a();
            this.T = null;
        }
    }

    @Override // j1.g1
    public final boolean a() {
        int i10 = this.R;
        if (i10 != 3 && (i10 != 0 || !this.X)) {
            return false;
        }
        return true;
    }

    @Override // j1.e, j1.g1
    public final boolean b() {
        return this.M;
    }

    @Override // j1.g1
    public final void d(long j4, long j10) {
        if (this.M) {
            return;
        }
        if (this.S == null) {
            a0 a0Var = this.f5708c;
            a0Var.G();
            i1.h hVar = this.J;
            hVar.h();
            int y9 = y(a0Var, hVar, 2);
            if (y9 == -5) {
                v vVar = (v) a0Var.f404c;
                w7.b.w(vVar);
                this.S = vVar;
                F();
            } else {
                if (y9 == -4) {
                    w7.b.u(hVar.g(4));
                    this.L = true;
                    this.M = true;
                    return;
                }
                return;
            }
        }
        try {
            com.bumptech.glide.d.c("drainAndFeedDecoder");
            do {
            } while (D(j4));
            do {
            } while (E(j4));
            com.bumptech.glide.d.s();
        } catch (d e10) {
            throw m(4003, null, e10, false);
        }
    }

    @Override // j1.e, j1.c1
    public final void e(int i10, Object obj) {
        f fVar;
        if (i10 == 15) {
            if (obj instanceof f) {
                fVar = (f) obj;
            } else {
                fVar = null;
            }
            if (fVar == null) {
                fVar = f.f9306a;
            }
            this.V = fVar;
        }
    }

    @Override // j1.g1
    public final String f() {
        return "ImageRenderer";
    }

    @Override // j1.e
    public final void p() {
        this.S = null;
        this.N = g.f9307c;
        this.K.clear();
        G();
        this.V.getClass();
    }

    @Override // j1.e
    public final void q(boolean z9, boolean z10) {
        this.R = z10 ? 1 : 0;
    }

    @Override // j1.e
    public final void s(long j4, boolean z9) {
        this.R = Math.min(this.R, 1);
        this.M = false;
        this.L = false;
        this.W = null;
        this.Y = null;
        this.Z = null;
        this.X = false;
        this.U = null;
        b bVar = this.T;
        if (bVar != null) {
            bVar.flush();
        }
        this.K.clear();
    }

    @Override // j1.e
    public final void t() {
        G();
    }

    @Override // j1.e
    public final void u() {
        G();
        this.R = Math.min(this.R, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // j1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(c1.v[] r6, long r7, long r9) {
        /*
            r5 = this;
            r1.g r6 = r5.N
            long r6 = r6.f9309b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L31
            java.util.ArrayDeque r6 = r5.K
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.P
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.O
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L31
        L26:
            r1.g r7 = new r1.g
            long r0 = r5.P
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L38
        L31:
            r1.g r6 = new r1.g
            r6.<init>(r0, r9)
            r5.N = r6
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.i.x(c1.v[], long, long):void");
    }
}
