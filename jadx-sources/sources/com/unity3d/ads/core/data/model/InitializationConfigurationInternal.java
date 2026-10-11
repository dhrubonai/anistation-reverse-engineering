package com.unity3d.ads.core.data.model;

import com.unity3d.ads.LogLevel;
import com.unity3d.ads.MediationInfo;
import defpackage.a34;
import defpackage.ot1;
import defpackage.q71;
import defpackage.zo5;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class InitializationConfigurationInternal {
    private final Map<String, String> extras;
    private final String gameId;
    private final boolean isTestModeEnabled;
    private final LogLevel logLevel;
    private final MediationInfo mediationInfo;

    public /* synthetic */ InitializationConfigurationInternal(String str, boolean z, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i, q71 q71Var) {
        this(str, z, (i & 4) != 0 ? LogLevel.INFO : logLevel, (i & 8) != 0 ? ot1.x : map, (i & 16) != 0 ? null : mediationInfo);
    }

    public static /* synthetic */ InitializationConfigurationInternal copy$default(InitializationConfigurationInternal initializationConfigurationInternal, String str, boolean z, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationConfigurationInternal.gameId;
        }
        if ((i & 2) != 0) {
            z = initializationConfigurationInternal.isTestModeEnabled;
        }
        if ((i & 4) != 0) {
            logLevel = initializationConfigurationInternal.logLevel;
        }
        if ((i & 8) != 0) {
            map = initializationConfigurationInternal.extras;
        }
        if ((i & 16) != 0) {
            mediationInfo = initializationConfigurationInternal.mediationInfo;
        }
        MediationInfo mediationInfo2 = mediationInfo;
        LogLevel logLevel2 = logLevel;
        return initializationConfigurationInternal.copy(str, z, logLevel2, map, mediationInfo2);
    }

    public final String component1() {
        return this.gameId;
    }

    public final boolean component2() {
        return this.isTestModeEnabled;
    }

    public final LogLevel component3() {
        return this.logLevel;
    }

    public final Map<String, String> component4() {
        return this.extras;
    }

    public final MediationInfo component5() {
        return this.mediationInfo;
    }

    public final InitializationConfigurationInternal copy(String str, boolean z, LogLevel logLevel, Map<String, String> map, MediationInfo mediationInfo) {
        str.getClass();
        logLevel.getClass();
        map.getClass();
        return new InitializationConfigurationInternal(str, z, logLevel, map, mediationInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationConfigurationInternal)) {
            return false;
        }
        InitializationConfigurationInternal initializationConfigurationInternal = (InitializationConfigurationInternal) obj;
        if (a34.i(this.gameId, initializationConfigurationInternal.gameId) && this.isTestModeEnabled == initializationConfigurationInternal.isTestModeEnabled && this.logLevel == initializationConfigurationInternal.logLevel && a34.i(this.extras, initializationConfigurationInternal.extras) && a34.i(this.mediationInfo, initializationConfigurationInternal.mediationInfo)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.extras.hashCode() + ((this.logLevel.hashCode() + zo5.g(this.gameId.hashCode() * 31, 31, this.isTestModeEnabled)) * 31)) * 31;
        MediationInfo mediationInfo = this.mediationInfo;
        if (mediationInfo == null) {
            hashCode = 0;
        } else {
            hashCode = mediationInfo.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public String toString() {
        return "InitializationConfigurationInternal(gameId=" + this.gameId + ", isTestModeEnabled=" + this.isTestModeEnabled + ", logLevel=" + this.logLevel + ", extras=" + this.extras + ", mediationInfo=" + this.mediationInfo + ')';
    }

    public InitializationConfigurationInternal(String str, boolean z, LogLevel logLevel, Map<String, String> map, MediationInfo mediationInfo) {
        str.getClass();
        logLevel.getClass();
        map.getClass();
        this.gameId = str;
        this.isTestModeEnabled = z;
        this.logLevel = logLevel;
        this.extras = map;
        this.mediationInfo = mediationInfo;
    }
}
