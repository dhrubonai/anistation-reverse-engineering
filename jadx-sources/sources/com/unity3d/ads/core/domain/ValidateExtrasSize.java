package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.MapExtensionsKt;
import defpackage.ai4;
import defpackage.vn3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ValidateExtrasSize {
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public ValidateExtrasSize(SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        sessionRepository.getClass();
        sendDiagnosticEvent.getClass();
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public static /* synthetic */ void invoke$default(ValidateExtrasSize validateExtrasSize, Map map, String str, AdObject adObject, int i, Object obj) {
        if ((i & 4) != 0) {
            adObject = null;
        }
        validateExtrasSize.invoke(map, str, adObject);
    }

    public final void invoke(Map<String, String> map, String str, AdObject adObject) {
        int maxExtrasSizeKb;
        int sizeInKb;
        map.getClass();
        str.getClass();
        if (!map.isEmpty() && (maxExtrasSizeKb = this.sessionRepository.getNativeConfiguration().getMaxExtrasSizeKb()) > 0 && (sizeInKb = MapExtensionsKt.sizeInKb(map)) >= maxExtrasSizeKb) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE, (Double) null, vn3.T(new ai4("source", str), new ai4("size_kb", String.valueOf(sizeInKb))), (Map) null, adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 234, (Object) null);
        }
    }
}
