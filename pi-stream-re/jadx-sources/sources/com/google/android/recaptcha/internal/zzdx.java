package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzdx implements zzdd {
    public static final zzdx zza = new zzdx();

    private zzdx() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length == 2) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof int[])) {
                zza2 = null;
            }
            int[] iArr = (int[]) zza2;
            if (iArr != null) {
                Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str = (String) zza3;
                if (str != null) {
                    zzck zzc = zzcjVar.zzc();
                    StringBuilder sb = new StringBuilder();
                    try {
                        for (int i11 : iArr) {
                            sb.append(str.charAt(i11));
                        }
                        zzc.zzf(i10, sb.toString());
                        return;
                    } catch (Exception e10) {
                        throw new zzae(4, 22, e10);
                    }
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
