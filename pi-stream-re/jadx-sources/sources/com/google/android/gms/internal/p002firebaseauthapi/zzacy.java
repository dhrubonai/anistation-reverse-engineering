package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzau;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzacy implements zzacc {
    final /* synthetic */ zzacw zza;

    public zzacy(zzacw zzacwVar) {
        this.zza = zzacwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(Status status) {
        String str = status.f2362c;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null);
            }
        }
        zzacw zzacwVar = this.zza;
        if (zzacwVar.zza == 8) {
            zzacwVar.zzz = true;
            this.zza.zzx = false;
            zza(new zzadb(this, status));
        } else {
            zzacw.zza(zzacwVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zzb(String str) {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 8);
        this.zza.zzo = str;
        zza(new zzada(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zzc(String str) {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 7);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzn = str;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zzb() {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 6);
        zzacw.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zzc() {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 9);
        zzacw.zza(this.zza);
    }

    private final void zza(zzadd zzaddVar) {
        this.zza.zzi.execute(new zzade(this, zzaddVar));
    }

    private final void zza(Status status, AuthCredential authCredential, String str, String str2) {
        zzacw.zza(this.zza, status);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzp = authCredential;
        zzacwVar.zzq = str;
        zzacwVar.zzr = str2;
        zzau zzauVar = zzacwVar.zzf;
        if (zzauVar != null) {
            zzauVar.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(String str) {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 8);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzo = str;
        zzacwVar.zzz = true;
        this.zza.zzx = true;
        zza(new zzadc(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzaem zzaemVar) {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 3);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzl = zzaemVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza() {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 5);
        zzacw.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzyj zzyjVar) {
        zza(zzyjVar.zza(), zzyjVar.zzb(), zzyjVar.zzc(), zzyjVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzyi zzyiVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzs = zzyiVar;
        zzacwVar.zza(zzao.zza("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 2);
        zza(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzafi zzafiVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzu = zzafiVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzafj zzafjVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzt = zzafjVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzafm zzafmVar, zzafb zzafbVar) {
        int i10 = this.zza.zza;
        b.v("Unexpected response type: " + i10, i10 == 2);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzj = zzafmVar;
        zzacwVar.zzk = zzafbVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzafv zzafvVar) {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 4);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzm = zzafvVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzaga zzagaVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzw = zzagaVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzagi zzagiVar) {
        zzacw zzacwVar = this.zza;
        zzacwVar.zzv = zzagiVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(zzafm zzafmVar) {
        int i10 = this.zza.zza;
        b.v("Unexpected response type: " + i10, i10 == 1);
        zzacw zzacwVar = this.zza;
        zzacwVar.zzj = zzafmVar;
        zzacw.zza(zzacwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacc
    public final void zza(PhoneAuthCredential phoneAuthCredential) {
        int i10 = this.zza.zza;
        b.v("Unexpected response type " + i10, i10 == 8);
        this.zza.zzz = true;
        this.zza.zzx = true;
        zza(new zzacz(this, phoneAuthCredential));
    }
}
