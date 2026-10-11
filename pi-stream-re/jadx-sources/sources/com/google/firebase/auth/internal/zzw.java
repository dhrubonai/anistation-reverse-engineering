package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import q6.g;

/* loaded from: classes.dex */
public final class zzw implements Parcelable.Creator<zzx> {
    @Override // android.os.Parcelable.Creator
    public final zzx createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        boolean z9 = false;
        String str2 = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            char c6 = (char) readInt;
            if (c6 != 1) {
                if (c6 != 2) {
                    if (c6 != 3) {
                        g.l0(readInt, parcel);
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
        return new zzx(str, str2, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzx[] newArray(int i10) {
        return new zzx[i10];
    }
}
