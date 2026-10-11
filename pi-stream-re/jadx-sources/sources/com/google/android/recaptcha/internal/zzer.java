package com.google.android.recaptcha.internal;

import a7.a;
import b7.c;
import w6.d;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzer extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzez zzb;
    int zzc;
    zzez zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzez zzezVar, e eVar) {
        super(eVar);
        this.zzb = zzezVar;
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zza = this.zzb.zza(null, 0L, this);
        if (zza == a.f156a) {
            return zza;
        }
        return new d(zza);
    }
}
