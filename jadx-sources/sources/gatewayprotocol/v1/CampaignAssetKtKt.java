package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.CampaignAssetKt;
import gatewayprotocol.v1.CampaignMetadataOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class CampaignAssetKtKt {
    /* renamed from: -initializecampaignAsset, reason: not valid java name */
    public static final CampaignMetadataOuterClass.CampaignAsset m85initializecampaignAsset(ub2 ub2Var) {
        ub2Var.getClass();
        CampaignAssetKt.Dsl.Companion companion = CampaignAssetKt.Dsl.Companion;
        CampaignMetadataOuterClass.CampaignAsset.Builder newBuilder = CampaignMetadataOuterClass.CampaignAsset.newBuilder();
        newBuilder.getClass();
        CampaignAssetKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignAsset copy(CampaignMetadataOuterClass.CampaignAsset campaignAsset, ub2 ub2Var) {
        campaignAsset.getClass();
        ub2Var.getClass();
        CampaignAssetKt.Dsl.Companion companion = CampaignAssetKt.Dsl.Companion;
        CampaignMetadataOuterClass.CampaignAsset.Builder builder = campaignAsset.toBuilder();
        builder.getClass();
        CampaignAssetKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}
