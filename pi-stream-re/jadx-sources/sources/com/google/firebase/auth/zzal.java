package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzal implements Parcelable.Creator<GoogleAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final GoogleAuthCredential createFromParcel(Parcel parcel) {
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
        return new GoogleAuthCredential(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleAuthCredential[] newArray(int i10) {
        return new GoogleAuthCredential[i10];
    }
}
