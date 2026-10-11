package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import x6.i;

/* loaded from: classes.dex */
public final class zzdl implements zzdd {
    public static final zzdl zza = new zzdl();

    private zzdl() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        int length = zzpqVarArr.length;
        if (length >= 2) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Method)) {
                zza2 = null;
            }
            Method method = (Method) zza2;
            if (method != null) {
                Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
                Object[] zzh = zzcjVar.zzc().zzh(i.o1(zzpqVarArr).subList(2, length));
                try {
                    zzcjVar.zzc().zzf(i10, method.invoke(zza3, Arrays.copyOf(zzh, zzh.length)));
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
