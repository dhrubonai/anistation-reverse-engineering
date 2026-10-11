package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1163a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1164b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            r6.h0.s(newInstance, "{\n            constructo…tance(`object`)\n        }");
            a3.g.C(newInstance);
            throw null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z9;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        HashMap hashMap = f1163a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r42 != null) {
                    str = r42.getName();
                } else {
                    str = "";
                }
                r6.h0.s(str, "fullPackage");
                if (str.length() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    r6.h0.s(canonicalName, "name");
                    canonicalName = canonicalName.substring(str.length() + 1);
                    r6.h0.s(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                r6.h0.s(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = o7.j.y1(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap hashMap2 = f1164b;
            if (constructor != null) {
                hashMap2.put(cls, com.bumptech.glide.c.L(constructor));
            } else {
                d dVar = d.f1089c;
                HashMap hashMap3 = dVar.f1091b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z9 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (((e0) declaredMethods[i11].getAnnotation(e0.class)) != null) {
                                    dVar.a(cls, declaredMethods);
                                    z9 = true;
                                    break;
                                }
                                i11++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z9 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z9) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && t.class.isAssignableFrom(superclass)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        r6.h0.s(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            r6.h0.q(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    r6.h0.s(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class<?> cls2 = interfaces[i12];
                            if (cls2 != null && t.class.isAssignableFrom(cls2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                r6.h0.s(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                r6.h0.q(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i12++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
