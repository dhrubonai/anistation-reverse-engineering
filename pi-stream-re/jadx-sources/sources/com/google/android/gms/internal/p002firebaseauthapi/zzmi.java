package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzmi<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public final zzmi<E, O> zza(E e10, O o) {
        this.zza.put(e10, o);
        this.zzb.put(o, e10);
        return this;
    }

    private zzmi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmf<E, O> zza() {
        return new zzmf<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }
}
