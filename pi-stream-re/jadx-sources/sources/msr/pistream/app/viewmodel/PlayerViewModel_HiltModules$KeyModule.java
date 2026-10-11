package msr.pistream.app.viewmodel;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;

@InstallIn({ActivityRetainedComponent.class})
/* loaded from: classes.dex */
public abstract class PlayerViewModel_HiltModules$KeyModule {
    @HiltViewModelMap.KeySet
    public static String provide() {
        return "msr.pistream.app.viewmodel.PlayerViewModel";
    }
}
