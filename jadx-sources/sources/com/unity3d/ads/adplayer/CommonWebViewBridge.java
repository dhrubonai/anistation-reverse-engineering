package com.unity3d.ads.adplayer;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import defpackage.ai4;
import defpackage.db;
import defpackage.fn5;
import defpackage.h41;
import defpackage.ic2;
import defpackage.in5;
import defpackage.jn5;
import defpackage.ke0;
import defpackage.m37;
import defpackage.n11;
import defpackage.ot1;
import defpackage.pn6;
import defpackage.r11;
import defpackage.sb2;
import defpackage.t36;
import defpackage.t44;
import defpackage.te4;
import defpackage.tl7;
import defpackage.tt1;
import defpackage.tx5;
import defpackage.v11;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.x44;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final t44 _onInvocation;
    private final x44 callbacks;
    private Map<String, ? extends sb2> exposedFunctions;
    private final Logger logger;
    private final fn5 onInvocation;
    private final v11 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        int label;

        public AnonymousClass1(vz0 vz0Var) {
            super(2, vz0Var);
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass1(vz0Var);
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
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
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                Object addJavascriptInterface = webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this);
                w11 w11Var = w11.x;
                if (addJavascriptInterface == w11Var) {
                    return w11Var;
                }
            }
            return pn6.a;
        }
    }

    public CommonWebViewBridge(n11 n11Var, WebViewContainer webViewContainer, v11 v11Var, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        n11Var.getClass();
        webViewContainer.getClass();
        v11Var.getClass();
        sendDiagnosticEvent.getClass();
        logger.getClass();
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        ke0 g0 = db.g0(db.g0(v11Var, n11Var), new r11("CommonWebViewBridge"));
        this.scope = g0;
        this.callbacks = tx5.a(tt1.x);
        in5 b = jn5.b(0, 64, null, 5);
        this._onInvocation = b;
        this.onInvocation = h41.c(b);
        this.exposedFunctions = ot1.x;
        tl7.z(g0, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, vz0 vz0Var) {
        Object evaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, vz0Var);
        if (evaluateJavascript == w11.x) {
            return evaluateJavascript;
        }
        return pn6.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|87|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ac, code lost:
    
        if (respond(r3, "ERROR", new java.lang.Object[]{r4}, r5) == r12) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0050, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0051, code lost:
    
        r3 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0041, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b1, code lost:
    
        r3 = new defpackage.y45(r0);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0139 A[Catch: all -> 0x00ad, TryCatch #3 {all -> 0x00ad, blocks: (B:30:0x0131, B:32:0x0139, B:46:0x00fe, B:48:0x0102, B:51:0x0113, B:53:0x0117, B:56:0x015a, B:62:0x008c, B:64:0x009c, B:67:0x00b0, B:69:0x00c0, B:71:0x00c8, B:73:0x00d6, B:76:0x00eb, B:79:0x016c, B:80:0x018a), top: B:61:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102 A[Catch: all -> 0x00ad, TryCatch #3 {all -> 0x00ad, blocks: (B:30:0x0131, B:32:0x0139, B:46:0x00fe, B:48:0x0102, B:51:0x0113, B:53:0x0117, B:56:0x015a, B:62:0x008c, B:64:0x009c, B:67:0x00b0, B:69:0x00c0, B:71:0x00c8, B:73:0x00d6, B:76:0x00eb, B:79:0x016c, B:80:0x018a), top: B:61:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113 A[Catch: all -> 0x00ad, TryCatch #3 {all -> 0x00ad, blocks: (B:30:0x0131, B:32:0x0139, B:46:0x00fe, B:48:0x0102, B:51:0x0113, B:53:0x0117, B:56:0x015a, B:62:0x008c, B:64:0x009c, B:67:0x00b0, B:69:0x00c0, B:71:0x00c8, B:73:0x00d6, B:76:0x00eb, B:79:0x016c, B:80:0x018a), top: B:61:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleInvocationResult(com.unity3d.ads.adplayer.Invocation r23, java.lang.String r24, defpackage.vz0 r25) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleInvocationResult(com.unity3d.ads.adplayer.Invocation, java.lang.String, vz0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, vz0 vz0Var) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object execute = execute(HandlerType.CALLBACK, new JSONArray((Collection) te4.H(jSONArray)), vz0Var);
        if (execute == w11.x) {
            return execute;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Map<String, sb2> getExposedFunctions() {
        return this.exposedFunctions;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public fn5 getOnInvocation() {
        return this.onInvocation;
    }

    public final v11 getScope() {
        return this.scope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r5.equals("OK") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        ((defpackage.zq0) r4).Q(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r5.equals("success") == false) goto L35;
     */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleCallback(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r6)
            java.lang.Object[] r6 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r0)
            x44 r0 = r3.callbacks
            sx5 r0 = (defpackage.sx5) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            r2 = r1
            ai4 r2 = (defpackage.ai4) r2
            java.lang.Object r2 = r2.x
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = defpackage.a34.i(r2, r4)
            if (r2 == 0) goto L20
            goto L39
        L38:
            r1 = 0
        L39:
            ai4 r1 = (defpackage.ai4) r1
            if (r1 != 0) goto L3f
            goto Lad
        L3f:
            java.lang.Object r4 = r1.y
            yq0 r4 = (defpackage.yq0) r4
            int r0 = r5.hashCode()
            r2 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r0 == r2) goto L89
            r2 = 2524(0x9dc, float:3.537E-42)
            if (r0 == r2) goto L80
            r2 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r0 == r2) goto L64
            r2 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r0 == r2) goto L5b
            goto L97
        L5b:
            java.lang.String r0 = "error"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6d
            goto L97
        L64:
            java.lang.String r0 = "ERROR"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6d
            goto L97
        L6d:
            java.lang.Exception r5 = new java.lang.Exception
            r0 = 0
            r6 = r6[r0]
            r6.getClass()
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            zq0 r4 = (defpackage.zq0) r4
            r4.g0(r5)
            goto L97
        L80:
            java.lang.String r0 = "OK"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L92
            goto L97
        L89:
            java.lang.String r0 = "success"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L92
            goto L97
        L92:
            zq0 r4 = (defpackage.zq0) r4
            r4.Q(r6)
        L97:
            x44 r3 = r3.callbacks
        L99:
            r4 = r3
            sx5 r4 = (defpackage.sx5) r4
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            java.util.LinkedHashSet r6 = defpackage.el5.V(r6, r1)
            boolean r4 = r4.j(r5, r6)
            if (r4 == 0) goto L99
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String str) {
        JSONArray jSONArray;
        String str2;
        String str3;
        JSONArray jSONArray2;
        String str4;
        str.getClass();
        try {
            try {
                JSONArray jSONArray3 = new JSONArray(str);
                int length = jSONArray3.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray3.get(i);
                    if (obj instanceof JSONArray) {
                        jSONArray = (JSONArray) obj;
                    } else {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        if (jSONArray.length() == 4) {
                            Object obj2 = jSONArray.get(0);
                            if (obj2 instanceof String) {
                                str2 = (String) obj2;
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                Object obj3 = jSONArray.get(1);
                                if (obj3 instanceof String) {
                                    str3 = (String) obj3;
                                } else {
                                    str3 = null;
                                }
                                if (str3 != null) {
                                    Object obj4 = jSONArray.get(2);
                                    if (obj4 instanceof JSONArray) {
                                        jSONArray2 = (JSONArray) obj4;
                                    } else {
                                        jSONArray2 = null;
                                    }
                                    if (jSONArray2 != null) {
                                        Object obj5 = jSONArray.get(3);
                                        if (obj5 instanceof String) {
                                            str4 = (String) obj5;
                                        } else {
                                            str4 = null;
                                        }
                                        if (str4 != null) {
                                            String str5 = str2 + '.' + str3;
                                            this.logger.debug("Unity Ads WebView calling for: " + str5 + '(' + jSONArray2 + ')');
                                            tl7.z(this.scope, null, null, new CommonWebViewBridge$handleInvocation$7(str5, jSONArray2, this, str4, null), 3);
                                        } else {
                                            throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + str).toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + str).toString());
                                    }
                                } else {
                                    throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + str).toString());
                                }
                            } else {
                                throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + str).toString());
                            }
                        } else {
                            throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray).toString());
                        }
                    } else {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + str).toString());
                    }
                }
            } catch (JSONException e) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: ".concat(str), e);
            }
        } catch (Throwable th) {
            this.logger.error("Error handling invocation from webview (" + str + ')', th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, vn3.T(new ai4("reason_debug", message), new ai4("webview_invocation", str)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: ".concat(str), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object request(java.lang.String r12, java.lang.String r13, java.lang.Object[] r14, defpackage.vz0 r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = (com.unity3d.ads.adplayer.CommonWebViewBridge$request$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 0
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r2) goto L2b
            defpackage.m37.N(r15)
            return r15
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r11)
            return r3
        L31:
            java.lang.Object r11 = r0.L$0
            yq0 r11 = (defpackage.yq0) r11
            defpackage.m37.N(r15)
            goto L8b
        L39:
            defpackage.m37.N(r15)
            zq0 r15 = defpackage.tl7.c()
            int r1 = r15.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            x44 r6 = r11.callbacks
        L4a:
            r7 = r6
            sx5 r7 = (defpackage.sx5) r7
            java.lang.Object r8 = r7.getValue()
            r9 = r8
            java.util.Set r9 = (java.util.Set) r9
            ai4 r10 = new ai4
            r10.<init>(r1, r15)
            java.util.LinkedHashSet r9 = defpackage.el5.W(r9, r10)
            boolean r7 = r7.j(r8, r9)
            if (r7 == 0) goto L4a
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r6.put(r12)
            r6.put(r13)
            r6.put(r1)
            int r12 = r14.length
            r13 = 0
        L73:
            if (r13 >= r12) goto L7d
            r1 = r14[r13]
            r6.put(r1)
            int r13 = r13 + 1
            goto L73
        L7d:
            com.unity3d.ads.adplayer.HandlerType r12 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            r0.L$0 = r15
            r0.label = r4
            java.lang.Object r11 = r11.execute(r12, r6, r0)
            if (r11 != r5) goto L8a
            goto L97
        L8a:
            r11 = r15
        L8b:
            r0.L$0 = r3
            r0.label = r2
            zq0 r11 = (defpackage.zq0) r11
            java.lang.Object r11 = r11.o(r0)
            if (r11 != r5) goto L98
        L97:
            return r5
        L98:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, vz0 vz0Var) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object execute = execute(HandlerType.EVENT, jSONArray, vz0Var);
        if (execute == w11.x) {
            return execute;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void setExposedFunctions(Map<String, ? extends sb2> map) {
        map.getClass();
        this.exposedFunctions = map;
    }
}
