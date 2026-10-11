package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MaxAdRevenueCommunicatorProxyFactory {
    private final Logger logger;

    public MaxAdRevenueCommunicatorProxyFactory(Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    public final CommunicatorSubscriberProxy create(String str, String str2, CommunicatorSubscriberProxy.CommunicatorMessageListener communicatorMessageListener) {
        str.getClass();
        str2.getClass();
        communicatorMessageListener.getClass();
        return new CommunicatorSubscriberProxy(str, str2, communicatorMessageListener, this.logger);
    }
}
