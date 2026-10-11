package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.GoogleAppIdDataSource;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.datasource.ModuleInitParamsDataSource;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.domain.capability.GatherQuickCapabilities;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private static final String BLOB_EXTRA_KEY = "uads_init_blob";
    public static final Companion Companion = new Companion(null);
    private final DeviceInfoRepository deviceInfoRepository;
    private final GatherQuickCapabilities gatherQuickCapabilities;
    private final GetClientInfo getClientInfo;
    private final GoogleAppIdDataSource googleAppIdDataSource;
    private final InstallReferrerDataSource installReferrerDataSource;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final ModuleInitParamsDataSource moduleInitParamsDataSource;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader, InstallReferrerDataSource installReferrerDataSource, GoogleAppIdDataSource googleAppIdDataSource, ModuleInitParamsDataSource moduleInitParamsDataSource, MediationTraitsMetadataReader mediationTraitsMetadataReader, GatherQuickCapabilities gatherQuickCapabilities, TcfRepository tcfRepository) {
        getClientInfo.getClass();
        sessionRepository.getClass();
        deviceInfoRepository.getClass();
        legacyUserConsentRepository.getClass();
        mediationInitBlobMetadataReader.getClass();
        installReferrerDataSource.getClass();
        googleAppIdDataSource.getClass();
        moduleInitParamsDataSource.getClass();
        mediationTraitsMetadataReader.getClass();
        gatherQuickCapabilities.getClass();
        tcfRepository.getClass();
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
        this.installReferrerDataSource = installReferrerDataSource;
        this.googleAppIdDataSource = googleAppIdDataSource;
        this.moduleInitParamsDataSource = moduleInitParamsDataSource;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.gatherQuickCapabilities = gatherQuickCapabilities;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0240, code lost:
    
        if (r14 == r3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0224, code lost:
    
        if (r14 == r3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0205, code lost:
    
        if (r14 != r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x030c, code lost:
    
        if (r14 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0285, code lost:
    
        if (r14 == r3) goto L125;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006b  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(defpackage.vz0 r14) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke(vz0):java.lang.Object");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }
}
