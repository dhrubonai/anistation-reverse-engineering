package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagg implements zzacq<zzagg> {
    private static final String zza = "zzagg";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagg zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = b.a(jSONObject.optString("idToken", null));
            this.zzc = b.a(jSONObject.optString("displayName", null));
            this.zzd = b.a(jSONObject.optString("email", null));
            this.zze = b.a(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
