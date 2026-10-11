package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class g0 extends h {
    final /* synthetic */ j0 this$0;

    public g0(j0 j0Var) {
        this.this$0 = j0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        r6.h0.u(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        r6.h0.u(activity, "activity");
        j0 j0Var = this.this$0;
        int i10 = j0Var.f1100a + 1;
        j0Var.f1100a = i10;
        if (i10 == 1 && j0Var.f1103d) {
            j0Var.f1105f.e(n.ON_START);
            j0Var.f1103d = false;
        }
    }
}
