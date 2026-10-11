package com.google.android.recaptcha.internal;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzdo implements zzdd {
    public static final zzdo zza = new zzdo();

    private zzdo() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        Object array;
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
                    if (zza2 instanceof Integer) {
                        array = Integer.valueOf(((Number) zza2).intValue() * intValue);
                    } else if (zza2 instanceof int[]) {
                        int[] iArr = (int[]) zza2;
                        ArrayList arrayList = new ArrayList(iArr.length);
                        for (int i11 : iArr) {
                            arrayList.add(Integer.valueOf(i11 * intValue));
                        }
                        array = arrayList.toArray(new Integer[0]);
                    } else {
                        throw new zzae(4, 5, null);
                    }
                    zzcjVar.zzc().zzf(i10, array);
                    return;
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
