package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1152a = com.bumptech.glide.c.M(Application.class, o0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f1153b = com.bumptech.glide.c.L(o0.class);

    public static final Constructor a(Class cls, List list) {
        r6.h0.u(cls, "modelClass");
        r6.h0.u(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        r6.h0.s(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            r6.h0.s(parameterTypes, "constructor.parameterTypes");
            List o12 = x6.i.o1(parameterTypes);
            if (r6.h0.g(list, o12)) {
                return constructor;
            }
            if (list.size() == o12.size() && o12.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final w0 b(Class cls, Constructor constructor, Object... objArr) {
        r6.h0.u(cls, "modelClass");
        try {
            return (w0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
