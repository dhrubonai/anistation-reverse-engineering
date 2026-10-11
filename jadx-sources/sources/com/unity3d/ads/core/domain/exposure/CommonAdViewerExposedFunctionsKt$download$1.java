package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CacheFile;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$download$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;
    final /* synthetic */ SessionRepository $sessionRepository;

    public CommonAdViewerExposedFunctionsKt$download$1(SessionRepository sessionRepository, CacheFile cacheFile, AdObject adObject) {
        this.$sessionRepository = sessionRepository;
        this.$cacheFile = cacheFile;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object[] r13, defpackage.vz0 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
            if (r0 == 0) goto L14
            r0 = r14
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
            r0.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r8.result
            int r0 = r8.label
            r11 = 0
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2e
            boolean r12 = r8.Z$0
            java.lang.Object r13 = r8.L$0
            java.lang.String r13 = (java.lang.String) r13
            defpackage.m37.N(r14)
            goto L7b
        L2e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r12)
            return r11
        L34:
            defpackage.m37.N(r14)
            r14 = 0
            r0 = r13[r14]
            r0.getClass()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r2 = "url"
            java.lang.String r2 = r0.getString(r2)
            r3 = 2
            java.lang.Object r13 = defpackage.ms.M0(r13, r3)
            r4 = r13
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.lang.String r13 = "priority"
            int r5 = r0.optInt(r13, r14)
            com.unity3d.ads.core.data.repository.SessionRepository r13 = r12.$sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlags r13 = r13.getFeatureFlags()
            boolean r13 = r13.getDisableCustomScheme()
            r14 = r1
            com.unity3d.ads.core.domain.CacheFile r1 = r12.$cacheFile
            r2.getClass()
            com.unity3d.ads.core.data.model.AdObject r3 = r12.$adObject
            r8.L$0 = r2
            r8.Z$0 = r13
            r8.label = r14
            r6 = 0
            r7 = 0
            r9 = 48
            r10 = 0
            java.lang.Object r14 = com.unity3d.ads.core.domain.CacheFile.DefaultImpls.invoke$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            w11 r12 = defpackage.w11.x
            if (r14 != r12) goto L79
            return r12
        L79:
            r12 = r13
            r13 = r2
        L7b:
            com.unity3d.ads.core.data.model.CacheResult r14 = (com.unity3d.ads.core.data.model.CacheResult) r14
            boolean r0 = r14 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            if (r0 == 0) goto L9d
            if (r12 == 0) goto L84
            return r13
        L84:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "unity-ads-cache://unity.ads.cache/"
            r12.<init>(r13)
            com.unity3d.ads.core.data.model.CacheResult$Success r14 = (com.unity3d.ads.core.data.model.CacheResult.Success) r14
            com.unity3d.ads.core.data.model.CachedFile r13 = r14.getCachedFile()
            java.lang.String r13 = r13.getName()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            return r12
        L9d:
            boolean r12 = r14 instanceof com.unity3d.ads.core.data.model.CacheResult.Failure
            if (r12 != 0) goto La5
            defpackage.ze0.l()
            return r11
        La5:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            com.unity3d.ads.core.data.model.CacheResult$Failure r14 = (com.unity3d.ads.core.data.model.CacheResult.Failure) r14
            com.unity3d.ads.core.data.model.CacheError r13 = r14.getError()
            java.lang.String r13 = r13.name()
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1.invoke(java.lang.Object[], vz0):java.lang.Object");
    }
}
