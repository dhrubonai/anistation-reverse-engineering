package com.google.android.recaptcha.internal;

import a7.a;
import b7.c;
import w6.d;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzap extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzaw zzawVar, e eVar) {
        super(eVar);
        this.zzb = zzawVar;
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo2execute0E7RQCE = this.zzb.mo2execute0E7RQCE(null, 0L, this);
        if (mo2execute0E7RQCE == a.f156a) {
            return mo2execute0E7RQCE;
        }
        return new d(mo2execute0E7RQCE);
    }
}
