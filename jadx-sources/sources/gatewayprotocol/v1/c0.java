package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class c0 implements Internal.EnumVerifier {
    public static final c0 a = new Object();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        if (DynamicDeviceInfoOuterClass.ConnectionType.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
