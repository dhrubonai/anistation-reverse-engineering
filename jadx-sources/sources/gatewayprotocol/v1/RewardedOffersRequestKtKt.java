package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.RewardedOffersRequestKt;
import gatewayprotocol.v1.RewardedOffersRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class RewardedOffersRequestKtKt {
    /* renamed from: -initializerewardedOffersRequest, reason: not valid java name */
    public static final RewardedOffersRequestOuterClass.RewardedOffersRequest m135initializerewardedOffersRequest(ub2 ub2Var) {
        ub2Var.getClass();
        RewardedOffersRequestKt.Dsl.Companion companion = RewardedOffersRequestKt.Dsl.Companion;
        RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder newBuilder = RewardedOffersRequestOuterClass.RewardedOffersRequest.newBuilder();
        newBuilder.getClass();
        RewardedOffersRequestKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final RewardedOffersRequestOuterClass.RewardedOffersRequest copy(RewardedOffersRequestOuterClass.RewardedOffersRequest rewardedOffersRequest, ub2 ub2Var) {
        rewardedOffersRequest.getClass();
        ub2Var.getClass();
        RewardedOffersRequestKt.Dsl.Companion companion = RewardedOffersRequestKt.Dsl.Companion;
        RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder = rewardedOffersRequest.toBuilder();
        builder.getClass();
        RewardedOffersRequestKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}
