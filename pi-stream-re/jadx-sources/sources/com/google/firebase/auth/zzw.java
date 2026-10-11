package com.google.firebase.auth;

import com.google.android.gms.internal.p002firebaseauthapi.zzagi;
import com.google.android.gms.internal.p002firebaseauthapi.zzago;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.zzcd;
import r.f;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzw implements Continuation<zzagi, Task<TotpSecret>> {
    private final /* synthetic */ FirebaseAuth zza;

    public zzw(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<TotpSecret> then(Task<zzagi> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            b.s(exception);
            return Tasks.forException(exception);
        }
        zzagi result = task.getResult();
        if (result instanceof zzago) {
            zzago zzagoVar = (zzago) result;
            String zzf = zzagoVar.zzf();
            b.o(zzf);
            String zze = zzagoVar.zze();
            b.o(zze);
            int zzc = zzagoVar.zzc();
            int zzb = zzagoVar.zzb();
            long zzd = zzagoVar.zzd();
            String zza = zzagoVar.zza();
            b.o(zza);
            return Tasks.forResult(new zzcd(zzf, zze, zzc, zzb, zzd, zza, this.zza));
        }
        throw new IllegalArgumentException(f.e("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", result.getClass().getName(), "."));
    }
}
