package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import x6.m;

/* loaded from: classes.dex */
public final class zzeg implements zzee {
    private final zzef zza;
    private final zzed zzb;

    public zzeg(zzef zzefVar, zzed zzedVar) {
        this.zza = zzefVar;
        this.zzb = zzedVar;
    }

    private final zzpf zzb(String str, List list) {
        zzea zzeaVar;
        if (str.length() != 0) {
            try {
                long zza = this.zza.zza(m.y0(list));
                zzeaVar = zzec.zzb;
                zzec zzecVar = new zzec(zza, 255L, zzeaVar);
                StringBuilder sb = new StringBuilder(str.length());
                for (int i10 = 0; i10 < str.length(); i10++) {
                    sb.append((char) (str.charAt(i10) ^ ((int) zzecVar.zza())));
                }
                return zzpf.zzg(zzfy.zzh().zzj(sb.toString()));
            } catch (Exception e10) {
                throw new zzae(3, 18, e10);
            }
        }
        throw new zzae(3, 17, null);
    }

    @Override // com.google.android.recaptcha.internal.zzee
    public final zzpf zza(zzpn zzpnVar) {
        zzfh zzb = zzfh.zzb();
        zzpf zzb2 = zzb(zzpnVar.zzi(), zzpnVar.zzj());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        zzv zzvVar = zzv.zza;
        zzv.zza(zzx.zzm.zza(), zza);
        return zzb2;
    }
}
