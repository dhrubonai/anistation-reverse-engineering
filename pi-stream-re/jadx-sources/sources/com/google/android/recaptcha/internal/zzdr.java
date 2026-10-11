package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzdr implements zzdd {
    public static final zzdr zza = new zzdr();

    private zzdr() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length == 1) {
            zzcjVar.zzc().zzf(i10, zzcjVar.zzc().zza(zzpqVarArr[0]));
            return;
        }
        throw new zzae(4, 3, null);
    }
}
