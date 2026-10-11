package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzcu implements zzdd {
    public static final zzcu zza = new zzcu();

    private zzcu() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length == 2) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str2 = (String) zza3;
                if (str2 != null) {
                    zzcjVar.zzc().zzf(i10, str.concat(str2));
                    return;
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
