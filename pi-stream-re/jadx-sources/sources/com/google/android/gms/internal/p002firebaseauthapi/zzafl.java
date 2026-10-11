package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzafl implements Parcelable.Creator<zzafm> {
    @Override // android.os.Parcelable.Creator
    public final zzafm createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 2) {
                if (c6 != 3) {
                    if (c6 != 4) {
                        if (c6 != 5) {
                            if (c6 != 6) {
                                g.l0(readInt, parcel);
                            } else {
                                l11 = g.T(readInt, parcel);
                            }
                        } else {
                            str3 = g.p(readInt, parcel);
                        }
                    } else {
                        l10 = g.T(readInt, parcel);
                    }
                } else {
                    str2 = g.p(readInt, parcel);
                }
            } else {
                str = g.p(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new zzafm(str, str2, l10, str3, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzafm[] newArray(int i10) {
        return new zzafm[i10];
    }
}
