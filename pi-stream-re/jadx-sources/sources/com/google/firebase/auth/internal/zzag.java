package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzag implements Parcelable.Creator<zzah> {
    @Override // android.os.Parcelable.Creator
    public final zzah createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        long j4 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    g.l0(readInt, parcel);
                } else {
                    j10 = g.S(readInt, parcel);
                }
            } else {
                j4 = g.S(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new zzah(j4, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzah[] newArray(int i10) {
        return new zzah[i10];
    }
}
