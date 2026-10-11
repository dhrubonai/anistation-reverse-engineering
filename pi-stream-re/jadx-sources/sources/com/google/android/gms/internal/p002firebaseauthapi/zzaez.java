package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;
import w7.b;

/* loaded from: classes.dex */
public final class zzaez implements zzacr {
    private String zza;

    public zzaez(String str) {
        b.o(str);
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }
}
