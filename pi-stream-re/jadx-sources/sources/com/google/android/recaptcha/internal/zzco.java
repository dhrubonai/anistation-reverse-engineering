package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class zzco implements zzdd {
    public static final zzco zza = new zzco();

    private zzco() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length == 3) {
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
                    Object zza4 = zzcjVar.zzc().zza(zzpqVarArr[2]);
                    if (true != (zza4 instanceof Object)) {
                        zza4 = null;
                    }
                    if (zza4 != null) {
                        try {
                            Array.set(zza2, intValue, zza4);
                            return;
                        } catch (Exception e10) {
                            if (e10 instanceof ArrayIndexOutOfBoundsException) {
                                throw new zzae(4, 22, e10);
                            }
                            throw new zzae(4, 25, e10);
                        }
                    }
                    throw new zzae(4, 5, null);
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
