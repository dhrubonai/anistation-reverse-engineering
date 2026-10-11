package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzafs implements Parcelable.Creator<zzafp> {
    @Override // android.os.Parcelable.Creator
    public final zzafp createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    if (c6 != 3) {
                        g.l0(readInt, parcel);
                    } else {
                        str3 = g.p(readInt, parcel);
                    }
                } else {
                    str2 = g.p(readInt, parcel);
                }
            } else {
                str = g.p(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new zzafp(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafp[] newArray(int i10) {
        return new zzafp[i10];
    }
}
