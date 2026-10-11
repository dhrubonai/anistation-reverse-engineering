package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface AdRepository {
    void addAd(ByteString byteString, AdObject adObject);

    void enqueueOpportunityForPlacement(String str, ByteString byteString);

    AdObject getAd(ByteString byteString);

    Map<ByteString, AdObject> getAllAds();

    boolean hasOpportunityId(ByteString byteString);

    ByteString pollOpportunityIdForPlacement(String str);

    void removeAd(ByteString byteString);
}
