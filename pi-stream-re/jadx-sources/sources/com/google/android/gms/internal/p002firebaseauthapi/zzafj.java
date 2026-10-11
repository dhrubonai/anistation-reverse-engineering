package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzafj implements zzacq<zzafj> {
    private static final String zza = "zzafj";
    private String zzb;
    private zzaq<zzaft> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacq
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzafj zza(String str) {
        zzaq<zzaft> zza2;
        zzaft zza3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = b.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzap zzg = zzaq.zzg();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        if (jSONObject2 == null) {
                            zza3 = zzaft.zza(null, null);
                        } else {
                            zza3 = zzaft.zza(b.a(jSONObject2.optString("provider")), b.a(jSONObject2.optString("enforcementState")));
                        }
                        zzg.zza(zza3);
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzaq.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final boolean zzb(String str) {
        String str2;
        w7.b.o(str);
        zzaq<zzaft> zzaqVar = this.zzc;
        if (zzaqVar != null && !zzaqVar.isEmpty()) {
            zzaq<zzaft> zzaqVar2 = this.zzc;
            int size = zzaqVar2.size();
            int i10 = 0;
            while (i10 < size) {
                zzaft zzaftVar = zzaqVar2.get(i10);
                i10++;
                zzaft zzaftVar2 = zzaftVar;
                String zza2 = zzaftVar2.zza();
                String zzb = zzaftVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    str2 = zzaftVar2.zza();
                    break;
                }
            }
        }
        str2 = null;
        if (str2 == null) {
            return false;
        }
        if (!str2.equals("ENFORCE") && !str2.equals("AUDIT")) {
            return false;
        }
        return true;
    }

    public final String zza() {
        return this.zzb;
    }
}
