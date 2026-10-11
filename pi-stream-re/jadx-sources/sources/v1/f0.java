package v1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f0 extends g {

    /* renamed from: r, reason: collision with root package name */
    public static final c1.k0 f10416r;

    /* renamed from: k, reason: collision with root package name */
    public final a[] f10417k;

    /* renamed from: l, reason: collision with root package name */
    public final c1.e1[] f10418l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f10419m;

    /* renamed from: n, reason: collision with root package name */
    public final j6.e f10420n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f10421p;

    /* renamed from: q, reason: collision with root package name */
    public m1.b f10422q;

    static {
        c1.y yVar = new c1.y();
        yVar.f1952a = "MergingMediaSource";
        f10416r = yVar.a();
    }

    public f0(a... aVarArr) {
        j6.e eVar = new j6.e(29);
        this.f10417k = aVarArr;
        this.f10420n = eVar;
        this.f10419m = new ArrayList(Arrays.asList(aVarArr));
        this.o = -1;
        this.f10418l = new c1.e1[aVarArr.length];
        this.f10421p = new long[0];
        new HashMap();
        r6.h0.p(8, "expectedKeys");
        new r6.f1().c().x0();
    }

    @Override // v1.a
    public final u b(w wVar, z1.d dVar, long j4) {
        a[] aVarArr = this.f10417k;
        int length = aVarArr.length;
        u[] uVarArr = new u[length];
        c1.e1[] e1VarArr = this.f10418l;
        int b10 = e1VarArr[0].b(wVar.f10559a);
        for (int i10 = 0; i10 < length; i10++) {
            uVarArr[i10] = aVarArr[i10].b(wVar.a(e1VarArr[i10].m(b10)), dVar, j4 - this.f10421p[b10][i10]);
        }
        return new e0(this.f10420n, this.f10421p[b10], uVarArr);
    }

    @Override // v1.a
    public final c1.k0 h() {
        a[] aVarArr = this.f10417k;
        if (aVarArr.length > 0) {
            return aVarArr[0].h();
        }
        return f10416r;
    }

    @Override // v1.a
    public final void j() {
        m1.b bVar = this.f10422q;
        if (bVar == null) {
            Iterator it = this.f10426h.values().iterator();
            while (it.hasNext()) {
                ((f) it.next()).f10413a.j();
            }
            return;
        }
        throw bVar;
    }

    @Override // v1.a
    public final void l(h1.e0 e0Var) {
        this.f10428j = e0Var;
        this.f10427i = f1.b0.l(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f10417k;
            if (i10 < aVarArr.length) {
                x(Integer.valueOf(i10), aVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // v1.a
    public final void n(u uVar) {
        e0 e0Var = (e0) uVar;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f10417k;
            if (i10 < aVarArr.length) {
                a aVar = aVarArr[i10];
                u uVar2 = e0Var.f10402a[i10];
                if (uVar2 instanceof f1) {
                    uVar2 = ((f1) uVar2).f10423a;
                }
                aVar.n(uVar2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // v1.g, v1.a
    public final void p() {
        super.p();
        Arrays.fill(this.f10418l, (Object) null);
        this.o = -1;
        this.f10422q = null;
        ArrayList arrayList = this.f10419m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f10417k);
    }

    @Override // v1.a
    public final void s(c1.k0 k0Var) {
        this.f10417k[0].s(k0Var);
    }

    @Override // v1.g
    public final w t(Object obj, w wVar) {
        if (((Integer) obj).intValue() != 0) {
            return null;
        }
        return wVar;
    }

    @Override // v1.g
    public final void w(Object obj, a aVar, c1.e1 e1Var) {
        Integer num = (Integer) obj;
        if (this.f10422q == null) {
            if (this.o == -1) {
                this.o = e1Var.i();
            } else if (e1Var.i() != this.o) {
                this.f10422q = new m1.b(0, 0);
                return;
            }
            int length = this.f10421p.length;
            c1.e1[] e1VarArr = this.f10418l;
            if (length == 0) {
                this.f10421p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, e1VarArr.length);
            }
            ArrayList arrayList = this.f10419m;
            arrayList.remove(aVar);
            e1VarArr[num.intValue()] = e1Var;
            if (arrayList.isEmpty()) {
                m(e1VarArr[0]);
            }
        }
    }
}
