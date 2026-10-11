package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
import w7.b;

/* loaded from: classes.dex */
public final class zzagl implements zzagf {
    private final String zza;
    private final String zzb;

    private zzagl(String str, String str2) {
        b.o(str);
        this.zza = str;
        this.zzb = str2;
    }

    public static zzagl zza(String str, String str2) {
        return new zzagl(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("tenantId", this.zzb);
        }
        jSONObject.put("totpEnrollmentInfo", new JSONObject());
        return jSONObject.toString();
    }
}
