package q3;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class e0 extends d0 {

    /* renamed from: y, reason: collision with root package name */
    public static boolean f9131y = true;

    @Override // w1.o
    public void v(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.v(view, i10);
        } else if (f9131y) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f9131y = false;
            }
        }
    }
}
