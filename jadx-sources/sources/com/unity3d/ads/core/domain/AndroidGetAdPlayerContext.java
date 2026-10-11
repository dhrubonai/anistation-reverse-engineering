package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.ai4;
import defpackage.q71;
import defpackage.vn3;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetAdPlayerContext {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    public AndroidGetAdPlayerContext(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository) {
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    public final Map<String, Object> invoke() {
        String gameId = this.sessionRepository.getGameId();
        if (gameId == null) {
            gameId = "";
        }
        return vn3.T(new ai4("bundleId", this.deviceInfoRepository.getAppName()), new ai4("bundleVersion", this.deviceInfoRepository.getBundleVersion()), new ai4("webviewHash", "unknown"), new ai4("sdkVersion", Integer.valueOf(SdkProperties.getVersionCode())), new ai4("sdkVersionName", SdkProperties.getVersionName()), new ai4("osVersion", this.deviceInfoRepository.getOsVersion()), new ai4("systemLanguage", Locale.getDefault().toString()), new ai4("deviceModel", this.deviceInfoRepository.getModel()), new ai4("limitAdTracking", Boolean.valueOf(this.deviceInfoRepository.getLimitedTracking())), new ai4("maxVolume", Double.valueOf(this.deviceInfoRepository.getMaxVolume())), new ai4(KEY_GAME_ID, gameId));
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
