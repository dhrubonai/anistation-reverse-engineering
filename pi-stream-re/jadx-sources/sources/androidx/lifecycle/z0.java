package androidx.lifecycle;

/* loaded from: classes.dex */
public class z0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public static z0 f1169a;

    @Override // androidx.lifecycle.y0
    public w0 create(Class cls, y0.c cVar) {
        r6.h0.u(cls, "modelClass");
        r6.h0.u(cVar, "extras");
        return create(cls);
    }

    @Override // androidx.lifecycle.y0
    public w0 create(Class cls) {
        r6.h0.u(cls, "modelClass");
        try {
            Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            r6.h0.s(newInstance, "{\n                modelC…wInstance()\n            }");
            return (w0) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
