package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class x0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static x0 f1165c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f1166b;

    public x0(Application application) {
        this.f1166b = application;
    }

    public final w0 a(Class cls, Application application) {
        if (a.class.isAssignableFrom(cls)) {
            try {
                w0 w0Var = (w0) cls.getConstructor(Application.class).newInstance(application);
                r6.h0.s(w0Var, "{\n                try {\n…          }\n            }");
                return w0Var;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
        return super.create(cls);
    }

    @Override // androidx.lifecycle.z0, androidx.lifecycle.y0
    public final w0 create(Class cls, y0.c cVar) {
        r6.h0.u(cls, "modelClass");
        r6.h0.u(cVar, "extras");
        if (this.f1166b != null) {
            return create(cls);
        }
        Application application = (Application) cVar.a(q0.f1128a);
        if (application != null) {
            return a(cls, application);
        }
        if (!a.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    @Override // androidx.lifecycle.z0, androidx.lifecycle.y0
    public final w0 create(Class cls) {
        r6.h0.u(cls, "modelClass");
        Application application = this.f1166b;
        if (application != null) {
            return a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
