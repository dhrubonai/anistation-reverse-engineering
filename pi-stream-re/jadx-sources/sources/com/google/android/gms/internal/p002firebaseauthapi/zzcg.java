package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import r.f;

@Deprecated
/* loaded from: classes.dex */
public final class zzcg {
    private static final CopyOnWriteArrayList<zzcd> zza = new CopyOnWriteArrayList<>();

    @Deprecated
    public static zzcd zza(String str) {
        Iterator<zzcd> it = zza.iterator();
        while (it.hasNext()) {
            zzcd next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(f.d("No KMS client does support: ", str));
    }
}
