package com.unity3d.services.core.reflection;

import android.os.Bundle;
import com.unity3d.ads.core.log.Logger;
import defpackage.a34;
import defpackage.q71;
import defpackage.qx1;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommunicatorSubscriberProxy extends GenericListenerProxy {
    public static final Companion Companion = new Companion(null);
    private static final String GET_COMMUNICATOR_ID = "getCommunicatorId";
    private static final String MESSAGE_CLASS = "com.applovin.communicator.AppLovinCommunicatorMessage";
    private static final String ON_MESSAGE_RECEIVED = "onMessageReceived";
    private static final String SUBSCRIBER_CLASS = "com.applovin.communicator.AppLovinCommunicatorSubscriber";
    private final String communicatorId;
    private final Logger logger;
    private final CommunicatorMessageListener messageListener;
    private final String topic;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public interface CommunicatorMessageListener {
        void onMessageReceived(Bundle bundle);
    }

    public CommunicatorSubscriberProxy(String str, String str2, CommunicatorMessageListener communicatorMessageListener, Logger logger) {
        str.getClass();
        str2.getClass();
        communicatorMessageListener.getClass();
        logger.getClass();
        this.communicatorId = str;
        this.topic = str2;
        this.messageListener = communicatorMessageListener;
        this.logger = logger;
    }

    private final void handleMessage(Object obj) {
        String str;
        try {
            Class<?> cls = Class.forName(MESSAGE_CLASS);
            Object invoke = cls.getMethod("getTopic", null).invoke(obj, null);
            if (invoke instanceof String) {
                str = (String) invoke;
            } else {
                str = null;
            }
            if (a34.i(this.topic, str)) {
                Object invoke2 = cls.getMethod("getMessageData", null).invoke(obj, null);
                if (invoke2 instanceof Bundle) {
                    this.messageListener.onMessageReceived((Bundle) invoke2);
                }
            }
        } catch (Exception e) {
            this.logger.trace("Failed to handle proxy communicator message", e);
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() {
        return Class.forName(SUBSCRIBER_CLASS);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        String name = method.getName();
        if (name != null) {
            boolean z = false;
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals("toString")) {
                        return qx1.p(new StringBuilder("CommunicatorSubscriber("), this.communicatorId, ')');
                    }
                    break;
                case -1437096151:
                    if (name.equals(ON_MESSAGE_RECEIVED) && objArr != null && objArr.length != 0) {
                        handleMessage(objArr[0]);
                    }
                    return null;
                case -1295482945:
                    if (name.equals("equals")) {
                        if (objArr != null && objArr.length == 1 && obj == objArr[0]) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    break;
                case 147696667:
                    if (name.equals("hashCode")) {
                        return Integer.valueOf(System.identityHashCode(obj));
                    }
                    break;
                case 1974057286:
                    if (name.equals(GET_COMMUNICATOR_ID)) {
                        return this.communicatorId;
                    }
                    break;
            }
        }
        return null;
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
}
