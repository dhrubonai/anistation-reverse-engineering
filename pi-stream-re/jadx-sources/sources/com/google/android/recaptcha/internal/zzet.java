package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import h7.p;
import java.util.Map;
import p7.r;
import p7.y;
import r6.h0;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzet extends h implements p {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(String str, zzez zzezVar, e eVar) {
        super(eVar);
        this.zzb = str;
        this.zzc = zzezVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzet(this.zzb, this.zzc, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        zzt zztVar;
        a aVar = a.f156a;
        int i10 = this.zza;
        h0.V0(obj);
        if (i10 == 0) {
            zzez zzezVar = this.zzc;
            String str = this.zzb;
            r rVar = new r(null);
            map = zzezVar.zzl;
            map.put(str, rVar);
            String str2 = this.zzb;
            zzou zzf = zzov.zzf();
            zzf.zzd(str2);
            byte[] zzd = ((zzov) zzf.zzj()).zzd();
            String zzi = zzfy.zzh().zzi(zzd, 0, zzd.length);
            zztVar = this.zzc.zzq;
            h0.k0(zztVar.zzb(), new zzes(this.zzc, zzi, null));
            this.zza = 1;
            obj = rVar.T(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
