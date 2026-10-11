package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzhw extends zzit implements zzkf {
    private static final zzhw zzb;
    private int zzd;
    private boolean zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzhw zzhwVar = new zzhw();
        zzb = zzhwVar;
        zzit.zzD(zzhw.class, zzhwVar);
    }

    private zzhw() {
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 1;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (obj == null) {
                                b10 = 0;
                            }
                            this.zzg = b10;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzhv(null);
                }
                return new zzhw();
            }
            return new zzkp(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
