package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzagp implements Parcelable.Creator<zzagq> {
    @Override // android.os.Parcelable.Creator
    public final zzagq createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        while (parcel.dataPosition() < q02) {
            g.l0(parcel.readInt(), parcel);
        }
        g.w(q02, parcel);
        return new zzagq();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagq[] newArray(int i10) {
        return new zzagq[i10];
    }
}
