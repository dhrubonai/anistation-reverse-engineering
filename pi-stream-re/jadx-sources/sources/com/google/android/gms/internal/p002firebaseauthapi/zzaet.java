package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;
import w7.b;

/* loaded from: classes.dex */
public final class zzaet implements zzaes {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzaet(String str, String str2, String str3, String str4, String str5) {
        b.o(str);
        this.zza = str;
        b.o(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
    }

    public static zzaet zza(String str, String str2, String str3, String str4) {
        b.o(str3);
        b.o(str2);
        return new zzaet("phone", str, str2, str3, str4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaProvider", 1);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzc;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zzb);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
