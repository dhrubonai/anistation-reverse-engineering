package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.UnityAdsInitModuleListener;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetInitModuleListeners;
import com.unity3d.ads.core.domain.GetIsModulesInitEnabled;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import defpackage.ai3;
import defpackage.ai4;
import defpackage.bf6;
import defpackage.j04;
import defpackage.n11;
import defpackage.nt1;
import defpackage.ot1;
import defpackage.pn6;
import defpackage.te4;
import defpackage.tl7;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.y45;
import defpackage.z45;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ModuleInitParamsKt;
import gatewayprotocol.v1.ModuleInitParamsOuterClass;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidModuleInitParamsDataSource implements ModuleInitParamsDataSource {
    private final GetInitModuleListeners getInitModuleListeners;
    private final GetIsModulesInitEnabled getIsModulesInitEnabled;
    private final n11 ioDispatcher;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidModuleInitParamsDataSource(GetInitModuleListeners getInitModuleListeners, SendDiagnosticEvent sendDiagnosticEvent, n11 n11Var, GetIsModulesInitEnabled getIsModulesInitEnabled) {
        getInitModuleListeners.getClass();
        sendDiagnosticEvent.getClass();
        n11Var.getClass();
        getIsModulesInitEnabled.getClass();
        this.getInitModuleListeners = getInitModuleListeners;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.ioDispatcher = n11Var;
        this.getIsModulesInitEnabled = getIsModulesInitEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ModuleInitParamsOuterClass.ModuleInitParams> collectInitParams() {
        Object y45Var;
        Object y45Var2;
        ai3 y = te4.y();
        ot1 ot1Var = ot1.x;
        for (UnityAdsInitModuleListener unityAdsInitModuleListener : this.getInitModuleListeners.invoke()) {
            long b = j04.b();
            try {
                String moduleName = unityAdsInitModuleListener.moduleName();
                SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_PARAMS_STARTED;
                Map singletonMap = Collections.singletonMap("module_name", moduleName);
                singletonMap.getClass();
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, (Double) null, singletonMap, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
                byte[] initParams = unityAdsInitModuleListener.initParams(ot1Var);
                if (initParams != null) {
                    ModuleInitParamsKt.Dsl.Companion companion = ModuleInitParamsKt.Dsl.Companion;
                    ModuleInitParamsOuterClass.ModuleInitParams.Builder newBuilder = ModuleInitParamsOuterClass.ModuleInitParams.newBuilder();
                    newBuilder.getClass();
                    ModuleInitParamsKt.Dsl _create = companion._create(newBuilder);
                    _create.setName(moduleName);
                    _create.setParams(ByteStringsKt.toByteString(initParams));
                    _create.setClassName(unityAdsInitModuleListener.getClass().getName());
                    y.add(_create._build());
                }
                SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_PARAMS_SUCCESS_TIME;
                Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new bf6(b)));
                Map singletonMap2 = Collections.singletonMap("module_name", moduleName);
                singletonMap2.getClass();
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, valueOf, singletonMap2, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 248, (Object) null);
                y45Var = pn6.a;
            } catch (Throwable th) {
                y45Var = new y45(th);
            }
            Throwable b2 = z45.b(y45Var);
            if (b2 != null) {
                try {
                    y45Var2 = unityAdsInitModuleListener.moduleName();
                } catch (Throwable th2) {
                    y45Var2 = new y45(th2);
                }
                if (y45Var2 instanceof y45) {
                    y45Var2 = "";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_PARAMS_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(new bf6(b))), vn3.T(new ai4("module_name", (String) y45Var2), new ai4("reason", "uncaught_exception"), new ai4("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(b2, 0, 1, null))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 248, (Object) null);
            }
        }
        return te4.r(y);
    }

    @Override // com.unity3d.ads.core.data.datasource.ModuleInitParamsDataSource
    public Object invoke(vz0 vz0Var) {
        if (!this.getIsModulesInitEnabled.invoke()) {
            return nt1.x;
        }
        return tl7.V(this.ioDispatcher, new AndroidModuleInitParamsDataSource$invoke$2(this, null), vz0Var);
    }
}
