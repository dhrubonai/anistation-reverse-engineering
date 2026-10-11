package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzng {
    public static final zzrp zza = new zzni();

    public static <P> zzrs zza(zzch<P> zzchVar) {
        zzbw zzbwVar;
        zzrr zzrrVar = new zzrr();
        zzrrVar.zza(zzchVar.zzb());
        Iterator<List<zzcm<P>>> it = zzchVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzcm<P> zzcmVar : it.next()) {
                int i10 = zznj.zza[zzcmVar.zzc().ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            zzbwVar = zzbw.zzc;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        zzbwVar = zzbw.zzb;
                    }
                } else {
                    zzbwVar = zzbw.zza;
                }
                int zza2 = zzcmVar.zza();
                String zzg = zzcmVar.zzg();
                if (zzg.startsWith("type.googleapis.com/google.crypto.")) {
                    zzg = zzg.substring(34);
                }
                zzrrVar.zza(zzbwVar, zza2, zzg, zzcmVar.zzd().name());
            }
        }
        if (zzchVar.zza() != null) {
            zzrrVar.zza(zzchVar.zza().zza());
        }
        try {
            return zzrrVar.zza();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
