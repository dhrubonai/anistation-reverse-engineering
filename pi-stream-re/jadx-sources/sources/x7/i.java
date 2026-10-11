package x7;

import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import msr.pistream.app.viewmodel.AuthViewModel;
import msr.pistream.app.viewmodel.DetailViewModel;
import msr.pistream.app.viewmodel.FilterViewModel;
import msr.pistream.app.viewmodel.HomeViewModel;
import msr.pistream.app.viewmodel.PlayerViewModel;
import msr.pistream.app.viewmodel.ScheduleViewModel;
import msr.pistream.app.viewmodel.SearchViewModel;
import y7.t;
import y7.u;
import y7.v;

/* loaded from: classes.dex */
public final class i implements v6.b {

    /* renamed from: a, reason: collision with root package name */
    public final g f11384a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11385b;

    public i(g gVar, int i10) {
        this.f11384a = gVar;
        this.f11385b = i10;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f11384a;
        int i10 = this.f11385b;
        switch (i10) {
            case 0:
                return new AuthViewModel((e8.b) gVar.f11363i.get());
            case 1:
                y7.d dVar = (y7.d) gVar.f11364j.get();
                y7.e eVar = (y7.e) gVar.f11365k.get();
                y7.j jVar = (y7.j) gVar.f11366l.get();
                y7.f fVar = (y7.f) gVar.f11367m.get();
                return new DetailViewModel(dVar, eVar, jVar, fVar);
            case 2:
                return new FilterViewModel();
            case 3:
                y7.i iVar = (y7.i) gVar.o.get();
                t tVar = (t) gVar.f11370q.get();
                y7.c cVar = (y7.c) gVar.A.get();
                return new HomeViewModel(iVar, tVar, cVar, (e8.a) gVar.f11362h.get());
            case 4:
                u uVar = (u) gVar.C.get();
                y7.b bVar = (y7.b) gVar.D.get();
                y7.e eVar2 = (y7.e) gVar.f11365k.get();
                e8.a aVar = (e8.a) gVar.f11362h.get();
                ApplicationContextModule_ProvideContextFactory.provideContext(gVar.f11355a);
                return new PlayerViewModel(uVar, bVar, eVar2, aVar);
            case 5:
                return new ScheduleViewModel((y7.k) gVar.B.get());
            case 6:
                v vVar = (v) gVar.f11379z.get();
                return new SearchViewModel(vVar, (e8.c) gVar.F.get());
            default:
                throw new AssertionError(i10);
        }
    }
}
