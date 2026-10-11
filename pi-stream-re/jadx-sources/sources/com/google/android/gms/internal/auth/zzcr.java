package com.google.android.gms.internal.auth;

import android.net.Uri;
import n.e;

/* loaded from: classes.dex */
public final class zzcr {
    private static final e zza = new e();

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            e eVar = zza;
            Uri uri = (Uri) eVar.getOrDefault("com.google.android.gms.auth_account", null);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                eVar.put("com.google.android.gms.auth_account", parse);
                return parse;
            }
            return uri;
        }
    }
}
