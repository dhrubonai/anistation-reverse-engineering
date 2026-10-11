package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzafp;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.ArrayList;
import q6.g;

/* loaded from: classes.dex */
public final class zzae implements Parcelable.Creator<zzaf> {
    @Override // android.os.Parcelable.Creator
    public final zzaf createFromParcel(Parcel parcel) {
        boolean z9;
        int q02 = g.q0(parcel);
        boolean z10 = false;
        zzafm zzafmVar = null;
        zzab zzabVar = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzah zzahVar = null;
        com.google.firebase.auth.zzd zzdVar = null;
        zzbj zzbjVar = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    zzafmVar = (zzafm) g.o(parcel, readInt, zzafm.CREATOR);
                    break;
                case 2:
                    zzabVar = (zzab) g.o(parcel, readInt, zzab.CREATOR);
                    break;
                case 3:
                    str = g.p(readInt, parcel);
                    break;
                case 4:
                    str2 = g.p(readInt, parcel);
                    break;
                case 5:
                    arrayList = g.t(parcel, readInt, zzab.CREATOR);
                    break;
                case 6:
                    arrayList2 = g.r(readInt, parcel);
                    break;
                case zzaja.zze.zzg /* 7 */:
                    str3 = g.p(readInt, parcel);
                    break;
                case '\b':
                    int U = g.U(readInt, parcel);
                    if (U == 0) {
                        bool = null;
                        break;
                    } else {
                        g.v0(parcel, U, 4);
                        if (parcel.readInt() != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        bool = Boolean.valueOf(z9);
                        break;
                    }
                case '\t':
                    zzahVar = (zzah) g.o(parcel, readInt, zzah.CREATOR);
                    break;
                case '\n':
                    z10 = g.N(readInt, parcel);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    zzdVar = (com.google.firebase.auth.zzd) g.o(parcel, readInt, com.google.firebase.auth.zzd.CREATOR);
                    break;
                case '\f':
                    zzbjVar = (zzbj) g.o(parcel, readInt, zzbj.CREATOR);
                    break;
                case '\r':
                    arrayList3 = g.t(parcel, readInt, zzafp.CREATOR);
                    break;
                default:
                    g.l0(readInt, parcel);
                    break;
            }
        }
        g.w(q02, parcel);
        return new zzaf(zzafmVar, zzabVar, str, str2, arrayList, arrayList2, str3, bool, zzahVar, z10, zzdVar, zzbjVar, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaf[] newArray(int i10) {
        return new zzaf[i10];
    }
}
