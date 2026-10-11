package com.unity3d.ads.adplayer.webviewpool;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.n11;
import defpackage.pn6;
import defpackage.q71;
import defpackage.rz5;
import defpackage.tl7;
import defpackage.vz0;
import defpackage.w11;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AndroidWebViewPool implements WebViewPool {
    private static final long ACQUIRE_TIMEOUT_MS = 2000;
    public static final Companion Companion = new Companion(null);
    private static final long HEALTH_CHECK_TIMEOUT_MS = 500;
    private final Context context;
    private final ConcurrentLinkedQueue<PoolEntry> freshViews;
    private final GetCachedAsset getCachedAsset;
    private final AtomicBoolean isInitialized;
    private final n11 mainDispatcher;
    private volatile int poolSize;
    private final ConcurrentLinkedQueue<PoolEntry> recycledViews;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidWebViewPool(Context context, n11 n11Var, GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        context.getClass();
        n11Var.getClass();
        getCachedAsset.getClass();
        sendDiagnosticEvent.getClass();
        this.context = context;
        this.mainDispatcher = n11Var;
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.freshViews = new ConcurrentLinkedQueue<>();
        this.recycledViews = new ConcurrentLinkedQueue<>();
        this.isInitialized = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object acquireForShow$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r8, defpackage.vz0 r9) {
        /*
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$1 r0 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$1 r0 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.m37.N(r9)
            return r9
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r2
        L31:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r8 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool) r8
            defpackage.m37.N(r9)
            goto L4e
        L39:
            defpackage.m37.N(r9)
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$2 r9 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$2
            r9.<init>(r8, r2)
            r0.L$0 = r8
            r0.label = r4
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = defpackage.rz5.f(r6, r9, r0)
            if (r9 != r5) goto L4e
            goto L5c
        L4e:
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r9 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r9
            if (r9 != 0) goto L5e
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = r8.createFreshEntry$unity_ads_defaultRelease(r0)
            if (r8 != r5) goto L5d
        L5c:
            return r5
        L5d:
            return r8
        L5e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.acquireForShow$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, vz0):java.lang.Object");
    }

    public static /* synthetic */ Object acquireFreshEntry$suspendImpl(AndroidWebViewPool androidWebViewPool, vz0 vz0Var) {
        return rz5.f(2000L, new AndroidWebViewPool$acquireFreshEntry$2(androidWebViewPool, null), vz0Var);
    }

    private final AndroidWebViewClient createClient() {
        return new AndroidWebViewClient(this.getCachedAsset, this.sendDiagnosticEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object createFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r5, defpackage.vz0 r6) {
        /*
            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$createFreshEntry$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$createFreshEntry$1 r0 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$createFreshEntry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$createFreshEntry$1 r0 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$createFreshEntry$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r5 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewClient r5 = (com.unity3d.ads.adplayer.AndroidWebViewClient) r5
            defpackage.m37.N(r6)
            goto L47
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L30:
            defpackage.m37.N(r6)
            com.unity3d.ads.adplayer.AndroidWebViewClient r6 = r5.createClient()
            r0.L$0 = r6
            r0.label = r2
            java.lang.Object r5 = r5.createWebView(r6, r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L44
            return r0
        L44:
            r4 = r6
            r6 = r5
            r5 = r4
        L47:
            android.webkit.WebView r6 = (android.webkit.WebView) r6
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r0 = new com.unity3d.ads.adplayer.webviewpool.PoolEntry
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.createFreshEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, vz0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createWebView(AndroidWebViewClient androidWebViewClient, vz0 vz0Var) {
        return tl7.V(this.mainDispatcher, new AndroidWebViewPool$createWebView$2(this, androidWebViewClient, null), vz0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object destroyEntry(PoolEntry poolEntry, vz0 vz0Var) {
        Object V = tl7.V(this.mainDispatcher, new AndroidWebViewPool$destroyEntry$2(poolEntry, null), vz0Var);
        if (V == w11.x) {
            return V;
        }
        return pn6.a;
    }

    public static Object enqueueRecycled$suspendImpl(AndroidWebViewPool androidWebViewPool, PoolEntry poolEntry, vz0 vz0Var) {
        pn6 pn6Var = pn6.a;
        if (androidWebViewPool.recycledViews.size() < androidWebViewPool.poolSize) {
            androidWebViewPool.recycledViews.offer(poolEntry);
            return pn6Var;
        }
        Object destroyEntry = androidWebViewPool.destroyEntry(poolEntry, vz0Var);
        if (destroyEntry == w11.x) {
            return destroyEntry;
        }
        return pn6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0068 -> B:10:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object initialize$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r7, int r8, defpackage.vz0 r9) {
        /*
            pn6 r0 = defpackage.pn6.a
            boolean r1 = r9 instanceof com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$initialize$1
            if (r1 == 0) goto L15
            r1 = r9
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$initialize$1 r1 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$initialize$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$initialize$1 r1 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$initialize$1
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.result
            w11 r2 = defpackage.w11.x
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L3a
            int r7 = r1.I$1
            int r8 = r1.I$0
            java.lang.Object r3 = r1.L$1
            java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3
            java.lang.Object r5 = r1.L$0
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r5 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool) r5
            defpackage.m37.N(r9)
            r6 = r1
            r1 = r8
            r8 = r5
        L37:
            r5 = r3
            r3 = r6
            goto L6c
        L3a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            r7 = 0
            return r7
        L41:
            defpackage.m37.N(r9)
            r7.poolSize = r8
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.isInitialized
            r3 = 0
            boolean r9 = r9.compareAndSet(r3, r4)
            if (r9 != 0) goto L50
            return r0
        L50:
            r9 = r8
            r8 = r7
            r7 = r3
        L53:
            if (r7 >= r9) goto L73
            java.util.concurrent.ConcurrentLinkedQueue<com.unity3d.ads.adplayer.webviewpool.PoolEntry> r3 = r8.freshViews
            r1.L$0 = r8
            r1.L$1 = r3
            r1.I$0 = r9
            r1.I$1 = r7
            r1.label = r4
            java.lang.Object r5 = r8.createFreshEntry$unity_ads_defaultRelease(r1)
            if (r5 != r2) goto L68
            return r2
        L68:
            r6 = r1
            r1 = r9
            r9 = r5
            goto L37
        L6c:
            r5.offer(r9)
            int r7 = r7 + r4
            r9 = r1
            r1 = r3
            goto L53
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.initialize$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, int, vz0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isHealthy(com.unity3d.ads.adplayer.webviewpool.PoolEntry r5, defpackage.vz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$1 r0 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$1 r0 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r6)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r6)
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2 r6 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2
            r6.<init>(r4, r5, r2)
            r0.label = r3
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r6 = defpackage.rz5.f(r4, r6, r0)
            w11 r4 = defpackage.w11.x
            if (r6 != r4) goto L41
            return r4
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L4a
            boolean r4 = r6.booleanValue()
            goto L4b
        L4a:
            r4 = 0
        L4b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.isHealthy(com.unity3d.ads.adplayer.webviewpool.PoolEntry, vz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r6.enqueueRecycled((com.unity3d.ads.adplayer.webviewpool.PoolEntry) r8, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r8 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object release$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6, com.unity3d.ads.adplayer.webviewpool.PoolEntry r7, defpackage.vz0 r8) {
        /*
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$release$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$release$1 r0 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$release$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$release$1 r0 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$release$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.m37.N(r8)
            goto L54
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L31:
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool) r6
            defpackage.m37.N(r8)
            goto L47
        L39:
            defpackage.m37.N(r8)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r8 = r6.resetEntry(r7, r0)
            if (r8 != r5) goto L47
            goto L53
        L47:
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r8 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r8
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.enqueueRecycled(r8, r0)
            if (r6 != r5) goto L54
        L53:
            return r5
        L54:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.release$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, vz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$resetClient$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object resetEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r9, com.unity3d.ads.adplayer.webviewpool.PoolEntry r10, defpackage.vz0 r11) {
        /*
            boolean r0 = r11 instanceof com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$1 r0 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$1 r0 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L59
            if (r1 == r4) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            java.lang.Object r9 = r0.L$1
            com.unity3d.ads.adplayer.AndroidWebViewClient r9 = (com.unity3d.ads.adplayer.AndroidWebViewClient) r9
            java.lang.Object r10 = r0.L$0
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r10 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r10
            defpackage.m37.N(r11)
            goto Laf
        L37:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r5
        L3d:
            java.lang.Object r9 = r0.L$1
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r9 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r9
            java.lang.Object r10 = r0.L$0
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r10 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool) r10
            defpackage.m37.N(r11)
            goto L95
        L49:
            java.lang.Object r9 = r0.L$2
            yq0 r9 = (defpackage.yq0) r9
            java.lang.Object r10 = r0.L$1
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r10 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r10
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r1 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool) r1
            defpackage.m37.N(r11)
            goto L7d
        L59:
            defpackage.m37.N(r11)
            zq0 r11 = defpackage.tl7.c()
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$resetClient$1 r1 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$resetClient$1
            r1.<init>()
            n11 r7 = r9.mainDispatcher
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$2 r8 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$2
            r8.<init>(r10, r1, r5)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r1 = defpackage.tl7.V(r7, r8, r0)
            if (r1 != r6) goto L7b
            goto Lac
        L7b:
            r1 = r9
            r9 = r11
        L7d:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$3 r11 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$3
            r11.<init>(r9, r5)
            r0.L$0 = r1
            r0.L$1 = r10
            r0.L$2 = r5
            r0.label = r3
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = defpackage.rz5.f(r3, r11, r0)
            if (r9 != r6) goto L93
            goto Lac
        L93:
            r9 = r10
            r10 = r1
        L95:
            com.unity3d.ads.adplayer.AndroidWebViewClient r11 = r10.createClient()
            n11 r10 = r10.mainDispatcher
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$4 r1 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$4
            r1.<init>(r9, r11, r5)
            r0.L$0 = r9
            r0.L$1 = r11
            r0.label = r2
            java.lang.Object r10 = defpackage.tl7.V(r10, r1, r0)
            if (r10 != r6) goto Lad
        Lac:
            return r6
        Lad:
            r10 = r9
            r9 = r11
        Laf:
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r11 = new com.unity3d.ads.adplayer.webviewpool.PoolEntry
            android.webkit.WebView r10 = r10.getWebView()
            r11.<init>(r10, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.resetEntry$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public Object acquireForShow(vz0 vz0Var) {
        return acquireForShow$suspendImpl(this, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public Object acquireFreshEntry(vz0 vz0Var) {
        return acquireFreshEntry$suspendImpl(this, vz0Var);
    }

    public Object createFreshEntry$unity_ads_defaultRelease(vz0 vz0Var) {
        return createFreshEntry$suspendImpl(this, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public Object enqueueRecycled(PoolEntry poolEntry, vz0 vz0Var) {
        return enqueueRecycled$suspendImpl(this, poolEntry, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public Object initialize(int i, vz0 vz0Var) {
        return initialize$suspendImpl(this, i, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public Object release(PoolEntry poolEntry, vz0 vz0Var) {
        return release$suspendImpl(this, poolEntry, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    public Object resetEntry(PoolEntry poolEntry, vz0 vz0Var) {
        return resetEntry$suspendImpl(this, poolEntry, vz0Var);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }
}
