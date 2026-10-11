package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class u0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f1145a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f1146b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1147c;

    /* renamed from: d, reason: collision with root package name */
    public final p f1148d;

    /* renamed from: e, reason: collision with root package name */
    public final n3.e f1149e;

    public u0(Application application, n3.g gVar, Bundle bundle) {
        x0 x0Var;
        r6.h0.u(gVar, "owner");
        this.f1149e = gVar.getSavedStateRegistry();
        this.f1148d = gVar.getLifecycle();
        this.f1147c = bundle;
        this.f1145a = application;
        if (application != null) {
            if (x0.f1165c == null) {
                x0.f1165c = new x0(application);
            }
            x0Var = x0.f1165c;
            r6.h0.q(x0Var);
        } else {
            x0Var = new x0(null);
        }
        this.f1146b = x0Var;
    }

    public final w0 a(Class cls, String str) {
        Constructor a10;
        w0 b10;
        boolean z9;
        r6.h0.u(cls, "modelClass");
        p pVar = this.f1148d;
        if (pVar != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            Application application = this.f1145a;
            if (isAssignableFrom && application != null) {
                a10 = v0.a(cls, v0.f1152a);
            } else {
                a10 = v0.a(cls, v0.f1153b);
            }
            if (a10 == null) {
                if (application != null) {
                    return this.f1146b.create(cls);
                }
                if (z0.f1169a == null) {
                    z0.f1169a = new z0();
                }
                z0 z0Var = z0.f1169a;
                r6.h0.q(z0Var);
                return z0Var.create(cls);
            }
            n3.e eVar = this.f1149e;
            r6.h0.q(eVar);
            Bundle a11 = eVar.a(str);
            Class[] clsArr = o0.f1119f;
            o0 l10 = j6.e.l(a11, this.f1147c);
            p0 p0Var = new p0(str, l10);
            p0Var.a(pVar, eVar);
            o oVar = ((w) pVar).f1156c;
            if (oVar != o.INITIALIZED) {
                if (oVar.compareTo(o.STARTED) >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    pVar.a(new g(pVar, eVar));
                    if (!isAssignableFrom && application != null) {
                        b10 = v0.b(cls, a10, application, l10);
                    } else {
                        b10 = v0.b(cls, a10, l10);
                    }
                    b10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", p0Var);
                    return b10;
                }
            }
            eVar.d();
            if (!isAssignableFrom) {
            }
            b10 = v0.b(cls, a10, l10);
            b10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", p0Var);
            return b10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.y0
    public final w0 create(Class cls, y0.c cVar) {
        Constructor a10;
        r6.h0.u(cls, "modelClass");
        r6.h0.u(cVar, "extras");
        String str = (String) cVar.a(q0.f1129b);
        if (str != null) {
            if (cVar.a(com.bumptech.glide.d.f2186a) != null && cVar.a(com.bumptech.glide.d.f2187b) != null) {
                Application application = (Application) cVar.a(q0.f1128a);
                boolean isAssignableFrom = a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a10 = v0.a(cls, v0.f1152a);
                } else {
                    a10 = v0.a(cls, v0.f1153b);
                }
                if (a10 == null) {
                    return this.f1146b.create(cls, cVar);
                }
                return (!isAssignableFrom || application == null) ? v0.b(cls, a10, com.bumptech.glide.d.p(cVar)) : v0.b(cls, a10, application, com.bumptech.glide.d.p(cVar));
            }
            if (this.f1148d != null) {
                return a(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.y0
    public final w0 create(Class cls) {
        r6.h0.u(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
