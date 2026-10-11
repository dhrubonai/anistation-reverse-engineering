package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xv6 extends zv6 {
    public static xv6 c;
    public static final y95 d = new y95((byte) 8);
    public final Application b;

    public xv6(Application application) {
        this.b = application;
    }

    @Override // defpackage.zv6, defpackage.yv6
    public final vv6 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        ov3.g("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.zv6, defpackage.yv6
    public final vv6 b(Class cls, o34 o34Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) o34Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!lg.class.isAssignableFrom(cls)) {
            return kb0.p(cls);
        }
        ze0.k("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final vv6 d(Class cls, Application application) {
        if (lg.class.isAssignableFrom(cls)) {
            try {
                vv6 vv6Var = (vv6) cls.getConstructor(Application.class).newInstance(application);
                vv6Var.getClass();
                return vv6Var;
            } catch (IllegalAccessException e) {
                qi2.l("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                qi2.l("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                qi2.l("Cannot create an instance of ", cls, e3);
                return null;
            } catch (InvocationTargetException e4) {
                qi2.l("Cannot create an instance of ", cls, e4);
                return null;
            }
        }
        return kb0.p(cls);
    }
}
