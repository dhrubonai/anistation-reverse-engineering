package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final String PROTOBUF_MEDIA_TYPE = "application/x-protobuf";

    private static final o35 generateOkHttpBody(Object obj) {
        dx3 dx3Var = null;
        if (obj instanceof byte[]) {
            Pattern pattern = dx3.c;
            try {
                dx3Var = n77.I("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused) {
            }
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            dq6.c(bArr.length, 0L, length);
            return new n35(dx3Var, length, bArr);
        }
        if (obj instanceof String) {
            Pattern pattern2 = dx3.c;
            try {
                dx3Var = n77.I("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused2) {
            }
            return o35.c(dx3Var, (String) obj);
        }
        Pattern pattern3 = dx3.c;
        try {
            dx3Var = n77.I("text/plain;charset=utf-8");
        } catch (IllegalArgumentException unused3) {
        }
        return o35.c(dx3Var, "");
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

    private static final o35 generateOkHttpProtobufBody(Object obj, String str) {
        if (obj instanceof byte[]) {
            Pattern pattern = dx3.c;
            dx3 W = n77.W(str);
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            dq6.c(bArr.length, 0L, length);
            return new n35(W, length, bArr);
        }
        if (obj instanceof String) {
            Pattern pattern2 = dx3.c;
            return o35.c(n77.W(str), (String) obj);
        }
        Pattern pattern3 = dx3.c;
        return o35.c(n77.W(str), "");
    }

    public static /* synthetic */ o35 generateOkHttpProtobufBody$default(Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "application/x-protobuf";
        }
        return generateOkHttpProtobufBody(obj, str);
    }

    public static final l35 toOkHttpProtoRequest(HttpRequest httpRequest) {
        o35 o35Var;
        httpRequest.getClass();
        kz kzVar = new kz((byte) 8);
        kzVar.E(uz5.d0(uz5.x0(httpRequest.getBaseURL(), '/') + '/' + uz5.x0(httpRequest.getPath(), '/'), "/"));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        if (body != null) {
            String contentType = httpRequest.getContentType();
            if (contentType == null) {
                contentType = "application/x-protobuf";
            }
            o35Var = generateOkHttpProtobufBody(body, contentType);
        } else {
            o35Var = null;
        }
        kzVar.B(obj, o35Var);
        ik2 generateOkHttpHeaders = generateOkHttpHeaders(httpRequest);
        generateOkHttpHeaders.getClass();
        kzVar.z = generateOkHttpHeaders.d();
        return kzVar.r();
    }

    public static final l35 toOkHttpRequest(HttpRequest httpRequest) {
        o35 o35Var;
        httpRequest.getClass();
        kz kzVar = new kz((byte) 8);
        kzVar.E(uz5.d0(uz5.x0(httpRequest.getBaseURL(), '/') + '/' + uz5.x0(httpRequest.getPath(), '/'), "/"));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        if (body != null) {
            o35Var = generateOkHttpBody(body);
        } else {
            o35Var = null;
        }
        kzVar.B(obj, o35Var);
        ik2 generateOkHttpHeaders = generateOkHttpHeaders(httpRequest);
        generateOkHttpHeaders.getClass();
        kzVar.z = generateOkHttpHeaders.d();
        return kzVar.r();
    }
}
