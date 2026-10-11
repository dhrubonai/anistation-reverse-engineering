package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f2559d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f2560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2561b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2562c;

    public n0(String str, String str2, boolean z9) {
        w7.b.o(str);
        this.f2560a = str;
        w7.b.o(str2);
        this.f2561b = str2;
        this.f2562c = z9;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        String str = this.f2560a;
        if (str != null) {
            if (this.f2562c) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", str);
                try {
                    bundle = context.getContentResolver().call(f2559d, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
                }
            }
            if (intent == null) {
                return new Intent(str).setPackage(this.f2561b);
            }
            return intent;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (p7.a0.q(this.f2560a, n0Var.f2560a) && p7.a0.q(this.f2561b, n0Var.f2561b) && p7.a0.q(null, null) && this.f2562c == n0Var.f2562c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2560a, this.f2561b, null, 4225, Boolean.valueOf(this.f2562c)});
    }

    public final String toString() {
        String str = this.f2560a;
        if (str != null) {
            return str;
        }
        w7.b.s(null);
        throw null;
    }
}
