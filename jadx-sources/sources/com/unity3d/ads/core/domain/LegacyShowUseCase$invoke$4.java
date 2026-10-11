package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import defpackage.mc2;
import defpackage.r05;
import defpackage.x42;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class LegacyShowUseCase$invoke$4<T> implements x42 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ r05 $displayReadyEventSent;
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ NativeConfigurationOuterClass.NativeStartMode $nativeStartMode;
    final /* synthetic */ String $placement;
    final /* synthetic */ mc2 $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ UnityAdsShowOptions $unityAdsShowOptions;
    final /* synthetic */ LegacyShowUseCase this$0;

    public LegacyShowUseCase$invoke$4(r05 r05Var, boolean z, NativeConfigurationOuterClass.NativeStartMode nativeStartMode, LegacyShowUseCase legacyShowUseCase, AdObject adObject, long j, String str, Listeners listeners, UnityAdsShowOptions unityAdsShowOptions, mc2 mc2Var) {
        this.$displayReadyEventSent = r05Var;
        this.$isBanner = z;
        this.$nativeStartMode = nativeStartMode;
        this.this$0 = legacyShowUseCase;
        this.$adObject = adObject;
        this.$startTime = j;
        this.$placement = str;
        this.$listeners = listeners;
        this.$unityAdsShowOptions = unityAdsShowOptions;
        this.$reportShowError = mc2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(8:5|6|7|8|(1:(1:(3:(1:(1:14)(2:18|19))(1:20)|15|16)(6:21|22|23|(2:25|26)|15|16))(3:27|28|29))(4:34|35|(3:37|(1:51)(1:45)|(2:47|(1:49)(2:50|29)))(4:52|(1:54)(2:55|(1:57)(2:58|(1:60)(2:61|(3:63|64|(1:66)(4:67|(1:69)|23|(0)))(2:70|(1:72)(2:73|(1:75)(2:76|77))))))|15|16)|26)|(1:33)|15|16))|81|6|7|8|(0)(0)|(1:31)|33|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0046, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fb, code lost:
    
        r4 = r27.$reportShowError;
        r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
        r9 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r0, 0, 1, null);
        r10.L$0 = null;
        r10.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0210, code lost:
    
        if (r4.invoke("uncaught_exception", r6, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, r9, r10) != r15) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    @Override // defpackage.x42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent r28, defpackage.vz0 r29) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(com.unity3d.ads.core.data.model.ShowEvent, vz0):java.lang.Object");
    }
}
