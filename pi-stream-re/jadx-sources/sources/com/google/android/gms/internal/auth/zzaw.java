package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    if (c6 != 3) {
                        g.l0(readInt, parcel);
                    } else {
                        i11 = g.Q(readInt, parcel);
                    }
                } else {
                    str = g.p(readInt, parcel);
                }
            } else {
                i10 = g.Q(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new zzav(i10, str, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzav[i10];
    }
}
