package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new zzau();
    private String zza;
    private String zzb;

    public TwitterAuthCredential(String str, String str2) {
        b.o(str);
        this.zza = str;
        b.o(str2);
        this.zzb = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.zza, false);
        a0.n0(parcel, 2, this.zzb, false);
        a0.u0(t02, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new TwitterAuthCredential(this.zza, this.zzb);
    }

    public static zzags zza(TwitterAuthCredential twitterAuthCredential, String str) {
        b.s(twitterAuthCredential);
        return new zzags(null, twitterAuthCredential.zza, twitterAuthCredential.getProvider(), null, twitterAuthCredential.zzb, null, str, null, null);
    }
}
