package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;
import p7.a0;

/* loaded from: classes.dex */
public final class zzah implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzah> CREATOR = new zzag();
    private long zza;
    private long zzb;

    public zzah(long j4, long j10) {
        this.zza = j4;
        this.zzb = j10;
    }

    public static zzah zza(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new zzah(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.FirebaseUserMetadata
    public final long getCreationTimestamp() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.FirebaseUserMetadata
    public final long getLastSignInTimestamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.k0(parcel, 1, getLastSignInTimestamp());
        a0.k0(parcel, 2, getCreationTimestamp());
        a0.u0(t02, parcel);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.zza);
            jSONObject.put("creationTimestamp", this.zzb);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
