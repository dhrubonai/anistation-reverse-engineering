package dagger.hilt.android.internal.modules;

import android.content.Context;
import r6.h0;
import v6.b;

/* loaded from: classes.dex */
public final class ApplicationContextModule_ProvideContextFactory implements b {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideContextFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideContextFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideContextFactory(applicationContextModule);
    }

    public static Context provideContext(ApplicationContextModule applicationContextModule) {
        Context provideContext = applicationContextModule.provideContext();
        h0.t(provideContext);
        return provideContext;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }
}
