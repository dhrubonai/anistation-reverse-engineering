package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q95 implements n95, ga5 {
    public final /* synthetic */ o95 x;
    public rg3 y;
    public fa5 z;

    public q95(o95 o95Var) {
        Bundle bundle;
        this.x = o95Var;
        Object d = o95Var.d("androidx.savedstate.SavedStateRegistry");
        if (d instanceof Bundle) {
            bundle = (Bundle) d;
        } else {
            bundle = null;
        }
        if (bundle != null && this.z == null) {
            fa5 fa5Var = new fa5(new rq3(this, new nj4(this, (byte) 12)));
            this.z = fa5Var;
            fa5Var.a(bundle);
        }
        o95Var.a("androidx.savedstate.SavedStateRegistry", new nj4(this, (byte) 10));
    }

    @Override // defpackage.n95
    public final m95 a(String str, sb2 sb2Var) {
        return this.x.a(str, sb2Var);
    }

    @Override // defpackage.n95
    public final boolean b(Object obj) {
        return this.x.b(obj);
    }

    @Override // defpackage.n95
    public final Map c() {
        return this.x.c();
    }

    @Override // defpackage.n95
    public final Object d(String str) {
        return this.x.d(str);
    }

    @Override // defpackage.og3
    public final fg3 getLifecycle() {
        rg3 rg3Var = this.y;
        if (rg3Var == null) {
            rg3 rg3Var2 = new rg3(this, false);
            this.y = rg3Var2;
            return rg3Var2;
        }
        return rg3Var;
    }

    @Override // defpackage.ga5
    public final ea5 getSavedStateRegistry() {
        fa5 fa5Var = this.z;
        if (fa5Var == null) {
            fa5 fa5Var2 = new fa5(new rq3(this, new nj4(this, (byte) 12)));
            this.z = fa5Var2;
            fa5Var2.a(null);
            fa5Var = fa5Var2;
        }
        return fa5Var.b;
    }
}
