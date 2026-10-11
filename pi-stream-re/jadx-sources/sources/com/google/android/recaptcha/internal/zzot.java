package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzot extends zzit implements zzkf {
    private static final zzot zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzot zzotVar = new zzot();
        zzb = zzotVar;
        zzit.zzD(zzot.class, zzotVar);
    }

    private zzot() {
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzor zzorVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzos(zzorVar);
                }
                return new zzot();
            }
            return zzit.zzA(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
