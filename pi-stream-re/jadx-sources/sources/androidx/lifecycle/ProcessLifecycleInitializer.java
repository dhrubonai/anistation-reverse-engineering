package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements o3.b {
    @Override // o3.b
    public final List a() {
        return x6.o.f11318a;
    }

    @Override // o3.b
    public final Object b(Context context) {
        r6.h0.u(context, "context");
        o3.a c6 = o3.a.c(context);
        r6.h0.s(c6, "getInstance(context)");
        if (c6.f8189b.contains(ProcessLifecycleInitializer.class)) {
            if (!r.f1137a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                r6.h0.r(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new q());
            }
            j0 j0Var = j0.f1099z;
            j0Var.getClass();
            j0Var.f1104e = new Handler();
            j0Var.f1105f.e(n.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            r6.h0.r(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new h0(j0Var));
            return j0Var;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
