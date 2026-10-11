package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
abstract class zzamb<T, B> {
    public abstract int zza(T t9);

    public abstract B zza();

    public abstract T zza(T t9, T t10);

    public abstract void zza(B b10, int i10, int i11);

    public abstract void zza(B b10, int i10, long j4);

    public abstract void zza(B b10, int i10, zzahm zzahmVar);

    public abstract void zza(B b10, int i10, T t9);

    public abstract void zza(T t9, zzanb zzanbVar);

    public abstract boolean zza(zzald zzaldVar);

    public final boolean zza(B b10, zzald zzaldVar) {
        int zzd = zzaldVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzb(b10, i10, zzaldVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zza((zzamb<T, B>) b10, i10, zzaldVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zza((zzamb<T, B>) b10, i10, zzaldVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 == 5) {
                zza((zzamb<T, B>) b10, i10, zzaldVar.zzf());
                return true;
            }
            throw zzajj.zza();
        }
        B zza = zza();
        int i12 = 4 | (i10 << 3);
        while (zzaldVar.zzc() != Integer.MAX_VALUE && zza((zzamb<T, B>) zza, zzaldVar)) {
        }
        if (i12 == zzaldVar.zzd()) {
            zza((zzamb<T, B>) b10, i10, (int) zze(zza));
            return true;
        }
        throw zzajj.zzb();
    }

    public abstract int zzb(T t9);

    public abstract void zzb(B b10, int i10, long j4);

    public abstract void zzb(T t9, zzanb zzanbVar);

    public abstract void zzb(Object obj, B b10);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t9);

    public abstract T zzd(Object obj);

    public abstract T zze(B b10);

    public abstract void zzf(Object obj);
}
