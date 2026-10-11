package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabt extends zzacw<Void, PhoneAuthProvider.OnVerificationStateChangedCallbacks> {
    private final zzyh zzy;

    public zzabt(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, String str2, long j4, boolean z9, boolean z10, String str3, String str4, boolean z11) {
        super(8);
        b.s(phoneMultiFactorInfo);
        b.o(str);
        this.zzy = new zzyh(phoneMultiFactorInfo, str, str2, j4, z9, z10, str3, str4, z11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
