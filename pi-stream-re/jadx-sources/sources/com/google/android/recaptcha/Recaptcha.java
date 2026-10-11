package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzam;
import z6.e;

/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m0getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j4, e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j4 = 10000;
        }
        return recaptcha.m1getClientBWLJW6A(application, str, j4, eVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzam.zzd(application, str, 10000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1getClientBWLJW6A(android.app.Application r8, java.lang.String r9, long r10, z6.e r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.zza
            a7.a r0 = a7.a.f156a
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            r6.h0.V0(r12)     // Catch: java.lang.Throwable -> L45
            goto L42
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            r6.h0.V0(r12)
            com.google.android.recaptcha.internal.zzam r12 = com.google.android.recaptcha.internal.zzam.zza     // Catch: java.lang.Throwable -> L45
            r6.zzc = r2     // Catch: java.lang.Throwable -> L45
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r12 = com.google.android.recaptcha.internal.zzam.zzc(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L45
            if (r12 != r0) goto L42
            return r0
        L42:
            com.google.android.recaptcha.internal.zzaw r12 = (com.google.android.recaptcha.internal.zzaw) r12     // Catch: java.lang.Throwable -> L45
            goto L4a
        L45:
            r8 = move-exception
            w6.c r12 = r6.h0.F(r8)
        L4a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m1getClientBWLJW6A(android.app.Application, java.lang.String, long, z6.e):java.lang.Object");
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j4) {
        return zzam.zzd(application, str, j4);
    }
}
