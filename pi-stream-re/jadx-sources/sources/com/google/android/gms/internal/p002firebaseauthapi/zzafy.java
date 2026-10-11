package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zzafy implements zzacr {
    public static zzafx zzg() {
        return new zzaei();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", zzc());
        jSONObject.put("token", zzf());
        jSONObject.put("providerId", zzd());
        jSONObject.put("tokenType", zzb().toString());
        jSONObject.put("tenantId", zze());
        return jSONObject.toString();
    }

    public abstract zzaex zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
