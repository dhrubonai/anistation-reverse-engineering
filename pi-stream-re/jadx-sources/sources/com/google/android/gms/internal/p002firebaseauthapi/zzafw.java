package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;
import w7.b;

/* loaded from: classes.dex */
public final class zzafw implements zzacr {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzafw(String str, String str2, String str3) {
        b.o(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.zza);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
