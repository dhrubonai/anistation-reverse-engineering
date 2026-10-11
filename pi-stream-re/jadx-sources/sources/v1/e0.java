package v1;

import j1.j1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import r6.n1;

/* loaded from: classes.dex */
public final class e0 implements u, t {

    /* renamed from: a, reason: collision with root package name */
    public final u[] f10402a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f10403b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.e f10404c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10405d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f10406e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public t f10407f;

    /* renamed from: x, reason: collision with root package name */
    public g1 f10408x;

    /* renamed from: y, reason: collision with root package name */
    public u[] f10409y;

    /* renamed from: z, reason: collision with root package name */
    public i f10410z;

    public e0(j6.e eVar, long[] jArr, u... uVarArr) {
        this.f10404c = eVar;
        this.f10402a = uVarArr;
        eVar.getClass();
        r6.m0 m0Var = r6.o0.f9505b;
        n1 n1Var = n1.f9497e;
        this.f10410z = new i(n1Var, n1Var);
        this.f10403b = new IdentityHashMap();
        this.f10409y = new u[0];
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            long j4 = jArr[i10];
            if (j4 != 0) {
                this.f10402a[i10] = new f1(uVarArr[i10], j4);
            }
        }
    }

    @Override // v1.x0
    public final boolean c() {
        return this.f10410z.c();
    }

    @Override // v1.u
    public final long d(long j4, j1 j1Var) {
        u uVar;
        u[] uVarArr = this.f10409y;
        if (uVarArr.length > 0) {
            uVar = uVarArr[0];
        } else {
            uVar = this.f10402a[0];
        }
        return uVar.d(j4, j1Var);
    }

    @Override // v1.x0
    public final long h() {
        return this.f10410z.h();
    }

    @Override // v1.t
    public final void i(u uVar) {
        ArrayList arrayList = this.f10405d;
        arrayList.remove(uVar);
        if (!arrayList.isEmpty()) {
            return;
        }
        u[] uVarArr = this.f10402a;
        int i10 = 0;
        for (u uVar2 : uVarArr) {
            i10 += uVar2.m().f10432a;
        }
        c1.f1[] f1VarArr = new c1.f1[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < uVarArr.length; i12++) {
            g1 m5 = uVarArr[i12].m();
            int i13 = m5.f10432a;
            int i14 = 0;
            while (i14 < i13) {
                c1.f1 a10 = m5.a(i14);
                c1.v[] vVarArr = new c1.v[a10.f1690a];
                for (int i15 = 0; i15 < a10.f1690a; i15++) {
                    c1.v vVar = a10.f1693d[i15];
                    c1.u a11 = vVar.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i12);
                    sb.append(":");
                    String str = vVar.f1923a;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    a11.f1897a = sb.toString();
                    vVarArr[i15] = a11.a();
                }
                c1.f1 f1Var = new c1.f1(i12 + ":" + a10.f1691b, vVarArr);
                this.f10406e.put(f1Var, a10);
                f1VarArr[i11] = f1Var;
                i14++;
                i11++;
            }
        }
        this.f10408x = new g1(f1VarArr);
        t tVar = this.f10407f;
        tVar.getClass();
        tVar.i(this);
    }

    @Override // v1.u
    public final long j() {
        long j4 = -9223372036854775807L;
        for (u uVar : this.f10409y) {
            long j10 = uVar.j();
            if (j10 != -9223372036854775807L) {
                if (j4 == -9223372036854775807L) {
                    for (u uVar2 : this.f10409y) {
                        if (uVar2 == uVar) {
                            break;
                        }
                        if (uVar2.t(j10) != j10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j4 = j10;
                } else if (j10 != j4) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j4 != -9223372036854775807L && uVar.t(j4) != j4) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j4;
    }

    @Override // v1.u
    public final void k(t tVar, long j4) {
        this.f10407f = tVar;
        ArrayList arrayList = this.f10405d;
        u[] uVarArr = this.f10402a;
        Collections.addAll(arrayList, uVarArr);
        for (u uVar : uVarArr) {
            uVar.k(this, j4);
        }
    }

    @Override // v1.u
    public final long l(y1.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j4) {
        IdentityHashMap identityHashMap;
        v0 v0Var;
        ArrayList arrayList;
        Integer num;
        int intValue;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f10403b;
            if (i11 >= length) {
                break;
            }
            v0 v0Var2 = v0VarArr[i11];
            if (v0Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(v0Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i11] = intValue;
            y1.s sVar = sVarArr[i11];
            if (sVar != null) {
                String str = sVar.k().f1691b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        v0[] v0VarArr2 = new v0[length2];
        v0[] v0VarArr3 = new v0[sVarArr.length];
        y1.s[] sVarArr2 = new y1.s[sVarArr.length];
        u[] uVarArr = this.f10402a;
        ArrayList arrayList2 = new ArrayList(uVarArr.length);
        long j10 = j4;
        int i12 = 0;
        while (i12 < uVarArr.length) {
            int i13 = i10;
            while (i13 < sVarArr.length) {
                if (iArr[i13] == i12) {
                    v0Var = v0VarArr[i13];
                } else {
                    v0Var = null;
                }
                v0VarArr3[i13] = v0Var;
                if (iArr2[i13] == i12) {
                    y1.s sVar2 = sVarArr[i13];
                    sVar2.getClass();
                    arrayList = arrayList2;
                    c1.f1 f1Var = (c1.f1) this.f10406e.get(sVar2.k());
                    f1Var.getClass();
                    sVarArr2[i13] = new d0(sVar2, f1Var);
                } else {
                    arrayList = arrayList2;
                    sVarArr2[i13] = null;
                }
                i13++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i14 = i12;
            u[] uVarArr2 = uVarArr;
            y1.s[] sVarArr3 = sVarArr2;
            long l10 = uVarArr[i12].l(sVarArr2, zArr, v0VarArr3, zArr2, j10);
            if (i14 == 0) {
                j10 = l10;
            } else if (l10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z9 = false;
            for (int i15 = 0; i15 < sVarArr.length; i15++) {
                boolean z10 = true;
                if (iArr2[i15] == i14) {
                    v0 v0Var3 = v0VarArr3[i15];
                    v0Var3.getClass();
                    v0VarArr2[i15] = v0VarArr3[i15];
                    identityHashMap.put(v0Var3, Integer.valueOf(i14));
                    z9 = true;
                } else if (iArr[i15] == i14) {
                    if (v0VarArr3[i15] != null) {
                        z10 = false;
                    }
                    w7.b.u(z10);
                }
            }
            if (z9) {
                arrayList3.add(uVarArr2[i14]);
            }
            i12 = i14 + 1;
            arrayList2 = arrayList3;
            uVarArr = uVarArr2;
            sVarArr2 = sVarArr3;
            i10 = 0;
        }
        int i16 = i10;
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(v0VarArr2, i16, v0VarArr, i16, length2);
        this.f10409y = (u[]) arrayList4.toArray(new u[i16]);
        AbstractList n02 = com.bumptech.glide.c.n0(new h3.e(3), arrayList4);
        this.f10404c.getClass();
        this.f10410z = new i(arrayList4, n02);
        return j10;
    }

    @Override // v1.u
    public final g1 m() {
        g1 g1Var = this.f10408x;
        g1Var.getClass();
        return g1Var;
    }

    @Override // v1.x0
    public final boolean n(j1.n0 n0Var) {
        ArrayList arrayList = this.f10405d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((u) arrayList.get(i10)).n(n0Var);
            }
            return false;
        }
        return this.f10410z.n(n0Var);
    }

    @Override // v1.x0
    public final long o() {
        return this.f10410z.o();
    }

    @Override // v1.u
    public final void p() {
        for (u uVar : this.f10402a) {
            uVar.p();
        }
    }

    @Override // v1.w0
    public final void s(x0 x0Var) {
        t tVar = this.f10407f;
        tVar.getClass();
        tVar.s(this);
    }

    @Override // v1.u
    public final long t(long j4) {
        long t9 = this.f10409y[0].t(j4);
        int i10 = 1;
        while (true) {
            u[] uVarArr = this.f10409y;
            if (i10 < uVarArr.length) {
                if (uVarArr[i10].t(t9) == t9) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return t9;
            }
        }
    }

    @Override // v1.u
    public final void u(long j4) {
        for (u uVar : this.f10409y) {
            uVar.u(j4);
        }
    }

    @Override // v1.x0
    public final void v(long j4) {
        this.f10410z.v(j4);
    }
}
