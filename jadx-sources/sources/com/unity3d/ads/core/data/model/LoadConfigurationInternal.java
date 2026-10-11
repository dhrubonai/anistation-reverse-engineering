package com.unity3d.ads.core.data.model;

import com.unity3d.ads.MediationInfo;
import defpackage.a34;
import defpackage.ot1;
import defpackage.q71;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class LoadConfigurationInternal {
    private final String adMarkup;
    private final LoadAdType adType;
    private final Map<String, String> extras;
    private final String mediationAdUnitId;
    private final MediationInfo mediationInfo;
    private final String placementId;

    public /* synthetic */ LoadConfigurationInternal(String str, String str2, String str3, MediationInfo mediationInfo, Map map, LoadAdType loadAdType, int i, q71 q71Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : mediationInfo, (i & 16) != 0 ? ot1.x : map, (i & 32) != 0 ? LoadAdType.FULLSCREEN : loadAdType);
    }

    public static /* synthetic */ LoadConfigurationInternal copy$default(LoadConfigurationInternal loadConfigurationInternal, String str, String str2, String str3, MediationInfo mediationInfo, Map map, LoadAdType loadAdType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loadConfigurationInternal.placementId;
        }
        if ((i & 2) != 0) {
            str2 = loadConfigurationInternal.adMarkup;
        }
        if ((i & 4) != 0) {
            str3 = loadConfigurationInternal.mediationAdUnitId;
        }
        if ((i & 8) != 0) {
            mediationInfo = loadConfigurationInternal.mediationInfo;
        }
        if ((i & 16) != 0) {
            map = loadConfigurationInternal.extras;
        }
        if ((i & 32) != 0) {
            loadAdType = loadConfigurationInternal.adType;
        }
        Map map2 = map;
        LoadAdType loadAdType2 = loadAdType;
        return loadConfigurationInternal.copy(str, str2, str3, mediationInfo, map2, loadAdType2);
    }

    public final String component1() {
        return this.placementId;
    }

    public final String component2() {
        return this.adMarkup;
    }

    public final String component3() {
        return this.mediationAdUnitId;
    }

    public final MediationInfo component4() {
        return this.mediationInfo;
    }

    public final Map<String, String> component5() {
        return this.extras;
    }

    public final LoadAdType component6() {
        return this.adType;
    }

    public final LoadConfigurationInternal copy(String str, String str2, String str3, MediationInfo mediationInfo, Map<String, String> map, LoadAdType loadAdType) {
        str.getClass();
        map.getClass();
        loadAdType.getClass();
        return new LoadConfigurationInternal(str, str2, str3, mediationInfo, map, loadAdType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadConfigurationInternal)) {
            return false;
        }
        LoadConfigurationInternal loadConfigurationInternal = (LoadConfigurationInternal) obj;
        if (a34.i(this.placementId, loadConfigurationInternal.placementId) && a34.i(this.adMarkup, loadConfigurationInternal.adMarkup) && a34.i(this.mediationAdUnitId, loadConfigurationInternal.mediationAdUnitId) && a34.i(this.mediationInfo, loadConfigurationInternal.mediationInfo) && a34.i(this.extras, loadConfigurationInternal.extras) && this.adType == loadConfigurationInternal.adType) {
            return true;
        }
        return false;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final LoadAdType getAdType() {
        return this.adType;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.placementId.hashCode() * 31;
        String str = this.adMarkup;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.mediationAdUnitId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        MediationInfo mediationInfo = this.mediationInfo;
        if (mediationInfo != null) {
            i = mediationInfo.hashCode();
        }
        return this.adType.hashCode() + ((this.extras.hashCode() + ((i3 + i) * 31)) * 31);
    }

    public String toString() {
        return "LoadConfigurationInternal(placementId=" + this.placementId + ", adMarkup=" + this.adMarkup + ", mediationAdUnitId=" + this.mediationAdUnitId + ", mediationInfo=" + this.mediationInfo + ", extras=" + this.extras + ", adType=" + this.adType + ')';
    }

    public LoadConfigurationInternal(String str, String str2, String str3, MediationInfo mediationInfo, Map<String, String> map, LoadAdType loadAdType) {
        str.getClass();
        map.getClass();
        loadAdType.getClass();
        this.placementId = str;
        this.adMarkup = str2;
        this.mediationAdUnitId = str3;
        this.mediationInfo = mediationInfo;
        this.extras = map;
        this.adType = loadAdType;
    }
}
