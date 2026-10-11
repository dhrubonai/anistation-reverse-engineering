package com.google.android.recaptcha.internal;

import a3.g;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzgt extends zzgs {
    protected final byte[] zza;

    public zzgt(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgw) || zzd() != ((zzgw) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzgt) {
            zzgt zzgtVar = (zzgt) obj;
            int zzl = zzl();
            int zzl2 = zzgtVar.zzl();
            if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= zzgtVar.zzd()) {
                if (zzd <= zzgtVar.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgtVar.zza;
                    zzgtVar.zzc();
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
                throw new IllegalArgumentException(g.p("Ran off end of other: 0, ", zzd, ", ", zzgtVar.zzd()));
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public final int zzf(int i10, int i11, int i12) {
        return zzjc.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public final zzgw zzg(int i10, int i11) {
        int zzk = zzgw.zzk(0, i11, zzd());
        if (zzk == 0) {
            return zzgw.zzb;
        }
        return new zzgq(this.zza, 0, zzk);
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public final void zzi(zzgm zzgmVar) {
        ((zzhe) zzgmVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.recaptcha.internal.zzgw
    public final boolean zzj() {
        return zzma.zzf(this.zza, 0, zzd());
    }
}
