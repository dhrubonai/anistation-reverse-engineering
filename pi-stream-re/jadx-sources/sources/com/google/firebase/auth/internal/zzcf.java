package com.google.firebase.auth.internal;

import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public final class zzcf {
    private static final Map<String, String> zza;

    static {
        HashMap hashMap = new HashMap();
        zza = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status zza(Intent intent) {
        b.s(intent);
        b.j(zzb(intent));
        return (Status) a0.p(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static boolean zzb(Intent intent) {
        b.s(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static void zza(Intent intent, Status status) {
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
    }

    public static Status zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = zza;
                if (map.containsKey(string)) {
                    return zzao.zza(map.get(string) + ":" + string2);
                }
            }
            return zzao.zza("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            return zzao.zza("WEB_INTERNAL_ERROR:" + str + "[ " + e10.getLocalizedMessage() + " ]");
        }
    }
}
