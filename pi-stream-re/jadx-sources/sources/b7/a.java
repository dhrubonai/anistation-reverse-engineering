package b7;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p7.a0;
import r6.h0;

/* loaded from: classes.dex */
public abstract class a implements z6.e, d, Serializable {
    private final z6.e completion;

    public a(z6.e eVar) {
        this.completion = eVar;
    }

    public z6.e create(z6.e eVar) {
        h0.u(eVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // b7.d
    public d getCallerFrame() {
        z6.e eVar = this.completion;
        if (eVar instanceof d) {
            return (d) eVar;
        }
        return null;
    }

    public final z6.e getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i10;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i11;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v9 = eVar.v();
        if (v9 <= 1) {
            int i12 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = eVar.l()[i10];
            }
            f.c cVar = a0.f8646k;
            f.c cVar2 = a0.f8645j;
            if (cVar == null) {
                try {
                    cVar = new f.c(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]), 18, 0);
                    a0.f8646k = cVar;
                } catch (Exception unused2) {
                    a0.f8646k = cVar2;
                    cVar = cVar2;
                }
            }
            if (cVar != cVar2) {
                Method method = (Method) cVar.f3635b;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = (Method) cVar.f3636c;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = (Method) cVar.f3637d;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v9 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // z6.e
    public final void resumeWith(Object obj) {
        z6.e eVar = this;
        while (true) {
            a aVar = (a) eVar;
            z6.e eVar2 = aVar.completion;
            h0.q(eVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == a7.a.f156a) {
                    return;
                }
            } catch (Throwable th) {
                obj = h0.F(th);
            }
            aVar.releaseIntercepted();
            if (eVar2 instanceof a) {
                eVar = eVar2;
            } else {
                eVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public z6.e create(Object obj, z6.e eVar) {
        h0.u(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
