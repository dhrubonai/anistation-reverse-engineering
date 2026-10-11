package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.request.WebRequest;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WebRequestToHttpRequestKt {
    public static final HttpRequest toHttpRequest(WebRequest webRequest) {
        webRequest.getClass();
        String url = webRequest.getUrl().toString();
        url.getClass();
        String requestType = webRequest.getRequestType();
        requestType.getClass();
        RequestType valueOf = RequestType.valueOf(requestType);
        Map<String, List<String>> headers = webRequest.getHeaders();
        headers.getClass();
        return new HttpRequest(url, null, valueOf, webRequest.getBody(), headers, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262114, null);
    }
}
