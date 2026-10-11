package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import defpackage.ms;
import defpackage.n11;
import defpackage.ot1;
import defpackage.tl7;
import defpackage.vz0;
import defpackage.ze0;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClientProvider httpClientProvider;
    private final n11 ioDispatcher;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidExecuteAdViewerRequest(n11 n11Var, HttpClientProvider httpClientProvider, GetCachedAsset getCachedAsset) {
        n11Var.getClass();
        httpClientProvider.getClass();
        getCachedAsset.getClass();
        this.ioDispatcher = n11Var;
        this.httpClientProvider = httpClientProvider;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        boolean z;
        Map map;
        int i;
        Map headersMap;
        Map map2;
        int i2;
        Map headersMap2;
        String str = (String) ms.M0(objArr, 1);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
            Map map3 = ot1.x;
            int i4 = 30000;
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    String str2 = (String) ms.M0(objArr, 2);
                    JSONArray jSONArray = (JSONArray) ms.M0(objArr, 3);
                    Integer num = (Integer) ms.M0(objArr, 4);
                    Integer num2 = (Integer) ms.M0(objArr, 5);
                    if (jSONArray != null && (headersMap2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) != null) {
                        map2 = headersMap2;
                    } else {
                        map2 = map3;
                    }
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 30000;
                    }
                    if (num2 != null) {
                        i4 = num2.intValue();
                    }
                    return new HttpRequest(str, null, requestType, str2, map2, null, null, null, null, null, i2, i4, 0, 0, false, null, null, 0, 259042, null);
                }
                ze0.l();
                return null;
            }
            JSONArray jSONArray2 = (JSONArray) ms.M0(objArr, 2);
            Integer num3 = (Integer) ms.M0(objArr, 3);
            Integer num4 = (Integer) ms.M0(objArr, 4);
            if (jSONArray2 != null && (headersMap = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) != null) {
                map = headersMap;
            } else {
                map = map3;
            }
            if (num3 != null) {
                i = num3.intValue();
            } else {
                i = 30000;
            }
            if (num4 != null) {
                i4 = num4.intValue();
            }
            return new HttpRequest(str, null, requestType, null, map, null, null, null, null, null, i, i4, 0, 0, false, null, null, 0, 259050, null);
        }
        ze0.k("Failed requirement.");
        return null;
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, vz0 vz0Var) {
        return tl7.V(this.ioDispatcher, new AndroidExecuteAdViewerRequest$invoke$2(objArr, this, requestType, null), vz0Var);
    }
}
