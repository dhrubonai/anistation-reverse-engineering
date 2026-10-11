package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.AdViewerResponseKt;
import gatewayprotocol.v1.AdViewerResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AdViewerResponseKtKt {
    /* renamed from: -initializeadViewerResponse, reason: not valid java name */
    public static final AdViewerResponseOuterClass.AdViewerResponse m79initializeadViewerResponse(ub2 ub2Var) {
        ub2Var.getClass();
        AdViewerResponseKt.Dsl.Companion companion = AdViewerResponseKt.Dsl.Companion;
        AdViewerResponseOuterClass.AdViewerResponse.Builder newBuilder = AdViewerResponseOuterClass.AdViewerResponse.newBuilder();
        newBuilder.getClass();
        AdViewerResponseKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final AdViewerResponseOuterClass.AdViewerResponse copy(AdViewerResponseOuterClass.AdViewerResponse adViewerResponse, ub2 ub2Var) {
        adViewerResponse.getClass();
        ub2Var.getClass();
        AdViewerResponseKt.Dsl.Companion companion = AdViewerResponseKt.Dsl.Companion;
        AdViewerResponseOuterClass.AdViewerResponse.Builder builder = adViewerResponse.toBuilder();
        builder.getClass();
        AdViewerResponseKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdViewerResponseOuterClass.AdViewerResponseOrBuilder adViewerResponseOrBuilder) {
        adViewerResponseOrBuilder.getClass();
        if (adViewerResponseOrBuilder.hasError()) {
            return adViewerResponseOrBuilder.getError();
        }
        return null;
    }
}
