package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import defpackage.ic2;
import defpackage.kl0;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LegacyHttpClient$execute$2 extends t36 implements ic2 {
    final /* synthetic */ HttpRequest $request;
    final /* synthetic */ boolean $withInputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyHttpClient$execute$2(HttpRequest httpRequest, boolean z, vz0 vz0Var) {
        super(2, vz0Var);
        this.$request = httpRequest;
        this.$withInputStream = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new LegacyHttpClient$execute$2(this.$request, this.$withInputStream, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((LegacyHttpClient$execute$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            m37.N(obj);
            WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
            String makeRequest = webRequest.makeRequest();
            if (makeRequest == null) {
                makeRequest = "";
            }
            if (this.$withInputStream) {
                byte[] bytes = makeRequest.getBytes(kl0.a);
                bytes.getClass();
                obj2 = new ByteArrayInputStream(bytes);
            } else {
                obj2 = makeRequest;
            }
            int responseCode = webRequest.getResponseCode();
            Map<String, List<String>> headers = webRequest.getHeaders();
            headers.getClass();
            String url = webRequest.getUrl().toString();
            url.getClass();
            return new HttpResponse(obj2, responseCode, headers, url, null, "legacy", 0L, 80, null);
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
