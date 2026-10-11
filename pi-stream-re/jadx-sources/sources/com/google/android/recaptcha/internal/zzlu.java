package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzlu {
    final Unsafe zza;

    public zzlu(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j4);

    public abstract float zzb(Object obj, long j4);

    public abstract void zzc(Object obj, long j4, boolean z9);

    public abstract void zzd(Object obj, long j4, byte b10);

    public abstract void zze(Object obj, long j4, double d10);

    public abstract void zzf(Object obj, long j4, float f10);

    public abstract boolean zzg(Object obj, long j4);
}
