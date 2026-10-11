package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzahd;
import com.google.android.gms.internal.p002firebaseauthapi.zzahf;
import java.io.IOException;
import java.io.OutputStream;
import r.f;

/* loaded from: classes.dex */
public abstract class zzahd<MessageType extends zzahd<MessageType, BuilderType>, BuilderType extends zzahf<MessageType, BuilderType>> implements zzakk {
    protected int zza = 0;

    public int zza(zzalc zzalcVar) {
        int zzh = zzh();
        if (zzh != -1) {
            return zzh;
        }
        int zza = zzalcVar.zza(this);
        zzb(zza);
        return zza;
    }

    public void zzb(int i10) {
        throw new UnsupportedOperationException();
    }

    public int zzh() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final zzahm zzi() {
        try {
            zzahv zzc = zzahm.zzc(zzk());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e10) {
            throw new RuntimeException(f.e("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final byte[] zzj() {
        try {
            byte[] bArr = new byte[zzk()];
            zzaii zzb = zzaii.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(f.e("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public final void zza(OutputStream outputStream) {
        zzaii zza = zzaii.zza(outputStream, zzaii.zzd(zzk()));
        zza(zza);
        zza.zzc();
    }
}
