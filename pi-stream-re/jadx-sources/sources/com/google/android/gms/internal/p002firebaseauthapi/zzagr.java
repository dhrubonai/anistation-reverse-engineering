package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import q6.g;

/* loaded from: classes.dex */
public final class zzagr implements Parcelable.Creator<zzags> {
    @Override // android.os.Parcelable.Creator
    public final zzags createFromParcel(Parcel parcel) {
        int q02 = g.q0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = g.p(readInt, parcel);
                    break;
                case 3:
                    str2 = g.p(readInt, parcel);
                    break;
                case 4:
                    str3 = g.p(readInt, parcel);
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
                case '\b':
                    str7 = g.p(readInt, parcel);
                    break;
                case '\t':
                    str8 = g.p(readInt, parcel);
                    break;
                case '\n':
                    z9 = g.N(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    z10 = g.N(readInt, parcel);
                    break;
                case '\f':
                    str9 = g.p(readInt, parcel);
                    break;
                case '\r':
                    str10 = g.p(readInt, parcel);
                    break;
                case 14:
                    str11 = g.p(readInt, parcel);
                    break;
                case 15:
                    str12 = g.p(readInt, parcel);
                    break;
                case 16:
                    z11 = g.N(readInt, parcel);
                    break;
                case 17:
                    str13 = g.p(readInt, parcel);
                    break;
                default:
                    g.l0(readInt, parcel);
                    break;
            }
        }
        g.w(q02, parcel);
        return new zzags(str, str2, str3, str4, str5, str6, str7, str8, z9, z10, str9, str10, str11, str12, z11, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzags[] newArray(int i10) {
        return new zzags[i10];
    }
}
