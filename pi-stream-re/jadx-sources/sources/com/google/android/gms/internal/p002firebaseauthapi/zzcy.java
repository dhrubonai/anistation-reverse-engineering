package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzux;
import com.google.android.gms.internal.p002firebaseauthapi.zzvh;
import com.google.android.gms.internal.p002firebaseauthapi.zzvi;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzcy {
    private static final Charset zza = Charset.forName("UTF-8");

    public static zzvi zza(zzvh zzvhVar) {
        zzvi.zza zza2 = zzvi.zza().zza(zzvhVar.zzb());
        for (zzvh.zza zzaVar : zzvhVar.zze()) {
            zza2.zza((zzvi.zzb) ((zzaja) zzvi.zzb.zzb().zza(zzaVar.zzb().zzf()).zza(zzaVar.zzc()).zza(zzaVar.zzf()).zza(zzaVar.zza()).zzf()));
        }
        return (zzvi) ((zzaja) zza2.zzf());
    }

    public static void zzb(zzvh zzvhVar) {
        int zzb = zzvhVar.zzb();
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = true;
        for (zzvh.zza zzaVar : zzvhVar.zze()) {
            if (zzaVar.zzc() == zzvb.ENABLED) {
                if (zzaVar.zzg()) {
                    if (zzaVar.zzf() != zzvt.UNKNOWN_PREFIX) {
                        if (zzaVar.zzc() != zzvb.UNKNOWN_STATUS) {
                            if (zzaVar.zza() == zzb) {
                                if (!z9) {
                                    z9 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (zzaVar.zzb().zzb() != zzux.zzb.ASYMMETRIC_PUBLIC) {
                                z10 = false;
                            }
                            i10++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.zza())));
                }
            }
        }
        if (i10 != 0) {
            if (!z9 && !z10) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
