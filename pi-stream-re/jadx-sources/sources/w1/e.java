package w1;

import android.util.SparseArray;
import c1.v;
import d2.b0;
import d2.g0;
import d2.r;
import d2.t;

/* loaded from: classes.dex */
public final class e implements r, h {
    public static final c1.r A = new c1.r(2);
    public static final t B = new t();

    /* renamed from: a, reason: collision with root package name */
    public final d2.p f10757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10758b;

    /* renamed from: c, reason: collision with root package name */
    public final v f10759c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f10760d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f10761e;

    /* renamed from: f, reason: collision with root package name */
    public g f10762f;

    /* renamed from: x, reason: collision with root package name */
    public long f10763x;

    /* renamed from: y, reason: collision with root package name */
    public b0 f10764y;

    /* renamed from: z, reason: collision with root package name */
    public v[] f10765z;

    public e(d2.p pVar, int i10, v vVar) {
        this.f10757a = pVar;
        this.f10758b = i10;
        this.f10759c = vVar;
    }

    public final void a(g gVar, long j4, long j10) {
        this.f10762f = gVar;
        this.f10763x = j10;
        boolean z9 = this.f10761e;
        d2.p pVar = this.f10757a;
        if (!z9) {
            pVar.f(this);
            if (j4 != -9223372036854775807L) {
                pVar.e(0L, j4);
            }
            this.f10761e = true;
            return;
        }
        if (j4 == -9223372036854775807L) {
            j4 = 0;
        }
        pVar.e(0L, j4);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f10760d;
            if (i10 < sparseArray.size()) {
                ((d) sparseArray.valueAt(i10)).g(gVar, j10);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // d2.r
    public final void b() {
        SparseArray sparseArray = this.f10760d;
        v[] vVarArr = new v[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            v vVar = ((d) sparseArray.valueAt(i10)).f10754d;
            w7.b.w(vVar);
            vVarArr[i10] = vVar;
        }
        this.f10765z = vVarArr;
    }

    @Override // d2.r
    public final g0 i(int i10, int i11) {
        boolean z9;
        v vVar;
        SparseArray sparseArray = this.f10760d;
        d dVar = (d) sparseArray.get(i10);
        if (dVar == null) {
            if (this.f10765z == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.u(z9);
            if (i11 == this.f10758b) {
                vVar = this.f10759c;
            } else {
                vVar = null;
            }
            dVar = new d(i10, i11, vVar);
            dVar.g(this.f10762f, this.f10763x);
            sparseArray.put(i10, dVar);
        }
        return dVar;
    }

    @Override // d2.r
    public final void s(b0 b0Var) {
        this.f10764y = b0Var;
    }
}
