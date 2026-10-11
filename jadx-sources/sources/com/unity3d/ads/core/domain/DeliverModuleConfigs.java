package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.InitializationResponseOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface DeliverModuleConfigs {
    void invoke(InitializationResponseOuterClass.InitializationResponse initializationResponse);

    void notifyFailure(String str);
}
