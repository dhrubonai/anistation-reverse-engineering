package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import r.f;

/* loaded from: classes.dex */
public final class zzfx implements zzbh {
    private static final byte[] zza = new byte[0];
    private static final Set<String> zzb;
    private final zzvd zzc;
    private final zzbh zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(zzcx.zzb);
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add(zzcx.zza);
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzfx(zzvd zzvdVar, zzbh zzbhVar) {
        if (zzb.contains(zzvdVar.zzf())) {
            this.zzc = zzvdVar;
            this.zzd = zzbhVar;
            return;
        }
        throw new IllegalArgumentException(f.e("Unsupported DEK key type: ", zzvdVar.zzf(), ". Only Tink AEAD key types are supported."));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 > 0 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                wrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((zzbh) zzcu.zza(this.zzc.zzf(), this.zzd.zza(bArr3, zza), zzbh.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] zzg = zzcu.zza(this.zzc).zze().zzg();
        byte[] zzb2 = this.zzd.zzb(zzg, zza);
        byte[] zzb3 = ((zzbh) zzcu.zza(this.zzc.zzf(), zzg, zzbh.class)).zzb(bArr, bArr2);
        return ByteBuffer.allocate(zzb2.length + 4 + zzb3.length).putInt(zzb2.length).put(zzb2).put(zzb3).array();
    }
}
