package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import defpackage.h35;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class f35 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, dg3 dg3Var) {
        dg3Var.getClass();
        if (activity instanceof og3) {
            fg3 lifecycle = ((og3) activity).getLifecycle();
            if (lifecycle instanceof rg3) {
                ((rg3) lifecycle).e(dg3Var);
            }
        }
    }

    public static void b(Activity activity) {
        h35.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new h35.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new h35(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
