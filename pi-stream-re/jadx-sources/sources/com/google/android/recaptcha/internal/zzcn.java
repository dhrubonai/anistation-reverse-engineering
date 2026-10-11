package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcn implements zzdd {
    public static final zzcn zza = new zzcn();

    private zzcn() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        Object obj;
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
                            obj = String.valueOf(((String) zza2).charAt(intValue));
                        } else if (zza2 instanceof List) {
                            obj = ((List) zza2).get(intValue);
                        } else {
                            obj = Array.get(zza2, intValue);
                        }
                        zzcjVar.zzc().zzf(i10, obj);
                        return;
                    } catch (Exception e10) {
                        if (e10 instanceof ArrayIndexOutOfBoundsException) {
                            throw new zzae(4, 22, e10);
                        }
                        throw new zzae(4, 23, e10);
                    }
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
