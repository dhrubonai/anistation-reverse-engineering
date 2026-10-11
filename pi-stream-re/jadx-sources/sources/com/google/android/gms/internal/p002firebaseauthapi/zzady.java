package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import e5.a;
import java.util.HashMap;
import java.util.Iterator;
import p7.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzady extends zzacf {
    private final String zza;
    private final /* synthetic */ zzadt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzady(zzadt zzadtVar, zzacf zzacfVar, String str) {
        super(zzacfVar);
        this.zzb = zzadtVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacf
    public final void zza(Status status) {
        a aVar;
        HashMap hashMap;
        aVar = zzadt.zza;
        aVar.c("SMS verification code request failed: " + a0.D(status.f2361b) + " " + status.f2362c, new Object[0]);
        hashMap = this.zzb.zzd;
        zzaea zzaeaVar = (zzaea) hashMap.get(this.zza);
        if (zzaeaVar == null) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacf
    public final void zzb(String str) {
        a aVar;
        HashMap hashMap;
        aVar = zzadt.zza;
        aVar.a("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzaea zzaeaVar = (zzaea) hashMap.get(this.zza);
        if (zzaeaVar == null) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzaeaVar.zzg = true;
        zzaeaVar.zzd = str;
        if (zzaeaVar.zza <= 0) {
            this.zzb.zzb(this.zza);
        } else if (!zzaeaVar.zzc) {
            this.zzb.zze(this.zza);
        } else if (!zzah.zzc(zzaeaVar.zze)) {
            zzadt.zza(this.zzb, this.zza);
        }
    }
}
