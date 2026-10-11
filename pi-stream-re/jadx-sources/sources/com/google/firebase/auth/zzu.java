package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzu implements com.google.firebase.auth.internal.zzav {
    private final /* synthetic */ FirebaseUser zza;
    private final /* synthetic */ FirebaseAuth zzb;

    public zzu(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.zza = firebaseUser;
        this.zzb = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        int i10 = status.f2361b;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            this.zzb.signOut();
        }
    }

    @Override // com.google.firebase.auth.internal.zzav
    public final void zza() {
        FirebaseUser firebaseUser;
        FirebaseUser firebaseUser2;
        firebaseUser = this.zzb.zzf;
        if (firebaseUser != null) {
            firebaseUser2 = this.zzb.zzf;
            if (firebaseUser2.getUid().equalsIgnoreCase(this.zza.getUid())) {
                this.zzb.zzh();
            }
        }
    }
}
