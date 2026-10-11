package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzic;
import com.google.android.gms.internal.p002firebaseauthapi.zzux;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzlk extends zzoq<zzut, zzuw> {
    public zzlk() {
        super(zzut.class, zzuw.class, new zzlj(zzbp.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzic.zza zza() {
        return zzic.zza.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzna<zzuo, zzut> zzb() {
        return new zzlm(this, zzuo.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzux.zzb zzc() {
        return zzux.zzb.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoq
    public final /* synthetic */ zzuw zza(zzut zzutVar) {
        return zzutVar.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ void zzb(zzakk zzakkVar) {
        zzut zzutVar = (zzut) zzakkVar;
        if (!zzutVar.zze().zze()) {
            if (zzutVar.zzf()) {
                zzxq.zza(zzutVar.zza(), 0);
                zzlq.zza(zzutVar.zzd().zzb());
                return;
            }
            throw new GeneralSecurityException("Missing public key.");
        }
        throw new GeneralSecurityException("Private key is empty.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zzakk zza(zzahm zzahmVar) {
        return zzut.zza(zzahmVar, zzaip.zza());
    }
}
