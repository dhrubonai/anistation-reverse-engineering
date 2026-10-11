package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fa5 {
    public final rq3 a;
    public final ea5 b;

    public fa5(rq3 rq3Var) {
        this.a = rq3Var;
        this.b = new ea5(rq3Var);
    }

    public final void a(Bundle bundle) {
        rq3 rq3Var = this.a;
        ga5 ga5Var = (ga5) rq3Var.d;
        if (!rq3Var.a) {
            rq3Var.a();
        }
        if (((rg3) ga5Var.getLifecycle()).i.compareTo(eg3.A) < 0) {
            if (!rq3Var.b) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    bundle2 = v94.x(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                rq3Var.h = bundle2;
                rq3Var.b = true;
                return;
            }
            ze0.m("SavedStateRegistry was already restored.");
            return;
        }
        ov3.l(((rg3) ga5Var.getLifecycle()).i, "performRestore cannot be called when owner is ");
    }

    public final void b(Bundle bundle) {
        rq3 rq3Var = this.a;
        Bundle g = h98.g((ai4[]) Arrays.copyOf(new ai4[0], 0));
        Bundle bundle2 = (Bundle) rq3Var.h;
        if (bundle2 != null) {
            g.putAll(bundle2);
        }
        synchronized (((og5) rq3Var.f)) {
            for (Map.Entry entry : ((LinkedHashMap) rq3Var.g).entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((da5) entry.getValue()).a();
                str.getClass();
                g.putBundle(str, a);
            }
        }
        if (!g.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", g);
        }
    }
}
