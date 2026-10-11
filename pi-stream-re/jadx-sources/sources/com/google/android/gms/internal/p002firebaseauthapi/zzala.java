package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzala implements zzaki {
    private final zzakk zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzala(zzakk zzakkVar, String str, Object[] objArr) {
        this.zza = zzakkVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.zzd = i10 | (charAt2 << i11);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final zzakk zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final zzakz zzb() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return zzakz.PROTO2;
        }
        if ((i10 & 4) == 4) {
            return zzakz.EDITIONS;
        }
        return zzakz.PROTO3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaki
    public final boolean zzc() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
