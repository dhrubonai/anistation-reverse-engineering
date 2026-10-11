package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class k extends f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final h zab;
    private final Set<Scope> zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.h r13, com.google.android.gms.common.api.internal.g r14, com.google.android.gms.common.api.internal.p r15) {
        /*
            r9 = this;
            java.lang.Object r0 = com.google.android.gms.common.internal.l.f2551a
            monitor-enter(r0)
            com.google.android.gms.common.internal.q0 r1 = com.google.android.gms.common.internal.l.f2552b     // Catch: java.lang.Throwable -> L66
            if (r1 != 0) goto L16
            com.google.android.gms.common.internal.q0 r1 = new com.google.android.gms.common.internal.q0     // Catch: java.lang.Throwable -> L66
            android.content.Context r2 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L66
            android.os.Looper r3 = r10.getMainLooper()     // Catch: java.lang.Throwable -> L66
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.common.internal.l.f2552b = r1     // Catch: java.lang.Throwable -> L66
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.common.internal.q0 r4 = com.google.android.gms.common.internal.l.f2552b
            java.lang.Object r0 = b5.d.f1516c
            w7.b.s(r14)
            w7.b.s(r15)
            k3.d r6 = new k3.d
            r0 = 18
            r6.<init>(r14, r0)
            k3.d r7 = new k3.d
            r14 = 19
            r7.<init>(r15, r14)
            java.lang.String r8 = r13.f2526f
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.zab = r13
            android.accounts.Account r10 = r13.f2521a
            r9.zad = r10
            java.util.Set r10 = r13.f2523c
            java.util.Set r11 = r9.validateScopes(r10)
            java.util.Iterator r12 = r11.iterator()
        L48:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L63
            java.lang.Object r13 = r12.next()
            com.google.android.gms.common.api.Scope r13 = (com.google.android.gms.common.api.Scope) r13
            boolean r13 = r10.contains(r13)
            if (r13 == 0) goto L5b
            goto L48
        L5b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L63:
            r9.zac = r11
            return
        L66:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.k.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.h, com.google.android.gms.common.api.internal.g, com.google.android.gms.common.api.internal.p):void");
    }

    @Override // com.google.android.gms.common.internal.f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Executor getBindServiceExecutor() {
        return null;
    }

    public final h getClientSettings() {
        return this.zab;
    }

    public b5.c[] getRequiredFeatures() {
        return new b5.c[0];
    }

    @Override // com.google.android.gms.common.internal.f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        if (requiresSignIn()) {
            return this.zac;
        }
        return Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
