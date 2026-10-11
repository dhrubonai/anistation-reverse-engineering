package com.unity3d.ads.core.extensions;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ErrorExtensionsKt {
    public static final ByteString getErrorTokenOrNull(ErrorOuterClass.Error error) {
        error.getClass();
        if (error.getErrorToken().isEmpty()) {
            return null;
        }
        return error.getErrorToken();
    }

    public static final ByteString getErrorTokenOrNull(Throwable th) {
        th.getClass();
        GatewayException gatewayException = th instanceof GatewayException ? (GatewayException) th : null;
        if (gatewayException != null) {
            return gatewayException.getErrorToken();
        }
        return null;
    }
}
