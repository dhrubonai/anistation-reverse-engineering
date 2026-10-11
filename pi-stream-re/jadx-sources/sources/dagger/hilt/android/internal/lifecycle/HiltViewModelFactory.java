package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.bumptech.glide.d;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import h7.l;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import n3.g;
import r6.h0;
import y0.b;
import y0.c;

/* loaded from: classes.dex */
public final class HiltViewModelFactory implements y0 {
    public static final b CREATION_CALLBACK_KEY = new b() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.1
    };
    private final y0 delegateFactory;
    private final y0 hiltViewModelFactory;
    private final Set<String> hiltViewModelKeys;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes.dex */
    public interface ActivityCreatorEntryPoint {
        ViewModelComponentBuilder getViewModelComponentBuilder();

        @HiltViewModelMap.KeySet
        Set<String> getViewModelKeys();
    }

    @EntryPoint
    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes.dex */
    public interface ViewModelFactoriesEntryPoint {
        @HiltViewModelAssistedMap
        Map<String, Object> getHiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<String, Provider<w0>> getHiltViewModelMap();
    }

    @InstallIn({ViewModelComponent.class})
    /* loaded from: classes.dex */
    public interface ViewModelModule {
        @HiltViewModelAssistedMap
        Map<String, Object> hiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<String, w0> hiltViewModelMap();
    }

    public HiltViewModelFactory(Set<String> set, y0 y0Var, final ViewModelComponentBuilder viewModelComponentBuilder) {
        this.hiltViewModelKeys = set;
        this.delegateFactory = y0Var;
        this.hiltViewModelFactory = new y0() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.2
            private <T extends w0> T createViewModel(ViewModelComponent viewModelComponent, Class<T> cls, c cVar) {
                Provider<w0> provider = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelMap().get(cls.getName());
                l lVar = (l) cVar.a(HiltViewModelFactory.CREATION_CALLBACK_KEY);
                Object obj = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelAssistedMap().get(cls.getName());
                if (obj == null) {
                    if (lVar == null) {
                        if (provider != null) {
                            return (T) provider.get();
                        }
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (provider == null) {
                    if (lVar != null) {
                        return (T) lVar.invoke(obj);
                    }
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }

            @Override // androidx.lifecycle.y0
            public w0 create(Class cls) {
                h0.u(cls, "modelClass");
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            }

            @Override // androidx.lifecycle.y0
            public <T extends w0> T create(Class<T> cls, c cVar) {
                final RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
                T t9 = (T) createViewModel(viewModelComponentBuilder.savedStateHandle(d.p(cVar)).viewModelLifecycle(retainedLifecycleImpl).build(), cls, cVar);
                t9.addCloseable(new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.a
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        RetainedLifecycleImpl.this.dispatchOnCleared();
                    }
                });
                return t9;
            }
        };
    }

    public static y0 createInternal(Activity activity, g gVar, Bundle bundle, y0 y0Var) {
        return createInternal(activity, y0Var);
    }

    @Override // androidx.lifecycle.y0
    public <T extends w0> T create(Class<T> cls, c cVar) {
        if (this.hiltViewModelKeys.contains(cls.getName())) {
            return (T) this.hiltViewModelFactory.create(cls, cVar);
        }
        return (T) this.delegateFactory.create(cls, cVar);
    }

    public static y0 createInternal(Activity activity, y0 y0Var) {
        ActivityCreatorEntryPoint activityCreatorEntryPoint = (ActivityCreatorEntryPoint) EntryPoints.get(activity, ActivityCreatorEntryPoint.class);
        return new HiltViewModelFactory(activityCreatorEntryPoint.getViewModelKeys(), y0Var, activityCreatorEntryPoint.getViewModelComponentBuilder());
    }

    @Override // androidx.lifecycle.y0
    public <T extends w0> T create(Class<T> cls) {
        if (this.hiltViewModelKeys.contains(cls.getName())) {
            return (T) this.hiltViewModelFactory.create(cls);
        }
        return (T) this.delegateFactory.create(cls);
    }
}
