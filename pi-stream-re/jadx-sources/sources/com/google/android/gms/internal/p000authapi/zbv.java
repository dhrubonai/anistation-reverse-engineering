package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import q6.g;

/* loaded from: classes.dex */
public final class zbv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                g.l0(readInt, parcel);
            } else {
                credential = (Credential) g.o(parcel, readInt, Credential.CREATOR);
            }
        }
        g.w(q02, parcel);
        return new zbu(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zbu[i10];
    }
}
