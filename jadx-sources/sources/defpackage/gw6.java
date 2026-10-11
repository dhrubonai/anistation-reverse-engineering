package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gw6 implements ew6, uj2, ga5 {
    public final /* synthetic */ yv6 A;
    public final /* synthetic */ j21 B;
    public final /* synthetic */ Bundle C;
    public final /* synthetic */ ea5 x;
    public final /* synthetic */ cw6 y;
    public final /* synthetic */ fg3 z;

    public gw6(ea5 ea5Var, cw6 cw6Var, fg3 fg3Var, yv6 yv6Var, j21 j21Var, Bundle bundle) {
        this.x = ea5Var;
        this.y = cw6Var;
        this.z = fg3Var;
        this.A = yv6Var;
        this.B = j21Var;
        this.C = bundle;
        if (ea5Var.b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            w65.z(this);
        }
    }

    @Override // defpackage.uj2
    public final j21 getDefaultViewModelCreationExtras() {
        o34 o34Var = new o34(this.B);
        z95 z95Var = w65.m;
        Bundle g = h98.g((ai4[]) Arrays.copyOf(new ai4[0], 0));
        LinkedHashMap linkedHashMap = o34Var.a;
        Bundle bundle = (Bundle) linkedHashMap.get(z95Var);
        if (bundle != null) {
            g.putAll(bundle);
        }
        Bundle bundle2 = this.C;
        bundle2.getClass();
        g.putAll(bundle2);
        linkedHashMap.put(z95Var, g);
        linkedHashMap.put(w65.k, this);
        linkedHashMap.put(w65.l, this);
        return o34Var;
    }

    @Override // defpackage.uj2
    public final yv6 getDefaultViewModelProviderFactory() {
        return this.A;
    }

    @Override // defpackage.og3
    public final fg3 getLifecycle() {
        return this.z;
    }

    @Override // defpackage.ga5
    public final ea5 getSavedStateRegistry() {
        return this.x;
    }

    @Override // defpackage.ew6
    public final cw6 getViewModelStore() {
        return this.y;
    }
}
