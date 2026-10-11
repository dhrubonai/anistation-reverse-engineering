package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bx7;
import defpackage.it1;
import defpackage.ot1;
import defpackage.q71;
import defpackage.qx1;
import defpackage.uz5;
import defpackage.y45;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class GetCachedAsset {
    public static final Companion Companion = new Companion(null);
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;
    private final GetAssetFileName getAssetFileName;
    private final SessionRepository sessionRepository;

    public GetCachedAsset(CacheRepository cacheRepository, SessionRepository sessionRepository, Context context, CacheWebViewAssets cacheWebViewAssets, GetAssetFileName getAssetFileName) {
        cacheRepository.getClass();
        sessionRepository.getClass();
        context.getClass();
        cacheWebViewAssets.getClass();
        getAssetFileName.getClass();
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.getAssetFileName = getAssetFileName;
    }

    private final WebResourceResponse buildWebResourceResponse(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, Companion.reasonPhraseOrDefault$unity_ads_defaultRelease(str3, i), map, inputStream);
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String valueOf = String.valueOf(uri.getPath());
        String m0 = uz5.m0(valueOf, "/", valueOf);
        try {
            InputStream open = this.context.getAssets().open(m0);
            open.getClass();
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(m0), null, open);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final WebResourceResponse getLegacyCachedAsset(Uri uri) {
        Object y45Var;
        String uri2 = uri.toString();
        uri2.getClass();
        CacheResult cacheResult = (CacheResult) bx7.K(it1.x, new GetCachedAsset$getLegacyCachedAsset$result$1(this, uz5.o0(uri2), null));
        if (cacheResult instanceof CacheResult.Success) {
            File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
            if (file != null) {
                try {
                    y45Var = new FileInputStream(file);
                } catch (Throwable th) {
                    y45Var = new y45(th);
                }
                if (y45Var instanceof y45) {
                    y45Var = null;
                }
                FileInputStream fileInputStream = (FileInputStream) y45Var;
                if (fileInputStream != null) {
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    return new WebResourceResponse(StringExtensionsKt.guessMimeType(absolutePath), null, fileInputStream);
                }
            }
            return null;
        }
        return getNotFoundResponse();
    }

    private final WebResourceResponse getNotFoundResponse() {
        return buildWebResourceResponse("text/html", "utf-8", 404, "Not Found", ot1.x, new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String str) {
        Object y45Var;
        File file;
        Object y45Var2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        String uri2 = uri.toString();
        uri2.getClass();
        sb.append(uz5.o0(uz5.q0(uri2, "?")));
        String sb2 = sb.toString();
        File file2 = this.cacheWebViewAssets.getCached().get(sb2);
        if (file2 != null) {
            try {
                y45Var = new FileInputStream(file2);
            } catch (Throwable th) {
                y45Var = new y45(th);
            }
            if (y45Var instanceof y45) {
                y45Var = null;
            }
            FileInputStream fileInputStream = (FileInputStream) y45Var;
            if (fileInputStream != null) {
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(sb2), null, fileInputStream);
            }
        } else {
            String uri3 = uri.toString();
            uri3.getClass();
            CacheResult cacheResult = (CacheResult) bx7.K(it1.x, new GetCachedAsset$tryGetWebViewAsset$result$1(this, this.getAssetFileName.invoke(uri3), null));
            if ((cacheResult instanceof CacheResult.Success) && (file = ((CacheResult.Success) cacheResult).getCachedFile().getFile()) != null) {
                try {
                    y45Var2 = new FileInputStream(file);
                } catch (Throwable th2) {
                    y45Var2 = new y45(th2);
                }
                if (y45Var2 instanceof y45) {
                    y45Var2 = null;
                }
                FileInputStream fileInputStream2 = (FileInputStream) y45Var2;
                if (fileInputStream2 != null) {
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    String guessMimeType = StringExtensionsKt.guessMimeType(absolutePath);
                    Map<String, String> singletonMap = Collections.singletonMap("Access-Control-Allow-Origin", "*");
                    singletonMap.getClass();
                    return buildWebResourceResponse(guessMimeType, null, 200, "OK", singletonMap, fileInputStream2);
                }
            }
        }
        return null;
    }

    public final WebResourceResponse invoke(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        boolean disableCustomScheme = this.sessionRepository.getFeatureFlags().getDisableCustomScheme();
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    if (disableCustomScheme) {
                        return tryGetWebViewAsset(uri, str);
                    }
                    return getLegacyCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, str);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final String reasonPhraseOrDefault$unity_ads_defaultRelease(String str, int i) {
            str.getClass();
            if (uz5.V(str)) {
                return qx1.h(i, "Status ");
            }
            return str;
        }

        private Companion() {
        }
    }
}
