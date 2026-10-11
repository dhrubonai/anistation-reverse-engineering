package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new zzas();
    private final String zza;

    public PlayGamesAuthCredential(String str) {
        b.o(str);
        this.zza = str;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "playgames.google.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.zza, false);
        a0.u0(t02, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new PlayGamesAuthCredential(this.zza);
    }

    public static zzags zza(PlayGamesAuthCredential playGamesAuthCredential, String str) {
        b.s(playGamesAuthCredential);
        return new zzags(null, null, playGamesAuthCredential.getProvider(), null, null, playGamesAuthCredential.zza, str, null, null);
    }
}
