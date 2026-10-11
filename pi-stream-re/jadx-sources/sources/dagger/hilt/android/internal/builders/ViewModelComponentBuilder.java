package dagger.hilt.android.internal.builders;

import androidx.lifecycle.o0;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;

@DefineComponent.Builder
/* loaded from: classes.dex */
public interface ViewModelComponentBuilder {
    ViewModelComponent build();

    ViewModelComponentBuilder savedStateHandle(o0 o0Var);

    ViewModelComponentBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle);
}
