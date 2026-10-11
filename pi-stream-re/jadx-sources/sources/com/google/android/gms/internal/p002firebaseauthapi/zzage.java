package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzage implements zzacq<zzage> {
    private static final String zza = "zzage";
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzafu zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzage zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = b.a(jSONObject.optString("email", null));
            this.zzc = b.a(jSONObject.optString("passwordHash", null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = b.a(jSONObject.optString("displayName", null));
            this.zzf = b.a(jSONObject.optString("photoUrl", null));
            this.zzg = zzafu.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = b.a(jSONObject.optString("idToken", null));
            this.zzi = b.a(jSONObject.optString("refreshToken", null));
            this.zzj = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzj;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final List<zzafr> zze() {
        zzafu zzafuVar = this.zzg;
        if (zzafuVar != null) {
            return zzafuVar.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
