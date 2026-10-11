package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzap implements Parcelable.Creator<PhoneAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final PhoneAuthCredential createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z9 = false;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    if (c6 != 4) {
                        if (c6 != 5) {
                            if (c6 != 6) {
                                g.l0(readInt, parcel);
                            } else {
                                str4 = g.p(readInt, parcel);
                            }
                        } else {
                            z9 = g.N(readInt, parcel);
                        }
                    } else {
                        str3 = g.p(readInt, parcel);
                    }
                } else {
                    str2 = g.p(readInt, parcel);
                }
            } else {
                str = g.p(readInt, parcel);
            }
        }
        g.w(q02, parcel);
        return new PhoneAuthCredential(str, str2, str3, z9, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneAuthCredential[] newArray(int i10) {
        return new PhoneAuthCredential[i10];
    }
}
