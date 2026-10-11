package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import u4.a;
import u4.b;
import u4.f;

/* loaded from: classes.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzh(status);
                return true;
            case 2:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                f fVar = (f) zzc.zza(parcel, f.CREATOR);
                zzc.zzb(parcel);
                zzf(status2, fVar);
                return true;
            case 3:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                b bVar = (b) zzc.zza(parcel, b.CREATOR);
                zzc.zzb(parcel);
                zzg(status3, bVar);
                return true;
            case 4:
                zze();
                return true;
            case 5:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzd(status4);
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(createByteArray);
                return true;
            case zzaja.zze.zzg /* 7 */:
                a aVar = (a) zzc.zza(parcel, a.CREATOR);
                zzc.zzb(parcel);
                zzc(aVar);
                return true;
            default:
                return false;
        }
    }
}
