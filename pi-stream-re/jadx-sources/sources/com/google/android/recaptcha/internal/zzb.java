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
public final class zzb extends h implements p {
    int zza;
    final /* synthetic */ zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zza zzaVar, String str, long j4, e eVar) {
        super(eVar);
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = j4;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzb(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        Object zza;
        a aVar = a.f156a;
        int i10 = this.zza;
        h0.V0(obj);
        if (i10 != 0) {
            zza = ((d) obj).f11015a;
        } else {
            zza zzaVar = this.zzb;
            String str = this.zzc;
            long j4 = this.zzd;
            this.zza = 1;
            zza = zzaVar.zza(str, j4, this);
            if (zza == aVar) {
                return aVar;
            }
        }
        return new d(zza);
    }
}
