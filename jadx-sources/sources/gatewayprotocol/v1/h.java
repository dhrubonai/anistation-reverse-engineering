package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class h implements Internal.EnumVerifier {
    public static final h a = new Object();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        if (AdRevenueEventRequestOuterClass.AdRevenueOrigin.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
