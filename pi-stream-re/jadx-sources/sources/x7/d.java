package x7;

import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    public final g f11349a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11350b;

    /* renamed from: c, reason: collision with root package name */
    public final a f11351c;

    /* renamed from: d, reason: collision with root package name */
    public final d f11352d = this;

    public d(g gVar, c cVar, a aVar) {
        this.f11349a = gVar;
        this.f11350b = cVar;
        this.f11351c = aVar;
    }

    @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
    public final DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return this.f11351c.getHiltInternalFactoryFactory();
    }

    @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
    public final ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
        return new androidx.fragment.app.g(this.f11349a, this.f11350b, this.f11351c, this.f11352d);
    }
}
