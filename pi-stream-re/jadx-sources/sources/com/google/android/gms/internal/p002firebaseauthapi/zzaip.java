package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaip {
    static final zzaip zza = new zzaip(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private final Map<zzaio, zzaja.zzf<?, ?>> zzd;

    public zzaip() {
        this.zzd = new HashMap();
    }

    public static zzaip zza() {
        return zza;
    }

    public final <ContainingType extends zzakk> zzaja.zzf<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return (zzaja.zzf) this.zzd.get(new zzaio(containingtype, i10));
    }

    private zzaip(boolean z9) {
        this.zzd = Collections.emptyMap();
    }
}
