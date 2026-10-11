package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class zzdu implements zzdd {
    public static final zzdu zza = new zzdu();

    private zzdu() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length == 2) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Field)) {
                zza2 = null;
            }
            Field field = (Field) zza2;
            if (field != null) {
                try {
                    field.set(null, zzcjVar.zzc().zza(zzpqVarArr[1]));
                    return;
                } catch (Exception e10) {
                    throw new zzae(6, 11, e10);
                }
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
