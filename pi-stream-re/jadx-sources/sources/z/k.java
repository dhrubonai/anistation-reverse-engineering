package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import f.p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p7.a0;

/* loaded from: classes.dex */
public final class k extends p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f11872c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f11873d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f11874e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f11875f;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f11873d = constructor;
        f11872c = cls;
        f11874e = method2;
        f11875f = method;
    }

    public k() {
        super(9, 0);
    }

    public static boolean J(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z9) {
        try {
            return ((Boolean) f11874e.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // f.p0
    public final Typeface y(Context context, y.f fVar, Resources resources, int i10) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f11873d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (y.g gVar : fVar.f11426a) {
            int i11 = gVar.f11432f;
            File E = a0.E(context);
            if (E != null) {
                try {
                    if (a0.j(E, resources, i11)) {
                        try {
                            fileInputStream = new FileInputStream(E);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !J(obj, mappedByteBuffer, gVar.f11431e, gVar.f11428b, gVar.f11429c)) {
                                return null;
                            }
                        } finally {
                            break;
                        }
                    }
                } finally {
                    E.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance((Class<?>) f11872c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f11875f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // f.p0
    public final Typeface z(Context context, d0.i[] iVarArr, int i10) {
        Object obj;
        Typeface typeface;
        try {
            obj = f11873d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        n.k kVar = new n.k();
        for (d0.i iVar : iVarArr) {
            Uri uri = iVar.f3028a;
            ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = a0.O(context, uri);
                kVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !J(obj, byteBuffer, iVar.f3029b, iVar.f3030c, iVar.f3031d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance((Class<?>) f11872c, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f11875f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i10);
    }
}
