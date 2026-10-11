package com.unity3d.ads.core.domain;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import defpackage.h43;
import defpackage.k54;
import defpackage.m54;
import defpackage.n11;
import defpackage.q71;
import defpackage.sb2;
import defpackage.tl7;
import defpackage.v11;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WebViewScreenCapture {
    public static final long CACHE_TTL_MS = 2000;
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_QUALITY = 50;
    public static final double DEFAULT_SAMPLING_RATE = 1.0d;
    public static final int DEFAULT_THRESHOLD = 10;
    public static final int PNG_QUALITY = 100;
    private final v11 backgroundScope;
    private long cacheTimestamp;
    private final long cacheTtlMs;
    private Bitmap cachedBitmap;
    private WeakReference<View> cachedViewRef;
    private final sb2 elapsedRealtimeMs;
    private h43 evictionJob;
    private final n11 ioDispatcher;
    private final n11 mainDispatcher;
    private final k54 mutex;
    private final AndroidScreenshotUploader uploader;
    private final AndroidViewCapturer viewCapturer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WebViewScreenCapture(defpackage.n11 r12, defpackage.n11 r13, com.unity3d.ads.core.domain.AndroidViewCapturer r14, com.unity3d.ads.core.domain.AndroidScreenshotUploader r15, long r16, defpackage.sb2 r18, defpackage.v11 r19, int r20, defpackage.q71 r21) {
        /*
            r11 = this;
            r0 = r20 & 16
            if (r0 == 0) goto L8
            r0 = 2000(0x7d0, double:9.88E-321)
            r7 = r0
            goto La
        L8:
            r7 = r16
        La:
            r0 = r20 & 32
            if (r0 == 0) goto L16
            mz6 r0 = new mz6
            r1 = 5
            r0.<init>(r1)
            r9 = r0
            goto L18
        L16:
            r9 = r18
        L18:
            r0 = r20 & 64
            if (r0 == 0) goto L2f
            q26 r0 = defpackage.iv5.a()
            l11 r0 = defpackage.tl7.L(r0, r12)
            ke0 r0 = defpackage.db.b(r0)
            r10 = r0
        L29:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            goto L32
        L2f:
            r10 = r19
            goto L29
        L32:
            r2.<init>(r3, r4, r5, r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.WebViewScreenCapture.<init>(n11, n11, com.unity3d.ads.core.domain.AndroidViewCapturer, com.unity3d.ads.core.domain.AndroidScreenshotUploader, long, sb2, v11, int, q71):void");
    }

    public static final long _init_$lambda$0() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x005c, code lost:
    
        if (r14.a(r0) == r5) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:25:0x005f, B:27:0x006f, B:29:0x0073, B:31:0x0080, B:37:0x008e), top: B:24:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getOrCapture(android.view.View r13, defpackage.vz0 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.WebViewScreenCapture$getOrCapture$1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.WebViewScreenCapture$getOrCapture$1 r0 = (com.unity3d.ads.core.domain.WebViewScreenCapture$getOrCapture$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.WebViewScreenCapture$getOrCapture$1 r0 = new com.unity3d.ads.core.domain.WebViewScreenCapture$getOrCapture$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            long r1 = r0.J$0
            java.lang.Object r13 = r0.L$1
            k54 r13 = (defpackage.k54) r13
            java.lang.Object r0 = r0.L$0
            android.view.View r0 = (android.view.View) r0
            defpackage.m37.N(r14)     // Catch: java.lang.Throwable -> L36
            goto La4
        L36:
            r12 = move-exception
            goto Lbb
        L39:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r12)
            return r4
        L3f:
            java.lang.Object r13 = r0.L$1
            k54 r13 = (defpackage.k54) r13
            java.lang.Object r1 = r0.L$0
            android.view.View r1 = (android.view.View) r1
            defpackage.m37.N(r14)
            r14 = r13
            r13 = r1
            goto L5f
        L4d:
            defpackage.m37.N(r14)
            k54 r14 = r12.mutex
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r3
            java.lang.Object r1 = r14.a(r0)
            if (r1 != r5) goto L5f
            goto L9e
        L5f:
            sb2 r1 = r12.elapsedRealtimeMs     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L7a
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L7a
            long r6 = r1.longValue()     // Catch: java.lang.Throwable -> L7a
            android.graphics.Bitmap r1 = r12.cachedBitmap     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L8e
            java.lang.ref.WeakReference<android.view.View> r3 = r12.cachedViewRef     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L7a
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L7a
            goto L7e
        L7a:
            r12 = move-exception
            r13 = r14
            goto Lbb
        L7d:
            r3 = r4
        L7e:
            if (r3 != r13) goto L8e
            long r8 = r12.cacheTimestamp     // Catch: java.lang.Throwable -> L7a
            long r8 = r6 - r8
            long r10 = r12.cacheTtlMs     // Catch: java.lang.Throwable -> L7a
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 >= 0) goto L8e
            r14.l(r4)
            return r1
        L8e:
            com.unity3d.ads.core.domain.AndroidViewCapturer r1 = r12.viewCapturer     // Catch: java.lang.Throwable -> L7a
            r0.L$0 = r13     // Catch: java.lang.Throwable -> L7a
            r0.L$1 = r14     // Catch: java.lang.Throwable -> L7a
            r0.J$0 = r6     // Catch: java.lang.Throwable -> L7a
            r0.label = r2     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r1.invoke(r13, r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r5) goto L9f
        L9e:
            return r5
        L9f:
            r1 = r0
            r0 = r13
            r13 = r14
            r14 = r1
            r1 = r6
        La4:
            r3 = r14
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L36
            r12.cachedBitmap = r3     // Catch: java.lang.Throwable -> L36
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L36
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L36
            r12.cachedViewRef = r3     // Catch: java.lang.Throwable -> L36
            r12.cacheTimestamp = r1     // Catch: java.lang.Throwable -> L36
            r12.scheduleEviction()     // Catch: java.lang.Throwable -> L36
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch: java.lang.Throwable -> L36
            r13.l(r4)
            return r14
        Lbb:
            r13.l(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.WebViewScreenCapture.getOrCapture(android.view.View, vz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveTargetView(com.unity3d.ads.core.data.model.AdObject r5, defpackage.vz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.WebViewScreenCapture$resolveTargetView$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.WebViewScreenCapture$resolveTargetView$1 r0 = (com.unity3d.ads.core.domain.WebViewScreenCapture$resolveTargetView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.WebViewScreenCapture$resolveTargetView$1 r0 = new com.unity3d.ads.core.domain.WebViewScreenCapture$resolveTargetView$1
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
            n11 r4 = r4.mainDispatcher
            com.unity3d.ads.core.domain.WebViewScreenCapture$resolveTargetView$2 r6 = new com.unity3d.ads.core.domain.WebViewScreenCapture$resolveTargetView$2
            r6.<init>(r5, r2)
            r0.label = r3
            java.lang.Object r6 = defpackage.tl7.V(r4, r6, r0)
            w11 r4 = defpackage.w11.x
            if (r6 != r4) goto L41
            return r4
        L41:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.WebViewScreenCapture.resolveTargetView(com.unity3d.ads.core.data.model.AdObject, vz0):java.lang.Object");
    }

    private final void scheduleEviction() {
        h43 h43Var = this.evictionJob;
        if (h43Var != null) {
            h43Var.l(null);
        }
        this.evictionJob = tl7.z(this.backgroundScope, null, null, new WebViewScreenCapture$scheduleEviction$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object captureScreenshot(com.unity3d.ads.core.data.model.AdObject r13, int r14, double r15, defpackage.vz0 r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.unity3d.ads.core.domain.WebViewScreenCapture$captureScreenshot$1
            if (r1 == 0) goto L15
            r1 = r0
            com.unity3d.ads.core.domain.WebViewScreenCapture$captureScreenshot$1 r1 = (com.unity3d.ads.core.domain.WebViewScreenCapture$captureScreenshot$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.unity3d.ads.core.domain.WebViewScreenCapture$captureScreenshot$1 r1 = new com.unity3d.ads.core.domain.WebViewScreenCapture$captureScreenshot$1
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.result
            int r2 = r1.label
            r9 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r2 == 0) goto L48
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            double r2 = r1.D$0
            int r1 = r1.I$0
            defpackage.m37.N(r0)
            r5 = r1
            r1 = r2
            goto L71
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r9
        L39:
            double r7 = r1.D$0
            int r2 = r1.I$0
            java.lang.Object r10 = r1.L$0
            com.unity3d.ads.core.domain.WebViewScreenCapture r10 = (com.unity3d.ads.core.domain.WebViewScreenCapture) r10
            defpackage.m37.N(r0)
            r11 = r2
            r2 = r0
            r0 = r11
            goto L5d
        L48:
            defpackage.m37.N(r0)
            r1.L$0 = r12
            r1.I$0 = r14
            r7 = r15
            r1.D$0 = r7
            r1.label = r4
            java.lang.Object r2 = r12.resolveTargetView(r13, r1)
            if (r2 != r5) goto L5b
            goto L6d
        L5b:
            r10 = r12
            r0 = r14
        L5d:
            android.view.View r2 = (android.view.View) r2
            r1.L$0 = r9
            r1.I$0 = r0
            r1.D$0 = r7
            r1.label = r3
            java.lang.Object r1 = r10.getOrCapture(r2, r1)
            if (r1 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r5 = r0
            r0 = r1
            r1 = r7
        L71:
            r3 = r0
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r7 = r0.toString()
            r7.getClass()
            r0 = 100
            if (r5 < r0) goto L84
            goto L85
        L84:
            r4 = 0
        L85:
            v11 r10 = r12.backgroundScope
            com.unity3d.ads.core.domain.WebViewScreenCapture$captureScreenshot$2 r0 = new com.unity3d.ads.core.domain.WebViewScreenCapture$captureScreenshot$2
            r8 = 0
            r6 = r12
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            r1 = 3
            defpackage.tl7.z(r10, r9, r9, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.WebViewScreenCapture.captureScreenshot(com.unity3d.ads.core.data.model.AdObject, int, double, vz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getBlackPixelPercentage(com.unity3d.ads.core.data.model.AdObject r8, int r9, defpackage.vz0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.WebViewScreenCapture$getBlackPixelPercentage$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.WebViewScreenCapture$getBlackPixelPercentage$1 r0 = (com.unity3d.ads.core.domain.WebViewScreenCapture$getBlackPixelPercentage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.WebViewScreenCapture$getBlackPixelPercentage$1 r0 = new com.unity3d.ads.core.domain.WebViewScreenCapture$getBlackPixelPercentage$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L44
            if (r1 == r5) goto L3a
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.m37.N(r10)
            return r10
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L34:
            int r8 = r0.I$0
            defpackage.m37.N(r10)
            goto L65
        L3a:
            int r9 = r0.I$0
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.core.domain.WebViewScreenCapture r8 = (com.unity3d.ads.core.domain.WebViewScreenCapture) r8
            defpackage.m37.N(r10)
            goto L55
        L44:
            defpackage.m37.N(r10)
            r0.L$0 = r7
            r0.I$0 = r9
            r0.label = r5
            java.lang.Object r10 = r7.resolveTargetView(r8, r0)
            if (r10 != r6) goto L54
            goto L76
        L54:
            r8 = r7
        L55:
            android.view.View r10 = (android.view.View) r10
            r0.L$0 = r2
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r10 = r8.getOrCapture(r10, r0)
            if (r10 != r6) goto L64
            goto L76
        L64:
            r8 = r9
        L65:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            n11 r7 = r7.ioDispatcher
            com.unity3d.ads.core.domain.WebViewScreenCapture$getBlackPixelPercentage$2 r9 = new com.unity3d.ads.core.domain.WebViewScreenCapture$getBlackPixelPercentage$2
            r9.<init>(r10, r8, r2)
            r0.label = r3
            java.lang.Object r7 = defpackage.tl7.V(r7, r9, r0)
            if (r7 != r6) goto L77
        L76:
            return r6
        L77:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.WebViewScreenCapture.getBlackPixelPercentage(com.unity3d.ads.core.data.model.AdObject, int, vz0):java.lang.Object");
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

    public WebViewScreenCapture(n11 n11Var, n11 n11Var2, AndroidViewCapturer androidViewCapturer, AndroidScreenshotUploader androidScreenshotUploader, long j, sb2 sb2Var, v11 v11Var) {
        n11Var.getClass();
        n11Var2.getClass();
        androidViewCapturer.getClass();
        androidScreenshotUploader.getClass();
        sb2Var.getClass();
        v11Var.getClass();
        this.ioDispatcher = n11Var;
        this.mainDispatcher = n11Var2;
        this.viewCapturer = androidViewCapturer;
        this.uploader = androidScreenshotUploader;
        this.cacheTtlMs = j;
        this.elapsedRealtimeMs = sb2Var;
        this.backgroundScope = v11Var;
        this.mutex = new m54();
    }
}
