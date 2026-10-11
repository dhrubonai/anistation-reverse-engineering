package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import h7.p;
import p7.r;
import p7.y;
import r6.h0;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzey extends h implements p {
    final /* synthetic */ zzez zza;
    final /* synthetic */ zzoe zzb;
    final /* synthetic */ zzbb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzez zzezVar, zzoe zzoeVar, zzbb zzbbVar, e eVar) {
        super(eVar);
        this.zza = zzezVar;
        this.zzb = zzoeVar;
        this.zzc = zzbbVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzey(this.zza, this.zzb, this.zzc, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        zzbg zzbgVar;
        zzbd zzbdVar;
        zzt zztVar;
        a aVar = a.f156a;
        h0.V0(obj);
        try {
            zzez zzezVar = this.zza;
            zzbq zzf = zzezVar.zzf();
            zzoe zzoeVar = this.zzb;
            zzbdVar = zzezVar.zzp;
            String zzb = zzf.zzb(zzoeVar, zzbdVar);
            zztVar = this.zza.zzq;
            h0.k0(zztVar.zzb(), new zzex(this.zza, zzb, null));
        } catch (zzp e10) {
            zzez zzezVar2 = this.zza;
            zzbb zzbbVar = this.zzc;
            zzbgVar = zzezVar2.zzi;
            zzbgVar.zzb(zzbbVar, e10, null);
            ((r) this.zza.zzk()).U(e10);
        }
        return f.f11019a;
    }
}
