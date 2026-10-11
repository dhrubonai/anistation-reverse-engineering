package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagm extends zzagi {
    private static final String zza = "zzagm";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagi
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzagm zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzah.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagi, com.google.android.gms.internal.p002firebaseauthapi.zzacq
    public final /* synthetic */ zzagi zza(String str) {
        return (zzagm) zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagi
    public final String zza() {
        return this.zzb;
    }
}
