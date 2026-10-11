package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzaha implements zzacq<zzaha> {
    private static final String zza = "zzaha";
    private String zzb;
    private String zzc;
    private long zzd;
    private String zze;
    private boolean zzf;
    private String zzg;
    private String zzh;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaha zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = b.a(jSONObject.optString("idToken", null));
            this.zzc = b.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = b.a(jSONObject.optString("localId", null));
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = b.a(jSONObject.optString("temporaryProof", null));
            this.zzh = b.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzb;
    }
}
