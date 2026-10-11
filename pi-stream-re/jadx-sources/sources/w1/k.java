package w1;

import android.net.Uri;
import androidx.appcompat.widget.a0;
import androidx.lifecycle.q0;
import c1.r;
import c1.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m1.s;
import v1.b0;
import v1.u0;
import v1.v0;
import v1.w0;
import v1.x0;

/* loaded from: classes.dex */
public final class k implements v0, x0, z1.j, z1.m {
    public final ArrayList B;
    public final List C;
    public final u0 D;
    public final u0[] E;
    public final c F;
    public f G;
    public v H;
    public j I;
    public long J;
    public long K;
    public int L;
    public a M;
    public boolean N;

    /* renamed from: a, reason: collision with root package name */
    public final int f10780a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10781b;

    /* renamed from: c, reason: collision with root package name */
    public final v[] f10782c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f10783d;

    /* renamed from: e, reason: collision with root package name */
    public final m1.a f10784e;

    /* renamed from: f, reason: collision with root package name */
    public final w0 f10785f;

    /* renamed from: x, reason: collision with root package name */
    public final b0 f10786x;

    /* renamed from: y, reason: collision with root package name */
    public final q0 f10787y;

    /* renamed from: z, reason: collision with root package name */
    public final z1.o f10788z = new z1.o("ChunkSampleStream");
    public final r A = new r(3);

    public k(int i10, int[] iArr, v[] vVarArr, m1.p pVar, w0 w0Var, z1.d dVar, long j4, o1.q qVar, o1.n nVar, q0 q0Var, b0 b0Var) {
        this.f10780a = i10;
        this.f10781b = iArr;
        this.f10782c = vVarArr;
        this.f10784e = pVar;
        this.f10785f = w0Var;
        this.f10786x = b0Var;
        this.f10787y = q0Var;
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        this.C = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new u0[length];
        this.f10783d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        u0[] u0VarArr = new u0[i11];
        qVar.getClass();
        nVar.getClass();
        u0 u0Var = new u0(dVar, qVar, nVar);
        this.D = u0Var;
        int i12 = 0;
        iArr2[0] = i10;
        u0VarArr[0] = u0Var;
        while (i12 < length) {
            u0 u0Var2 = new u0(dVar, null, null);
            this.E[i12] = u0Var2;
            int i13 = i12 + 1;
            u0VarArr[i13] = u0Var2;
            iArr2[i13] = this.f10781b[i12];
            i12 = i13;
        }
        this.F = new c(iArr2, u0VarArr);
        this.J = j4;
        this.K = j4;
    }

