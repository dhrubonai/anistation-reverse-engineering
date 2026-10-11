package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import h7.p;
import java.util.Timer;
import p7.y;
import r6.h0;
import w6.f;
import z6.e;

/* loaded from: classes.dex */
final class zzbk extends h implements p {
    final /* synthetic */ zzbm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(zzbm zzbmVar, e eVar) {
        super(eVar);
        this.zza = zzbmVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzbk(this.zza, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbk) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        zzaz zzazVar;
        Timer timer;
        a aVar = a.f156a;
        h0.V0(obj);
        zzbm zzbmVar = this.zza;
        synchronized (zzbh.class) {
            zzazVar = zzbmVar.zze;
            if (zzazVar != null && zzazVar.zzb() == 0) {
                timer = zzbm.zzb;
                if (timer != null) {
                    timer.cancel();
                }
                zzbm.zzb = null;
            }
            zzbmVar.zzg();
        }
        return f.f11019a;
    }
}
