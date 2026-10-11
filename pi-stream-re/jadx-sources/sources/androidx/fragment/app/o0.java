package androidx.fragment.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class o0 extends d.a {
    @Override // d.a
    public final Intent a(androidx.activity.j jVar, Object obj) {
        Bundle bundleExtra;
        c.k kVar = (c.k) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = kVar.f1599b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                kVar = new c.k(kVar.f1598a, null, kVar.f1600c, kVar.f1601d);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar);
        if (s0.H(2)) {
            Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
        }
        return intent;
    }

    @Override // d.a
    public final Object c(Intent intent, int i10) {
        return new c.a(intent, i10);
    }
}
