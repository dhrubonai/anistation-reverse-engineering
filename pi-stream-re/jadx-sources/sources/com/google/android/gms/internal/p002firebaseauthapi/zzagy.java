package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import i5.b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagy implements zzacq<zzagy> {
    private static final String zza = "zzagy";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private List<zzafq> zzi;
    private String zzj;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagy zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = b.a(jSONObject.optString("localId", null));
            this.zzc = b.a(jSONObject.optString("email", null));
            this.zzd = b.a(jSONObject.optString("displayName", null));
            this.zze = b.a(jSONObject.optString("idToken", null));
            this.zzf = b.a(jSONObject.optString("photoUrl", null));
            this.zzg = b.a(jSONObject.optString("refreshToken", null));
            this.zzh = jSONObject.optLong("expiresIn", 0L);
            this.zzi = zzafq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzj = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List<zzafq> zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        if (!TextUtils.isEmpty(this.zzj)) {
            return true;
        }
        return false;
    }

    public final String zzb() {
        return this.zze;
    }
}
