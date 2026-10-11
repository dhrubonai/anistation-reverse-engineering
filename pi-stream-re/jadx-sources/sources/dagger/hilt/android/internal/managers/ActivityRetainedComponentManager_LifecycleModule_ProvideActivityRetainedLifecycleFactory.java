package dagger.hilt.android.internal.managers;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;
import r6.h0;
import v6.b;

/* loaded from: classes.dex */
public final class ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory INSTANCE = new ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory();

        private InstanceHolder() {
        }
    }

    public static ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
        ActivityRetainedLifecycle provideActivityRetainedLifecycle = ActivityRetainedComponentManager.LifecycleModule.provideActivityRetainedLifecycle();
        h0.t(provideActivityRetainedLifecycle);
        return provideActivityRetainedLifecycle;
    }

    @Override // javax.inject.Provider
    public ActivityRetainedLifecycle get() {
        return provideActivityRetainedLifecycle();
    }
}
