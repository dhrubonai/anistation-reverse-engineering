package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;
import e5.a;

/* loaded from: classes.dex */
final class zzas implements OnFailureListener {
    private final /* synthetic */ zzat zza;

    public zzas(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        a aVar;
        if (exc instanceof FirebaseNetworkException) {
            aVar = zzaq.zzc;
            aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.zza.zza.zzd();
        }
    }
}
