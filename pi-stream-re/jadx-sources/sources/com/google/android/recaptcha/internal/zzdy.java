package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzdy implements zzdd {
    public static final zzdy zza = new zzdy();

    private zzdy() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        int length = zzpqVarArr.length;
        if (length != 2) {
            if (length == 0) {
                zzcjVar.zzc().zzf(i10, new zzz());
                return;
            }
            throw new zzae(4, 3, null);
        }
        Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str != null) {
            Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
            if (true != (zza3 instanceof zzz)) {
                zza3 = null;
            }
            zzz zzzVar = (zzz) zza3;
            if (zzzVar != null) {
                byte[] zzd = zzbp.zza(zzcjVar.zzb(), zzzVar).zzd();
                zzcjVar.zzi().zzb(str, zzfy.zzh().zzi(zzd, 0, zzd.length));
                return;
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 5, null);
    }
}
