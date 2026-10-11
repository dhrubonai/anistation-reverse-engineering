package com.google.android.recaptcha.internal;

import b7.c;
import v7.a;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzai extends c {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzam zzf;
    int zzg;
    a zzh;
    zzt zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(zzam zzamVar, e eVar) {
        super(eVar);
        this.zzf = zzamVar;
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zza(null, null, 0L, null, null, null, null, this);
    }
}
