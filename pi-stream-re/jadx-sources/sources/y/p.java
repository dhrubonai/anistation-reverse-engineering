package y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f11448a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f11449b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11450c = new Object();

    public static void a(l lVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f11450c) {
            WeakHashMap weakHashMap = f11449b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(lVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(lVar, sparseArray);
            }
            sparseArray.append(i10, new k(colorStateList, lVar.f11440a.getConfiguration(), theme));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, z7.c r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.p.b(android.content.Context, int, android.util.TypedValue, int, z7.c, boolean, boolean):android.graphics.Typeface");
    }
}
