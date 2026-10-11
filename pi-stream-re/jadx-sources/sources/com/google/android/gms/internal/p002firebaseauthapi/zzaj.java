package com.google.android.gms.internal.p002firebaseauthapi;

import r.f;

/* loaded from: classes.dex */
final class zzaj {
    public static int zza(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(f.e("null value in entry: ", String.valueOf(obj), "=null"));
        }
    }
}
