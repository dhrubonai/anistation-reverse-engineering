package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import com.google.android.gms.internal.p002firebaseauthapi.zzer;
import com.google.android.gms.internal.p002firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import r.f;

/* loaded from: classes.dex */
public final class zzhf {
    private static final zzxr zza;
    private static final zzoa<zzer, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzek, zzot> zzd;
    private static final zzmt<zzot> zze;

    static {
        zzxr zzb2 = zzpg.zzb(zzcx.zzb);
        zza = zzb2;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                return zzhf.zza((zzer) zzciVar);
            }
        }, zzer.class, zzos.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                zzer zzb3;
                zzb3 = zzhf.zzb((zzos) zzowVar);
                return zzb3;
            }
        }, zzb2, zzos.class);
        zzd = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                return zzhf.zza((zzek) zzbuVar, zzctVar);
            }
        }, zzek.class, zzot.class);
        zze = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                zzek zzb3;
                zzb3 = zzhf.zzb((zzot) zzowVar, zzctVar);
                return zzb3;
            }
        }, zzb2, zzot.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzek zzb(zzot zzotVar, zzct zzctVar) {
        if (zzotVar.zzf().equals(zzcx.zzb)) {
            try {
                zzst zza2 = zzst.zza(zzotVar.zzd(), zzaip.zza());
                if (zza2.zza() == 0) {
                    return zzek.zzb().zza(zzer.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzotVar.zzc())).zza()).zza(zzxt.zza(zza2.zzd().zzg(), zzct.zza(zzctVar))).zza(zzotVar.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajj unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
    }

    private static zzer.zzb zza(zzvt zzvtVar) {
        int i10 = zzhl.zza[zzvtVar.ordinal()];
        if (i10 == 1) {
            return zzer.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzer.zzb.zzb;
        }
        if (i10 == 4) {
            return zzer.zzb.zzc;
        }
        throw new GeneralSecurityException(g.n("Unable to parse OutputPrefixType: ", zzvtVar.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzer zzb(zzos zzosVar) {
        if (zzosVar.zza().zzf().equals(zzcx.zzb)) {
            try {
                zzsw zza2 = zzsw.zza(zzosVar.zza().zze(), zzaip.zza());
                if (zza2.zzb() == 0) {
                    return zzer.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzosVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzajj e10) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException(f.d("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", zzosVar.zza().zzf()));
    }

    public static /* synthetic */ zzot zza(zzek zzekVar, zzct zzctVar) {
        zzb(zzekVar.zzc());
        return zzot.zza(zzcx.zzb, ((zzst) ((zzaja) zzst.zzb().zza(zzahm.zza(zzekVar.zze().zza(zzct.zza(zzctVar)))).zzf())).zzi(), zzux.zzb.SYMMETRIC, zza(zzekVar.zzc().zzf()), zzekVar.zza());
    }

    public static /* synthetic */ zzos zza(zzer zzerVar) {
        zzb(zzerVar);
        return zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza(zzcx.zzb).zza(((zzsw) ((zzaja) zzsw.zzc().zza(zzerVar.zzc()).zzf())).zzi()).zza(zza(zzerVar.zzf())).zzf()));
    }

    private static void zzb(zzer zzerVar) {
        if (zzerVar.zzd() == 16) {
            if (zzerVar.zzb() != 12) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzerVar.zzb())));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzerVar.zzd())));
    }

    private static zzvt zza(zzer.zzb zzbVar) {
        if (zzer.zzb.zza.equals(zzbVar)) {
            return zzvt.TINK;
        }
        if (zzer.zzb.zzb.equals(zzbVar)) {
            return zzvt.CRUNCHY;
        }
        if (zzer.zzb.zzc.equals(zzbVar)) {
            return zzvt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static void zza() {
        zznv zza2 = zznv.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
