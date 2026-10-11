package dagger.hilt.android.internal.managers;

import androidx.lifecycle.o0;
import javax.inject.Provider;
import r6.h0;
import v6.b;

/* loaded from: classes.dex */
public final class SavedStateHandleModule_ProvideSavedStateHandleFactory implements b {
    private final Provider<SavedStateHandleHolder> savedStateHandleHolderProvider;

    public SavedStateHandleModule_ProvideSavedStateHandleFactory(Provider<SavedStateHandleHolder> provider) {
        this.savedStateHandleHolderProvider = provider;
    }

    public static SavedStateHandleModule_ProvideSavedStateHandleFactory create(Provider<SavedStateHandleHolder> provider) {
        return new SavedStateHandleModule_ProvideSavedStateHandleFactory(provider);
    }

    public static o0 provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        o0 provideSavedStateHandle = SavedStateHandleModule.provideSavedStateHandle(savedStateHandleHolder);
        h0.t(provideSavedStateHandle);
        return provideSavedStateHandle;
    }

    @Override // javax.inject.Provider
    public o0 get() {
        return provideSavedStateHandle(this.savedStateHandleHolderProvider.get());
    }
}
