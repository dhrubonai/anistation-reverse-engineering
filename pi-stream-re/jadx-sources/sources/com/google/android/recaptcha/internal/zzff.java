package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzff {
    public static void zza(boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z9, Object obj) {
        if (z9) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z9, String str, char c6) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(zzfi.zza(str, Character.valueOf(c6)));
        }
    }

    public static void zzd(int i10, int i11, int i12) {
        String zzf;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                zzf = zzfi.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                zzf = zzf(i11, i12, "end index");
            }
        } else {
            zzf = zzf(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(zzf);
    }

    public static void zze(boolean z9, Object obj) {
        if (z9) {
        } else {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzfi.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        return zzfi.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
    }
}
