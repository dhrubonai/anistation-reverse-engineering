package com.google.android.recaptcha.internal;

import a7.a;
import b7.c;
import w6.d;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzar extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaw zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzaw zzawVar, e eVar) {
        super(eVar);
        this.zzb = zzawVar;
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo3executegIAlus = this.zzb.mo3executegIAlus(null, this);
        if (mo3executegIAlus == a.f156a) {
            return mo3executegIAlus;
        }
        return new d(mo3executegIAlus);
    }
}
