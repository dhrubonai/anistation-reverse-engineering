package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import com.google.android.gms.internal.p002firebaseauthapi.zzjx;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;
import r.f;

/* loaded from: classes.dex */
public final class zzkk extends zzkr {
    private final zzjx zza;
    private final zzxr zzb;
    private final zzxr zzc;
    private final Integer zzd;

    private zzkk(zzjx zzjxVar, zzxr zzxrVar, zzxr zzxrVar2, Integer num) {
        this.zza = zzjxVar;
        this.zzb = zzxrVar;
        this.zzc = zzxrVar2;
        this.zzd = num;
    }

    public static zzkk zza(zzjx zzjxVar, zzxr zzxrVar, Integer num) {
        zzxr l10;
        EllipticCurve curve;
        zzjx.zzf zzf = zzjxVar.zzf();
        zzjx.zzf zzfVar = zzjx.zzf.zzc;
        if (!zzf.equals(zzfVar) && num == null) {
            throw new GeneralSecurityException(f.e("'idRequirement' must be non-null for ", String.valueOf(zzf), " variant."));
        }
        if (zzf.equals(zzfVar) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzjx.zzd zze = zzjxVar.zze();
        int zza = zzxrVar.zza();
        String str = "Encoded public key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        zzjx.zzd zzdVar = zzjx.zzd.zza;
        if (zze == zzdVar) {
            if (zza != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zze == zzjx.zzd.zzb) {
            if (zza != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zze == zzjx.zzd.zzc) {
            if (zza != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (zze != zzjx.zzd.zzd) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(zze)));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (zze == zzdVar || zze == zzjx.zzd.zzb || zze == zzjx.zzd.zzc) {
            if (zze == zzdVar) {
                curve = zzmd.zza.getCurve();
            } else if (zze == zzjx.zzd.zzb) {
                curve = zzmd.zzb.getCurve();
            } else if (zze == zzjx.zzd.zzc) {
                curve = zzmd.zzc.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zze)));
            }
            zzmd.zza(zzwn.zza(curve, zzwp.UNCOMPRESSED, zzxrVar.zzb()), curve);
        }
        zzjx.zzf zzf2 = zzjxVar.zzf();
        if (zzf2 == zzfVar) {
            l10 = zzxr.zza(new byte[0]);
        } else if (num != null) {
            if (zzf2 == zzjx.zzf.zzb) {
                l10 = g.l(num, ByteBuffer.allocate(5).put((byte) 0));
            } else if (zzf2 == zzjx.zzf.zza) {
                l10 = g.l(num, ByteBuffer.allocate(5).put((byte) 1));
            } else {
                throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(String.valueOf(zzf2)));
            }
        } else {
            throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(zzf2)));
        }
        return new zzkk(zzjxVar, zzxrVar, l10, num);
    }

    public final zzjx zzb() {
        return this.zza;
    }

    public final zzxr zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zzd;
    }
}
