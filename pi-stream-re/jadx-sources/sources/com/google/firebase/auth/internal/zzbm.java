package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import q6.g;

/* loaded from: classes.dex */
public final class zzbm implements Parcelable.Creator<zzbj> {
    @Override // android.os.Parcelable.Creator
    public final zzbj createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    g.l0(readInt, parcel);
                } else {
                    arrayList2 = g.t(parcel, readInt, TotpMultiFactorInfo.CREATOR);
                }
            } else {
                arrayList = g.t(parcel, readInt, PhoneMultiFactorInfo.CREATOR);
            }
        }
        g.w(q02, parcel);
        return new zzbj(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbj[] newArray(int i10) {
        return new zzbj[i10];
    }
}
