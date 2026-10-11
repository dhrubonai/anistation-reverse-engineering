package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import h7.p;
import p7.y;
import r6.h0;
import w6.f;
import z6.e;

/* loaded from: classes.dex */
final class zzes extends h implements p {
    final /* synthetic */ zzez zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzez zzezVar, String str, e eVar) {
        super(eVar);
        this.zza = zzezVar;
        this.zzb = str;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzes(this.zza, this.zzb, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f156a;
        h0.V0(obj);
        this.zza.zzc().evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzb + "\")", null);
        return f.f11019a;
    }
}
