package s3;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f9886a;

    /* renamed from: b, reason: collision with root package name */
    public final e f9887b;

    /* renamed from: c, reason: collision with root package name */
    public final e f9888c;

    public a(e eVar, e eVar2, e eVar3) {
        this.f9886a = eVar;
        this.f9887b = eVar2;
        this.f9888c = eVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f9888c;
        Class cls2 = (Class) eVar.getOrDefault(name, null);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            eVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        e eVar = this.f9886a;
        Method method = (Method) eVar.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            eVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f9887b;
        Method method = (Method) eVar.getOrDefault(name, null);
        if (method == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, a.class);
            eVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i10);

    public final int f(int i10, int i11) {
        if (!e(i11)) {
            return i10;
        }
        return ((b) this).f9890e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i10) {
        if (!e(i10)) {
            return parcelable;
        }
        return ((b) this).f9890e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f9890e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void i(int i10);

    public final void j(int i10, int i11) {
        i(i11);
        ((b) this).f9890e.writeInt(i10);
    }

    public final void k(Parcelable parcelable, int i10) {
        i(i10);
        ((b) this).f9890e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) {
        if (cVar == null) {
            ((b) this).f9890e.writeString(null);
            return;
        }
        try {
            ((b) this).f9890e.writeString(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a10);
                int i10 = a10.f9894i;
                if (i10 >= 0) {
                    int i11 = a10.f9889d.get(i10);
                    Parcel parcel = a10.f9890e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i11);
                    parcel.writeInt(dataPosition - i11);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (e13.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e13.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
