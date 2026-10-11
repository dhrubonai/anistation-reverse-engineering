package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.LifecycleEventRequestKt;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class LifecycleEventRequestKtKt {
    /* renamed from: -initializelifecycleEventRequest, reason: not valid java name */
    public static final LifecycleEventRequestOuterClass.LifecycleEventRequest m112initializelifecycleEventRequest(ub2 ub2Var) {
        ub2Var.getClass();
        LifecycleEventRequestKt.Dsl.Companion companion = LifecycleEventRequestKt.Dsl.Companion;
        LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder newBuilder = LifecycleEventRequestOuterClass.LifecycleEventRequest.newBuilder();
        newBuilder.getClass();
        LifecycleEventRequestKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final LifecycleEventRequestOuterClass.LifecycleEventRequest copy(LifecycleEventRequestOuterClass.LifecycleEventRequest lifecycleEventRequest, ub2 ub2Var) {
        lifecycleEventRequest.getClass();
        ub2Var.getClass();
        LifecycleEventRequestKt.Dsl.Companion companion = LifecycleEventRequestKt.Dsl.Companion;
        LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder builder = lifecycleEventRequest.toBuilder();
        builder.getClass();
        LifecycleEventRequestKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder lifecycleEventRequestOrBuilder) {
        lifecycleEventRequestOrBuilder.getClass();
        if (lifecycleEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return lifecycleEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder lifecycleEventRequestOrBuilder) {
        lifecycleEventRequestOrBuilder.getClass();
        if (lifecycleEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return lifecycleEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
