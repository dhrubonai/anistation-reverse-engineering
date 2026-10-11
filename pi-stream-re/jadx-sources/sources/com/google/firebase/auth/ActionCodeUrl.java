package com.google.firebase.auth;

import a3.g;
import android.net.Uri;
import java.util.HashMap;
import java.util.Set;
import w7.b;

/* loaded from: classes.dex */
public class ActionCodeUrl {
    private static final com.google.android.gms.internal.p002firebaseauthapi.zzau<String, Integer> zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    static {
        HashMap hashMap = new HashMap();
        g.x(2, hashMap, "recoverEmail", 0, "resetPassword", 4, "signIn", 1, "verifyEmail");
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        zza = com.google.android.gms.internal.p002firebaseauthapi.zzau.zza(hashMap);
    }

    private ActionCodeUrl(String str) {
        String zza2 = zza(str, "apiKey");
        String zza3 = zza(str, "oobCode");
        String zza4 = zza(str, "mode");
        if (zza2 != null && zza3 != null && zza4 != null) {
            b.o(zza2);
            this.zzb = zza2;
            b.o(zza3);
            this.zzc = zza3;
            b.o(zza4);
            this.zzd = zza4;
            this.zze = zza(str, "continueUrl");
            this.zzf = zza(str, "languageCode");
            this.zzg = zza(str, "tenantId");
            return;
        }
        throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
    }

    public static ActionCodeUrl parseLink(String str) {
        b.o(str);
        try {
            return new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String getApiKey() {
        return this.zzb;
    }

    public String getCode() {
        return this.zzc;
    }

    public String getContinueUrl() {
        return this.zze;
    }

    public String getLanguageCode() {
        return this.zzf;
    }

    public int getOperation() {
        com.google.android.gms.internal.p002firebaseauthapi.zzau<String, Integer> zzauVar = zza;
        if (zzauVar.containsKey(this.zzd)) {
            return zzauVar.get(this.zzd).intValue();
        }
        return 3;
    }

    public final String zza() {
        return this.zzg;
    }

    private static String zza(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            b.o(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
