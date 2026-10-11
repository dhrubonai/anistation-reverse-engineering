package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {
    private final CacheRepository cacheRepository;
    private final GetAssetFileName getAssetFileName;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetIsFileCache(CacheRepository cacheRepository, SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent, GetAssetFileName getAssetFileName) {
        cacheRepository.getClass();
        sessionRepository.getClass();
        sendDiagnosticEvent.getClass();
        getAssetFileName.getClass();
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getAssetFileName = getAssetFileName;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.String r14, defpackage.vz0 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            long r0 = r0.J$0
            defpackage.m37.N(r15)
            goto L5c
        L27:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r13)
            r13 = 0
            return r13
        L2e:
            defpackage.m37.N(r15)
            long r3 = defpackage.j04.b()
            com.unity3d.ads.core.data.repository.SessionRepository r15 = r13.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlags r15 = r15.getFeatureFlags()
            boolean r15 = r15.getDisableCustomScheme()
            if (r15 == 0) goto L48
            com.unity3d.ads.core.domain.GetAssetFileName r15 = r13.getAssetFileName
            java.lang.String r14 = r15.invoke(r14)
            goto L4c
        L48:
            java.lang.String r14 = defpackage.uz5.o0(r14)
        L4c:
            com.unity3d.ads.core.data.repository.CacheRepository r15 = r13.cacheRepository
            r0.J$0 = r3
            r0.label = r2
            java.lang.Object r15 = r15.doesFileExist(r14, r0)
            w11 r14 = defpackage.w11.x
            if (r15 != r14) goto L5b
            return r14
        L5b:
            r0 = r3
        L5c:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r14 = r15.booleanValue()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r13.sendDiagnosticEvent
            if (r14 == 0) goto L6a
            java.lang.String r13 = "native_show_is_file_cached_success_time"
        L68:
            r3 = r13
            goto L6d
        L6a:
            java.lang.String r13 = "native_show_is_file_cached_failure_time"
            goto L68
        L6d:
            double r13 = defpackage.h11.c(r0)
            java.lang.Double r4 = new java.lang.Double
            r4.<init>(r13)
            r11 = 252(0xfc, float:3.53E-43)
            r12 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetIsFileCache.invoke(java.lang.String, vz0):java.lang.Object");
    }
}
