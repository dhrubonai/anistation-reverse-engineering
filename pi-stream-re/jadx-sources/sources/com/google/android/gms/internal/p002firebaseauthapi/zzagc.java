package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagc implements zzacq<zzagc> {
    private static final String zza = "zzagc";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagc zza(String str) {
        try {
            this.zzb = b.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
