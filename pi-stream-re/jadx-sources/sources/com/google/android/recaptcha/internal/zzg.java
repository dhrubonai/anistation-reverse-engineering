package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.List;
import r6.h0;
import x6.o;
import z6.e;

/* loaded from: classes.dex */
public final class zzg {
    private final List zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Object zza(String str, long j4, e eVar) {
        return h0.E(new zzc(this, str, j4, null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb(long r11, com.google.android.recaptcha.internal.zzoe r13, z6.e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzd
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzd r0 = (com.google.android.recaptcha.internal.zzd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzd r0 = new com.google.android.recaptcha.internal.zzd
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            a7.a r1 = a7.a.f156a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            r6.h0.V0(r14)
            goto L45
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            r6.h0.V0(r14)
            com.google.android.recaptcha.internal.zzf r14 = new com.google.android.recaptcha.internal.zzf
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r5, r6, r8, r9)
            r0.zzc = r3
            java.lang.Object r14 = r6.h0.E(r14, r0)
            if (r14 != r1) goto L45
            return r1
        L45:
            w6.d r14 = (w6.d) r14
            java.lang.Object r11 = r14.f11015a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzg.zzb(long, com.google.android.recaptcha.internal.zzoe, z6.e):java.lang.Object");
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zza zzaVar) {
        this.zza.add(zzaVar);
    }

    public /* synthetic */ zzg(List list, int i10, i7.e eVar) {
        o oVar = o.f11318a;
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(oVar);
    }
}
