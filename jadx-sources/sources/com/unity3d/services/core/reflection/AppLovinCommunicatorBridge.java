package com.unity3d.services.core.reflection;

import android.content.Context;
import defpackage.ai4;
import defpackage.q71;
import defpackage.vn3;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AppLovinCommunicatorBridge extends GenericBridge {
    private static final String CLASS_NAME = "com.applovin.communicator.AppLovinCommunicator";
    public static final Companion Companion = new Companion(null);
    private static final String GET_INSTANCE = "getInstance";
    private static final String SUBSCRIBE = "subscribe";
    private static final String UNSUBSCRIBE = "unsubscribe";
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLovinCommunicatorBridge(Context context) {
        super(Companion.buildFunctionMap(), false);
        context.getClass();
        this.context = context;
    }

    private final Object getCommunicatorInstance() {
        return callNonVoidMethod("getInstance", null, this.context);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return CLASS_NAME;
    }

    public final Object subscribe(CommunicatorSubscriberProxy communicatorSubscriberProxy, String str) {
        communicatorSubscriberProxy.getClass();
        str.getClass();
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return null;
        }
        try {
            Object proxyInstance = communicatorSubscriberProxy.getProxyInstance();
            callVoidMethod(SUBSCRIBE, communicatorInstance, proxyInstance, str);
            return proxyInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final void unsubscribe(Object obj, String str) {
        obj.getClass();
        str.getClass();
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return;
        }
        callVoidMethod(UNSUBSCRIBE, communicatorInstance, obj, str);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Class<?>[]> buildFunctionMap() {
            LinkedHashMap U = vn3.U(new ai4("getInstance", new Class[]{Context.class}));
            try {
                Class<?> cls = Class.forName("com.applovin.communicator.AppLovinCommunicatorSubscriber");
                U.put(AppLovinCommunicatorBridge.SUBSCRIBE, new Class[]{cls, String.class});
                U.put(AppLovinCommunicatorBridge.UNSUBSCRIBE, new Class[]{cls, String.class});
            } catch (ClassNotFoundException unused) {
            }
            return U;
        }

        private Companion() {
        }
    }
}
