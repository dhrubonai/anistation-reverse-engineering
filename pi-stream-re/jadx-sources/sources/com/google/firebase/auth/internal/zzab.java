package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c5.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzafr;
import com.google.android.gms.internal.p002firebaseauthapi.zzxv;
import com.google.firebase.auth.UserInfo;
import org.json.JSONException;
import org.json.JSONObject;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public final class zzab extends a implements UserInfo {
    public static final Parcelable.Creator<zzab> CREATOR = new zzaa();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private Uri zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private String zzi;

    public zzab(zzafr zzafrVar) {
        b.s(zzafrVar);
        this.zza = zzafrVar.zzd();
        String zzf = zzafrVar.zzf();
        b.o(zzf);
        this.zzb = zzf;
        this.zzc = zzafrVar.zzb();
        Uri zza = zzafrVar.zza();
        if (zza != null) {
            this.zzd = zza.toString();
            this.zze = zza;
        }
        this.zzf = zzafrVar.zzc();
        this.zzg = zzafrVar.zze();
        this.zzh = false;
        this.zzi = zzafrVar.zzg();
    }

    public static zzab zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzab(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzxv(e10);
        }
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getDisplayName() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getEmail() {
        return this.zzf;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getPhoneNumber() {
        return this.zzg;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final Uri getPhotoUrl() {
        if (!TextUtils.isEmpty(this.zzd) && this.zze == null) {
            this.zze = Uri.parse(this.zzd);
        }
        return this.zze;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getProviderId() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String getUid() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final boolean isEmailVerified() {
        return this.zzh;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, getUid(), false);
        a0.n0(parcel, 2, getProviderId(), false);
        a0.n0(parcel, 3, getDisplayName(), false);
        a0.n0(parcel, 4, this.zzd, false);
        a0.n0(parcel, 5, getEmail(), false);
        a0.n0(parcel, 6, getPhoneNumber(), false);
        a0.d0(parcel, 7, isEmailVerified());
        a0.n0(parcel, 8, this.zzi, false);
        a0.u0(t02, parcel);
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.zza);
            jSONObject.putOpt("providerId", this.zzb);
            jSONObject.putOpt("displayName", this.zzc);
            jSONObject.putOpt("photoUrl", this.zzd);
            jSONObject.putOpt("email", this.zzf);
            jSONObject.putOpt("phoneNumber", this.zzg);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.zzh));
            jSONObject.putOpt("rawUserInfo", this.zzi);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzxv(e10);
        }
    }

    public zzab(zzafb zzafbVar, String str) {
        b.s(zzafbVar);
        b.o(str);
        String zzi = zzafbVar.zzi();
        b.o(zzi);
        this.zza = zzi;
        this.zzb = str;
        this.zzf = zzafbVar.zzh();
        this.zzc = zzafbVar.zzg();
        Uri zzc = zzafbVar.zzc();
        if (zzc != null) {
            this.zzd = zzc.toString();
            this.zze = zzc;
        }
        this.zzh = zzafbVar.zzm();
        this.zzi = null;
        this.zzg = zzafbVar.zzj();
    }

    public final String zza() {
        return this.zzi;
    }

    public zzab(String str, String str2, String str3, String str4, String str5, String str6, boolean z9, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzc = str5;
        this.zzd = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.zze = Uri.parse(this.zzd);
        }
        this.zzh = z9;
        this.zzi = str7;
    }
}
