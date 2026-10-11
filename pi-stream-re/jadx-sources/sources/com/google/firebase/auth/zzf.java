package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import q6.g;

/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator<zzd> {
    @Override // android.os.Parcelable.Creator
    public final zzd createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzags zzagsVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = g.p(readInt, parcel);
                    break;
                case 2:
                    str2 = g.p(readInt, parcel);
                    break;
                case 3:
                    str3 = g.p(readInt, parcel);
                    break;
                case 4:
                    zzagsVar = (zzags) g.o(parcel, readInt, zzags.CREATOR);
                    break;
                case 5:
                    str4 = g.p(readInt, parcel);
                    break;
                case 6:
                    str5 = g.p(readInt, parcel);
                    break;
                case zzaja.zze.zzg /* 7 */:
                    str6 = g.p(readInt, parcel);
                    break;
                default:
                    g.l0(readInt, parcel);
                    break;
            }
        }
        g.w(q02, parcel);
        return new zzd(str, str2, str3, zzagsVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzd[] newArray(int i10) {
        return new zzd[i10];
    }
}
