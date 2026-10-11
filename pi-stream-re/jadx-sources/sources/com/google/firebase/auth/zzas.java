package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzas implements Parcelable.Creator<PlayGamesAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final PlayGamesAuthCredential createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                g.l0(readInt, parcel);
            } else {
                str = g.p(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new PlayGamesAuthCredential(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlayGamesAuthCredential[] newArray(int i10) {
        return new PlayGamesAuthCredential[i10];
    }
}
