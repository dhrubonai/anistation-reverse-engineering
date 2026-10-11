package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import defpackage.ov3;
import defpackage.vz0;
import gatewayprotocol.v1.AdFormatOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface GetAdPlayerConfigRequest {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdPlayerConfigRequest getAdPlayerConfigRequest, String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, vz0 vz0Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    loadConfigurationInternal = null;
                }
                return getAdPlayerConfigRequest.invoke(str, byteString, byteString2, adFormat, loadConfigurationInternal, vz0Var);
            }
            ov3.g("Super calls with default arguments not supported in this target, function: invoke");
            return null;
        }
    }

    Object invoke(String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, vz0 vz0Var);
}
