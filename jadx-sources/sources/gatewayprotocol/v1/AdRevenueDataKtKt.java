package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.AdRevenueDataKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AdRevenueDataKtKt {
    /* renamed from: -initializeadRevenueData, reason: not valid java name */
    public static final AdRevenueEventRequestOuterClass.AdRevenueData m76initializeadRevenueData(ub2 ub2Var) {
        ub2Var.getClass();
        AdRevenueDataKt.Dsl.Companion companion = AdRevenueDataKt.Dsl.Companion;
        AdRevenueEventRequestOuterClass.AdRevenueData.Builder newBuilder = AdRevenueEventRequestOuterClass.AdRevenueData.newBuilder();
        newBuilder.getClass();
        AdRevenueDataKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueData copy(AdRevenueEventRequestOuterClass.AdRevenueData adRevenueData, ub2 ub2Var) {
        adRevenueData.getClass();
        ub2Var.getClass();
        AdRevenueDataKt.Dsl.Companion companion = AdRevenueDataKt.Dsl.Companion;
        AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder = adRevenueData.toBuilder();
        builder.getClass();
        AdRevenueDataKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }
}
