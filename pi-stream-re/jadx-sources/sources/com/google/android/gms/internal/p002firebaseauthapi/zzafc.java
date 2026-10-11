package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzafc implements zzacq<zzafc> {
    private static final String zza = "zzafc";
    private zzafe zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafc zza(String str) {
        zzafe zzafeVar;
        int i10;
        zzafb zzafbVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("users")) {
                zzafeVar = new zzafe();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z9 = false;
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            zzafbVar = new zzafb();
                            i10 = i11;
                        } else {
                            i10 = i11;
                            zzafbVar = new zzafb(b.a(jSONObject2.optString("localId", null)), b.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z9), b.a(jSONObject2.optString("displayName", null)), b.a(jSONObject2.optString("photoUrl", null)), zzafu.zza(jSONObject2.optJSONArray("providerUserInfo")), b.a(jSONObject2.optString("rawPassword", null)), b.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzafq.zza(jSONObject2.optJSONArray("mfaInfo")), zzafp.zza(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzafbVar);
                        i11 = i10 + 1;
                        z9 = false;
                    }
                    zzafeVar = new zzafe(arrayList);
                }
                zzafeVar = new zzafe(new ArrayList());
            }
            this.zzb = zzafeVar;
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final List<zzafb> zza() {
        return this.zzb.zza();
    }
}
