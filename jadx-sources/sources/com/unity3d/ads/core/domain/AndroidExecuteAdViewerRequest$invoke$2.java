package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.model.RequestType;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {28, 29}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidExecuteAdViewerRequest$invoke$2 extends t36 implements ic2 {
    final /* synthetic */ Object[] $parameters;
    final /* synthetic */ RequestType $type;
    int label;
    final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExecuteAdViewerRequest$invoke$2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, vz0 vz0Var) {
        super(2, vz0Var);
        this.$parameters = objArr;
        this.this$0 = androidExecuteAdViewerRequest;
        this.$type = requestType;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidExecuteAdViewerRequest$invoke$2(this.$parameters, this.this$0, this.$type, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidExecuteAdViewerRequest$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        if (r0 == r6) goto L47;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.label
            r1 = 2
            r2 = 1
            r4 = 0
            w11 r6 = defpackage.w11.x
            if (r0 == 0) goto L20
            if (r0 == r2) goto L19
            if (r0 != r1) goto L13
            defpackage.m37.N(r19)
            return r19
        L13:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r4
        L19:
            defpackage.m37.N(r19)
            r0 = r19
            goto L96
        L20:
            defpackage.m37.N(r19)
            java.lang.Object[] r0 = r3.$parameters
            java.lang.Object r0 = defpackage.ms.M0(r0, r2)
            boolean r5 = r0 instanceof java.lang.String
            if (r5 == 0) goto L30
            java.lang.String r0 = (java.lang.String) r0
            goto L31
        L30:
            r0 = r4
        L31:
            if (r0 != 0) goto L35
            java.lang.String r0 = ""
        L35:
            int r5 = r0.length()
            if (r5 <= 0) goto Lb0
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L43
            r0.getClass()     // Catch: java.lang.Throwable -> L43
            goto L4a
        L43:
            r0 = move-exception
            y45 r5 = new y45
            r5.<init>(r0)
            r0 = r5
        L4a:
            boolean r5 = r0 instanceof defpackage.y45
            if (r5 == 0) goto L4f
            r0 = r4
        L4f:
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L73
            com.unity3d.services.core.network.model.RequestType r5 = r3.$type
            com.unity3d.services.core.network.model.RequestType r7 = com.unity3d.services.core.network.model.RequestType.GET
            if (r5 != r7) goto L5a
            goto L5b
        L5a:
            r0 = r4
        L5b:
            if (r0 == 0) goto L73
            com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest r5 = r3.this$0
            com.unity3d.ads.core.domain.GetCachedAsset r5 = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getGetCachedAsset$p(r5)
            android.webkit.WebResourceResponse r0 = com.unity3d.ads.core.domain.GetCachedAsset.invoke$default(r5, r0, r4, r1, r4)
            if (r0 == 0) goto L73
            java.io.InputStream r0 = r0.getData()
            if (r0 == 0) goto L73
            byte[] r4 = defpackage.kb0.H(r0)
        L73:
            r8 = r4
            if (r8 == 0) goto L87
            com.unity3d.services.core.network.model.HttpResponse r7 = new com.unity3d.services.core.network.model.HttpResponse
            r16 = 126(0x7e, float:1.77E-43)
            r17 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16, r17)
            return r7
        L87:
            com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest r0 = r3.this$0
            com.unity3d.ads.core.domain.HttpClientProvider r0 = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getHttpClientProvider$p(r0)
            r3.label = r2
            java.lang.Object r0 = r0.invoke(r3)
            if (r0 != r6) goto L96
            goto Lae
        L96:
            com.unity3d.services.core.network.core.HttpClient r0 = (com.unity3d.services.core.network.core.HttpClient) r0
            com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest r2 = r3.this$0
            com.unity3d.services.core.network.model.RequestType r4 = r3.$type
            java.lang.Object[] r5 = r3.$parameters
            com.unity3d.services.core.network.model.HttpRequest r2 = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$createRequest(r2, r4, r5)
            r3.label = r1
            r1 = r2
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.Object r0 = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto Laf
        Lae:
            return r6
        Laf:
            return r0
        Lb0:
            java.lang.String r0 = "Failed requirement."
            defpackage.ze0.k(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
