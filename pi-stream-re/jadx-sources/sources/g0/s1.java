package g0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final w5.d f4253a;

    /* renamed from: b, reason: collision with root package name */
    public k2 f4254b;

    public s1(View view, w5.d dVar) {
        k2 k2Var;
        c2 z1Var;
        this.f4253a = dVar;
        WeakHashMap weakHashMap = y0.f4277a;
        k2 a10 = o0.a(view);
        if (a10 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                z1Var = new b2(a10);
            } else if (i10 >= 29) {
                z1Var = new a2(a10);
            } else {
                z1Var = new z1(a10);
            }
            k2Var = z1Var.b();
        } else {
            k2Var = null;
        }
        this.f4254b = k2Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f4254b = k2.h(view, windowInsets);
            return t1.i(view, windowInsets);
        }
        k2 h10 = k2.h(view, windowInsets);
        if (this.f4254b == null) {
            WeakHashMap weakHashMap = y0.f4277a;
            this.f4254b = o0.a(view);
        }
        if (this.f4254b == null) {
            this.f4254b = h10;
            return t1.i(view, windowInsets);
        }
        w5.d j4 = t1.j(view);
        if (j4 != null && Objects.equals(j4.f11005a, windowInsets)) {
            return t1.i(view, windowInsets);
        }
        k2 k2Var = this.f4254b;
        int i10 = 0;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if (!h10.a(i11).equals(k2Var.a(i11))) {
                i10 |= i11;
            }
        }
        if (i10 == 0) {
            return t1.i(view, windowInsets);
        }
        k2 k2Var2 = this.f4254b;
        x1 x1Var = new x1(i10, new DecelerateInterpolator(), 160L);
        w1 w1Var = x1Var.f4276a;
        w1Var.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w1Var.a());
        z.d a10 = h10.a(i10);
        z.d a11 = k2Var2.a(i10);
        int min = Math.min(a10.f11856a, a11.f11856a);
        int i12 = a10.f11857b;
        int i13 = a11.f11857b;
        int min2 = Math.min(i12, i13);
        int i14 = a10.f11858c;
        int i15 = a11.f11858c;
        int min3 = Math.min(i14, i15);
        int i16 = a10.f11859d;
        int i17 = i10;
        int i18 = a11.f11859d;
        androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0(5, z.d.b(min, min2, min3, Math.min(i16, i18)), z.d.b(Math.max(a10.f11856a, a11.f11856a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)));
        t1.f(view, windowInsets, false);
        duration.addUpdateListener(new q1(x1Var, h10, k2Var2, i17, view));
        duration.addListener(new j1(this, x1Var, view, 1));
        b0.a(view, new r1(view, x1Var, a0Var, duration));
        this.f4254b = h10;
        return t1.i(view, windowInsets);
    }
}
