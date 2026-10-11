package com.google.android.recaptcha.internal;

import a7.a;
import androidx.lifecycle.q0;
import b7.h;
import h7.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p7.a1;
import p7.y;
import r6.h0;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbx extends h implements p {
    int zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzca zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbx(zzcj zzcjVar, List list, zzca zzcaVar, e eVar) {
        super(eVar);
        this.zzb = zzcjVar;
        this.zzc = list;
        this.zzd = zzcaVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        zzbx zzbxVar = new zzbx(this.zzb, this.zzc, this.zzd, eVar);
        zzbxVar.zze = obj;
        return zzbxVar;
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        Object zzh;
        a aVar = a.f156a;
        int i10 = this.zza;
        f fVar = f.f11019a;
        h0.V0(obj);
        if (i10 == 0) {
            y yVar = (y) this.zze;
            zzfh zzb = zzfh.zzb();
            while (true) {
                zzcj zzcjVar = this.zzb;
                if (zzcjVar.zza() < 0) {
                    break;
                }
                if (zzcjVar.zza() < this.zzc.size()) {
                    a1 a1Var = (a1) yVar.b().r(q0.f1134x);
                    if (a1Var != null) {
                        z9 = a1Var.a();
                    } else {
                        z9 = true;
                    }
                    if (!z9) {
                        break;
                    }
                    try {
                        this.zzd.zzi((zzpr) this.zzc.get(this.zzb.zza()), this.zzb);
                    } catch (Exception e10) {
                        zzca zzcaVar = this.zzd;
                        zzcj zzcjVar2 = this.zzb;
                        this.zza = 1;
                        zzh = zzcaVar.zzh(e10, zzcjVar2, this);
                        if (zzh == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    break;
                }
            }
            zzb.zzf();
            new Long(zzb.zza(TimeUnit.MICROSECONDS));
            return fVar;
        }
        return fVar;
    }
}
