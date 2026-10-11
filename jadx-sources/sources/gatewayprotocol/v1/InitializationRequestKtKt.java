package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class InitializationRequestKtKt {
    /* renamed from: -initializeinitializationRequest, reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationRequest m109initializeinitializationRequest(ub2 ub2Var) {
        ub2Var.getClass();
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationRequest.Builder newBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
        newBuilder.getClass();
        InitializationRequestKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest copy(InitializationRequestOuterClass.InitializationRequest initializationRequest, ub2 ub2Var) {
        initializationRequest.getClass();
        ub2Var.getClass();
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationRequest.Builder builder = initializationRequest.toBuilder();
        builder.getClass();
        InitializationRequestKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        initializationRequestOrBuilder.getClass();
        if (initializationRequestOrBuilder.hasClientInfo()) {
            return initializationRequestOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        initializationRequestOrBuilder.getClass();
        if (initializationRequestOrBuilder.hasDeviceInfo()) {
            return initializationRequestOrBuilder.getDeviceInfo();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.InstallReferrer getInstallReferrerOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        initializationRequestOrBuilder.getClass();
        if (initializationRequestOrBuilder.hasInstallReferrer()) {
            return initializationRequestOrBuilder.getInstallReferrer();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.QuickCapabilities getQuickCapabilitiesOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        initializationRequestOrBuilder.getClass();
        if (initializationRequestOrBuilder.hasQuickCapabilities()) {
            return initializationRequestOrBuilder.getQuickCapabilities();
        }
        return null;
    }
}
