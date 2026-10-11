package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahc implements zzacq<zzahc> {
    private static final String zza = "zzahc";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahc zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = b.a(jSONObject.optString("idToken", null));
            this.zzc = b.a(jSONObject.optString("refreshToken", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
