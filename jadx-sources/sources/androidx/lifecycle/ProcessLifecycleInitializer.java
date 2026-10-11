package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.dg3;
import defpackage.dn0;
import defpackage.hg3;
import defpackage.ig3;
import defpackage.ju4;
import defpackage.ku4;
import defpackage.nt1;
import defpackage.yy2;
import defpackage.ze0;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements yy2 {
    @Override // defpackage.yy2
    public final Object create(Context context) {
        context.getClass();
        dn0 A = dn0.A(context);
        A.getClass();
        if (((HashSet) A.z).contains(ProcessLifecycleInitializer.class)) {
            if (!ig3.a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new hg3());
            }
            ku4 ku4Var = ku4.E;
            ku4Var.getClass();
            ku4Var.B = new Handler();
            ku4Var.C.e(dg3.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ju4(ku4Var));
            return ku4Var;
        }
        ze0.m("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        return null;
    }

    @Override // defpackage.yy2
    public final List dependencies() {
        return nt1.x;
    }
}
