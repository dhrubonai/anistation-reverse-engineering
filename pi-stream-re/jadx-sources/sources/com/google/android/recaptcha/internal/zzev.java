package com.google.android.recaptcha.internal;

import a7.a;
import b7.c;
import w6.d;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzev extends c {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzez zzc;
    int zzd;
    zzez zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzez zzezVar, e eVar) {
        super(eVar);
        this.zzc = zzezVar;
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zzb = this.zzc.zzb(0L, null, this);
        if (zzb == a.f156a) {
            return zzb;
        }
        return new d(zzb);
    }
}
