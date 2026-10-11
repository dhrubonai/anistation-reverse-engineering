package dagger.hilt.android.internal.modules;

import android.app.Application;
import r6.h0;
import v6.b;

/* loaded from: classes.dex */
public final class ApplicationContextModule_ProvideApplicationFactory implements b {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideApplicationFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideApplicationFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideApplicationFactory(applicationContextModule);
    }

    public static Application provideApplication(ApplicationContextModule applicationContextModule) {
        Application provideApplication = applicationContextModule.provideApplication();
        h0.t(provideApplication);
        return provideApplication;
    }

    @Override // javax.inject.Provider
    public Application get() {
        return provideApplication(this.module);
    }
}
