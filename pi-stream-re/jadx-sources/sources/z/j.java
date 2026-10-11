package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import f.p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p7.a0;

/* loaded from: classes.dex */
public class j extends p0 {

    /* renamed from: c, reason: collision with root package name */
    public static Class f11867c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f11868d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f11869e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f11870f = null;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f11871x = false;

    public j() {
        super(9, 0);
    }

    public static boolean J(int i10, Object obj, String str, boolean z9) {
        K();
        try {
            return ((Boolean) f11869e.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void K() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f11871x) {
            return;
        }
        f11871x = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f11868d = constructor;
        f11867c = cls;
        f11869e = method2;
        f11870f = method;
    }

    @Override // f.p0
    public Typeface y(Context context, y.f fVar, Resources resources, int i10) {
        K();
        try {
            Object newInstance = f11868d.newInstance(new Object[0]);
            for (y.g gVar : fVar.f11426a) {
                File E = a0.E(context);
                if (E == null) {
                    return null;
                }
                try {
                    if (!a0.j(E, resources, gVar.f11432f)) {
                        return null;
                    }
                    if (!J(gVar.f11428b, newInstance, E.getPath(), gVar.f11429c)) {
                        return null;
                    }
                    E.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    E.delete();
                }
            }
            K();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f11867c, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f11870f.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // f.p0
    public Typeface z(Context context, d0.i[] iVarArr, int i10) {
        File file;
        String readlink;
        if (iVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(D(i10, iVarArr).f3028a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                try {
                    if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                        file = new File(readlink);
                        if (file != null && file.canRead()) {
                            Typeface createFromFile = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface A = A(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return A;
                    }
                    Typeface A2 = A(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return A2;
                } finally {
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
