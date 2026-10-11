package x7;

import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import java.util.Set;
import msr.pistream.app.viewmodel.AuthViewModel_HiltModules$KeyModule;
import msr.pistream.app.viewmodel.DetailViewModel_HiltModules$KeyModule;
import msr.pistream.app.viewmodel.FilterViewModel_HiltModules$KeyModule;
import msr.pistream.app.viewmodel.HomeViewModel_HiltModules$KeyModule;
import msr.pistream.app.viewmodel.PlayerViewModel_HiltModules$KeyModule;
import msr.pistream.app.viewmodel.ScheduleViewModel_HiltModules$KeyModule;
import msr.pistream.app.viewmodel.SearchViewModel_HiltModules$KeyModule;
import r6.h0;
import r6.t0;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    public final g f11343a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11344b;

    /* renamed from: c, reason: collision with root package name */
    public final a f11345c = this;

    public a(g gVar, c cVar) {
        this.f11343a = gVar;
        this.f11344b = cVar;
    }

    @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
    public final FragmentComponentBuilder fragmentComponentBuilder() {
        return new i.g(this.f11343a, this.f11344b, this.f11345c);
    }

    @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
    public final DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new h(this.f11343a, this.f11344b));
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
    public final ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new h(this.f11343a, this.f11344b);
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
    public final Set getViewModelKeys() {
        String provide = AuthViewModel_HiltModules$KeyModule.provide();
        h0.t(provide);
        String provide2 = DetailViewModel_HiltModules$KeyModule.provide();
        h0.t(provide2);
        String provide3 = FilterViewModel_HiltModules$KeyModule.provide();
        h0.t(provide3);
        String provide4 = HomeViewModel_HiltModules$KeyModule.provide();
        h0.t(provide4);
        String provide5 = PlayerViewModel_HiltModules$KeyModule.provide();
        h0.t(provide5);
        String provide6 = ScheduleViewModel_HiltModules$KeyModule.provide();
        h0.t(provide6);
        String provide7 = SearchViewModel_HiltModules$KeyModule.provide();
        h0.t(provide7);
        int i10 = t0.f9538c;
        Object[] objArr = new Object[7];
        objArr[0] = provide;
        objArr[1] = provide2;
        objArr[2] = provide3;
        objArr[3] = provide4;
        objArr[4] = provide5;
        objArr[5] = provide6;
        System.arraycopy(new String[]{provide7}, 0, objArr, 6, 1);
        return t0.i(7, objArr);
    }

    @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
    public final ViewComponentBuilder viewComponentBuilder() {
        return new i.g(this.f11343a, this.f11344b, this.f11345c, (Object) null);
    }
}
