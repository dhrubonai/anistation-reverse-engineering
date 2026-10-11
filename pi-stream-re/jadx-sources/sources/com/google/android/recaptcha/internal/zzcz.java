package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class zzcz implements zzdd {
    public static final zzcz zza = new zzcz();

    private zzcz() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        int length = zzpqVarArr.length;
        Object obj = null;
        if (length != 4 && length != 5) {
            throw new zzae(4, 3, null);
        }
        Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num != null) {
            int intValue = num.intValue();
            Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
            if (true != (zza3 instanceof Integer)) {
                zza3 = null;
            }
            Integer num2 = (Integer) zza3;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                Object zza4 = zzcjVar.zzc().zza(zzpqVarArr[2]);
                if (true != (zza4 instanceof String)) {
                    zza4 = null;
                }
                String str = (String) zza4;
                if (str != null) {
                    String zza5 = zzcjVar.zzh().zza(str);
                    Object zza6 = zzcjVar.zzc().zza(zzpqVarArr[3]);
                    if (true != (zza6 instanceof String)) {
                        zza6 = null;
                    }
                    String str2 = (String) zza6;
                    if (str2 != null) {
                        String zza7 = zzcjVar.zzh().zza(str2);
                        if (length == 5) {
                            obj = zzcjVar.zzc().zza(zzpqVarArr[4]);
                        }
                        zzcg zzcgVar = new zzcg(intValue2);
                        try {
                            Class zza8 = zzci.zza(zza5);
                            zzcjVar.zzc().zzf(intValue, Proxy.newProxyInstance(zza8.getClassLoader(), new Class[]{zza8}, new zzch(zzcgVar, zza7, obj)));
                            zzcjVar.zzc().zzf(i10, zzcgVar);
                            return;
                        } catch (Exception e10) {
                            throw new zzae(6, 20, e10);
                        }
                    }
                    throw new zzae(4, 5, null);
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 5, null);
    }
}
