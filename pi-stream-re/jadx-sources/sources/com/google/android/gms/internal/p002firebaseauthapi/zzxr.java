package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import r.f;

/* loaded from: classes.dex */
public final class zzxr {
    private final byte[] zza;

    private zzxr(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxr)) {
            return false;
        }
        return Arrays.equals(((zzxr) obj).zza, this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return f.e("Bytes(", zzxh.zza(this.zza), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static zzxr zza(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length > bArr.length) {
                length = bArr.length;
            }
            return new zzxr(bArr, 0, length);
        }
        throw new NullPointerException("data must be non-null");
    }
}
