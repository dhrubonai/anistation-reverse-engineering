package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
abstract class zzll {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i10, int i11);

    public abstract void zzi(Object obj, int i10, long j4);

    public abstract void zzj(Object obj, int i10, Object obj2);

    public abstract void zzk(Object obj, int i10, zzgw zzgwVar);

    public abstract void zzl(Object obj, int i10, long j4);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzmd zzmdVar);

    public abstract void zzq(Object obj, zzmd zzmdVar);

    public final boolean zzr(Object obj, zzkq zzkqVar) {
        int zzd = zzkqVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                zzh(obj, i10, zzkqVar.zzf());
                                return true;
                            }
                            throw zzje.zza();
                        }
                        return false;
                    }
                    Object zzf = zzf();
                    int i12 = i10 << 3;
                    while (zzkqVar.zzc() != Integer.MAX_VALUE && zzr(zzf, zzkqVar)) {
                    }
                    if ((4 | i12) == zzkqVar.zzd()) {
                        zzg(zzf);
                        zzj(obj, i10, zzf);
                        return true;
                    }
                    throw zzje.zzb();
                }
                zzk(obj, i10, zzkqVar.zzp());
                return true;
            }
            zzi(obj, i10, zzkqVar.zzk());
            return true;
        }
        zzl(obj, i10, zzkqVar.zzl());
        return true;
    }

    public abstract boolean zzs(zzkq zzkqVar);
}
