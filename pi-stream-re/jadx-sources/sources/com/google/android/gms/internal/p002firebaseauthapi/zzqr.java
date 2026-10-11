package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzqr implements zzcq<zzcf, zzcf> {
    private static final zzqr zza = new zzqr();
    private static final zzoe<zznc, zzcf> zzb = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqu
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzrj.zza((zznc) zzbuVar);
        }
    }, zznc.class, zzcf.class);

    public static void zzc() {
        zzcu.zza(zza);
        zzns.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final Class<zzcf> zza() {
        return zzcf.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final Class<zzcf> zzb() {
        return zzcf.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final /* synthetic */ zzcf zza(zzch<zzcf> zzchVar) {
        Iterator<List<zzcm<zzcf>>> it = zzchVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzcm<zzcf> zzcmVar : it.next()) {
                if (zzcmVar.zzb() instanceof zzqp) {
                    zzqp zzqpVar = (zzqp) zzcmVar.zzb();
                    zzxr zza2 = zzxr.zza(zzcmVar.zzh());
                    if (!zza2.equals(zzqpVar.zzd())) {
                        String valueOf = String.valueOf(zzqpVar.zzc());
                        String valueOf2 = String.valueOf(zzqpVar.zzd());
                        String valueOf3 = String.valueOf(zza2);
                        StringBuilder sb = new StringBuilder("Mac Key with parameters ");
                        sb.append(valueOf);
                        sb.append(" has wrong output prefix (");
                        sb.append(valueOf2);
                        sb.append(") instead of (");
                        throw new GeneralSecurityException(g.t(sb, valueOf3, ")"));
                    }
                }
            }
        }
        return new zzqt(zzchVar);
    }
}
