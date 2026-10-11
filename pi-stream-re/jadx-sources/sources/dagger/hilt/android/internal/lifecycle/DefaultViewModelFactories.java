package dagger.hilt.android.internal.lifecycle;

import androidx.activity.j;
import androidx.fragment.app.y;
import androidx.lifecycle.y0;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.internal.Preconditions;
import java.util.Set;
import javax.inject.Inject;

/* loaded from: classes.dex */
public final class DefaultViewModelFactories {

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes.dex */
    public interface ActivityEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    @InstallIn({ActivityComponent.class})
    /* loaded from: classes.dex */
    public interface ActivityModule {
        @HiltViewModelMap.KeySet
        Set<String> viewModelKeys();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: classes.dex */
    public interface FragmentEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    /* loaded from: classes.dex */
    public static final class InternalFactoryFactory {
        private final Set<String> keySet;
        private final ViewModelComponentBuilder viewModelComponentBuilder;

        @Inject
        public InternalFactoryFactory(@HiltViewModelMap.KeySet Set<String> set, ViewModelComponentBuilder viewModelComponentBuilder) {
            this.keySet = set;
            this.viewModelComponentBuilder = viewModelComponentBuilder;
        }

        private y0 getHiltViewModelFactory(y0 y0Var) {
            return new HiltViewModelFactory(this.keySet, (y0) Preconditions.checkNotNull(y0Var), this.viewModelComponentBuilder);
        }

        public y0 fromActivity(j jVar, y0 y0Var) {
            return getHiltViewModelFactory(y0Var);
        }

        public y0 fromFragment(y yVar, y0 y0Var) {
            return getHiltViewModelFactory(y0Var);
        }
    }

    private DefaultViewModelFactories() {
    }

    public static y0 getActivityFactory(j jVar, y0 y0Var) {
        return ((ActivityEntryPoint) EntryPoints.get(jVar, ActivityEntryPoint.class)).getHiltInternalFactoryFactory().fromActivity(jVar, y0Var);
    }

    public static y0 getFragmentFactory(y yVar, y0 y0Var) {
        return ((FragmentEntryPoint) EntryPoints.get(yVar, FragmentEntryPoint.class)).getHiltInternalFactoryFactory().fromFragment(yVar, y0Var);
    }
}
