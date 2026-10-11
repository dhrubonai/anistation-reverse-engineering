package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import defpackage.db;
import defpackage.h41;
import defpackage.h5;
import defpackage.ic2;
import defpackage.iv;
import defpackage.k52;
import defpackage.k54;
import defpackage.ke0;
import defpackage.kv6;
import defpackage.m37;
import defpackage.m54;
import defpackage.n11;
import defpackage.pn6;
import defpackage.pv6;
import defpackage.q71;
import defpackage.qx1;
import defpackage.qx5;
import defpackage.r11;
import defpackage.s57;
import defpackage.sx5;
import defpackage.t36;
import defpackage.tl7;
import defpackage.tx5;
import defpackage.v11;
import defpackage.v57;
import defpackage.vz0;
import defpackage.vz5;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.x44;
import defpackage.xz0;
import defpackage.y45;
import defpackage.yz2;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidWebViewContainer implements WebViewContainer {
    private static final String JS_CLOSING_PARENTHESES = ")";
    private static final String JS_INSTRUCTION = "javascript:window.nativebridge.";
    private static final String JS_OPENING_PARENTHESES = "(";
    private static final String JS_SEMICOLON = ";";
    private final x44 _lastInputEvent;
    private final AdObject adObject;
    private final Context context;
    private final qx5 isRenderProcessGone;
    private final qx5 lastInputEvent;
    private final boolean ownsWebViewLifecycle;
    private final v11 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final WebView webView;
    private final AndroidWebViewClient webViewClient;
    public static final Companion Companion = new Companion(null);
    private static final StringBuilder SHARED_STRING_BUILDER = new StringBuilder(CodedOutputStream.DEFAULT_BUFFER_SIZE);
    private static final k54 SHARED_STRING_MUTEX = new m54();

    public AndroidWebViewContainer(WebView webView, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, n11 n11Var, n11 n11Var2, v11 v11Var, Context context, AdObject adObject, SendDiagnosticEvent sendDiagnosticEvent, boolean z) {
        webView.getClass();
        androidWebViewClient.getClass();
        sendWebViewClientErrorDiagnostics.getClass();
        n11Var.getClass();
        n11Var2.getClass();
        v11Var.getClass();
        context.getClass();
        adObject.getClass();
        sendDiagnosticEvent.getClass();
        this.webView = webView;
        this.webViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        this.adObject = adObject;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.ownsWebViewLifecycle = z;
        ke0 g0 = db.g0(db.g0(v11Var, n11Var), new r11("AndroidWebViewContainer"));
        this.scope = g0;
        sx5 a = tx5.a(null);
        this._lastInputEvent = a;
        this.lastInputEvent = h41.d(a);
        this.isRenderProcessGone = androidWebViewClient.isRenderProcessGone();
        final qx5 isRenderProcessGone = androidWebViewClient.isRenderProcessGone();
        iv.G(new k52(new w42() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(vz0 vz0Var) {
                        super(vz0Var);
                    }

                    @Override // defpackage.h30
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(x42 x42Var) {
                    this.$this_unsafeFlow = x42Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L45
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        r6 = r5
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        if (r6 == 0) goto L45
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L45
                        return r5
                    L45:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var), vz0Var);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        }, new AnonymousClass2(null), (byte) 2), db.g0(g0, n11Var2));
        getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: pg
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean _init_$lambda$1;
                _init_$lambda$1 = AndroidWebViewContainer._init_$lambda$1(AndroidWebViewContainer.this, view, motionEvent);
                return _init_$lambda$1;
            }
        });
        applySafeAreaInsets();
    }

    public static final boolean _init_$lambda$1(AndroidWebViewContainer androidWebViewContainer, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 5 || actionMasked == 6) {
            sx5 sx5Var = (sx5) androidWebViewContainer._lastInputEvent;
            sx5Var.getClass();
            sx5Var.l(null, motionEvent);
            return false;
        }
        return false;
    }

    private final void applySafeAreaInsets() {
        WebView webView = getWebView();
        h5 h5Var = new h5((Object) this, (byte) 2);
        int i = pv6.a;
        kv6.b(webView, h5Var);
    }

    public static final v57 applySafeAreaInsets$lambda$6(AndroidWebViewContainer androidWebViewContainer, View view, v57 v57Var) {
        Object y45Var;
        view.getClass();
        v57Var.getClass();
        s57 s57Var = v57Var.a;
        yz2 i = s57Var.i(519);
        i.getClass();
        yz2 i2 = s57Var.i(128);
        i2.getClass();
        try {
            y45Var = Float.valueOf(androidWebViewContainer.context.getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        Object valueOf = Float.valueOf(1.0f);
        if (y45Var instanceof y45) {
            y45Var = valueOf;
        }
        float floatValue = ((Number) y45Var).floatValue();
        int applySafeAreaInsets$lambda$6$toPx = applySafeAreaInsets$lambda$6$toPx(Math.max(i.a, i2.a), floatValue);
        int applySafeAreaInsets$lambda$6$toPx2 = applySafeAreaInsets$lambda$6$toPx(Math.max(i.b, i2.b), floatValue);
        int applySafeAreaInsets$lambda$6$toPx3 = applySafeAreaInsets$lambda$6$toPx(Math.max(i.c, i2.c), floatValue);
        int applySafeAreaInsets$lambda$6$toPx4 = applySafeAreaInsets$lambda$6$toPx(Math.max(i.d, i2.d), floatValue);
        StringBuilder u = qx1.u("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", applySafeAreaInsets$lambda$6$toPx, "px');\n                    root.style.setProperty('--safe-area-inset-right', '", applySafeAreaInsets$lambda$6$toPx3, "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        u.append(applySafeAreaInsets$lambda$6$toPx2);
        u.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        u.append(applySafeAreaInsets$lambda$6$toPx4);
        u.append("px');\n                })();\n            ");
        tl7.z(androidWebViewContainer.scope, null, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(androidWebViewContainer, vz5.u(u.toString()), null), 3);
        return v57Var;
    }

    private static final int applySafeAreaInsets$lambda$6$toPx(int i, float f) {
        return (int) (i / f);
    }

    public static /* synthetic */ v57 b(AndroidWebViewContainer androidWebViewContainer, View view, v57 v57Var) {
        return applySafeAreaInsets$lambda$6(androidWebViewContainer, view, v57Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRenderProcessGone(defpackage.vz0 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r13)
            goto L3a
        L25:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r12)
            r12 = 0
            return r12
        L2c:
            defpackage.m37.N(r13)
            r0.label = r2
            java.lang.Object r13 = r12.destroy(r0)
            w11 r0 = defpackage.w11.x
            if (r13 != r0) goto L3a
            return r0
        L3a:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r1 = r12.sendDiagnosticEvent
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType r2 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED
            r10 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r13 = r12.sendWebViewClientErrorDiagnostics
            com.unity3d.ads.adplayer.model.WebViewClientError r0 = new com.unity3d.ads.adplayer.model.WebViewClientError
            com.unity3d.ads.adplayer.model.ErrorReason r2 = com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE
            r4 = 4
            java.lang.String r1 = "Render process gone"
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r0 = defpackage.te4.H(r0)
            com.unity3d.ads.core.data.model.AdObject r12 = r12.adObject
            r13.invoke(r0, r12)
            pn6 r12 = defpackage.pn6.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone(vz0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge r5, java.lang.String r6, defpackage.vz0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r7)     // Catch: java.util.concurrent.CancellationException -> L45
            goto L45
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r7)
            v11 r7 = r4.scope     // Catch: java.util.concurrent.CancellationException -> L45
            l11 r7 = r7.getCoroutineContext()     // Catch: java.util.concurrent.CancellationException -> L45
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2 r1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2     // Catch: java.util.concurrent.CancellationException -> L45
            r1.<init>(r4, r6, r5, r2)     // Catch: java.util.concurrent.CancellationException -> L45
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L45
            java.lang.Object r4 = defpackage.tl7.V(r7, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L45
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L45
            return r5
        L45:
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge, java.lang.String, vz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object destroy(defpackage.vz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r5)
            goto L4b
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r5)
            v11 r5 = r4.scope
            l11 r5 = r5.getCoroutineContext()
            la4 r1 = defpackage.la4.x
            l11 r5 = r5.plus(r1)
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2 r1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2
            r1.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = defpackage.tl7.V(r5, r1, r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L4b
            return r0
        L4b:
            v11 r4 = r4.scope
            defpackage.db.t(r4, r2)
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy(vz0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(3:17|18|19))(3:30|31|(2:33|23)(1:34))|20|21|22|23))|37|6|7|(0)(0)|20|21|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if (r9.G(r1) == r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        if (r12.a(r1) == r8) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object evaluateJavascript(com.unity3d.ads.adplayer.HandlerType r10, org.json.JSONArray r11, defpackage.vz0 r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript(com.unity3d.ads.adplayer.HandlerType, org.json.JSONArray, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public qx5 getLastInputEvent() {
        return this.lastInputEvent;
    }

    public final v11 getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public WebView getWebView() {
        return this.webView;
    }

    public final x44 get_lastInputEvent() {
        return this._lastInputEvent;
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public qx5 isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (destroy(r0) == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r9 != r6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (defpackage.tl7.V(r9, r1, r0) == r6) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadUrl(java.lang.String r8, defpackage.vz0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L30
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L30:
            java.lang.Object r8 = r0.L$0
            java.util.List r8 = (java.util.List) r8
            defpackage.m37.N(r9)
            goto L7a
        L38:
            defpackage.m37.N(r9)
            goto L66
        L3c:
            defpackage.m37.N(r9)
            goto L57
        L40:
            defpackage.m37.N(r9)
            v11 r9 = r7.scope
            l11 r9 = r9.getCoroutineContext()
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2 r1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2
            r1.<init>(r7, r8, r2)
            r0.label = r5
            java.lang.Object r8 = defpackage.tl7.V(r9, r1, r0)
            if (r8 != r6) goto L57
            goto L79
        L57:
            com.unity3d.ads.adplayer.AndroidWebViewClient r8 = r7.webViewClient
            nc1 r8 = r8.getOnLoadFinished()
            r0.label = r4
            java.lang.Object r9 = r8.p(r0)
            if (r9 != r6) goto L66
            goto L79
        L66:
            r8 = r9
            java.util.List r8 = (java.util.List) r8
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L87
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r7.destroy(r0)
            if (r9 != r6) goto L7a
        L79:
            return r6
        L7a:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r9 = r7.sendWebViewClientErrorDiagnostics
            com.unity3d.ads.core.data.model.AdObject r7 = r7.adObject
            r9.invoke(r8, r7)
            com.unity3d.ads.adplayer.LoadWebViewError r7 = new com.unity3d.ads.adplayer.LoadWebViewError
            r7.<init>(r8)
            throw r7
        L87:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl(java.lang.String, vz0):java.lang.Object");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final StringBuilder getSHARED_STRING_BUILDER() {
            return AndroidWebViewContainer.SHARED_STRING_BUILDER;
        }

        public final k54 getSHARED_STRING_MUTEX() {
            return AndroidWebViewContainer.SHARED_STRING_MUTEX;
        }

        private Companion() {
        }

        public static /* synthetic */ void getSHARED_STRING_BUILDER$annotations() {
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends t36 implements ic2 {
        int label;

        public AnonymousClass2(vz0 vz0Var) {
            super(2, vz0Var);
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass2(vz0Var);
        }

        public final Object invoke(boolean z, vz0 vz0Var) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                Object onRenderProcessGone = androidWebViewContainer.onRenderProcessGone(this);
                w11 w11Var = w11.x;
                if (onRenderProcessGone == w11Var) {
                    return w11Var;
                }
            }
            return pn6.a;
        }

        @Override // defpackage.ic2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (vz0) obj2);
        }
    }

    public /* synthetic */ AndroidWebViewContainer(WebView webView, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, n11 n11Var, n11 n11Var2, v11 v11Var, Context context, AdObject adObject, SendDiagnosticEvent sendDiagnosticEvent, boolean z, int i, q71 q71Var) {
        this(webView, androidWebViewClient, sendWebViewClientErrorDiagnostics, n11Var, n11Var2, v11Var, context, adObject, sendDiagnosticEvent, (i & 512) != 0 ? true : z);
    }
}
