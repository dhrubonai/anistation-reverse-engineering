package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p7.a0;

/* loaded from: classes.dex */
public final class zzbj extends a {
    public static final Parcelable.Creator<zzbj> CREATOR = new zzbm();
    private final List<PhoneMultiFactorInfo> zza;
    private final List<TotpMultiFactorInfo> zzb;

    public zzbj(List<PhoneMultiFactorInfo> list, List<TotpMultiFactorInfo> list2) {
        this.zza = list == null ? new ArrayList<>() : list;
        this.zzb = list2 == null ? new ArrayList<>() : list2;
    }

    public static zzbj zza(List<MultiFactorInfo> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : list) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
            } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                arrayList2.add((TotpMultiFactorInfo) multiFactorInfo);
            }
        }
        return new zzbj(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.s0(parcel, 1, this.zza, false);
        a0.s0(parcel, 2, this.zzb, false);
        a0.u0(t02, parcel);
    }

    public final List<MultiFactorInfo> zza() {
        ArrayList arrayList = new ArrayList();
        Iterator<PhoneMultiFactorInfo> it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<TotpMultiFactorInfo> it2 = this.zzb.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }
}
