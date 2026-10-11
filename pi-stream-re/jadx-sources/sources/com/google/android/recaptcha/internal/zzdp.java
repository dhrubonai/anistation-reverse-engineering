package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import x6.i;

/* loaded from: classes.dex */
public final class zzdp implements zzdd {
    public static final zzdp zza = new zzdp();

    private zzdp() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        Constructor<?> constructor;
        int length = zzpqVarArr.length;
        if (length != 0) {
            Constructor<?> zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof Constructor) {
                    constructor = zza2;
                } else {
                    constructor = zza2.getClass().getConstructor(new Class[0]);
                }
                Object[] zzh = zzcjVar.zzc().zzh(i.o1(zzpqVarArr).subList(1, length));
                try {
                    zzcjVar.zzc().zzf(i10, constructor.newInstance(Arrays.copyOf(zzh, zzh.length)));
                    return;
                } catch (Exception e10) {
                    throw new zzae(6, 14, e10);
                }
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
