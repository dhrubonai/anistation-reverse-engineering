package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;
import w7.b;

/* loaded from: classes.dex */
public final class zzaej implements zzacr {
    private String zza;
    private String zzb;
    private final String zzc;

    public zzaej(String str, String str2) {
        b.o(str);
        this.zza = str;
        this.zzb = "http://localhost";
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
