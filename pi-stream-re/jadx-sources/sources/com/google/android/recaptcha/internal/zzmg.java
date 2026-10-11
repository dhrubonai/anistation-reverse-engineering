package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzmg {
    public static final zzlj zza;
    public static final zzlj zzb;
    public static final zzlj zzc;
    private static final ThreadLocal zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;

    static {
        zzli zzi = zzlj.zzi();
        zzi.zze(-62135596800L);
        zzi.zzd(0);
        zza = (zzlj) zzi.zzj();
        zzli zzi2 = zzlj.zzi();
        zzi2.zze(253402300799L);
        zzi2.zzd(999999999);
        zzb = (zzlj) zzi2.zzj();
        zzli zzi3 = zzlj.zzi();
        zzi3.zze(0L);
        zzi3.zzd(0);
        zzc = (zzlj) zzi3.zzj();
        zzd = new zzmf();
        zze = zzd("now");
        zzf = zzd("getEpochSecond");
        zzg = zzd("getNano");
    }

    public static zzlj zza(zzlj zzljVar) {
        long zzg2 = zzljVar.zzg();
        int zzf2 = zzljVar.zzf();
        if (zzg2 >= -62135596800L && zzg2 <= 253402300799L && zzf2 >= 0 && zzf2 < 1000000000) {
            return zzljVar;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzg2), Integer.valueOf(zzf2)));
    }

    public static zzlj zzb(long j4) {
        int i10 = (int) ((j4 % 1000) * 1000000);
        long j10 = j4 / 1000;
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            j10 = zzgb.zza(j10, i10 / 1000000000);
            i10 %= 1000000000;
        }
        if (i10 < 0) {
            i10 += 1000000000;
            j10 = zzgb.zzb(j10, 1L);
        }
        zzli zzi = zzlj.zzi();
        zzi.zze(j10);
        zzi.zzd(i10);
        zzlj zzljVar = (zzlj) zzi.zzj();
        zza(zzljVar);
        return zzljVar;
    }

    public static String zzc(zzlj zzljVar) {
        String format;
        zza(zzljVar);
        long zzg2 = zzljVar.zzg();
        int zzf2 = zzljVar.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zzd.get()).format(new Date(zzg2 * 1000)));
        if (zzf2 != 0) {
            sb.append(".");
            if (zzf2 % 1000000 == 0) {
                format = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zzf2 / 1000000));
            } else if (zzf2 % 1000 == 0) {
                format = String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zzf2 / 1000));
            } else {
                format = String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zzf2));
            }
            sb.append(format);
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
