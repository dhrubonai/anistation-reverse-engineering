package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AdRefresh;
import com.unity3d.ads.core.domain.CacheAssets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidWebViewLessLoadStrategy implements WebViewLessLoadStrategy {
    private final AdRefresh adRefresh;
    private final AdRepository adRepository;
    private final CacheAssets cacheAssets;
    private final CampaignRepository campaignRepository;
    private final SessionRepository sessionRepository;

    public AndroidWebViewLessLoadStrategy(AdRepository adRepository, CampaignRepository campaignRepository, CacheAssets cacheAssets, AdRefresh adRefresh, SessionRepository sessionRepository) {
        adRepository.getClass();
        campaignRepository.getClass();
        cacheAssets.getClass();
        adRefresh.getClass();
        sessionRepository.getClass();
        this.adRepository = adRepository;
        this.campaignRepository = campaignRepository;
        this.cacheAssets = cacheAssets;
        this.adRefresh = adRefresh;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(defpackage.v11 r32, java.lang.String r33, com.unity3d.ads.UnityAdsLoadOptions r34, com.google.protobuf.ByteString r35, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r36, java.lang.String r37, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r38, boolean r39, defpackage.vz0 r40) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy.invoke(v11, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, vz0):java.lang.Object");
    }
}
