package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* loaded from: classes.dex */
final class zzji extends zzoi<zzbs, zztt> {
    public zzji(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoi
    public final /* synthetic */ zzbs zza(zztt zzttVar) {
        zztt zzttVar2 = zzttVar;
        zztp zzb = zzttVar2.zzb();
        zztw zzf = zzb.zzf();
        zzwq zza = zzku.zza(zzf.zzd());
        byte[] zzg = zzttVar2.zzf().zzg();
        byte[] zzg2 = zzttVar2.zzg().zzg();
        ECParameterSpec zza2 = zzwn.zza(zza);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, zzg), new BigInteger(1, zzg2));
        zzmd.zza(eCPoint, zza2.getCurve());
        return new zzwm((ECPublicKey) zzwr.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, zza2)), zzf.zzf().zzg(), zzku.zza(zzf.zze()), zzku.zza(zzb.zza()), new zzkw(zzb.zzb().zzd()));
    }
}
