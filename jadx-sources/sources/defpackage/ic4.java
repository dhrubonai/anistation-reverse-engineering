package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ic4 extends ua7 implements tt2 {
    public final Object f;

    public ic4(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", (byte) 2);
        this.f = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [tt2, sa7] */
    public static tt2 L(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof tt2) {
            return (tt2) queryLocalInterface;
        }
        return new sa7(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", (byte) 2);
    }

    public static Object M(tt2 tt2Var) {
        if (tt2Var instanceof ic4) {
            return ((ic4) tt2Var).f;
        }
        IBinder asBinder = tt2Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            a34.x(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            ze0.k("IObjectWrapper declared field not private!");
            return null;
        }
        int length = declaredFields.length;
        ze0.k(h11.g(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        return null;
    }
}
