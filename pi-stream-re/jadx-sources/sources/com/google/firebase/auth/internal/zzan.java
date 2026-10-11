package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import q6.g;

/* loaded from: classes.dex */
public final class zzan implements Parcelable.Creator<zzal> {
    @Override // android.os.Parcelable.Creator
    public final zzal createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        ArrayList arrayList = null;
        zzam zzamVar = null;
        String str = null;
        com.google.firebase.auth.zzd zzdVar = null;
        zzaf zzafVar = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    arrayList = g.t(parcel, readInt, PhoneMultiFactorInfo.CREATOR);
                    break;
                case 2:
                    zzamVar = (zzam) g.o(parcel, readInt, zzam.CREATOR);
                    break;
                case 3:
                    str = g.p(readInt, parcel);
                    break;
                case 4:
                    zzdVar = (com.google.firebase.auth.zzd) g.o(parcel, readInt, com.google.firebase.auth.zzd.CREATOR);
                    break;
                case 5:
                    zzafVar = (zzaf) g.o(parcel, readInt, zzaf.CREATOR);
                    break;
                case 6:
                    arrayList2 = g.t(parcel, readInt, TotpMultiFactorInfo.CREATOR);
                    break;
                default:
                    g.l0(readInt, parcel);
                    break;
            }
        }
        g.w(q02, parcel);
        return new zzal(arrayList, zzamVar, str, zzdVar, zzafVar, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal[] newArray(int i10) {
        return new zzal[i10];
    }
}
