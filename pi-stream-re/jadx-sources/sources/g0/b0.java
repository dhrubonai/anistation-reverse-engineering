package g0;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f4166a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f4167b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f4168c;

    public b0(View view, Runnable runnable) {
        this.f4166a = view;
        this.f4167b = view.getViewTreeObserver();
        this.f4168c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                b0 b0Var = new b0(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(b0Var);
                view.addOnAttachStateChangeListener(b0Var);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f4167b.isAlive();
        View view = this.f4166a;
        if (isAlive) {
            this.f4167b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f4168c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f4167b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f4167b.isAlive();
        View view2 = this.f4166a;
        if (isAlive) {
            this.f4167b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
