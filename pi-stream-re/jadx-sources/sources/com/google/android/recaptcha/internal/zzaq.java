package com.google.android.recaptcha.internal;

import a7.a;
import b7.h;
import com.google.android.recaptcha.RecaptchaAction;
import h7.p;
import p7.y;
import r6.h0;
import w6.d;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaq extends h implements p {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzaw zzawVar, RecaptchaAction recaptchaAction, long j4, e eVar) {
        super(eVar);
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = j4;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzaq(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        Object zzk;
        a aVar = a.f156a;
        int i10 = this.zza;
        h0.V0(obj);
        if (i10 != 0) {
            zzk = ((d) obj).f11015a;
        } else {
            zzaw zzawVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j4 = this.zzd;
            this.zza = 1;
            zzk = zzawVar.zzk(recaptchaAction, j4, this);
            if (zzk == aVar) {
                return aVar;
            }
        }
        return new d(zzk);
    }
}
