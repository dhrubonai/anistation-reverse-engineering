package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class zzda implements zzdd {
    public static final zzda zza = new zzda();

    private zzda() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length == 2) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
                if (true != (zza3 instanceof Integer)) {
                    zza3 = null;
                }
                Integer num = (Integer) zza3;
                if (num != null) {
                    int intValue = num.intValue();
                    try {
                        if (zza2 instanceof String) {
                            zza2 = zzcjVar.zzh().zza((String) zza2);
                        }
                        zzcjVar.zzc().zzf(i10, Array.newInstance((Class<?>) zzci.zza(zza2), intValue));
                        return;
                    } catch (Exception e10) {
                        throw new zzae(6, 21, e10);
                    }
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
