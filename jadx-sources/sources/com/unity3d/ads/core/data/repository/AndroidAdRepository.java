package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.vn3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<ByteString>> placementsLoadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void addAd(ByteString byteString, AdObject adObject) {
        byteString.getClass();
        adObject.getClass();
        this.loadedAds.put(byteString, adObject);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void enqueueOpportunityForPlacement(String str, ByteString byteString) {
        List<ByteString> putIfAbsent;
        str.getClass();
        byteString.getClass();
        ConcurrentHashMap<String, List<ByteString>> concurrentHashMap = this.placementsLoadedAds;
        List<ByteString> list = concurrentHashMap.get(str);
        if (list == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (list = new ArrayList<>()))) != null) {
            list = putIfAbsent;
        }
        list.add(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public AdObject getAd(ByteString byteString) {
        byteString.getClass();
        return this.loadedAds.get(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Map<ByteString, AdObject> getAllAds() {
        return vn3.Z(this.loadedAds);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public boolean hasOpportunityId(ByteString byteString) {
        byteString.getClass();
        return this.loadedAds.containsKey(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public ByteString pollOpportunityIdForPlacement(String str) {
        str.getClass();
        List<ByteString> list = this.placementsLoadedAds.get(str);
        ByteString byteString = null;
        if (list == null) {
            return null;
        }
        if (!list.isEmpty()) {
            byteString = list.remove(0);
        }
        return byteString;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void removeAd(ByteString byteString) {
        byteString.getClass();
        this.loadedAds.remove(byteString);
    }
}
