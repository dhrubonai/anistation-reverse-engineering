package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.QuickCapabilitiesKt;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class QuickCapabilitiesKtKt {
    /* renamed from: -initializequickCapabilities, reason: not valid java name */
    public static final InitializationRequestOuterClass.QuickCapabilities m130initializequickCapabilities(ub2 ub2Var) {
        ub2Var.getClass();
        QuickCapabilitiesKt.Dsl.Companion companion = QuickCapabilitiesKt.Dsl.Companion;
        InitializationRequestOuterClass.QuickCapabilities.Builder newBuilder = InitializationRequestOuterClass.QuickCapabilities.newBuilder();
        newBuilder.getClass();
        QuickCapabilitiesKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.QuickCapabilities copy(InitializationRequestOuterClass.QuickCapabilities quickCapabilities, ub2 ub2Var) {
        quickCapabilities.getClass();
        ub2Var.getClass();
        QuickCapabilitiesKt.Dsl.Companion companion = QuickCapabilitiesKt.Dsl.Companion;
        InitializationRequestOuterClass.QuickCapabilities.Builder builder = quickCapabilities.toBuilder();
        builder.getClass();
        QuickCapabilitiesKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.QuickCapabilities.Android getAndroidOrNull(InitializationRequestOuterClass.QuickCapabilitiesOrBuilder quickCapabilitiesOrBuilder) {
        quickCapabilitiesOrBuilder.getClass();
        if (quickCapabilitiesOrBuilder.hasAndroid()) {
            return quickCapabilitiesOrBuilder.getAndroid();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.QuickCapabilities.Ios getIosOrNull(InitializationRequestOuterClass.QuickCapabilitiesOrBuilder quickCapabilitiesOrBuilder) {
        quickCapabilitiesOrBuilder.getClass();
        if (quickCapabilitiesOrBuilder.hasIos()) {
            return quickCapabilitiesOrBuilder.getIos();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.QuickCapabilities.Android copy(InitializationRequestOuterClass.QuickCapabilities.Android android2, ub2 ub2Var) {
        android2.getClass();
        ub2Var.getClass();
        QuickCapabilitiesKt.AndroidKt.Dsl.Companion companion = QuickCapabilitiesKt.AndroidKt.Dsl.Companion;
        InitializationRequestOuterClass.QuickCapabilities.Android.Builder builder = android2.toBuilder();
        builder.getClass();
        QuickCapabilitiesKt.AndroidKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.QuickCapabilities.Ios copy(InitializationRequestOuterClass.QuickCapabilities.Ios ios, ub2 ub2Var) {
        ios.getClass();
        ub2Var.getClass();
        QuickCapabilitiesKt.IosKt.Dsl.Companion companion = QuickCapabilitiesKt.IosKt.Dsl.Companion;
        InitializationRequestOuterClass.QuickCapabilities.Ios.Builder builder = ios.toBuilder();
        builder.getClass();
        QuickCapabilitiesKt.IosKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}
