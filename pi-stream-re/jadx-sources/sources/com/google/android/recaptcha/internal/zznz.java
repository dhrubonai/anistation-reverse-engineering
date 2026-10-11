package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zznz extends zzit implements zzkf {
    private static final zznz zzb;
    private int zzd;
    private zznx zze;
    private zznx zzf;

    static {
        zznz zznzVar = new zznz();
        zzb = zznzVar;
        zzit.zzD(zznz.class, zznzVar);
    }

    private zznz() {
    }

    public static zznz zzj(byte[] bArr) {
        return (zznz) zzit.zzu(zzb, bArr);
    }

    public final zznx zzf() {
        zznx zznxVar = this.zze;
        if (zznxVar == null) {
            return zznx.zzg();
        }
        return zznxVar;
    }

    public final zznx zzg() {
        zznx zznxVar = this.zzf;
        if (zznxVar == null) {
            return zznx.zzg();
        }
        return zznxVar;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zznv zznvVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzny(zznvVar);
                }
                return new zznz();
            }
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
