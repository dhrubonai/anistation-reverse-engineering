package com.google.android.recaptcha.internal;

import a3.g;

/* loaded from: classes.dex */
final class zzgq extends zzgt {
    private final int zzc;

    public zzgq(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgw.zzk(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.recaptcha.internal.zzgt, com.google.android.recaptcha.internal.zzgw
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(g.n("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(g.p("Index > length: ", i10, ", ", i11));
        }
        return this.zza[i10];
    }

    @Override // com.google.android.recaptcha.internal.zzgt, com.google.android.recaptcha.internal.zzgw
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.recaptcha.internal.zzgt
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzgt, com.google.android.recaptcha.internal.zzgw
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzgt, com.google.android.recaptcha.internal.zzgw
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }
}
