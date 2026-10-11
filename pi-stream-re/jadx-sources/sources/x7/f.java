package x7;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import msr.pistream.app.di.AppModule;
import msr.pistream.app.di.NetworkModule;
import r6.h0;
import y7.r;
import y7.s;
import y7.t;
import y7.u;
import y7.v;
import y8.w;

/* loaded from: classes.dex */
public final class f implements v6.b {

    /* renamed from: a, reason: collision with root package name */
    public final g f11353a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11354b;

    public f(g gVar, int i10) {
        this.f11353a = gVar;
        this.f11354b = i10;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f11353a;
        int i10 = this.f11354b;
        switch (i10) {
            case 0:
                return new y7.a((c8.d) gVar.f11358d.get());
            case 1:
                return new c8.d((w) gVar.f11357c.get());
            case 2:
                w provideOkHttpClient = NetworkModule.provideOkHttpClient();
                h0.t(provideOkHttpClient);
                return provideOkHttpClient;
            case 3:
                return new e8.a((c8.b) gVar.f11361g.get());
            case 4:
                return new c8.b((d8.b) gVar.f11360f.get(), ApplicationContextModule_ProvideContextFactory.provideContext(gVar.f11355a));
            case 5:
                return new d8.b((w) gVar.f11357c.get(), ApplicationContextModule_ProvideContextFactory.provideContext(gVar.f11355a));
            case 6:
                return new e8.b();
            case zzaja.zze.zzg /* 7 */:
                return new y7.d((e8.a) gVar.f11362h.get());
            case 8:
                return new y7.e((e8.a) gVar.f11362h.get());
            case 9:
                return new y7.j((e8.a) gVar.f11362h.get());
            case 10:
                return new y7.f((e8.a) gVar.f11362h.get());
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new s();
            case 12:
                return new y7.i((e8.a) gVar.f11362h.get());
            case 13:
                return new y7.l();
            case 14:
                return new t((e8.a) gVar.f11362h.get());
            case 15:
                return new y7.g();
            case 16:
                return new y7.m();
            case 17:
                return new r();
            case 18:
                return new y7.o();
            case 19:
                return new y7.p();
            case 20:
                return new y7.q();
            case 21:
                return new y7.n();
            case 22:
                return new y7.h();
            case 23:
                return new v((e8.a) gVar.f11362h.get());
            case 24:
                return new y7.c((e8.a) gVar.f11362h.get());
            case 25:
                return new y7.k((e8.a) gVar.f11362h.get());
            case 26:
                return new u((e8.a) gVar.f11362h.get());
            case 27:
                return new y7.b((e8.a) gVar.f11362h.get());
            case 28:
                Context context = (Context) gVar.E.get();
                return new e8.c(context);
            case 29:
                Context provideContext = AppModule.provideContext(ApplicationContextModule_ProvideContextFactory.provideContext(gVar.f11355a));
                h0.t(provideContext);
                return provideContext;
            default:
                throw new AssertionError(i10);
        }
    }
}
