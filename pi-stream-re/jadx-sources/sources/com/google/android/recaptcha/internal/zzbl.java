package com.google.android.recaptcha.internal;

import a7.a;
import android.content.ContentValues;
import b7.h;
import h7.p;
import java.util.List;
import p7.y;
import r6.h0;
import w6.f;
import x6.m;
import z6.e;

/* loaded from: classes.dex */
final class zzbl extends h implements p {
    final /* synthetic */ zzbm zza;
    final /* synthetic */ zzpd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(zzbm zzbmVar, zzpd zzpdVar, e eVar) {
        super(eVar);
        this.zza = zzbmVar;
        this.zzb = zzpdVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzbl(this.zza, this.zzb, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbl) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        zzaz zzazVar;
        zzaz zzazVar2;
        zzaz zzazVar3;
        zzaz zzazVar4;
        zzaz zzazVar5;
        zzaz zzazVar6;
        a aVar = a.f156a;
        h0.V0(obj);
        zzbm zzbmVar = this.zza;
        zzpd zzpdVar = this.zzb;
        synchronized (zzbh.class) {
            zzazVar = zzbmVar.zze;
            if (zzazVar != null) {
                byte[] zzd = zzpdVar.zzd();
                zzba zzbaVar = new zzba(zzfy.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                zzazVar2 = zzbmVar.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzbaVar.zzc());
                contentValues.put("ts", Long.valueOf(zzbaVar.zzb()));
                zzazVar2.getWritableDatabase().insert("ce", null, contentValues);
                zzazVar3 = zzbmVar.zze;
                int zzb = zzazVar3.zzb() - 500;
                if (zzb > 0) {
                    zzazVar5 = zzbmVar.zze;
                    List t02 = m.t0(zzazVar5.zzd(), zzb);
                    zzazVar6 = zzbmVar.zze;
                    zzazVar6.zza(t02);
                }
                zzazVar4 = zzbmVar.zze;
                if (zzazVar4.zzb() >= 20) {
                    zzbmVar.zzg();
                }
            }
        }
        return f.f11019a;
    }
}
