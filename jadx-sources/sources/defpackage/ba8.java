package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ba8 extends w88 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected tc7 zzc;

    public ba8() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = tc7.e;
    }

    public static ba8 f(Class cls) {
        Map map = zzd;
        ba8 ba8Var = (ba8) map.get(cls);
        if (ba8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ba8Var = (ba8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ba8Var == null) {
            try {
                ba8 ba8Var2 = (ba8) ((ba8) zc7.a.allocateInstance(cls)).i(6, null);
                if (ba8Var2 != null) {
                    map.put(cls, ba8Var2);
                    return ba8Var2;
                }
                p65.l();
                return null;
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            }
        }
        return ba8Var;
    }

    public static void g(Class cls, ba8 ba8Var) {
        ba8Var.k();
        zzd.put(cls, ba8Var);
    }

    public static Object h(Method method, ba8 ba8Var, Object... objArr) {
        try {
            return method.invoke(ba8Var, objArr);
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

    @Override // defpackage.w88
    public final int a() {
        if (j()) {
            int c = mb8.c.a(getClass()).c(this);
            if (c >= 0) {
                return c;
            }
            jz7.f(String.valueOf(c).length() + 42, c);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int c2 = mb8.c.a(getClass()).c(this);
        if (c2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | c2;
            return c2;
        }
        jz7.f(String.valueOf(c2).length() + 42, c2);
        return 0;
    }

    @Override // defpackage.w88
    public final int b(pb8 pb8Var) {
        if (j()) {
            int c = pb8Var.c(this);
            if (c >= 0) {
                return c;
            }
            jz7.f(String.valueOf(c).length() + 42, c);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int c2 = pb8Var.c(this);
            if (c2 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | c2;
                return c2;
            }
            jz7.f(String.valueOf(c2).length() + 42, c2);
            return 0;
        }
        return i;
    }

    public final x98 d() {
        return (x98) i(5, null);
    }

    public final void e() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mb8.c.a(getClass()).d(this, (ba8) obj);
    }

    public final int hashCode() {
        if (!j()) {
            int i = this.zza;
            if (i == 0) {
                int e = mb8.c.a(getClass()).e(this);
                this.zza = e;
                return e;
            }
            return i;
        }
        return mb8.c.a(getClass()).e(this);
    }

    public abstract Object i(int i, ba8 ba8Var);

    public final boolean j() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void k() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = gb8.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        gb8.b(this, sb, 0);
        return sb.toString();
    }
}
