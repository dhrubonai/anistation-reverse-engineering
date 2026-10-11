package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tk4 extends ContentObserver implements m91 {
    public boolean A;
    public boolean B;
    public final ui x;
    public final WeakReference y;
    public final ContentResolver z;

    public tk4(yr0 yr0Var, ui uiVar) {
        super(new Handler(Looper.getMainLooper()));
        this.x = uiVar;
        this.y = new WeakReference(yr0Var);
        this.z = yr0Var.getApplicationContext().getContentResolver();
    }

    public final void a() {
        fg3 lifecycle;
        if (this.B) {
            return;
        }
        this.B = true;
        if (this.A) {
            this.z.unregisterContentObserver(this);
            this.A = false;
        }
        yr0 yr0Var = (yr0) this.y.get();
        if (yr0Var != null && (lifecycle = yr0Var.getLifecycle()) != null) {
            lifecycle.b(this);
        }
        this.x.invoke(this);
    }

    public final boolean b(Activity activity) {
        activity.getClass();
        if (this.y.get() == activity) {
            return true;
        }
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        yr0 yr0Var = (yr0) this.y.get();
        if (yr0Var == null) {
            a();
        } else {
            if (!iv.E(yr0Var)) {
                return;
            }
            yr0Var.setRequestedOrientation(-1);
            a();
        }
    }

    @Override // defpackage.m91
    public final void onDestroy(og3 og3Var) {
        a();
    }
}
