package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import x6.i;

/* loaded from: classes.dex */
public final class zzdm implements zzdd {
    public static final zzdm zza = new zzdm();

    private zzdm() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        int length = zzpqVarArr.length;
        if (length != 0) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Method)) {
                zza2 = null;
            }
            Method method = (Method) zza2;
            if (method != null) {
                Object[] zzh = zzcjVar.zzc().zzh(i.o1(zzpqVarArr).subList(1, length));
                try {
                    zzcjVar.zzc().zzf(i10, method.invoke(null, Arrays.copyOf(zzh, zzh.length)));
                    return;
                } catch (Exception e10) {
                    throw new zzae(6, 15, e10);
                }
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
