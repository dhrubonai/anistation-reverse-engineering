package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fw6 implements ew6, uj2 {
    public final /* synthetic */ Bundle A;
    public final /* synthetic */ cw6 x;
    public final /* synthetic */ yv6 y;
    public final /* synthetic */ j21 z;

    public fw6(cw6 cw6Var, yv6 yv6Var, j21 j21Var, Bundle bundle) {
        this.x = cw6Var;
        this.y = yv6Var;
        this.z = j21Var;
        this.A = bundle;
    }

    @Override // defpackage.uj2
    public final j21 getDefaultViewModelCreationExtras() {
        o34 o34Var = new o34(this.z);
        z95 z95Var = w65.m;
        Bundle g = h98.g((ai4[]) Arrays.copyOf(new ai4[0], 0));
        LinkedHashMap linkedHashMap = o34Var.a;
        Bundle bundle = (Bundle) linkedHashMap.get(z95Var);
        if (bundle != null) {
            g.putAll(bundle);
        }
        Bundle bundle2 = this.A;
        bundle2.getClass();
        g.putAll(bundle2);
        linkedHashMap.put(z95Var, g);
        linkedHashMap.put(w65.l, this);
        return o34Var;
    }

    @Override // defpackage.uj2
    public final yv6 getDefaultViewModelProviderFactory() {
        return this.y;
    }

    @Override // defpackage.ew6
    public final cw6 getViewModelStore() {
        return this.x;
    }
}
