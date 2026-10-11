package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import com.bumptech.glide.c;
import h7.p;
import i7.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p7.d0;
import p7.y;
import r6.h0;
import w6.d;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzf extends h implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzgVar, long j4, zzoe zzoeVar, e eVar) {
        super(eVar);
        this.zzb = zzgVar;
        this.zzc = j4;
        this.zzd = zzoeVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, eVar);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        Object obj2;
        a aVar = a.f156a;
        if (this.zza != 0) {
            kVar = (k) this.zze;
            h0.V0(obj);
        } else {
            h0.V0(obj);
            y yVar = (y) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(h0.h(yVar, new zze((zza) it.next(), this.zzc, this.zzd, null)));
            }
            k kVar2 = new k();
            d0[] d0VarArr = (d0[]) arrayList.toArray(new d0[0]);
            d0[] d0VarArr2 = (d0[]) Arrays.copyOf(d0VarArr, d0VarArr.length);
            this.zze = kVar2;
            this.zza = 1;
            Object d10 = c.d(d0VarArr2, this);
            if (d10 != aVar) {
                kVar = kVar2;
                obj = d10;
            } else {
                return aVar;
            }
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Throwable a10 = d.a(((d) it2.next()).f11015a);
            if (a10 != null) {
                zzp zzpVar = null;
                if (kVar.f5412a == null) {
                    if (a10 instanceof zzp) {
                        zzpVar = (zzp) a10;
                    }
                } else {
                    zzpVar = new zzp(zzn.zzc, zzl.zzal, null);
                }
                kVar.f5412a = zzpVar;
            }
        }
        zzp zzpVar2 = (zzp) kVar.f5412a;
        if (zzpVar2 != null) {
            obj2 = h0.F(zzpVar2);
        } else {
            obj2 = f.f11019a;
        }
        return new d(obj2);
    }
}
