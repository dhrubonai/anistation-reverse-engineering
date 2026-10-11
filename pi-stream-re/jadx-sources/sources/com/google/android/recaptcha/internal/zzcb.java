package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Set;
import o7.j;
import r6.h0;
import x6.m;

/* loaded from: classes.dex */
public final class zzcb {
    public static final zzcb zza = new zzcb();
    private static Set zzb;
    private static Set zzc;
    private static Long zzd;
    private static int zze;

    private zzcb() {
    }

    public static final void zza(zznz zznzVar) {
        zzb = m.z0(zznzVar.zzf().zzi());
        zzc = m.z0(zznzVar.zzg().zzi());
    }

    public static final boolean zzb(String str) {
        Set set = zzb;
        if (set != null && zzc != null) {
            if (set.isEmpty()) {
                return true;
            }
            Set set2 = zzc;
            h0.r(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            if (zzc(str, set2)) {
                return false;
            }
            return zzc(str, set);
        }
        if (zzd == null) {
            zzd = Long.valueOf(System.currentTimeMillis());
        }
        zze++;
        return true;
    }

    private static final boolean zzc(String str, Set set) {
        Iterator it = j.A1(str, new char[]{'.'}).iterator();
        String str2 = "";
        while (it.hasNext()) {
            String concat = str2.concat(String.valueOf((String) it.next()));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }
}
