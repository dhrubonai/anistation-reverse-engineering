package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class sf0 implements d73, Serializable, d93 {
    public static final Object NO_RECEIVER = rf0.x;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient d73 reflected;
    private final String signature;

    public sf0(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.d73
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.d73
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public d73 compute() {
        d73 d73Var = this.reflected;
        if (d73Var == null) {
            d73 computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return d73Var;
    }

    public d73 computeReflected() {
        z05.a.getClass();
        return this;
    }

    @Override // defpackage.d93
    public GenericDeclaration findJavaDeclaration() {
        h73 owner = getOwner();
        String signature = getSignature();
        signature.getClass();
        if (owner instanceof gm0) {
            String p0 = uz5.p0(signature, '(');
            if (!p0.equals("<init>")) {
                Method[] declaredMethods = ((gm0) owner).d().getDeclaredMethods();
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    if (a34.i(method.getName(), p0)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(method.getName());
                        sb.append("(");
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        for (Class<?> cls : parameterTypes) {
                            cls.getClass();
                            io3.g(sb, cls);
                        }
                        sb.append(")");
                        Class<?> returnType = method.getReturnType();
                        returnType.getClass();
                        io3.g(sb, returnType);
                        if (sb.toString().equals(signature)) {
                            return method;
                        }
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        return null;
    }

    @Override // defpackage.c73
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public h73 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            z05.a.getClass();
            return new qh4(cls);
        }
        return z05.a(cls);
    }

    @Override // defpackage.d73
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract d73 getReflected();

    @Override // defpackage.d73
    public y73 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.d73
    public List<yk6> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.d73
    public d83 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.d73
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.d73
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.d73
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.d73
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
