package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.List;
import r.f;
import w7.b;

/* loaded from: classes.dex */
public final class zzafo {
    public static long zza(String str) {
        zzafn zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzafn zzb(String str) {
        byte[] decode;
        b.o(str);
        List<String> zza = zzac.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            String str2 = zza.get(1);
            try {
                if (str2 == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(str2, 11);
                }
                return zzafn.zza(new String(decode, "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        }
        throw new RuntimeException(f.d("Invalid idToken ", str));
    }
}
