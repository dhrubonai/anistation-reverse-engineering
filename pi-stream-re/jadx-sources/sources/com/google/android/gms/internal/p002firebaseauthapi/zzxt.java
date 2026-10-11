package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzxt {
    private final zzxr zza;

    private zzxt(zzxr zzxrVar) {
        this.zza = zzxrVar;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzxt zza(byte[] bArr, zzct zzctVar) {
        if (zzctVar != null) {
            return new zzxt(zzxr.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzxt zza(int i10) {
        return new zzxt(zzxr.zza(zzov.zza(i10)));
    }

    public final byte[] zza(zzct zzctVar) {
        if (zzctVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
