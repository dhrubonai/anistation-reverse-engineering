package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzru {
    private final zzbw zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzru)) {
            return false;
        }
        zzru zzruVar = (zzru) obj;
        if (this.zza != zzruVar.zza || this.zzb != zzruVar.zzb || !this.zzc.equals(zzruVar.zzc) || !this.zzd.equals(zzruVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }

    private zzru(zzbw zzbwVar, int i10, String str, String str2) {
        this.zza = zzbwVar;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }
}
