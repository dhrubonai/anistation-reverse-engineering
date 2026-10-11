package q;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.ArrayList;
import r.m;

/* loaded from: classes.dex */
public class e {
    public final d A;
    public final d B;
    public final d C;
    public final d D;
    public final d E;
    public final d[] F;
    public final ArrayList G;
    public final boolean[] H;
    public e I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public Object U;
    public int V;
    public String W;
    public int X;
    public int Y;
    public final float[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public final e[] f8820a0;

    /* renamed from: b, reason: collision with root package name */
    public r.c f8821b;

    /* renamed from: b0, reason: collision with root package name */
    public final e[] f8822b0;

    /* renamed from: c, reason: collision with root package name */
    public r.c f8823c;

    /* renamed from: c0, reason: collision with root package name */
    public final int[] f8824c0;

    /* renamed from: x, reason: collision with root package name */
    public final d f8844x;

    /* renamed from: y, reason: collision with root package name */
    public final d f8845y;

    /* renamed from: z, reason: collision with root package name */
    public final d f8846z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8819a = false;

    /* renamed from: d, reason: collision with root package name */
    public final r.k f8825d = new r.k(this);

    /* renamed from: e, reason: collision with root package name */
    public final m f8826e = new m(this);

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f8827f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public final int[] f8828g = {0, 0, 0, 0};

    /* renamed from: h, reason: collision with root package name */
    public int f8829h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f8830i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f8831j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8832k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f8833l = new int[2];

    /* renamed from: m, reason: collision with root package name */
    public int f8834m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f8835n = 0;
    public float o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public int f8836p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f8837q = 0;

    /* renamed from: r, reason: collision with root package name */
    public float f8838r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public int f8839s = -1;

    /* renamed from: t, reason: collision with root package name */
    public float f8840t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f8841u = {com.google.android.gms.common.api.f.API_PRIORITY_OTHER, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};

    /* renamed from: v, reason: collision with root package name */
    public float f8842v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8843w = false;

    public e() {
        d dVar = new d(this, c.LEFT);
        this.f8844x = dVar;
        d dVar2 = new d(this, c.TOP);
        this.f8845y = dVar2;
        d dVar3 = new d(this, c.RIGHT);
        this.f8846z = dVar3;
        d dVar4 = new d(this, c.BOTTOM);
        this.A = dVar4;
        d dVar5 = new d(this, c.BASELINE);
        this.B = dVar5;
        d dVar6 = new d(this, c.CENTER_X);
        this.C = dVar6;
        d dVar7 = new d(this, c.CENTER_Y);
        this.D = dVar7;
        d dVar8 = new d(this, c.CENTER);
        this.E = dVar8;
        this.F = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = new boolean[2];
        this.f8824c0 = new int[]{1, 1};
        this.I = null;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        this.V = 0;
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = new float[]{-1.0f, -1.0f};
        this.f8820a0 = new e[]{null, null};
        this.f8822b0 = new e[]{null, null};
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public void A(boolean z9, boolean z10) {
        int i10;
        int i11;
        r.k kVar = this.f8825d;
        boolean z11 = z9 & kVar.f9294g;
        m mVar = this.f8826e;
        boolean z12 = z10 & mVar.f9294g;
        int i12 = kVar.f9295h.f9276g;
        int i13 = mVar.f9295h.f9276g;
        int i14 = kVar.f9296i.f9276g;
        int i15 = mVar.f9296i.f9276g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z11) {
            this.N = i12;
        }
        if (z12) {
            this.O = i13;
        }
        if (this.V == 8) {
            this.J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.f8824c0;
        if (z11) {
            if (iArr[0] == 1 && i17 < (i11 = this.J)) {
                i17 = i11;
            }
            this.J = i17;
            int i19 = this.Q;
            if (i17 < i19) {
                this.J = i19;
            }
        }
        if (z12) {
            if (iArr[1] == 1 && i18 < (i10 = this.K)) {
                i18 = i10;
            }
            this.K = i18;
            int i20 = this.R;
            if (i18 < i20) {
                this.K = i20;
            }
        }
    }

    public void B(p.e eVar) {
        int i10;
        int i11;
        eVar.getClass();
        int m5 = p.e.m(this.f8844x);
        int m9 = p.e.m(this.f8845y);
        int m10 = p.e.m(this.f8846z);
        int m11 = p.e.m(this.A);
        r.k kVar = this.f8825d;
        r.g gVar = kVar.f9295h;
        if (gVar.f9279j) {
            r.g gVar2 = kVar.f9296i;
            if (gVar2.f9279j) {
                m5 = gVar.f9276g;
                m10 = gVar2.f9276g;
            }
        }
        m mVar = this.f8826e;
        r.g gVar3 = mVar.f9295h;
        if (gVar3.f9279j) {
            r.g gVar4 = mVar.f9296i;
            if (gVar4.f9279j) {
                m9 = gVar3.f9276g;
                m11 = gVar4.f9276g;
            }
        }
        int i12 = m11 - m9;
        if (m10 - m5 < 0 || i12 < 0 || m5 == Integer.MIN_VALUE || m5 == Integer.MAX_VALUE || m9 == Integer.MIN_VALUE || m9 == Integer.MAX_VALUE || m10 == Integer.MIN_VALUE || m10 == Integer.MAX_VALUE || m11 == Integer.MIN_VALUE || m11 == Integer.MAX_VALUE) {
            m5 = 0;
            m9 = 0;
            m10 = 0;
            m11 = 0;
        }
        int i13 = m10 - m5;
        int i14 = m11 - m9;
        this.N = m5;
        this.O = m9;
        if (this.V == 8) {
            this.J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.f8824c0;
        if (iArr[0] == 1 && i13 < (i11 = this.J)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.K)) {
            i14 = i10;
        }
        this.J = i13;
        this.K = i14;
        int i15 = this.R;
        if (i14 < i15) {
            this.K = i15;
        }
        int i16 = this.Q;
        if (i13 < i16) {
            this.J = i16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02d8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(p.e r58) {
        /*
            Method dump skipped, instructions count: 1598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.b(p.e):void");
    }

    public boolean c() {
        if (this.V != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0309 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(p.e r33, boolean r34, boolean r35, boolean r36, boolean r37, p.k r38, p.k r39, int r40, boolean r41, q.d r42, q.d r43, int r44, int r45, int r46, int r47, float r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.d(p.e, boolean, boolean, boolean, boolean, p.k, p.k, int, boolean, q.d, q.d, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(c cVar, e eVar, c cVar2, int i10) {
        boolean z9;
        c cVar3 = c.CENTER;
        c cVar4 = c.CENTER_Y;
        c cVar5 = c.CENTER_X;
        c cVar6 = c.LEFT;
        c cVar7 = c.TOP;
        c cVar8 = c.RIGHT;
        c cVar9 = c.BOTTOM;
        if (cVar == cVar3) {
            if (cVar2 == cVar3) {
                d h10 = h(cVar6);
                d h11 = h(cVar8);
                d h12 = h(cVar7);
                d h13 = h(cVar9);
                boolean z10 = true;
                if ((h10 != null && h10.f()) || (h11 != null && h11.f())) {
                    z9 = false;
                } else {
                    e(cVar6, eVar, cVar6, 0);
                    e(cVar8, eVar, cVar8, 0);
                    z9 = true;
                }
                if ((h12 != null && h12.f()) || (h13 != null && h13.f())) {
                    z10 = false;
                } else {
                    e(cVar7, eVar, cVar7, 0);
                    e(cVar9, eVar, cVar9, 0);
                }
                if (z9 && z10) {
                    h(cVar3).a(eVar.h(cVar3), 0);
                    return;
                } else if (z9) {
                    h(cVar5).a(eVar.h(cVar5), 0);
                    return;
                } else {
                    if (z10) {
                        h(cVar4).a(eVar.h(cVar4), 0);
                        return;
                    }
                    return;
                }
            }
            if (cVar2 != cVar6 && cVar2 != cVar8) {
                if (cVar2 == cVar7 || cVar2 == cVar9) {
                    e(cVar7, eVar, cVar2, 0);
                    e(cVar9, eVar, cVar2, 0);
                    h(cVar3).a(eVar.h(cVar2), 0);
                    return;
                }
                return;
            }
            e(cVar6, eVar, cVar2, 0);
            e(cVar8, eVar, cVar2, 0);
            h(cVar3).a(eVar.h(cVar2), 0);
            return;
        }
        if (cVar == cVar5 && (cVar2 == cVar6 || cVar2 == cVar8)) {
            d h14 = h(cVar6);
            d h15 = eVar.h(cVar2);
            d h16 = h(cVar8);
            h14.a(h15, 0);
            h16.a(h15, 0);
            h(cVar5).a(h15, 0);
            return;
        }
        if (cVar == cVar4 && (cVar2 == cVar7 || cVar2 == cVar9)) {
            d h17 = eVar.h(cVar2);
            h(cVar7).a(h17, 0);
            h(cVar9).a(h17, 0);
            h(cVar4).a(h17, 0);
            return;
        }
        if (cVar == cVar5 && cVar2 == cVar5) {
            h(cVar6).a(eVar.h(cVar6), 0);
            h(cVar8).a(eVar.h(cVar8), 0);
            h(cVar5).a(eVar.h(cVar2), 0);
            return;
        }
        if (cVar == cVar4 && cVar2 == cVar4) {
            h(cVar7).a(eVar.h(cVar7), 0);
            h(cVar9).a(eVar.h(cVar9), 0);
            h(cVar4).a(eVar.h(cVar2), 0);
            return;
        }
        d h18 = h(cVar);
        d h19 = eVar.h(cVar2);
        if (h18.g(h19)) {
            c cVar10 = c.BASELINE;
            if (cVar == cVar10) {
                d h20 = h(cVar7);
                d h21 = h(cVar9);
                if (h20 != null) {
                    h20.h();
                }
                if (h21 != null) {
                    h21.h();
                }
                i10 = 0;
            } else if (cVar != cVar7 && cVar != cVar9) {
                if (cVar == cVar6 || cVar == cVar8) {
                    d h22 = h(cVar3);
                    if (h22.f8815d != h19) {
                        h22.h();
                    }
                    d d10 = h(cVar).d();
                    d h23 = h(cVar5);
                    if (h23.f()) {
                        d10.h();
                        h23.h();
                    }
                }
            } else {
                d h24 = h(cVar10);
                if (h24 != null) {
                    h24.h();
                }
                d h25 = h(cVar3);
                if (h25.f8815d != h19) {
                    h25.h();
                }
                d d11 = h(cVar).d();
                d h26 = h(cVar4);
                if (h26.f()) {
                    d11.h();
                    h26.h();
                }
            }
            h18.a(h19, i10);
        }
    }

    public final void f(d dVar, d dVar2, int i10) {
        if (dVar.f8813b == this) {
            e(dVar.f8814c, dVar2.f8813b, dVar2.f8814c, i10);
        }
    }

    public final void g(p.e eVar) {
        eVar.j(this.f8844x);
        eVar.j(this.f8845y);
        eVar.j(this.f8846z);
        eVar.j(this.A);
        if (this.P > 0) {
            eVar.j(this.B);
        }
    }

    public d h(c cVar) {
        switch (cVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f8844x;
            case 2:
                return this.f8845y;
            case 3:
                return this.f8846z;
            case 4:
                return this.A;
            case 5:
                return this.B;
            case 6:
                return this.E;
            case zzaja.zze.zzg /* 7 */:
                return this.C;
            case 8:
                return this.D;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final int i(int i10) {
        int[] iArr = this.f8824c0;
        if (i10 == 0) {
            return iArr[0];
        }
        if (i10 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int j() {
        if (this.V == 8) {
            return 0;
        }
        return this.K;
    }

    public final e k(int i10) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.f8846z;
            d dVar4 = dVar3.f8815d;
            if (dVar4 != null && dVar4.f8815d == dVar3) {
                return dVar4.f8813b;
            }
            return null;
        }
        if (i10 == 1 && (dVar2 = (dVar = this.A).f8815d) != null && dVar2.f8815d == dVar) {
            return dVar2.f8813b;
        }
        return null;
    }

    public final e l(int i10) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.f8844x;
            d dVar4 = dVar3.f8815d;
            if (dVar4 != null && dVar4.f8815d == dVar3) {
                return dVar4.f8813b;
            }
            return null;
        }
        if (i10 == 1 && (dVar2 = (dVar = this.f8845y).f8815d) != null && dVar2.f8815d == dVar) {
            return dVar2.f8813b;
        }
        return null;
    }

    public final int m() {
        if (this.V == 8) {
            return 0;
        }
        return this.J;
    }

    public final int n() {
        e eVar = this.I;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).f8853j0 + this.N;
        }
        return this.N;
    }

    public final int o() {
        e eVar = this.I;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).f8854k0 + this.O;
        }
        return this.O;
    }

    public final void p(c cVar, e eVar, c cVar2, int i10, int i11) {
        h(cVar).b(eVar.h(cVar2), i10, i11, true);
    }

    public final boolean q(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.F;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f8815d;
        if (dVar4 != null && dVar4.f8815d != dVar3 && (dVar2 = (dVar = dVarArr[i11 + 1]).f8815d) != null && dVar2.f8815d == dVar) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        d dVar = this.f8844x;
        d dVar2 = dVar.f8815d;
        if (dVar2 == null || dVar2.f8815d != dVar) {
            d dVar3 = this.f8846z;
            d dVar4 = dVar3.f8815d;
            if (dVar4 != null && dVar4.f8815d == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean s() {
        d dVar = this.f8845y;
        d dVar2 = dVar.f8815d;
        if (dVar2 == null || dVar2.f8815d != dVar) {
            d dVar3 = this.A;
            d dVar4 = dVar3.f8815d;
            if (dVar4 != null && dVar4.f8815d == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void t() {
        this.f8844x.h();
        this.f8845y.h();
        this.f8846z.h();
        this.A.h();
        this.B.h();
        this.C.h();
        this.D.h();
        this.E.h();
        this.I = null;
        this.f8842v = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        int[] iArr = this.f8824c0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.U = null;
        this.V = 0;
        this.X = 0;
        this.Y = 0;
        float[] fArr = this.Z;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f8829h = -1;
        this.f8830i = -1;
        int[] iArr2 = this.f8841u;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f8831j = 0;
        this.f8832k = 0;
        this.o = 1.0f;
        this.f8838r = 1.0f;
        this.f8835n = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f8837q = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f8834m = 0;
        this.f8836p = 0;
        this.f8839s = -1;
        this.f8840t = 1.0f;
        boolean[] zArr = this.f8827f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.H;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.W != null) {
            str = a3.g.t(new StringBuilder("id: "), this.W, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.N);
        sb.append(", ");
        sb.append(this.O);
        sb.append(") - (");
        sb.append(this.J);
        sb.append(" x ");
        sb.append(this.K);
        sb.append(")");
        return sb.toString();
    }

    public final void u() {
        e eVar = this.I;
        if (eVar != null && (eVar instanceof f)) {
            ((f) eVar).getClass();
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) arrayList.get(i10)).h();
        }
    }

    public void v(i.g gVar) {
        this.f8844x.i();
        this.f8845y.i();
        this.f8846z.i();
        this.A.i();
        this.B.i();
        this.E.i();
        this.C.i();
        this.D.i();
    }

    public final void w(int i10) {
        this.K = i10;
        int i11 = this.R;
        if (i10 < i11) {
            this.K = i11;
        }
    }

    public final void x(int i10) {
        this.f8824c0[0] = i10;
    }

    public final void y(int i10) {
        this.f8824c0[1] = i10;
    }

    public final void z(int i10) {
        this.J = i10;
        int i11 = this.Q;
        if (i10 < i11) {
            this.J = i11;
        }
    }
}
