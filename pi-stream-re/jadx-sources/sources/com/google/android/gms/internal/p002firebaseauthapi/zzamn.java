package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
abstract class zzamn {
    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    public abstract int zza(String str, byte[] bArr, int i10, int i11);

    public abstract String zza(byte[] bArr, int i10, int i11);

    public final boolean zzb(byte[] bArr, int i10, int i11) {
        if (zza(0, bArr, i10, i11) != 0) {
            return false;
        }
        return true;
    }
}
