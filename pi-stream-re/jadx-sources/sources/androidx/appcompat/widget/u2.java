package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class u2 extends o2 implements p2 {
    public static final Method V;
    public p2 U;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                V = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public u2(Context context, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // androidx.appcompat.widget.o2
    public final b2 a(Context context, boolean z9) {
        t2 t2Var = new t2(context, z9);
        t2Var.setHoverListener(this);
        return t2Var;
    }

    @Override // androidx.appcompat.widget.p2
    public final void h(j.o oVar, MenuItem menuItem) {
        p2 p2Var = this.U;
        if (p2Var != null) {
            p2Var.h(oVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.p2
    public final void n(j.o oVar, j.q qVar) {
        p2 p2Var = this.U;
        if (p2Var != null) {
            p2Var.n(oVar, qVar);
        }
    }
}
