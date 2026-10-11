package com.google.android.recaptcha.internal;

import o7.j;

/* loaded from: classes.dex */
public final class zzu implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + j.u1(String.valueOf(this.zzb / this.zza), 10) + " us| maxExecutionTime: " + j.u1(String.valueOf(this.zzc), 10) + " us| totalTime: " + j.u1(String.valueOf(this.zzb), 10) + " us| #Usages: " + j.u1(String.valueOf(this.zza), 5);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzu zzuVar) {
        Long valueOf = Long.valueOf(this.zzb);
        Long valueOf2 = Long.valueOf(zzuVar.zzb);
        if (valueOf == valueOf2) {
            return 0;
        }
        if (valueOf == null) {
            return -1;
        }
        if (valueOf2 == null) {
            return 1;
        }
        return valueOf.compareTo(valueOf2);
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j4) {
        this.zzc = j4;
    }

    public final void zzf(long j4) {
        this.zzb = j4;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
