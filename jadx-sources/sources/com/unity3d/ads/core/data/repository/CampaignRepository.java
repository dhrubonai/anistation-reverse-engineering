package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.CampaignStateOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface CampaignRepository {
    CampaignStateOuterClass.Campaign getCampaign(ByteString byteString);

    CampaignStateOuterClass.CampaignState getCampaignState();

    void removeState(ByteString byteString);

    void setCampaign(ByteString byteString, CampaignStateOuterClass.Campaign campaign);

    void setLoadTimestamp(ByteString byteString);

    void setShowTimestamp(ByteString byteString);
}
