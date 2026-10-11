package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v implements Internal.EnumVerifier {
    public static final v a = new Object();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        if (DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
