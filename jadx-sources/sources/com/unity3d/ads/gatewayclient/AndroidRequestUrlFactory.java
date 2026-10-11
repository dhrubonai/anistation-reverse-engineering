package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AndroidRequestUrlFactory implements RequestUrlFactory {
    private final SessionRepository sessionRepository;

    public AndroidRequestUrlFactory(SessionRepository sessionRepository) {
        sessionRepository.getClass();
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.gatewayclient.RequestUrlFactory
    public String getRequestUrl(OperationType operationType, String str) {
        InitializationResponseOuterClass.RequestType requestUrlOverrideType;
        String str2;
        Object obj;
        operationType.getClass();
        requestUrlOverrideType = AndroidRequestUrlFactoryKt.getRequestUrlOverrideType(operationType);
        if (requestUrlOverrideType != null) {
            Iterator<T> it = this.sessionRepository.getRequestUrlOverrides().iterator();
            while (true) {
                str2 = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((InitializationResponseOuterClass.RequestUrlOverride) obj).getRequestType() == requestUrlOverrideType) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride = (InitializationResponseOuterClass.RequestUrlOverride) obj;
            if (requestUrlOverride != null) {
                str2 = requestUrlOverride.getUrl();
            }
            if (str2 != null) {
                return str2;
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
