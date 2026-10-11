package com.unity3d.ads.adplayer;

import defpackage.a34;
import defpackage.q71;
import defpackage.qx1;
import defpackage.zo5;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;
    private final String offerwallPlacementName;
    private final String placementId;
    private final Map<String, Object> unityAdsShowOptions;

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z, String str2, int i, q71 q71Var) {
        this(map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i & 2) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i & 4) != 0) {
            z = androidShowOptions.isOfferwallAd;
        }
        if ((i & 8) != 0) {
            str2 = androidShowOptions.offerwallPlacementName;
        }
        return androidShowOptions.copy(map, str, z, str2);
    }

    public final Map<String, Object> component1() {
        return this.unityAdsShowOptions;
    }

    public final String component2() {
        return this.placementId;
    }

    public final boolean component3() {
        return this.isOfferwallAd;
    }

    public final String component4() {
        return this.offerwallPlacementName;
    }

    public final AndroidShowOptions copy(Map<String, ? extends Object> map, String str, boolean z, String str2) {
        return new AndroidShowOptions(map, str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        if (a34.i(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && a34.i(this.placementId, androidShowOptions.placementId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && a34.i(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName)) {
            return true;
        }
        return false;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Map<String, Object> map = this.unityAdsShowOptions;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.placementId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int g = zo5.g((i2 + hashCode2) * 31, 31, this.isOfferwallAd);
        String str2 = this.offerwallPlacementName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return g + i;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidShowOptions(unityAdsShowOptions=");
        sb.append(this.unityAdsShowOptions);
        sb.append(", placementId=");
        sb.append(this.placementId);
        sb.append(", isOfferwallAd=");
        sb.append(this.isOfferwallAd);
        sb.append(", offerwallPlacementName=");
        return qx1.p(sb, this.offerwallPlacementName, ')');
    }

    public AndroidShowOptions(Map<String, ? extends Object> map, String str, boolean z, String str2) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isOfferwallAd = z;
        this.offerwallPlacementName = str2;
    }
}
