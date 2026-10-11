package com.google.android.recaptcha.internal;

import a7.a;
import b7.c;
import w6.d;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzd extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzg zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, e eVar) {
        super(eVar);
        this.zzb = zzgVar;
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzb = this.zzb.zzb(0L, null, this);
        if (zzb == a.f156a) {
            return zzb;
        }
        return new d(zzb);
    }
}
