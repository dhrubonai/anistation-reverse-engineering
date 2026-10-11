package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class d2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f446b;

    public /* synthetic */ d2(e2 e2Var, int i10) {
        this.f445a = i10;
        this.f446b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f445a;
        e2 e2Var = this.f446b;
        switch (i10) {
            case 0:
                ViewParent parent = e2Var.f458d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                e2Var.a();
                View view = e2Var.f458d;
                if (view.isEnabled() && !view.isLongClickable() && e2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    e2Var.f461x = true;
                    return;
                }
                return;
        }
    }
}
