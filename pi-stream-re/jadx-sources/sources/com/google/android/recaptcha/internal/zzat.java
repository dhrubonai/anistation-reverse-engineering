package com.google.android.recaptcha.internal;

import b7.h;
import com.google.android.recaptcha.RecaptchaAction;
import h7.p;
import p7.y;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzat extends h implements p {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ zzbd zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(zzaw zzawVar, long j4, RecaptchaAction recaptchaAction, zzbd zzbdVar, String str, e eVar) {
        super(eVar);
        this.zzb = zzawVar;
        this.zzc = j4;
        this.zzd = recaptchaAction;
        this.zze = zzbdVar;
        this.zzf = str;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        return new zzat(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, eVar);
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzat) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // b7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            a7.a r0 = a7.a.f156a
            int r1 = r12.zza
            r2 = 1
            r6.h0.V0(r13)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L29
            goto L3b
        Ld:
            com.google.android.recaptcha.internal.zzaw r13 = r12.zzb
            long r3 = r12.zzc
            com.google.android.recaptcha.RecaptchaAction r1 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r5 = r12.zze
            com.google.android.recaptcha.internal.zzaw.zzi(r13, r3, r1, r5)
            com.google.android.recaptcha.internal.zzaw r6 = r12.zzb
            long r7 = r12.zzc
            java.lang.String r9 = r12.zzf
            com.google.android.recaptcha.internal.zzbd r10 = r12.zze
            r12.zza = r2
            r11 = r12
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzaw.zzd(r6, r7, r9, r10, r11)
            if (r13 == r0) goto L5e
        L29:
            com.google.android.recaptcha.internal.zzaw r1 = r12.zzb
            com.google.android.recaptcha.RecaptchaAction r2 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r3 = r12.zze
            com.google.android.recaptcha.internal.zzog r13 = (com.google.android.recaptcha.internal.zzog) r13
            r4 = 2
            r12.zza = r4
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzaw.zzf(r1, r2, r13, r3, r12)
            if (r13 != r0) goto L3b
            goto L5e
        L3b:
            com.google.android.recaptcha.internal.zzaw r0 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r1 = r12.zze
            com.google.android.recaptcha.internal.zzol r13 = (com.google.android.recaptcha.internal.zzol) r13
            com.google.android.recaptcha.internal.zzaw.zzh(r0, r13, r1)
            com.google.android.recaptcha.internal.zzaw r0 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r1 = r12.zze
            com.google.android.recaptcha.internal.zzbg r0 = com.google.android.recaptcha.internal.zzaw.zzb(r0)
            com.google.android.recaptcha.internal.zzne r2 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r1 = r1.zza(r2)
            r0.zza(r1)
            java.lang.String r13 = r13.zzi()
            w6.d r0 = new w6.d
            r0.<init>(r13)
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzat.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
