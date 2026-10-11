package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzahq extends zzahw {
    private final int zzc;
    private final int zzd;

    public zzahq(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzahm.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw, com.google.android.gms.internal.p002firebaseauthapi.zzahm
    public final byte zza(int i10) {
        int zzb = zzb();
        if (((zzb - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(g.n("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(g.p("Index > length: ", i10, ", ", zzb));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw, com.google.android.gms.internal.p002firebaseauthapi.zzahm
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final int zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw, com.google.android.gms.internal.p002firebaseauthapi.zzahm
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw, com.google.android.gms.internal.p002firebaseauthapi.zzahm
    public final void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, zzh(), bArr, 0, i12);
    }
}
