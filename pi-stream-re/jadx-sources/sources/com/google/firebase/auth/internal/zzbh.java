package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzxv;
import e5.a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.e;
import org.json.JSONArray;
import org.json.JSONObject;
import r.f;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbh {
    private static final a zza = new a("JSONParser", new String[0]);

    private static List<Object> zza(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = zza((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = zza((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map<String, Object> zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject == JSONObject.NULL) {
                return null;
            }
            return zza(jSONObject);
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzxv(e10);
        }
    }

    public static Map<String, Object> zza(String str) {
        b.o(str);
        List<String> zza2 = com.google.android.gms.internal.p002firebaseauthapi.zzac.zza('.').zza((CharSequence) str);
        if (zza2.size() < 2) {
            zza.c(f.d("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = zza2.get(1);
        try {
            Map<String, Object> zzb = zzb(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return zzb == null ? new HashMap() : zzb;
        } catch (UnsupportedEncodingException e10) {
            zza.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    private static Map<String, Object> zza(JSONObject jSONObject) {
        e eVar = new e();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = zza((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = zza((JSONObject) obj);
            }
            eVar.put(next, obj);
        }
        return eVar;
    }
}
