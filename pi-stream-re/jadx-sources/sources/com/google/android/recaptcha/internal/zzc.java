package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import com.bumptech.glide.c;
import h7.p;
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
public final class zzc extends h implements p {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzg zzgVar, String str, long j4, e eVar) {
        super(eVar);
        this.zzb = zzgVar;
        this.zzc = str;
        this.zzd = j4;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        zzc zzcVar = new zzc(this.zzb, this.zzc, this.zzd, eVar);
        zzcVar.zze = obj;
        return zzcVar;
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzc) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f156a;
        int i10 = this.zza;
        h0.V0(obj);
        if (i10 == 0) {
            y yVar = (y) this.zze;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzc().iterator();
            while (it.hasNext()) {
                arrayList.add(h0.h(yVar, new zzb((zza) it.next(), this.zzc, this.zzd, null)));
            }
            d0[] d0VarArr = (d0[]) arrayList.toArray(new d0[0]);
            d0[] d0VarArr2 = (d0[]) Arrays.copyOf(d0VarArr, d0VarArr.length);
            this.zza = 1;
            obj = c.d(d0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = this.zzc;
        zzof zzf = zzog.zzf();
        zzf.zzd(str);
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Object obj2 = ((d) it2.next()).f11015a;
            if (!(obj2 instanceof w6.c)) {
                zzf.zzg((zzog) obj2);
            }
        }
        return (zzog) zzf.zzj();
    }
}
