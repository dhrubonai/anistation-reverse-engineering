package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzpl extends zzit implements zzkf {
    private static final zzpl zzb;
    private zzjb zzd = zzit.zzx();
    private int zze;

    static {
        zzpl zzplVar = new zzpl();
        zzb = zzplVar;
        zzit.zzD(zzpl.class, zzplVar);
    }

    private zzpl() {
    }

    public static zzpi zzf() {
        return (zzpi) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzpl zzplVar, zzpk zzpkVar) {
        zzpkVar.getClass();
        zzplVar.zzk();
        zzplVar.zzd.add(zzpkVar);
    }

    public static /* synthetic */ void zzj(zzpl zzplVar, Iterable iterable) {
        zzplVar.zzk();
        zzgf.zzc(iterable, zzplVar.zzd);
    }

    private final void zzk() {
        zzjb zzjbVar = this.zzd;
        if (!zzjbVar.zzc()) {
            this.zzd = zzit.zzy(zzjbVar);
        }
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
                    return new zzpi(null);
                }
                return new zzpl();
            }
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zzd", zzpk.class, "zze"});
        }
        return (byte) 1;
    }
}
