package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import defpackage.ub2;
import gatewayprotocol.v1.AccelerometerSampleKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AccelerometerSampleKtKt {
    /* renamed from: -initializeaccelerometerSample, reason: not valid java name */
    public static final DynamicDeviceInfoOuterClass.AccelerometerSample m68initializeaccelerometerSample(ub2 ub2Var) {
        ub2Var.getClass();
        AccelerometerSampleKt.Dsl.Companion companion = AccelerometerSampleKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.AccelerometerSample.Builder newBuilder = DynamicDeviceInfoOuterClass.AccelerometerSample.newBuilder();
        newBuilder.getClass();
        AccelerometerSampleKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.AccelerometerSample copy(DynamicDeviceInfoOuterClass.AccelerometerSample accelerometerSample, ub2 ub2Var) {
        accelerometerSample.getClass();
        ub2Var.getClass();
        AccelerometerSampleKt.Dsl.Companion companion = AccelerometerSampleKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.AccelerometerSample.Builder builder = accelerometerSample.toBuilder();
        builder.getClass();
        AccelerometerSampleKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final Timestamp getClientTimestampOrNull(DynamicDeviceInfoOuterClass.AccelerometerSampleOrBuilder accelerometerSampleOrBuilder) {
        accelerometerSampleOrBuilder.getClass();
        if (accelerometerSampleOrBuilder.hasClientTimestamp()) {
            return accelerometerSampleOrBuilder.getClientTimestamp();
        }
        return null;
    }
}
