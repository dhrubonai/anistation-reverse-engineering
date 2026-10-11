package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.services.core.network.model.RequestType;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$request$1 implements ExposedFunction {
    final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
    final /* synthetic */ RequestType $type;

    public CommonAdViewerExposedFunctionsKt$request$1(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
        this.$executeAdViewerRequest = executeAdViewerRequest;
        this.$type = requestType;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x002a, B:12:0x005f, B:14:0x0069, B:15:0x007a, B:19:0x006d, B:21:0x0071), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x002a, B:12:0x005f, B:14:0x0069, B:15:0x007a, B:19:0x006d, B:21:0x0071), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object[] r6, defpackage.vz0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            defpackage.m37.N(r7)     // Catch: java.lang.Exception -> L2e
            goto L5f
        L2e:
            r7 = move-exception
            goto La1
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r2
        L37:
            defpackage.m37.N(r7)
            java.lang.Object r7 = defpackage.ms.I0(r6)
            r7.getClass()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = defpackage.ms.M0(r6, r3)
            java.lang.String r1 = (java.lang.String) r1
            com.unity3d.ads.core.domain.ExecuteAdViewerRequest r4 = r5.$executeAdViewerRequest     // Catch: java.lang.Exception -> L9d
            com.unity3d.services.core.network.model.RequestType r5 = r5.$type     // Catch: java.lang.Exception -> L9d
            r0.L$0 = r7     // Catch: java.lang.Exception -> L9d
            r0.L$1 = r1     // Catch: java.lang.Exception -> L9d
            r0.label = r3     // Catch: java.lang.Exception -> L9d
            java.lang.Object r5 = r4.invoke(r5, r6, r0)     // Catch: java.lang.Exception -> L9d
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L5c
            return r6
        L5c:
            r6 = r7
            r7 = r5
            r5 = r1
        L5f:
            com.unity3d.services.core.network.model.HttpResponse r7 = (com.unity3d.services.core.network.model.HttpResponse) r7     // Catch: java.lang.Exception -> L2e
            java.lang.Object r0 = r7.getBody()     // Catch: java.lang.Exception -> L2e
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L6d
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L2e
            goto L7a
        L6d:
            boolean r1 = r0 instanceof byte[]     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L7a
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L2e
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Exception -> L2e
            java.nio.charset.Charset r1 = defpackage.kl0.a     // Catch: java.lang.Exception -> L2e
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> L2e
        L7a:
            com.unity3d.ads.adplayer.model.OnWebRequestComplete r0 = new com.unity3d.ads.adplayer.model.OnWebRequestComplete     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = r7.getUrlString()     // Catch: java.lang.Exception -> L2e
            int r3 = r7.getStatusCode()     // Catch: java.lang.Exception -> L2e
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Exception -> L2e
            r4.<init>(r3)     // Catch: java.lang.Exception -> L2e
            java.util.Map r7 = r7.getHeaders()     // Catch: java.lang.Exception -> L2e
            org.json.JSONArray r7 = com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(r7)     // Catch: java.lang.Exception -> L2e
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r1, r2, r4, r7}     // Catch: java.lang.Exception -> L2e
            java.util.List r7 = defpackage.te4.I(r7)     // Catch: java.lang.Exception -> L2e
            r0.<init>(r7)     // Catch: java.lang.Exception -> L2e
            return r0
        L9d:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r1
        La1:
            com.unity3d.ads.adplayer.model.OnWebRequestFailed r0 = new com.unity3d.ads.adplayer.model.OnWebRequestFailed
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto Lab
            java.lang.String r7 = ""
        Lab:
            java.lang.String[] r5 = new java.lang.String[]{r6, r5, r7}
            java.util.List r5 = defpackage.te4.I(r5)
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1.invoke(java.lang.Object[], vz0):java.lang.Object");
    }
}
