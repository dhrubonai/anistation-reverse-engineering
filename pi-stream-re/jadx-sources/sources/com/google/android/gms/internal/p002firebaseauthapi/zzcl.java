package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzcl implements Comparable<zzcl> {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzcl zzclVar) {
        zzcl zzclVar2 = zzclVar;
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = zzclVar2.zza;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr3 = this.zza;
            if (i10 >= bArr3.length) {
                return 0;
            }
            byte b10 = bArr3[i10];
            byte b11 = zzclVar2.zza[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcl)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzcl) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzxh.zza(this.zza);
    }

    private zzcl(byte[] bArr) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }
}
