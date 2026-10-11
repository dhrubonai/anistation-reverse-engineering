package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class zzbj implements zzce {
    private final OutputStream zza;

    private zzbj(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzce zza(OutputStream outputStream) {
        return new zzbj(outputStream);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzty zztyVar) {
        try {
            ((zzty) ((zzaja) zztyVar.zzm().zza().zzf())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzvh zzvhVar) {
        try {
            zzvhVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
