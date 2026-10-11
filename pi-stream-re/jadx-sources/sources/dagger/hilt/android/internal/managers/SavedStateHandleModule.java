package dagger.hilt.android.internal.managers;

import androidx.lifecycle.o0;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.lifecycle.ActivityRetainedSavedState;
import dagger.hilt.android.scopes.ActivityRetainedScoped;

@InstallIn({ActivityRetainedComponent.class})
/* loaded from: classes.dex */
abstract class SavedStateHandleModule {
    @ActivityRetainedScoped
    @ActivityRetainedSavedState
    public static o0 provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        return savedStateHandleHolder.getSavedStateHandle();
    }
}
