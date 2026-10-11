package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import b5.e;

/* loaded from: classes.dex */
public final class zzaf {
    public static final zzaf zza = new zzaf();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final e zzc = e.f1519b;

    private zzaf() {
    }

    public static final String zza(Context context) {
        int b10 = zzc.b(context);
        if (b10 != 1 && b10 != 3 && b10 != 9) {
            return "ANDROID_ONPLAY";
        }
        return "ANDROID_OFFPLAY";
    }
}
