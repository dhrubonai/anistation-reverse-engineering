package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.LinkedHashMap;
import java.util.List;
import o7.d;
import r6.h0;
import x6.j;

/* loaded from: classes.dex */
public final class zzaw implements RecaptchaClient, RecaptchaTasksClient {
    public static final zzan zza = new zzan(null);
    private static final d zzb = new d("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzc;
    private final zzg zzd;
    private final String zze;
    private final zzab zzf;
    private final zzoe zzg;
    private final zzbd zzh;
    private final zzbg zzi;
    private final zzq zzj;
    private final zzbs zzk;
    private final zzt zzl;

    public zzaw(Application application, zzg zzgVar, String str, zzt zztVar, zzab zzabVar, zzoe zzoeVar, zzbd zzbdVar, zzbg zzbgVar, zzq zzqVar, zzbs zzbsVar) {
        this.zzc = application;
        this.zzd = zzgVar;
        this.zze = str;
        this.zzl = zztVar;
        this.zzf = zzabVar;
        this.zzg = zzoeVar;
        this.zzh = zzbdVar;
        this.zzi = zzbgVar;
        this.zzj = zzqVar;
        this.zzk = zzbsVar;
    }

    public static final void zzi(zzaw zzawVar, long j4, RecaptchaAction recaptchaAction, zzbd zzbdVar) {
        zzp zzpVar;
        zzbb zza2 = zzbdVar.zza(zzne.EXECUTE_NATIVE);
        zzbg.zzc(zzawVar.zzi, zza2, null, 2, null);
        d dVar = zzb;
        String action = recaptchaAction.getAction();
        dVar.getClass();
        h0.u(action, "input");
        if (!dVar.f8324a.matcher(action).matches()) {
            zzpVar = new zzp(zzn.zzi, zzl.zzq, null);
        } else {
            zzpVar = null;
        }
        if (j4 < 5000) {
            zzpVar = new zzp(zzn.zzc, zzl.zzT, null);
        }
        if (zzpVar == null) {
            zzawVar.zzi.zza(zza2);
        } else {
            zzawVar.zzi.zzb(zza2, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(long r6, java.lang.String r8, com.google.android.recaptcha.internal.zzbd r9, z6.e r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzao
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzao r0 = (com.google.android.recaptcha.internal.zzao) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzao r0 = new com.google.android.recaptcha.internal.zzao
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.zza
            a7.a r1 = a7.a.f156a
            int r2 = r0.zzc
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.google.android.recaptcha.internal.zzbb r6 = r0.zze
            com.google.android.recaptcha.internal.zzaw r7 = r0.zzd
            r6.h0.V0(r10)     // Catch: java.lang.Exception -> L2c
            goto L55
        L2c:
            r8 = move-exception
            goto L62
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            r6.h0.V0(r10)
            com.google.android.recaptcha.internal.zzne r10 = com.google.android.recaptcha.internal.zzne.COLLECT_SIGNALS
            com.google.android.recaptcha.internal.zzbb r9 = r9.zza(r10)
            com.google.android.recaptcha.internal.zzbg r10 = r5.zzi
            r2 = 2
            com.google.android.recaptcha.internal.zzbg.zzc(r10, r9, r4, r2, r4)
            com.google.android.recaptcha.internal.zzg r10 = r5.zzd     // Catch: java.lang.Exception -> L5e
            r0.zzd = r5     // Catch: java.lang.Exception -> L5e
            r0.zze = r9     // Catch: java.lang.Exception -> L5e
            r0.zzc = r3     // Catch: java.lang.Exception -> L5e
            java.lang.Object r10 = r10.zza(r8, r6, r0)     // Catch: java.lang.Exception -> L5e
            if (r10 == r1) goto L5d
            r7 = r5
            r6 = r9
        L55:
            com.google.android.recaptcha.internal.zzog r10 = (com.google.android.recaptcha.internal.zzog) r10     // Catch: java.lang.Exception -> L2c
            com.google.android.recaptcha.internal.zzbg r8 = r7.zzi     // Catch: java.lang.Exception -> L2c
            r8.zza(r6)     // Catch: java.lang.Exception -> L2c
            return r10
        L5d:
            return r1
        L5e:
            r6 = move-exception
            r8 = r6
            r7 = r5
            r6 = r9
        L62:
            boolean r9 = r8 instanceof com.google.android.recaptcha.internal.zzp
            if (r9 == 0) goto L69
            com.google.android.recaptcha.internal.zzp r8 = (com.google.android.recaptcha.internal.zzp) r8
            goto L72
        L69:
            com.google.android.recaptcha.internal.zzp r8 = new com.google.android.recaptcha.internal.zzp
            com.google.android.recaptcha.internal.zzn r9 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r10 = com.google.android.recaptcha.internal.zzl.zzan
            r8.<init>(r9, r10, r4)
        L72:
            com.google.android.recaptcha.internal.zzbg r7 = r7.zzi
            r7.zzb(r6, r8, r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.zzj(long, java.lang.String, com.google.android.recaptcha.internal.zzbd, z6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzk(com.google.android.recaptcha.RecaptchaAction r16, long r17, z6.e r19) {
        /*
            r15 = this;
            r9 = r15
            r0 = r19
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzas
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzas r1 = (com.google.android.recaptcha.internal.zzas) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.zzc = r2
            goto L1b
        L16:
            com.google.android.recaptcha.internal.zzas r1 = new com.google.android.recaptcha.internal.zzas
            r1.<init>(r15, r0)
        L1b:
            r0 = r1
            java.lang.Object r1 = r0.zza
            a7.a r10 = a7.a.f156a
            int r2 = r0.zzc
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L3a
            if (r2 != r11) goto L32
            com.google.android.recaptcha.internal.zzbd r2 = r0.zze
            com.google.android.recaptcha.internal.zzaw r3 = r0.zzd
            r6.h0.V0(r1)     // Catch: java.lang.Exception -> L30
            goto L77
        L30:
            r0 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            r6.h0.V0(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r7 = r1.toString()
            com.google.android.recaptcha.internal.zzbd r1 = r9.zzh
            com.google.android.recaptcha.internal.zzbd r13 = r1.zzb()
            r13.zzc(r7)
            com.google.android.recaptcha.internal.zzbg r1 = r9.zzi
            com.google.android.recaptcha.internal.zzne r2 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r2 = r13.zza(r2)
            r3 = 2
            com.google.android.recaptcha.internal.zzbg.zzc(r1, r2, r12, r3, r12)
            com.google.android.recaptcha.internal.zzat r14 = new com.google.android.recaptcha.internal.zzat     // Catch: java.lang.Exception -> L7f
            r8 = 0
            r1 = r14
            r2 = r15
            r3 = r17
            r5 = r16
            r6 = r13
            r1.<init>(r2, r3, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L7f
            r0.zzd = r9     // Catch: java.lang.Exception -> L7f
            r0.zze = r13     // Catch: java.lang.Exception -> L7f
            r0.zzc = r11     // Catch: java.lang.Exception -> L7f
            r1 = r17
            java.lang.Object r1 = q6.g.s0(r1, r14, r0)     // Catch: java.lang.Exception -> L7f
            if (r1 == r10) goto L7e
            r3 = r9
            r2 = r13
        L77:
            w6.d r1 = (w6.d) r1     // Catch: java.lang.Exception -> L30
            java.lang.Object r0 = r1.f11015a     // Catch: java.lang.Exception -> L30
            goto Lad
        L7c:
            r13 = r2
            goto L81
        L7e:
            return r10
        L7f:
            r0 = move-exception
            r3 = r9
        L81:
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzp
            if (r1 == 0) goto L88
            com.google.android.recaptcha.internal.zzp r0 = (com.google.android.recaptcha.internal.zzp) r0
            goto L9a
        L88:
            java.lang.Class r0 = r0.getClass()
            com.google.android.recaptcha.internal.zzp r1 = new com.google.android.recaptcha.internal.zzp
            com.google.android.recaptcha.internal.zzn r2 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r4 = com.google.android.recaptcha.internal.zzl.zzaj
            java.lang.String r0 = r0.getSimpleName()
            r1.<init>(r2, r4, r0)
            r0 = r1
        L9a:
            com.google.android.recaptcha.internal.zzbg r1 = r3.zzi
            com.google.android.recaptcha.internal.zzne r2 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r2 = r13.zza(r2)
            r1.zzb(r2, r0, r12)
            com.google.android.recaptcha.RecaptchaException r0 = r0.zzc()
            w6.c r0 = r6.h0.F(r0)
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.zzk(com.google.android.recaptcha.RecaptchaAction, long, z6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(zzol zzolVar, zzbd zzbdVar) {
        zzp zzpVar;
        zzbb zza2 = zzbdVar.zza(zzne.POST_EXECUTE);
        zzbg.zzc(this.zzi, zza2, null, 2, null);
        try {
            List<zzon> zzj = zzolVar.zzj();
            int m02 = h0.m0(j.o0(zzj));
            if (m02 < 16) {
                m02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(m02);
            for (zzon zzonVar : zzj) {
                linkedHashMap.put(zzonVar.zzg(), zzonVar.zzi());
            }
            this.zzj.zzb(linkedHashMap);
            this.zzi.zza(zza2);
        } catch (Exception e10) {
            if (e10 instanceof zzp) {
                zzpVar = (zzp) e10;
            } else {
                zzpVar = new zzp(zzn.zzc, zzl.zzan, null);
            }
            this.zzi.zzb(zza2, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r11, long r12, z6.e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzap
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzap r0 = (com.google.android.recaptcha.internal.zzap) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzap r0 = new com.google.android.recaptcha.internal.zzap
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            a7.a r1 = a7.a.f156a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            r6.h0.V0(r14)
            goto L4f
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            r6.h0.V0(r14)
            com.google.android.recaptcha.internal.zzt r14 = r10.zzl
            p7.y r14 = r14.zzb()
            z6.i r14 = r14.b()
            com.google.android.recaptcha.internal.zzaq r2 = new com.google.android.recaptcha.internal.zzaq
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.zzc = r3
            java.lang.Object r14 = r6.h0.f1(r14, r2, r0)
            if (r14 != r1) goto L4f
            return r1
        L4f:
            w6.d r14 = (w6.d) r14
            java.lang.Object r11 = r14.f11015a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.mo2execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, z6.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo3executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, z6.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzar
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzar r0 = (com.google.android.recaptcha.internal.zzar) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzar r0 = new com.google.android.recaptcha.internal.zzar
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            a7.a r1 = a7.a.f156a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            r6.h0.V0(r6)
            w6.d r6 = (w6.d) r6
            java.lang.Object r5 = r6.f11015a
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            r6.h0.V0(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = r4.mo2execute0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.mo3executegIAlus(com.google.android.recaptcha.RecaptchaAction, z6.e):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzj.zza(h0.h(this.zzl.zzb(), new zzau(this, recaptchaAction, 10000L, null)));
    }

    public final String zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j4) {
        return zzj.zza(h0.h(this.zzl.zzb(), new zzau(this, recaptchaAction, j4, null)));
    }
}
