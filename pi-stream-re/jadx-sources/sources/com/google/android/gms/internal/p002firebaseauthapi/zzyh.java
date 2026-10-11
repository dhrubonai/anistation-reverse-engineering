package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneMultiFactorInfo;

/* loaded from: classes.dex */
public final class zzyh {
    private PhoneMultiFactorInfo zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;

    public zzyh(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, String str2, long j4, boolean z9, boolean z10, String str3, String str4, boolean z11) {
        this.zza = phoneMultiFactorInfo;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j4;
        this.zze = z9;
        this.zzf = z10;
        this.zzg = str3;
        this.zzh = str4;
        this.zzi = z11;
    }

    public final long zza() {
        return this.zzd;
    }

    public final PhoneMultiFactorInfo zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzh;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzi;
    }
}
