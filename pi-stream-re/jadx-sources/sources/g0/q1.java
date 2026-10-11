package g0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import java.util.Collections;

/* loaded from: classes.dex */
public final class q1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x1 f4242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f4243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f4244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f4246e;

    public q1(x1 x1Var, k2 k2Var, k2 k2Var2, int i10, View view) {
        this.f4242a = x1Var;
        this.f4243b = k2Var;
        this.f4244c = k2Var2;
        this.f4245d = i10;
        this.f4246e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c2 z1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        x1 x1Var = this.f4242a;
        x1Var.f4276a.d(animatedFraction);
        float b10 = x1Var.f4276a.b();
        int i10 = Build.VERSION.SDK_INT;
        k2 k2Var = this.f4243b;
        if (i10 >= 30) {
            z1Var = new b2(k2Var);
        } else if (i10 >= 29) {
            z1Var = new a2(k2Var);
        } else {
            z1Var = new z1(k2Var);
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((this.f4245d & i11) == 0) {
                z1Var.c(i11, k2Var.a(i11));
            } else {
                z.d a10 = k2Var.a(i11);
                z.d a11 = this.f4244c.a(i11);
                float f10 = 1.0f - b10;
                z1Var.c(i11, k2.f(a10, (int) (((a10.f11856a - a11.f11856a) * f10) + 0.5d), (int) (((a10.f11857b - a11.f11857b) * f10) + 0.5d), (int) (((a10.f11858c - a11.f11858c) * f10) + 0.5d), (int) (((a10.f11859d - a11.f11859d) * f10) + 0.5d)));
            }
        }
        t1.g(this.f4246e, z1Var.b(), Collections.singletonList(x1Var));
    }
}
