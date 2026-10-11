package g0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class g1 extends b7.g implements h7.p {

    /* renamed from: b, reason: collision with root package name */
    public int f4211b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f4213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(View view, z6.e eVar) {
        super(eVar);
        this.f4213d = view;
    }

    @Override // b7.a
    public final z6.e create(Object obj, z6.e eVar) {
        g1 g1Var = new g1(this.f4213d, eVar);
        g1Var.f4212c = obj;
        return g1Var;
    }

    @Override // h7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((n7.d) obj, (z6.e) obj2)).invokeSuspend(w6.f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        a7.a aVar = a7.a.f156a;
        int i10 = this.f4211b;
        View view = this.f4213d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    r6.h0.V0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n7.d dVar = (n7.d) this.f4212c;
                r6.h0.V0(obj);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    r6.h0.u(viewGroup, "<this>");
                    d1 d1Var = new d1(new e1(viewGroup, null), 2);
                    this.f4212c = null;
                    this.f4211b = 2;
                    if (dVar.f(d1Var, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return w6.f.f11019a;
        }
        r6.h0.V0(obj);
        n7.d dVar2 = (n7.d) this.f4212c;
        this.f4212c = dVar2;
        this.f4211b = 1;
        dVar2.b(view, this);
        return aVar;
    }
}
