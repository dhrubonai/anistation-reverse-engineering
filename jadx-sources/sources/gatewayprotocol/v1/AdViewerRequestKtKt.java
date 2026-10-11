package gatewayprotocol.v1;

import defpackage.ub2;
import gatewayprotocol.v1.AdViewerRequestKt;
import gatewayprotocol.v1.AdViewerRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AdViewerRequestKtKt {
    /* renamed from: -initializeadViewerRequest, reason: not valid java name */
    public static final AdViewerRequestOuterClass.AdViewerRequest m78initializeadViewerRequest(ub2 ub2Var) {
        ub2Var.getClass();
        AdViewerRequestKt.Dsl.Companion companion = AdViewerRequestKt.Dsl.Companion;
        AdViewerRequestOuterClass.AdViewerRequest.Builder newBuilder = AdViewerRequestOuterClass.AdViewerRequest.newBuilder();
        newBuilder.getClass();
        AdViewerRequestKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final AdViewerRequestOuterClass.AdViewerRequest copy(AdViewerRequestOuterClass.AdViewerRequest adViewerRequest, ub2 ub2Var) {
        adViewerRequest.getClass();
        ub2Var.getClass();
        AdViewerRequestKt.Dsl.Companion companion = AdViewerRequestKt.Dsl.Companion;
        AdViewerRequestOuterClass.AdViewerRequest.Builder builder = adViewerRequest.toBuilder();
        builder.getClass();
        AdViewerRequestKt.Dsl _create = companion._create(builder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdViewerRequestOuterClass.AdViewerRequestOrBuilder adViewerRequestOrBuilder) {
        adViewerRequestOrBuilder.getClass();
        if (adViewerRequestOrBuilder.hasCampaignState()) {
            return adViewerRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdViewerRequestOuterClass.AdViewerRequestOrBuilder adViewerRequestOrBuilder) {
        adViewerRequestOrBuilder.getClass();
        if (adViewerRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adViewerRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdViewerRequestOuterClass.AdViewerRequestOrBuilder adViewerRequestOrBuilder) {
        adViewerRequestOrBuilder.getClass();
        if (adViewerRequestOrBuilder.hasSessionCounters()) {
            return adViewerRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdViewerRequestOuterClass.AdViewerRequestOrBuilder adViewerRequestOrBuilder) {
        adViewerRequestOrBuilder.getClass();
        if (adViewerRequestOrBuilder.hasStaticDeviceInfo()) {
            return adViewerRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
