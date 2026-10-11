package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import q6.g;

/* loaded from: classes.dex */
public final class zzc implements Parcelable.Creator<ActionCodeSettings> {
    @Override // android.os.Parcelable.Creator
    public final ActionCodeSettings createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z9 = false;
        boolean z10 = false;
        int i10 = 0;
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
                    str4 = g.p(readInt, parcel);
                    break;
                case 5:
                    z9 = g.N(readInt, parcel);
                    break;
                case 6:
                    str5 = g.p(readInt, parcel);
                    break;
                case zzaja.zze.zzg /* 7 */:
                    z10 = g.N(readInt, parcel);
                    break;
                case '\b':
                    str6 = g.p(readInt, parcel);
                    break;
                case '\t':
                    i10 = g.Q(readInt, parcel);
                    break;
                case '\n':
                    str7 = g.p(readInt, parcel);
                    break;
                default:
                    g.l0(readInt, parcel);
                    break;
            }
        }
        g.w(q02, parcel);
        return new ActionCodeSettings(str, str2, str3, str4, z9, str5, z10, str6, i10, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActionCodeSettings[] newArray(int i10) {
        return new ActionCodeSettings[i10];
    }
}
