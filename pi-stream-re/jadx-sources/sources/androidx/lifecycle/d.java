package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f1089c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1090a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1091b = new HashMap();

    public static void c(HashMap hashMap, c cVar, n nVar, Class cls) {
        n nVar2 = (n) hashMap.get(cVar);
        if (nVar2 != null && nVar != nVar2) {
            throw new IllegalArgumentException("Method " + cVar.f1077b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + nVar2 + ", new value " + nVar);
        }
        if (nVar2 == null) {
            hashMap.put(cVar, nVar);
        }
    }

    public final b a(Class cls, Method[] methodArr) {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1073b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).f1073b.entrySet()) {
                c(hashMap, (c) entry.getKey(), (n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z9 = false;
        for (Method method : methodArr) {
            e0 e0Var = (e0) method.getAnnotation(e0.class);
            if (e0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (u.class.isAssignableFrom(parameterTypes[0])) {
                        i10 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i10 = 0;
                }
                n value = e0Var.value();
                if (parameterTypes.length > 1) {
                    if (n.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == n.ON_ANY) {
                            i10 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new c(i10, method), value, cls);
                    z9 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        b bVar = new b(hashMap);
        this.f1090a.put(cls, bVar);
        this.f1091b.put(cls, Boolean.valueOf(z9));
        return bVar;
    }

    public final b b(Class cls) {
        b bVar = (b) this.f1090a.get(cls);
        if (bVar != null) {
            return bVar;
        }
        return a(cls, null);
    }
}
