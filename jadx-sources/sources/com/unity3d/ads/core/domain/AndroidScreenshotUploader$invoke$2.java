package com.unity3d.ads.core.domain;

import android.util.Base64;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import defpackage.ai4;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.te4;
import defpackage.v11;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidScreenshotUploader$invoke$2", f = "AndroidScreenshotUploader.kt", l = {50, 50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidScreenshotUploader$invoke$2 extends t36 implements ic2 {
    final /* synthetic */ byte[] $bytes;
    final /* synthetic */ String $contentType;
    final /* synthetic */ String $id;
    Object L$0;
    int label;
    final /* synthetic */ AndroidScreenshotUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScreenshotUploader$invoke$2(AndroidScreenshotUploader androidScreenshotUploader, String str, byte[] bArr, String str2, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidScreenshotUploader;
        this.$id = str;
        this.$bytes = bArr;
        this.$contentType = str2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidScreenshotUploader$invoke$2(this.this$0, this.$id, this.$bytes, this.$contentType, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidScreenshotUploader$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        SessionRepository sessionRepository;
        SessionRepository sessionRepository2;
        HttpClientProvider httpClientProvider;
        Object invoke;
        HttpRequest httpRequest;
        int i = this.label;
        w11 w11Var = w11.x;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                HttpRequest httpRequest2 = (HttpRequest) this.L$0;
                m37.N(obj);
                httpRequest = httpRequest2;
                invoke = obj;
            } else {
                m37.N(obj);
                sessionRepository = this.this$0.sessionRepository;
                String encodeToString = Base64.encodeToString(sessionRepository.getSessionToken().toByteArray(), 2);
                sessionRepository2 = this.this$0.sessionRepository;
                HttpRequest httpRequest3 = new HttpRequest(sessionRepository2.getGatewayUrl(), "adviewer/screenshots/" + this.$id, RequestType.POST, this.$bytes, vn3.T(new ai4("Content-Type", te4.H(this.$contentType)), new ai4("uads_session_token", te4.H(encodeToString))), null, null, this.$contentType, null, null, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 0, false, null, null, 0, 254816, null);
                httpClientProvider = this.this$0.httpClientProvider;
                this.L$0 = httpRequest3;
                this.label = 1;
                invoke = httpClientProvider.invoke(this);
                if (invoke != w11Var) {
                    httpRequest = httpRequest3;
                } else {
                    return w11Var;
                }
            }
            this.L$0 = null;
            this.label = 2;
            Object execute$default = HttpClient.DefaultImpls.execute$default((HttpClient) invoke, httpRequest, false, this, 2, null);
            if (execute$default == w11Var) {
                return w11Var;
            }
            return execute$default;
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.error("Screenshot upload failed for " + this.$id, e);
            return pn6.a;
        }
    }
}
