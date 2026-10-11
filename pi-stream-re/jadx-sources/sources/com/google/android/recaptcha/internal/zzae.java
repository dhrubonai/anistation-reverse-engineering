package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzae extends Exception {
    private final Throwable zza;
    private final zzpg zzb;
    private final int zzc;
    private final int zzd;

    public zzae(int i10, int i11, Throwable th) {
        this.zzc = i10;
        this.zzd = i11;
        this.zza = th;
        zzpg zzf = zzph.zzf();
        zzf.zze(i11);
        zzf.zzp(i10);
        this.zzb = zzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zzpg zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
