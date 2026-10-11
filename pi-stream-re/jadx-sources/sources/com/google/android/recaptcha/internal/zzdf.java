package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzdf implements zzdd {
    public static final zzdf zza = new zzdf();

    private zzdf() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length == 1) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                try {
                    if (zza2 instanceof String) {
                        zza2 = zzcjVar.zzh().zza((String) zza2);
                    }
                    zzcjVar.zzc().zzf(i10, zzci.zza(zza2));
                    return;
                } catch (zzae e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new zzae(6, 8, e11);
                }
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
