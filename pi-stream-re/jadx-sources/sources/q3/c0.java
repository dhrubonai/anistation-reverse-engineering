package q3;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class c0 extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f9126e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f9127f = true;

    public void A(View view, Matrix matrix) {
        if (f9127f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f9127f = false;
            }
        }
    }

    public void z(View view, Matrix matrix) {
        if (f9126e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f9126e = false;
            }
        }
    }
}
