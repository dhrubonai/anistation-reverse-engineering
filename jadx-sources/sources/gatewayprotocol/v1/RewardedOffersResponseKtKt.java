package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseKt;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class RewardedOffersResponseKtKt {
    /* renamed from: -initializerewardedOffersResponse, reason: not valid java name */
    public static final RewardedOffersResponseOuterClass.RewardedOffersResponse m136initializerewardedOffersResponse(ub2 ub2Var) {
        ub2Var.getClass();
        RewardedOffersResponseKt.Dsl.Companion companion = RewardedOffersResponseKt.Dsl.Companion;
        RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder newBuilder = RewardedOffersResponseOuterClass.RewardedOffersResponse.newBuilder();
        newBuilder.getClass();
        RewardedOffersResponseKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final RewardedOffersResponseOuterClass.RewardedOffersResponse copy(RewardedOffersResponseOuterClass.RewardedOffersResponse rewardedOffersResponse, ub2 ub2Var) {
        rewardedOffersResponse.getClass();
        ub2Var.getClass();
        RewardedOffersResponseKt.Dsl.Companion companion = RewardedOffersResponseKt.Dsl.Companion;
        RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder = rewardedOffersResponse.toBuilder();
        builder.getClass();
        RewardedOffersResponseKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder rewardedOffersResponseOrBuilder) {
        rewardedOffersResponseOrBuilder.getClass();
        if (rewardedOffersResponseOrBuilder.hasError()) {
            return rewardedOffersResponseOrBuilder.getError();
        }
        return null;
    }
}
