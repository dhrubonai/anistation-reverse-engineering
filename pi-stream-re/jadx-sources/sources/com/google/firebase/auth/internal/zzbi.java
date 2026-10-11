package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzxv;
import com.google.firebase.auth.GetTokenResult;
import e5.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbi {
    private static final a zza = new a("GetTokenResultFactory", new String[0]);

    public static GetTokenResult zza(String str) {
        Map hashMap;
        try {
            hashMap = zzbh.zza(str);
        } catch (zzxv e10) {
            zza.b("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new GetTokenResult(str, hashMap);
    }
}
