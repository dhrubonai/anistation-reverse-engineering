package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.CampaignMetadataKt;
import gatewayprotocol.v1.CampaignMetadataOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class CampaignMetadataKtKt {
    /* renamed from: -initializecampaignMetadata, reason: not valid java name */
    public static final CampaignMetadataOuterClass.CampaignMetadata m87initializecampaignMetadata(ub2 ub2Var) {
        ub2Var.getClass();
        CampaignMetadataKt.Dsl.Companion companion = CampaignMetadataKt.Dsl.Companion;
        CampaignMetadataOuterClass.CampaignMetadata.Builder newBuilder = CampaignMetadataOuterClass.CampaignMetadata.newBuilder();
        newBuilder.getClass();
        CampaignMetadataKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata copy(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata, ub2 ub2Var) {
        campaignMetadata.getClass();
        ub2Var.getClass();
        CampaignMetadataKt.Dsl.Companion companion = CampaignMetadataKt.Dsl.Companion;
        CampaignMetadataOuterClass.CampaignMetadata.Builder builder = campaignMetadata.toBuilder();
        builder.getClass();
        CampaignMetadataKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}
