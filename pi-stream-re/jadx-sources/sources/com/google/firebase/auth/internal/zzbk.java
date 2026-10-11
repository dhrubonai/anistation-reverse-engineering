package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzafq;
import com.google.android.gms.internal.p002firebaseauthapi.zzagq;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w7.b;

/* loaded from: classes.dex */
public final class zzbk {
    public static MultiFactorInfo zza(zzafq zzafqVar) {
        if (zzafqVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafqVar.zze())) {
            String zzd = zzafqVar.zzd();
            String zzc = zzafqVar.zzc();
            long zza = zzafqVar.zza();
            String zze = zzafqVar.zze();
            b.o(zze);
            return new PhoneMultiFactorInfo(zzd, zzc, zza, zze);
        }
        if (zzafqVar.zzb() == null) {
            return null;
        }
        String zzd2 = zzafqVar.zzd();
        String zzc2 = zzafqVar.zzc();
        long zza2 = zzafqVar.zza();
        zzagq zzb = zzafqVar.zzb();
        b.r(zzb, "totpInfo cannot be null.");
        return new TotpMultiFactorInfo(zzd2, zzc2, zza2, zzb);
    }

    public static List<MultiFactorInfo> zza(List<zzafq> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzafq> it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo zza = zza(it.next());
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
