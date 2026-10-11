package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new zzg();
    private String zza;
    private String zzb;
    private final String zzc;
    private String zzd;
    private boolean zze;

    public EmailAuthCredential(String str, String str2) {
        this(str, str2, null, null, false);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "password";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        if (!TextUtils.isEmpty(this.zzb)) {
            return "password";
        }
        return EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.zza, false);
        a0.n0(parcel, 2, this.zzb, false);
        a0.n0(parcel, 3, this.zzc, false);
        a0.n0(parcel, 4, this.zzd, false);
        a0.d0(parcel, 5, this.zze);
        a0.u0(t02, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new EmailAuthCredential(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        if (!TextUtils.isEmpty(this.zzc)) {
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z9) {
        b.o(str);
        this.zza = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = z9;
    }

    public final EmailAuthCredential zza(FirebaseUser firebaseUser) {
        this.zzd = firebaseUser.zze();
        this.zze = true;
        return this;
    }

    public static boolean zza(String str) {
        ActionCodeUrl parseLink;
        return (TextUtils.isEmpty(str) || (parseLink = ActionCodeUrl.parseLink(str)) == null || parseLink.getOperation() != 4) ? false : true;
    }
}
