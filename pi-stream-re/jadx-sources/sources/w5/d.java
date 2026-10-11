package w5;

import android.view.View;
import android.view.WindowInsets;
import android.view.animation.LinearInterpolator;
import g0.k2;
import g0.x1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f11005a;

    /* renamed from: b, reason: collision with root package name */
    public final View f11006b;

    /* renamed from: c, reason: collision with root package name */
    public int f11007c;

    /* renamed from: d, reason: collision with root package name */
    public int f11008d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f11009e = new int[2];

    public d(View view) {
        this.f11006b = view;
    }

    public final void a(k2 k2Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x1 x1Var = (x1) it.next();
            if ((x1Var.f4276a.c() & 8) != 0) {
                int i10 = this.f11008d;
                float b10 = x1Var.f4276a.b();
                LinearInterpolator linearInterpolator = t5.a.f10034a;
                this.f11006b.setTranslationY(Math.round(b10 * (0 - i10)) + i10);
                return;
            }
        }
    }
}
