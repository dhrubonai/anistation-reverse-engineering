package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import b5.e;

/* loaded from: classes.dex */
public final class zzack {
    private static Boolean zza;

    public static boolean zza(Context context) {
        boolean z9;
        if (zza == null) {
            int c6 = e.f1519b.c(context, 12451000);
            if (c6 != 0 && c6 != 2) {
                z9 = false;
            } else {
                z9 = true;
            }
            zza = Boolean.valueOf(z9);
        }
        return zza.booleanValue();
    }
}
