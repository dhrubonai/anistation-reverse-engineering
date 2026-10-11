package m;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.a0;
import androidx.lifecycle.q0;
import w.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f7038a = new Intent("android.intent.action.VIEW");

    /* renamed from: b, reason: collision with root package name */
    public final q0 f7039b = new q0();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7040c = true;

    public final a0 a() {
        Intent intent = this.f7038a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            l.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f7040c);
        q0 q0Var = this.f7039b;
        q0Var.getClass();
        Bundle bundle2 = new Bundle();
        q0Var.getClass();
        q0Var.getClass();
        q0Var.getClass();
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        return new a0(2, intent, (Object) null);
    }
}
