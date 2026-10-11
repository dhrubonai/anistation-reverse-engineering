package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzak implements Parcelable.Creator<GithubAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final GithubAuthCredential createFromParcel(Parcel parcel) {
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
        return new GithubAuthCredential(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GithubAuthCredential[] newArray(int i10) {
        return new GithubAuthCredential[i10];
    }
}
