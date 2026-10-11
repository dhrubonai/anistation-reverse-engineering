package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.Refresh;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$refreshAdData$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Refresh $refresh;

    public CommonAdViewerExposedFunctionsKt$refreshAdData$1(Refresh refresh, AdObject adObject) {
        this.$refresh = refresh;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object[] r7, defpackage.vz0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            java.lang.String r2 = "adDataRefreshToken"
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 != r5) goto L29
            defpackage.m37.N(r8)
            goto L60
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r3
        L2f:
            defpackage.m37.N(r8)
            int r8 = r7.length
            if (r8 != 0) goto L38
            com.google.protobuf.ByteString r7 = com.google.protobuf.ByteString.EMPTY
            goto L4a
        L38:
            r7 = r7[r4]
            r7.getClass()
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r7 = r7.optString(r2)
            r7.getClass()
            com.google.protobuf.ByteString r7 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r7, r4, r5, r3)
        L4a:
            com.unity3d.ads.core.domain.Refresh r8 = r6.$refresh
            r7.getClass()
            com.unity3d.ads.core.data.model.AdObject r6 = r6.$adObject
            com.google.protobuf.ByteString r6 = r6.getOpportunityId()
            r0.label = r5
            java.lang.Object r8 = r8.invoke(r7, r6, r0)
            w11 r6 = defpackage.w11.x
            if (r8 != r6) goto L60
            return r6
        L60:
            gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r8 = (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) r8
            boolean r6 = r8.hasError()
            if (r6 != 0) goto La0
            an3 r6 = new an3
            r6.<init>()
            com.google.protobuf.ByteString r7 = r8.getAdData()
            r7.getClass()
            java.lang.String r7 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r7, r4, r5, r3)
            java.lang.String r0 = "adData"
            r6.put(r0, r7)
            com.google.protobuf.ByteString r7 = r8.getAdDataRefreshToken()
            r7.getClass()
            java.lang.String r7 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r7, r4, r5, r3)
            r6.put(r2, r7)
            com.google.protobuf.ByteString r7 = r8.getTrackingToken()
            r7.getClass()
            java.lang.String r7 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r7, r4, r5, r3)
            java.lang.String r8 = "trackingToken"
            r6.put(r8, r7)
            an3 r6 = r6.b()
            return r6
        La0:
            java.lang.String r6 = "Refresh failed"
            defpackage.ze0.k(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1.invoke(java.lang.Object[], vz0):java.lang.Object");
    }
}
