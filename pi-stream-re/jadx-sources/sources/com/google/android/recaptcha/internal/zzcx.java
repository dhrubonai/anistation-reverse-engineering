package com.google.android.recaptcha.internal;

import h7.p;
import i7.h;
import w6.f;

/* loaded from: classes.dex */
final class zzcx extends h implements p {
    final /* synthetic */ zzcj zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzcj zzcjVar, String str, int i10) {
        super(2);
        this.zza = zzcjVar;
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzc().zzf(i10, objArr);
        }
        return f.f11019a;
    }
}
