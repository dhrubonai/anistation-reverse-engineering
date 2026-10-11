package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class mf7 extends qe7 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected gh7 zzc;

    public mf7() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = gh7.f;
    }

    public static mf7 c(mf7 mf7Var, byte[] bArr, ff7 ff7Var) {
        int length = bArr.length;
        if (length != 0) {
            mf7 g = mf7Var.g();
            try {
                xg7 a = ug7.c.a(g.getClass());
                a.g(g, bArr, 0, length, new m97(ff7Var));
                a.f(g);
                mf7Var = g;
            } catch (ag7 e) {
                if (e.x) {
                    throw new IOException(e.getMessage(), e);
                }
                throw e;
            } catch (bh7 e2) {
                throw e2.a();
            } catch (IOException e3) {
                if (e3.getCause() instanceof ag7) {
                    throw ((ag7) e3.getCause());
                }
                throw new IOException(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        p(mf7Var);
        return mf7Var;
    }

    public static mf7 l(Class cls) {
        Map map = zze;
        mf7 mf7Var = (mf7) map.get(cls);
        if (mf7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                mf7Var = (mf7) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (mf7Var == null) {
            try {
                mf7 mf7Var2 = (mf7) ((mf7) ih7.a.allocateInstance(cls)).q(6);
                if (mf7Var2 != null) {
                    map.put(cls, mf7Var2);
                    return mf7Var2;
                }
                p65.l();
                return null;
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            }
        }
        return mf7Var;
    }

    public static void m(Class cls, mf7 mf7Var) {
        mf7Var.f();
        zze.put(cls, mf7Var);
    }

    public static Object n(Method method, mf7 mf7Var, Object... objArr) {
        try {
            return method.invoke(mf7Var, objArr);
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

    public static final boolean o(mf7 mf7Var, boolean z) {
        byte byteValue = ((Byte) mf7Var.q(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = ug7.c.a(mf7Var.getClass()).d(mf7Var);
        if (z) {
            mf7Var.q(2);
        }
        return d;
    }

    public static void p(mf7 mf7Var) {
        if (mf7Var != null && !o(mf7Var, true)) {
            throw new bh7().a();
        }
    }

    @Override // defpackage.qe7
    public final int b(xg7 xg7Var) {
        if (e()) {
            int c = xg7Var.c(this);
            if (c >= 0) {
                return c;
            }
            jz7.f(String.valueOf(c).length() + 42, c);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int c2 = xg7Var.c(this);
            if (c2 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | c2;
                return c2;
            }
            jz7.f(String.valueOf(c2).length() + 42, c2);
            return 0;
        }
        return i;
    }

    public final void d(ef7 ef7Var) {
        xg7 a = ug7.c.a(getClass());
        ub7 ub7Var = ef7Var.a;
        if (ub7Var == null) {
            ub7Var = new ub7(ef7Var);
        }
        a.e(this, ub7Var);
    }

    public final boolean e() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ug7.c.a(getClass()).i(this, (mf7) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final mf7 g() {
        return (mf7) q(4);
    }

    public final kf7 h() {
        return (kf7) q(5);
    }

    public final int hashCode() {
        if (!e()) {
            int i = this.zza;
            if (i == 0) {
                int h = ug7.c.a(getClass()).h(this);
                this.zza = h;
                return h;
            }
            return i;
        }
        return ug7.c.a(getClass()).h(this);
    }

    public final kf7 i() {
        kf7 kf7Var = (kf7) q(5);
        kf7Var.f(this);
        return kf7Var;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int c = ug7.c.a(getClass()).c(this);
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
        int c2 = ug7.c.a(getClass()).c(this);
        if (c2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | c2;
            return c2;
        }
        jz7.f(String.valueOf(c2).length() + 42, c2);
        return 0;
    }

    public abstract Object q(int i);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = og7.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        og7.b(this, sb, 0);
        return sb.toString();
    }
}
