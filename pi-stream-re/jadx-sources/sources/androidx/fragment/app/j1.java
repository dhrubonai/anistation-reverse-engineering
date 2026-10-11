package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class j1 implements androidx.lifecycle.j, n3.g, androidx.lifecycle.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final y f911a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.b1 f912b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.y0 f913c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.w f914d = null;

    /* renamed from: e, reason: collision with root package name */
    public n3.f f915e = null;

    public j1(y yVar, androidx.lifecycle.b1 b1Var) {
        this.f911a = yVar;
        this.f912b = b1Var;
    }

    public final void a(androidx.lifecycle.n nVar) {
        this.f914d.e(nVar);
    }

    public final void b() {
        if (this.f914d == null) {
            this.f914d = new androidx.lifecycle.w(this);
            n3.f fVar = new n3.f(this);
            this.f915e = fVar;
            fVar.a();
            com.bumptech.glide.d.r(this);
        }
    }

    @Override // androidx.lifecycle.j
    public final y0.c getDefaultViewModelCreationExtras() {
        Application application;
        y yVar = this.f911a;
        Context applicationContext = yVar.O().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        y0.d dVar = new y0.d();
        LinkedHashMap linkedHashMap = dVar.f11463a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.q0.f1128a, application);
        }
        linkedHashMap.put(com.bumptech.glide.d.f2186a, this);
        linkedHashMap.put(com.bumptech.glide.d.f2187b, this);
        Bundle bundle = yVar.f1039f;
        if (bundle != null) {
            linkedHashMap.put(com.bumptech.glide.d.f2188c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.y0 getDefaultViewModelProviderFactory() {
        Application application;
        y yVar = this.f911a;
        androidx.lifecycle.y0 defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(yVar.f1041g0)) {
            this.f913c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f913c == null) {
            Context applicationContext = yVar.O().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f913c = new androidx.lifecycle.u0(application, this, yVar.f1039f);
        }
        return this.f913c;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.p getLifecycle() {
        b();
        return this.f914d;
    }

    @Override // n3.g
    public final n3.e getSavedStateRegistry() {
        b();
        return this.f915e.f8004b;
    }

    @Override // androidx.lifecycle.c1
    public final androidx.lifecycle.b1 getViewModelStore() {
        b();
        return this.f912b;
    }
}
