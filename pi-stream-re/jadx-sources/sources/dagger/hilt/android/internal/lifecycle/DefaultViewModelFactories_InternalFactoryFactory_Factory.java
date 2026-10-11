package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import java.util.Set;
import javax.inject.Provider;
import v6.b;

/* loaded from: classes.dex */
public final class DefaultViewModelFactories_InternalFactoryFactory_Factory implements b {
    private final Provider<Set<String>> keySetProvider;
    private final Provider<ViewModelComponentBuilder> viewModelComponentBuilderProvider;

    public DefaultViewModelFactories_InternalFactoryFactory_Factory(Provider<Set<String>> provider, Provider<ViewModelComponentBuilder> provider2) {
        this.keySetProvider = provider;
        this.viewModelComponentBuilderProvider = provider2;
    }

    public static DefaultViewModelFactories_InternalFactoryFactory_Factory create(Provider<Set<String>> provider, Provider<ViewModelComponentBuilder> provider2) {
        return new DefaultViewModelFactories_InternalFactoryFactory_Factory(provider, provider2);
    }

    public static DefaultViewModelFactories.InternalFactoryFactory newInstance(Set<String> set, ViewModelComponentBuilder viewModelComponentBuilder) {
        return new DefaultViewModelFactories.InternalFactoryFactory(set, viewModelComponentBuilder);
    }

    @Override // javax.inject.Provider
    public DefaultViewModelFactories.InternalFactoryFactory get() {
        return newInstance(this.keySetProvider.get(), this.viewModelComponentBuilderProvider.get());
    }
}
