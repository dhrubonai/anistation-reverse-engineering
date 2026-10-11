package g0;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f4250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a0 f4251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f4252c;

    public r1(View view, x1 x1Var, androidx.appcompat.widget.a0 a0Var, ValueAnimator valueAnimator) {
        this.f4250a = view;
        this.f4251b = a0Var;
        this.f4252c = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t1.h(this.f4250a, this.f4251b);
        this.f4252c.start();
    }
}
