package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.j;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponentManager;
import r6.h0;
import y0.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ActivityRetainedComponentManager implements GeneratedComponentManager<ActivityRetainedComponent> {
    private volatile ActivityRetainedComponent component;
    private final Object componentLock = new Object();
    private final Context context;
    private final c1 viewModelStoreOwner;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    public interface ActivityRetainedComponentBuilderEntryPoint {
        ActivityRetainedComponentBuilder retainedComponentBuilder();
    }

    /* loaded from: classes.dex */
    public static final class ActivityRetainedComponentViewModel extends w0 {
        private final ActivityRetainedComponent component;
        private final SavedStateHandleHolder savedStateHandleHolder;

        public ActivityRetainedComponentViewModel(ActivityRetainedComponent activityRetainedComponent, SavedStateHandleHolder savedStateHandleHolder) {
            this.component = activityRetainedComponent;
            this.savedStateHandleHolder = savedStateHandleHolder;
        }

        public ActivityRetainedComponent getComponent() {
            return this.component;
        }

        public SavedStateHandleHolder getSavedStateHandleHolder() {
            return this.savedStateHandleHolder;
        }

        @Override // androidx.lifecycle.w0
        public void onCleared() {
            ((RetainedLifecycleImpl) ((ActivityRetainedLifecycleEntryPoint) EntryPoints.get(this.component, ActivityRetainedLifecycleEntryPoint.class)).getActivityRetainedLifecycle()).dispatchOnCleared();
        }
    }

    @EntryPoint
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes.dex */
    public interface ActivityRetainedLifecycleEntryPoint {
        ActivityRetainedLifecycle getActivityRetainedLifecycle();
    }

    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes.dex */
    public static abstract class LifecycleModule {
        @ActivityRetainedScoped
        public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
            return new RetainedLifecycleImpl();
        }
    }

    public ActivityRetainedComponentManager(j jVar) {
        this.viewModelStoreOwner = jVar;
        this.context = jVar;
    }

    private ActivityRetainedComponent createComponent() {
        return ((ActivityRetainedComponentViewModel) getViewModelProvider(this.viewModelStoreOwner, this.context).a(ActivityRetainedComponentViewModel.class)).getComponent();
    }

    private a1 getViewModelProvider(c1 c1Var, final Context context) {
        return new a1(c1Var, new y0() { // from class: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.1
            @Override // androidx.lifecycle.y0
            public w0 create(Class cls) {
                h0.u(cls, "modelClass");
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            }

            @Override // androidx.lifecycle.y0
            public <T extends w0> T create(Class<T> cls, c cVar) {
                SavedStateHandleHolder savedStateHandleHolder = new SavedStateHandleHolder(cVar);
                return new ActivityRetainedComponentViewModel(((ActivityRetainedComponentBuilderEntryPoint) EntryPointAccessors.fromApplication(context, ActivityRetainedComponentBuilderEntryPoint.class)).retainedComponentBuilder().savedStateHandleHolder(savedStateHandleHolder).build(), savedStateHandleHolder);
            }
        });
    }

    public SavedStateHandleHolder getSavedStateHandleHolder() {
        return ((ActivityRetainedComponentViewModel) getViewModelProvider(this.viewModelStoreOwner, this.context).a(ActivityRetainedComponentViewModel.class)).getSavedStateHandleHolder();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // dagger.hilt.internal.GeneratedComponentManager
    public ActivityRetainedComponent generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                if (this.component == null) {
                    this.component = createComponent();
                }
            }
        }
        return this.component;
    }
}
