package com.google.android.gms.internal.auth;

import a3.g;

/* loaded from: classes.dex */
final class zzdy extends zzeb {
    private final int zzc;

    public zzdy(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzee.zzi(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
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

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final int zzd() {
        return this.zzc;
    }
}
