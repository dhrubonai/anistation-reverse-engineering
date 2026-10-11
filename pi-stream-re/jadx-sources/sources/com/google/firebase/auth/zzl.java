package com.google.firebase.auth;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzl extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {
    private final /* synthetic */ PhoneAuthProvider.OnVerificationStateChangedCallbacks zza;
    private final /* synthetic */ FirebaseAuth zzb;

    public zzl(FirebaseAuth firebaseAuth, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        this.zza = onVerificationStateChangedCallbacks;
        this.zzb = firebaseAuth;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        com.google.firebase.auth.internal.zzac zzacVar;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks = this.zza;
        zzacVar = this.zzb.zzg;
        String zzb = zzacVar.zzb();
        b.s(zzb);
        onVerificationStateChangedCallbacks.onVerificationCompleted(PhoneAuthProvider.getCredential(str, zzb));
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void onVerificationFailed(FirebaseException firebaseException) {
        this.zza.onVerificationFailed(firebaseException);
    }
}
