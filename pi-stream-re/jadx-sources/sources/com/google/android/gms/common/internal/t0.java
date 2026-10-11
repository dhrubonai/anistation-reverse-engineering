package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public abstract class t0 extends zzb implements e0 {
    public t0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((b5.l) this).f1531a);
        } else {
            k5.a aVar = new k5.a(((b5.l) this).b());
            parcel2.writeNoException();
            zzc.zze(parcel2, aVar);
        }
        return true;
    }
}
