package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzcq implements zzdd {
    public static final zzcq zza = new zzcq();

    private zzcq() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length != 0) {
            zzpi zzf = zzpl.zzf();
            for (zzpq zzpqVar : zzpqVarArr) {
                Object zza2 = zzcjVar.zzc().zza(zzpqVar);
                if (zza2 != null) {
                    zzpj zzf2 = zzpk.zzf();
                    if (zza2 instanceof Integer) {
                        zzf2.zzt(((Number) zza2).intValue());
                    } else if (zza2 instanceof Short) {
                        zzf2.zzs(((Number) zza2).shortValue());
                    } else if (zza2 instanceof Byte) {
                        zzf2.zze(zzgw.zzm(new byte[]{((Number) zza2).byteValue()}, 0, 1));
                    } else if (zza2 instanceof Long) {
                        zzf2.zzu(((Number) zza2).longValue());
                    } else if (zza2 instanceof Double) {
                        zzf2.zzq(((Number) zza2).doubleValue());
                    } else if (zza2 instanceof Float) {
                        zzf2.zzr(((Number) zza2).floatValue());
                    } else if (zza2 instanceof Boolean) {
                        zzf2.zzd(((Boolean) zza2).booleanValue());
                    } else if (zza2 instanceof Character) {
                        zzf2.zzp(zza2.toString());
                    } else if (zza2 instanceof String) {
                        zzf2.zzv((String) zza2);
                    } else {
                        zzf2.zzv(zza2.toString());
                    }
                    zzf.zze((zzpk) zzf2.zzj());
                } else {
                    throw new zzae(4, 4, null);
                }
            }
            zzck zzc = zzcjVar.zzc();
            byte[] zzd = ((zzpl) zzf.zzj()).zzd();
            zzc.zzf(i10, zzfy.zzh().zzi(zzd, 0, zzd.length));
            return;
        }
        throw new zzae(4, 3, null);
    }
}
