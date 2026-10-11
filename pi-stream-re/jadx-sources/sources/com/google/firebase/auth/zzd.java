package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public class zzd extends OAuthCredential {
    public static final Parcelable.Creator<zzd> CREATOR = new zzf();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzags zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zzd(String str, String str2, String str3, zzags zzagsVar, String str4, String str5, String str6) {
        this.zza = com.google.android.gms.internal.p002firebaseauthapi.zzah.zzb(str);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzagsVar;
        this.zze = str4;
        this.zzf = str5;
        this.zzg = str6;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    public String getAccessToken() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    public String getIdToken() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    public String getSecret() {
        return this.zzf;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, getProvider(), false);
        a0.n0(parcel, 2, getIdToken(), false);
        a0.n0(parcel, 3, getAccessToken(), false);
        a0.m0(parcel, 4, this.zzd, i10, false);
        a0.n0(parcel, 5, this.zze, false);
        a0.n0(parcel, 6, getSecret(), false);
        a0.n0(parcel, 7, this.zzg, false);
        a0.u0(t02, parcel);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public static zzd zza(zzags zzagsVar) {
        if (zzagsVar != null) {
            return new zzd(null, null, null, zzagsVar, null, null, null);
        }
        throw new NullPointerException("Must specify a non-null webSignInCredential");
    }

    public static zzd zza(String str, String str2, String str3) {
        return zza(str, str2, str3, null, null);
    }

    public static zzd zza(String str, String str2, String str3, String str4, String str5) {
        b.n("Must specify a non-empty providerId", str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zzd(str, str2, str3, null, str4, str5, null);
    }

    public static zzd zza(String str, String str2, String str3, String str4) {
        b.n("Must specify a non-empty providerId", str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zzd(str, str2, str3, null, null, null, str4);
    }

    public static zzags zza(zzd zzdVar, String str) {
        b.s(zzdVar);
        zzags zzagsVar = zzdVar.zzd;
        return zzagsVar != null ? zzagsVar : new zzags(zzdVar.getIdToken(), zzdVar.getAccessToken(), zzdVar.getProvider(), null, zzdVar.getSecret(), null, str, zzdVar.zze, zzdVar.zzg);
    }
}
