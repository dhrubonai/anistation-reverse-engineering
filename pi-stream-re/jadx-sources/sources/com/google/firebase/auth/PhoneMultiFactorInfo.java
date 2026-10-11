package com.google.firebase.auth;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzxv;
import org.json.JSONException;
import org.json.JSONObject;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new zzar();
    private final String zza;
    private final String zzb;
    private final long zzc;
    private final String zzd;

    public PhoneMultiFactorInfo(String str, String str2, long j4, String str3) {
        b.o(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j4;
        b.o(str3);
        this.zzd = str3;
    }

    public static PhoneMultiFactorInfo zza(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new PhoneMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public long getEnrollmentTimestamp() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getFactorId() {
        return "phone";
    }

    public String getPhoneNumber() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getUid() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(MultiFactorInfo.FACTOR_ID_KEY, "phone");
            jSONObject.putOpt("uid", this.zza);
            jSONObject.putOpt("displayName", this.zzb);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.zzc));
            jSONObject.putOpt("phoneNumber", this.zzd);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxv(e10);
        }
    }

    @Override // android.os.Parcelable
    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, getUid(), false);
        a0.n0(parcel, 2, getDisplayName(), false);
        a0.k0(parcel, 3, getEnrollmentTimestamp());
        a0.n0(parcel, 4, getPhoneNumber(), false);
        a0.u0(t02, parcel);
    }
}
