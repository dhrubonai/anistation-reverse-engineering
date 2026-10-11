package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class bs6 {
    public final js a;
    public final js b;
    public final js c;

    public bs6(js jsVar, js jsVar2, js jsVar3) {
        this.a = jsVar;
        this.b = jsVar2;
        this.c = jsVar3;
    }

    public abstract cs6 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        js jsVar = this.c;
        Class cls2 = (Class) jsVar.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
            jsVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        js jsVar = this.a;
        Method method = (Method) jsVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, bs6.class.getClassLoader()).getDeclaredMethod("read", bs6.class);
            jsVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        js jsVar = this.b;
        Method method = (Method) jsVar.get(name);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, bs6.class);
            jsVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        if (!e(i2)) {
            return i;
        }
        return ((cs6) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((cs6) this).e.readParcelable(cs6.class.getClassLoader());
    }

    public final ds6 h() {
        String readString = ((cs6) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (ds6) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            ov3.k("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            ov3.k("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ov3.k("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                ov3.k("VersionedParcel encountered InvocationTargetException", e4);
                return null;
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((cs6) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((cs6) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(ds6 ds6Var) {
        if (ds6Var == null) {
            ((cs6) this).e.writeString(null);
            return;
        }
        try {
            ((cs6) this).e.writeString(b(ds6Var.getClass()).getName());
            cs6 a = a();
            try {
                d(ds6Var.getClass()).invoke(null, ds6Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                ov3.k("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                ov3.k("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                ov3.k("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    ov3.k("VersionedParcel encountered InvocationTargetException", e4);
                    return;
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            ov3.k(ds6Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
