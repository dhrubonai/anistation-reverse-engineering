package v1;

import android.net.Uri;
import j1.j1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c1 implements u, z1.j {
    public final c1.v A;
    public final boolean B;
    public boolean C;
    public byte[] D;
    public int E;

    /* renamed from: a, reason: collision with root package name */
    public final h1.l f10375a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.g f10376b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.e0 f10377c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.q0 f10378d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f10379e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f10380f;

    /* renamed from: y, reason: collision with root package name */
    public final long f10382y;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f10381x = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final z1.o f10383z = new z1.o("SingleSampleMediaPeriod");

    public c1(h1.l lVar, h1.g gVar, h1.e0 e0Var, c1.v vVar, long j4, androidx.lifecycle.q0 q0Var, b0 b0Var, boolean z9) {
        this.f10375a = lVar;
        this.f10376b = gVar;
        this.f10377c = e0Var;
        this.A = vVar;
        this.f10382y = j4;
        this.f10378d = q0Var;
        this.f10379e = b0Var;
        this.B = z9;
        this.f10380f = new g1(new c1.f1("", vVar));
    }

    @Override // v1.x0
    public final boolean c() {
        return this.f10383z.e();
    }

    @Override // v1.u
    public final long d(long j4, j1 j1Var) {
        return j4;
    }

    @Override // z1.j
    public final void f(z1.l lVar, long j4, long j10) {
        b1 b1Var = (b1) lVar;
        this.E = (int) b1Var.f10370c.f4561b;
        byte[] bArr = b1Var.f10371d;
        bArr.getClass();
        this.D = bArr;
        this.C = true;
        Uri uri = b1Var.f10370c.f4562c;
        n nVar = new n(j10);
        this.f10378d.getClass();
        this.f10379e.g(nVar, 1, -1, this.A, 0, null, 0L, this.f10382y);
    }

    @Override // v1.x0
    public final long h() {
        if (!this.C && !this.f10383z.e()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // v1.u
    public final long j() {
        return -9223372036854775807L;
    }

    @Override // v1.u
    public final void k(t tVar, long j4) {
        tVar.i(this);
    }

    @Override // v1.u
    public final long l(y1.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j4) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            v0 v0Var = v0VarArr[i10];
            ArrayList arrayList = this.f10381x;
            if (v0Var != null && (sVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(v0Var);
                v0VarArr[i10] = null;
            }
            if (v0VarArr[i10] == null && sVarArr[i10] != null) {
                a1 a1Var = new a1(this);
                arrayList.add(a1Var);
                v0VarArr[i10] = a1Var;
                zArr2[i10] = true;
            }
        }
        return j4;
    }

    @Override // v1.u
    public final g1 m() {
        return this.f10380f;
    }

    @Override // v1.x0
    public final boolean n(j1.n0 n0Var) {
        if (!this.C) {
            z1.o oVar = this.f10383z;
            if (!oVar.e() && !oVar.d()) {
                h1.h a10 = this.f10376b.a();
                h1.e0 e0Var = this.f10377c;
                if (e0Var != null) {
                    a10.f(e0Var);
                }
                b1 b1Var = new b1(a10, this.f10375a);
                this.f10379e.m(new n(b1Var.f10368a, this.f10375a, oVar.g(b1Var, this, this.f10378d.z(1))), 1, -1, this.A, 0, null, 0L, this.f10382y);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // v1.x0
    public final long o() {
        if (this.C) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // v1.u
    public final void p() {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @Override // z1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z1.i q(z1.l r18, long r19, long r21, java.io.IOException r23, int r24) {
        /*
            r17 = this;
            r0 = r17
            r12 = r23
            r1 = r24
            r2 = r18
            v1.b1 r2 = (v1.b1) r2
            h1.d0 r2 = r2.f10370c
            v1.n r3 = new v1.n
            android.net.Uri r2 = r2.f4562c
            r4 = r21
            r3.<init>(r4)
            long r4 = r0.f10382y
            f1.b0.c0(r4)
            androidx.lifecycle.q0 r2 = r0.f10378d
            r2.getClass()
            boolean r4 = r12 instanceof c1.r0
            r5 = 1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            if (r4 != 0) goto L5f
            boolean r4 = r12 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L5f
            boolean r4 = r12 instanceof h1.v
            if (r4 != 0) goto L5f
            boolean r4 = r12 instanceof z1.n
            if (r4 != 0) goto L5f
            int r4 = h1.i.f4582b
            r4 = r12
        L39:
            if (r4 == 0) goto L4f
            boolean r9 = r4 instanceof h1.i
            if (r9 == 0) goto L4a
            r9 = r4
            h1.i r9 = (h1.i) r9
            int r9 = r9.f4583a
            r10 = 2008(0x7d8, float:2.814E-42)
            if (r9 != r10) goto L4a
            r4 = r5
            goto L50
        L4a:
            java.lang.Throwable r4 = r4.getCause()
            goto L39
        L4f:
            r4 = r8
        L50:
            if (r4 == 0) goto L53
            goto L5f
        L53:
            int r4 = r1 + (-1)
            int r4 = r4 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r9)
            long r9 = (long) r4
            goto L60
        L5f:
            r9 = r6
        L60:
            int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r4 == 0) goto L6d
            int r2 = r2.z(r5)
            if (r1 < r2) goto L6b
            goto L6d
        L6b:
            r1 = r8
            goto L6e
        L6d:
            r1 = r5
        L6e:
            boolean r2 = r0.B
            if (r2 == 0) goto L80
            if (r1 == 0) goto L80
            java.lang.String r1 = "SingleSampleMediaPeriod"
            java.lang.String r2 = "Loading failed, treating as end-of-stream."
            f1.o.g(r1, r2, r12)
            r0.C = r5
            z1.i r1 = z1.o.f11940e
            goto L89
        L80:
            if (r4 == 0) goto L87
            z1.i r1 = z1.o.c(r9, r8)
            goto L89
        L87:
            z1.i r1 = z1.o.f11941f
        L89:
            r14 = r1
            boolean r1 = r14.a()
            r13 = r1 ^ 1
            v1.b0 r1 = r0.f10379e
            r4 = 1
            r5 = -1
            c1.v r6 = r0.A
            r7 = 0
            r8 = 0
            long r10 = r0.f10382y
            r15 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r15
            r12 = r23
            r1.i(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.c1.q(z1.l, long, long, java.io.IOException, int):z1.i");
    }

    @Override // z1.j
    public final void r(z1.l lVar, long j4, long j10, boolean z9) {
        Uri uri = ((b1) lVar).f10370c.f4562c;
        n nVar = new n(j10);
        this.f10378d.getClass();
        this.f10379e.d(nVar, 1, -1, null, 0, null, 0L, this.f10382y);
    }

    @Override // v1.u
    public final long t(long j4) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f10381x;
            if (i10 < arrayList.size()) {
                a1 a1Var = (a1) arrayList.get(i10);
                if (a1Var.f10362a == 2) {
                    a1Var.f10362a = 1;
                }
                i10++;
            } else {
                return j4;
            }
        }
    }

    @Override // v1.u
    public final void u(long j4) {
    }

    @Override // v1.x0
    public final void v(long j4) {
    }
}
