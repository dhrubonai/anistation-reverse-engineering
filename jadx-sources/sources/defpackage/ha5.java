package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ha5 implements yv6 {
    public final Application a;
    public final xv6 b;
    public final Bundle c;
    public final fg3 d;
    public final ea5 e;

    public ha5(Application application, ga5 ga5Var, Bundle bundle) {
        xv6 xv6Var;
        this.e = ga5Var.getSavedStateRegistry();
        this.d = ga5Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            xv6Var = xv6.c;
            if (xv6Var == null) {
                xv6Var = new xv6(application);
                xv6.c = xv6Var;
            }
        } else {
            xv6Var = new xv6(null);
        }
        this.b = xv6Var;
    }

    @Override // defpackage.yv6
    public final vv6 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        ze0.k("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.yv6
    public final vv6 b(Class cls, o34 o34Var) {
        Constructor a;
        z95 z95Var = o80.h;
        LinkedHashMap linkedHashMap = o34Var.a;
        String str = (String) linkedHashMap.get(z95Var);
        if (str != null) {
            if (linkedHashMap.get(w65.k) != null && linkedHashMap.get(w65.l) != null) {
                Application application = (Application) linkedHashMap.get(xv6.d);
                boolean isAssignableFrom = lg.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a = ia5.a(cls, ia5.a);
                } else {
                    a = ia5.a(cls, ia5.b);
                }
                if (a == null) {
                    return this.b.b(cls, o34Var);
                }
                if (isAssignableFrom && application != null) {
                    return ia5.b(cls, a, application, w65.u(o34Var));
                }
                return ia5.b(cls, a, w65.u(o34Var));
            }
            if (this.d != null) {
                return d(str, cls);
            }
            ze0.m("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        ze0.m("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override // defpackage.yv6
    public final vv6 c(im0 im0Var, o34 o34Var) {
        return b(t80.M(im0Var), o34Var);
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, zv6] */
    public final vv6 d(String str, Class cls) {
        Constructor a;
        vv6 b;
        fg3 fg3Var = this.d;
        if (fg3Var != null) {
            boolean isAssignableFrom = lg.class.isAssignableFrom(cls);
            Application application = this.a;
            if (isAssignableFrom && application != null) {
                a = ia5.a(cls, ia5.a);
            } else {
                a = ia5.a(cls, ia5.b);
            }
            if (a == null) {
                if (application != null) {
                    return this.b.a(cls);
                }
                zv6 zv6Var = zv6.a;
                zv6 zv6Var2 = zv6Var;
                if (zv6Var == null) {
                    ?? obj = new Object();
                    zv6.a = obj;
                    zv6Var2 = obj;
                }
                return zv6Var2.a(cls);
            }
            ea5 ea5Var = this.e;
            ea5Var.getClass();
            v95 G = io3.G(ea5Var.a(str), this.c);
            w95 w95Var = new w95(str, G);
            w95Var.a(ea5Var, fg3Var);
            eg3 eg3Var = ((rg3) fg3Var).i;
            if (eg3Var != eg3.y && eg3Var.compareTo(eg3.A) < 0) {
                fg3Var.a(new o91((Object) fg3Var, (Object) ea5Var, (byte) 1));
            } else {
                ea5Var.d();
            }
            if (isAssignableFrom && application != null) {
                b = ia5.b(cls, a, application, G);
            } else {
                b = ia5.b(cls, a, G);
            }
            b.a("androidx.lifecycle.savedstate.vm.tag", w95Var);
            return b;
        }
        ov3.g("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
