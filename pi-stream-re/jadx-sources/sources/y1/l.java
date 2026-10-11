package y1;

import c1.f1;
import java.util.Comparator;
import r6.e0;
import r6.l1;
import r6.o0;
import r6.u1;

/* loaded from: classes.dex */
public final class l extends n implements Comparable {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;

    /* renamed from: e, reason: collision with root package name */
    public final int f11501e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11502f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11503x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f11504y;

    /* renamed from: z, reason: collision with root package name */
    public final int f11505z;

    public l(int i10, f1 f1Var, int i11, j jVar, int i12, String str) {
        super(i10, i11, f1Var);
        boolean z9;
        boolean z10;
        o0 o0Var;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14 = 0;
        this.f11502f = p.h(i12, false);
        int i15 = this.f11509d.f1927e & (~jVar.f1794v);
        if ((i15 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f11503x = z9;
        if ((i15 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11504y = z10;
        o0 o0Var2 = jVar.f1792t;
        if (o0Var2.isEmpty()) {
            o0Var = o0.o("");
        } else {
            o0Var = o0Var2;
        }
        int i16 = 0;
        while (true) {
            if (i16 < o0Var.size()) {
                i13 = p.f(this.f11509d, (String) o0Var.get(i16), jVar.f1795w);
                if (i13 > 0) {
                    break;
                } else {
                    i16++;
                }
            } else {
                i16 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                i13 = 0;
                break;
            }
        }
        this.f11505z = i16;
        this.A = i13;
        int b10 = p.b(this.f11509d.f1928f, jVar.f1793u);
        this.B = b10;
        if ((this.f11509d.f1928f & 1088) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D = z11;
        if (p.j(str) == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int f10 = p.f(this.f11509d, str, z12);
        this.C = f10;
        if (i13 <= 0 && ((!o0Var2.isEmpty() || b10 <= 0) && !this.f11503x && (!this.f11504y || f10 <= 0))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (p.h(i12, jVar.N) && z13) {
            i14 = 1;
        }
        this.f11501e = i14;
    }

    @Override // y1.n
    public final int a() {
        return this.f11501e;
    }

    @Override // y1.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        e0 c6 = e0.f9450a.c(this.f11502f, lVar.f11502f);
        Integer valueOf = Integer.valueOf(this.f11505z);
        Integer valueOf2 = Integer.valueOf(lVar.f11505z);
        Comparator comparator = l1.f9489a;
        comparator.getClass();
        u1 u1Var = u1.f9551a;
        e0 b10 = c6.b(valueOf, valueOf2, u1Var);
        int i10 = this.A;
        e0 a10 = b10.a(i10, lVar.A);
        int i11 = this.B;
        e0 c10 = a10.a(i11, lVar.B).c(this.f11503x, lVar.f11503x);
        Boolean valueOf3 = Boolean.valueOf(this.f11504y);
        Boolean valueOf4 = Boolean.valueOf(lVar.f11504y);
        if (i10 != 0) {
            comparator = u1Var;
        }
        e0 a11 = c10.b(valueOf3, valueOf4, comparator).a(this.C, lVar.C);
        if (i11 == 0) {
            a11 = a11.d(this.D, lVar.D);
        }
        return a11.e();
    }
}
