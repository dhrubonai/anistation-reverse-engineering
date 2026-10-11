package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzic;
import com.google.android.gms.internal.p002firebaseauthapi.zzqm;
import com.google.android.gms.internal.p002firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzqe extends zznb<zzue> {
    private static final zzoe<zzqb, zzpx> zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqh
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return new zzrd((zzqb) zzbuVar);
        }
    }, zzqb.class, zzpx.class);
    private static final zzoe<zzqb, zzcf> zzb = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqg
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzxo.zza((zzqb) zzbuVar);
        }
    }, zzqb.class, zzcf.class);
    private static final zznp<zzqm> zzc = new zznp() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqj
    };

    public zzqe() {
        super(zzue.class, new zzqi(zzcf.class));
    }

    public static int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzna<?, zzue> zzb() {
        return new zzql(this, zzuf.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzux.zzb zzc() {
        return zzux.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final zzic.zza zza() {
        return zzic.zza.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ void zzb(zzue zzueVar) {
        zzue zzueVar2 = zzueVar;
        zzxq.zza(zzueVar2.zza(), 0);
        if (zzueVar2.zzf().zzb() >= 16) {
            zzb(zzueVar2.zze());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznb
    public final /* synthetic */ zzue zza(zzahm zzahmVar) {
        return zzue.zza(zzahmVar, zzaip.zza());
    }

    public static void zza(boolean z9) {
        zzcu.zza((zznb) new zzqe(), true);
        zzrg.zza();
        zzns.zza().zza(zza);
        zzns.zza().zza(zzb);
        zznt zza2 = zznt.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzqv.zza);
        zzqm.zza zzb2 = zzqm.zzd().zza(32).zzb(16);
        zzqm.zzc zzcVar = zzqm.zzc.zzd;
        zzqm.zza zza3 = zzb2.zza(zzcVar);
        zzqm.zzb zzbVar = zzqm.zzb.zzc;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zza3.zza(zzbVar).zza());
        zzqm.zza zzb3 = zzqm.zzd().zza(32).zzb(32);
        zzqm.zzc zzcVar2 = zzqm.zzc.zza;
        hashMap.put("HMAC_SHA256_256BITTAG", zzb3.zza(zzcVar2).zza(zzbVar).zza());
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzqm.zzd().zza(32).zzb(32).zza(zzcVar).zza(zzbVar).zza());
        zzqm.zza zza4 = zzqm.zzd().zza(64).zzb(16).zza(zzcVar2);
        zzqm.zzb zzbVar2 = zzqm.zzb.zze;
        hashMap.put("HMAC_SHA512_128BITTAG", zza4.zza(zzbVar2).zza());
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzqm.zzd().zza(64).zzb(16).zza(zzcVar).zza(zzbVar2).zza());
        hashMap.put("HMAC_SHA512_256BITTAG", zzqm.zzd().zza(64).zzb(32).zza(zzcVar2).zza(zzbVar2).zza());
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzqm.zzd().zza(64).zzb(32).zza(zzcVar).zza(zzbVar2).zza());
        hashMap.put("HMAC_SHA512_512BITTAG", zzqv.zzb);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzqm.zzd().zza(64).zzb(64).zza(zzcVar).zza(zzbVar2).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznm.zza().zza(zzc, zzqm.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(zzui zzuiVar) {
        if (zzuiVar.zza() >= 10) {
            int i10 = zzqk.zza[zzuiVar.zzb().ordinal()];
            if (i10 == 1) {
                if (zzuiVar.zza() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            if (i10 == 2) {
                if (zzuiVar.zza() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            if (i10 == 3) {
                if (zzuiVar.zza() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (i10 == 4) {
                if (zzuiVar.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else {
                if (i10 == 5) {
                    if (zzuiVar.zza() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                throw new GeneralSecurityException("unknown hash type");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }
}
