package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzgc {
    public static void zza(boolean z9, String str, long j4, long j10) {
        if (z9) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j4 + ", " + j10 + ")");
    }

    public static void zzb(boolean z9) {
        if (z9) {
        } else {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
