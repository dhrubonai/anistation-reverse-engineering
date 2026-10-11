package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import h7.p;
import p7.q;
import p7.r;
import p7.y;
import r6.h0;
import w6.d;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzew extends h implements p {
    int zza;
    final /* synthetic */ zzez zzb;
    final /* synthetic */ zzoe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(zzez zzezVar, zzoe zzoeVar, e eVar) {
        super(eVar);
        this.zzb = zzezVar;
        this.zzc = zzoeVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzew(this.zzb, this.zzc, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        zzbg zzbgVar;
        zzbd zzbdVar;
        zzfh zzfhVar;
        zzfh zzfhVar2;
        a aVar = a.f156a;
        int i10 = this.zza;
        h0.V0(obj);
        if (i10 == 0) {
            zzez zzezVar = this.zzb;
            zzbgVar = zzezVar.zzi;
            zzbdVar = zzezVar.zzp;
            zzbgVar.zza(zzbdVar.zza(zzne.INIT_NATIVE));
            zzcb.zza(zznz.zzj(zzfy.zzh().zzj(this.zzc.zzJ())));
            zzfhVar = this.zzb.zzn;
            zzfhVar.zzd();
            zzfhVar2 = this.zzb.zzn;
            zzfhVar2.zze();
            zzez.zzl(this.zzb, this.zzc);
            new Integer(this.zzb.zzk().hashCode());
            q zzk = this.zzb.zzk();
            this.zza = 1;
            if (((r) zzk).T(this) == aVar) {
                return aVar;
            }
        }
        return new d(f.f11019a);
    }
}
