package p1;

import android.net.Uri;
import android.util.SparseArray;
import androidx.lifecycle.q0;
import c1.r0;
import f.p0;
import h1.e0;
import j1.j1;
import j1.n0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k1.i0;
import r6.h0;
import r6.m0;
import r6.n1;
import r6.o0;
import v1.b0;
import v1.g1;

/* loaded from: classes.dex */
public final class n implements v1.u, q1.q {
    public final IdentityHashMap A;
    public final p0 B;
    public final j6.e C;
    public final boolean D;
    public final int E;
    public final boolean F;
    public final i0 G;
    public final p0 H = new p0(this);
    public final long I;
    public v1.t J;
    public int K;
    public g1 L;
    public t[] M;
    public t[] N;
    public int O;
    public v1.i P;

    /* renamed from: a, reason: collision with root package name */
    public final k f8464a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.s f8465b;

    /* renamed from: c, reason: collision with root package name */
    public final c f8466c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f8467d;

    /* renamed from: e, reason: collision with root package name */
    public final o1.q f8468e;

    /* renamed from: f, reason: collision with root package name */
    public final o1.n f8469f;

    /* renamed from: x, reason: collision with root package name */
    public final q0 f8470x;

    /* renamed from: y, reason: collision with root package name */
    public final b0 f8471y;

    /* renamed from: z, reason: collision with root package name */
    public final z1.d f8472z;

