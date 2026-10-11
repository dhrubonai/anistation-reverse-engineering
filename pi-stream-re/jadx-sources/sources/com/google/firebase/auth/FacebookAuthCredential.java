package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public class FacebookAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new zzh();
    private final String zza;

    public FacebookAuthCredential(String str) {
        b.o(str);
        this.zza = str;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "facebook.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.zza, false);
        a0.u0(t02, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new FacebookAuthCredential(this.zza);
    }

    public static zzags zza(FacebookAuthCredential facebookAuthCredential, String str) {
        b.s(facebookAuthCredential);
        return new zzags(null, facebookAuthCredential.zza, facebookAuthCredential.getProvider(), null, null, null, str, null, null);
    }
}
