package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new zzap();
    private String zza;
    private String zzb;
    private String zzc;
    private boolean zzd;
    private String zze;

    public PhoneAuthCredential(String str, String str2, String str3, boolean z9, String str4) {
        boolean z10;
        if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))) {
            z10 = true;
        } else {
            z10 = false;
        }
        b.i("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", z10);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z9;
        this.zze = str4;
    }

    public static PhoneAuthCredential zzb(String str, String str2) {
        return new PhoneAuthCredential(null, null, str, true, str2);
    }

    public /* synthetic */ Object clone() {
        return new PhoneAuthCredential(this.zza, getSmsCode(), this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "phone";
    }

    public String getSmsCode() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.zza, false);
        a0.n0(parcel, 2, getSmsCode(), false);
        a0.n0(parcel, 4, this.zzc, false);
        a0.d0(parcel, 5, this.zzd);
        a0.n0(parcel, 6, this.zze, false);
        a0.u0(t02, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return (PhoneAuthCredential) clone();
    }

    public final String zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzd;
    }

    public static PhoneAuthCredential zza(String str, String str2) {
        return new PhoneAuthCredential(str, str2, null, true, null);
    }

    public final String zzb() {
        return this.zzc;
    }

    public final PhoneAuthCredential zza(boolean z9) {
        this.zzd = false;
        return this;
    }
}
