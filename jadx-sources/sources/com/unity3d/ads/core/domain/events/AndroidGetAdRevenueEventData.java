package com.unity3d.ads.core.domain.events;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetAdRevenueEventData implements GetAdRevenueEventData {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r3 = com.unity3d.ads.core.domain.events.AndroidGetAdRevenueEventDataKt.toProto(r3);
     */
    @Override // com.unity3d.ads.core.domain.events.GetAdRevenueEventData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueData invoke(com.unity3d.ads.core.data.model.AdRevenueData r3) {
        /*
            r2 = this;
            r3.getClass()
            gatewayprotocol.v1.AdRevenueDataKt$Dsl$Companion r2 = gatewayprotocol.v1.AdRevenueDataKt.Dsl.Companion
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueData$Builder r0 = gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueData.newBuilder()
            r0.getClass()
            gatewayprotocol.v1.AdRevenueDataKt$Dsl r2 = r2._create(r0)
            java.util.UUID r0 = r3.getEventId()
            com.google.protobuf.ByteString r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(r0)
            r2.setEventId(r0)
            java.lang.Double r0 = r3.getRevenue()
            if (r0 == 0) goto L28
            double r0 = r0.doubleValue()
            r2.setRevenue(r0)
        L28:
            java.lang.String r0 = r3.getCountryCode()
            if (r0 == 0) goto L31
            r2.setCountryCode(r0)
        L31:
            java.lang.String r0 = r3.getNetworkName()
            if (r0 == 0) goto L3a
            r2.setNetworkName(r0)
        L3a:
            java.lang.String r0 = r3.getAdUnitId()
            if (r0 == 0) goto L43
            r2.setAdUnitId(r0)
        L43:
            java.lang.String r0 = r3.getThirdPartyAdPlacementId()
            if (r0 == 0) goto L4c
            r2.setThirdPartyAdPlacementId(r0)
        L4c:
            com.unity3d.ads.core.data.model.AdRevenueAdFormat r3 = r3.getAdFormat()
            if (r3 == 0) goto L58
            gatewayprotocol.v1.AdFormatOuterClass$AdFormat r3 = com.unity3d.ads.core.domain.events.AndroidGetAdRevenueEventDataKt.access$toProto(r3)
            if (r3 != 0) goto L5a
        L58:
            gatewayprotocol.v1.AdFormatOuterClass$AdFormat r3 = gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED
        L5a:
            r2.setAdFormat(r3)
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueData r2 = r2._build()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.AndroidGetAdRevenueEventData.invoke(com.unity3d.ads.core.data.model.AdRevenueData):gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueData");
    }
}
