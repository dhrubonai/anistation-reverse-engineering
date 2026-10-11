package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzy implements Parcelable.Creator<zzz> {
    @Override // android.os.Parcelable.Creator
    public final zzz createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        zzaf zzafVar = null;
        zzx zzxVar = null;
        com.google.firebase.auth.zzd zzdVar = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    if (c6 != 3) {
                        g.l0(readInt, parcel);
                    } else {
                        zzdVar = (com.google.firebase.auth.zzd) g.o(parcel, readInt, com.google.firebase.auth.zzd.CREATOR);
                    }
                } else {
                    zzxVar = (zzx) g.o(parcel, readInt, zzx.CREATOR);
                }
            } else {
                zzafVar = (zzaf) g.o(parcel, readInt, zzaf.CREATOR);
            }
        }
        g.w(q02, parcel);
        return new zzz(zzafVar, zzxVar, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz[] newArray(int i10) {
        return new zzz[i10];
    }
}
