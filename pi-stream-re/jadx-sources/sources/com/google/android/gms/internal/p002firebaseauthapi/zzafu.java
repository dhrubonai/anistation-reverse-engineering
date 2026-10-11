package com.google.android.gms.internal.p002firebaseauthapi;

import i5.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzafu {
    private List<zzafr> zza;

    public zzafu() {
        this.zza = new ArrayList();
    }

    public static zzafu zza(JSONArray jSONArray) {
        zzafr zzafrVar;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject == null) {
                    zzafrVar = new zzafr();
                } else {
                    zzafrVar = new zzafr(b.a(jSONObject.optString("federatedId", null)), b.a(jSONObject.optString("displayName", null)), b.a(jSONObject.optString("photoUrl", null)), b.a(jSONObject.optString("providerId", null)), null, b.a(jSONObject.optString("phoneNumber", null)), b.a(jSONObject.optString("email", null)));
                }
                arrayList.add(zzafrVar);
            }
            return new zzafu(arrayList);
        }
        return new zzafu(new ArrayList());
    }

    private zzafu(List<zzafr> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }

    public final List<zzafr> zza() {
        return this.zza;
    }
}
