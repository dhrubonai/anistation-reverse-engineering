package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthProvider;
import q6.g;

/* loaded from: classes.dex */
public final class zze implements Parcelable.Creator<PhoneAuthProvider.ForceResendingToken> {
    @Override // android.os.Parcelable.Creator
    public final PhoneAuthProvider.ForceResendingToken createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        while (parcel.dataPosition() < q02) {
            g.l0(parcel.readInt(), parcel);
        }
        g.w(q02, parcel);
        return new PhoneAuthProvider.ForceResendingToken();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneAuthProvider.ForceResendingToken[] newArray(int i10) {
        return new PhoneAuthProvider.ForceResendingToken[i10];
    }
}
