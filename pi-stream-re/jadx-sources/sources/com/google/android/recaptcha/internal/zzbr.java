package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzbr {
    public static final zzbr zza = new zzbr();

    private zzbr() {
    }

    public static final zzp zza(int i10) {
        if (i10 != 403) {
            if (i10 != 404) {
                if (i10 != 503) {
                    return new zzp(zzn.zzc, zzl.zzW, null);
                }
                return new zzp(zzn.zzl, zzl.zzV, null);
            }
            return new zzp(zzn.zze, zzl.zzs, null);
        }
        return new zzp(zzn.zzl, zzl.zzV, null);
    }
}
