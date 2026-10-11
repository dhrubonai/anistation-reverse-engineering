package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.UnityAdsInitModuleListener;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import defpackage.bf6;
import defpackage.d46;
import defpackage.j04;
import defpackage.q71;
import defpackage.rb3;
import defpackage.y7;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetInitModuleListeners implements GetInitModuleListeners {
    private final ClassLoader classLoader;
    private final Logger logger;
    private final rb3 moduleListeners$delegate;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidGetInitModuleListeners(SendDiagnosticEvent sendDiagnosticEvent, Logger logger, ClassLoader classLoader) {
        sendDiagnosticEvent.getClass();
        logger.getClass();
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        this.classLoader = classLoader;
        this.moduleListeners$delegate = new d46(new y7(this, (byte) 9));
    }

    public final List<UnityAdsInitModuleListener> discover() {
        long b = j04.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_DISCOVERY_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 254, (Object) null);
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = ServiceLoader.load(UnityAdsInitModuleListener.class, this.classLoader).iterator();
            it.getClass();
            while (it.hasNext()) {
                try {
                    Object next = it.next();
                    next.getClass();
                    arrayList.add(next);
                } catch (Throwable th) {
                    this.logger.error("Failed to load an init module listener", th);
                }
            }
        } catch (Throwable th2) {
            this.logger.error("Init module listener discovery failed", th2);
        }
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_DISCOVERY_COMPLETED_TIME;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new bf6(b)));
        Map singletonMap = Collections.singletonMap("module_count", Integer.valueOf(arrayList.size()));
        singletonMap.getClass();
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, (Map) null, singletonMap, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 244, (Object) null);
        return arrayList;
    }

    private final List<UnityAdsInitModuleListener> getModuleListeners() {
        return (List) this.moduleListeners$delegate.getValue();
    }

    @Override // com.unity3d.ads.core.domain.GetInitModuleListeners
    public List<UnityAdsInitModuleListener> invoke() {
        return getModuleListeners();
    }

    public /* synthetic */ AndroidGetInitModuleListeners(SendDiagnosticEvent sendDiagnosticEvent, Logger logger, ClassLoader classLoader, int i, q71 q71Var) {
        this(sendDiagnosticEvent, logger, (i & 4) != 0 ? AndroidGetInitModuleListeners.class.getClassLoader() : classLoader);
    }
}
