package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class im0 implements e73, gm0, d93 {
    public static final Map y;
    public final Class x;

    static {
        List I = te4.I(sb2.class, ub2.class, ic2.class, jc2.class, kc2.class, lc2.class, mc2.class, nc2.class, oc2.class, pc2.class, tb2.class, vb2.class, wb2.class, xb2.class, yb2.class, zb2.class, ac2.class, bc2.class, cc2.class, dc2.class, fc2.class, gc2.class, hc2.class);
        ArrayList arrayList = new ArrayList(zo0.V(I, 10));
        int i = 0;
        for (Object obj : I) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new ai4((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                te4.R();
                throw null;
            }
        }
        y = vn3.Y(arrayList);
    }

    public im0(Class cls) {
        cls.getClass();
        this.x = cls;
    }

    @Override // defpackage.gm0
    public final Class d() {
        return this.x;
    }

    public final String e() {
        String i;
        Class cls = this.x;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (i = z51.i(componentType.getName())) != null) {
                str = i.concat("Array");
            }
            if (str == null) {
                return "kotlin.Array";
            }
            return str;
        }
        String i2 = z51.i(cls.getName());
        if (i2 == null) {
            return cls.getCanonicalName();
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof im0) && t80.N(this).equals(t80.N((e73) obj))) {
            return true;
        }
        return false;
    }

    public final String f() {
        String N;
        Class cls = this.x;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return uz5.m0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return uz5.m0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            return uz5.l0('$', simpleName, simpleName);
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (N = z51.N(componentType.getName())) != null) {
                str = N.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        }
        String N2 = z51.N(cls.getName());
        if (N2 == null) {
            return cls.getSimpleName();
        }
        return N2;
    }

    @Override // defpackage.d93
    public final GenericDeclaration findJavaDeclaration() {
        return this.x;
    }

    public final boolean g(Object obj) {
        Class cls = this.x;
        cls.getClass();
        Map map = y;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return wk6.u(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = t80.N(z05.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final int hashCode() {
        return t80.N(this).hashCode();
    }

    public final String toString() {
        return this.x.toString() + " (Kotlin reflection is not available)";
    }
}
