package dagger.hilt.android.internal.modules;

import android.app.Activity;
import androidx.fragment.app.b0;
import javax.inject.Provider;
import r6.h0;
import v6.b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideFragmentActivityFactory implements b {
    private final Provider<Activity> activityProvider;

    public ActivityModule_ProvideFragmentActivityFactory(Provider<Activity> provider) {
        this.activityProvider = provider;
    }

    public static ActivityModule_ProvideFragmentActivityFactory create(Provider<Activity> provider) {
        return new ActivityModule_ProvideFragmentActivityFactory(provider);
    }

    public static b0 provideFragmentActivity(Activity activity) {
        b0 provideFragmentActivity = ActivityModule.provideFragmentActivity(activity);
        h0.t(provideFragmentActivity);
        return provideFragmentActivity;
    }

    @Override // javax.inject.Provider
    public b0 get() {
        return provideFragmentActivity(this.activityProvider.get());
    }
}
