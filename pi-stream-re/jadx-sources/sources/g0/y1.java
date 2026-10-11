package g0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f4283a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f4284b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f4285c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4286d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f4283a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f4284b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f4285c = declaredField3;
            declaredField3.setAccessible(true);
            f4286d = true;
        } catch (ReflectiveOperationException e10) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
        }
    }
}
