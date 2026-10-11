package x7;

import java.util.Map;
import r6.h0;
import r6.q0;
import r6.s1;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public i f11386a;

    /* renamed from: b, reason: collision with root package name */
    public i f11387b;

    /* renamed from: c, reason: collision with root package name */
    public i f11388c;

    /* renamed from: d, reason: collision with root package name */
    public i f11389d;

    /* renamed from: e, reason: collision with root package name */
    public i f11390e;

    /* renamed from: f, reason: collision with root package name */
    public i f11391f;

    /* renamed from: g, reason: collision with root package name */
    public i f11392g;

    public j(g gVar, c cVar) {
        this.f11386a = new i(gVar, 0);
        this.f11387b = new i(gVar, 1);
        this.f11388c = new i(gVar, 2);
        this.f11389d = new i(gVar, 3);
        this.f11390e = new i(gVar, 4);
        this.f11391f = new i(gVar, 5);
        this.f11392g = new i(gVar, 6);
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
    public final Map getHiltViewModelAssistedMap() {
        return s1.f9531x;
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
    public final Map getHiltViewModelMap() {
        h0.p(7, "expectedSize");
        q0 q0Var = new q0(7);
        q0Var.c("msr.pistream.app.viewmodel.AuthViewModel", this.f11386a);
        q0Var.c("msr.pistream.app.viewmodel.DetailViewModel", this.f11387b);
        q0Var.c("msr.pistream.app.viewmodel.FilterViewModel", this.f11388c);
        q0Var.c("msr.pistream.app.viewmodel.HomeViewModel", this.f11389d);
        q0Var.c("msr.pistream.app.viewmodel.PlayerViewModel", this.f11390e);
        q0Var.c("msr.pistream.app.viewmodel.ScheduleViewModel", this.f11391f);
        q0Var.c("msr.pistream.app.viewmodel.SearchViewModel", this.f11392g);
        return q0Var.a();
    }
}
