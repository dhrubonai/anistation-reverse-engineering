package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaky {
    private static final zzaky zza = new zzaky();
    private final ConcurrentMap<Class<?>, zzalc<?>> zzc = new ConcurrentHashMap();
    private final zzalf zzb = new zzajy();

    private zzaky() {
    }

    public static zzaky zza() {
        return zza;
    }

    public final <T> zzalc<T> zza(Class<T> cls) {
        zzajc.zza(cls, "messageType");
        zzalc<T> zzalcVar = (zzalc) this.zzc.get(cls);
        if (zzalcVar != null) {
            return zzalcVar;
        }
        zzalc<T> zza2 = this.zzb.zza(cls);
        zzajc.zza(cls, "messageType");
        zzajc.zza(zza2, "schema");
        zzalc<T> zzalcVar2 = (zzalc) this.zzc.putIfAbsent(cls, zza2);
        return zzalcVar2 != null ? zzalcVar2 : zza2;
    }

    public final <T> zzalc<T> zza(T t9) {
        return zza((Class) t9.getClass());
    }
}
