package com.unity3d.ads.network.mapper;

import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import defpackage.dq6;
import defpackage.dx3;
import defpackage.ik2;
import defpackage.kz;
import defpackage.l35;
import defpackage.n35;
import defpackage.n77;
import defpackage.o35;
import defpackage.uz5;
import defpackage.yo0;
import defpackage.z51;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final o35 generateOkHttpBody(HttpBody httpBody) {
        dx3 dx3Var = null;
        if (httpBody instanceof HttpBody.StringBody) {
            Pattern pattern = dx3.c;
            try {
                dx3Var = n77.I("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused) {
            }
            return o35.c(dx3Var, ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            Pattern pattern2 = dx3.c;
            try {
                dx3Var = n77.I("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused2) {
            }
            byte[] content = ((HttpBody.ByteArrayBody) httpBody).getContent();
            content.getClass();
            int length = content.length;
            dq6.c(content.length, 0L, length);
            return new n35(dx3Var, length, content);
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        ze0.l();
        return null;
    }

    private static final ik2 generateOkHttpHeaders(HttpRequest httpRequest) {
        ArrayList arrayList = new ArrayList(20);
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            String q0 = yo0.q0(entry.getValue(), ",", null, null, null, 62);
            key.getClass();
            z51.f(key);
            z51.g(q0, key);
            arrayList.add(key);
            arrayList.add(uz5.w0(q0).toString());
        }
        return new ik2((String[]) arrayList.toArray(new String[0]));
    }

    public static final l35 toOkHttpRequest(HttpRequest httpRequest) {
        httpRequest.getClass();
        kz kzVar = new kz((byte) 8);
        kzVar.E(uz5.d0(uz5.x0(httpRequest.getBaseURL(), '/') + '/' + uz5.x0(httpRequest.getPath(), '/'), "/"));
        kzVar.B(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody()));
        ik2 generateOkHttpHeaders = generateOkHttpHeaders(httpRequest);
        generateOkHttpHeaders.getClass();
        kzVar.z = generateOkHttpHeaders.d();
        return kzVar.r();
    }
}
