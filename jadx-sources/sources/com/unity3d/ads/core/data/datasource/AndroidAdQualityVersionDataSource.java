package com.unity3d.ads.core.data.datasource;

import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.core.log.Logger;
import defpackage.d46;
import defpackage.rb3;
import defpackage.uz5;
import defpackage.y7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidAdQualityVersionDataSource implements AdQualityVersionDataSource {
    private final rb3 cachedVersion$delegate;
    private final Logger logger;

    public AndroidAdQualityVersionDataSource(Logger logger) {
        logger.getClass();
        this.logger = logger;
        this.cachedVersion$delegate = new d46(new y7(this, (byte) 4));
    }

    public static /* synthetic */ String a(NoClassDefFoundError noClassDefFoundError) {
        return cachedVersion_delegate$lambda$4$lambda$1(noClassDefFoundError);
    }

    public static /* synthetic */ String b(ClassNotFoundException classNotFoundException) {
        return cachedVersion_delegate$lambda$4$lambda$2(classNotFoundException);
    }

    public static /* synthetic */ String c(AndroidAdQualityVersionDataSource androidAdQualityVersionDataSource) {
        return cachedVersion_delegate$lambda$4(androidAdQualityVersionDataSource);
    }

    public static final String cachedVersion_delegate$lambda$4(AndroidAdQualityVersionDataSource androidAdQualityVersionDataSource) {
        try {
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            if (sDKVersion != null) {
                if (!uz5.V(sDKVersion)) {
                    return sDKVersion;
                }
                return null;
            }
            return null;
        } catch (ClassNotFoundException e) {
            androidAdQualityVersionDataSource.logger.debug(new y7(e, (byte) 2));
            return null;
        } catch (NoClassDefFoundError e2) {
            androidAdQualityVersionDataSource.logger.debug(new y7(e2, (byte) 1));
            return null;
        } catch (NoSuchMethodError e3) {
            androidAdQualityVersionDataSource.logger.debug(new y7(e3, (byte) 3));
            return null;
        } catch (Throwable th) {
            androidAdQualityVersionDataSource.logger.error("Failed to get Ad Quality version", th);
            return null;
        }
    }

    public static final String cachedVersion_delegate$lambda$4$lambda$1(NoClassDefFoundError noClassDefFoundError) {
        return "Ad Quality SDK not available: " + noClassDefFoundError.getMessage();
    }

    public static final String cachedVersion_delegate$lambda$4$lambda$2(ClassNotFoundException classNotFoundException) {
        return "Ad Quality SDK not available: " + classNotFoundException.getMessage();
    }

    public static final String cachedVersion_delegate$lambda$4$lambda$3(NoSuchMethodError noSuchMethodError) {
        return "Ad Quality SDK not available: " + noSuchMethodError.getMessage();
    }

    public static /* synthetic */ String d(NoSuchMethodError noSuchMethodError) {
        return cachedVersion_delegate$lambda$4$lambda$3(noSuchMethodError);
    }

    private final String getCachedVersion() {
        return (String) this.cachedVersion$delegate.getValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource
    public String invoke() {
        return getCachedVersion();
    }
}
