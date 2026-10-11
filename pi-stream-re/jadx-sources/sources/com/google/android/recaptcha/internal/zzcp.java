package com.google.android.recaptcha.internal;

import r6.h0;

/* loaded from: classes.dex */
public final class zzcp implements zzdd {
    public static final zzcp zza = new zzcp();

    private zzcp() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length == 3) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Integer)) {
                zza2 = null;
            }
            Integer num = (Integer) zza2;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
                    if (true != (zza3 instanceof Object)) {
                        zza3 = null;
                    }
                    if (zza3 != null) {
                        Object zza4 = zzcjVar.zzc().zza(zzpqVarArr[2]);
                        if (true != (zza4 instanceof Object)) {
                            zza4 = null;
                        }
                        if (zza4 != null) {
                            if (h0.g(zza3, zza4)) {
                                zzcjVar.zzg(zzcjVar.zza() + intValue);
                                return;
                            }
                            return;
                        }
                        throw new zzae(4, 5, null);
                    }
                    throw new zzae(4, 5, null);
                }
                throw new zzae(4, 6, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
