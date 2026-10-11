package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaa implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {
    private final /* synthetic */ FirebaseAuth zza;

    public zzaa(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        int i10 = status.f2361b;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            this.zza.signOut();
        }
    }

    @Override // com.google.firebase.auth.internal.zzl
    public final void zza(zzafm zzafmVar, FirebaseUser firebaseUser) {
        this.zza.zza(firebaseUser, zzafmVar, true, true);
    }
}
