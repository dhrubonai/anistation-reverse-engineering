package msr.pistream.app.di;

import android.content.Context;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@InstallIn({SingletonComponent.class})
/* loaded from: classes.dex */
public abstract class AppModule {
    @Singleton
    public static Context provideContext(@ApplicationContext Context context) {
        return context;
    }
}
