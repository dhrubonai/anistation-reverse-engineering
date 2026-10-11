package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.a0;

/* loaded from: classes.dex */
public final class zzafp extends a {
    public static final Parcelable.Creator<zzafp> CREATOR = new zzafs();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzafp(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static zzaq<zzafp> zza(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            zzap zzg = zzaq.zzg();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                zzg.zza(new zzafp(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
            }
            return zzg.zza();
        }
        return zzaq.zza(new ArrayList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.zza, false);
        a0.n0(parcel, 2, this.zzb, false);
        a0.n0(parcel, 3, this.zzc, false);
        a0.u0(t02, parcel);
    }
}
