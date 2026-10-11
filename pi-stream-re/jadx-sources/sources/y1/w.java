package y1;

import c1.m1;
import f1.b0;
import j1.i1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f11535a;

    /* renamed from: b, reason: collision with root package name */
    public final i1[] f11536b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f11537c;

    /* renamed from: d, reason: collision with root package name */
    public final m1 f11538d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11539e;

    public w(i1[] i1VarArr, s[] sVarArr, m1 m1Var, u uVar) {
        this.f11536b = i1VarArr;
        this.f11537c = (s[]) sVarArr.clone();
        this.f11538d = m1Var;
        this.f11539e = uVar;
        this.f11535a = i1VarArr.length;
    }

    public final boolean a(w wVar, int i10) {
        if (wVar == null || !b0.a(this.f11536b[i10], wVar.f11536b[i10]) || !b0.a(this.f11537c[i10], wVar.f11537c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f11536b[i10] != null) {
            return true;
        }
        return false;
    }
}
