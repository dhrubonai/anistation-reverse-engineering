package z;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p7.a0;

/* loaded from: classes.dex */
public class l extends j {
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;

    /* renamed from: y, reason: collision with root package name */
    public final Class f11876y;

    /* renamed from: z, reason: collision with root package name */
    public final Constructor f11877z;

    public l() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = P(cls);
            method3 = Q(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = R(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f11876y = cls;
        this.f11877z = constructor;
        this.A = method2;
        this.B = method3;
        this.C = method4;
        this.D = method;
        this.E = method5;
    }

    public static Method P(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method Q(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // f.p0
    public final Typeface B(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        if (!O()) {
            return super.B(context, resources, i10, str, i11);
        }
        try {
            obj = this.f11877z.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!L(context, obj, str, 0, -1, -1, null)) {
            try {
                this.D.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (!N(obj)) {
            return null;
        }
        return M(obj);
    }

    public final boolean L(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.A.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface M(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f11876y, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.E.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean N(Object obj) {
        try {
            return ((Boolean) this.C.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean O() {
        Method method = this.A;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public Method R(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // z.j, f.p0
    public final Typeface y(Context context, y.f fVar, Resources resources, int i10) {
        Object obj;
        if (!O()) {
            return super.y(context, fVar, resources, i10);
        }
        try {
            obj = this.f11877z.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (y.g gVar : fVar.f11426a) {
            if (!L(context, obj, gVar.f11427a, gVar.f11431e, gVar.f11428b, gVar.f11429c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f11430d))) {
                try {
                    this.D.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!N(obj)) {
            return null;
        }
        return M(obj);
    }

    @Override // z.j, f.p0
    public final Typeface z(Context context, d0.i[] iVarArr, int i10) {
        Object obj;
        Typeface M;
        boolean z9;
        if (iVarArr.length < 1) {
            return null;
        }
        if (!O()) {
            d0.i D = D(i10, iVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(D.f3028a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(D.f3030c).setItalic(D.f3031d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            HashMap hashMap = new HashMap();
            for (d0.i iVar : iVarArr) {
                if (iVar.f3032e == 0) {
                    Uri uri = iVar.f3028a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, a0.O(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f11877z.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = iVarArr.length;
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                Method method = this.D;
                if (i11 < length) {
                    d0.i iVar2 = iVarArr[i11];
                    ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f3028a);
                    if (byteBuffer != null) {
                        try {
                            z9 = ((Boolean) this.B.invoke(obj, byteBuffer, Integer.valueOf(iVar2.f3029b), null, Integer.valueOf(iVar2.f3030c), Integer.valueOf(iVar2.f3031d ? 1 : 0))).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                            z9 = false;
                        }
                        if (!z9) {
                            try {
                                method.invoke(obj, new Object[0]);
                                return null;
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                return null;
                            }
                        }
                        z10 = true;
                    }
                    i11++;
                    z10 = z10;
                } else {
                    if (!z10) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                            return null;
                        }
                    }
                    if (!N(obj) || (M = M(obj)) == null) {
                        return null;
                    }
                    return Typeface.create(M, i10);
                }
            }
        }
    }
}
