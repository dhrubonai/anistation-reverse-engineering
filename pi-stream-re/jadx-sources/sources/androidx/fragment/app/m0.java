package androidx.fragment.app;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final n.k f930b = new n.k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f931a;

    public m0(s0 s0Var) {
        this.f931a = s0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        n.k kVar = f930b;
        n.k kVar2 = (n.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new n.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, null);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            kVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new w(r.f.e("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new w(r.f.e("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public final y a(String str) {
        Context context = this.f931a.f986t.D;
        Object obj = y.f1028l0;
        try {
            return (y) c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new w(r.f.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new w(r.f.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new w(r.f.e("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new w(r.f.e("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
