package j1;

import android.util.Log;
import java.util.Collections;
import java.util.List;
import msr.pistream.app.viewmodel.HomeViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements f1.l, k8.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5899a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5902d;

    public /* synthetic */ s(int i10, c1.y0 y0Var, c1.y0 y0Var2) {
        this.f5900b = i10;
        this.f5901c = y0Var;
        this.f5902d = y0Var2;
    }

    @Override // k8.f
    public final List b(int i10) {
        y.c cVar = (y.c) this.f5901c;
        int i11 = this.f5900b;
        String str = (String) this.f5902d;
        HomeViewModel homeViewModel = ((l8.u) cVar.f11425c).f7021s0;
        homeViewModel.getClass();
        try {
            e8.a aVar = homeViewModel.f7810e;
            aVar.getClass();
            try {
                return aVar.f3594a.j(i11, i10, str);
            } catch (Exception e10) {
                Log.e("AnimeRepository", "railPage failed", e10);
                return Collections.emptyList();
            }
        } catch (Exception e11) {
            Log.e("HomeVM", "railPage", e11);
            return Collections.emptyList();
        }
    }

    @Override // f1.l
    public final void invoke(Object obj) {
        switch (this.f5899a) {
            case 0:
                c1.y0 y0Var = (c1.y0) this.f5901c;
                c1.y0 y0Var2 = (c1.y0) this.f5902d;
                c1.x0 x0Var = (c1.x0) obj;
                x0Var.I();
                x0Var.f(this.f5900b, y0Var, y0Var2);
                return;
            default:
                ((k1.c) obj).getClass();
                return;
        }
    }

    public /* synthetic */ s(k1.b bVar, c1.k0 k0Var, int i10) {
        this.f5901c = bVar;
        this.f5902d = k0Var;
        this.f5900b = i10;
    }

    public /* synthetic */ s(y.c cVar, int i10, String str) {
        this.f5901c = cVar;
        this.f5900b = i10;
        this.f5902d = str;
    }
}
