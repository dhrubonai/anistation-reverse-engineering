package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import q6.g;

/* loaded from: classes.dex */
public final class zzap implements Parcelable.Creator<zzam> {
    @Override // android.os.Parcelable.Creator
    public final zzam createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        zzaf zzafVar = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    if (c6 != 3) {
                        if (c6 != 4) {
                            if (c6 != 5) {
                                g.l0(readInt, parcel);
                            } else {
                                zzafVar = (zzaf) g.o(parcel, readInt, zzaf.CREATOR);
                            }
                        } else {
                            arrayList2 = g.t(parcel, readInt, TotpMultiFactorInfo.CREATOR);
                        }
                    } else {
                        arrayList = g.t(parcel, readInt, PhoneMultiFactorInfo.CREATOR);
                    }
                } else {
                    str2 = g.p(readInt, parcel);
                }
            } else {
                str = g.p(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new zzam(str, str2, arrayList, arrayList2, zzafVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam[] newArray(int i10) {
        return new zzam[i10];
    }
}
