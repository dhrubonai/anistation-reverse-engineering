package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
import w7.b;

/* loaded from: classes.dex */
public final class zzaew implements zzaeq {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzaew(String str, String str2, String str3, String str4, String str5) {
        b.o(str);
        this.zza = str;
        b.o(str2);
        this.zzb = str2;
        b.o(str3);
        this.zzc = str3;
        b.o(str4);
        this.zzd = str4;
        this.zze = str5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final /* synthetic */ zzaeq zza(String str) {
        this.zza = str;
        return this;
    }

    public static zzaew zza(String str, String str2, String str3, String str4, String str5) {
        return new zzaew(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("displayName", this.zzb);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject2.put("sessionInfo", this.zzc);
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject2.put("verificationCode", this.zzd);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(this.zze)) {
            jSONObject.put("tenantId", this.zze);
        }
        return jSONObject.toString();
    }
}
