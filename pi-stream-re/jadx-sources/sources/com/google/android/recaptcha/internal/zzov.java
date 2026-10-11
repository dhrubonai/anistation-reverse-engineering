package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzov extends zzit implements zzkf {
    private static final zzov zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzov zzovVar = new zzov();
        zzb = zzovVar;
        zzit.zzD(zzov.class, zzovVar);
    }

    private zzov() {
    }

    public static zzou zzf() {
        return (zzou) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzov zzovVar, String str) {
        str.getClass();
        zzovVar.zzd = str;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzou(null);
                }
                return new zzov();
            }
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
