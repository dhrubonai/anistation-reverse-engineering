package defpackage;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class h30 implements vz0, x11, Serializable {
    private final vz0 completion;

    public h30(vz0 vz0Var) {
        this.completion = vz0Var;
    }

    public vz0 create(vz0 vz0Var) {
        vz0Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.x11
    public x11 getCallerFrame() {
        vz0 vz0Var = this.completion;
        if (vz0Var instanceof x11) {
            return (x11) vz0Var;
        }
        return null;
    }

    public final vz0 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        w51 w51Var = (w51) getClass().getAnnotation(w51.class);
        String str2 = null;
        if (w51Var == null || w51Var.v() < 1) {
            return null;
        }
        int i3 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(this);
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            i = i2 - 1;
        } catch (Exception unused) {
            i = -1;
        }
        if (i >= 0) {
            i3 = w51Var.l()[i];
        }
        st3 st3Var = q23.d;
        st3 st3Var2 = q23.e;
        if (st3Var2 == null) {
            try {
                st3 st3Var3 = new st3(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(MediationMetaData.KEY_NAME, null));
                q23.e = st3Var3;
                st3Var2 = st3Var3;
            } catch (Exception unused2) {
                q23.e = st3Var;
                st3Var2 = st3Var;
            }
        }
        if (st3Var2 != st3Var && (method = (Method) st3Var2.x) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) st3Var2.y) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) st3Var2.z;
            if (method3 != null) {
                obj = method3.invoke(invoke2, null);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        if (str2 == null) {
            str = w51Var.c();
        } else {
            str = str2 + '/' + w51Var.c();
        }
        return new StackTraceElement(str, w51Var.m(), w51Var.f(), i3);
    }

    public Object invokeSuspend(Object obj) {
        m37.N(obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        while (true) {
            h30 h30Var = this;
            vz0 vz0Var = h30Var.completion;
            vz0Var.getClass();
            try {
                obj = h30Var.invokeSuspend(obj);
                if (obj == w11.x) {
                    return;
                }
            } catch (Throwable th) {
                obj = new y45(th);
            }
            h30Var.releaseIntercepted();
            if (vz0Var instanceof h30) {
                this = vz0Var;
            } else {
                vz0Var.resumeWith(obj);
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

    public vz0 create(Object obj, vz0 vz0Var) {
        vz0Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
