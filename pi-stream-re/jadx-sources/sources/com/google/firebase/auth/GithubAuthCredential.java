package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public class GithubAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new zzak();
    private String zza;

    public GithubAuthCredential(String str) {
        b.o(str);
        this.zza = str;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "github.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.zza, false);
        a0.u0(t02, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new GithubAuthCredential(this.zza);
    }

    public static zzags zza(GithubAuthCredential githubAuthCredential, String str) {
        b.s(githubAuthCredential);
        return new zzags(null, githubAuthCredential.zza, githubAuthCredential.getProvider(), null, null, null, str, null, null);
    }
}
