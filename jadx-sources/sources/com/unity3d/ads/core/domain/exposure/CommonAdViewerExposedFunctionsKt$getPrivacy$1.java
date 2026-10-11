package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$getPrivacy$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    public CommonAdViewerExposedFunctionsKt$getPrivacy$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object[] r4, defpackage.vz0 r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
            if (r4 == 0) goto L13
            r4 = r5
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.label = r0
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.result
            int r0 = r4.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L26
            defpackage.m37.N(r5)
            goto L3c
        L26:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r3)
            return r1
        L2c:
            defpackage.m37.N(r5)
            com.unity3d.ads.core.data.repository.SessionRepository r3 = r3.$sessionRepository
            r4.label = r2
            java.lang.Object r5 = r3.getPrivacy(r4)
            w11 r3 = defpackage.w11.x
            if (r5 != r3) goto L3c
            return r3
        L3c:
            com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
            r3 = 0
            java.lang.String r3 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r5, r3, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1.invoke(java.lang.Object[], vz0):java.lang.Object");
    }
}
