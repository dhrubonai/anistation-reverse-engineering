package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ur0 implements tr0, ViewTreeObserver.OnDrawListener, Runnable {
    public final /* synthetic */ yr0 A;
    public final long x = SystemClock.uptimeMillis() + 10000;
    public Runnable y;
    public boolean z;

    public ur0(yr0 yr0Var) {
        this.A = yr0Var;
    }

    public final void a(View view) {
        if (!this.z) {
            this.z = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.y = runnable;
        View decorView = this.A.getWindow().getDecorView();
        decorView.getClass();
        if (this.z) {
            if (a34.i(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new p0((Object) this, (byte) 9));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.y;
        if (runnable != null) {
            runnable.run();
            this.y = null;
            rb2 fullyDrawnReporter = this.A.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                z = fullyDrawnReporter.b;
            }
            if (z) {
                this.z = false;
                this.A.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.x) {
            this.z = false;
            this.A.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
