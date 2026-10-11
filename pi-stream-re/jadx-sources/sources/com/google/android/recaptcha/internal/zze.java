package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import h7.p;
import p7.y;
import r6.h0;
import w6.d;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zze extends h implements p {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzoe zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(zza zzaVar, long j4, zzoe zzoeVar, e eVar) {
        super(eVar);
        this.zzb = zzaVar;
        this.zzc = j4;
        this.zzd = zzoeVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zze(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zze) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        Object zzb;
        a aVar = a.f156a;
        int i10 = this.zza;
        h0.V0(obj);
        if (i10 != 0) {
            zzb = ((d) obj).f11015a;
        } else {
            zza zzaVar = this.zzb;
            long j4 = this.zzc;
            zzoe zzoeVar = this.zzd;
            this.zza = 1;
            zzb = zzaVar.zzb(j4, zzoeVar, this);
            if (zzb == aVar) {
                return aVar;
            }
        }
        return new d(zzb);
    }
}
