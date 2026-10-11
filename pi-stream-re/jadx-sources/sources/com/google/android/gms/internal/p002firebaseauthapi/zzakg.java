package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzakg implements zzakh {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final int zza(int i10, Object obj, Object obj2) {
        zzake zzakeVar = (zzake) obj;
        if (zzakeVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzakeVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final Object zzb(Object obj) {
        return zzake.zza().zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final Object zzc(Object obj) {
        ((zzake) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final Map<?, ?> zzd(Object obj) {
        return (zzake) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final Map<?, ?> zze(Object obj) {
        return (zzake) obj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final boolean zzf(Object obj) {
        if (!((zzake) obj).zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final zzakf<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakh
    public final Object zza(Object obj, Object obj2) {
        zzake zzakeVar = (zzake) obj;
        zzake zzakeVar2 = (zzake) obj2;
        if (!zzakeVar2.isEmpty()) {
            if (!zzakeVar.zzd()) {
                zzakeVar = zzakeVar.zzb();
            }
            zzakeVar.zza(zzakeVar2);
        }
        return zzakeVar;
    }
}
