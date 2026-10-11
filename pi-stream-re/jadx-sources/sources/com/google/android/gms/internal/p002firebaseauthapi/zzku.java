package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class zzku {
    public static zzwq zza(zztx zztxVar) {
        int i10 = zzkt.zzb[zztxVar.ordinal()];
        if (i10 == 1) {
            return zzwq.NIST_P256;
        }
        if (i10 == 2) {
            return zzwq.NIST_P384;
        }
        if (i10 == 3) {
            return zzwq.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(String.valueOf(zztxVar)));
    }

    public static zzwp zza(zztj zztjVar) {
        int i10 = zzkt.zzc[zztjVar.ordinal()];
        if (i10 == 1) {
            return zzwp.UNCOMPRESSED;
        }
        if (i10 == 2) {
            return zzwp.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i10 == 3) {
            return zzwp.COMPRESSED;
        }
        throw new GeneralSecurityException("unknown point format: ".concat(String.valueOf(zztjVar)));
    }

    public static String zza(zzuc zzucVar) {
        int i10 = zzkt.zza[zzucVar.ordinal()];
        if (i10 == 1) {
            return "HmacSha1";
        }
        if (i10 == 2) {
            return "HmacSha224";
        }
        if (i10 == 3) {
            return "HmacSha256";
        }
        if (i10 == 4) {
            return "HmacSha384";
        }
        if (i10 == 5) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(String.valueOf(zzucVar)));
    }

    public static void zza(zztp zztpVar) {
        zzwn.zza(zza(zztpVar.zzf().zzd()));
        zza(zztpVar.zzf().zze());
        if (zztpVar.zza() != zztj.UNKNOWN_FORMAT) {
            zzcu.zza(zztpVar.zzb().zzd());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
