package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zzd;
import i5.b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagu implements zzacq<zzagu> {
    private static final String zza = "zzagu";
    private boolean zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private boolean zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private List<zzafq> zzt;
    private String zzu;

    public final long zza() {
        return this.zzf;
    }

    public final zzd zzb() {
        if (TextUtils.isEmpty(this.zzn) && TextUtils.isEmpty(this.zzo)) {
            return null;
        }
        return zzd.zza(this.zzk, this.zzo, this.zzn, this.zzr, this.zzp);
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zzu;
    }

    public final String zzg() {
        return this.zzk;
    }

    public final String zzh() {
        return this.zzl;
    }

    public final String zzi() {
        return this.zze;
    }

    public final String zzj() {
        return this.zzs;
    }

    public final List<zzafq> zzk() {
        return this.zzt;
    }

    public final boolean zzl() {
        if (!TextUtils.isEmpty(this.zzu)) {
            return true;
        }
        return false;
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzm;
    }

    public final boolean zzo() {
        if (!this.zzb && TextUtils.isEmpty(this.zzq)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagu zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            this.zzc = jSONObject.optBoolean("needEmail", false);
            this.zzd = b.a(jSONObject.optString("idToken", null));
            this.zze = b.a(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            this.zzg = b.a(jSONObject.optString("localId", null));
            this.zzh = b.a(jSONObject.optString("email", null));
            this.zzi = b.a(jSONObject.optString("displayName", null));
            this.zzj = b.a(jSONObject.optString("photoUrl", null));
            this.zzk = b.a(jSONObject.optString("providerId", null));
            this.zzl = b.a(jSONObject.optString("rawUserInfo", null));
            this.zzm = jSONObject.optBoolean("isNewUser", false);
            this.zzn = jSONObject.optString("oauthAccessToken", null);
            this.zzo = jSONObject.optString("oauthIdToken", null);
            this.zzq = b.a(jSONObject.optString("errorMessage", null));
            this.zzr = b.a(jSONObject.optString("pendingToken", null));
            this.zzs = b.a(jSONObject.optString("tenantId", null));
            this.zzt = zzafq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzu = b.a(jSONObject.optString("mfaPendingCredential", null));
            this.zzp = b.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }
}
