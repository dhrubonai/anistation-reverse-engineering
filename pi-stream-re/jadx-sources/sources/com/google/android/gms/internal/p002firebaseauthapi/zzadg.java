package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import w7.b;

/* loaded from: classes.dex */
public final class zzadg<ResultT, CallbackT> implements zzacx<ResultT> {
    private final zzacw<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzadg(zzacw<ResultT, CallbackT> zzacwVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzacwVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zza(ResultT resultt, Status status) {
        FirebaseUser firebaseUser;
        b.r(this.zzb, "completion source cannot be null");
        if (status != null) {
            zzacw<ResultT, CallbackT> zzacwVar = this.zza;
            if (zzacwVar.zzs != null) {
                TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzacwVar.zzc);
                zzacw<ResultT, CallbackT> zzacwVar2 = this.zza;
                zzyi zzyiVar = zzacwVar2.zzs;
                if (!"reauthenticateWithCredential".equals(zzacwVar2.zza()) && !"reauthenticateWithCredentialWithData".equals(this.zza.zza())) {
                    firebaseUser = null;
                } else {
                    firebaseUser = this.zza.zzd;
                }
                taskCompletionSource.setException(zzach.zza(firebaseAuth, zzyiVar, firebaseUser));
                return;
            }
            AuthCredential authCredential = zzacwVar.zzp;
            if (authCredential != null) {
                this.zzb.setException(zzach.zza(status, authCredential, zzacwVar.zzq, zzacwVar.zzr));
                return;
            } else {
                this.zzb.setException(zzach.zza(status));
                return;
            }
        }
        this.zzb.setResult(resultt);
    }
}
