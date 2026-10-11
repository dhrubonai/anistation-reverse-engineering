package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzar implements Parcelable.Creator<PhoneMultiFactorInfo> {
    @Override // android.os.Parcelable.Creator
    public final PhoneMultiFactorInfo createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
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
                            str3 = g.p(readInt, parcel);
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
        return new PhoneMultiFactorInfo(str, str2, j4, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneMultiFactorInfo[] newArray(int i10) {
        return new PhoneMultiFactorInfo[i10];
    }
}