    public final int A(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.B;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).d(0) <= i10);
        return i11 - 1;
    }

    public final void B(j jVar) {
        this.I = jVar;
        u0 u0Var = this.D;
        u0Var.j();
        o1.k kVar = u0Var.f10541h;
        if (kVar != null) {
            kVar.a(u0Var.f10538e);
            u0Var.f10541h = null;
            u0Var.f10540g = null;
        }
        for (u0 u0Var2 : this.E) {
            u0Var2.j();
            o1.k kVar2 = u0Var2.f10541h;
            if (kVar2 != null) {
                kVar2.a(u0Var2.f10538e);
                u0Var2.f10541h = null;
                u0Var2.f10540g = null;
            }
        }
        this.f10788z.f(this);
    }

    public final i C(int i10, long j4) {
        int i11 = 0;
        while (true) {
            u0[] u0VarArr = this.E;
            if (i11 < u0VarArr.length) {
                if (this.f10781b[i11] == i10) {
                    boolean[] zArr = this.f10783d;
                    w7.b.u(!zArr[i11]);
                    zArr[i11] = true;
                    u0VarArr[i11].D(j4, true);
                    return new i(this, this, u0VarArr[i11], i11);
                }
                i11++;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // v1.v0
    public final boolean a() {
        if (!y() && this.D.u(this.N)) {
            return true;
        }
        return false;
    }

    @Override // v1.v0
    public final void b() {
        z1.o oVar = this.f10788z;
        oVar.b();
        this.D.w();
        if (!oVar.e()) {
            m1.p pVar = (m1.p) this.f10784e;
            v1.b bVar = pVar.f7117m;
            if (bVar == null) {
                pVar.f7105a.b();
                return;
            }
            throw bVar;
        }
    }

    @Override // v1.x0
    public final boolean c() {
        return this.f10788z.e();
    }

    @Override // z1.m
    public final void e() {
        u0 u0Var = this.D;
        u0Var.A(true);
        o1.k kVar = u0Var.f10541h;
        if (kVar != null) {
            kVar.a(u0Var.f10538e);
            u0Var.f10541h = null;
            u0Var.f10540g = null;
        }
        for (u0 u0Var2 : this.E) {
            u0Var2.A(true);
            o1.k kVar2 = u0Var2.f10541h;
            if (kVar2 != null) {
                kVar2.a(u0Var2.f10538e);
                u0Var2.f10541h = null;
                u0Var2.f10540g = null;
            }
        }
        for (m1.n nVar : ((m1.p) this.f10784e).f7113i) {
            h hVar = nVar.f7098a;
            if (hVar != null) {
                ((e) hVar).f10757a.a();
            }
        }
        j jVar = this.I;
        if (jVar != null) {
            m1.d dVar = (m1.d) jVar;
            synchronized (dVar) {
                s sVar = (s) dVar.E.remove(this);
                if (sVar != null) {
                    u0 u0Var3 = sVar.f7129a;
                    u0Var3.A(true);
                    o1.k kVar3 = u0Var3.f10541h;
                    if (kVar3 != null) {
                        kVar3.a(u0Var3.f10538e);
                        u0Var3.f10541h = null;
                        u0Var3.f10540g = null;
                    }
                }
            }
        }
    }

    @Override // z1.j
    public final void f(z1.l lVar, long j4, long j10) {
        f fVar = (f) lVar;
        d2.j jVar = null;
        this.G = null;
        m1.p pVar = (m1.p) this.f10784e;
        pVar.getClass();
        if (fVar instanceof m) {
            int d10 = pVar.f7114j.d(((m) fVar).f10769d);
            m1.n[] nVarArr = pVar.f7113i;
            m1.n nVar = nVarArr[d10];
            if (nVar.f7101d == null) {
                h hVar = nVar.f7098a;
                w7.b.w(hVar);
                d2.b0 b0Var = ((e) hVar).f10764y;
                if (b0Var instanceof d2.j) {
                    jVar = (d2.j) b0Var;
                }
                if (jVar != null) {
                    n1.m mVar = nVar.f7099b;
                    nVarArr[d10] = new m1.n(nVar.f7102e, mVar, nVar.f7100c, nVar.f7098a, nVar.f7103f, new m1.l(jVar, mVar.f7961c));
                }
            }
        }
        s sVar = pVar.f7112h;
        if (sVar != null) {
            long j11 = sVar.f7132d;
            if (j11 == -9223372036854775807L || fVar.f10773y > j11) {
                sVar.f7132d = fVar.f10773y;
            }
            sVar.f7133e.f7140x = true;
        }
        long j12 = fVar.f10766a;
        Uri uri = fVar.f10774z.f4562c;
        v1.n nVar2 = new v1.n(j10);
        this.f10787y.getClass();
        this.f10786x.g(nVar2, fVar.f10768c, this.f10780a, fVar.f10769d, fVar.f10770e, fVar.f10771f, fVar.f10772x, fVar.f10773y);
        this.f10785f.s(this);
    }

    @Override // v1.v0
    public final int g(a0 a0Var, i1.h hVar, int i10) {
        if (y()) {
            return -3;
        }
        a aVar = this.M;
        u0 u0Var = this.D;
        if (aVar != null && aVar.d(0) <= u0Var.f10549q + u0Var.f10551s) {
            return -3;
        }
        z();
        return u0Var.z(a0Var, hVar, i10, this.N);
    }

    @Override // v1.x0
    public final long h() {
        if (y()) {
            return this.J;
        }
        if (this.N) {
            return Long.MIN_VALUE;
        }
        return w().f10773y;
    }

    @Override // v1.v0
    public final int i(long j4) {
        if (y()) {
            return 0;
        }
        u0 u0Var = this.D;
        int s9 = u0Var.s(j4, this.N);
        a aVar = this.M;
        if (aVar != null) {
            s9 = Math.min(s9, aVar.d(0) - (u0Var.f10549q + u0Var.f10551s));
        }
        u0Var.E(s9);
        z();
        return s9;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03e8  */
    @Override // v1.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(j1.n0 r61) {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.k.n(j1.n0):boolean");
    }

    @Override // v1.x0
    public final long o() {
        if (this.N) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.J;
        }
        long j4 = this.K;
        a w9 = w();
        if (!w9.b()) {
            ArrayList arrayList = this.B;
            if (arrayList.size() > 1) {
                w9 = (a) arrayList.get(arrayList.size() - 2);
            } else {
                w9 = null;
            }
        }
        if (w9 != null) {
            j4 = Math.max(j4, w9.f10773y);
        }
        return Math.max(j4, this.D.o());
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163 A[LOOP:1: B:88:0x015d->B:90:0x0163, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018d A[LOOP:2: B:93:0x0187->B:95:0x018d, LOOP_END] */
    @Override // z1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z1.i q(z1.l r24, long r25, long r27, java.io.IOException r29, int r30) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.k.q(z1.l, long, long, java.io.IOException, int):z1.i");
    }

    @Override // z1.j
    public final void r(z1.l lVar, long j4, long j10, boolean z9) {
        f fVar = (f) lVar;
        this.G = null;
        this.M = null;
        long j11 = fVar.f10766a;
        Uri uri = fVar.f10774z.f4562c;
        v1.n nVar = new v1.n(j10);
        this.f10787y.getClass();
        this.f10786x.d(nVar, fVar.f10768c, this.f10780a, fVar.f10769d, fVar.f10770e, fVar.f10771f, fVar.f10772x, fVar.f10773y);
        if (!z9) {
            if (y()) {
                this.D.A(false);
                for (u0 u0Var : this.E) {
                    u0Var.A(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.B;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
            }
            this.f10785f.s(this);
        }
    }

    public final a s(int i10) {
        ArrayList arrayList = this.B;
        a aVar = (a) arrayList.get(i10);
        f1.b0.T(i10, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i11 = 0;
        this.D.l(aVar.d(0));
        while (true) {
            u0[] u0VarArr = this.E;
            if (i11 < u0VarArr.length) {
                u0 u0Var = u0VarArr[i11];
                i11++;
                u0Var.l(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    @Override // v1.x0
    public final void v(long j4) {
        int size;
        z1.o oVar = this.f10788z;
        if (!oVar.d() && !y()) {
            boolean e10 = oVar.e();
            ArrayList arrayList = this.B;
            boolean z9 = false;
            List list = this.C;
            m1.a aVar = this.f10784e;
            if (e10) {
                f fVar = this.G;
                fVar.getClass();
                boolean z10 = fVar instanceof a;
                if (z10 && x(arrayList.size() - 1)) {
                    return;
                }
                m1.p pVar = (m1.p) aVar;
                if (pVar.f7117m == null) {
                    z9 = pVar.f7114j.s(j4, fVar, list);
                }
                if (z9) {
                    oVar.a();
                    if (z10) {
                        this.M = (a) fVar;
                        return;
                    }
                    return;
                }
                return;
            }
            m1.p pVar2 = (m1.p) aVar;
            if (pVar2.f7117m == null && pVar2.f7114j.length() >= 2) {
                size = pVar2.f7114j.g(j4, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                w7.b.u(!oVar.e());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!x(size)) {
                            break;
                        } else {
                            size++;
                        }
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j10 = w().f10773y;
                    a s9 = s(size);
                    if (arrayList.isEmpty()) {
                        this.J = this.K;
                    }
                    this.N = false;
                    int i10 = this.f10780a;
                    b0 b0Var = this.f10786x;
                    b0Var.getClass();
                    b0Var.o(new v1.s(1, i10, null, 3, null, f1.b0.c0(s9.f10772x), f1.b0.c0(j10)));
                }
            }
        }
    }

    public final a w() {
        return (a) this.B.get(r0.size() - 1);
    }

    public final boolean x(int i10) {
        u0 u0Var;
        a aVar = (a) this.B.get(i10);
        u0 u0Var2 = this.D;
        if (u0Var2.f10549q + u0Var2.f10551s > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            u0[] u0VarArr = this.E;
            if (i11 >= u0VarArr.length) {
                return false;
            }
            u0Var = u0VarArr[i11];
            i11++;
        } while (u0Var.f10549q + u0Var.f10551s <= aVar.d(i11));
        return true;
    }

    public final boolean y() {
        if (this.J != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        u0 u0Var = this.D;
        int A = A(u0Var.f10549q + u0Var.f10551s, this.L - 1);
        while (true) {
            int i10 = this.L;
            if (i10 <= A) {
                this.L = i10 + 1;
                a aVar = (a) this.B.get(i10);
                v vVar = aVar.f10769d;
                if (!vVar.equals(this.H)) {
                    this.f10786x.a(this.f10780a, vVar, aVar.f10770e, aVar.f10771f, aVar.f10772x);
                }
                this.H = vVar;
            } else {
                return;
            }
        }
    }
}
