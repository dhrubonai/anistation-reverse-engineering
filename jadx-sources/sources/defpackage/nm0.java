package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nm0 {
    public static final nm0 c = new nm0();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, mm0 mm0Var, dg3 dg3Var, Class cls) {
        dg3 dg3Var2 = (dg3) hashMap.get(mm0Var);
        if (dg3Var2 != null && dg3Var != dg3Var2) {
            String name = mm0Var.b.getName();
            String name2 = cls.getName();
            ze0.k(qx1.q(h11.o("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(dg3Var2), ", new value ", String.valueOf(dg3Var)));
            return;
        }
        if (dg3Var2 == null) {
            hashMap.put(mm0Var, dg3Var);
        }
    }

    public final lm0 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            lm0 lm0Var = (lm0) hashMap2.get(superclass);
            if (lm0Var == null) {
                lm0Var = a(superclass, null);
            }
            hashMap.putAll(lm0Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            lm0 lm0Var2 = (lm0) hashMap2.get(cls2);
            if (lm0Var2 == null) {
                lm0Var2 = a(cls2, null);
            }
            for (Map.Entry entry : lm0Var2.b.entrySet()) {
                b(hashMap, (mm0) entry.getKey(), (dg3) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            fe4 fe4Var = (fe4) method.getAnnotation(fe4.class);
            if (fe4Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (og3.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        ze0.k("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i = 0;
                }
                dg3 value = fe4Var.value();
                if (parameterTypes.length > 1) {
                    if (dg3.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == dg3.ON_ANY) {
                            i = 2;
                        } else {
                            ze0.k("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        ze0.k("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new mm0(i, method), value, cls);
                    z = true;
                } else {
                    ze0.k("cannot have more than 2 params");
                    return null;
                }
            }
        }
        lm0 lm0Var3 = new lm0(hashMap);
        hashMap2.put(cls, lm0Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return lm0Var3;
    }
}
