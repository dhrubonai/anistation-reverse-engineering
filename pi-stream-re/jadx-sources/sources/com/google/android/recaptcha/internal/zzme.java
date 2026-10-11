package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzme {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;

    static {
        zzia zzi = zzib.zzi();
        zzi.zze(-315576000000L);
        zzi.zzd(-999999999);
        zza = (zzib) zzi.zzj();
        zzia zzi2 = zzib.zzi();
        zzi2.zze(315576000000L);
        zzi2.zzd(999999999);
        zzb = (zzib) zzi2.zzj();
        zzia zzi3 = zzib.zzi();
        zzi3.zze(0L);
        zzi3.zzd(0);
        zzc = (zzib) zzi3.zzj();
    }

    public static zzib zza(long j4) {
        int i10 = (int) (j4 % 1000000000);
        long j10 = j4 / 1000000000;
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            j10 = zzgb.zza(j10, i10 / 1000000000);
            i10 %= 1000000000;
        }
        if (j10 > 0 && i10 < 0) {
            i10 += 1000000000;
            j10--;
        }
        if (j10 < 0 && i10 > 0) {
            i10 -= 1000000000;
            j10++;
        }
        zzia zzi = zzib.zzi();
        zzi.zze(j10);
        zzi.zzd(i10);
        zzib zzibVar = (zzib) zzi.zzj();
        long zzg = zzibVar.zzg();
        int zzf = zzibVar.zzf();
        if (zzg >= -315576000000L && zzg <= 315576000000L && zzf >= -999999999 && zzf < 1000000000 && ((zzg >= 0 && zzf >= 0) || (zzg <= 0 && zzf <= 0))) {
            return zzibVar;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(zzg), Integer.valueOf(zzf)));
    }
}
