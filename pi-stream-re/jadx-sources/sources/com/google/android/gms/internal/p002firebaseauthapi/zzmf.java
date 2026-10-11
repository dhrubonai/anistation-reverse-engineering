package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzmf<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public static <E extends Enum<E>, O> zzmi<E, O> zza() {
        return new zzmi<>();
    }

    private zzmf(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final E zza(O o) {
        E e10 = this.zzb.get(o);
        if (e10 != null) {
            return e10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(o)));
    }

    public final O zza(E e10) {
        O o = this.zza.get(e10);
        if (o != null) {
            return o;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(e10)));
    }
}
