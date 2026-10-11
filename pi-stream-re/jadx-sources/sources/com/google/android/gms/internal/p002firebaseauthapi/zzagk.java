package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagk implements zzacq<zzagk> {
    private static final String zza = "zzagk";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagk zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.zzb = b.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
