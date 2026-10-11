package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzau implements Parcelable.Creator<TwitterAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final TwitterAuthCredential createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    g.l0(readInt, parcel);
                } else {
                    str2 = g.p(readInt, parcel);
                }
            } else {
                str = g.p(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new TwitterAuthCredential(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TwitterAuthCredential[] newArray(int i10) {
        return new TwitterAuthCredential[i10];
    }
}
