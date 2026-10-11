package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.r0;
import com.google.android.gms.common.api.internal.y0;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public abstract class l {
    protected final com.google.android.gms.common.api.internal.h zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final com.google.android.gms.common.api.internal.a zaf;
    private final Looper zag;
    private final int zah;

    @NotOnlyInitialized
    private final o zai;
    private final com.google.android.gms.common.api.internal.t zaj;

    public l(Activity activity, i iVar, e eVar, k kVar) {
        this(activity, activity, iVar, eVar, kVar);
    }

    public final void a(int i10, com.google.android.gms.common.api.internal.d dVar) {
        dVar.zak();
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        y0 y0Var = new y0(i10, dVar);
        zaq zaqVar = hVar.E;
        zaqVar.sendMessage(zaqVar.obtainMessage(4, new p0(y0Var, hVar.f2428z.get(), this)));
    }

    public o asGoogleApiClient() {
        return this.zai;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.tasks.Task b(int r18, com.google.android.gms.common.api.internal.w r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            com.google.android.gms.common.api.internal.h r11 = r0.zaa
            com.google.android.gms.common.api.internal.t r12 = r0.zaj
            r11.getClass()
            int r5 = r1.f2477c
            com.google.android.gms.internal.base.zaq r13 = r11.E
            if (r5 == 0) goto L8d
            com.google.android.gms.common.api.internal.a r6 = r17.getApiKey()
            boolean r3 = r11.c()
            if (r3 != 0) goto L21
            goto L54
        L21:
            com.google.android.gms.common.internal.s r3 = com.google.android.gms.common.internal.s.a()
            com.google.android.gms.common.internal.t r3 = r3.f2594a
            r4 = 1
            if (r3 == 0) goto L60
            boolean r7 = r3.f2596b
            if (r7 != 0) goto L2f
            goto L54
        L2f:
            java.util.concurrent.ConcurrentHashMap r7 = r11.A
            java.lang.Object r7 = r7.get(r6)
            com.google.android.gms.common.api.internal.g0 r7 = (com.google.android.gms.common.api.internal.g0) r7
            if (r7 == 0) goto L5e
            com.google.android.gms.common.api.g r8 = r7.f2404b
            boolean r9 = r8 instanceof com.google.android.gms.common.internal.f
            if (r9 != 0) goto L40
            goto L54
        L40:
            com.google.android.gms.common.internal.f r8 = (com.google.android.gms.common.internal.f) r8
            boolean r9 = r8.hasConnectionInfo()
            if (r9 == 0) goto L5e
            boolean r9 = r8.isConnecting()
            if (r9 != 0) goto L5e
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.api.internal.n0.a(r7, r8, r5)
            if (r3 != 0) goto L56
        L54:
            r3 = 0
            goto L7c
        L56:
            int r8 = r7.f2414l
            int r8 = r8 + r4
            r7.f2414l = r8
            boolean r4 = r3.f2532c
            goto L60
        L5e:
            boolean r4 = r3.f2597c
        L60:
            com.google.android.gms.common.api.internal.n0 r14 = new com.google.android.gms.common.api.internal.n0
            r7 = 0
            if (r4 == 0) goto L6b
            long r9 = java.lang.System.currentTimeMillis()
            goto L6c
        L6b:
            r9 = r7
        L6c:
            if (r4 == 0) goto L74
            long r3 = android.os.SystemClock.elapsedRealtime()
            r15 = r3
            goto L75
        L74:
            r15 = r7
        L75:
            r3 = r14
            r4 = r11
            r7 = r9
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
        L7c:
            if (r3 == 0) goto L8d
            com.google.android.gms.tasks.Task r4 = r2.getTask()
            r13.getClass()
            com.google.android.gms.common.api.internal.c0 r5 = new com.google.android.gms.common.api.internal.c0
            r5.<init>()
            r4.addOnCompleteListener(r5, r3)
        L8d:
            com.google.android.gms.common.api.internal.a1 r3 = new com.google.android.gms.common.api.internal.a1
            r4 = r18
            r3.<init>(r4, r1, r2, r12)
            com.google.android.gms.common.api.internal.p0 r1 = new com.google.android.gms.common.api.internal.p0
            java.util.concurrent.atomic.AtomicInteger r4 = r11.f2428z
            int r4 = r4.get()
            r1.<init>(r3, r4, r0)
            r3 = 4
            android.os.Message r1 = r13.obtainMessage(r3, r1)
            r13.sendMessage(r1)
            com.google.android.gms.tasks.Task r1 = r2.getTask()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.l.b(int, com.google.android.gms.common.api.internal.w):com.google.android.gms.tasks.Task");
    }

    public com.google.android.gms.common.internal.g createClientSettingsBuilder() {
        com.google.android.gms.common.internal.g gVar = new com.google.android.gms.common.internal.g();
        gVar.f2514a = null;
        Set emptySet = Collections.emptySet();
        if (gVar.f2515b == null) {
            gVar.f2515b = new n.f(0);
        }
        gVar.f2515b.addAll(emptySet);
        gVar.f2517d = this.zab.getClass().getName();
        gVar.f2516c = this.zab.getPackageName();
        return gVar;
    }

    public Task<Boolean> disconnectService() {
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        b0 b0Var = new b0(getApiKey());
        zaq zaqVar = hVar.E;
        zaqVar.sendMessage(zaqVar.obtainMessage(14, b0Var));
        return b0Var.f2383b.getTask();
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.d> T doBestEffortWrite(T t9) {
        a(2, t9);
        return t9;
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.d> T doRead(T t9) {
        a(0, t9);
        return t9;
    }

    @Deprecated
    public <A extends b, T extends com.google.android.gms.common.api.internal.q, U extends com.google.android.gms.common.api.internal.x> Task<Void> doRegisterEventListener(T t9, U u9) {
        w7.b.s(t9);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.m mVar) {
        return doUnregisterEventListener(mVar, 0);
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.d> T doWrite(T t9) {
        a(1, t9);
        return t9;
    }

    public final com.google.android.gms.common.api.internal.a getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.n registerListener(L l10, String str) {
        Looper looper = this.zag;
        if (l10 != null) {
            w7.b.r(looper, "Looper must not be null");
            if (str != null) {
                return new com.google.android.gms.common.api.internal.n(looper, l10, str);
            }
            throw new NullPointerException("Listener type must not be null");
        }
        throw new NullPointerException("Listener must not be null");
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g zab(Looper looper, g0 g0Var) {
        com.google.android.gms.common.internal.g createClientSettingsBuilder = createClientSettingsBuilder();
        com.google.android.gms.common.internal.h hVar = new com.google.android.gms.common.internal.h(createClientSettingsBuilder.f2514a, createClientSettingsBuilder.f2515b, createClientSettingsBuilder.f2516c, createClientSettingsBuilder.f2517d);
        a aVar = this.zad.f2366a;
        w7.b.s(aVar);
        g buildClient = aVar.buildClient(this.zab, looper, hVar, (Object) this.zae, (m) g0Var, (n) g0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.internal.f)) {
            ((com.google.android.gms.common.internal.f) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.api.internal.o)) {
            throw null;
        }
        return buildClient;
    }

    public final r0 zac(Context context, Handler handler) {
        com.google.android.gms.common.internal.g createClientSettingsBuilder = createClientSettingsBuilder();
        return new r0(context, handler, new com.google.android.gms.common.internal.h(createClientSettingsBuilder.f2514a, createClientSettingsBuilder.f2515b, createClientSettingsBuilder.f2516c, createClientSettingsBuilder.f2517d));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(android.content.Context r5, android.app.Activity r6, com.google.android.gms.common.api.i r7, com.google.android.gms.common.api.e r8, com.google.android.gms.common.api.k r9) {
        /*
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto La5
            if (r7 == 0) goto L9d
            if (r9 == 0) goto L95
            android.content.Context r0 = r5.getApplicationContext()
            r4.zab = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L2e
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r1 = "getAttributionTag"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r5 = 0
        L2f:
            r4.zac = r5
            r4.zad = r7
            r4.zae = r8
            android.os.Looper r0 = r9.f2489b
            r4.zag = r0
            com.google.android.gms.common.api.internal.a r0 = new com.google.android.gms.common.api.internal.a
            r0.<init>(r7, r8, r5)
            r4.zaf = r0
            com.google.android.gms.common.api.internal.j0 r5 = new com.google.android.gms.common.api.internal.j0
            r5.<init>(r4)
            r4.zai = r5
            android.content.Context r5 = r4.zab
            com.google.android.gms.common.api.internal.h r5 = com.google.android.gms.common.api.internal.h.g(r5)
            r4.zaa = r5
            java.util.concurrent.atomic.AtomicInteger r7 = r5.f2427y
            int r7 = r7.getAndIncrement()
            r4.zah = r7
            com.google.android.gms.common.api.internal.t r7 = r9.f2488a
            r4.zaj = r7
            if (r6 == 0) goto L8a
            boolean r7 = r6 instanceof com.google.android.gms.common.api.GoogleApiActivity
            if (r7 != 0) goto L8a
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            if (r7 != r8) goto L8a
            com.google.android.gms.common.api.internal.l r6 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(r6)
            java.lang.String r7 = "ConnectionlessLifecycleHelper"
            java.lang.Class<com.google.android.gms.common.api.internal.a0> r8 = com.google.android.gms.common.api.internal.a0.class
            com.google.android.gms.common.api.internal.LifecycleCallback r7 = r6.c(r8, r7)
            com.google.android.gms.common.api.internal.a0 r7 = (com.google.android.gms.common.api.internal.a0) r7
            if (r7 != 0) goto L82
            com.google.android.gms.common.api.internal.a0 r7 = new com.google.android.gms.common.api.internal.a0
            java.lang.Object r8 = b5.d.f1516c
            r7.<init>(r6, r5)
        L82:
            n.f r6 = r7.f2377e
            r6.add(r0)
            r5.b(r7)
        L8a:
            com.google.android.gms.internal.base.zaq r5 = r5.E
            r6 = 7
            android.os.Message r6 = r5.obtainMessage(r6, r4)
            r5.sendMessage(r6)
            return
        L95:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            r5.<init>(r6)
            throw r5
        L9d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Api must not be null."
            r5.<init>(r6)
            throw r5
        La5:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Null context is not permitted."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.l.<init>(android.content.Context, android.app.Activity, com.google.android.gms.common.api.i, com.google.android.gms.common.api.e, com.google.android.gms.common.api.k):void");
    }

    public <TResult, A extends b> Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.w wVar) {
        return b(2, wVar);
    }

    public <TResult, A extends b> Task<TResult> doRead(com.google.android.gms.common.api.internal.w wVar) {
        return b(0, wVar);
    }

    public <A extends b> Task<Void> doRegisterEventListener(com.google.android.gms.common.api.internal.r rVar) {
        w7.b.s(rVar);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.m mVar, int i10) {
        throw new NullPointerException("Listener key cannot be null.");
    }

    public <TResult, A extends b> Task<TResult> doWrite(com.google.android.gms.common.api.internal.w wVar) {
        return b(1, wVar);
    }

    public l(Context context, i iVar, e eVar, k kVar) {
        this(context, null, iVar, eVar, kVar);
    }
}
