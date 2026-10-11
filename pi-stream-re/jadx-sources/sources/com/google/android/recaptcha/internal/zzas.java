package com.google.android.recaptcha.internal;

import a7.a;
import b7.c;
import w6.d;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzas extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;
    zzaw zzd;
    zzbd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(zzaw zzawVar, e eVar) {
        super(eVar);
        this.zzb = zzawVar;
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        Object zzk;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzk = this.zzb.zzk(null, 0L, this);
        if (zzk == a.f156a) {
            return zzk;
        }
        return new d(zzk);
    }
}
