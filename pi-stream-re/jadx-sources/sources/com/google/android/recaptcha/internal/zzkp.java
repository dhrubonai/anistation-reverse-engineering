package com.google.android.recaptcha.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkp implements zzkb {
    private final zzke zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzkp(zzke zzkeVar, String str, Object[] objArr) {
        this.zza = zzkeVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            } else {
                this.zzd = i10 | (charAt2 << i12);
                return;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkb
    public final zzke zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzkb
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.recaptcha.internal.zzkb
    public final int zzc() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
