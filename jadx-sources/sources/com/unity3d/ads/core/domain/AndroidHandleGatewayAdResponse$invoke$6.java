package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w05;
import defpackage.w51;
import gatewayprotocol.v1.AdResponseOuterClass;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$6", f = "AndroidHandleGatewayAdResponse.kt", l = {332, 333}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse$invoke$6 extends t36 implements ic2 {
    final /* synthetic */ w05 $adPlayer;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ w05 $preShowAdObject;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    final /* synthetic */ CancellationException $t;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$6(w05 w05Var, AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, w05 w05Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.$preShowAdObject = w05Var;
        this.this$0 = androidHandleGatewayAdResponse;
        this.$t = cancellationException;
        this.$opportunityId = byteString;
        this.$response = adResponse;
        this.$adPlayer = w05Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidHandleGatewayAdResponse$invoke$6(this.$preShowAdObject, this.this$0, this.$t, this.$opportunityId, this.$response, this.$adPlayer, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidHandleGatewayAdResponse$invoke$6) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r10 == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r0.onShowComplete(r11, r10) == r3) goto L17;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 2
            r2 = 1
            w11 r3 = defpackage.w11.x
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.m37.N(r11)
            goto L4e
        L10:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            r10 = 0
            return r10
        L17:
            defpackage.m37.N(r11)
            goto L35
        L1b:
            defpackage.m37.N(r11)
            w05 r11 = r10.$preShowAdObject
            java.lang.Object r11 = r11.x
            com.unity3d.ads.core.data.model.AdObject r11 = (com.unity3d.ads.core.data.model.AdObject) r11
            if (r11 == 0) goto L35
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0 = r10.this$0
            com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy r0 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getPreShowStrategy$p(r0)
            r10.label = r2
            java.lang.Object r11 = r0.onShowComplete(r11, r10)
            if (r11 != r3) goto L35
            goto L4d
        L35:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r4 = r10.this$0
            java.util.concurrent.CancellationException r5 = r10.$t
            com.google.protobuf.ByteString r6 = r10.$opportunityId
            gatewayprotocol.v1.AdResponseOuterClass$AdResponse r7 = r10.$response
            w05 r11 = r10.$adPlayer
            java.lang.Object r11 = r11.x
            r8 = r11
            com.unity3d.ads.adplayer.AdPlayer r8 = (com.unity3d.ads.adplayer.AdPlayer) r8
            r10.label = r1
            r9 = r10
            java.lang.Object r10 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$cleanup(r4, r5, r6, r7, r8, r9)
            if (r10 != r3) goto L4e
        L4d:
            return r3
        L4e:
            pn6 r10 = defpackage.pn6.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
