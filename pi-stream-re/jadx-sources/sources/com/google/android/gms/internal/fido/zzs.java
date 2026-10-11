package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import o5.b0;
import o5.y;

/* loaded from: classes.dex */
public final class zzs extends zza {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, y yVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, yVar);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, b0 b0Var) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, b0Var);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
