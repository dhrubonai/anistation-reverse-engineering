package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;
import r.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzn implements zzadm<zzagi> {
    private final /* synthetic */ zzagf zza;
    private final /* synthetic */ zzacf zzb;

    public zzzn(zzyl zzylVar, zzagf zzagfVar, zzacf zzacfVar) {
        this.zza = zzagfVar;
        this.zzb = zzacfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zzb.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzagi zzagiVar) {
        zzagi zzagiVar2 = zzagiVar;
        zzagf zzagfVar = this.zza;
        if (zzagfVar instanceof zzagj) {
            this.zzb.zzb(zzagiVar2.zza());
        } else {
            if (zzagfVar instanceof zzagl) {
                this.zzb.zza(zzagiVar2);
                return;
            }
            throw new IllegalArgumentException(f.e("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", this.zza.getClass().getName(), "."));
        }
    }
}
