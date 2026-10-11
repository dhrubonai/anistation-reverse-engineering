package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wd1 implements vd1, i67 {
    public static final wd1 x = new Object();
    public static final wd1 y = new Object();

    @Override // defpackage.i67
    public e67 a(Context context, vd1 vd1Var) {
        WindowManager windowManager;
        if (context.isUiContext()) {
            windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        } else {
            windowManager = (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        }
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new e67(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.vd1
    public float c(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
