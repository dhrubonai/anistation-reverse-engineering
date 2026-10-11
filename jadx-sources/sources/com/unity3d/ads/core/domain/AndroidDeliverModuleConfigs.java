package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.UnityAdsInitModuleListener;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import defpackage.ai4;
import defpackage.an3;
import defpackage.k54;
import defpackage.m54;
import defpackage.n11;
import defpackage.ot1;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vn3;
import defpackage.y45;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidDeliverModuleConfigs implements DeliverModuleConfigs {
    private final GetInitModuleListeners getInitModuleListeners;
    private final GetIsModulesInitEnabled getIsModulesInitEnabled;
    private final n11 ioDispatcher;
    private final ConcurrentHashMap<UnityAdsInitModuleListener, k54> listenerLocks;
    private final v11 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public AndroidDeliverModuleConfigs(GetInitModuleListeners getInitModuleListeners, SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent, v11 v11Var, n11 n11Var, GetIsModulesInitEnabled getIsModulesInitEnabled) {
        getInitModuleListeners.getClass();
        sessionRepository.getClass();
        sendDiagnosticEvent.getClass();
        v11Var.getClass();
        n11Var.getClass();
        getIsModulesInitEnabled.getClass();
        this.getInitModuleListeners = getInitModuleListeners;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scope = v11Var;
        this.ioDispatcher = n11Var;
        this.getIsModulesInitEnabled = getIsModulesInitEnabled;
        this.listenerLocks = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void deliver(com.unity3d.ads.UnityAdsInitModuleListener r17, gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse r18, java.util.Map<java.lang.String, ? extends java.lang.Object> r19) {
        /*
            r16 = this;
            r1 = r17
            long r2 = defpackage.j04.b()
            r4 = 0
            r5 = 1
            r6 = 0
            java.lang.String r9 = r1.moduleName()     // Catch: java.lang.Throwable -> Lab
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType r8 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED     // Catch: java.lang.Throwable -> L3d
            r13 = 28
            r14 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r7 = r16
            sendModuleDiagnostic$default(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L3d
            java.util.List r0 = r18.getModulesList()     // Catch: java.lang.Throwable -> L3d
            r0.getClass()     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3d
        L25:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L42
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L3d
            r8 = r7
            gatewayprotocol.v1.ModuleOuterClass$Module r8 = (gatewayprotocol.v1.ModuleOuterClass.Module) r8     // Catch: java.lang.Throwable -> L3d
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L3d
            boolean r8 = defpackage.b06.C(r8, r9, r5)     // Catch: java.lang.Throwable -> L3d
            if (r8 == 0) goto L25
            goto L43
        L3d:
            r0 = move-exception
        L3e:
            r7 = r6
        L3f:
            r12 = r9
            goto Laf
        L42:
            r7 = r4
        L43:
            gatewayprotocol.v1.ModuleOuterClass$Module r7 = (gatewayprotocol.v1.ModuleOuterClass.Module) r7     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L4c
            com.google.protobuf.ByteString r0 = r7.getConfig()     // Catch: java.lang.Throwable -> L3d
            goto L4d
        L4c:
            r0 = r4
        L4d:
            if (r0 == 0) goto L7f
            boolean r7 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L56
            goto L7f
        L56:
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L7c
            r0.getClass()     // Catch: java.lang.Throwable -> L7c
            r7 = r19
            r1.onSuccess(r0, r7)     // Catch: java.lang.Throwable -> L7c
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType r8 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_SUCCESS     // Catch: java.lang.Throwable -> L7c
            bf6 r0 = new bf6     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            double r10 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch: java.lang.Throwable -> L7c
            r13 = 24
            r14 = 0
            r11 = 0
            r12 = 0
            r7 = r16
            sendModuleDiagnostic$default(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L7c
            return
        L7c:
            r0 = move-exception
            r7 = r5
            goto L3f
        L7f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = "no config for "
            r0.append(r7)     // Catch: java.lang.Throwable -> L3d
            r0.append(r9)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L3d
            r0 = 2
            r1.onFailure(r12, r0)     // Catch: java.lang.Throwable -> L7c
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType r8 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_FAILURE     // Catch: java.lang.Throwable -> L7c
            bf6 r0 = new bf6     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            double r10 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r11 = "no_config"
            r7 = r16
            r7.sendModuleDiagnostic(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7c
            return
        Lab:
            r0 = move-exception
            java.lang.String r9 = ""
            goto L3e
        Laf:
            java.lang.String r8 = r0.getMessage()
            if (r8 != 0) goto Lb7
            java.lang.String r8 = "module init failed"
        Lb7:
            if (r7 != 0) goto Lbd
            r7 = 3
            r1.onFailure(r8, r7)     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType r11 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_FAILURE
            bf6 r1 = new bf6
            r1.<init>(r2)
            double r1 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r1)
            java.lang.Double r13 = java.lang.Double.valueOf(r1)
            java.lang.String r14 = "uncaught_exception"
            java.lang.String r15 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r0, r6, r5, r4)
            r10 = r16
            r10.sendModuleDiagnostic(r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs.deliver(com.unity3d.ads.UnityAdsInitModuleListener, gatewayprotocol.v1.InitializationResponseOuterClass$InitializationResponse, java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(UnityAdsInitModuleListener unityAdsInitModuleListener, String str) {
        Object y45Var;
        try {
            unityAdsInitModuleListener.onFailure(str, 1);
        } catch (Throwable unused) {
        }
        try {
            y45Var = unityAdsInitModuleListener.moduleName();
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (y45Var instanceof y45) {
            y45Var = "unknown";
        }
        sendModuleDiagnostic$default(this, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_FAILURE, (String) y45Var, null, "failed", str, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k54 lockFor(UnityAdsInitModuleListener unityAdsInitModuleListener) {
        k54 putIfAbsent;
        ConcurrentHashMap<UnityAdsInitModuleListener, k54> concurrentHashMap = this.listenerLocks;
        k54 k54Var = concurrentHashMap.get(unityAdsInitModuleListener);
        if (k54Var == null && (putIfAbsent = concurrentHashMap.putIfAbsent(unityAdsInitModuleListener, (k54Var = new m54()))) != null) {
            k54Var = putIfAbsent;
        }
        return k54Var;
    }

    private final void sendModuleDiagnostic(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Double d, String str2, String str3) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        an3 an3Var = new an3();
        an3Var.put("module_name", str);
        if (str2 != null) {
        }
        if (str3 != null) {
            an3Var.put("reason_debug", str3);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d, an3Var.b(), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 248, (Object) null);
    }

    public static /* synthetic */ void sendModuleDiagnostic$default(AndroidDeliverModuleConfigs androidDeliverModuleConfigs, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Double d, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            d = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        androidDeliverModuleConfigs.sendModuleDiagnostic(diagnosticEventType, str, d, str2, str3);
    }

    private final Map<String, Object> sessionExtras() {
        Object y45Var;
        try {
            y45Var = vn3.T(new ai4("sessionId", ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()).toString()), new ai4("sessionToken", this.sessionRepository.getSessionToken().toByteArray()));
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (y45Var instanceof y45) {
            y45Var = ot1.x;
        }
        return (Map) y45Var;
    }

    @Override // com.unity3d.ads.core.domain.DeliverModuleConfigs
    public void invoke(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
        initializationResponse.getClass();
        if (this.getIsModulesInitEnabled.invoke()) {
            List<UnityAdsInitModuleListener> invoke = this.getInitModuleListeners.invoke();
            if (!invoke.isEmpty()) {
                Map<String, Object> sessionExtras = sessionExtras();
                Iterator<T> it = invoke.iterator();
                while (it.hasNext()) {
                    AndroidDeliverModuleConfigs androidDeliverModuleConfigs = this;
                    InitializationResponseOuterClass.InitializationResponse initializationResponse2 = initializationResponse;
                    tl7.z(this.scope, this.ioDispatcher, null, new AndroidDeliverModuleConfigs$invoke$1$1(androidDeliverModuleConfigs, (UnityAdsInitModuleListener) it.next(), initializationResponse2, sessionExtras, null), 2);
                    this = androidDeliverModuleConfigs;
                    initializationResponse = initializationResponse2;
                }
            }
        }
    }

    @Override // com.unity3d.ads.core.domain.DeliverModuleConfigs
    public void notifyFailure(String str) {
        str.getClass();
        if (this.getIsModulesInitEnabled.invoke()) {
            List<UnityAdsInitModuleListener> invoke = this.getInitModuleListeners.invoke();
            if (!invoke.isEmpty()) {
                Iterator<T> it = invoke.iterator();
                while (it.hasNext()) {
                    tl7.z(this.scope, this.ioDispatcher, null, new AndroidDeliverModuleConfigs$notifyFailure$1$1(this, (UnityAdsInitModuleListener) it.next(), str, null), 2);
                }
            }
        }
    }
}
