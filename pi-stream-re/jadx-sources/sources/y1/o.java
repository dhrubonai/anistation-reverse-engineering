package y1;

import f1.b0;
import r6.c0;
import r6.e0;
import r6.l1;
import r6.m1;
import r6.u1;

/* loaded from: classes.dex */
public final class o extends n {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;
    public final boolean F;
    public final int G;
    public final boolean H;
    public final boolean I;
    public final int J;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11510e;

    /* renamed from: f, reason: collision with root package name */
    public final j f11511f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11512x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f11513y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f11514z;

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(int r5, c1.f1 r6, int r7, y1.j r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.o.<init>(int, c1.f1, int, y1.j, int, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        m1 a10;
        m1 m1Var;
        if (oVar.f11510e && oVar.f11513y) {
            a10 = p.f11515j;
        } else {
            a10 = p.f11515j.a();
        }
        c0 c0Var = e0.f9450a;
        int i10 = oVar.A;
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(oVar2.A);
        if (oVar.f11511f.f1797y) {
            m1Var = p.f11515j.a();
        } else {
            m1Var = p.f11516k;
        }
        return c0Var.b(valueOf, valueOf2, m1Var).b(Integer.valueOf(oVar.B), Integer.valueOf(oVar2.B), a10).b(Integer.valueOf(i10), Integer.valueOf(oVar2.A), a10).e();
    }

    public static int d(o oVar, o oVar2) {
        e0 c6 = e0.f9450a.c(oVar.f11513y, oVar2.f11513y).a(oVar.D, oVar2.D).c(oVar.E, oVar2.E).c(oVar.f11514z, oVar2.f11514z).c(oVar.f11510e, oVar2.f11510e).c(oVar.f11512x, oVar2.f11512x);
        Integer valueOf = Integer.valueOf(oVar.C);
        Integer valueOf2 = Integer.valueOf(oVar2.C);
        l1.f9489a.getClass();
        e0 b10 = c6.b(valueOf, valueOf2, u1.f9551a);
        boolean z9 = oVar2.H;
        boolean z10 = oVar.H;
        e0 c10 = b10.c(z10, z9);
        boolean z11 = oVar2.I;
        boolean z12 = oVar.I;
        e0 c11 = c10.c(z12, z11);
        if (z10 && z12) {
            c11 = c11.a(oVar.J, oVar2.J);
        }
        return c11.e();
    }

    @Override // y1.n
    public final int a() {
        return this.G;
    }

    @Override // y1.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.F || b0.a(this.f11509d.f1935m, oVar.f11509d.f1935m)) {
            if (!this.f11511f.F) {
                if (this.H != oVar.H || this.I != oVar.I) {
                }
            }
            return true;
        }
        return false;
    }
}
