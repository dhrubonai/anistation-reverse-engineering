package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.List;
import p7.a0;
import r.f;
import w7.b;

/* loaded from: classes.dex */
public final class zzam extends MultiFactorSession {
    public static final Parcelable.Creator<zzam> CREATOR = new zzap();
    private String zza;
    private String zzb;
    private List<PhoneMultiFactorInfo> zzc;
    private List<TotpMultiFactorInfo> zzd;
    private zzaf zze;

    private zzam() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.zza, false);
        a0.n0(parcel, 2, this.zzb, false);
        a0.s0(parcel, 3, this.zzc, false);
        a0.s0(parcel, 4, this.zzd, false);
        a0.m0(parcel, 5, this.zze, i10, false);
        a0.u0(t02, parcel);
    }

    public final zzaf zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        if (this.zza != null) {
            return true;
        }
        return false;
    }

    public zzam(String str, String str2, List<PhoneMultiFactorInfo> list, List<TotpMultiFactorInfo> list2, zzaf zzafVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = list;
        this.zzd = list2;
        this.zze = zzafVar;
    }

    public static zzam zza(String str, zzaf zzafVar) {
        b.o(str);
        zzam zzamVar = new zzam();
        zzamVar.zza = str;
        zzamVar.zze = zzafVar;
        return zzamVar;
    }

    public static zzam zza(List<MultiFactorInfo> list, String str) {
        b.s(list);
        b.o(str);
        zzam zzamVar = new zzam();
        zzamVar.zzc = new ArrayList();
        zzamVar.zzd = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : list) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzamVar.zzc.add((PhoneMultiFactorInfo) multiFactorInfo);
            } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                zzamVar.zzd.add((TotpMultiFactorInfo) multiFactorInfo);
            } else {
                throw new IllegalArgumentException(f.d("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ", multiFactorInfo.getFactorId()));
            }
        }
        zzamVar.zzb = str;
        return zzamVar;
    }
}
