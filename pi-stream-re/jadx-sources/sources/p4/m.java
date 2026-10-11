package p4;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f8575a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f8576b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f8577c;

    public static void a() {
        boolean z9;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static ArrayList d(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler e() {
        if (f8577c == null) {
            synchronized (m.class) {
                if (f8577c == null) {
                    f8577c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f8577c;
    }

    public static int f(int i10, Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (i10 * 31) + hashCode;
    }

    public static int g(int i10, boolean z9) {
        return (i10 * 31) + (z9 ? 1 : 0);
    }

    public static boolean h(int i10, int i11) {
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }
        return false;
    }
}
