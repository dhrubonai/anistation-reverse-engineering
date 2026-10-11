package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import defpackage.ov3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface RequestUrlFactory {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ String getRequestUrl$default(RequestUrlFactory requestUrlFactory, OperationType operationType, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return requestUrlFactory.getRequestUrl(operationType, str);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: getRequestUrl");
            return null;
        }
    }

    String getRequestUrl(OperationType operationType, String str);
}
