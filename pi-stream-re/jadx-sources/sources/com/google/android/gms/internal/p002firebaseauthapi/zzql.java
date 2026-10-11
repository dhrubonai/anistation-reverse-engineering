package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzql extends zzna<zzuf, zzue> {
    private final /* synthetic */ zzqe zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzql(zzqe zzqeVar, Class cls) {
        super(cls);
        this.zza = zzqeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzna
    public final /* synthetic */ zzue zza(zzuf zzufVar) {
        zzuf zzufVar2 = zzufVar;
        return (zzue) ((zzaja) zzue.zzb().zza(zzqe.zzh()).zza(zzufVar2.zzf()).zza(zzahm.zza(zzov.zza(zzufVar2.zza()))).zzf());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzna
    public final /* synthetic */ void zzb(zzuf zzufVar) {
        zzuf zzufVar2 = zzufVar;
        if (zzufVar2.zza() >= 16) {
            zzqe.zzb(zzufVar2.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzna
    public final /* synthetic */ zzuf zza(zzahm zzahmVar) {
        return zzuf.zza(zzahmVar, zzaip.zza());
    }
}
