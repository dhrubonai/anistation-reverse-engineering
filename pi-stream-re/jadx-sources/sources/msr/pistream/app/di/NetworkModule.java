package msr.pistream.app.di;

import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import y8.v;
import y8.w;

@InstallIn({SingletonComponent.class})
/* loaded from: classes.dex */
public abstract class NetworkModule {
    @Singleton
    public static w provideOkHttpClient() {
        v vVar = new v();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vVar.a(20L, timeUnit);
        vVar.b(35L, timeUnit);
        vVar.f11812h = true;
        vVar.f11813i = true;
        return new w(vVar);
    }
}
