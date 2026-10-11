package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.AccelerometerCollectionConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AccelerometerCollectionConfigurationKtKt {
    /* renamed from: -initializeaccelerometerCollectionConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.AccelerometerCollectionConfiguration m67initializeaccelerometerCollectionConfiguration(ub2 ub2Var) {
        ub2Var.getClass();
        AccelerometerCollectionConfigurationKt.Dsl.Companion companion = AccelerometerCollectionConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AccelerometerCollectionConfiguration.Builder newBuilder = NativeConfigurationOuterClass.AccelerometerCollectionConfiguration.newBuilder();
        newBuilder.getClass();
        AccelerometerCollectionConfigurationKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.AccelerometerCollectionConfiguration copy(NativeConfigurationOuterClass.AccelerometerCollectionConfiguration accelerometerCollectionConfiguration, ub2 ub2Var) {
        accelerometerCollectionConfiguration.getClass();
        ub2Var.getClass();
        AccelerometerCollectionConfigurationKt.Dsl.Companion companion = AccelerometerCollectionConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AccelerometerCollectionConfiguration.Builder builder = accelerometerCollectionConfiguration.toBuilder();
        builder.getClass();
        AccelerometerCollectionConfigurationKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}
