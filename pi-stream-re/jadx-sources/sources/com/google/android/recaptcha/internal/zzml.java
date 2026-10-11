package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzml extends zzit implements zzkf {
    private static final zzml zzb;
    private int zzd;
    private zzib zze;
    private int zzf;

    static {
        zzml zzmlVar = new zzml();
        zzb = zzmlVar;
        zzit.zzD(zzml.class, zzmlVar);
    }

    private zzml() {
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
                    return new zzmk(null);
                }
                return new zzml();
            }
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
