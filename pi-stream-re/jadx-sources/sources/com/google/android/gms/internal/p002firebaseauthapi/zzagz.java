package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;
import w7.b;

/* loaded from: classes.dex */
public final class zzagz implements zzacr {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzagz(String str, String str2, String str3) {
        b.o(str);
        this.zza = str;
        b.o(str2);
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
