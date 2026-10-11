package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzlv {
    private final zzbh zza;
    private final zzbq zzb;

    public zzlv(zzbh zzbhVar) {
        this.zza = zzbhVar;
        this.zzb = null;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            return zzbhVar.zza(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }

    public zzlv(zzbq zzbqVar) {
        this.zza = null;
        this.zzb = zzbqVar;
    }
}
