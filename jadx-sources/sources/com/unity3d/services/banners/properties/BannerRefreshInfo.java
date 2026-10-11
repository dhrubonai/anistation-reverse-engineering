package com.unity3d.services.banners.properties;

import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class BannerRefreshInfo {
    private static BannerRefreshInfo instance;
    private HashMap<String, Integer> _refreshRateMap = new HashMap<>();

    public static BannerRefreshInfo getInstance() {
        BannerRefreshInfo bannerRefreshInfo = instance;
        if (bannerRefreshInfo == null) {
            BannerRefreshInfo bannerRefreshInfo2 = new BannerRefreshInfo();
            instance = bannerRefreshInfo2;
            return bannerRefreshInfo2;
        }
        return bannerRefreshInfo;
    }

    public synchronized Integer getRefreshRate(String str) {
        return this._refreshRateMap.get(str);
    }

    public synchronized void setRefreshRate(String str, Integer num) {
        this._refreshRateMap.put(str, num);
    }
}
