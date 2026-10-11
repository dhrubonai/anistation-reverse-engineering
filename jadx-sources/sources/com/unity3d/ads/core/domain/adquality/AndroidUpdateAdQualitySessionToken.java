package com.unity3d.ads.core.domain.adquality;

import com.google.protobuf.ByteString;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import defpackage.qx1;
import defpackage.vf;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidUpdateAdQualitySessionToken implements UpdateAdQualitySessionToken {
    private final AdQualityVersionDataSource adQualityVersionDataSource;
    private final Logger logger;

    public AndroidUpdateAdQualitySessionToken(Logger logger, AdQualityVersionDataSource adQualityVersionDataSource) {
        logger.getClass();
        adQualityVersionDataSource.getClass();
        this.logger = logger;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
    }

    public static final String invoke$lambda$0(String str) {
        return qx1.m("Ad Quality SDK version ", str, " is below minimum 9.5.1, skipping session token update");
    }

    @Override // com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken
    public void invoke(ByteString byteString) {
        byteString.getClass();
        String invoke = this.adQualityVersionDataSource.invoke();
        if (invoke == null) {
            return;
        }
        if (StringExtensionsKt.compareVersion(invoke, "9.5.1") < 0) {
            this.logger.debug(new vf(invoke, (byte) 0));
            return;
        }
        try {
            IronSourceAdQuality.getInstance().setMetaData("uads_session_token", ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK setMetaData failed", th);
        }
    }
}
