package com.google.android.recaptcha;

import a7.a;
import b7.c;
import w6.d;
import z6.e;

/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, e eVar) {
        super(eVar);
        this.zzb = recaptcha;
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m1getClientBWLJW6A = this.zzb.m1getClientBWLJW6A(null, null, 0L, this);
        if (m1getClientBWLJW6A == a.f156a) {
            return m1getClientBWLJW6A;
        }
        return new d(m1getClientBWLJW6A);
    }
}
