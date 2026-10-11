package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzbv {
    private final zzvd zza = null;
    private final zzci zzb;

    private zzbv(zzci zzciVar) {
        this.zzb = zzciVar;
    }

    public static zzbv zza(zzci zzciVar) {
        return new zzbv(zzciVar);
    }

    public final zzvd zza() {
        zzci zzciVar = this.zzb;
        if (zzciVar instanceof zzne) {
            return ((zzne) zzciVar).zzb().zza();
        }
        return ((zzos) zznv.zza().zza((zznv) this.zzb, zzos.class)).zza();
    }
}
