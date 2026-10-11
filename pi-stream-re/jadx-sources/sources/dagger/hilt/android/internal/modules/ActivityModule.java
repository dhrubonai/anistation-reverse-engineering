package dagger.hilt.android.internal.modules;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.b0;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ActivityContext;

@InstallIn({ActivityComponent.class})
/* loaded from: classes.dex */
abstract class ActivityModule {
    private ActivityModule() {
    }

    public static b0 provideFragmentActivity(Activity activity) {
        try {
            return (b0) activity;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e10);
        }
    }

    @ActivityContext
    public abstract Context provideContext(Activity activity);
}
