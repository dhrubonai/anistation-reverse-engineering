package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class s0 implements n3.d {

    /* renamed from: a, reason: collision with root package name */
    public final n3.e f1140a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1141b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1142c;

    /* renamed from: d, reason: collision with root package name */
    public final w6.e f1143d;

    public s0(n3.e eVar, c1 c1Var) {
        r6.h0.u(eVar, "savedStateRegistry");
        r6.h0.u(c1Var, "viewModelStoreOwner");
        this.f1140a = eVar;
        this.f1143d = new w6.e(new r0(c1Var, 0));
    }

    @Override // n3.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1142c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((t0) this.f1143d.a()).f1144a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((o0) entry.getValue()).f1124e.a();
            if (!r6.h0.g(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f1141b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f1141b) {
            Bundle a10 = this.f1140a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f1142c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a10 != null) {
                bundle.putAll(a10);
            }
            this.f1142c = bundle;
            this.f1141b = true;
        }
    }
}
