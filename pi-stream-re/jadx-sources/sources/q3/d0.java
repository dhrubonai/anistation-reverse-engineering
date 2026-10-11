package q3;

import android.view.View;

/* loaded from: classes.dex */
public abstract class d0 extends c0 {

    /* renamed from: x, reason: collision with root package name */
    public static boolean f9128x = true;

    public void B(View view, int i10, int i11, int i12, int i13) {
        if (f9128x) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f9128x = false;
            }
        }
    }
}
