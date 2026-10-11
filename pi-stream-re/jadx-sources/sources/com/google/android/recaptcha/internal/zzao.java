package com.google.android.recaptcha.internal;

import b7.c;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzao extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;
    zzaw zzd;
    zzbb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzaw zzawVar, e eVar) {
        super(eVar);
        this.zzb = zzawVar;
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        Object zzj;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzj = this.zzb.zzj(0L, null, null, this);
        return zzj;
    }
}
