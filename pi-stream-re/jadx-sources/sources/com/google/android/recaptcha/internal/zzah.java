package com.google.android.recaptcha.internal;

import a7.a;
import android.app.Application;
import b7.h;
import h7.p;
import p7.y;
import r6.h0;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzah extends h implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(Application application, String str, long j4, zzbq zzbqVar, e eVar) {
        super(eVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j4;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzah(this.zzb, this.zzc, this.zzd, null, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f156a;
        int i10 = this.zza;
        h0.V0(obj);
        if (i10 == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j4 = this.zzd;
            zzam zzamVar = zzam.zza;
            this.zza = 1;
            obj = zzamVar.zza(application, str, j4, new zzab("https://www.recaptcha.net/recaptcha/api3"), null, null, zzam.zze, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
