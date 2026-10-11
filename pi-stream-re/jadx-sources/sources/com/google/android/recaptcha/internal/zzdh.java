package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzdh implements zzdd {
    public static final zzdh zza = new zzdh();

    private zzdh() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        Class<?> cls;
        if (zzpqVarArr.length == 2) {
            Class<?> zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof Class) {
                    cls = zza2;
                } else {
                    cls = zza2.getClass();
                }
                Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str = (String) zza3;
                if (str != null) {
                    try {
                        zzcjVar.zzc().zzf(i10, cls.getField(zzcjVar.zzh().zza(str)));
                        return;
                    } catch (Exception e10) {
                        throw new zzae(6, 10, e10);
                    }
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
