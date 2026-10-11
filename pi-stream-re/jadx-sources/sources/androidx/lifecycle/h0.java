package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class h0 extends h {
    final /* synthetic */ j0 this$0;

    public h0(j0 j0Var) {
        this.this$0 = j0Var;
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        r6.h0.u(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = m0.f1109b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            r6.h0.r(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((m0) findFragmentByTag).f1110a = this.this$0.f1107y;
        }
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        r6.h0.u(activity, "activity");
        j0 j0Var = this.this$0;
        int i10 = j0Var.f1101b - 1;
        j0Var.f1101b = i10;
        if (i10 == 0) {
            Handler handler = j0Var.f1104e;
            r6.h0.q(handler);
            handler.postDelayed(j0Var.f1106x, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        r6.h0.u(activity, "activity");
        f0.a(activity, new g0(this.this$0));
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        r6.h0.u(activity, "activity");
        j0 j0Var = this.this$0;
        int i10 = j0Var.f1100a - 1;
        j0Var.f1100a = i10;
        if (i10 == 0 && j0Var.f1102c) {
            j0Var.f1105f.e(n.ON_STOP);
            j0Var.f1103d = true;
        }
    }
}
