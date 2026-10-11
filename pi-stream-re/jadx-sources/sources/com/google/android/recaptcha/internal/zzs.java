package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import h7.p;
import r6.h0;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzs extends h implements p {
    public zzs(e eVar) {
        super(eVar);
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzs(eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzs((e) obj2).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f156a;
        h0.V0(obj);
        Thread.currentThread().setPriority(8);
        return f.f11019a;
    }
}
