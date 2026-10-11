package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import com.google.android.gms.internal.p002firebaseauthapi.zzhd;
import com.google.android.gms.internal.p002firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import r.f;

/* loaded from: classes.dex */
public final class zzhu {
    private static final zzxr zza;
    private static final zzoa<zzhd, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzha, zzot> zzd;
    private static final zzmt<zzot> zze;

    static {
        zzxr zzb2 = zzpg.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                zzos zzb3;
                zzb3 = zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzvz.zzc().zzi()).zza(zzhu.zza(((zzhd) zzciVar).zzb())).zzf()));
                return zzb3;
            }
        }, zzhd.class, zzos.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                zzhd zzb3;
                zzb3 = zzhu.zzb((zzos) zzowVar);
                return zzb3;
            }
        }, zzb2, zzos.class);
        zzd = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                zzot zza2;
                zza2 = zzot.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzvw) ((zzaja) zzvw.zzb().zza(zzahm.zza(r1.zzd().zza(zzct.zza(zzctVar)))).zzf())).zzi(), zzux.zzb.SYMMETRIC, zzhu.zza(r1.zzb().zzb()), ((zzha) zzbuVar).zza());
                return zza2;
            }
        }, zzha.class, zzot.class);
        zze = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                zzha zzb3;
                zzb3 = zzhu.zzb((zzot) zzowVar, zzctVar);
                return zzb3;
            }
        }, zzb2, zzot.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzha zzb(zzot zzotVar, zzct zzctVar) {
        if (zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzvw zza2 = zzvw.zza(zzotVar.zzd(), zzaip.zza());
                if (zza2.zza() == 0) {
                    return zzha.zza(zza(zzotVar.zzc()), zzxt.zza(zza2.zzd().zzg(), zzct.zza(zzctVar)), zzotVar.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzajj unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    private static zzhd.zza zza(zzvt zzvtVar) {
        int i10 = zzib.zza[zzvtVar.ordinal()];
        if (i10 == 1) {
            return zzhd.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzhd.zza.zzb;
        }
        if (i10 == 4) {
            return zzhd.zza.zzc;
        }
        throw new GeneralSecurityException(g.n("Unable to parse OutputPrefixType: ", zzvtVar.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzhd zzb(zzos zzosVar) {
        if (zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzvz.zza(zzosVar.zza().zze(), zzaip.zza()).zza() == 0) {
                    return zzhd.zza(zza(zzosVar.zza().zzd()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzajj e10) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException(f.d("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", zzosVar.zza().zzf()));
    }

    private static zzvt zza(zzhd.zza zzaVar) {
        if (zzhd.zza.zza.equals(zzaVar)) {
            return zzvt.TINK;
        }
        if (zzhd.zza.zzb.equals(zzaVar)) {
            return zzvt.CRUNCHY;
        }
        if (zzhd.zza.zzc.equals(zzaVar)) {
            return zzvt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    public static void zza() {
        zznv zza2 = zznv.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
