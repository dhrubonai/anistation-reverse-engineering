package q3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9163c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9164d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f9167g;

    public l(n nVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f9167g = nVar;
        this.f9161a = obj;
        this.f9162b = arrayList;
        this.f9165e = obj2;
        this.f9166f = arrayList2;
    }

    @Override // q3.r
    public final void c(s sVar) {
        sVar.w(this);
    }

    @Override // q3.t, q3.r
    public final void e(s sVar) {
        n nVar = this.f9167g;
        Object obj = this.f9161a;
        if (obj != null) {
            nVar.s(obj, this.f9162b, null);
        }
        Object obj2 = this.f9163c;
        if (obj2 != null) {
            nVar.s(obj2, this.f9164d, null);
        }
        Object obj3 = this.f9165e;
        if (obj3 != null) {
            nVar.s(obj3, this.f9166f, null);
        }
    }
}
