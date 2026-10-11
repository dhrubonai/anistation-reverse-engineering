package g0;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4228a;

    public l1(View view) {
        this.f4228a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f4228a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f4228a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j4) {
        View view = (View) this.f4228a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
    }

    public final void d(m1 m1Var) {
        View view = (View) this.f4228a.get();
        if (view != null) {
            if (m1Var != null) {
                view.animate().setListener(new j1(this, m1Var, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f4228a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
