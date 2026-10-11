package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagq;
import q6.g;

/* loaded from: classes.dex */
public final class zzat implements Parcelable.Creator<TotpMultiFactorInfo> {
    @Override // android.os.Parcelable.Creator
    public final TotpMultiFactorInfo createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        zzagq zzagqVar = null;
        long j4 = 0;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    if (c6 != 3) {
                        if (c6 != 4) {
                            g.l0(readInt, parcel);
                        } else {
                            zzagqVar = (zzagq) g.o(parcel, readInt, zzagq.CREATOR);
                        }
                    } else {
                        j4 = g.S(readInt, parcel);
                    }
                } else {
                    str2 = g.p(readInt, parcel);
                }
            } else {
                str = g.p(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new TotpMultiFactorInfo(str, str2, j4, zzagqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TotpMultiFactorInfo[] newArray(int i10) {
        return new TotpMultiFactorInfo[i10];
    }
}
