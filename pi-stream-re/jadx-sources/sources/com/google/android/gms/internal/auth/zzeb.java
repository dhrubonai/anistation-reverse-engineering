package com.google.android.gms.internal.auth;

import a3.g;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzeb extends zzea {
    protected final byte[] zza;

    public zzeb(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzee) || zzd() != ((zzee) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzeb) {
            zzeb zzebVar = (zzeb) obj;
            int zzj = zzj();
            int zzj2 = zzebVar.zzj();
            if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzebVar.zzd()) {
                if (zzd <= zzebVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzebVar.zza;
                    zzebVar.zzc();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < zzd) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(g.p("Ran off end of other: 0, ", zzd, ", ", zzebVar.zzd()));
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final int zze(int i10, int i11, int i12) {
        return zzez.zzd(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final zzee zzf(int i10, int i11) {
        int zzi = zzee.zzi(0, i11, zzd());
        if (zzi == 0) {
            return zzee.zzb;
        }
        return new zzdy(this.zza, 0, zzi);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzee
    public final boolean zzh() {
        return zzhm.zzd(this.zza, 0, zzd());
    }
}
