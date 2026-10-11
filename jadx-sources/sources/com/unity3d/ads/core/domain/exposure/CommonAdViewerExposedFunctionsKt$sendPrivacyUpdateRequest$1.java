package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 implements ExposedFunction {
    final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

    public CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object[] r8, defpackage.vz0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            java.lang.String r3 = "version"
            java.lang.String r4 = "content"
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 != r6) goto L2b
            defpackage.m37.N(r9)
            goto L57
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L31:
            defpackage.m37.N(r9)
            r8 = r8[r5]
            r8.getClass()
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.String r9 = r8.optString(r4)
            int r8 = r8.optInt(r3)
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r7 = r7.$sendPrivacyUpdateRequest
            r9.getClass()
            com.google.protobuf.ByteString r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r9, r5, r6, r2)
            r0.label = r6
            java.lang.Object r9 = r7.invoke(r8, r9, r0)
            w11 r7 = defpackage.w11.x
            if (r9 != r7) goto L57
            return r7
        L57:
            gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse r9 = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) r9
            an3 r7 = new an3
            r7.<init>()
            int r8 = r9.getVersion()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            r7.put(r3, r0)
            com.google.protobuf.ByteString r8 = r9.getContent()
            r8.getClass()
            java.lang.String r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r8, r5, r6, r2)
            r7.put(r4, r8)
            an3 r7 = r7.b()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1.invoke(java.lang.Object[], vz0):java.lang.Object");
    }
}
