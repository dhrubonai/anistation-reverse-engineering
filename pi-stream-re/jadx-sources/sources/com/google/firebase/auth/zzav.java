package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzav implements Parcelable.Creator<UserProfileChangeRequest> {
    @Override // android.os.Parcelable.Creator
    public final UserProfileChangeRequest createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        boolean z9 = false;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 2) {
                if (c6 != 3) {
                    if (c6 != 4) {
                        if (c6 != 5) {
                            g.l0(readInt, parcel);
                        } else {
                            z10 = g.N(readInt, parcel);
                        }
                    } else {
                        z9 = g.N(readInt, parcel);
                    }
                } else {
                    str2 = g.p(readInt, parcel);
                }
            } else {
                str = g.p(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new UserProfileChangeRequest(str, str2, z9, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserProfileChangeRequest[] newArray(int i10) {
        return new UserProfileChangeRequest[i10];
    }
}
