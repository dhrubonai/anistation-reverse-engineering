package com.google.android.recaptcha.internal;

import r6.h0;

/* loaded from: classes.dex */
public final class zzba {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzba(String str, long j4, int i10) {
        this.zza = str;
        this.zzb = j4;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (h0.g(zzbaVar.zza, this.zza) && zzbaVar.zzb == this.zzb && zzbaVar.zzc == this.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
