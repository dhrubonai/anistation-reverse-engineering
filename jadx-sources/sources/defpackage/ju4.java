package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ju4 extends ft1 {
    final /* synthetic */ ku4 this$0;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class a extends ft1 {
        final /* synthetic */ ku4 this$0;

        public a(ku4 ku4Var) {
            this.this$0 = ku4Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            ku4 ku4Var = this.this$0;
            int i = ku4Var.y + 1;
            ku4Var.y = i;
            if (i == 1) {
                if (ku4Var.z) {
                    ku4Var.C.e(dg3.ON_RESUME);
                    ku4Var.z = false;
                } else {
                    Handler handler = ku4Var.B;
                    handler.getClass();
                    handler.removeCallbacks(ku4Var.D);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ku4 ku4Var = this.this$0;
            int i = ku4Var.x + 1;
            ku4Var.x = i;
            if (i == 1 && ku4Var.A) {
                ku4Var.C.e(dg3.ON_START);
                ku4Var.A = false;
            }
        }
    }

    public ju4(ku4 ku4Var) {
        this.this$0 = ku4Var;
    }

    @Override // defpackage.ft1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // defpackage.ft1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ku4 ku4Var = this.this$0;
        int i = ku4Var.y - 1;
        ku4Var.y = i;
        if (i == 0) {
            Handler handler = ku4Var.B;
            handler.getClass();
            handler.postDelayed(ku4Var.D, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new a(this.this$0));
    }

    @Override // defpackage.ft1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ku4 ku4Var = this.this$0;
        int i = ku4Var.x - 1;
        ku4Var.x = i;
        if (i == 0 && ku4Var.z) {
            ku4Var.C.e(dg3.ON_STOP);
            ku4Var.A = true;
        }
    }
}
