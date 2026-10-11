package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class vd2 extends h2 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, vd2> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected eo6 unknownFields;

    public vd2() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = eo6.f;
    }

    public static vd2 d(Class cls) {
        vd2 vd2Var = defaultInstanceMap.get(cls);
        if (vd2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vd2Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (vd2Var == null) {
            try {
                vd2 vd2Var2 = (vd2) ((vd2) so6.a.allocateInstance(cls)).c(6);
                if (vd2Var2 != null) {
                    defaultInstanceMap.put(cls, vd2Var2);
                    return vd2Var2;
                }
                p65.l();
                return null;
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            }
        }
        return vd2Var;
    }

    public static Object e(Method method, vd2 vd2Var, Object... objArr) {
        try {
            return method.invoke(vd2Var, objArr);
        } catch (IllegalAccessException e) {
            ov3.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    ov3.k("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean f(vd2 vd2Var, boolean z) {
        byte byteValue = ((Byte) vd2Var.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        ew4 ew4Var = ew4.c;
        ew4Var.getClass();
        boolean c = ew4Var.a(vd2Var.getClass()).c(vd2Var);
        if (z) {
            vd2Var.c(2);
        }
        return c;
    }

    public static void j(Class cls, vd2 vd2Var) {
        vd2Var.h();
        defaultInstanceMap.put(cls, vd2Var);
    }

    @Override // defpackage.h2
    public final int a(zb5 zb5Var) {
        int h;
        int h2;
        if (g()) {
            if (zb5Var == null) {
                ew4 ew4Var = ew4.c;
                ew4Var.getClass();
                h2 = ew4Var.a(getClass()).h(this);
            } else {
                h2 = zb5Var.h(this);
            }
            if (h2 >= 0) {
                return h2;
            }
            ze0.m(qx1.h(h2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (zb5Var == null) {
            ew4 ew4Var2 = ew4.c;
            ew4Var2.getClass();
            h = ew4Var2.a(getClass()).h(this);
        } else {
            h = zb5Var.h(this);
        }
        k(h);
        return h;
    }

    @Override // defpackage.h2
    public final void b(to0 to0Var) {
        ew4 ew4Var = ew4.c;
        ew4Var.getClass();
        zb5 a = ew4Var.a(getClass());
        i75 i75Var = to0Var.a;
        if (i75Var == null) {
            i75Var = new i75(to0Var);
        }
        a.g(this, i75Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ew4 ew4Var = ew4.c;
        ew4Var.getClass();
        return ew4Var.a(getClass()).e(this, (vd2) obj);
    }

    public final boolean g() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            ew4 ew4Var = ew4.c;
            ew4Var.getClass();
            return ew4Var.a(getClass()).f(this);
        }
        int i = this.memoizedHashCode;
        if (i == 0) {
            ew4 ew4Var2 = ew4.c;
            ew4Var2.getClass();
            int f = ew4Var2.a(getClass()).f(this);
            this.memoizedHashCode = f;
            return f;
        }
        return i;
    }

    public final vd2 i() {
        return (vd2) c(4);
    }

    public final void k(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            ze0.m(qx1.h(i, "serialized size must be non-negative, was "));
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = by3.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        by3.c(this, sb, 0);
        return sb.toString();
    }
}
