package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z9 = false;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            zzc.zzc(parcel);
            zzc(status);
        } else {
            int i12 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzc(parcel);
            if (readInt != 0) {
                z9 = true;
            }
            zzb(z9);
        }
        parcel2.writeNoException();
        return true;
    }
}
