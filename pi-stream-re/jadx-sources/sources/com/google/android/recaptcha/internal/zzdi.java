package com.google.android.recaptcha.internal;

import java.util.Arrays;
import r6.h0;
import x6.i;

/* loaded from: classes.dex */
public final class zzdi implements zzdd {
    public static final zzdi zza = new zzdi();

    private zzdi() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        Class<?> cls;
        int length = zzpqVarArr.length;
        if (length >= 2) {
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
                    String zza4 = zzcjVar.zzh().zza(str);
                    if (!h0.g(zza4, "forName")) {
                        Class[] zzg = zzcjVar.zzc().zzg(i.o1(zzpqVarArr).subList(2, length));
                        try {
                            zzcjVar.zzc().zzf(i10, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzg, zzg.length)));
                            return;
                        } catch (Exception e10) {
                            throw new zzae(6, 13, e10);
                        }
                    }
                    throw new zzae(6, 48, null);
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
