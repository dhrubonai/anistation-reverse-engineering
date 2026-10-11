package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import c5.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import java.util.List;
import w7.b;

/* loaded from: classes.dex */
public abstract class FirebaseUser extends a implements UserInfo {
    public Task<Void> delete() {
        return FirebaseAuth.getInstance(zza()).zza(this);
    }

    @Override // com.google.firebase.auth.UserInfo
    public abstract String getDisplayName();

    @Override // com.google.firebase.auth.UserInfo
    public abstract String getEmail();

    public Task<GetTokenResult> getIdToken(boolean z9) {
        return FirebaseAuth.getInstance(zza()).zza(this, z9);
    }

    public abstract FirebaseUserMetadata getMetadata();

    public abstract MultiFactor getMultiFactor();

    @Override // com.google.firebase.auth.UserInfo
    public abstract String getPhoneNumber();

    @Override // com.google.firebase.auth.UserInfo
    public abstract Uri getPhotoUrl();

    public abstract List<? extends UserInfo> getProviderData();

    @Override // com.google.firebase.auth.UserInfo
    public abstract String getProviderId();

    public abstract String getTenantId();

    @Override // com.google.firebase.auth.UserInfo
    public abstract String getUid();

    public abstract boolean isAnonymous();

    public Task<AuthResult> linkWithCredential(AuthCredential authCredential) {
        b.s(authCredential);
        return FirebaseAuth.getInstance(zza()).zza(this, authCredential);
    }

    public Task<Void> reauthenticate(AuthCredential authCredential) {
        b.s(authCredential);
        return FirebaseAuth.getInstance(zza()).zzb(this, authCredential);
    }

    public Task<AuthResult> reauthenticateAndRetrieveData(AuthCredential authCredential) {
        b.s(authCredential);
        return FirebaseAuth.getInstance(zza()).zzc(this, authCredential);
    }

    public Task<Void> reload() {
        return FirebaseAuth.getInstance(zza()).zzb(this);
    }

    public Task<Void> sendEmailVerification() {
        return FirebaseAuth.getInstance(zza()).zza(this, false).continueWithTask(new zzah(this));
    }

    public Task<AuthResult> startActivityForLinkWithProvider(Activity activity, FederatedAuthProvider federatedAuthProvider) {
        b.s(activity);
        b.s(federatedAuthProvider);
        return FirebaseAuth.getInstance(zza()).zza(activity, federatedAuthProvider, this);
    }

    public Task<AuthResult> startActivityForReauthenticateWithProvider(Activity activity, FederatedAuthProvider federatedAuthProvider) {
        b.s(activity);
        b.s(federatedAuthProvider);
        return FirebaseAuth.getInstance(zza()).zzb(activity, federatedAuthProvider, this);
    }

    public Task<AuthResult> unlink(String str) {
        b.o(str);
        return FirebaseAuth.getInstance(zza()).zzb(this, str);
    }

    @Deprecated
    public Task<Void> updateEmail(String str) {
        b.o(str);
        return FirebaseAuth.getInstance(zza()).zzc(this, str);
    }

    public Task<Void> updatePassword(String str) {
        b.o(str);
        return FirebaseAuth.getInstance(zza()).zzd(this, str);
    }

    public Task<Void> updatePhoneNumber(PhoneAuthCredential phoneAuthCredential) {
        return FirebaseAuth.getInstance(zza()).zza(this, phoneAuthCredential);
    }

    public Task<Void> updateProfile(UserProfileChangeRequest userProfileChangeRequest) {
        b.s(userProfileChangeRequest);
        return FirebaseAuth.getInstance(zza()).zza(this, userProfileChangeRequest);
    }

    public Task<Void> verifyBeforeUpdateEmail(String str) {
        return verifyBeforeUpdateEmail(str, null);
    }

    public abstract FirebaseApp zza();

    public abstract FirebaseUser zza(List<? extends UserInfo> list);

    public abstract void zza(zzafm zzafmVar);

    public abstract FirebaseUser zzb();

    public abstract void zzb(List<MultiFactorInfo> list);

    public abstract zzafm zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract List<String> zzf();

    public Task<Void> verifyBeforeUpdateEmail(String str, ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(zza()).zza(this, false).continueWithTask(new zzai(this, str, actionCodeSettings));
    }

    public Task<Void> sendEmailVerification(ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(zza()).zza(this, false).continueWithTask(new zzaj(this, actionCodeSettings));
    }
}
