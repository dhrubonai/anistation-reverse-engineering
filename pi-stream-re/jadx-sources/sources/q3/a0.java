package q3;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f9121a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f9122b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f9121a = new f0();
        } else {
            f9121a = new e0();
        }
        f9122b = new c(5, Float.class, "translationAlpha");
        new c(6, Rect.class, "clipBounds");
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f9121a.B(view, i10, i11, i12, i13);
    }
}