    public n(k kVar, q1.s sVar, c cVar, e0 e0Var, o1.q qVar, o1.n nVar, q0 q0Var, b0 b0Var, z1.d dVar, j6.e eVar, boolean z9, int i10, boolean z10, i0 i0Var, long j4) {
        this.f8464a = kVar;
        this.f8465b = sVar;
        this.f8466c = cVar;
        this.f8467d = e0Var;
        this.f8468e = qVar;
        this.f8469f = nVar;
        this.f8470x = q0Var;
        this.f8471y = b0Var;
        this.f8472z = dVar;
        this.C = eVar;
        this.D = z9;
        this.E = i10;
        this.F = z10;
        this.G = i0Var;
        this.I = j4;
        eVar.getClass();
        m0 m0Var = o0.f9505b;
        n1 n1Var = n1.f9497e;
        this.P = new v1.i(n1Var, n1Var);
        this.A = new IdentityHashMap();
        this.B = new p0(22, 0);
        this.M = new t[0];
        this.N = new t[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    public static c1.v f(c1.v vVar, c1.v vVar2, boolean z9) {
        int i10;
        int i11;
        String str;
        String str2;
        int i12;
        c1.p0 p0Var;
        String str3;
        List list;
        int i13;
        m0 m0Var = o0.f9505b;
        n1 n1Var = n1.f9497e;
        int i14 = -1;
        if (vVar2 != null) {
            str3 = vVar2.f1932j;
            p0Var = vVar2.f1933k;
            i12 = vVar2.f1947z;
            i10 = vVar2.f1927e;
            i11 = vVar2.f1928f;
            str = vVar2.f1926d;
            str2 = vVar2.f1924b;
            list = vVar2.f1925c;
        } else {
            String s9 = f1.b0.s(1, vVar.f1932j);
            if (z9) {
                int i15 = vVar.f1947z;
                int i16 = vVar.f1927e;
                int i17 = vVar.f1928f;
                String str4 = vVar.f1926d;
                str2 = vVar.f1924b;
                i11 = i17;
                i12 = i15;
                n1Var = vVar.f1925c;
                str = str4;
                i10 = i16;
            } else {
                i10 = 0;
                i11 = 0;
                str = null;
                str2 = null;
                i12 = -1;
            }
            p0Var = vVar.f1933k;
            n1 n1Var2 = n1Var;
            str3 = s9;
            list = n1Var2;
        }
        String e10 = c1.q0.e(str3);
        if (z9) {
            i13 = vVar.f1929g;
        } else {
            i13 = -1;
        }
        if (z9) {
            i14 = vVar.f1930h;
        }
        c1.u uVar = new c1.u();
        uVar.f1897a = vVar.f1923a;
        uVar.f1898b = str2;
        uVar.d(list);
        uVar.b(vVar.f1934l);
        uVar.e(e10);
        uVar.f1905i = str3;
        uVar.f1906j = p0Var;
        uVar.f1903g = i13;
        uVar.f1904h = i14;
        uVar.f1920y = i12;
        uVar.f1901e = i10;
        uVar.f1902f = i11;
        uVar.f1900d = str;
        return new c1.v(uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055 A[SYNTHETIC] */
    @Override // q1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.net.Uri r17, f1.r r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            p1.t[] r2 = r0.M
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La6
            r8 = r2[r6]
            p1.j r9 = r8.f8506d
            android.net.Uri[] r10 = r9.f8444e
            boolean r10 = f1.b0.j(r10, r1)
            if (r10 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto La1
        L1d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            y1.s r12 = r9.f8456r
            z1.h r12 = p7.a0.o(r12)
            androidx.lifecycle.q0 r8 = r8.f8523z
            r8.getClass()
            r8 = r18
            z1.i r12 = androidx.lifecycle.q0.y(r12, r8)
            if (r12 == 0) goto L41
            int r13 = r12.f11928a
            r14 = 2
            if (r13 != r14) goto L41
            long r12 = r12.f11929b
            goto L42
        L3f:
            r8 = r18
        L41:
            r12 = r10
        L42:
            r14 = 0
        L43:
            android.net.Uri[] r15 = r9.f8444e
            int r4 = r15.length
            r5 = -1
            if (r14 >= r4) goto L55
            r4 = r15[r14]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L52
            goto L56
        L52:
            int r14 = r14 + 1
            goto L43
        L55:
            r14 = r5
        L56:
            if (r14 != r5) goto L5a
        L58:
            r5 = 1
            goto L97
        L5a:
            y1.s r4 = r9.f8456r
            int r4 = r4.u(r14)
            if (r4 != r5) goto L63
            goto L58
        L63:
            boolean r5 = r9.f8458t
            android.net.Uri r14 = r9.f8454p
            boolean r14 = r1.equals(r14)
            r5 = r5 | r14
            r9.f8458t = r5
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 == 0) goto L58
            y1.s r5 = r9.f8456r
            boolean r4 = r5.o(r4, r12)
            if (r4 == 0) goto L94
            q1.s r4 = r9.f8446g
            q1.c r4 = (q1.c) r4
            java.util.HashMap r4 = r4.f8985d
            java.lang.Object r4 = r4.get(r1)
            q1.b r4 = (q1.b) r4
            if (r4 == 0) goto L8f
            boolean r4 = q1.b.a(r4, r12)
            r5 = 1
            r4 = r4 ^ r5
            goto L91
        L8f:
            r5 = 1
            r4 = 0
        L91:
            if (r4 == 0) goto L95
            goto L97
        L94:
            r5 = 1
        L95:
            r4 = 0
            goto L98
        L97:
            r4 = r5
        L98:
            if (r4 == 0) goto La0
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto La0
            r4 = r5
            goto La1
        La0:
            r4 = 0
        La1:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La6:
            v1.t r1 = r0.J
            r1.s(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.n.a(android.net.Uri, f1.r, boolean):boolean");
    }

    @Override // q1.q
    public final void b() {
        for (t tVar : this.M) {
            ArrayList arrayList = tVar.E;
            if (!arrayList.isEmpty()) {
                l lVar = (l) h0.X(arrayList);
                int b10 = tVar.f8506d.b(lVar);
                if (b10 == 1) {
                    lVar.f8463c0 = true;
                } else if (b10 == 2 && !tVar.f8516k0) {
                    z1.o oVar = tVar.A;
                    if (oVar.e()) {
                        oVar.a();
                    }
                }
            }
        }
        this.J.s(this);
    }

    @Override // v1.x0
    public final boolean c() {
        return this.P.c();
    }

    @Override // v1.u
    public final long d(long j4, j1 j1Var) {
        boolean z9;
        q1.i iVar;
        long j10;
        t[] tVarArr = this.N;
        int length = tVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            t tVar = tVarArr[i10];
            if (tVar.R == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                j jVar = tVar.f8506d;
                int n9 = jVar.f8456r.n();
                Uri[] uriArr = jVar.f8444e;
                int length2 = uriArr.length;
                q1.s sVar = jVar.f8446g;
                if (n9 < length2 && n9 != -1) {
                    iVar = ((q1.c) sVar).a(true, uriArr[jVar.f8456r.j()]);
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    o0 o0Var = iVar.f9021r;
                    if (!o0Var.isEmpty() && iVar.f9048c) {
                        long j11 = iVar.f9012h - ((q1.c) sVar).E;
                        long j12 = j4 - j11;
                        int d10 = f1.b0.d(o0Var, Long.valueOf(j12), true);
                        long j13 = ((q1.f) o0Var.get(d10)).f8998e;
                        if (d10 != o0Var.size() - 1) {
                            j10 = ((q1.f) o0Var.get(d10 + 1)).f8998e;
                        } else {
                            j10 = j13;
                        }
                        return j1Var.a(j12, j13, j10) + j11;
                    }
                }
            } else {
                i10++;
            }
        }
        return j4;
    }

    public final t e(String str, int i10, Uri[] uriArr, c1.v[] vVarArr, c1.v vVar, List list, Map map, long j4) {
        return new t(str, i10, this.H, new j(this.f8464a, this.f8465b, uriArr, vVarArr, this.f8466c, this.f8467d, this.B, this.I, list, this.G), map, this.f8472z, j4, vVar, this.f8468e, this.f8469f, this.f8470x, this.f8471y, this.E);
    }

    @Override // v1.x0
    public final long h() {
        return this.P.h();
    }

    @Override // v1.u
    public final long j() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.HashMap] */
    @Override // v1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(v1.t r25, long r26) {
        /*
            Method dump skipped, instructions count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.n.k(v1.t, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025a  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // v1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(y1.s[] r37, boolean[] r38, v1.v0[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.n.l(y1.s[], boolean[], v1.v0[], boolean[], long):long");
    }

    @Override // v1.u
    public final g1 m() {
        g1 g1Var = this.L;
        g1Var.getClass();
        return g1Var;
    }

    @Override // v1.x0
    public final boolean n(n0 n0Var) {
        if (this.L == null) {
            for (t tVar : this.M) {
                if (!tVar.U) {
                    j1.m0 m0Var = new j1.m0();
                    m0Var.f5830a = tVar.f8512g0;
                    tVar.n(new n0(m0Var));
                }
            }
            return false;
        }
        return this.P.n(n0Var);
    }

    @Override // v1.x0
    public final long o() {
        return this.P.o();
    }

    @Override // v1.u
    public final void p() {
        for (t tVar : this.M) {
            tVar.E();
            if (tVar.f8516k0 && !tVar.U) {
                throw r0.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // v1.u
    public final long t(long j4) {
        t[] tVarArr = this.N;
        if (tVarArr.length > 0) {
            boolean H = tVarArr[0].H(j4, false);
            int i10 = 1;
            while (true) {
                t[] tVarArr2 = this.N;
                if (i10 >= tVarArr2.length) {
                    break;
                }
                tVarArr2[i10].H(j4, H);
                i10++;
            }
            if (H) {
                ((SparseArray) this.B.f3762b).clear();
            }
        }
        return j4;
    }

    @Override // v1.u
    public final void u(long j4) {
        for (t tVar : this.N) {
            if (tVar.T && !tVar.C()) {
                int length = tVar.M.length;
                for (int i10 = 0; i10 < length; i10++) {
                    tVar.M[i10].i(j4, tVar.f8509e0[i10]);
                }
            }
        }
    }

    @Override // v1.x0
    public final void v(long j4) {
        this.P.v(j4);
    }
}
