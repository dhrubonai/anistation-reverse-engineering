package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import defpackage.ai4;
import defpackage.ot1;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.vn3;
import defpackage.x44;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AndroidCampaignRepository implements CampaignRepository {
    private final x44 campaigns;
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(GetSharedDataTimestamps getSharedDataTimestamps) {
        getSharedDataTimestamps.getClass();
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.campaigns = tx5.a(ot1.x);
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.Campaign getCampaign(ByteString byteString) {
        byteString.getClass();
        return (CampaignStateOuterClass.Campaign) ((Map) ((sx5) this.campaigns).getValue()).get(byteString.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection values = ((Map) ((sx5) this.campaigns).getValue()).values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : values) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder newBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        newBuilder.getClass();
        CampaignStateKt.Dsl _create = companion._create(newBuilder);
        _create.addAllShownCampaigns(_create.getShownCampaigns(), arrayList);
        _create.addAllLoadedCampaigns(_create.getLoadedCampaigns(), arrayList2);
        return _create._build();
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(ByteString byteString) {
        sx5 sx5Var;
        Object value;
        Map map;
        byteString.getClass();
        x44 x44Var = this.campaigns;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            Map map2 = (Map) value;
            String stringUtf8 = byteString.toStringUtf8();
            map2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.remove(stringUtf8);
            int size = linkedHashMap.size();
            if (size != 0) {
                map = linkedHashMap;
                if (size == 1) {
                    Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                    Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                    singletonMap.getClass();
                    map = singletonMap;
                }
            } else {
                map = ot1.x;
            }
        } while (!sx5Var.j(value, map));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(ByteString byteString, CampaignStateOuterClass.Campaign campaign) {
        sx5 sx5Var;
        Object value;
        byteString.getClass();
        campaign.getClass();
        x44 x44Var = this.campaigns;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, vn3.W((Map) value, new ai4(byteString.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(ByteString byteString) {
        byteString.getClass();
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            builder.getClass();
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            setCampaign(byteString, _create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(ByteString byteString) {
        byteString.getClass();
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            builder.getClass();
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            setCampaign(byteString, _create._build());
        }
    }
}
